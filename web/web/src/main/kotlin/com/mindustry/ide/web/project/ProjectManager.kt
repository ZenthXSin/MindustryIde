package com.mindustry.ide.web.project

import com.mindustry.ide.tool.json.*
import com.mindustry.ide.tool.json.addFieldBuild
import com.mindustry.ide.web.Vars

/**
 * 项目管理器
 * 负责创建和管理 Mindustry 项目
 */
object ProjectManager {

    /**
     * 项目存储单元，同时持有工作文件和对应的工具实例
     */
    private data class ProjectStorage(
        val workFile: JsonWorkFile,
        val tool: JsonEditorTool
    )

    // 内存存储（后续可改为持久化）
    private val projects = mutableMapOf<String, ProjectStorage>()

    /* ================================================================ */
    /*  基础项目操作                                                      */
    /* ================================================================ */

    fun createProject(projectName: String, className: String): Map<String, Any?> {
        return try {
            if (projectName.isBlank())
                return mapOf("success" to false, "error" to "项目名称不能为空")
            if (className.isBlank())
                return mapOf("success" to false, "error" to "请选择一个基础类")
            if (projects.containsKey(projectName))
                return mapOf("success" to false, "error" to "项目已存在: $projectName")

            val classInfo = Vars.parser.classDocs[className]
                ?: return mapOf("success" to false, "error" to "找不到类: $className")

            // 创建匿名工具实例，复用 DialogManager 输出日志
            val tool = object : JsonEditorTool(Vars.parser) {
                override fun error(message: String) {
                    com.mindustry.ide.web.ui.DialogManager.error("项目错误", message)
                }
                override fun info(message: String) {
                    com.mindustry.ide.web.ui.DialogManager.info("项目信息", message)
                }
                override fun warning(message: String) {
                    com.mindustry.ide.web.ui.DialogManager.warning("项目警告", message)
                }
            }

            // 新建 JsonWorkFile
            val workFile = tool.new(projectName) {
                first { it.name == className }
            }

            projects[projectName] = ProjectStorage(workFile, tool)

            mapOf(
                "success" to true,
                "message" to "项目创建成功: $projectName",
                "baseClass" to className
            )
        } catch (e: Exception) {
            e.printStackTrace()
            mapOf("success" to false, "error" to "创建项目失败: ${e.message}")
        }
    }

    fun getAvailableClasses(): List<String> = Vars.parser.classDocs.keys.sorted()

    fun getProjectContent(projectName: String): Map<String, Any?> {
        val storage = projects[projectName]
            ?: return mapOf("success" to false, "error" to "项目不存在: $projectName")
        return mapOf("success" to true, "content" to storage.workFile.getContent())
    }

    fun getProjectList(): List<String> = projects.keys.sorted()

    fun deleteProject(projectName: String): Map<String, Any?> {
        return if (projects.remove(projectName) != null)
            mapOf("success" to true, "message" to "项目已删除: $projectName")
        else
            mapOf("success" to false, "error" to "项目不存在: $projectName")
    }

    fun renameProject(oldName: String, newName: String): Map<String, Any?> {
        val storage = projects[oldName]
            ?: return mapOf("success" to false, "error" to "项目不存在: $oldName")
        if (projects.containsKey(newName))
            return mapOf("success" to false, "error" to "项目已存在: $newName")

        projects.remove(oldName)
        projects[newName] = storage
        return mapOf("success" to true, "message" to "项目已重命名: $oldName -> $newName")
    }

    /* ================================================================ */
    /*  字段编辑操作                                                      */
    /* ================================================================ */

    /**
     * 获取项目所有字段信息（包括已添加和未添加）
     */
    fun getProjectFields(projectName: String): Map<String, Any?> {
        val storage = projects[projectName]
            ?: return mapOf("success" to false, "error" to "项目不存在: $projectName")

        val classBuild = storage.workFile.classBuild
        // 使用简单类名（不含包名）来匹配 fieldDocs 中的键
        val className = classBuild.classData.simpleName
        
        val allFields = classBuild.getAllFields().map { field ->
            val meta = Vars.parser.fieldDocs[className]?.get(field.name)
            mapOf(
                "name" to field.name,
                "type" to field.type.simpleName,
                "defaultValue" to (meta?.defaultValue ?: ""),
                "notes" to (meta?.notes ?: ""),
                "isRequired" to field.isLikelyRequired()
            )
        }

        val addedFields = classBuild.fieldBuilds.map { fb ->
            mapOf(
                "name" to fb.field.name,
                "value" to fb.value.getString(),
                "type" to fb.classData.simpleName
            )
        }

        return mapOf(
            "success" to true,
            "className" to classBuild.name,
            "allFields" to allFields,
            "addedFields" to addedFields
        )
    }

    /**
     * 添加字段（仅顶级字段）
     */
    fun addField(projectName: String, fieldName: String): Map<String, Any?> {
        val storage = projects[projectName]
            ?: return mapOf("success" to false, "error" to "项目不存在: $projectName")

        return try {
            storage.tool.addFieldBuild({
                first { it.field.name == fieldName }
            })
            mapOf("success" to true, "message" to "字段已添加: $fieldName")
        } catch (e: Exception) {
            mapOf("success" to false, "error" to "添加字段失败: ${e.message}")
        }
    }

    /**
     * 修改字段值（仅顶级字段的简单值）
     */
    fun updateFieldValue(projectName: String, fieldName: String, newValue: String): Map<String, Any?> {
        val storage = projects[projectName]
            ?: return mapOf("success" to false, "error" to "项目不存在: $projectName")

        return try {
            storage.tool.setFieldBuild(fieldName) {
                value.value = newValue
            }
            mapOf("success" to true, "message" to "字段值已更新: $fieldName = $newValue")
        } catch (e: Exception) {
            mapOf("success" to false, "error" to "更新字段失败: ${e.message}")
        }
    }

    /**
     * 删除字段（仅顶级字段）
     */
    fun removeField(projectName: String, fieldName: String): Map<String, Any?> {
        val storage = projects[projectName]
            ?: return mapOf("success" to false, "error" to "项目不存在: $projectName")

        return try {
            val removed = storage.workFile.classBuild.removeFieldBuild(fieldName)
            if (removed)
                mapOf("success" to true, "message" to "字段已删除: $fieldName")
            else
                mapOf("success" to false, "error" to "字段不存在: $fieldName")
        } catch (e: Exception) {
            mapOf("success" to false, "error" to "删除字段失败: ${e.message}")
        }
    }
}