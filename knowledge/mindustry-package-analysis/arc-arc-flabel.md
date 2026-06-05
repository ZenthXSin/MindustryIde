# Package `arc.flabel` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.flabel`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.flabel`
- 文件数：6

## 主要依赖线索

- `arc.struct.*` × 3
- `arc.func.*` × 2
- `arc.graphics.Color` × 2
- `arc.math.*` × 2
- `arc.util.*` × 2
- `arc.flabel.effects.*` × 1
- `arc.graphics.g2d.Font.Glyph` × 1
- `arc.graphics.g2d.GlyphLayout.GlyphRun` × 1
- `arc.util.pooling.Pool.Poolable` × 1
- `arc.graphics.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.graphics.g2d.Font.*` × 1
- `arc.graphics.g2d.GlyphLayout.*` × 1
- `arc.scene.style.*` × 1
- `arc.scene.ui.*` × 1
- `arc.util.pooling.*` × 1
- `java.util.regex.*` × 1

## 文件逐个分析

### `extensions/flabel/src/arc/flabel/FConfig.java`

- 知识页：[extensions-flabel-src-arc-flabel-fconfig-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-fconfig-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/FConfig.java`
- SHA1：`c8a568911118241babe12daf0284ae15aba61736`
- 声明：class FConfig
- 字段线索：forceColorMarkupByDefault, defaultWaitValue, defaultSpeedPerChar, charLimitPerFrame, defaultClearColor, intervalMultipliersByChar
- 方法线索：未抽取

### `extensions/flabel/src/arc/flabel/FEffect.java`

- 知识页：[extensions-flabel-src-arc-flabel-feffect-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-feffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/FEffect.java`
- SHA1：`352e9f12650f955fc4e7f257dfac456c55dfd06c`
- 声明：class FEffect
- 字段线索：fadeoutSplit, indexStart, indexEnd, duration, endToken, totalTime
- 方法线索：applyParams, update, isFinished, calculateFadeout, calculateProgress, getLineHeight

### `extensions/flabel/src/arc/flabel/FGlyph.java`

- 知识页：[extensions-flabel-src-arc-flabel-fglyph-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-fglyph-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/FGlyph.java`
- SHA1：`6317edcf138271e8a0cf8395e16dd360eb7c2c14`
- 声明：class FGlyphextends Glyph implements Poolable
- 字段线索：run, color
- 方法线索：set, reset

### `extensions/flabel/src/arc/flabel/FLabel.java`

- 知识页：[extensions-flabel-src-arc-flabel-flabel-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-flabel-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/FLabel.java`
- SHA1：`7f42dd8027f9e539b501e223642e97d05ee49b4f`
- 声明：class FLabelextends Label
- 字段线索：variables, tokenEntries, clearColor, listener, originalText, glyphCache
- 方法线索：setText, getOriginalText, saveOriginalText, restoreOriginalText, getTypingListener, setTypingListener

### `extensions/flabel/src/arc/flabel/FListener.java`

- 知识页：[extensions-flabel-src-arc-flabel-flistener-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-flistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/FListener.java`
- SHA1：`dd18e5d18fdfb99b5051f18743f53e8f6a74bd42`
- 声明：interface FListener
- 字段线索：未抽取
- 方法线索：event, end, replaceVariable, onChar

### `extensions/flabel/src/arc/flabel/FParser.java`

- 知识页：[extensions-flabel-src-arc-flabel-fparser-java.md](../mindustry-source-files/arc/extensions-flabel-src-arc-flabel-fparser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/flabel/src/arc/flabel/FParser.java`
- SHA1：`bfc80caf657d01de03ef9a80e11066e8e059e2fb`
- 声明：class FParser, interface TokenHandler, enum InternalToken
- 字段线索：resetReplacement, parameterParser, name, category, all
- 方法线索：parseTokens, toString, fromName, compareTo


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
