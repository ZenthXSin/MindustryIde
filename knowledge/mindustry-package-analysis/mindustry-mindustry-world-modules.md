# Package `mindustry.world.modules` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.modules`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.modules`
- 文件数：4

## 主要依赖线索

- `arc.util.io.*` × 4
- `arc.struct.*` × 3
- `arc.math.*` × 2
- `arc.util.*` × 2
- `mindustry.type.*` × 2
- `java.util.*` × 2
- `mindustry.world.blocks.power.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/modules/BlockModule.java`

- 知识页：[core-src-mindustry-world-modules-blockmodule-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-modules-blockmodule-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/modules/BlockModule.java`
- SHA1：`0c7386d270c93e004211def1b5b5db0fdc71eb35`
- 声明：class BlockModule
- 字段线索：未抽取
- 方法线索：read

### `core/src/mindustry/world/modules/ItemModule.java`

- 知识页：[core-src-mindustry-world-modules-itemmodule-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-modules-itemmodule-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/modules/ItemModule.java`
- SHA1：`3d2c989bfb3f849821cb60342197c0454c2d8544`
- 声明：class ItemModuleextends BlockModule, interface ItemConsumer, interface ItemCalculator
- 字段线索：empty, windowSize, cacheFlow, cacheSums, displayFlow, cacheBits
- 方法线索：copy, set, updateFlow, stopFlow, length, getFlowRate

### `core/src/mindustry/world/modules/LiquidModule.java`

- 知识页：[core-src-mindustry-world-modules-liquidmodule-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-modules-liquidmodule-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/modules/LiquidModule.java`
- SHA1：`67b2f01b0799ea275f5b68b510d1969a6a2f5d87`
- 声明：class LiquidModuleextends BlockModule, interface LiquidConsumer, interface LiquidCalculator
- 字段线索：windowSize, flowTimer, pollScl, cacheFlow, cacheSums, displayFlow
- 方法线索：updateFlow, stopFlow, getFlowRate, hasFlowLiquid, current, reset

### `core/src/mindustry/world/modules/PowerModule.java`

- 知识页：[core-src-mindustry-world-modules-powermodule-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-modules-powermodule-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/modules/PowerModule.java`
- SHA1：`a4679d9affe7246fe0926636b3b37a2664549074`
- 声明：class PowerModuleextends BlockModule
- 字段线索：status, init, graph, links
- 方法线索：write, read


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
