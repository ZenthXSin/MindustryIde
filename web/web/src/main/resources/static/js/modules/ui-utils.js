/**
 * UI Utilities Module
 * 提供通用的 UI 操作工具函数
 */

const UIUtils = {
    /**
     * 切换展开/收起状态
     * @param {string} optionsId - 选项区域的 ID
     * @param {string} btnId - 按钮的 ID
     * @param {string} defaultText - 默认文本
     * @param {string} expandedText - 展开时的文本
     */
    toggleSection(optionsId, btnId, defaultText, expandedText) {
        const options = document.getElementById(optionsId);
        const isExpanded = options.classList.contains('show');
        
        // 关闭其他区域
        if (optionsId === 'startOptions') {
            this.closeSection('moreOptions', 'moreBtn', '更多');
        } else {
            this.closeSection('startOptions', 'startBtn', '开始');
        }
        
        // 切换当前区域
        if (isExpanded) {
            this.closeSection(optionsId, btnId, defaultText);
        } else {
            this.openSection(optionsId, btnId, expandedText);
        }
    },

    /**
     * 展开区域
     */
    openSection(optionsId, btnId, text) {
        const options = document.getElementById(optionsId);
        const btn = document.getElementById(btnId);
        options.classList.add('show');
        btn.textContent = text;
        btn.setAttribute('aria-expanded', 'true');
    },

    /**
     * 收起区域
     */
    closeSection(optionsId, btnId, text) {
        const options = document.getElementById(optionsId);
        const btn = document.getElementById(btnId);
        options.classList.remove('show');
        btn.textContent = text;
        btn.setAttribute('aria-expanded', 'false');
    },

    /**
     * 获取对话框图标
     */
    getDialogIcon(type) {
        const icons = {
            'INFO': 'ℹ️',
            'WARNING': '⚠️',
            'ERROR': '❌',
            'SUCCESS': '✅',
            'CONFIRM': '❓'
        };
        return icons[type] || 'ℹ️';
    }
};

// 导出到全局
window.UIUtils = UIUtils;
