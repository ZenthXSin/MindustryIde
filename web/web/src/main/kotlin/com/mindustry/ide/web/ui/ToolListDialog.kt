package com.mindustry.ide.web.ui

/**
 * 工具数据类
 */
data class ToolItem(
    val id: String,
    val name: String,
    val description: String,
    val icon: String = "🔧"
)

/**
 * 工具列表弹窗工厂
 */
object ToolListDialog {
    
    /**
     * 获取所有可用工具列表
     */
    fun getTools(): List<ToolItem> {
        return listOf(
            ToolItem(
                id = "doc-query",
                name = "文档查询器",
                description = "查询 Mindustry 类和方法的文档",
                icon = "📖"
            )
        )
    }
    
    /**
     * 创建工具列表弹窗配置
     */
    fun create(): DialogConfig {
        val tools = getTools()
        val message = buildString {
            appendLine("<div style='display: flex; flex-direction: column; gap: 12px;'>")
            tools.forEach { tool ->
                appendLine("""
                    <div style='
                        display: flex;
                        align-items: center;
                        gap: 12px;
                        padding: 12px;
                        background-color: #2b2d30;
                        border: 1px solid #555555;
                        border-radius: 4px;
                        cursor: pointer;
                        transition: all 0.15s ease;
                    ' 
                    onmouseover="this.style.borderColor='#3574f0'; this.style.backgroundColor='#3c3f41'"
                    onmouseout="this.style.borderColor='#555555'; this.style.backgroundColor='#2b2d30'"
                    onclick="useTool('${tool.id}')">
                        <span style='font-size: 1.5rem;'>${tool.icon}</span>
                        <div style='flex: 1;'>
                            <div style='font-weight: 600; margin-bottom: 4px;'>${tool.name}</div>
                            <div style='font-size: 0.85rem; color: #808080;'>${tool.description}</div>
                        </div>
                        <span style='color: #3574f0; font-size: 0.9rem;'>使用 →</span>
                    </div>
                """.trimIndent())
            }
            appendLine("</div>")
        }
        
        return DialogConfig(
            title = "工具列表",
            message = message.toString(),
            type = DialogType.INFO,
            buttons = listOf(DialogButton("关闭", action = "onClose")),
            closable = true,
            autoClose = 10000,  // 10秒后自动关闭
            position = DialogPosition.CENTER
        )
    }
}
