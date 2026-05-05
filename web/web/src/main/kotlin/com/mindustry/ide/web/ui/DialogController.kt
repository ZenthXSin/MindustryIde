package com.mindustry.ide.web.ui

import org.springframework.web.bind.annotation.*

/**
 * 弹窗控制器
 * 提供弹窗相关的 REST API
 */
@RestController
@RequestMapping("/api/dialog")
class DialogController {
    
    /**
     * 获取下一个待显示的弹窗
     */
    @GetMapping("/next")
    fun getNextDialog(): Map<String, Any?> {
        val dialog = DialogManager.getNextDialog()
        return if (dialog != null) {
            mapOf(
                "success" to true,
                "dialog" to mapOf(
                    "title" to dialog.title,
                    "message" to dialog.message,
                    "type" to dialog.type.name,
                    "buttons" to dialog.buttons.map { btn ->
                        mapOf(
                            "text" to btn.text,
                            "action" to btn.action,
                            "isPrimary" to btn.isPrimary
                        )
                    },
                    "closable" to dialog.closable,
                    "autoClose" to dialog.autoClose,
                    "position" to dialog.position.name
                )
            )
        } else {
            mapOf("success" to true, "dialog" to null)
        }
    }
    
    /**
     * 获取所有待显示的弹窗（用于堆叠显示）
     */
    @GetMapping("/all")
    fun getAllDialogs(): Map<String, Any?> {
        val dialogs = DialogManager.getAllPendingDialogs()
        return mapOf(
            "success" to true,
            "dialogs" to dialogs.map { dialog ->
                mapOf(
                    "title" to dialog.title,
                    "message" to dialog.message,
                    "type" to dialog.type.name,
                    "buttons" to dialog.buttons.map { btn ->
                        mapOf(
                            "text" to btn.text,
                            "action" to btn.action,
                            "isPrimary" to btn.isPrimary
                        )
                    },
                    "closable" to dialog.closable,
                    "autoClose" to dialog.autoClose,
                    "position" to dialog.position.name
                )
            }
        )
    }
    
    /**
     * 检查是否有待显示的弹窗
     */
    @GetMapping("/has-pending")
    fun hasPendingDialogs(): Map<String, Boolean> {
        return mapOf("hasPending" to DialogManager.hasPendingDialogs())
    }
    
    /**
     * 显示信息弹窗
     */
    @PostMapping("/info")
    fun showInfo(@RequestBody request: Map<String, String>): Map<String, Boolean> {
        DialogManager.info(
            title = request["title"] ?: "提示",
            message = request["message"] ?: ""
        )
        return mapOf("success" to true)
    }
    
    /**
     * 显示警告弹窗
     */
    @PostMapping("/warning")
    fun showWarning(@RequestBody request: Map<String, String>): Map<String, Boolean> {
        DialogManager.warning(
            title = request["title"] ?: "警告",
            message = request["message"] ?: ""
        )
        return mapOf("success" to true)
    }
    
    /**
     * 显示错误弹窗
     */
    @PostMapping("/error")
    fun showError(@RequestBody request: Map<String, String>): Map<String, Boolean> {
        DialogManager.error(
            title = request["title"] ?: "错误",
            message = request["message"] ?: ""
        )
        return mapOf("success" to true)
    }
    
    /**
     * 显示成功弹窗
     */
    @PostMapping("/success")
    fun showSuccess(@RequestBody request: Map<String, String>): Map<String, Boolean> {
        DialogManager.success(
            title = request["title"] ?: "成功",
            message = request["message"] ?: ""
        )
        return mapOf("success" to true)
    }
    
    /**
     * 清空所有弹窗
     */
    @PostMapping("/clear")
    fun clearAll(): Map<String, Boolean> {
        DialogManager.clearAll()
        return mapOf("success" to true)
    }
    
    /**
     * 显示工具列表弹窗
     */
    @PostMapping("/tools")
    fun showTools(): Map<String, Boolean> {
        val dialog = ToolListDialog.create()
        DialogManager.showDialog(dialog)
        return mapOf("success" to true)
    }
    
    /**
     * 显示文档查询器弹窗
     */
    @PostMapping("/doc-query")
    fun showDocQuery(): Map<String, Boolean> {
        val dialog = DocQueryDialog.create()
        DialogManager.showDialog(dialog)
        return mapOf("success" to true)
    }
    
    /**
     * 获取所有类名列表
     */
    @GetMapping("/class-list")
    fun getClassList(): Map<String, Any?> {
        return try {
            val classNames = DocQueryDialog.getClassNames()
            mapOf(
                "success" to true,
                "classes" to classNames,
                "count" to classNames.size
            )
        } catch (e: Exception) {
            mapOf(
                "success" to false,
                "error" to e.message
            )
        }
    }
    
    /**
     * 获取类信息
     */
    @GetMapping("/class-info")
    fun getClassInfo(@RequestParam className: String): Map<String, Any?> {
        return try {
            val info = DocQueryDialog.getClassInfo(className)
            mapOf(
                "success" to true,
                "data" to info
            )
        } catch (e: Exception) {
            mapOf(
                "success" to false,
                "error" to e.message
            )
        }
    }
}
