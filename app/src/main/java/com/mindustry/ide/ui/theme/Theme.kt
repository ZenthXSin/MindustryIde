package com.mindustry.ide.ui.theme

import android.os.Build
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = IdeaDarkPrimary,
    onPrimary = IdeaDarkOnPrimary,
    primaryContainer = IdeaDarkPrimary.copy(alpha = 0.2f),
    onPrimaryContainer = IdeaDarkPrimary,

    secondary = IdeaDarkSecondary,
    onSecondary = IdeaDarkOnSecondary,
    secondaryContainer = IdeaDarkSecondary.copy(alpha = 0.2f),
    onSecondaryContainer = IdeaDarkSecondary,

    tertiary = IdeaDarkTertiary,
    onTertiary = IdeaDarkOnTertiary,

    background = IdeaDarkBackground,
    onBackground = IdeaDarkOnBackground,

    surface = IdeaDarkSurface,
    onSurface = IdeaDarkOnSurface,
    surfaceVariant = IdeaDarkSurfaceVariant,
    onSurfaceVariant = IdeaDarkOnSurfaceVariant,

    error = IdeaDarkError,
    onError = Color.White,

    outline = IdeaDarkOutline,
    outlineVariant = IdeaDarkOutlineVariant,

    inverseSurface = IdeaDarkInverseSurface,
    inverseOnSurface = IdeaDarkInverseOnSurface,

    scrim = Color.Black,
)

@Composable
fun MindustryIdeTheme(
    darkTheme: Boolean = true,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val context = LocalContext.current
        dynamicDarkColorScheme(context)
    } else {
        DarkColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
