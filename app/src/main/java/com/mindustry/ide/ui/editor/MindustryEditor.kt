package com.mindustry.ide.ui.editor

import android.graphics.Typeface
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import io.github.rosemoe.sora.langs.java.JavaLanguage
import io.github.rosemoe.sora.widget.CodeEditor

private const val TAG = "MindustryEditor"

/**
 * MindustryIde 代码编辑器 Composable
 *
 * 通过 AndroidView 桥接 Sora Editor 的 CodeEditor。
 * 使用 JavaLanguage 提供 Java 语法高亮（Mindustry mod 主要语言）。
 * TextMate 支持需要额外配置语法文件，暂使用内置 Java 高亮。
 *
 * 所有方法名均直接从 sora-editor v0.24.5 源码 CodeEditor.java 验证。
 *
 * @param content 初始文本
 * @param editable 是否可编辑（默认 true）
 * @param modifier Compose Modifier
 */
@Composable
fun MindustryEditor(
    content: String,
    editable: Boolean = true,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current

    val editor = remember(context) {
        CodeEditor(context).apply {
            // 设置文本（Content 对象）
            setText(content)

            // 可编辑性（源码: setEditable / isEditable）
            setEditable(editable)

            // 等宽字体（源码: setTypefaceText）
            setTypefaceText(Typeface.MONOSPACE)

            // 内置 Java 语法高亮（源码: setEditorLanguage）
            setEditorLanguage(JavaLanguage())

            // Mindustry 暗色主题（源码: setColorScheme）
            setColorScheme(MindustryEditorColorScheme())

            // Tab 宽度（源码: setTabWidth）
            setTabWidth(4)

            // 选中行高亮（源码: setHighlightCurrentLine）
            setHighlightCurrentLine(true)

            // 文字大小 sp（源码: setTextSize，参数为 float sp 单位）
            setTextSize(16f)

            // 关闭自动换行（源码: setWordwrap）
            setWordwrap(false)

            Log.i(TAG, "Editor created")
        }
    }

    AndroidView(
        factory = { editor },
        modifier = modifier,
        update = { view ->
            try {
                if (view.text?.toString() != content) {
                    view.setText(content)
                }
            } catch (e: Exception) {
                Log.w(TAG, "Failed to update text", e)
            }
        },
    )

    DisposableEffect(Unit) {
        onDispose {
            try {
                editor.release()
                Log.i(TAG, "Editor released")
            } catch (e: Exception) {
                Log.w(TAG, "Failed to release editor", e)
            }
        }
    }
}
