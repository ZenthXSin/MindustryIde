# Package `mindustry.entities.bullet` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities.bullet`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

子弹实体包：负责 BulletType、命中、伤害、绘制、状态效果与特效触发。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities.bullet`
- 文件数：26

## 主要依赖线索

- `mindustry.gen.*` × 23
- `mindustry.content.*` × 19
- `mindustry.entities.*` × 18
- `arc.math.*` × 14
- `arc.util.*` × 14
- `arc.graphics.g2d.*` × 12
- `arc.graphics.*` × 11
- `mindustry.graphics.*` × 11
- `arc.math.geom.*` × 5
- `arc.*` × 4
- `mindustry.*` × 3
- `mindustry.type.*` × 3
- `mindustry.game.*` × 2
- `arc.audio.*` × 1
- `arc.struct.*` × 1
- `mindustry.ai.types.*` × 1
- `mindustry.annotations.Annotations.*` × 1
- `mindustry.ctype.*` × 1
- `mindustry.entities.part.*` × 1
- `mindustry.entities.pattern.*` × 1

## 文件逐个分析

### `core/src/mindustry/entities/bullet/ArtilleryBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-artillerybullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-artillerybullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/ArtilleryBulletType.java`
- SHA1：`0b45707a2da495d9e1fadd9fab17527f4767300f`
- 声明：class ArtilleryBulletTypeextends BasicBulletType
- 字段线索：trailMult
- 方法线索：update

### `core/src/mindustry/entities/bullet/BasicBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-basicbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-basicbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/BasicBulletType.java`
- SHA1：`0d3434d3f8f810193e8e2ac06710d3d4dae9fada`
- 声明：class BasicBulletTypeextends BulletType
- 字段线索：backColor, mixColorFrom, width, shrinkX, shrinkInterp, spin
- 方法线索：load, draw

### `core/src/mindustry/entities/bullet/BombBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-bombbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-bombbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/BombBulletType.java`
- SHA1：`a8de3ee023500e60c28a27f404f61f412ae74b5a`
- 声明：class BombBulletTypeextends BasicBulletType
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/bullet/BulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-bullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-bullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/BulletType.java`
- SHA1：`178612fd8bcde189531b5d4543b749685d288818`
- 声明：class BulletTypeextends Content implements Cloneable
- 字段线索：bulletDamageEvent, lifetime, lifeScaleRandMin, speed, velocityScaleRandMin, damage
- 方法线索：copy, RuntimeException, afterPatch, load, estimateDPS, calculateRange

### `core/src/mindustry/entities/bullet/ContinuousBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-continuousbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-continuousbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/ContinuousBulletType.java`
- SHA1：`5c96fabd4a4277b0239575462fc14d1b8dcd43c9`
- 声明：class ContinuousBulletTypeextends BulletType
- 字段线索：length, shake, damageInterval, largeHit, continuous, timescaleDamage
- 方法线索：continuousDamage, estimateDPS, calculateRange, init, update, applyDamage

### `core/src/mindustry/entities/bullet/ContinuousFlameBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-continuousflamebullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-continuousflamebullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/ContinuousFlameBulletType.java`
- SHA1：`77bd142471e6a2f906ca4b4ecae7254f262b0cd5`
- 声明：class ContinuousFlameBulletTypeextends ContinuousBulletType
- 字段线索：lightStroke, width, divisions, drawFlare, flareColor, flareWidth
- 方法线索：draw, currentLength, drawLight

### `core/src/mindustry/entities/bullet/ContinuousLaserBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-continuouslaserbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-continuouslaserbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/ContinuousLaserBulletType.java`
- SHA1：`7c537c4d88f9c1318e18eda75d200b37cd491d3a`
- 声明：class ContinuousLaserBulletTypeextends ContinuousBulletType
- 字段线索：fadeTime, lightStroke, divisions, colors, strokeFrom, backLength
- 方法线索：draw, drawLight, currentLength

### `core/src/mindustry/entities/bullet/EmpBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-empbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-empbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/EmpBulletType.java`
- SHA1：`3120c4396bfb7f7c7e72a03a776df4a8933353e3`
- 声明：class EmpBulletTypeextends BasicBulletType
- 字段线索：radius, timeIncrease, powerDamageScl, hitPowerEffect, hitUnits, unitDamageScl
- 方法线索：hit

### `core/src/mindustry/entities/bullet/EmptyBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-emptybullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-emptybullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/EmptyBulletType.java`
- SHA1：`fe68883f14945639a45928fb46ddc9c24e54cf6f`
- 声明：class EmptyBulletTypeextends BulletType
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/bullet/ExplosionBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-explosionbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-explosionbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/ExplosionBulletType.java`
- SHA1：`3f58da5cf5be4089094373b4320a7cc1543386d8`
- 声明：class ExplosionBulletTypeextends BulletType
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/bullet/FireBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-firebullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-firebullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/FireBulletType.java`
- SHA1：`65a9dad1ade200c00ddf7762db3f11b4de9e629c`
- 声明：class FireBulletTypeextends BulletType
- 字段线索：colorFrom, radius, velMin, fireTrailChance, trailEffect2, fireEffectChance
- 方法线索：init, draw, update

### `core/src/mindustry/entities/bullet/FlakBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-flakbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-flakbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/FlakBulletType.java`
- SHA1：`0723bb6d42d97f5badd387241dfdec65b486a0ff`
- 声明：class FlakBulletTypeextends BasicBulletType
- 字段线索：explodeRange
- 方法线索：update

