package mindustry.mod

import arc.files.Fi
import arc.struct.Seq
import arc.util.serialization.JsonValue
import mindustry.Vars
import mindustry.ctype.Content
import mindustry.ctype.ContentType
import mindustry.mod.ClassMap
import mindustry.mod.ContentParser
import mindustry.mod.Mods.LoadedMod
import java.io.File

/**
 * ContentParser 的检测子类。
 * 覆写关键方法，在解析过程中收集所有问题而非直接 warn/throw。
 */
class DetectingContentParser : ContentParser() {

    // ========== 检测结果收集 ==========

    data class Issue(
        val severity: Severity,
        val contentName: String?,       // content name, null if unknown
        val file: String?,          // source file name
        val field: String?,         // field path, e.g. "consumes.0.amount"
        val message: String,
        val trace: String? = null   // stack trace snippet
    ) {
        enum class Severity { ERROR, WARN, INFO }
    }

    val issues = Seq<Issue>()

    // 记录当前解析上下文，用于 issue 归属
    private var currentFile: String? = null
    private var currentFieldPath = Seq<String>()

    fun analyzeJsonAndReport(
        json: String,
        name: String = "memory",
        type: ContentType = ContentType.block
    ): String {
        return analyzeJsonString(json, name, type).printIssuesPretty()
    }

fun analyzeJsonString(
    json: String,
    name: String = "memory",
    type: ContentType = ContentType.block
): DetectingContentParser {
    val parser = DetectingContentParser()

    // 创建临时目录模拟完整的 MOD 结构
    val tempDir = File.createTempFile("mindustry_test_", "_mod")
    tempDir.delete()
    tempDir.mkdirs()

    // 创建标准 MOD 目录结构
    File(tempDir, "content/blocks").mkdirs()
    File(tempDir, "content/items").mkdirs()
    File(tempDir, "content/liquids").mkdirs()
    File(tempDir, "content/units").mkdirs()
    File(tempDir, "content/statuses").mkdirs()
    File(tempDir, "sprites").mkdirs()

    // 创建 mod.json
    val modJsonFile = File(tempDir, "mod.json")
    modJsonFile.writeText("""
        {
            "name": "Test Mod",
            "displayName": "Test Mod",
            "author": "Test",
            "description": "Temporary test mod",
            "version": "1.0.0",
            "minGameVersion": "146"
        }
    """.trimIndent())

    // 根据类型确定文件路径
    val contentSubDir = when (type) {
        ContentType.block -> "content/blocks"
        ContentType.item -> "content/items"
        ContentType.liquid -> "content/liquids"
        ContentType.unit -> "content/units"
        ContentType.status -> "content/statuses"
        else -> "content/blocks"
    }

    // 创建 JSON 文件
    val jsonFile = File(tempDir, "$contentSubDir/$name.json")
    jsonFile.writeText(json)

    // 创建 Fi 对象指向这个文件
    val fiFile = Fi(jsonFile)

val modRoot = Fi(tempDir)
val modMeta = arc.util.serialization.Json().fromJson(
    Mods.ModMeta::class.java,
    modRoot.child("mod.json").readString()
)
val mod = LoadedMod(modRoot, modRoot, null, DetectingContentParser::class.java.classLoader, modMeta)


    parser.parseSafe(
        mod = mod,
        name = name,
        json = json,
        file = fiFile,
        type = type
    )

    parser.finishParsing()

    // 清理临时文件（可选，调试时可以注释掉）
    tempDir.deleteRecursively()

    return parser
}



    fun printIssuesPretty(): String {
        if (issues.isEmpty) return "✔ No issues found."

        val sb = StringBuilder()

        sb.appendLine("=== Mindustry JSON Lint Report ===")
        sb.appendLine("Total: ${issues.size} issues")
        sb.appendLine()

        // 按 content 分组（更符合使用习惯）
        val byContent = issues.groupBy { it.contentName ?: "<unknown>" }

        for ((content, list) in byContent) {
            sb.appendLine("■ $content")

            // 再按文件分组
            val byFile = list.groupBy { it.file ?: "<no-file>" }

            for ((file, fileIssues) in byFile) {
                sb.appendLine("  ├─ $file")

                for (issue in fileIssues) {
                    val icon = when (issue.severity) {
                        Issue.Severity.ERROR -> "✖"
                        Issue.Severity.WARN -> "⚠"
                        Issue.Severity.INFO -> "ℹ"
                    }

                    val field = issue.field?.let { " @ $it" } ?: ""

                    sb.appendLine("  │   $icon$field: ${issue.message}")

                    // 可选：显示简短 trace（只对 ERROR）
                    if (issue.severity == Issue.Severity.ERROR && issue.trace != null) {
                        val short = issue.trace.lines().firstOrNull()?.take(120)
                        if (!short.isNullOrBlank()) {
                            sb.appendLine("  │      ↳ $short")
                        }
                    }
                }
            }

            sb.appendLine()
        }

        // 统计信息（方便快速扫）
        val errors = issues.count { it.severity == Issue.Severity.ERROR }
        val warns = issues.count { it.severity == Issue.Severity.WARN }
        val infos = issues.count { it.severity == Issue.Severity.INFO }

        sb.appendLine("Summary: ✖ $errors  ⚠ $warns  ℹ $infos")

        return sb.toString()
    }

