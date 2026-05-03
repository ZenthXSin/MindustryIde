package com.mindustry.ide.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mindustry.ide.ui.editor.MindustryEditor
import com.mindustry.ide.ui.theme.*

/**
 * 编辑器界面
 *
 * 展示 Sora Editor 集成效果，包含顶部文件名栏和代码编辑区域。
 * 当前为演示模式，显示一段示例 Mindustry Java mod 代码。
 */
@Composable
fun EditorScreen(
    modifier: Modifier = Modifier,
    fileName: String = "ExampleMod.java",
    initialContent: String = EXAMPLE_MOD_CODE,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MindustryDarkestestGray)
    ) {
        // 顶部文件名栏
        FileTabBar(fileName = fileName)

        // 代码编辑器
        MindustryEditor(
            content = initialContent,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
        )
    }
}

@Composable
private fun FileTabBar(fileName: String) {
    androidx.compose.foundation.layout.Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MindustryDarkestGray)
            .background(MindustryDarkerGray.copy(alpha = 0.3f))
    ) {
        androidx.compose.foundation.layout.Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MindustryDarkestGray)
                .padding(horizontal = 16.dp, vertical = 10.dp),
        ) {
            Text(
                text = fileName,
                color = MindustryText,
                fontSize = 13.sp,
                fontFamily = FontFamily.Monospace,
            )
        }
    }
}

private val EXAMPLE_MOD_CODE = """package com.example.mod;

import mindustry.mod.Mod;
import mindustry.content.Items;
import mindustry.type.ItemStack;

public class ExampleMod extends Mod {

    public ExampleMod() {
        super("example-mod");
    }

    @Override
    public void loadContent() {
        // Register custom content here
        System.out.println("Example Mod loaded!");
    }
}
"""
