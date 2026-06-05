# Package `mindustry.io` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.io`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.io`
- 文件数：8

## 主要依赖线索

- `arc.struct.*` × 6
- `mindustry.game.*` × 5
- `mindustry.world.*` × 5
- `arc.util.io.*` × 5
- `arc.util.*` × 4
- `java.io.*` × 4
- `arc.graphics.*` × 3
- `arc.math.geom.*` × 3
- `mindustry.*` × 3
- `mindustry.content.*` × 3
- `mindustry.ctype.*` × 3
- `mindustry.maps.*` × 3
- `arc.files.*` × 3
- `arc.*` × 3
- `mindustry.type.*` × 2
- `mindustry.core.*` × 2
- `java.util.zip.*` × 2
- `mindustry.game.EventType.*` × 2
- `mindustry.content.TechTree.*` × 2
- `mindustry.entities.*` × 2

## 文件逐个分析

### `core/src/mindustry/io/JsonIO.java`

- 知识页：[core-src-mindustry-io-jsonio-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-jsonio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/JsonIO.java`
- SHA1：`b5064b7238b11372dafca27d88fc37573a2bd0d1`
- 声明：class JsonIO, class CustomJsonextends Json
- 字段线索：jsonBase, json, baseObject
- 方法线索：writeValue, RuntimeException, convertToString, SerializationException, apply, write

### `core/src/mindustry/io/MapIO.java`

- 知识页：[core-src-mindustry-io-mapio-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-mapio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/MapIO.java`
- SHA1：`7ae87911060c8e25e329d91132d9af4a18b6f6e0`
- 声明：class MapIO
- 字段线索：pngHeader
- 方法线索：Map, IOException, setBlock, isGenerating, begin, end

### `core/src/mindustry/io/SaveFileReader.java`

- 知识页：[core-src-mindustry-io-savefilereader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-savefilereader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/SaveFileReader.java`
- SHA1：`d184d1002289d7ddd59cd59ccec4e38558c4383d`
- 声明：class SaveFileReader, interface IORunner<T>, interface IORunnerLength<T>
- 字段线索：fallback, modContentNameMap, byteOutput, dataBytes, writes1, chunkReads
- 方法线索：readRegion, IOException, writeRegion, writeChunk, readChunk, readChunkReads

### `core/src/mindustry/io/SaveIO.java`

- 知识页：[core-src-mindustry-io-saveio-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-saveio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/SaveIO.java`
- SHA1：`59667a3165f45ba8be40d6367a5dfbae0befb430`
- 声明：class SaveIO, class SaveExceptionextends RuntimeException
- 字段线索：header, versions, versionArray
- 方法线索：RuntimeException, DataInputStream, SaveException, IOException

### `core/src/mindustry/io/SaveMeta.java`

- 知识页：[core-src-mindustry-io-savemeta-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-savemeta-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/SaveMeta.java`
- SHA1：`8d8152b59af8038e7fdee725612765c8378c8817`
- 声明：class SaveMeta
- 字段线索：version, build, timestamp, timePlayed, map, wave
- 方法线索：未抽取

### `core/src/mindustry/io/SavePreviewLoader.java`

- 知识页：[core-src-mindustry-io-savepreviewloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-savepreviewloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/SavePreviewLoader.java`
- SHA1：`fef2770ae0adf5e5b7bd2331a5a3a8ee52ac3f4a`
- 声明：class SavePreviewLoaderextends TextureLoader
- 字段线索：未抽取
- 方法线索：loadAsync

### `core/src/mindustry/io/SaveVersion.java`

- 知识页：[core-src-mindustry-io-saveversion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-saveversion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/SaveVersion.java`
- SHA1：`9cdef6cfbae195bda394fac1fccfef767b237bbf`
- 声明：class SaveVersionextends SaveFileReader
- 字段线索：customChunks, version
- 方法线索：getMeta, SaveMeta, read, write, writeCustomChunks, readCustomChunks

### `core/src/mindustry/io/TypeIO.java`

- 知识页：[core-src-mindustry-io-typeio-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-typeio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/TypeIO.java`
- SHA1：`b608ee3aca8c5e076ac362c16f437a11ae51eb91`
- 声明：class TypeIO, class ClientBuildPlansextends Seq<BuildPlan>, interface ContentMapper
- 字段线索：maxArraySize, noMounts, noAbilities, pos, id
- 方法线索：IllegalArgumentException, validClientPlanConfig, Vec2, ItemStack, Color, String


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
