# arc:extensions/freetype/src/arc/freetype/FreeTypeFontGenerator.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreeTypeFontGenerator.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`extensions/freetype/src/arc/freetype/FreeTypeFontGenerator.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreeTypeFontGenerator.java`
- SHA1：`0fd912688c5c3d5eeca2ece5e832d291943d4320`
- 大小：37294 bytes
- 行数：867

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class FreeTypeFontGeneratorimplements Disposable`。

关键词：arc

## Package

`arc.freetype`

## 类型声明

- `class FreeTypeFontGeneratorimplements Disposable`
- `enum Hinting`
- `class FreeTypeFontDataextends FontData implements Disposable`
- `class FreeTypeFontParameter`
- `class GlyphAndBitmap`

## 字段线索

- `DEFAULT_CHARS`
- `NO_MAXIMUM`
- `maxTextureSize`
- `library`
- `face`
- `name`
- `ignoreDirty`
- `dirty`
- `size`
- `mono`
- `hinting`
- `color`
- `gamma`
- `renderCount`
- `borderWidth`
- `borderColor`
- `borderStraight`
- `borderGamma`
- `shadowOffsetX`
- `shadowOffsetY`

## 方法线索

- `ArcRuntimeException`
- `getLoadingFlags`
- `loadChar`
- `checkForBitmapFont`
- `generateFont`
- `scaleForPixelHeight`
- `scaleForPixelWidth`
- `scaleToFitSquare`
- `generateGlyphAndBitmap`
- `generateData`
- `dispose`
- `setOverride`
- `addFallback`
- `getGlyph`
- `getGlyphs`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
