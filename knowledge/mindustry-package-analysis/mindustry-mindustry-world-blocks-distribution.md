# Package `mindustry.world.blocks.distribution` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.distribution`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.distribution`
- 文件数：20

## 主要依赖线索

- `mindustry.gen.*` × 20
- `mindustry.type.*` × 18
- `mindustry.world.*` × 17
- `mindustry.world.meta.*` × 14
- `arc.util.*` × 14
- `arc.graphics.g2d.*` × 13
- `mindustry.annotations.Annotations.*` × 13
- `arc.util.io.*` × 12
- `arc.math.*` × 11
- `mindustry.entities.*` × 10
- `mindustry.entities.units.*` × 9
- `mindustry.graphics.*` × 9
- `arc.math.geom.*` × 8
- `arc.struct.*` × 6
- `arc.graphics.*` × 6
- `mindustry.content.*` × 5
- `mindustry.world.blocks.*` × 5
- `arc.func.*` × 4
- `mindustry.input.*` × 4
- `mindustry.logic.*` × 3

## 文件逐个分析

### `core/src/mindustry/world/blocks/distribution/ArmoredConveyor.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-armoredconveyor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-armoredconveyor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/ArmoredConveyor.java`
- SHA1：`72b68d44f416142496a5f6a2410a0fa50b2fcb06`
- 声明：class ArmoredConveyorextends Conveyor, class ArmoredConveyorBuildextends ConveyorBuild
- 字段线索：未抽取
- 方法线索：blends, blendsArmored, acceptItem

### `core/src/mindustry/world/blocks/distribution/BufferedItemBridge.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-buffereditembridge-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-buffereditembridge-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/BufferedItemBridge.java`
- SHA1：`7341894cef3f53baca729ad8a3168566b4dd0865`
- 声明：class BufferedItemBridgeextends ItemBridge, class BufferedItemBridgeBuildextends ItemBridgeBuild
- 字段线索：timerAccept, speed, bufferCapacity, displayedSpeed
- 方法线索：setStats, updateTransport, doDump, write, read

