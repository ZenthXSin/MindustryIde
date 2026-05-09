package com.mindustry.ide.tool.json

import arc.struct.ObjectMap
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import arc.util.Nullable
import mindustry.world.Block
import java.lang.reflect.Field
import java.lang.reflect.Modifier
import kotlin.jvm.java


//TODO Seq<>的适配
/**
 * 判断字段在 JSON 里是否"大概率必须写"
 *
 * 依据：
 * - 基本类型：有零值，默认不写一般安全 → optional
 * - 引用类型且标注了 @Nullable：null 是允许的 → optional
 * - 引用类型无 @Nullable：null 可能导致 NPE → required
 *
 * 注意：这只是静态推断，不是绝对规则。
 * 实际是否必须取决于下游业务逻辑。
 */
fun Field.isLikelyRequired(): Boolean {
    if (Modifier.isTransient(modifiers)) return false
    if (Modifier.isStatic(modifiers)) return false
    if (isSynthetic) return false
    if (Modifier.isFinal(modifiers)) return false

    // 基本类型有零值，不需要 JSON 显式提供
    if (type.isPrimitive) return false

    // 有 @Nullable 注解，说明 null 是允许的
    if (isAnnotationPresent(Nullable::class.java)) return false

    // 引用类型且无 @Nullable → JSON 不写就是 null → 可能 NPE
    return true
}

fun String.isBooleanString(): Boolean {
    return this.equals("true", ignoreCase = true) ||
            this.equals("false", ignoreCase = true)
}

fun String.isNumber(): Boolean {
    return this.toDoubleOrNull() != null
}

val json = Json { prettyPrint = true }

class JsonWorkFile(
    name: String,
    val parser: IJsonParser
) : com.mindustry.ide.tool.WorkFile(name) {
    var classBuild: ClassBuild = ClassBuild(Block::class.java, parser)

    val json1 = Json {
        prettyPrint = true
        prettyPrintIndent = "    "
    }

    fun loadClassBuild(run: ObjectMap<String?, Class<*>?>?.() -> ClassBuild): JsonWorkFile {
        classBuild = run(parser.classMap)
        return this
    }

    override fun import(content: String) {
        TODO("Not yet implemented")
    }

    override fun export(): String {
        TODO("Not yet implemented")
    }

    override fun init() {
        TODO("Not yet implemented")
    }

    override fun getContent(): String {
        val jsonString = classBuild.toJson()
        return formatJson(jsonString)
    }

    fun formatJson(json: String): String {
        return try {
            // 使用 Json.parseToJsonElement 扩展函数
            val jsonElement: JsonElement = Json.parseToJsonElement(json)
            json1.encodeToString(jsonElement)
        } catch (e: Exception) {
            json
        }
    }



    override fun toString(): String {
        return json.encodeToString(classBuild)
    }

    fun addFieldBuild(run: (data: ClassBuild) -> FieldBuild) {
        classBuild.addFieldBuild { run(classBuild) }
    }
}

class ClassBuild(
    var classData: Class<*>,
    val parser: IJsonParser,
    var name: String = classData.simpleName,
    var doc: String = "",
    var parentType: String = "",
    var fieldBuilds: MutableList<FieldBuild> = mutableListOf(),
    var value: String = ""
) {
    init {
        doc = parser.getClassDoc(classData.name)
        parentType = parser.getParentType(classData.name)
        if (value.isEmpty()) {
            value = parser.getFieldDefaultValue(classData.simpleName)[0]
        }
    }

    @Serializable
    data class ClassMeta(
        var className: String,
        var classSimpleName: String,
        var doc: String,
        var parentType: String,
        var fields: List<FieldBuild.FieldMeta>,
        var value: String = ""
    )

    override fun toString(): String {
        return json.encodeToString(getMeta())
    }

    fun removeFieldBuild(fieldName: String): Boolean {
        return fieldBuilds.removeIf { it.field.name == fieldName }
    }

    fun toJson(): String {
        // 如果 value 非空且不为 "null"，直接输出值
        if (value.isNotEmpty() && value != "null") {
            return if (value.isBooleanString()) {
                value
            } else if (value.isNumber()) {
                value
            } else {
                "\"$value\""
            }
        }
        
        // 如果没有子字段，输出 null（基本类型或空对象）
        if (fieldBuilds.isEmpty()) {
            return "null"
        }
        
        // 有子字段，输出对象结构
        var ret = "{\n"
        ret += "\"type\": \"$name\"" + if (fieldBuilds.isEmpty()) "\n" else ",\n"
        for (fieldBuild in fieldBuilds) {
            ret += fieldBuild.toJson() + if (fieldBuild != fieldBuilds.last()) {
                ",\n"
            } else {
                "\n"
            }
        }
        return "$ret}"
    }

    fun getMeta(): ClassMeta {
        return ClassMeta(classData.name, name, doc, parentType, fieldBuilds.map { it.getMeta() }, value)
    }

    fun getAllFields(): List<Field> = classData.fields.toList()

    fun getFieldByName(name: String): Field {
        return classData.fields.firstOrNull { it.name == name } ?: classData.fields.random()
    }

    fun getFieldBuildByName(name: String): FieldBuild? {
        return fieldBuilds.firstOrNull { it.field.name == name }
    }

    fun addFieldBuild(run: () -> FieldBuild) {
        fieldBuilds.add(run())
    }

    fun setFieldBuild(fieldBuild: FieldBuild, run: (FieldBuild) -> FieldBuild) {
        fieldBuilds.removeIf { it.field.name == fieldBuild.field.name }
        fieldBuilds.add(run(fieldBuild))
    }
}

