# Package `mindustry.world.blocks.heat` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.heat`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.heat`
- 文件数：4

## 主要依赖线索

- `arc.struct.*` × 2
- `mindustry.graphics.*` × 2
- `mindustry.ui.*` × 2
- `mindustry.world.draw.*` × 2
- `arc.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.util.*` × 1
- `mindustry.*` × 1
- `mindustry.entities.units.*` × 1
- `mindustry.gen.*` × 1
- `mindustry.world.*` × 1
- `arc.math.*` × 1
- `arc.util.io.*` × 1
- `mindustry.world.blocks.production.*` × 1
- `mindustry.world.meta.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/blocks/heat/HeatBlock.java`

- 知识页：[core-src-mindustry-world-blocks-heat-heatblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-heat-heatblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/heat/HeatBlock.java`
- SHA1：`fab5b62657f05bbe52641bc956749da1dc98da54`
- 声明：interface HeatBlock
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/heat/HeatConductor.java`

- 知识页：[core-src-mindustry-world-blocks-heat-heatconductor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-heat-heatconductor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/heat/HeatConductor.java`
- SHA1：`9ff7cb8dfe0ffd98e92b59bc3f947e47635da47f`
- 声明：class HeatConductorextends Block, class HeatConductorBuildextends Building implements HeatBlock, HeatConsumer
- 字段线索：visualMaxHeat, drawer, splitHeat, heat, sideHeat, cameFrom
- 方法线索：setBars, load, drawPlanRegion, icons, draw, drawLight

### `core/src/mindustry/world/blocks/heat/HeatConsumer.java`

- 知识页：[core-src-mindustry-world-blocks-heat-heatconsumer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-heat-heatconsumer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/heat/HeatConsumer.java`
- SHA1：`209ae91e78673cdcc1d8e6b83618252d1f96ccfe`
- 声明：interface HeatConsumer
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/heat/HeatProducer.java`

- 知识页：[core-src-mindustry-world-blocks-heat-heatproducer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-heat-heatproducer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/heat/HeatProducer.java`
- SHA1：`fda7026450bd7059276b145c5c367eaf1f1ead0b`
- 声明：class HeatProducerextends GenericCrafter, class HeatProducerBuildextends GenericCrafterBuild implements HeatBlock
- 字段线索：heatOutput, warmupRate, heat
- 方法线索：setStats, setBars, updateTile, heatFrac, heat, write


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
