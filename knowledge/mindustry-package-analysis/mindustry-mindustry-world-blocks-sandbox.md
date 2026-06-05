# Package `mindustry.world.blocks.sandbox` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.sandbox`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.sandbox`
- 文件数：6

## 主要依赖线索

- `mindustry.world.meta.*` × 6
- `mindustry.gen.*` × 4
- `mindustry.type.*` × 4
- `mindustry.world.*` × 4
- `arc.graphics.g2d.*` × 2
- `arc.scene.ui.layout.*` × 2
- `arc.util.*` × 2
- `arc.util.io.*` × 2
- `mindustry.entities.units.*` × 2
- `mindustry.world.blocks.*` × 2
- `mindustry.world.blocks.power.*` × 2
- `arc.*` × 1
- `mindustry.world.modules.*` × 1
- `mindustry.annotations.Annotations.*` × 1
- `mindustry.world.blocks.liquid.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/blocks/sandbox/ItemSource.java`

- 知识页：[core-src-mindustry-world-blocks-sandbox-itemsource-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-sandbox-itemsource-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/sandbox/ItemSource.java`
- SHA1：`6a4af1881d845d10ae53247a5ea6f7e139ecd2c1`
- 声明：class ItemSourceextends Block, class ItemSourceBuildextends Building
- 字段线索：itemsPerSecond, counter, outputItem
- 方法线索：setBars, setStats, icons, drawPlanConfig, outputsItems, draw

### `core/src/mindustry/world/blocks/sandbox/ItemVoid.java`

- 知识页：[core-src-mindustry-world-blocks-sandbox-itemvoid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-sandbox-itemvoid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/sandbox/ItemVoid.java`
- SHA1：`f96448e8de60bd4b919d0dee0db2b6c0ad1a5e1b`
- 声明：class ItemVoidextends Block, class ItemVoidBuildextends Building
- 字段线索：flowItems
- 方法线索：flowItems, handleItem, acceptItem

### `core/src/mindustry/world/blocks/sandbox/LiquidSource.java`

- 知识页：[core-src-mindustry-world-blocks-sandbox-liquidsource-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-sandbox-liquidsource-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/sandbox/LiquidSource.java`
- SHA1：`151b0bbe5984d4dcac59623a7a862aeaeace9268`
- 声明：class LiquidSourceextends Block, class LiquidSourceBuildextends Building
- 字段线索：source
- 方法线索：setBars, drawPlanConfig, icons, updateTile, draw, drawSelect

### `core/src/mindustry/world/blocks/sandbox/LiquidVoid.java`

- 知识页：[core-src-mindustry-world-blocks-sandbox-liquidvoid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-sandbox-liquidvoid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/sandbox/LiquidVoid.java`
- SHA1：`5f84043a32f2f5825409c39e133ebcb7cf00aec7`
- 声明：class LiquidVoidextends Block, class LiquidVoidBuildextends Building
- 字段线索：未抽取
- 方法线索：setBars, placed, acceptLiquid, handleLiquid

### `core/src/mindustry/world/blocks/sandbox/PowerSource.java`

- 知识页：[core-src-mindustry-world-blocks-sandbox-powersource-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-sandbox-powersource-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/sandbox/PowerSource.java`
- SHA1：`3051368170e802195bd6bd79feaa3c17c1c704a1`
- 声明：class PowerSourceextends PowerNode, class PowerSourceBuildextends PowerNodeBuild
- 字段线索：powerProduction
- 方法线索：onProximityUpdate, getPowerProduction

### `core/src/mindustry/world/blocks/sandbox/PowerVoid.java`

- 知识页：[core-src-mindustry-world-blocks-sandbox-powervoid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-sandbox-powervoid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/sandbox/PowerVoid.java`
- SHA1：`08c9e36850fccf2dc812df42ec5072641f7ad8cc`
- 声明：class PowerVoidextends PowerBlock
- 字段线索：未抽取
- 方法线索：setStats


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
