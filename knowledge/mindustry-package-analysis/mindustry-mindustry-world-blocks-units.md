# Package `mindustry.world.blocks.units` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.units`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.units`
- 文件数：10

## 主要依赖线索

- `arc.graphics.g2d.*` × 9
- `arc.util.*` × 9
- `arc.math.*` × 7
- `arc.struct.*` × 7
- `arc.util.io.*` × 7
- `mindustry.entities.*` × 7
- `mindustry.gen.*` × 7
- `mindustry.world.*` × 7
- `mindustry.annotations.Annotations.*` × 7
- `mindustry.*` × 6
- `mindustry.content.*` × 5
- `mindustry.entities.units.*` × 5
- `mindustry.graphics.*` × 5
- `arc.*` × 5
- `arc.graphics.*` × 5
- `arc.math.geom.*` × 4
- `arc.scene.ui.layout.*` × 4
- `mindustry.world.meta.*` × 4
- `mindustry.game.*` × 4
- `mindustry.type.*` × 3

## 文件逐个分析

### `core/src/mindustry/world/blocks/units/DroneCenter.java`

- 知识页：[core-src-mindustry-world-blocks-units-dronecenter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-dronecenter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/DroneCenter.java`
- SHA1：`19d1a0bfc99e013ebc6cc55f135a8cae904cff58`
- 声明：class DroneCenterextends Block, class DroneCenterBuildextends Building, class EffectDroneAIextends AIController
- 字段线索：unitsSpawned, droneType, status, droneConstructTime, statusDuration, droneRange
- 方法线索：init, updateTile, drawConfigure, draw, write, read

### `core/src/mindustry/world/blocks/units/Reconstructor.java`

- 知识页：[core-src-mindustry-world-blocks-units-reconstructor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-reconstructor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/Reconstructor.java`
- SHA1：`8e7eec28c215e1a9b24dce5dbb487a02ea8fab1d`
- 声明：class Reconstructorextends UnitBlock, class ReconstructorBuildextends UnitBuild
- 字段线索：constructTime, upgrades, capacities, createSound, createSoundVolume, commandPos
- 方法线索：drawPlanRegion, icons, setBars, setStats, init, afterPatch

### `core/src/mindustry/world/blocks/units/RepairTower.java`

- 知识页：[core-src-mindustry-world-blocks-units-repairtower-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-repairtower-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/RepairTower.java`
- SHA1：`48230656dc8920325399d45ebb54040daa8f1563`
- 声明：class RepairTowerextends Block, class RepairTowerBuildextends Building implements Ranged
- 字段线索：refreshInterval, range, circleColor, circleSpeed, healAmount, refresh
- 方法线索：setStats, drawPlace, updateTile, shouldConsume, draw, range

### `core/src/mindustry/world/blocks/units/RepairTurret.java`

- 知识页：[core-src-mindustry-world-blocks-units-repairturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-repairturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/RepairTurret.java`
- SHA1：`35babf70289f9c3c7666d541648ec14d54e871ff`
- 声明：class RepairTurretextends Block, class RepairPointBuildextends Building implements Ranged, RotBlock
- 字段线索：rect, rand, timerTarget, timerEffect, repairRadius, repairSpeed
- 方法线索：setStats, init, drawPlace, icons, buildRotation, draw

### `core/src/mindustry/world/blocks/units/UnitAssembler.java`

- 知识页：[core-src-mindustry-world-blocks-units-unitassembler-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-unitassembler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/UnitAssembler.java`
- SHA1：`f17be1556fdab85498abfd3b8177401add80a939`
- 声明：class UnitAssemblerextends PayloadBlock, class AssemblerUnitPlan, class YeetData
- 字段线索：areaSize, droneType, dronesCreated, droneConstructTime, capacities, plans
- 方法线索：getRect, drawPlace, canPlaceOn, setBars, drawPlanRegion, icons

### `core/src/mindustry/world/blocks/units/UnitAssemblerModule.java`

- 知识页：[core-src-mindustry-world-blocks-units-unitassemblermodule-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-unitassemblermodule-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/UnitAssemblerModule.java`
- SHA1：`944f3a68dfec0eec43db7c65d23d81e89725f07b`
- 声明：class UnitAssemblerModuleextends PayloadBlock, class UnitAssemblerModuleBuildextends PayloadBlockBuild<Payload>
- 字段线索：tier, link, lastChange
- 方法线索：setStats, drawPlace, canPlaceOn, drawPlanRegion, icons, findLink

### `core/src/mindustry/world/blocks/units/UnitBlock.java`

- 知识页：[core-src-mindustry-world-blocks-units-unitblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-unitblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/UnitBlock.java`
- SHA1：`ade6b14edc0685fb81240c9ba19194da0be259a8`
- 声明：class UnitBlockextends PayloadBlock, class UnitBuildextends PayloadBlockBuild<UnitPayload>
- 字段线索：speedScl
- 方法线索：spawned, dumpPayload

### `core/src/mindustry/world/blocks/units/UnitCargoLoader.java`

- 知识页：[core-src-mindustry-world-blocks-units-unitcargoloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-unitcargoloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/UnitCargoLoader.java`
- SHA1：`0a95fb6183e734631375298bbe6982f0c301fed3`
- 声明：class UnitCargoLoaderextends Block, class UnitTransportSourceBuildextends Building implements UnitTetherBlock
- 字段线索：unitType, unitBuildTime, polyStroke, polySides, polyRotateSpeed, polyColor
- 方法线索：outputsItems, setBars, canPlaceOn, drawPlace, updateTile, spawned

### `core/src/mindustry/world/blocks/units/UnitCargoUnloadPoint.java`

- 知识页：[core-src-mindustry-world-blocks-units-unitcargounloadpoint-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-unitcargounloadpoint-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/UnitCargoUnloadPoint.java`
- SHA1：`eb1343f3a572e81b4b219404a424fb97b78e5bdb`
- 声明：class UnitCargoUnloadPointextends Block, class UnitCargoUnloadPointBuildextends Building
- 字段线索：staleTimeDuration, item, staleTimer, stale
- 方法线索：draw, drawSelect, updateTile, acceptStack, buildConfiguration, config

### `core/src/mindustry/world/blocks/units/UnitFactory.java`

- 知识页：[core-src-mindustry-world-blocks-units-unitfactory-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-units-unitfactory-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/units/UnitFactory.java`
- SHA1：`fca98bc2ab8d96a7cd7d83887ec14ac5f63819ea`
- 声明：class UnitFactoryextends UnitBlock, class UnitPlan, class UnitFactoryBuildextends UnitBuild
- 字段线索：capacities, plans, createSound, createSoundVolume, unit, requirements
- 方法线索：init, afterPatch, initCapacities, setBars, outputsItems, setStats


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
