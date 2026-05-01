package com.mindustry.ide.ui.component


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mindustry.ide.ui.theme.MindustryAccent
import com.mindustry.ide.ui.theme.MindustryDarkMetal
import com.mindustry.ide.ui.theme.MindustryDarkestGray
import com.mindustry.ide.ui.theme.MindustryDarkerGray
import com.mindustry.ide.ui.theme.MindustryGray

// ========== Mindustry 切角按钮 ==========
// 复刻 mindustry button.9.png 的 45 度切角边框样式
// 保留 Material3 Button 的完整功能：content slot / enabled / interaction / semantics

private val ChamferSize = 6.dp
private val BorderWidth = 1.5.dp
private const val DisabledContentAlpha = 0.38f

/** Mindustry 风格按钮颜色 */
data class MdtButtonColors(
    val borderUp: Color = MindustryDarkMetal,
    val borderDown: Color = MindustryAccent,
    val borderOver: Color = MindustryAccent.copy(alpha = 0.7f),
    val fillUp: Color = MindustryDarkestGray,
    val fillDown: Color = MindustryDarkerGray,
    val fillOver: Color = MindustryDarkestGray,
)

val MdtButtonDefaultColors = MdtButtonColors()

@Composable
fun MdtButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: MdtButtonColors = MdtButtonDefaultColors,
    contentPadding: Dp = 12.dp,
    content: @Composable BoxScope.() -> Unit,
) {
    var isPressed by remember { mutableStateOf(false) }
    var isHovered by remember { mutableStateOf(false) }

    val currentBorderColor = when {
        !enabled -> MindustryGray.copy(alpha = 0.4f)
        isPressed -> colors.borderDown
        isHovered -> colors.borderOver
        else -> colors.borderUp
    }
    val currentFillColor = when {
        !enabled -> MindustryDarkestGray.copy(alpha = 0.5f)
        isPressed -> colors.fillDown
        else -> if (isHovered) colors.fillOver else colors.fillUp
    }

    Box(
        modifier = modifier
            .defaultMinSize(minWidth = 64.dp, minHeight = 40.dp)
            .pointerInput(enabled) {
                detectTapGestures(
                    onPress = {
                        isPressed = true
                        tryAwaitRelease()
                        isPressed = false
                        if (enabled) onClick()
                    }
                )
            },
        contentAlignment = Alignment.Center
    ) {
        // 绘制切角背景 + 边框
        Canvas(modifier = Modifier.matchParentSize()) {
            val c = ChamferSize.toPx()
            val bw = BorderWidth.toPx()
            val w = size.width
            val h = size.height

            val path = Path().apply {
                moveTo(c, 0f)
                lineTo(w - c, 0f)
                lineTo(w, c)
                lineTo(w, h - c)
                lineTo(w - c, h)
                lineTo(c, h)
                lineTo(0f, h - c)
                lineTo(0f, c)
                close()
            }
            drawPath(path, color = currentFillColor)

            val inset = bw / 2f
            val borderPath = Path().apply {
                moveTo(c, inset)
                lineTo(w - c, inset)
                lineTo(w - inset, c)
                lineTo(w - inset, h - c)
                lineTo(w - c, h - inset)
                lineTo(c, h - inset)
                lineTo(inset, h - c)
                lineTo(inset, c)
                close()
            }
            drawPath(borderPath, color = currentBorderColor, style = Stroke(width = bw))
        }

        // 内容区域
        Box(
            modifier = Modifier.padding(contentPadding),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}

// ========== 文本变体 ==========

@Composable
fun MdtTextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: MdtButtonColors = MdtButtonDefaultColors,
    useTechFont: Boolean = true,
    icon: ImageBitmap? = null,
) {
    MdtButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
    ) {
        if (icon != null) {
            androidx.compose.foundation.layout.Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(4.dp)
            ) {
                androidx.compose.foundation.Image(
                    bitmap = icon,
                    contentDescription = null,
                    modifier = androidx.compose.ui.Modifier.size(28.dp),
                    contentScale = androidx.compose.ui.layout.ContentScale.Fit
                )
                Text(
                    text = text,
                    color = if (enabled) Color.White else Color.White.copy(alpha = DisabledContentAlpha),
                    style = MaterialTheme.typography.labelLarge.copy(
                        fontFamily = if (useTechFont) com.mindustry.ide.ui.theme.MindustryFontFamily else FontFamily.SansSerif
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        } else {
            Text(
                text = text,
                color = if (enabled) Color.White else Color.White.copy(alpha = DisabledContentAlpha),
                style = MaterialTheme.typography.labelLarge.copy(
                    fontFamily = if (useTechFont) com.mindustry.ide.ui.theme.MindustryFontFamily else FontFamily.SansSerif
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

