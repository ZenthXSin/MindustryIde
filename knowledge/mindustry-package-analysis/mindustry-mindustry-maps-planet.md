# Package `mindustry.maps.planet` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.maps.planet`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

网络包：负责客户端/服务端连接、包、同步与多人游戏状态。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.maps.planet`
- 文件数：4

## 主要依赖线索

- `arc.math.*` × 4
- `arc.math.geom.*` × 4
- `arc.util.*` × 4
- `arc.util.noise.*` × 4
- `mindustry.content.*` × 4
- `mindustry.game.*` × 4
- `mindustry.maps.generators.*` × 4
- `mindustry.type.*` × 3
- `mindustry.world.blocks.environment.*` × 3
- `arc.graphics.*` × 3
- `mindustry.world.*` × 3
- `mindustry.ai.*` × 2
- `mindustry.graphics.g3d.*` × 1
- `mindustry.world.meta.*` × 1
- `arc.*` × 1
- `arc.struct.*` × 1
- `mindustry.ai.BaseRegistry.*` × 1
- `mindustry.gen.*` × 1

## 文件逐个分析

### `core/src/mindustry/maps/planet/AsteroidGenerator.java`

- 知识页：[core-src-mindustry-maps-planet-asteroidgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-planet-asteroidgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/planet/AsteroidGenerator.java`
- SHA1：`251b637b5f4cc80eabe324ba55d2a3fbd0f51405`
- 声明：class AsteroidGeneratorextends BlankPlanetGenerator
- 字段线索：min, radMin, fmag, stoneChance, thoriumScl
- 方法线索：generate, getSectorSize

### `core/src/mindustry/maps/planet/ErekirPlanetGenerator.java`

- 知识页：[core-src-mindustry-maps-planet-erekirplanetgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-planet-erekirplanetgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/planet/ErekirPlanetGenerator.java`
- SHA1：`196f21cdcd2dc2467eb498c25f5d319c134c7778`
- 声明：class ErekirPlanetGeneratorextends PlanetGenerator
- 字段线索：heightScl, arkThresh, arkSeed, liqThresh, crystalSeed, crystalScl
- 方法线索：getHeight, getColor, getSizeScl, genTile, generate

### `core/src/mindustry/maps/planet/SerpuloPlanetGenerator.java`

- 知识页：[core-src-mindustry-maps-planet-serpuloplanetgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-planet-serpuloplanetgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/planet/SerpuloPlanetGenerator.java`
- SHA1：`ed998a43c14eb8729465c7a5e73ef05d72ec25a4`
- 声明：class SerpuloPlanetGeneratorextends PlanetGenerator, class Room
- 字段线索：indirectPaths, genLakes, metalDstScl
- 方法线索：onSectorCaptured, onSectorLost, beforeSaveWrite, isEmissive, allowNumberedLaunch, allowLanding

### `core/src/mindustry/maps/planet/TantrosPlanetGenerator.java`

- 知识页：[core-src-mindustry-maps-planet-tantrosplanetgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-planet-tantrosplanetgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/planet/TantrosPlanetGenerator.java`
- SHA1：`77c6638e08ea28f93c39427adc4da40ea26d9980`
- 声明：class TantrosPlanetGeneratorextends PlanetGenerator
- 字段线索：未抽取
- 方法线索：getHeight, getColor, getSizeScl, addWeather, genTile, generate


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
