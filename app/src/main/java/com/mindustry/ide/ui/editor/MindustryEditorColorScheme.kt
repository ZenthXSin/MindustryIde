package com.mindustry.ide.ui.editor

import androidx.compose.ui.graphics.toArgb
import com.mindustry.ide.ui.theme.*
import io.github.rosemoe.sora.widget.schemes.EditorColorScheme

/**
 * Mindustry 暗色主题编辑器颜色方案
 *
 * 基于 EditorColorScheme(isDark=true) 继承，映射 Mindustry 调色板。
 * 覆写 applyDefault() 设置自定义颜色。
 */
class MindustryEditorColorScheme : EditorColorScheme(true) {

    override fun applyDefault() {
        super.applyDefault()

        // 整体背景
        setColor(WHOLE_BACKGROUND, MindustryDarkestestGray.toArgb())

        // 行号
        setColor(LINE_NUMBER, MindustryLightishGray.toArgb())
        setColor(LINE_NUMBER_CURRENT, MindustryAccent.toArgb())
        setColor(LINE_NUMBER_BACKGROUND, MindustryDarkestGray.toArgb())

        // 行分隔线
        setColor(LINE_DIVIDER, MindustryBorder.copy(alpha = 0.3f).toArgb())

        // 文字
        setColor(TEXT_NORMAL, MindustryText.toArgb())

        // 当前行
        setColor(CURRENT_LINE, MindustryDarkerGray.copy(alpha = 0.3f).toArgb())

        // 选区
        setColor(SELECTED_TEXT_BACKGROUND, MindustryAccent.copy(alpha = 0.3f).toArgb())

        // 光标
        setColor(SELECTION_INSERT, MindustryAccent.toArgb())
        setColor(SELECTION_HANDLE, MindustryAccent.toArgb())

        // 滚动条
        setColor(SCROLL_BAR_THUMB, MindustryGray.toArgb())
        setColor(SCROLL_BAR_THUMB_PRESSED, MindustryAccent.toArgb())

        // 代码块连线
        setColor(BLOCK_LINE, MindustryBorder.copy(alpha = 0.4f).toArgb())
        setColor(BLOCK_LINE_CURRENT, MindustryAccent.copy(alpha = 0.5f).toArgb())

        // 括号匹配
        setColor(MATCHED_TEXT_BACKGROUND, MindustryAccent.copy(alpha = 0.2f).toArgb())

        // 语法高亮
        setColor(KEYWORD, MindustryTechBlue.toArgb())
        setColor(COMMENT, MindustryTextDim.toArgb())
        setColor(LITERAL, MindustryAccent.toArgb())
        setColor(OPERATOR, MindustryAccentBack.toArgb())
        setColor(FUNCTION_NAME, MindustryReactorPurple.toArgb())
        setColor(IDENTIFIER_NAME, MindustryHeal.toArgb())
        setColor(IDENTIFIER_VAR, MindustryWater.toArgb())
        setColor(ANNOTATION, MindustrySpore.toArgb())

        // 补全窗口
        setColor(COMPLETION_WND_BACKGROUND, MindustryDarkestGray.toArgb())
        setColor(COMPLETION_WND_TEXT_PRIMARY, MindustryText.toArgb())
        setColor(COMPLETION_WND_TEXT_SECONDARY, MindustryLightishGray.toArgb())
        setColor(COMPLETION_WND_ITEM_CURRENT, MindustryDarkerGray.toArgb())
        setColor(COMPLETION_WND_CORNER, MindustryDarkestGray.toArgb())
    }
}
