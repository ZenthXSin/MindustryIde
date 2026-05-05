package com.mindustry.ide.web.project

import com.mindustry.ide.tool.json.JsonEditorTool
import com.mindustry.ide.tool.json.JsonParser
import com.mindustry.ide.web.Vars
import java.io.File

/**
 * 项目管理器
 * 负责创建和管理 Mindustry 项目
 */
object ProjectManager {

    // 存储创建的项目文件（临时方案，后续可改为持久化存储）
    private val projectFiles = mutableMapOf<String, com.mindustry.ide.tool.json.JsonWorkFile>()

    /**
     * 创建新项目
     * @param projectName 项目名称
     * @param className 基础类名（如 GenericCrafter, ItemTurret 等）
     * @return 创建结果
     */
    fun createProject(projectName: String, className: String): Map<String, Any?> {
        return try {
            // 验证参数
            if (projectName.isBlank()) {
                return mapOf(
                    "success" to false, "error" to "项目名称不能为空"
                )
            }

            if (className.isBlank()) {
                return mapOf(
                    "success" to false, "error" to "请选择一个基础类"
                )
            }

            // 检查类是否存在
            val classInfo = Vars.parser.classDocs[className] ?: return mapOf(
                "success" to false, "error" to "找不到类: $className"
            )

            // 创建项目目录
//            val projectDir = File("projects", projectName)
//            if (projectDir.exists()) {
//                return mapOf(
//                    "success" to false, "error" to "项目已存在: $projectName"
//                )
//            }
//
//            projectDir.mkdirs()

            // 创建 JsonEditorTool 实例
            val parser = Vars.parser
            val tool = object : JsonEditorTool(parser) {
                override fun error(message: String) {
                    com.mindustry.ide.web.ui.DialogManager.error("项目创建错误", message)
                }

                override fun info(message: String) {
                    com.mindustry.ide.web.ui.DialogManager.info("项目创建信息", message)
                }

                override fun warning(message: String) {
                    com.mindustry.ide.web.ui.DialogManager.warning("项目创建警告", message)
                }
            }

            // 创建 JsonWorkFile
            val jsonWorkFile = tool.new(projectName) {
                first { it.name == className }
            }
                        
            // 存储项目文件
            projectFiles[projectName] = jsonWorkFile

            mapOf(
                "success" to true,
                "message" to "项目创建成功: $projectName",
                "projectPath" to "",
                "baseClass" to className
            )
        } catch (e: Exception) {
            e.printStackTrace()
            mapOf(
                "success" to false, "error" to "创建项目失败: ${e.message}"
            )
        }
    }

    /**
     * 获取所有可用的基础类列表
     */
    fun getAvailableClasses(): List<String> {
        return Vars.parser.classDocs.keys.sorted()
    }
    
    /**
     * 获取项目内容
     * @param projectName 项目名称
     * @return 项目 JSON 内容
     */
    fun getProjectContent(projectName: String): Map<String, Any?> {
        return try {
            val jsonWorkFile = projectFiles[projectName]
            if (jsonWorkFile == null) {
                mapOf(
                    "success" to false,
                    "error" to "项目不存在: $projectName"
                )
            } else {
                mapOf(
                    "success" to true,
                    "content" to jsonWorkFile.getContent()
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
            mapOf(
                "success" to false,
                "error" to "获取项目内容失败: ${e.message}"
            )
        }
    }
    
    /**
     * 获取所有项目列表
     * @return 项目名称列表
     */
    fun getProjectList(): List<String> {
        return projectFiles.keys.sorted()
    }
    
    /**
     * 删除项目
     * @param projectName 项目名称
     * @return 操作结果
     */
    fun deleteProject(projectName: String): Map<String, Any?> {
        return try {
            if (projectFiles.containsKey(projectName)) {
                projectFiles.remove(projectName)
                mapOf(
                    "success" to true,
                    "message" to "项目已删除: $projectName"
                )
            } else {
                mapOf(
                    "success" to false,
                    "error" to "项目不存在: $projectName"
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
            mapOf(
                "success" to false,
                "error" to "删除项目失败: ${e.message}"
            )
        }
    }
    
    /**
     * 重命名项目
     * @param oldName 旧项目名称
     * @param newName 新项目名称
     * @return 操作结果
     */
    fun renameProject(oldName: String, newName: String): Map<String, Any?> {
        return try {
            if (!projectFiles.containsKey(oldName)) {
                return mapOf(
                    "success" to false,
                    "error" to "项目不存在: $oldName"
                )
            }
            
            if (projectFiles.containsKey(newName)) {
                return mapOf(
                    "success" to false,
                    "error" to "项目已存在: $newName"
                )
            }
            
            val projectFile = projectFiles.remove(oldName)
            if (projectFile != null) {
                projectFiles[newName] = projectFile
                mapOf(
                    "success" to true,
                    "message" to "项目已重命名: $oldName -> $newName"
                )
            } else {
                mapOf(
                    "success" to false,
                    "error" to "重命名失败"
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
            mapOf(
                "success" to false,
                "error" to "重命名项目失败: ${e.message}"
            )
        }
    }
}