    // ========== Override: warn → 收集而非丢弃 ==========

    override fun warn(string: String?, vararg format: Any?) {
        val msg = String.format(string ?: "", *format)
        issues.add(Issue(
            severity = Issue.Severity.WARN,
            contentName = currentContent?.contentType?.name,
            file = currentContent?.minfo?.sourceFile?.name() ?: currentFile,
            field = currentPath(),
            message = msg
        ))
    }

    // ========== Override: readFields → 追踪字段路径 + 额外检测 ==========

    override fun readFields(`object`: Any?, jsonMap: JsonValue?) {
        if (jsonMap == null || !jsonMap.isObject) return

        // 先检查未知字段（在 super 调用前）
        val fields = getJson().getFields(`object`!!.javaClass)
        var child = jsonMap.child
        while (child != null) {
            val name = child.name().replace(" ", "_")
            if (fields.get(name) == null) {
                issues.add(Issue(
                    severity = Issue.Severity.WARN,
                    contentName = currentContent?.contentType?.name,
                    file = currentContent?.minfo?.sourceFile?.name(),
                    field = currentPath(child.name()),
                    message = "Unknown field '${child.name()}' for class '${`object`.javaClass.simpleName}'"
                ))
            }
            child = child.next
        }

        // 逐字段深度检测
        child = jsonMap.child
        while (child != null) {
            currentFieldPath.add(child.name)

            detectFieldIssues(`object`, child)

            // ⚠️ 递归前保持路径
            super.readFields(`object`, child)

            currentFieldPath.remove(currentFieldPath.size - 1)
            child = child.next
        }

        // 调用原始 readFields
        super.readFields(`object`, jsonMap)
    }

    // ========== Override: checkNullFields → 收集而非 throw ==========

    override fun checkNullFields(`object`: Any?) {
        if (`object` == null) return
        try {
            super.checkNullFields(`object`)
        } catch (e: RuntimeException) {
            issues.add(Issue(
                severity = Issue.Severity.ERROR,
                contentName = currentContent?.contentType?.name,
                file = currentContent?.minfo?.sourceFile?.name(),
                field = currentPath(),
                message = e.message ?: "Null field check failed",
                trace = e.stackTraceToString().take(200)
            ))
        }
    }

    // ========== Override: resolve → 检测无效 type ==========

    override fun <T> resolve(base: String?, def: Class<T>?, warn: Boolean): Class<T>? {
        if (base.isNullOrEmpty() && def != null) return def

        val out = ClassMap.classes.get(
            if (!base.isNullOrEmpty() && Character.isLowerCase(base[0]))
                base.replaceFirstChar { it.uppercase() }
            else base
        )

        if (out == null && warn) {
            issues.add(Issue(
                severity = Issue.Severity.WARN,
                contentName = currentContent?.contentType?.name,
                file = currentContent?.minfo?.sourceFile?.name(),
                field = currentPath("type"),
                message = "Unknown type '$base', falling back to '${def?.simpleName ?: "NONE"}'"
            ))
        }

        return super.resolve(base, def, warn)
    }

    // ========== Override: field(Class, String) → 检测无效引用 ==========

    override fun field(type: Class<*>?, value: JsonValue?): Any? {
        return try {
            super.field(type, value)
        } catch (e: Exception) {
            issues.add(Issue(
                severity = Issue.Severity.ERROR,
                contentName = currentContent?.contentType?.name,
                file = currentContent?.minfo?.sourceFile?.name(),
                field = currentPath(),
                message = "Invalid reference '${value?.asString()}' for ${type?.simpleName}",
                trace = e.message
            ))
            // 返回 null，让后续逻辑处理
            null
        }
    }

    // ========== 解析入口：包装 parse，捕获所有异常 ==========

    fun parseSafe(mod: LoadedMod?, name: String, json: String, file: Fi?, type: ContentType): Content? {
        currentFile = file?.name()
        return try {
            parse(mod, name, json, file, type)
        } catch (e: Exception) {
            issues.add(Issue(
                severity = Issue.Severity.ERROR,
                contentName = name,
                file = file?.name(),
                field = null,
                message = "Parse failed: ${e.message}",
                trace = e.stackTraceToString().take(300)
            ))
            null
        }
    }

    // ========== 字段深度检测 ==========