### `core/src/mindustry/world/blocks/distribution/ChainedBuilding.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-chainedbuilding-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-chainedbuilding-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/ChainedBuilding.java`
- SHA1：`b82a18c27e5544a2d1e3ebb825c739af79a7b868`
- 声明：interface ChainedBuilding
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/distribution/Conveyor.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-conveyor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-conveyor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/Conveyor.java`
- SHA1：`a81ec9b121e1c04f8ce989431c2d08659e909ece`
- 声明：class Conveyorextends Block implements Autotiler, class ConveyorBuildextends Building implements ChainedBuilding
- 字段线索：itemSpace, capacity, speed, displayedSpeed, pushUnits, bridgeReplacement
- 方法线索：setStats, init, drawPlanRegion, blends, canReplace, handlePlacementLine

### `core/src/mindustry/world/blocks/distribution/DirectionBridge.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-directionbridge-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-directionbridge-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/DirectionBridge.java`
- SHA1：`66d75371425d0ed43ba55fa9c25c134010dfd274`
- 声明：class DirectionBridgeextends Block, class DirectionBridgeBuildextends Building
- 字段线索：otherDst, range, otherPlan, planFinder, occupied, lastLink
- 方法线索：init, drawPlanRegion, drawPlanConfigTop, icons, changePlacementPath, drawPlace

### `core/src/mindustry/world/blocks/distribution/DirectionLiquidBridge.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-directionliquidbridge-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-directionliquidbridge-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/DirectionLiquidBridge.java`
- SHA1：`76954f9f315d8fc1ddeae0e67d4e39e403d127b0`
- 声明：class DirectionLiquidBridgeextends DirectionBridge, class DuctBridgeBuildextends DirectionBridgeBuild
- 字段线索：timerFlow, speed, liquidPadding
- 方法线索：icons, draw, updateTile, acceptLiquid

### `core/src/mindustry/world/blocks/distribution/DirectionalUnloader.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-directionalunloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-directionalunloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/DirectionalUnloader.java`
- SHA1：`88dd6b2edf9357e6f034aa9e0dedf24ca5bc0207`
- 声明：class DirectionalUnloaderextends Block, class DirectionalUnloaderBuildextends Building
- 字段线索：speed, allowCoreUnload, unloadTimer, unloadItem, offset
- 方法线索：setStats, drawPlanRegion, drawPlanConfig, setBars, icons, updateTile

### `core/src/mindustry/world/blocks/distribution/Duct.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-duct-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-duct-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/Duct.java`
- SHA1：`cd10b116d2177c87b7f57ded239ec7aff78fa14f`
- 声明：class Ductextends Block implements Autotiler, class DuctBuildextends Building
- 字段线索：speed, armored, transparentColor, junctionReplacement, progress, current
- 方法线索：setStats, init, drawPlanRegion, blendsArmored, blends, icons

### `core/src/mindustry/world/blocks/distribution/DuctBridge.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-ductbridge-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-ductbridge-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/DuctBridge.java`
- SHA1：`c45e84fba236ff787157d4e39cb8e123c65287e5`
- 声明：class DuctBridgeextends DirectionBridge, class DuctBridgeBuildextends DirectionBridgeBuild
- 字段线索：speed, progress
- 方法线索：setStats, updateTile, acceptItem

### `core/src/mindustry/world/blocks/distribution/DuctJunction.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-ductjunction-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-ductjunction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/DuctJunction.java`
- SHA1：`a30942b30bc318dbc275d24b028e8adefbb6d958`
- 声明：class DuctJunctionextends Block, class DuctJunctionBuildextends Building
- 字段线索：transparentColor, speed
- 方法线索：setStats, load, outputsItems, init, draw, updateTile

### `core/src/mindustry/world/blocks/distribution/DuctRouter.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-ductrouter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-ductrouter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/DuctRouter.java`
- SHA1：`112959b93e9fbee35c1215b1adcb3000ef6b2543`
- 声明：class DuctRouterextends Block, class DuctRouterBuildextends Building
- 字段线索：speed, sortItem, progress, current
- 方法线索：setStats, icons, drawPlanRegion, minimapColor, rotatedOutput, draw

### `core/src/mindustry/world/blocks/distribution/ItemBridge.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-itembridge-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-itembridge-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/ItemBridge.java`
- SHA1：`947138bdb8a6b686236d61ea995f8036ac58dab3`
- 声明：class ItemBridgeextends Block, class ItemBridgeBuildextends Building
- 字段线索：timerCheckMoved, range, transportTime, fadeIn, moveArrows, pulse
- 方法线索：setStats, drawPlanConfigTop, drawBridge, drawPlace, linkValid, positionsValid

### `core/src/mindustry/world/blocks/distribution/Junction.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-junction-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-junction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/Junction.java`
- SHA1：`25f0fe3f2446dcaeb72307df7786040ea71646a4`
- 声明：class Junctionextends Block, class JunctionBuildextends Building
- 字段线索：speed, capacity, displayedSpeed, buffer
- 方法线索：setStats, outputsItems, acceptStack, updateTile, handleItem, acceptItem

### `core/src/mindustry/world/blocks/distribution/MassDriver.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-massdriver-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-massdriver-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/MassDriver.java`
- SHA1：`b4814cea60ef234db555492d80eacd1241c94161`
- 声明：class MassDriverextends Block, class DriverBulletDataimplements Poolable, class MassDriverBuildextends Building implements RotBlock
- 字段线索：range, rotateSpeed, translation, minDistribute, knockback, reload
- 方法线索：setStats, icons, drawPlace, reset, buildRotation, currentShooter

### `core/src/mindustry/world/blocks/distribution/OverflowDuct.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-overflowduct-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-overflowduct-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/OverflowDuct.java`
- SHA1：`2fb2217853d8a90dba2bf0367c7e6900c053d49d`
- 声明：class OverflowDuctextends Block, class OverflowDuctBuildextends Building
- 字段线索：speed, invert, progress, current
- 方法线索：setStats, icons, drawPlanRegion, rotatedOutput, draw, updateTile

### `core/src/mindustry/world/blocks/distribution/OverflowGate.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-overflowgate-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-overflowgate-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/OverflowGate.java`
- SHA1：`cf055984906cf5b36dd73f37ddaee222adc09274`
- 声明：class OverflowGateextends Block, class OverflowGateBuildextends Building
- 字段线索：speed, invert
- 方法线索：outputsItems, acceptItem, handleItem, version, read

### `core/src/mindustry/world/blocks/distribution/Router.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-router-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-router-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/Router.java`
- SHA1：`2b31faccc491b97168b2cfb2e832c8d613181110`
- 声明：class Routerextends Block, class RouterBuildextends Building implements ControlBlock
- 字段线索：speed, lastItem, lastInput, time, unit
- 方法线索：unit, canControl, shouldAutoTarget, updateTile, acceptStack, acceptItem

### `core/src/mindustry/world/blocks/distribution/Sorter.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-sorter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-sorter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/Sorter.java`
- SHA1：`ddf7f87841ed502277408e42fccc0c8856b3bafd`
- 声明：class Sorterextends Block, class SorterBuildextends Building
- 字段线索：invert, sortItem
- 方法线索：drawPlanConfig, outputsItems, minimapColor, icons, configured, draw

### `core/src/mindustry/world/blocks/distribution/StackConveyor.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-stackconveyor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-stackconveyor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/StackConveyor.java`
- SHA1：`b906af80d7f72bd0091d9e6d307f7270949a3fc6`
- 声明：class StackConveyorextends Block implements Autotiler, class StackConveyorBuildextends Building
- 字段线索：stateMove, glowAlpha, glowColor, baseEfficiency, speed, outputRouter
- 方法线索：setStats, blends, drawPlanRegion, rotatedOutput, draw, dropped

### `core/src/mindustry/world/blocks/distribution/StackRouter.java`

- 知识页：[core-src-mindustry-world-blocks-distribution-stackrouter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-distribution-stackrouter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/distribution/StackRouter.java`
- SHA1：`389dbd6d80d72221b85118acb442bdeb861445d4`
- 声明：class StackRouterextends DuctRouter, class StackRouterBuildextends DuctRouterBuild
- 字段线索：baseEfficiency, glowAlpha, glowColor, unloading
- 方法线索：updateTile, draw, acceptItem


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
