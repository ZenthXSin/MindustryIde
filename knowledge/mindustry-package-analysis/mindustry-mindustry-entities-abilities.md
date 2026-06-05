# Package `mindustry.entities.abilities` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities.abilities`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

单位能力包：负责 Ability 生命周期、绘制、更新、状态与战斗辅助逻辑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities.abilities`
- 文件数：16

## 主要依赖线索

- `mindustry.gen.*` × 16
- `arc.scene.ui.layout.*` × 15
- `arc.math.*` × 14
- `arc.util.*` × 14
- `mindustry.content.*` × 11
- `mindustry.entities.*` × 11
- `arc.*` × 10
- `mindustry.type.*` × 8
- `arc.graphics.*` × 8
- `arc.graphics.g2d.*` × 7
- `mindustry.graphics.*` × 7
- `arc.audio.*` × 6
- `mindustry.*` × 5
- `mindustry.ui.*` × 3
- `arc.func.*` × 2
- `arc.math.geom.*` × 2
- `mindustry.world.*` × 2
- `arc.struct.*` × 1
- `mindustry.game.*` × 1
- `mindustry.world.meta.*` × 1

## 文件逐个分析

### `core/src/mindustry/entities/abilities/Ability.java`

- 知识页：[core-src-mindustry-entities-abilities-ability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-ability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/Ability.java`
- SHA1：`5b0d9a01c2626718eb24d33e785f3937ee397fca`
- 声明：class Abilityimplements Cloneable
- 字段线索：descriptionWidth, display, data
- 方法线索：update, draw, death, created, init, displayBars

### `core/src/mindustry/entities/abilities/ArmorPlateAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-armorplateability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-armorplateability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/ArmorPlateAbility.java`
- SHA1：`aa24ef246ca9cf7e190b2eb5f63ec8fe0aadf0ab`
- 声明：class ArmorPlateAbilityextends Ability
- 字段线索：plateRegion, shineRegion, plateSuffix, shineSuffix, color, shineSpeed
- 方法线索：update, addStats, draw

### `core/src/mindustry/entities/abilities/EnergyFieldAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-energyfieldability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-energyfieldability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/EnergyFieldAbility.java`
- SHA1：`8092787eee5e404f4ccbdb7276095be8fcaef62c`
- 声明：class EnergyFieldAbilityextends Ability
- 字段线索：all, damage, healEffect, status, shootSound, statusDuration
- 方法线索：addStats, draw, update

### `core/src/mindustry/entities/abilities/ForceFieldAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-forcefieldability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-forcefieldability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/ForceFieldAbility.java`
- SHA1：`b6ea572a7f311777b0792697959d4e6410633915`
- 声明：class ForceFieldAbilityextends Ability
- 字段线索：radius, regen, max, cooldown, sides, rotation
- 方法线索：addStats, update, death, draw, displayBars, created

### `core/src/mindustry/entities/abilities/LiquidExplodeAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-liquidexplodeability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-liquidexplodeability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/LiquidExplodeAbility.java`
- SHA1：`f3cd19662d899eca91408e81e95bc1524544cfb1`
- 声明：class LiquidExplodeAbilityextends Ability
- 字段线索：liquid, amount, radAmountScale, noiseMag
- 方法线索：addStats, death

### `core/src/mindustry/entities/abilities/LiquidRegenAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-liquidregenability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-liquidregenability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/LiquidRegenAbility.java`
- SHA1：`341175d7f4ecc8b461690d4d5cc231ebdc7de17a`
- 声明：class LiquidRegenAbilityextends Ability
- 字段线索：liquid, slurpSpeed, regenPerSlurp, slurpEffectChance, slurpEffect
- 方法线索：addStats, update

### `core/src/mindustry/entities/abilities/MoveEffectAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-moveeffectability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-moveeffectability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/MoveEffectAbility.java`
- SHA1：`2b027a2bdfb1bdc64488390d8bd4e96169a0e19f`
- 声明：class MoveEffectAbilityextends Ability
- 字段线索：minVelocity, interval, amount, rangeLengthMax, rotateEffect, effectParam
- 方法线索：update