class FieldBuild(
    var field: Field,
    val parser: IJsonParser,
    var classData: Class<*> = field.type,
    var doc: String = ""
) {
    var value = Value(getDefaultForClass(field.type), ClassBuild(field.type, parser))

    init {
        doc = parser.getFieldDoc(classData.name, field.name)
    }

    @Serializable
    data class FieldMeta(var fieldName: String, var className: String, var doc: String, var value: ClassBuild.ClassMeta)

    override fun toString(): String {
        return json.encodeToString(getMeta())
    }

    fun getMeta(): FieldMeta {
        return FieldMeta(field.name, classData.name, doc, value.getTypeValueMeta())
    }

    fun toJson(): String {
        return "\"${field.name}\": " + value.toJson()
    }

    companion object {
        val defaultValues = mapOf(
            Int::class.java to { "0" },
            Float::class.java to { "0" },
            Double::class.java to { "0" },
            Boolean::class.java to { "false" },
            Long::class.java to { "0" },
            Short::class.java to { "0" },
            Byte::class.java to { "0" },
            Char::class.java to { "0" },
            String::class.java to { "" },
            //TODO 更多待补充
        )

        fun getDefaultForClass(clazz: Class<*>): String {
            return defaultValues[clazz]?.invoke() ?: "null"
        }
    }
}

class Value<T>(var value: String, var typeValue: T, var run: (Value<T>) -> String? = { null }) {
    @Serializable
    data class ValueMeta(var value: String, var typeValue: ClassBuild.ClassMeta)

    fun getMeta(): ValueMeta {
        return ValueMeta(value, getTypeValueMeta())
    }

    fun toJson(): String {
        return run(this) ?: when {
            // 值非空：可能是布尔、数字或普通字符串
            value.isNotEmpty() -> {
                if (value.isBooleanString()) value
                else if (value.isNumber()) value
                else "\"$value\""
            }
            // 值空：检查 typeValue
            typeValue is ClassBuild -> {
                val classBuild = typeValue as ClassBuild
                // 判断是否为基本类型或常见包装类
                val isPrimitiveType = classBuild.classData.isPrimitive ||
                    classBuild.classData.simpleName in listOf(
                        "String", "Boolean", "Integer", "Float", "Double", 
                        "Long", "Short", "Byte", "Character"
                    ) ||
                    classBuild.classData.name.startsWith("java.lang")
                
                if (isPrimitiveType) {
                    // 基本类型：输出 null
                    "null"
                } else {
                    // 复杂类型：输出对象结构
                    classBuild.toJson()
                }
            }
            else -> typeValue?.toString() ?: "null"
        }
    }

    fun getString(): String {
        return run(this) ?: when {
            value.isNotEmpty() -> value
            typeValue is ClassBuild -> {
                if ((typeValue as ClassBuild).classData == String::class.java) {
                    value
                } else {
                    (typeValue as ClassBuild).toString()
                }
            }
            else -> typeValue?.toString() ?: "null"
        }
    }

    fun getTypeValueMeta(): ClassBuild.ClassMeta {
        val classType = if (value.isBooleanString()) {
            Boolean::class.java
        } else if (value.isNumber()) {
            Int::class.java
        } else {
            String::class.java
        }
        return when {
            value.isNotEmpty() -> ClassBuild.ClassMeta(
                classType.name,
                classType.simpleName,
                "可能为其他类型转为字符串",
                "",
                listOf(),
                value
            )

            typeValue is ClassBuild -> (typeValue as ClassBuild).getMeta()
            else -> ClassBuild.ClassMeta(
                Nullable::class.java.name,
                Nullable::class.java.simpleName,
                "",
                "",
                listOf(),
                "null"
            )
        }
    }
}
