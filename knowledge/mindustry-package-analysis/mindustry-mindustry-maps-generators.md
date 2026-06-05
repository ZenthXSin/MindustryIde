# Package `mindustry.maps.generators` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.maps.generators`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.maps.generators`
- 文件数：6

## 主要依赖线索

- `mindustry.world.*` × 6
- `mindustry.game.*` × 5
- `arc.math.geom.*` × 4
- `arc.struct.*` × 4
- `mindustry.content.*` × 4
- `mindustry.type.*` × 4
- `arc.util.*` × 3
- `arc.func.*` × 2
- `arc.math.*` × 2
- `mindustry.ai.*` × 2
- `mindustry.gen.*` × 2
- `mindustry.*` × 2
- `mindustry.ai.BaseRegistry.*` × 1
- `mindustry.game.Schematic.*` × 1
- `mindustry.world.blocks.defense.*` × 1
- `mindustry.world.blocks.payloads.*` × 1
- `mindustry.world.blocks.power.*` × 1
- `mindustry.world.blocks.production.*` × 1
- `mindustry.world.meta.*` × 1
- `mindustry.ai.Astar.*` × 1

## 文件逐个分析

### `core/src/mindustry/maps/generators/BaseGenerator.java`

- 知识页：[core-src-mindustry-maps-generators-basegenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-generators-basegenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/generators/BaseGenerator.java`
- SHA1：`4a2c0a73750dfa0b20896881db642c1d244f39f3`
- 声明：class BaseGenerator
- 字段线索：axis, range, insanity, tiles, cores
- 方法线索：generate, postGenerate, set, isTaken, overlaps

### `core/src/mindustry/maps/generators/BasicGenerator.java`

- 知识页：[core-src-mindustry-maps-generators-basicgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-generators-basicgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/generators/BasicGenerator.java`
- SHA1：`35559274d29b7ef175f1fa4104410aa7c5e46bb6`
- 声明：class BasicGeneratorimplements WorldGenerator
- 字段线索：ints1, rand, height, tiles, ore, defaultLoadout
- 方法线索：generate, median, ores, ore, oreAround, wallOre

### `core/src/mindustry/maps/generators/BlankPlanetGenerator.java`

- 知识页：[core-src-mindustry-maps-generators-blankplanetgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-generators-blankplanetgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/generators/BlankPlanetGenerator.java`
- SHA1：`b41c65395fbb9d536a4d280aef36f579f8c807a0`
- 声明：class BlankPlanetGeneratorextends PlanetGenerator
- 字段线索：未抽取
- 方法线索：addWeather, generate

### `core/src/mindustry/maps/generators/FileMapGenerator.java`

- 知识页：[core-src-mindustry-maps-generators-filemapgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-generators-filemapgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/generators/FileMapGenerator.java`
- SHA1：`861ed082fd24fb112bed1af9fe6be7bfae71d076`
- 声明：class FileMapGeneratorimplements WorldGenerator
- 字段线索：map, preset
- 方法线索：generate, getSector, end, isMap, IllegalArgumentException

### `core/src/mindustry/maps/generators/PlanetGenerator.java`

- 知识页：[core-src-mindustry-maps-generators-planetgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-generators-planetgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/generators/PlanetGenerator.java`
- SHA1：`a6f0324aa632bb76591a2c5eb5b37921beb263c7`
- 声明：class PlanetGeneratorextends BasicGenerator implements HexMesher
- 字段线索：tmpItems, baseSeed, seed, sector
- 方法线索：generateSector, onSectorCaptured, onSectorLost, beforeSaveWrite, getLockedText, allowLanding

### `core/src/mindustry/maps/generators/WorldGenerator.java`

- 知识页：[core-src-mindustry-maps-generators-worldgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-generators-worldgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/generators/WorldGenerator.java`
- SHA1：`0e6c9c3e967bed865ffbdf805cfd46718a4ef0fb`
- 声明：interface WorldGenerator
- 字段线索：未抽取
- 方法线索：postGenerate


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