### `core/src/mindustry/entities/abilities/MoveLightningAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-movelightningability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-movelightningability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/MoveLightningAbility.java`
- SHA1：`41e2c8a1e5bc74def16eef636578f9bb6701cf15`
- 声明：class MoveLightningAbilityextends Ability
- 字段线索：damage, chance, length, minSpeed, color, y
- 方法线索：addStats, update, draw

### `core/src/mindustry/entities/abilities/RegenAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-regenability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-regenability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/RegenAbility.java`
- SHA1：`674d73c20f0829b6c52d01b85ffc1ebb750021cd`
- 声明：class RegenAbilityextends Ability
- 字段线索：percentAmount, amount
- 方法线索：addStats, update

### `core/src/mindustry/entities/abilities/RepairFieldAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-repairfieldability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-repairfieldability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/RepairFieldAbility.java`
- SHA1：`0977ff83d83174f32c85c9c9b370a525f46d9d09`
- 声明：class RepairFieldAbilityextends Ability
- 字段线索：amount, healEffect, activeEffect, sound, soundVolume, parentizeEffects
- 方法线索：addStats, update

### `core/src/mindustry/entities/abilities/ShieldArcAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-shieldarcability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-shieldarcability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/ShieldArcAbility.java`
- SHA1：`ad99888a6dafdfbffd58d9fcbedf856a0e6bc922`
- 声明：class ShieldArcAbilityextends Ability
- 字段线索：paramUnit, paramField, paramPos, shieldConsumer, unitConsumer, radius
- 方法线索：addStats, update, created, draw, displayBars

### `core/src/mindustry/entities/abilities/ShieldRegenFieldAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-shieldregenfieldability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-shieldregenfieldability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/ShieldRegenFieldAbility.java`
- SHA1：`8827ea67b82776f04357dac41213176d7e4bf502`
- 声明：class ShieldRegenFieldAbilityextends Ability
- 字段线索：amount, applyEffect, activeEffect, sound, soundVolume, parentizeEffects
- 方法线索：addStats, update

### `core/src/mindustry/entities/abilities/SpawnDeathAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-spawndeathability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-spawndeathability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/SpawnDeathAbility.java`
- SHA1：`9cfcddb251eb7ff5aaf74766033f96967186d23b`
- 声明：class SpawnDeathAbilityextends Ability
- 字段线索：unit, amount, spread, faceOutwards
- 方法线索：addStats, death

### `core/src/mindustry/entities/abilities/StatusFieldAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-statusfieldability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-statusfieldability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/StatusFieldAbility.java`
- SHA1：`11cb215640502cf1dd5b81991343fbf40f02bba1`
- 声明：class StatusFieldAbilityextends Ability
- 字段线索：effect, duration, onShoot, applyEffect, activeEffect, effectY
- 方法线索：addStats, update

### `core/src/mindustry/entities/abilities/SuppressionFieldAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-suppressionfieldability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-suppressionfieldability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/SuppressionFieldAbility.java`
- SHA1：`39ec23cd9bc67e2f9014290bdc20abd4d0de1178`
- 声明：class SuppressionFieldAbilityextends Ability
- 字段线索：rand, reload, maxDelay, range, orbRadius, color
- 方法线索：init, addStats, update, draw

### `core/src/mindustry/entities/abilities/UnitSpawnAbility.java`

- 知识页：[core-src-mindustry-entities-abilities-unitspawnability-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-abilities-unitspawnability-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/abilities/UnitSpawnAbility.java`
- SHA1：`5f3ae6989dfe048c16f918e82ea725cf9459bb96`
- 声明：class UnitSpawnAbilityextends Ability
- 字段线索：unit, spawnTime, spawnEffect, parentizeEffects, timer
- 方法线索：addStats, update, draw, localized


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