### `core/src/mindustry/entities/bullet/InterceptorBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-interceptorbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-interceptorbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/InterceptorBulletType.java`
- SHA1：`b023b84cf24e921fd80b9ab722d17dd801e972e5`
- 声明：class InterceptorBulletTypeextends BasicBulletType
- 字段线索：未抽取
- 方法线索：update

### `core/src/mindustry/entities/bullet/LaserBoltBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-laserboltbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-laserboltbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/LaserBoltBulletType.java`
- SHA1：`5e35741bf65de39b3e724071d42e2cbd9a50cee3`
- 声明：class LaserBoltBulletTypeextends BasicBulletType
- 字段线索：width
- 方法线索：draw

### `core/src/mindustry/entities/bullet/LaserBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-laserbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-laserbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/LaserBulletType.java`
- SHA1：`c7a89d71573d9019691cae744bfde691a815d264`
- 声明：class LaserBulletTypeextends BulletType
- 字段线索：colors, laserEffect, length, width, lengthFalloff, sideLength
- 方法线索：estimateDPS, init, calculateRange, draw, drawLight

### `core/src/mindustry/entities/bullet/LightningBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-lightningbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-lightningbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/LightningBulletType.java`
- SHA1：`5e307848aa59d380684c3776970ccd3ba6bc332e`
- 声明：class LightningBulletTypeextends BulletType
- 字段线索：未抽取
- 方法线索：calculateRange, estimateDPS, init

### `core/src/mindustry/entities/bullet/LiquidBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-liquidbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-liquidbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/LiquidBulletType.java`
- SHA1：`b0180e357d91212c00135686ef8fd9212946d449`
- 声明：class LiquidBulletTypeextends BulletType
- 字段线索：liquid, puddleSize, orbSize, boilTime
- 方法线索：update, draw, despawned, hit

### `core/src/mindustry/entities/bullet/MassDriverBolt.java`

- 知识页：[core-src-mindustry-entities-bullet-massdriverbolt-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-massdriverbolt-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/MassDriverBolt.java`
- SHA1：`843a2133bf3fd1c58e54ded18b40b9e500879704`
- 声明：class MassDriverBoltextends BasicBulletType
- 字段线索：未抽取
- 方法线索：update, despawned, hit

### `core/src/mindustry/entities/bullet/MissileBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-missilebullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-missilebullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/MissileBulletType.java`
- SHA1：`86fca9d59a2d527f537cc8f2446c1088bdbac143`
- 声明：class MissileBulletTypeextends BasicBulletType
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/bullet/MultiBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-multibullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-multibullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/MultiBulletType.java`
- SHA1：`39af8ff32465e2ee35a7bab3ff389e45970250d0`
- 声明：class MultiBulletTypeextends BulletType
- 字段线索：bullets, repeat
- 方法线索：estimateDPS, calculateRange

### `core/src/mindustry/entities/bullet/PointBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-pointbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-pointbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/PointBulletType.java`
- SHA1：`0cabdef170af706bfdbd9ec3f739488bc9fdbb21`
- 声明：class PointBulletTypeextends BulletType
- 字段线索：cdist, result, trailSpacing
- 方法线索：init

### `core/src/mindustry/entities/bullet/PointLaserBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-pointlaserbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-pointlaserbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/PointLaserBulletType.java`
- SHA1：`d7bc4cdf4dbccdb8df7d21c3a735b67ee0554639`
- 声明：class PointLaserBulletTypeextends BulletType
- 字段线索：sprite, laserEnd, color, beamEffect, beamEffectInterval, oscScl
- 方法线索：continuousDamage, estimateDPS, load, draw, update, updateTrailEffects

### `core/src/mindustry/entities/bullet/RailBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-railbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-railbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/RailBulletType.java`
- SHA1：`e84061bf600dbade8be94c1232457633b2f4d6cd`
- 声明：class RailBulletTypeextends BulletType
- 字段线索：pierceEffect, endEffect, length, pointEffectSpace
- 方法线索：calculateRange, handlePierce, init, testCollision, hitTile

### `core/src/mindustry/entities/bullet/SapBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-sapbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-sapbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/SapBulletType.java`
- SHA1：`3b36b3676df0411b13cf9140875bac0a9c195638`
- 声明：class SapBulletTypeextends BulletType
- 字段线索：length, sapStrength, color, width, sprite, laserRegion
- 方法线索：load, draw, drawLight, calculateRange, init

### `core/src/mindustry/entities/bullet/ShrapnelBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-shrapnelbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-shrapnelbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/ShrapnelBulletType.java`
- SHA1：`d739e9bdd487542a9d0d41bf2b35844c621c3512`
- 声明：class ShrapnelBulletTypeextends BulletType
- 字段线索：length, width, fromColor, hitLarge, serrations, serrationLenScl
- 方法线索：init, calculateRange, draw

### `core/src/mindustry/entities/bullet/SpaceLiquidBulletType.java`

- 知识页：[core-src-mindustry-entities-bullet-spaceliquidbullettype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-bullet-spaceliquidbullettype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/bullet/SpaceLiquidBulletType.java`
- SHA1：`86d4b822ef6c39e348fad710f3661f8cdf941be2`
- 声明：class SpaceLiquidBulletTypeextends BulletType
- 字段线索：orbSize
- 方法线索：draw


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
