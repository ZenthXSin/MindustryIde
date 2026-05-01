package com.mindustry.ide.ui.theme

import androidx.compose.ui.graphics.Color

// ========== Mindustry Pal 调色板 ==========
// 来源: mindustry/graphics/Pal.java
// https://github.com/Anuken/Mindustry

// --- 核心 UI 颜色 ---
val MindustryAccent = Color(0xFFFFD37F)           // 金色 - 主强调色 (Pal.accent)
val MindustryAccentBack = Color(0xFFD4816B)       // 强调背景色
val MindustryStat = Color(0xFFFFD37F)             // 正向统计色
val MindustryNegativeStat = Color(0xFFE55454)    // 负向/错误/删除色
val MindustryPlace = Color(0xFF6335F8)            // 放置色（紫蓝）
val MindustryRemove = Color(0xFFE55454)            // 删除/危险色

// --- 灰度系 (面板/背景) ---
val MindustryGray = Color(0xFF454545)              // UI 灰色
val MindustryLightishGray = Color(0xFFA2A2A2)
val MindustryDarkishGray = Color(0xFF4D4D4D)      // RGB 0.3
val MindustryDarkerGray = Color(0xFF333333)        // RGB 0.2
val MindustryDarkestGray = Color(0xFF1A1A1A)      // RGB 0.1
val MindustryDarkestestGray = Color(0xFF0D0D0D)   // RGB 0.05
val MindustryShadow = Color(0x38000000)            // 黑色22%透明

// --- 金属/材质系 ---
val MindustryDarkMetal = Color(0xFF6E7080)
val MindustryDarkerMetal = Color(0xFF565666)
val MindustryDarkestMetal = Color(0xFF38393F)
val MindustryCoalBlack = Color(0xFF272727)

// --- 文字色 ---
val MindustryText = Color(0xFFFFFFFF)              // 主文字白
val MindustryTextSecondary = Color(0xFFCCCCCC)     // 次级文字
val MindustryTextDim = Color(0xFF888888)           // 暗淡文字

// --- 边框/轮廓 ---
val MindustryDarkOutline = Color(0xFF2D2F39)
val MindustryBorder = Color(0xFF4E5157)           // 边框色

// --- 游戏功能色 ---
val MindustryHealth = Color(0xFFFF341C)           // 血量红
val MindustryHeal = Color(0xFF98FFA9)             // 治疗绿
val MindustryItems = Color(0xFF2EA756)            // 物品绿
val MindustryCommand = Color(0xFFEAB678)          // 指令金
val MindustryPower = Color(0xFFFBAD67)            // 能源橙
val MindustryWater = Color(0xFF596AB8)            // 水蓝
val MindustryTechBlue = Color(0xFF8CA9E8)         // 科技蓝
val MindustrySpore = Color(0xFF7457CE)            // 孢子紫
val MindustryReactorPurple = Color(0xFFBF92F9)   // 反应堆紫

// --- Material3 映射 (暗主题) ==========
// 将 Mindustry 风格映射到 M3 colorScheme slot

// 背景: 最深灰 → 最暗面板
val IdeaDarkBackground = MindustryDarkestestGray     // #0D0D0D
// 表面: UI 灰色
val IdeaDarkSurface = MindustryDarkestGray           // #1A1A1A
// 表面变体 (卡片等)
val IdeaDarkSurfaceVariant = MindustryDarkerGray     // #333333

// 主色: 金色强调
val IdeaDarkPrimary = MindustryAccent                // #FFD37F
// 主色容器上文字
val IdeaDarkOnPrimary = Color.Black                 // 金底黑字

// 辅助色: 放置紫蓝
val IdeaDarkSecondary = MindustryPlace               // #6335F8
val IdeaDarkOnSecondary = Color.White

// 第三色: 科技蓝
val IdeaDarkTertiary = MindustryTechBlue            // #8CA9E8
val IdeaDarkOnTertiary = Color.White

// 背景上的文字
val IdeaDarkOnBackground = MindustryLightishGray     // #A2A2A2
// 表面上的文字
val IdeaDarkOnSurface = MindustryText                // 白色
// 表面变体上的文字
val IdeaDarkOnSurfaceVariant = MindustryTextSecondary

// 错误/删除色
val IdeaDarkError = MindustryNegativeStat            // #E55454

// 边框/分割线
val IdeaDarkOutline = MindustryBorder                // #4E5157
val IdeaDarkOutlineVariant = MindustryDarkOutline    // #2D2F39

// 反向表面色 (用于 elevated 组件)
val IdeaDarkInverseSurface = MindustryGray          // #454545
val IdeaDarkInverseOnSurface = Color.Black
