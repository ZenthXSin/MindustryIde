# Package `mindustry.world.blocks.payloads` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.payloads`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.payloads`
- 文件数：14

## 主要依赖线索

- `arc.graphics.g2d.*` × 13
- `mindustry.gen.*` × 13
- `arc.util.*` × 12
- `arc.util.io.*` × 12
- `arc.math.*` × 10
- `mindustry.graphics.*` × 10
- `mindustry.type.*` × 8
- `mindustry.world.*` × 8
- `mindustry.ctype.*` × 8
- `arc.struct.*` × 5
- `mindustry.*` × 5
- `mindustry.entities.units.*` × 5
- `arc.math.geom.*` × 5
- `arc.*` × 5
- `mindustry.entities.*` × 5
- `mindustry.logic.*` × 4
- `mindustry.world.blocks.*` × 4
- `mindustry.world.meta.*` × 4
- `mindustry.annotations.Annotations.*` × 4
- `mindustry.ui.*` × 3

## 文件逐个分析

### `core/src/mindustry/world/blocks/payloads/BlockProducer.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-blockproducer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-blockproducer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/BlockProducer.java`
- SHA1：`5c17ec2638c52b155d91d90f9b440b3e587a8783`
- 声明：class BlockProducerextends PayloadBlock, class BlockProducerBuildextends PayloadBlockBuild<BuildPayload>
- 字段线索：buildSpeed, heat
- 方法线索：icons, drawPlanRegion, setBars, acceptItem, getMaximumAccepted, acceptPayload

### `core/src/mindustry/world/blocks/payloads/BuildPayload.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-buildpayload-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-buildpayload-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/BuildPayload.java`
- SHA1：`70fb9eff8de83b52a8dbce00fe302db7b00378af`
- 声明：class BuildPayloadimplements Payload
- 字段线索：build
- 方法线索：block, place, contentEquals, content, update, destroyed

### `core/src/mindustry/world/blocks/payloads/Constructor.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-constructor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-constructor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/Constructor.java`
- SHA1：`9c397c49d4c550ec4a32db06b1f0f9a76a826311`
- 声明：class Constructorextends BlockProducer, class ConstructorBuildextends BlockProducerBuild
- 字段线索：filter, minBlockSize, recipe
- 方法线索：setStats, getPlanConfigs, canProduce, buildConfiguration, config, drawSelect

### `core/src/mindustry/world/blocks/payloads/Payload.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payload-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payload-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/Payload.java`
- SHA1：`d9e68c4411199913d2038a240bd5012ae9c804a4`
- 声明：interface Payloadextends Position
- 字段线索：未抽取
- 方法线索：update, dump, fits, rotation, destroyed, getX

### `core/src/mindustry/world/blocks/payloads/PayloadBlock.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadBlock.java`
- SHA1：`e73375c5089c3c269e69b1d76ae274c05a2f2a94`
- 声明：class PayloadBlockextends Block, class PayloadBlockBuild<T extends Payload> extends Building
- 字段线索：payloadSpeed, regionSuffix, inRegion, payload, payVector, payRotation
- 方法线索：load, findFactoryRegion, acceptUnitPayload, canControlSelect, onControlSelect, acceptPayload

### `core/src/mindustry/world/blocks/payloads/PayloadConveyor.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadconveyor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadconveyor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadConveyor.java`
- SHA1：`983cf21b538ecaa90009523996bb2d4521a2c0e9`
- 声明：class PayloadConveyorextends Block, class PayloadConveyorBuildextends Building
- 字段线索：moveTime, interp, payloadLimit, pushUnits, item, animation
- 方法线索：icons, drawPlace, setStats, init, canControlSelect, onControlSelect

### `core/src/mindustry/world/blocks/payloads/PayloadDeconstructor.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloaddeconstructor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloaddeconstructor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadDeconstructor.java`
- SHA1：`96867a30169550a80add3a63d9e9eb9d0eda57a9`
- 声明：class PayloadDeconstructorextends PayloadBlock, class PayloadDeconstructorBuildextends PayloadBlockBuild<Payload>
- 字段线索：maxPayloadSize, deconstructSpeed, dumpRate, deconstructing, accum, progress
- 方法线索：icons, setBars, draw, acceptUnitPayload, handlePayload, acceptPayload

