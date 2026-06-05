# arc:extensions/freetype/src/arc/freetype/FreeType.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreeType.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`extensions/freetype/src/arc/freetype/FreeType.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreeType.java`
- SHA1：`eb06db486de1d52697ec9fed55da96eb0f1d8d7e`
- 大小：27790 bytes
- 行数：870

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class FreeType`。

关键词：arc

## Package

`arc.freetype`

## 类型声明

- `class FreeType`
- `class Pointer`
- `class Libraryextends Pointer implements Disposable`
- `class Faceextends Pointer implements Disposable`
- `class Sizeextends Pointer`
- `class SizeMetricsextends Pointer`
- `class GlyphSlotextends Pointer`
- `class Glyphextends Pointer implements Disposable`

## 字段线索

- `lastError`
- `FT_PIXEL_MODE_NONE`
- `FT_PIXEL_MODE_MONO`
- `FT_PIXEL_MODE_GRAY`
- `FT_PIXEL_MODE_GRAY2`
- `FT_PIXEL_MODE_GRAY4`
- `FT_PIXEL_MODE_LCD`
- `FT_PIXEL_MODE_LCD_V`
- `FT_ENCODING_NONE`
- `FT_ENCODING_MS_SYMBOL`
- `FT_ENCODING_UNICODE`
- `FT_ENCODING_SJIS`
- `FT_ENCODING_GB2312`
- `FT_ENCODING_BIG5`
- `FT_ENCODING_WANSUNG`
- `FT_ENCODING_JOHAB`
- `FT_ENCODING_ADOBE_STANDARD`
- `FT_ENCODING_ADOBE_EXPERT`
- `FT_ENCODING_ADOBE_CUSTOM`
- `FT_ENCODING_ADOBE_LATIN_1`

## 方法线索

- `dispose`
- `newFace`
- `newMemoryFace`
- `ArcRuntimeException`
- `Face`
- `createStroker`
- `Stroker`
- `getFaceFlags`
- `getStyleFlags`
- `getNumGlyphs`
- `getAscender`
- `getDescender`
- `getHeight`
- `getMaxAdvanceWidth`
- `getMaxAdvanceHeight`
- `getUnderlinePosition`
- `getUnderlineThickness`
- `selectSize`
- `setCharSize`
- `setPixelSizes`
- `loadGlyph`
- `loadChar`
- `getGlyph`
- `GlyphSlot`
- `getSize`
- `Size`
- `hasKerning`
- `getKerning`
- `getCharIndex`
- `getMetrics`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
