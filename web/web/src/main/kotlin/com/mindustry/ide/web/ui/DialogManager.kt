package com.mindustry.ide.web.ui

/**
 * 弹窗位置枚举
 */
enum class DialogPosition {
    TOP_RIGHT,      // 右上角（默认）
    TOP_LEFT,       // 左上角
    BOTTOM_RIGHT,   // 右下角
    BOTTOM_LEFT,    // 左下角
    CENTER          // 居中
}

/**
 * 弹窗类型枚举
 */
enum class DialogType {
    INFO,       // 信息提示
    WARNING,    // 警告
    ERROR,      // 错误
    SUCCESS,    // 成功
    CONFIRM     // 确认对话框
}

/**
 * 弹窗按钮配置
 */
data class DialogButton(
    val text: String,
    val action: String = "",  // 前端回调函数名
    val isPrimary: Boolean = false
)

/**
 * 弹窗配置数据类
 */
open class DialogConfig(
    val title: String = "",
    val message: String = "",
    val type: DialogType = DialogType.INFO,
    val buttons: List<DialogButton> = listOf(DialogButton("确定", isPrimary = true)),
    val closable: Boolean = true,  // 是否可关闭
    val autoClose: Long = 0,       // 自动关闭时间（毫秒），0表示不自动关闭
    val position: DialogPosition = DialogPosition.TOP_RIGHT  // 弹窗位置
)

/**
 * 弹窗管理器 - 单例
 */
object DialogManager {
    private val dialogQueue = mutableListOf<DialogConfig>()
    
    /**
     * 显示信息弹窗
     */
    fun info(title: String, message: String) {
        showDialog(
            DialogConfig(
                title = title,
                message = message,
                type = DialogType.INFO,
                autoClose = 3000  // 3秒后自动关闭
            )
        )
    }
    
    /**
     * 显示警告弹窗
     */
    fun warning(title: String, message: String) {
        showDialog(
            DialogConfig(
                title = title,
                message = message,
                type = DialogType.WARNING,
                autoClose = 4000  // 4秒后自动关闭
            )
        )
    }
    
    /**
     * 显示错误弹窗
     */
    fun error(title: String, message: String) {
        showDialog(
            DialogConfig(
                title = title,
                message = message,
                type = DialogType.ERROR,
                autoClose = 5000  // 5秒后自动关闭
            )
        )
    }
    
    /**
     * 显示成功弹窗
     */
    fun success(title: String, message: String) {
        showDialog(
            DialogConfig(
                title = title,
                message = message,
                type = DialogType.SUCCESS,
                autoClose = 2000  // 2秒后自动关闭
            )
        )
    }
    
    /**
     * 显示自定义位置的提示弹窗
     */
    fun infoAt(title: String, message: String, position: DialogPosition = DialogPosition.TOP_RIGHT) {
        showDialog(
            DialogConfig(
                title = title,
                message = message,
                type = DialogType.INFO,
                autoClose = 3000,
                position = position
            )
        )
    }
    
    /**
     * 显示确认弹窗
     */
    fun confirm(
        title: String,
        message: String,
        onConfirm: () -> Unit = {},
        onCancel: () -> Unit = {}
    ) {
        showDialog(
            DialogConfig(
                title = title,
                message = message,
                type = DialogType.CONFIRM,
                buttons = listOf(
                    DialogButton("取消", action = "onCancel"),
                    DialogButton("确定", action = "onConfirm", isPrimary = true)
                )
            )
        )
    }
    
    /**
     * 显示自定义弹窗
     */
    fun showDialog(config: DialogConfig) {
        dialogQueue.add(config)
    }
    
    /**
     * 获取下一个弹窗
     */
    fun getNextDialog(): DialogConfig? {
        return if (dialogQueue.isNotEmpty()) {
            dialogQueue.removeAt(0)
        } else {
            null
        }
    }
    
    /**
     * 获取所有待显示的弹窗（用于堆叠显示）
     */
    fun getAllPendingDialogs(): List<DialogConfig> {
        val dialogs = dialogQueue.toList()
        dialogQueue.clear()
        return dialogs
    }
    
    /**
     * 清空所有弹窗
     */
    fun clearAll() {
        dialogQueue.clear()
    }
    
    /**
     * 是否有待显示的弹窗
     */
    fun hasPendingDialogs(): Boolean {
        return dialogQueue.isNotEmpty()
    }
}
