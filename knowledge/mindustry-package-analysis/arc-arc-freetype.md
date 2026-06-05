# Package `arc.freetype` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.freetype`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`arc`
- Package：`arc.freetype`
- 文件数：4

## 主要依赖线索

- `arc.files.*` × 2
- `arc.graphics.*` × 2
- `arc.struct.*` × 2
- `arc.util.*` × 2
- `java.nio.*` × 2
- `arc.assets.AssetDescriptor` × 2
- `arc.assets.AssetLoaderParameters` × 2
- `arc.assets.AssetManager` × 2
- `arc.assets.loaders.FileHandleResolver` × 2
- `arc.struct.Seq` × 2
- `arc.files.Fi` × 2
- `arc.*` × 1
- `arc.freetype.FreeType.*` × 1
- `arc.func.*` × 1
- `arc.graphics.Texture.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.graphics.g2d.Font.Glyph` × 1
- `arc.graphics.g2d.Font.*` × 1
- `arc.graphics.g2d.GlyphLayout.*` × 1
- `arc.graphics.g2d.PixmapPacker.*` × 1

## 文件逐个分析

### `extensions/freetype/src/arc/freetype/FreeType.java`

- 知识页：[extensions-freetype-src-arc-freetype-freetype-java.md](../mindustry-source-files/arc/extensions-freetype-src-arc-freetype-freetype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreeType.java`
- SHA1：`eb06db486de1d52697ec9fed55da96eb0f1d8d7e`
- 声明：class FreeType, class Pointer, class Libraryextends Pointer implements Disposable
- 字段线索：lastError, FT_PIXEL_MODE_NONE, FT_PIXEL_MODE_MONO, FT_PIXEL_MODE_GRAY, FT_PIXEL_MODE_GRAY2, FT_PIXEL_MODE_GRAY4
- 方法线索：dispose, newFace, newMemoryFace, ArcRuntimeException, Face, createStroker

### `extensions/freetype/src/arc/freetype/FreeTypeFontGenerator.java`

- 知识页：[extensions-freetype-src-arc-freetype-freetypefontgenerator-java.md](../mindustry-source-files/arc/extensions-freetype-src-arc-freetype-freetypefontgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreeTypeFontGenerator.java`
- SHA1：`0fd912688c5c3d5eeca2ece5e832d291943d4320`
- 声明：class FreeTypeFontGeneratorimplements Disposable, enum Hinting, class FreeTypeFontDataextends FontData implements Disposable
- 字段线索：DEFAULT_CHARS, NO_MAXIMUM, maxTextureSize, library, face, name
- 方法线索：ArcRuntimeException, getLoadingFlags, loadChar, checkForBitmapFont, generateFont, scaleForPixelHeight

### `extensions/freetype/src/arc/freetype/FreeTypeFontGeneratorLoader.java`

- 知识页：[extensions-freetype-src-arc-freetype-freetypefontgeneratorloader-java.md](../mindustry-source-files/arc/extensions-freetype-src-arc-freetype-freetypefontgeneratorloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreeTypeFontGeneratorLoader.java`
- SHA1：`4c171bca9f97078926e14770d19be29c8bea94fc`
- 声明：class FreeTypeFontGeneratorLoaderextends SynchronousAssetLoader<FreeTypeFontGenerator, FreeTypeFontGeneratorLoader.FreeTypeFontGeneratorParameters>, class FreeTypeFontGeneratorParametersextends AssetLoaderParameters<FreeTypeFontGenerator>
- 字段线索：未抽取
- 方法线索：load, getDependencies

### `extensions/freetype/src/arc/freetype/FreetypeFontLoader.java`

- 知识页：[extensions-freetype-src-arc-freetype-freetypefontloader-java.md](../mindustry-source-files/arc/extensions-freetype-src-arc-freetype-freetypefontloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/freetype/src/arc/freetype/FreetypeFontLoader.java`
- SHA1：`cfadb4964b416b514da3803bcdfec2909d95acea`
- 声明：class FreetypeFontLoaderextends AsynchronousAssetLoader<Font, FreetypeFontLoader.FreeTypeFontLoaderParameter>, class FreeTypeFontLoaderParameterextends AssetLoaderParameters<Font>
- 字段线索：fontFileName, fontParameters
- 方法线索：loadAsync, RuntimeException, loadSync, getDependencies


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
