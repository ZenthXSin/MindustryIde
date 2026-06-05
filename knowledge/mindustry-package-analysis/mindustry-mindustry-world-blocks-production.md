# Package `mindustry.world.blocks.production` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.production`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.production`
- 文件数：14

## 主要依赖线索

- `arc.math.*` × 12
- `mindustry.world.*` × 11
- `mindustry.world.meta.*` × 10
- `arc.graphics.g2d.*` × 10
- `arc.util.*` × 10
- `mindustry.type.*` × 10
- `mindustry.gen.*` × 9
- `mindustry.graphics.*` × 8
- `mindustry.content.*` × 8
- `arc.*` × 7
- `mindustry.entities.*` × 7
- `mindustry.game.*` × 6
- `mindustry.ui.*` × 6
- `mindustry.annotations.Annotations.*` × 6
- `arc.graphics.*` × 5
- `mindustry.entities.units.*` × 5
- `mindustry.logic.*` × 5
- `arc.struct.*` × 4
- `arc.util.io.*` × 4
- `mindustry.world.consumers.*` × 4

## 文件逐个分析

### `core/src/mindustry/world/blocks/production/AttributeCrafter.java`

- 知识页：[core-src-mindustry-world-blocks-production-attributecrafter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-attributecrafter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/AttributeCrafter.java`
- SHA1：`430af2130f6f44f3e67d2097e9878b2266055b60`
- 声明：class AttributeCrafterextends GenericCrafter, class AttributeCrafterBuildextends GenericCrafterBuild
- 字段线索：attribute, baseEfficiency, boostScale, maxBoost, minEfficiency, displayEfficiencyScale
- 方法线索：drawPlace, setBars, canPlaceOn, setStats, getProgressIncrease, efficiencyMultiplier

### `core/src/mindustry/world/blocks/production/BeamDrill.java`

- 知识页：[core-src-mindustry-world-blocks-production-beamdrill-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-beamdrill-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/BeamDrill.java`
- SHA1：`116b1626f1ffa01af9b00b6842a549a8452d0a3a`
- 声明：class BeamDrillextends Block, class BeamDrillBuildextends Building
- 字段线索：rand, drillTime, range, tier, laserWidth, optionalBoostIntensity
- 方法线索：init, setBars, outputsItems, rotatedOutput, icons, drawPlanRegion

### `core/src/mindustry/world/blocks/production/BurstDrill.java`

- 知识页：[core-src-mindustry-world-blocks-production-burstdrill-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-burstdrill-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/BurstDrill.java`
- SHA1：`854ef4d907d99b77a6d2e0b3795bae9dde6cc42f`
- 声明：class BurstDrillextends Drill, class BurstDrillBuildextends DrillBuild
- 字段线索：shake, speedCurve, invertedTime, arrowSpacing, arrows, arrowColor
- 方法线索：icons, getDrillTime, setStats, updateTile, ambientVolume, shouldConsume

### `core/src/mindustry/world/blocks/production/Drill.java`

- 知识页：[core-src-mindustry-world-blocks-production-drill-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-drill-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/Drill.java`
- SHA1：`e30411de789a36483ed733bef29a562efb197930`
- 声明：class Drillextends Block, class DrillBuildextends Building
- 字段线索：hardnessDrillMultiplier, oreCount, itemArray, tier, drillTime, liquidBoostIntensity
- 方法线索：init, drawPlanConfig, setBars, getDrop, canPlaceOn, drawPlace

### `core/src/mindustry/world/blocks/production/Fracker.java`

- 知识页：[core-src-mindustry-world-blocks-production-fracker-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-fracker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/Fracker.java`
- SHA1：`a3d2b849a39579e6de141038e406b86794fa34ab`
- 声明：class Frackerextends SolidPump, class FrackerBuildextends SolidPumpBuild
- 字段线索：itemUseTime, accumulator
- 方法线索：setStats, updateTile

### `core/src/mindustry/world/blocks/production/GenericCrafter.java`

- 知识页：[core-src-mindustry-world-blocks-production-genericcrafter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-genericcrafter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/GenericCrafter.java`
- SHA1：`e8a07fcdc34f7a33174a773da255e8809a6afea5`
- 声明：class GenericCrafterextends Block, class GenericCrafterBuildextends Building
- 字段线索：outputItem, outputItems, outputLiquid, outputLiquids, liquidOutputDirections, dumpExtraLiquid
- 方法线索：setStats, setBars, rotatedOutput, load, init, afterPatch

### `core/src/mindustry/world/blocks/production/HeatCrafter.java`

- 知识页：[core-src-mindustry-world-blocks-production-heatcrafter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-heatcrafter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/HeatCrafter.java`
- SHA1：`9334d3cc03f0f62701662a3fb50f0cd0dbe5f53f`
- 声明：class HeatCrafterextends GenericCrafter, class HeatCrafterBuildextends GenericCrafterBuild implements HeatConsumer
- 字段线索：heatRequirement, overheatScale, maxEfficiency, sideHeat, heat
- 方法线索：setBars, setStats, updateTile, shouldConsume, heatRequirement, sideHeat

### `core/src/mindustry/world/blocks/production/Incinerator.java`

- 知识页：[core-src-mindustry-world-blocks-production-incinerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-incinerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/Incinerator.java`
- SHA1：`720570f6d3423e75c0b78aa4effcd1c2658c0b58`
- 声明：class Incineratorextends Block, class IncineratorBuildextends Building
- 字段线索：effect, flameColor, heat
- 方法线索：updateTile, status, draw, handleItem, acceptItem, handleLiquid

### `core/src/mindustry/world/blocks/production/ItemIncinerator.java`

- 知识页：[core-src-mindustry-world-blocks-production-itemincinerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-itemincinerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/ItemIncinerator.java`
- SHA1：`e73f4bee9c411c3ca7f057508653fe8efa359f31`
- 声明：class ItemIncineratorextends Block, class ItemIncineratorBuildextends Building
- 字段线索：effect, effectChance
- 方法线索：icons, updateTile, status, draw, handleItem, acceptItem

### `core/src/mindustry/world/blocks/production/Pump.java`

- 知识页：[core-src-mindustry-world-blocks-production-pump-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-pump-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/Pump.java`
- SHA1：`208f33603ff438850e110632ad7c98592d5f28af`
- 声明：class Pumpextends LiquidBlock, class PumpBuildextends LiquidBuild
- 字段线索：pumpAmount, consumeTime, warmupSpeed, drawer, totalProgress, consTimer
- 方法线索：setStats, drawPlace, load, icons, canPlaceOn, setBars

### `core/src/mindustry/world/blocks/production/Separator.java`

- 知识页：[core-src-mindustry-world-blocks-production-separator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-separator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/Separator.java`
- SHA1：`d335631ecdcd74889f43ec84ce258bd29ec9acb6`
- 声明：class Separatorextends Block, class SeparatorBuildextends Building
- 字段线索：consItems, results, craftTime, drawer, progress, totalProgress
- 方法线索：setStats, init, load, drawPlanRegion, icons, created

### `core/src/mindustry/world/blocks/production/SingleBlockProducer.java`

- 知识页：[core-src-mindustry-world-blocks-production-singleblockproducer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-singleblockproducer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/SingleBlockProducer.java`
- SHA1：`1c7b23cbeb5b1ac8daf8d137e8c0741c2bb74a12`
- 声明：class SingleBlockProducerextends BlockProducer, class SingleBlockProducerBuildextends BlockProducerBuild
- 字段线索：result
- 方法线索：recipe

### `core/src/mindustry/world/blocks/production/SolidPump.java`

- 知识页：[core-src-mindustry-world-blocks-production-solidpump-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-solidpump-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/SolidPump.java`
- SHA1：`c9b901fec86b893123656cd54a2fd05284202339`
- 声明：class SolidPumpextends Pump, class SolidPumpBuildextends PumpBuild
- 字段线索：result, updateEffect, updateEffectChance, rotateSpeed, baseEfficiency, attribute
- 方法线索：drawPlace, setBars, setStats, canPlaceOn, outputsItems, canPump

### `core/src/mindustry/world/blocks/production/WallCrafter.java`

- 知识页：[core-src-mindustry-world-blocks-production-wallcrafter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-production-wallcrafter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/production/WallCrafter.java`
- SHA1：`386997e83da7034938e77923371a98a278861ef8`
- 声明：class WallCrafterextends Block, class WallCrafterBuildextends Building
- 字段线索：idx, drillTime, liquidBoostIntensity, updateEffect, updateEffectChance, rotateSpeed
- 方法线索：setBars, setStats, init, outputsItems, rotatedOutput, icons


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