    private fun detectFieldIssues(obj: Any, value: JsonValue) {
        // 1. 检测类名引用是否存在于 ClassMap
        if (value.isString && value.asString().length > 2) {
            val capitalized = value.asString().replaceFirstChar { it.uppercase() }
            if (ClassMap.classes.containsKey(capitalized) && value.asString() != "none") {
                // 可能是引用，但不一定是错误，仅供 INFO
            }
        }

        // 2. 检测 content 引用是否存在
        if (value.isString && value.asString().isNotEmpty()) {
            val contentRef = value.asString()
            // 对常见引用字段做存在性检测
            val fieldName = value.parent?.name()
            if (fieldName in listOf("item", "liquid", "status", "planet", "parent")) {
                // 这些字段通常引用其他 content
                // 实际查询需要 content 系统已加载完毕，在 finishParsing 后做
            }
        }

        // 3. 检测数值类型的常见错误
        if (value.isNumber) {
            val fieldName = value.parent?.name() ?: value.name()
            // size 必须是正整数
            if (fieldName == "size" && (value.asFloat() <= 0 || value.asFloat() != value.asFloat().toInt().toFloat())) {
                issues.add(Issue(
                    severity = Issue.Severity.ERROR,
                    contentName = currentContent?.contentType?.name,
                    file = currentContent?.minfo?.sourceFile?.name(),
                    field = currentPath(),
                    message = "Field 'size' must be a positive integer, got: ${value.asFloat()}"
                ))
            }
        }

        // 4. 检测 requirements 格式
        if (value.name() == "requirements" && value.isArray) {
            for (req in value) {
                if (req.isObject && !req.has("item")) {
                    issues.add(Issue(
                        severity = Issue.Severity.ERROR,
                        contentName = currentContent?.contentType?.name,
                        file = currentContent?.minfo?.sourceFile?.name(),
                        field = currentPath("requirements"),
                        message = "Requirement entry missing 'item' field"
                    ))
                }
            }
        }

        // 5. 检测 health <= 0
        if (value.name() == "health" && value.isNumber && value.asFloat() <= 0) {
            issues.add(Issue(
                severity = Issue.Severity.WARN,
                contentName = currentContent?.contentType?.name,
                file = currentContent?.minfo?.sourceFile?.name(),
                field = currentPath("health"),
                message = "Block health is ${value.asFloat()}, likely unintended"
            ))
        }
    }

    // ========== finishParsing 后做全局检查 ==========

    override fun finishParsing() {
        super.finishParsing()

        // 全局检查：引用完整性
        Vars.content.each { content ->
            if (!content.hasErrored()) return@each
            issues.add(Issue(
                severity = Issue.Severity.ERROR,
                contentName = content.contentType.name,
                file = content.minfo.sourceFile?.name(),
                field = null,
                message = "Content '${content.contentType.name}' has errors: ${content.minfo.error}"
            ))
        }
    }

    // ========== 辅助方法 ==========

    private fun currentPath(field: String? = null): String {
        val parts = currentFieldPath.toMutableList()
        if (field != null) parts.add(field)
        return parts.joinToString(".")
    }

    /** 生成报告 */
    fun report(): String {
        if (issues.isEmpty()) return "No issues found."

        val sb = StringBuilder()
        sb.appendLine("=== JSON Issue Detection Report ===")
        sb.appendLine("Total: ${issues.size} issues")
        sb.appendLine()

        // 按 severity 分组
        for (sev in Issue.Severity.entries) {
            val group = issues.filter { it.severity == sev }
            if (group.isEmpty()) continue
            sb.appendLine("--- ${sev.name} (${group.size}) ---")
            for (issue in group) {
                sb.append("  [${issue.severity.name}]")
                if (issue.contentName != null) sb.append(" ${issue.contentName}")
                if (issue.file != null) sb.append(" (${issue.file})")
                if (issue.field != null) sb.append(" @ ${issue.field}")
                sb.append(": ${issue.message}")
                sb.appendLine()
            }
            sb.appendLine()
        }

        return sb.toString()
    }

    /**
     * 根据文件路径推断 ContentType
     */
    private fun guessType(file: Fi): ContentType {
        val parentDir = file.parent()?.name() ?: ""
        return when {
            parentDir.contains("blocks", ignoreCase = true) -> ContentType.block
            parentDir.contains("items", ignoreCase = true) -> ContentType.item
            parentDir.contains("liquids", ignoreCase = true) -> ContentType.liquid
            parentDir.contains("units", ignoreCase = true) -> ContentType.unit
            parentDir.contains("statuses", ignoreCase = true) -> ContentType.status
            parentDir.contains("weathers", ignoreCase = true) -> ContentType.weather
            parentDir.contains("planets", ignoreCase = true) -> ContentType.planet
            parentDir.contains("sectors", ignoreCase = true) -> ContentType.sector
            else -> ContentType.block // 默认
        }
    }
}
