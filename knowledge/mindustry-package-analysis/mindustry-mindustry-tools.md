# Package `mindustry.tools` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.tools`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.tools`
- 文件数：5

## 主要依赖线索

- `arc.files.*` × 5
- `arc.graphics.*` × 5
- `arc.struct.*` × 5
- `arc.util.*` × 4
- `arc.*` × 3
- `arc.graphics.g2d.*` × 3
- `arc.math.geom.*` × 3
- `arc.math.*` × 2
- `mindustry.ctype.*` × 2
- `mindustry.game.*` × 2
- `mindustry.gen.*` × 2
- `mindustry.type.*` × 2
- `mindustry.world.*` × 2
- `mindustry.world.blocks.*` × 2
- `arc.graphics.g2d.TextureAtlas.*` × 2
- `java.io.*` × 2
- `arc.func.*` × 1
- `arc.util.noise.*` × 1
- `mindustry.entities.part.*` × 1
- `mindustry.graphics.*` × 1

## 文件逐个分析

### `tools/src/mindustry/tools/Generators.java`

- 知识页：[tools-src-mindustry-tools-generators-java.md](../mindustry-source-files/mindustry/tools-src-mindustry-tools-generators-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tools/src/mindustry/tools/Generators.java`
- SHA1：`ea85c27e1617ea49a67d471a5fd8aa8c3966012d`
- 声明：class Generators, class ScorchGenerator
- 字段线索：maxUiIcon, size, scale
- 方法线索：add, generate, noise

### `tools/src/mindustry/tools/IconConverter.java`

- 知识页：[tools-src-mindustry-tools-iconconverter-java.md](../mindustry-source-files/mindustry/tools-src-mindustry-tools-iconconverter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tools/src/mindustry/tools/IconConverter.java`
- SHA1：`8b83a65c33450583363bfb93041b36977489e8be`
- 声明：class IconConverter
- 字段线索：未抽取
- 方法线索：未抽取

### `tools/src/mindustry/tools/ImagePacker.java`

- 知识页：[tools-src-mindustry-tools-imagepacker-java.md](../mindustry-source-files/mindustry/tools-src-mindustry-tools-imagepacker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tools/src/mindustry/tools/ImagePacker.java`
- SHA1：`c779b2a209ef9cf6e0adfc1a01188965f21541ee`
- 声明：class ImagePacker, class GenRegionextends AtlasRegion, class PackIndex
- 字段线索：cache
- 方法线索：find, getPixmap, PixmapRegion, has, fixSubdirectory, texname

### `tools/src/mindustry/tools/ImageTileGenerator.java`

- 知识页：[tools-src-mindustry-tools-imagetilegenerator-java.md](../mindustry-source-files/mindustry/tools-src-mindustry-tools-imagetilegenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tools/src/mindustry/tools/ImageTileGenerator.java`
- SHA1：`a8319b6e176be9498503bea75c4839b64c189d3f`
- 声明：class ImageTileGenerator
- 字段线索：layoutWidth, layout
- 方法线索：未抽取

### `tools/src/mindustry/tools/ScriptMainGenerator.java`

- 知识页：[tools-src-mindustry-tools-scriptmaingenerator-java.md](../mindustry-source-files/mindustry/tools-src-mindustry-tools-scriptmaingenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tools/src/mindustry/tools/ScriptMainGenerator.java`
- SHA1：`4c12619d95f12a9e497ba477cb51a1e20e76aed4`
- 声明：class ScriptMainGenerator
- 字段线索：loader
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