### `core/src/mindustry/world/blocks/payloads/PayloadLoader.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadLoader.java`
- SHA1：`f1a32775fcc18c75da2fd39c5eb9aacfa1b8623b`
- 声明：class PayloadLoaderextends PayloadBlock, class PayloadLoaderBuildextends PayloadBlockBuild<BuildPayload>
- 字段线索：timerLoad, loadTime, itemsLoaded, liquidsLoaded, maxBlockSize, maxPowerConsumption
- 方法线索：icons, outputsItems, setBars, drawPlanRegion, init, acceptPayload

### `core/src/mindustry/world/blocks/payloads/PayloadMassDriver.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadmassdriver-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadmassdriver-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadMassDriver.java`
- SHA1：`bfb8f59f27bc410bffedd566163e4bb93372024b`
- 声明：class PayloadMassDriverextends PayloadBlock, class PayloadDriverBuildextends PayloadBlockBuild<Payload> implements RotBlock, class PayloadMassDriverData
- 字段线索：range, rotateSpeed, length, knockback, reload, chargeTime
- 方法线索：init, setStats, icons, drawPlanRegion, drawPlace, getRegionsToOutline

### `core/src/mindustry/world/blocks/payloads/PayloadRouter.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadrouter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadrouter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadRouter.java`
- SHA1：`4f53146fb30a83804b15a0170eddae303c305bfe`
- 声明：class PayloadRouterextends PayloadConveyor, class PayloadRouterBuildextends PayloadConveyorBuild
- 字段线索：invert, sorted, recDir, matches, smoothRot, controlTime
- 方法线索：drawPlanRegion, getPlanConfigs, canSort, add, pickNext, control

### `core/src/mindustry/world/blocks/payloads/PayloadSource.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadsource-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadsource-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadSource.java`
- SHA1：`b60c49812e31e16a7b4407ba2326a43b7d778a4e`
- 声明：class PayloadSourceextends PayloadBlock, class PayloadSourceBuildextends PayloadBlockBuild<Payload>
- 字段线索：unit, configBlock, commandPos, scl
- 方法线索：getPlanConfigs, icons, drawPlanRegion, canProduce, getCommandPosition, onCommand

### `core/src/mindustry/world/blocks/payloads/PayloadUnloader.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadunloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadunloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadUnloader.java`
- SHA1：`cae1fa5656e03d6a33b082d58402915027b54a72`
- 声明：class PayloadUnloaderextends PayloadLoader, class PayloadUnloaderBuildextends PayloadLoaderBuild
- 字段线索：offloadSpeed, maxPowerUnload, lastOutputPower
- 方法线索：outputsItems, rotatedOutput, acceptItem, acceptLiquid, getPowerProduction, updateTile

### `core/src/mindustry/world/blocks/payloads/PayloadVoid.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-payloadvoid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-payloadvoid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/PayloadVoid.java`
- SHA1：`e960cb08a232acc6cd2a9f522841ec7dff132cc9`
- 声明：class PayloadVoidextends PayloadBlock, class PayloadVoidBuildextends PayloadBlockBuild<Payload>
- 字段线索：incinerateEffect, incinerateSound
- 方法线索：icons, draw, acceptUnitPayload, updateTile

### `core/src/mindustry/world/blocks/payloads/UnitPayload.java`

- 知识页：[core-src-mindustry-world-blocks-payloads-unitpayload-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-payloads-unitpayload-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/payloads/UnitPayload.java`
- SHA1：`01329ebcf18fd5a48a558afc9f2b96e294721827`
- 声明：class UnitPayloadimplements Payload
- 字段线索：overlayDuration, unit, overlayTime, overlayRegion
- 方法线索：showOverlay, contentEquals, update, content, requirements, buildTime


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
