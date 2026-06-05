# Package `arc.flabel.effects` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.flabel.effects`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.flabel.effects`
- 文件数：10

## 主要依赖线索

- `arc.flabel.*` × 10
- `arc.util.*` × 10
- `arc.math.*` × 5
- `arc.graphics.*` × 3
- `arc.struct.*` × 2
- `arc.struct.IntFloatMap` × 1
- `arc.math.Mathf` × 1
- `arc.graphics.Color` × 1
- `arc.struct.FloatSeq` × 1
- `arc.util.noise.Simplex` × 1

## 文件逐个分析

### `extensions/flabel/src/arc/flabel/effects/BlinkEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-blinkeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-blinkeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/BlinkEffect.java`
- SHA1：`fe70b71b25a0e1f5df6cfc4090fa713ca27fb2de`
- 声明：class BlinkEffectextends FEffect
- 字段线索：defaultFrequency, color1, color2, frequency, threshold
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/EaseEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-easeeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-easeeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/EaseEffect.java`
- SHA1：`b5f781dd102de8a258fe5dbf0cc9603d36579cce`
- 声明：class EaseEffectextends FEffect
- 字段线索：defaultDistance, defaultIntensity, distance, intensity, elastic, timePassedByGlyphIndex
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/FadeEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-fadeeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-fadeeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/FadeEffect.java`
- SHA1：`73422211e391269bcc8296e8dffe5720961c122f`
- 声明：class FadeEffectextends FEffect
- 字段线索：color1, color2, alpha1, alpha2, fadeDuration, timePassedByGlyphIndex
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/GradientEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-gradienteffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-gradienteffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/GradientEffect.java`
- SHA1：`1eb40201faf877ee02898e7fe5c37ec926f24e87`
- 声明：class GradientEffectextends FEffect
- 字段线索：defaultDistance, defaultFrequency, color1, color2, distance, frequency
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/JumpEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-jumpeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-jumpeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/JumpEffect.java`
- SHA1：`5f291152d87496b8adfb7dcd22a12678c85022b8`
- 声明：class JumpEffectextends FEffect
- 字段线索：defaultFrequency, distance, frequency, intensity
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/RainbowEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-rainboweffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-rainboweffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/RainbowEffect.java`
- SHA1：`235bab778afcaa86ac746d174a0da97f3408e906`
- 声明：class RainbowEffectextends FEffect
- 字段线索：defaultDistance, distance, frequency, saturation, brightness
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/ShakeEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-shakeeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-shakeeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/ShakeEffect.java`
- SHA1：`53048af7a7fe6632e4dcefc0876148046d116d78`
- 声明：class ShakeEffectextends FEffect
- 字段线索：defaultDistance, lastOffsets, distance, intensity
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/SickEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-sickeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-sickeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/SickEffect.java`
- SHA1：`841805b60c294f23675db8fdc21e02af1326bc0d`
- 声明：class SickEffectextends FEffect
- 字段线索：defaultFrequency, distance, intensity, indices
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/WaveEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-waveeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-waveeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/WaveEffect.java`
- SHA1：`9083f99ad5d8fef3dcf74450ec5b11dda4d37b94`
- 声明：class WaveEffectextends FEffect
- 字段线索：defaultFrequency, distance, frequency, intensity
- 方法线索：applyParams, onApply

### `extensions/flabel/src/arc/flabel/effects/WindEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-effects-windeffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-effects-windeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/effects/WindEffect.java`
- SHA1：`b47a4ac2a90d28797608fa5fcec0caec73ee9252`
- 声明：class WindEffectextends FEffect
- 字段线索：defaultSpacing, noiseCursorX, noiseCursorY, distanceX, distanceY, spacing
- 方法线索：applyParams, update, onApply


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
