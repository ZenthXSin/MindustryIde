# Package `arc.packer` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.packer`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.packer`
- 文件数：7

## 主要依赖线索

- `arc.struct.*` × 6
- `java.io.*` × 5
- `arc.util.*` × 4
- `java.util.*` × 4
- `arc.packer.TexturePacker.*` × 4
- `arc.files.*` × 3
- `arc.graphics.*` × 3
- `java.util.regex.*` × 2
- `arc.math.*` × 2
- `arc.graphics.g2d.TextureAtlas.*` × 2
- `arc.util.serialization.*` × 2
- `java.math.*` × 1
- `java.security.*` × 1
- `arc.graphics.Texture.*` × 1
- `arc.util.io.*` × 1
- `arc.graphics.g2d.TextureAtlas.TextureAtlasData.*` × 1

## 文件逐个分析

### `extensions/packer/src/arc/packer/FileProcessor.java`

- 知识页：[extensions-packer-src-arc-packer-fileprocessor-java.md](../mindustry-source-files/arc/extensions-packer-src-arc-packer-fileprocessor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/FileProcessor.java`
- SHA1：`20bea492331fa06f05d9fbd5224650fe90c97e8d`
- 声明：class FileProcessor, class Entry
- 字段线索：inputFile, outputDir, outputFile, depth
- 方法线索：setInputFilter, setComparator, addInputSuffix, addInputRegex, setOutputSuffix, setFlattenOutput

### `extensions/packer/src/arc/packer/GridPacker.java`

- 知识页：[extensions-packer-src-arc-packer-gridpacker-java.md](../mindustry-source-files/arc/extensions-packer-src-arc-packer-gridpacker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/GridPacker.java`
- SHA1：`63a11db532c55de1c11dd31c44e2787293a1de66`
- 声明：class GridPackerimplements Packer
- 字段线索：settings
- 方法线索：pack, packPage

### `extensions/packer/src/arc/packer/ImageProcessor.java`

- 知识页：[extensions-packer-src-arc-packer-imageprocessor-java.md](../mindustry-source-files/arc/extensions-packer-src-arc-packer-imageprocessor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/ImageProcessor.java`
- SHA1：`87310665252d732708f7633e1e0f6b1f5069753d`
- 声明：class ImageProcessor
- 字段线索：emptyImage, settings, crcs, rects, scale, resampling
- 方法线索：addImage, setScale, setResampling, getImages, clear, stripWhitespace

### `extensions/packer/src/arc/packer/MaxRectsPacker.java`

- 知识页：[extensions-packer-src-arc-packer-maxrectspacker-java.md](../mindustry-source-files/arc/extensions-packer-src-arc-packer-maxrectspacker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/MaxRectsPacker.java`
- SHA1：`cf1b64f2668319fd10de71f16508df6447b2376c`
- 声明：class MaxRectsPackerimplements Packer, class BinarySearch, class MaxRects
- 字段线索：settings, methods, maxRects, sort, rectComparator, mod4
- 方法线索：compare, RuntimeException, pack, packPage, packAtSize, getBest

### `extensions/packer/src/arc/packer/TexturePacker.java`

- 知识页：[extensions-packer-src-arc-packer-texturepacker-java.md](../mindustry-source-files/arc/extensions-packer-src-arc-packer-texturepacker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/TexturePacker.java`
- SHA1：`244bc1698a6b8931b561c6f941afea22d4560d9e`
- 声明：class TexturePacker, class Page, class Aliasimplements Comparable<Alias>
- 字段线索：settings, packer, imageProcessor, inputImages, imageName, remainingRects
- 方法线索：RuntimeException, setRootDir, addImage, pack, writeImages, writePackFile

### `extensions/packer/src/arc/packer/TexturePackerFileProcessor.java`

- 知识页：[extensions-packer-src-arc-packer-texturepackerfileprocessor-java.md](../mindustry-source-files/arc/extensions-packer-src-arc-packer-texturepackerfileprocessor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/TexturePackerFileProcessor.java`
- SHA1：`2afeca704cc34d20e978a1f566869c68b7eacbcc`
- 声明：class TexturePackerFileProcessorextends FileProcessor
- 字段线索：defaultSettings, dirToSettings, json, packFileName, root, settingsFiles
- 方法线索：process, processFile, ArcRuntimeException, deleteOutput, processDir

### `extensions/packer/src/arc/packer/TextureUnpacker.java`

- 知识页：[extensions-packer-src-arc-packer-textureunpacker-java.md](../mindustry-source-files/arc/extensions-packer-src-arc-packer-textureunpacker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/TextureUnpacker.java`
- SHA1：`01d6dce34311f30226c1e8d95af96a44b454453d`
- 声明：class TextureUnpacker
- 字段线索：DEFAULT_OUTPUT_PATH, NINEPATCH_PADDING, HELP, ATLAS_FILE_EXTENSION
- 方法线索：parseArguments, checkDirectoryValidity, splitAtlas, extractImage, extractNinePatch


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
