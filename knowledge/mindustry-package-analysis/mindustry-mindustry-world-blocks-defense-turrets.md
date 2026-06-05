# Package `mindustry.world.blocks.defense.turrets` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.defense.turrets`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.defense.turrets`
- 文件数：12

## 主要依赖线索

- `mindustry.world.meta.*` × 11
- `arc.struct.*` × 9
- `mindustry.gen.*` × 9
- `mindustry.content.*` × 8
- `mindustry.world.consumers.*` × 8
- `mindustry.entities.bullet.*` × 8
- `arc.math.*` × 7
- `arc.util.*` × 6
- `mindustry.type.*` × 6
- `arc.util.io.*` × 6
- `mindustry.entities.*` × 5
- `mindustry.graphics.*` × 5
- `mindustry.logic.*` × 5
- `arc.graphics.*` × 4
- `arc.*` × 3
- `mindustry.ui.*` × 3
- `arc.audio.*` × 3
- `arc.graphics.g2d.*` × 3
- `mindustry.world.*` × 2
- `arc.scene.ui.*` × 2

## 文件逐个分析

### `core/src/mindustry/world/blocks/defense/turrets/BaseTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-baseturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-baseturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/BaseTurret.java`
- SHA1：`27bff62cbfae277954dbb61a007591e305d25398`
- 声明：class BaseTurretextends Block, class BaseTurretBuildextends Building implements Ranged, RotBlock
- 字段线索：range, placeOverlapMargin, rotateSpeed, fogRadiusMultiplier, disableOverlapCheck, activationTime
- 方法线索：init, reinitializeConsumers, drawPlace, setStats, setBars, placed

### `core/src/mindustry/world/blocks/defense/turrets/ContinuousLiquidTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-continuousliquidturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-continuousliquidturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/ContinuousLiquidTurret.java`
- SHA1：`506bfc7160d9753c90aa341960694c8a33266b82`
- 声明：class ContinuousLiquidTurretextends ContinuousTurret, class ContinuousLiquidTurretBuildextends ContinuousTurretBuild
- 字段线索：ammoTypes, liquidConsumed
- 方法线索：ammo, setStats, init, display, shouldActiveSound, getAmmoFraction

### `core/src/mindustry/world/blocks/defense/turrets/ContinuousTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-continuousturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-continuousturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/ContinuousTurret.java`
- SHA1：`a60c8523edf19dce1f10a02c0e044fe247b651b3`
- 声明：class ContinuousTurretextends Turret, class ContinuousTurretBuildextends TurretBuild
- 字段线索：shootType, aimChangeSpeed, scaleDamageEfficiency, bullets, lastLength
- 方法线索：setStats, estimateDps, updateCooling, useAmmo, hasAmmo, shouldConsume

### `core/src/mindustry/world/blocks/defense/turrets/ItemTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-itemturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-itemturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/ItemTurret.java`
- SHA1：`3095cb2a7af79ec53c8bceb9494464576d98247c`
- 声明：class ItemTurretextends Turret, class ItemTurretBuildextends TurretBuild, class ItemEntryextends AmmoEntry
- 字段线索：ammoTypes, item
- 方法线索：ammo, limitRange, setStats, setBars, init, build

### `core/src/mindustry/world/blocks/defense/turrets/LaserTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-laserturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-laserturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/LaserTurret.java`
- SHA1：`9da6be9f337c781931cb189d688bff0a8b5c4dd7`
- 声明：class LaserTurretextends PowerTurret, class LaserTurretBuildextends PowerTurretBuild
- 字段线索：firingMoveFract, shootDuration, bullets
- 方法线索：setStats, init, updateCooling, shouldConsume, placed, updateTile

### `core/src/mindustry/world/blocks/defense/turrets/LiquidTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-liquidturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-liquidturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/LiquidTurret.java`
- SHA1：`8c1db940ac377135d65355c78264b0d48f728ad2`
- 声明：class LiquidTurretextends Turret, class LiquidTurretBuildextends TurretBuild
- 字段线索：ammoTypes, extinguish
- 方法线索：ammo, setStats, init, update, display, shouldActiveSound

### `core/src/mindustry/world/blocks/defense/turrets/PayloadAmmoTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-payloadammoturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-payloadammoturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/PayloadAmmoTurret.java`
- SHA1：`b761555c75d0ef3db0110cc637b7367bc7485713`
- 声明：class PayloadAmmoTurretextends Turret, class PayloadTurretBuildextends TurretBuild
- 字段线索：ammoTypes, ammoKeys, payloads
- 方法线索：ammo, limitRange, setStats, init, build, efficiency

### `core/src/mindustry/world/blocks/defense/turrets/PointDefenseTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-pointdefenseturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-pointdefenseturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/PointDefenseTurret.java`
- SHA1：`d4aa731d79816f43711425781aaf88455681de4f`
- 声明：class PointDefenseTurretextends ReloadTurret, class PointDefenseBuildextends ReloadTurretBuild
- 字段线索：timerTarget, retargetTime, color, beamEffect, hitEffect, shootEffect
- 方法线索：icons, setStats, updateTile, shouldConsume, draw, write

### `core/src/mindustry/world/blocks/defense/turrets/PowerTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-powerturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-powerturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/PowerTurret.java`
- SHA1：`436d7fac0459bab883ee8bfbd22c22bc8d1592c0`
- 声明：class PowerTurretextends Turret, class PowerTurretBuildextends TurretBuild
- 字段线索：shootType
- 方法线索：setStats, limitRange, getAmmoFraction, sense, useAmmo, hasAmmo

### `core/src/mindustry/world/blocks/defense/turrets/ReloadTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-reloadturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-reloadturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/ReloadTurret.java`
- SHA1：`0487fbac3d06ce0efaab30306ac64a1ec141ac8f`
- 声明：class ReloadTurretextends BaseTurret, class ReloadTurretBuildextends BaseTurretBuild
- 字段线索：reload, reloadCounter
- 方法线索：setStats, updateCooling, ammoReloadMultiplier, baseReloadSpeed, canReload

### `core/src/mindustry/world/blocks/defense/turrets/TractorBeamTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-tractorbeamturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-tractorbeamturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/TractorBeamTurret.java`
- SHA1：`843445bf0878a176f95abd62335bba790724b8f4`
- 声明：class TractorBeamTurretextends BaseTurret, class TractorBeamBuildextends BaseTurretBuild
- 字段线索：timerTarget, retargetTime, shootCone, shootLength, laserWidth, force
- 方法线索：icons, setStats, init, updateTile, shouldConsume, estimateDps

### `core/src/mindustry/world/blocks/defense/turrets/Turret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-turrets-turret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-turrets-turret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/turrets/Turret.java`
- SHA1：`d06943faaf3c68ebea6fb39f66fdbc9370fba883`
- 声明：class Turretextends ReloadTurret, class AmmoEntry, class TurretBuildextends ReloadTurretBuild implements ControlBlock
- 字段线索：logicControlCooldown, timerTarget, targetInterval, newTargetInterval, maxAmmo, ammoPerShot
- 方法线索：outputsItems, setStats, setBars, init, load, drawPlanRegion


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
