# Package `mindustry.maps` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.maps`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.maps`
- 文件数：6

## 主要依赖线索

- `arc.struct.*` × 5
- `arc.util.*` × 4
- `mindustry.content.*` × 4
- `arc.*` × 3
- `arc.files.*` × 3
- `arc.graphics.*` × 3
- `mindustry.*` × 3
- `mindustry.game.EventType.*` × 3
- `mindustry.game.*` × 2
- `mindustry.io.*` × 2
- `mindustry.type.*` × 2
- `arc.assets.*` × 2
- `arc.assets.loaders.*` × 2
- `arc.func.*` × 2
- `mindustry.core.*` × 2
- `mindustry.maps.filters.*` × 1
- `mindustry.mod.Mods.*` × 1
- `mindustry.world.meta.*` × 1
- `mindustry.ctype.*` × 1
- `java.lang.reflect.*` × 1

## 文件逐个分析

### `core/src/mindustry/maps/Map.java`

- 知识页：[core-src-mindustry-maps-map-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-map-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/Map.java`
- SHA1：`2ef8eb54b60fcf14ebf21680ae765481d394b724`
- 声明：class Mapimplements Comparable<Map>, Publishable
- 字段线索：custom, tags, file, version, workshop, height
- 方法线索：getHightScore, safeTexture, previewFile, cacheFile, setHighScore, applyRules

### `core/src/mindustry/maps/MapException.java`

- 知识页：[core-src-mindustry-maps-mapexception-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-mapexception-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/MapException.java`
- SHA1：`880db605d5b879ac7fbcd0f2a031ab445cac20cc`
- 声明：class MapExceptionextends RuntimeException
- 字段线索：map
- 方法线索：未抽取

### `core/src/mindustry/maps/MapPreviewLoader.java`

- 知识页：[core-src-mindustry-maps-mappreviewloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-mappreviewloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/MapPreviewLoader.java`
- SHA1：`da1c18fba770e37ec71e22b793387d137af992d3`
- 声明：class MapPreviewLoaderextends TextureLoader, class MapPreviewParameterextends TextureParameter
- 字段线索：map, check
- 方法线索：loadAsync, loadSync, Texture, getDependencies

### `core/src/mindustry/maps/Maps.java`

- 知识页：[core-src-mindustry-maps-maps-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-maps-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/Maps.java`
- SHA1：`9c3fcdb84c761d074e6089617e7a670a4957fa4e`
- 声明：class Maps, interface MapProvider, enum ShuffleModeimplements MapProvider
- 字段线索：allFilterTypes, defaultMapNames, pvpMaps, useDefaultFolder, maps, shuffleMode
- 方法线索：getShuffleMode, setShuffleMode, setMapProvider, setNextMapOverride, all, customMaps

### `core/src/mindustry/maps/SectorDamage.java`

- 知识页：[core-src-mindustry-maps-sectordamage-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-sectordamage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/SectorDamage.java`
- SHA1：`9e7092802b1814df498746f73349f320e4ad8bb5`
- 声明：class SectorDamage
- 字段线索：rubble
- 方法线索：cost

### `core/src/mindustry/maps/SectorSubmissions.java`

- 知识页：[core-src-mindustry-maps-sectorsubmissions-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-sectorsubmissions-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/SectorSubmissions.java`
- SHA1：`b8c2bf21bcbaf6e06aca9a26c39d8d757bf8bfff`
- 声明：class SectorSubmissions, class MapSubmission
- 字段线索：threadMap, author, threadLink, mapFileLink
- 方法线索：registerSerpuloSector, registerThread


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
