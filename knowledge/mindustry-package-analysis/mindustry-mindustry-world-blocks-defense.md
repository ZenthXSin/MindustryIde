# Package `mindustry.world.blocks.defense` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.defense`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.defense`
- 文件数：15

## 主要依赖线索

- `arc.graphics.g2d.*` × 15
- `arc.math.*` × 14
- `mindustry.gen.*` × 13
- `arc.util.*` × 13
- `mindustry.annotations.Annotations.*` × 12
- `arc.graphics.*` × 12
- `mindustry.graphics.*` × 12
- `mindustry.world.*` × 11
- `mindustry.entities.*` × 10
- `arc.util.io.*` × 9
- `mindustry.content.*` × 9
- `mindustry.world.meta.*` × 9
- `arc.struct.*` × 8
- `arc.audio.*` × 6
- `mindustry.logic.*` × 6
- `arc.math.geom.*` × 5
- `arc.*` × 5
- `arc.func.*` × 4
- `mindustry.entities.units.*` × 4
- `mindustry.world.consumers.*` × 4

## 文件逐个分析

### `core/src/mindustry/world/blocks/defense/AutoDoor.java`

- 知识页：[core-src-mindustry-world-blocks-defense-autodoor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-autodoor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/AutoDoor.java`
- SHA1：`899b1300bdd46f07464afb0eca4f2eed2e3a6ea2`
- 声明：class AutoDoorextends Wall, class AutoDoorBuildextends Building
- 字段线索：rect, units, groundCheck, timerToggle, checkInterval, openfx
- 方法线索：updateTile, sense, setOpen, draw, checkSolid, write

### `core/src/mindustry/world/blocks/defense/BaseShield.java`

- 知识页：[core-src-mindustry-world-blocks-defense-baseshield-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-baseshield-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/BaseShield.java`
- SHA1：`c1db14b1dde6c4f6ef10337ffa41c4ea4e56a795`
- 声明：class BaseShieldextends Block, class BaseShieldBuildextends Building
- 字段线索：radius, sides, shieldColor, paramBuild, bulletConsumer, unitConsumer
- 方法线索：init, drawPlace, updateTile, radius, drawSelect, draw

### `core/src/mindustry/world/blocks/defense/BuildTurret.java`

- 知识页：[core-src-mindustry-world-blocks-defense-buildturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-buildturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/BuildTurret.java`
- SHA1：`58fdb9dc5cf93d6a52777152f1c8ce2640cb4adf`
- 声明：class BuildTurretextends BaseTurret, class BuildTurretBuildextends BaseTurretBuild implements ControlBlock, RotBlock
- 字段线索：timerTarget, targetInterval, buildSpeed, buildBeamOffset, unitType, elevation
- 方法线索：init, setStats, icons, canControl, buildRotation, unit

### `core/src/mindustry/world/blocks/defense/DirectionalForceProjector.java`

- 知识页：[core-src-mindustry-world-blocks-defense-directionalforceprojector-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-directionalforceprojector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/DirectionalForceProjector.java`
- SHA1：`c2e580f30d57629252c336ab6327af36ef75921a`
- 声明：class DirectionalForceProjectorextends Block, class DirectionalForceProjectorBuildextends Building
- 字段线索：intersectOut, paramEntity, paramEffect, dirShieldConsumer, width, shieldHealth
- 方法线索：init, setBars, outputsItems, setStats, drawPlace, shouldAmbientSound

### `core/src/mindustry/world/blocks/defense/Door.java`

- 知识页：[core-src-mindustry-world-blocks-defense-door-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-door-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/Door.java`
- SHA1：`402129432bc7fde1f2f3b74172ae4dce2c84ac76`
- 声明：class Doorextends Wall, class DoorBuildextends Building
- 字段线索：rect, doorQueue, timerToggle, openfx, closefx, doorSound
- 方法线索：getPlanRegion, onProximityAdded, onProximityRemoved, sense, control, origin

### `core/src/mindustry/world/blocks/defense/ForceProjector.java`

- 知识页：[core-src-mindustry-world-blocks-defense-forceprojector-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-forceprojector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/ForceProjector.java`
- SHA1：`c875cc59db7f3127f7af7d865859f4cc3550b334`
- 声明：class ForceProjectorextends Block, class ForceBuildextends Building implements Ranged, ExplosionShield
- 字段线索：timerUse, phaseUseTime, phaseRadiusBoost, phaseShieldBoost, radius, sides
- 方法线索：init, setBars, outputsItems, setStats, drawPlace, setProp

### `core/src/mindustry/world/blocks/defense/MendProjector.java`

- 知识页：[core-src-mindustry-world-blocks-defense-mendprojector-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-mendprojector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/MendProjector.java`
- SHA1：`a2486edb4c5bd06c8db08ea3cd31a69e25c3ff7c`
- 声明：class MendProjectorextends Block, class MendBuildextends Building implements Ranged
- 字段线索：timerUse, baseColor, phaseColor, reload, range, healPercent
- 方法线索：outputsItems, setStats, drawPlace, range, updateTile, sense

### `core/src/mindustry/world/blocks/defense/OverdriveProjector.java`

- 知识页：[core-src-mindustry-world-blocks-defense-overdriveprojector-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-overdriveprojector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/OverdriveProjector.java`
- SHA1：`f2234841c1b2d9fbb87b071cc7dfb6581581d6b6`
- 声明：class OverdriveProjectorextends Block, class OverdriveBuildextends Building implements Ranged
- 字段线索：reload, range, speedBoost, speedBoostPhase, useTime, phaseRangeBoost
- 方法线索：outputsItems, drawPlace, setStats, setBars, range, drawLight

### `core/src/mindustry/world/blocks/defense/Radar.java`

- 知识页：[core-src-mindustry-world-blocks-defense-radar-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-radar-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/Radar.java`
- SHA1：`7a5499fe8210dcf08e3e4e2e69a73c4f5f0c1bf2`
- 声明：class Radarextends Block, class RadarBuildextends Building
- 字段线索：discoveryTime, rotateSpeed, glowColor, glowScl, progress, lastRadius
- 方法线索：icons, drawPlace, fogRadius, updateTile, canPickup, drawSelect

### `core/src/mindustry/world/blocks/defense/RegenProjector.java`

- 知识页：[core-src-mindustry-world-blocks-defense-regenprojector-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-regenprojector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/RegenProjector.java`
- SHA1：`0228382df998de8ae9e9781c924791059e065a3e`
- 声明：class RegenProjectorextends Block, class RegenProjectorBuildextends Building
- 字段线索：taken, mendMap, lastUpdateFrame, range, healPercent, optionalMultiplier
- 方法线索：drawPlace, drawPlanRegion, outputsItems, icons, load, setStats

### `core/src/mindustry/world/blocks/defense/ShieldWall.java`

- 知识页：[core-src-mindustry-world-blocks-defense-shieldwall-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-shieldwall-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/ShieldWall.java`
- SHA1：`8347a832f9ea6262787b46821e6354b1b700fa98`
- 声明：class ShieldWallextends Wall, class ShieldWallBuildextends WallBuild
- 字段线索：shieldHealth, breakCooldown, regenSpeed, glowColor, glowMag, shield
- 方法线索：setStats, draw, updateTile, broken, pickedUp, damage

### `core/src/mindustry/world/blocks/defense/ShockMine.java`

- 知识页：[core-src-mindustry-world-blocks-defense-shockmine-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-shockmine-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/ShockMine.java`
- SHA1：`db132bee9769a2b4402387e8fefff1be82343bd6`
- 声明：class ShockMineextends Block, class ShockMineBuildextends Building
- 字段线索：timerDamage, cooldown, tileDamage, damage, length, tendrils
- 方法线索：setStats, drawTeam, draw, drawCracks, unitOn, triggered

### `core/src/mindustry/world/blocks/defense/ShockwaveTower.java`

- 知识页：[core-src-mindustry-world-blocks-defense-shockwavetower-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-shockwavetower-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/ShockwaveTower.java`
- SHA1：`ced907759f3a8bb65730cab9f0eca16692034e51`
- 声明：class ShockwaveTowerextends Block, class ShockwaveTowerBuildextends Building
- 字段线索：timerCheck, range, reload, bulletDamage, falloffCount, shake
- 方法线索：setStats, drawPlace, updateTile, sense, warmup, shouldConsume

### `core/src/mindustry/world/blocks/defense/Thruster.java`

- 知识页：[core-src-mindustry-world-blocks-defense-thruster-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-thruster-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/Thruster.java`
- SHA1：`19a891ee1279d65e393f554796841f561db9ee44`
- 声明：class Thrusterextends Wall, class ThrusterBuildextends WallBuild
- 字段线索：未抽取
- 方法线索：drawPlanRegion, icons, draw

### `core/src/mindustry/world/blocks/defense/Wall.java`

- 知识页：[core-src-mindustry-world-blocks-defense-wall-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-defense-wall-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/defense/Wall.java`
- SHA1：`0ccf115315172eec1b5e1fdedee11774c2b4c140`
- 声明：class Wallextends Block, class WallBuildextends Building
- 字段线索：lightningChance, lightningDamage, lightningLength, lightningColor, lightningSound, chanceDeflect
- 方法线索：setStats, init, icons, draw, collision


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
