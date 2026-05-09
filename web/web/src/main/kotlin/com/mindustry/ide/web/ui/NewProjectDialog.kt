package com.mindustry.ide.web.ui

import com.mindustry.ide.web.project.ProjectManager

/**
 * 新建项目对话框
 */
object NewProjectDialog {
    
    /**
     * 创建新建项目对话框配置
     */
    fun create(): DialogConfig {
        return DialogConfig(
            title = "新建项目",
            message = """
                <div style="display: flex; flex-direction: column; gap: 16px;">
                    <div>
                        <label style="display: block; margin-bottom: 8px; font-weight: 600;">项目名称：</label>
                        <input type="text" id="projectNameInput" placeholder="输入项目名称" 
                               style="width: 100%; padding: 8px 12px; background-color: #2b2d30; border: 1px solid #555555; border-radius: 4px; color: #a9b7c6; font-family: 'JetBrains Mono', monospace; font-size: 0.9rem;" />
                    </div>
                    <div>
                        <label style="display: block; margin-bottom: 8px; font-weight: 600;">基础类：</label>
                        <div style="position: relative;">
                            <input type="text" id="classSearchInput" placeholder="输入类名搜索..." 
                                   autocomplete="off"
                                   style="width: 100%; padding: 8px 12px; background-color: #2b2d30; border: 1px solid #555555; border-radius: 4px; color: #a9b7c6; font-family: 'JetBrains Mono', monospace; font-size: 0.9rem; cursor: pointer;" />
                            <div id="classListDropdown" style="position: absolute; top: 100%; left: 0; right: 0; margin-top: 4px; background-color: #2b2d30; border: 1px solid #555555; border-radius: 4px; max-height: 250px; overflow-y: auto; z-index: 1000; display: none; box-shadow: 0 4px 12px rgba(0, 0, 0, 0.4);"></div>
                        </div>
                        <input type="hidden" id="classSelect" />
                    </div>
                </div>
            """.trimIndent(),
            type = DialogType.INFO,
            buttons = listOf(
                DialogButton("取消", action = "onCancel"),
                DialogButton("创建", action = "onCreate", isPrimary = true)
            ),
            closable = true,
            autoClose = 0,
            position = DialogPosition.CENTER
        )
    }
    
    /**
     * 获取所有可用的类名列表（用于前端填充）
     */
    fun getAvailableClasses(): List<String> {
        return ProjectManager.getAvailableClasses()
    }
}
