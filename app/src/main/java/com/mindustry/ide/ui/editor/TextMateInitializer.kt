package com.mindustry.ide.ui.editor

import android.content.Context
import android.util.Log
import io.github.rosemoe.sora.langs.textmate.TextMateLanguage
import io.github.rosemoe.sora.langs.textmate.registry.GrammarRegistry
import io.github.rosemoe.sora.langs.textmate.registry.ThemeRegistry
import io.github.rosemoe.sora.langs.textmate.registry.model.ThemeModel
import io.github.rosemoe.sora.widget.CodeEditor

/**
 * TextMate 语法高亮初始化辅助
 *
 * 用于在需要 JSON/Kotlin 等非 Java 语言的高亮时加载 TextMate 语法。
 * 需要在 assets/textmate/ 下放置：
 *   - languages.json（语法注册表）
 *   - *.tmLanguage.json（语法定义）
 *   - *.language-configuration.json（语言配置）
 *   - themes/（主题文件）
 *
 * 当前阶段 Java 高亮使用内置 JavaLanguage，TextMate 预留后续接入。
 */
object TextMateInitializer {

    private const val TAG = "TextMateInit"
    private var initialized = false

    /**
     * 初始化 TextMate 引擎
     * 应在 Application 或首次使用编辑器时调用
     */
    fun init(context: Context) {
        if (initialized) return

        try {
            val grammarRegistry = GrammarRegistry.getInstance()

            // 从 assets 加载语法注册表
            // 文件格式参考 sora-editor 的 language-textmate 示例
            grammarRegistry.loadGrammars("textmate/languages.json")

            // 加载主题
            val themeRegistry = ThemeRegistry.getInstance()
            // 从 assets 加载主题文件
            // themeRegistry.loadTheme(...)

            initialized = true
            Log.i(TAG, "TextMate initialized")
        } catch (e: Exception) {
            Log.w(TAG, "TextMate init failed, using built-in languages", e)
        }
    }

    /**
     * 向编辑器设置 TextMate 语言
     *
     * @param editor 目标编辑器
     * @param scopeName TextMate scope name（如 "source.java", "source.json"）
     */
    fun setLanguage(editor: CodeEditor, scopeName: String) {
        if (!initialized) {
            Log.w(TAG, "TextMate not initialized, cannot set language: $scopeName")
            return
        }

        try {
            val language = TextMateLanguage.create(scopeName, true)
            editor.setEditorLanguage(language)
            Log.i(TAG, "Set language: $scopeName")
        } catch (e: Exception) {
            Log.w(TAG, "Failed to set language: $scopeName", e)
        }
    }
}
