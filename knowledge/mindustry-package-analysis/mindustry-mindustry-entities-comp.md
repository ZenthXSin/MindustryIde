# Package `mindustry.entities.comp` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities.comp`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities.comp`
- 文件数：48

## 主要依赖线索

- `mindustry.annotations.Annotations.*` × 48
- `mindustry.gen.*` × 44
- `arc.util.*` × 30
- `arc.math.*` × 24
- `mindustry.content.*` × 18
- `mindustry.type.*` × 18
- `mindustry.entities.*` × 16
- `mindustry.game.*` × 15
- `arc.math.geom.*` × 15
- `arc.graphics.g2d.*` × 13
- `arc.graphics.*` × 12
- `mindustry.world.*` × 12
- `mindustry.*` × 11
- `mindustry.graphics.*` × 11
- `mindustry.world.blocks.environment.*` × 8
- `arc.*` × 7
- `mindustry.entities.EntityCollisions.*` × 6
- `mindustry.entities.units.*` × 5
- `arc.scene.ui.layout.*` × 5
- `arc.struct.*` × 5

## 文件逐个分析

### `core/src/mindustry/entities/comp/BlockUnitComp.java`

- 知识页：[core-src-mindustry-entities-comp-blockunitcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-blockunitcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/BlockUnitComp.java`
- SHA1：`0c4064a211e20bfa84918694906ade32f5e5f8ea`
- 声明：class BlockUnitCompimplements Unitc
- 字段线索：ammo
- 方法线索：tile, add, RuntimeException, update, icon, ammof

### `core/src/mindustry/entities/comp/BuilderComp.java`

- 知识页：[core-src-mindustry-entities-comp-buildercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-buildercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/BuilderComp.java`
- SHA1：`3346ce58848ba92540d13a54d5320f036c4a1f57`
- 声明：class BuilderCompimplements Posc, Statusc, Teamc, Rotc
- 字段线索：buildCounter, lastActive, lastSize, buildAlpha
- 方法线索：canBuild, update, afterRead, validatePlans, updateBuildLogic, buildPlan

### `core/src/mindustry/entities/comp/BuildingComp.java`

- 知识页：[core-src-mindustry-entities-comp-buildingcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-buildingcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/BuildingComp.java`
- SHA1：`2cdf6e82b5895f33169ee1a29790768ab0b1caa4`
- 声明：class BuildingCompimplements Posc, Teamc, Healthc, Buildingc, Timerc, QuadTreeObject, Displayable, Sized, Senseable, Controllable, Settable
- 字段线索：timeToSleep, tmpTiles, tempBuilds, teamChangeEvent, bulletDamageEvent, sleepingEntities
- 方法线索：init, create, add, tileX, tileY, moduleBitmask

### `core/src/mindustry/entities/comp/BuildingTetherComp.java`

- 知识页：[core-src-mindustry-entities-comp-buildingtethercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-buildingtethercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/BuildingTetherComp.java`
- SHA1：`1acb23690f8d033d860ee582d7feee9d88842d8b`
- 声明：class BuildingTetherCompimplements Unitc
- 字段线索：building
- 方法线索：update

### `core/src/mindustry/entities/comp/BulletComp.java`

- 知识页：[core-src-mindustry-entities-comp-bulletcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-bulletcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/BulletComp.java`
- SHA1：`28454a555106805a49d54973b253e8c185b71f6d`
- 声明：class BulletCompimplements Timedc, Damagec, Hitboxc, Teamc, Posc, Drawc, Shielderc, Ownerc, Bulletc, Timerc, Senseable, Settable
- 字段线索：rotation, keepAlive, justSpawned, shooter, aimTile, aimY
- 方法线索：getCollisions, isLocal, add, remove, damageMultiplier, absorb

### `core/src/mindustry/entities/comp/ChildComp.java`

- 知识页：[core-src-mindustry-entities-comp-childcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-childcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/ChildComp.java`
- SHA1：`7623b0af56c8cc20db83839a966282cb8dc69142`
- 声明：class ChildCompimplements Posc, Rotc
- 字段线索：未抽取
- 方法线索：add, update

### `core/src/mindustry/entities/comp/CrawlComp.java`

- 知识页：[core-src-mindustry-entities-comp-crawlcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-crawlcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/CrawlComp.java`
- SHA1：`aede078e898e6b736daf0b4c280b927d8c5ea00c`
- 声明：class CrawlCompimplements Posc, Rotc, Hitboxc, Unitc
- 字段线索：lastDeepFloor, lastCrawlSlowdown, crawlTime
- 方法线索：solidity, floorSpeedMultiplier, add, drownFloor, update

### `core/src/mindustry/entities/comp/DamageComp.java`

- 知识页：[core-src-mindustry-entities-comp-damagecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-damagecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/DamageComp.java`
- SHA1：`80131718632deaa77b0e330221a90949e549f0f2`
- 声明：class DamageComp
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/comp/DecalComp.java`

- 知识页：[core-src-mindustry-entities-comp-decalcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-decalcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/DecalComp.java`
- SHA1：`f4368a50c358a4a178888afcc443c83b035531a0`
- 声明：class DecalCompimplements Drawc, Timedc, Rotc, Posc
- 字段线索：未抽取
- 方法线索：draw, clipSize

### `core/src/mindustry/entities/comp/DrawComp.java`

- 知识页：[core-src-mindustry-entities-comp-drawcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-drawcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/DrawComp.java`
- SHA1：`ac42495c5cd554d5f8dd463a1b9806ad3c578efd`
- 声明：class DrawCompimplements Posc
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/comp/EffectStateComp.java`

- 知识页：[core-src-mindustry-entities-comp-effectstatecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-effectstatecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/EffectStateComp.java`
- SHA1：`ae2262b8a130bbd59cc3e328c5cd20aeae4ceabc`
- 声明：class EffectStateCompimplements Posc, Drawc, Timedc, Rotc, Childc
- 字段线索：未抽取
- 方法线索：draw, clipSize

### `core/src/mindustry/entities/comp/ElevationMoveComp.java`

- 知识页：[core-src-mindustry-entities-comp-elevationmovecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-elevationmovecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/ElevationMoveComp.java`
- SHA1：`07973fa12511774e6871e15d9c362cdb7cea7a30`
- 声明：class ElevationMoveCompimplements Velc, Posc, Hitboxc, Unitc
- 字段线索：未抽取
- 方法线索：solidity

### `core/src/mindustry/entities/comp/EntityComp.java`

- 知识页：[core-src-mindustry-entities-comp-entitycomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-entitycomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/EntityComp.java`
- SHA1：`69fa9ccf4b118e7d030c1bb7aae90fced2ae1ce3`
- 声明：class EntityComp
- 字段线索：added, id
- 方法线索：as, classId, serialize

### `core/src/mindustry/entities/comp/FireComp.java`

- 知识页：[core-src-mindustry-entities-comp-firecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-firecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/FireComp.java`
- SHA1：`87bb2156045bbb8c6418f819906db098c15ecf49`
- 声明：class FireCompimplements Timedc, Posc, Syncc, Drawc
- 字段线索：frames, spreadDelay, regions, damageTimer
- 方法线索：update, draw, clipSize, remove, afterRead, afterSync

### `core/src/mindustry/entities/comp/HealthComp.java`

- 知识页：[core-src-mindustry-entities-comp-healthcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-healthcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/HealthComp.java`
- SHA1：`3dfd82478e5a90a1ef1a8e67c36cd43e9d303edd`
- 声明：class HealthCompimplements Entityc, Posc
- 字段线索：hitDuration, hitTime, maxHealth, dead
- 方法线索：update

### `core/src/mindustry/entities/comp/HitboxComp.java`

- 知识页：[core-src-mindustry-entities-comp-hitboxcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-hitboxcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/HitboxComp.java`
- SHA1：`fdfe1c7ddde24462afe84e753b455aab7cb2b747`
- 声明：class HitboxCompimplements Posc, Sized, QuadTreeObject
- 字段线索：hitSize
- 方法线索：update, add, afterRead, hitSize, hitbox, hitboxTile

### `core/src/mindustry/entities/comp/ItemsComp.java`

- 知识页：[core-src-mindustry-entities-comp-itemscomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-itemscomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/ItemsComp.java`
- SHA1：`fa379e4ced195216c1e61471ae7d4adbbdd54763`
- 声明：class ItemsCompimplements Posc
- 字段线索：itemTime
- 方法线索：itemCapacity, update

### `core/src/mindustry/entities/comp/LaunchCoreComp.java`

- 知识页：[core-src-mindustry-entities-comp-launchcorecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-launchcorecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/LaunchCoreComp.java`
- SHA1：`182d824e41889ad5b5d7391b3cf9e71286f2deb8`
- 声明：class LaunchCoreCompimplements Drawc, Timedc
- 字段线索：in
- 方法线索：draw, update

### `core/src/mindustry/entities/comp/LegsComp.java`

- 知识页：[core-src-mindustry-entities-comp-legscomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-legscomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/LegsComp.java`
- SHA1：`df0939cc9534ec6c39003cb096ce4f5536ccb6a1`
- 声明：class LegsCompimplements Posc, Rotc, Hitboxc, Unitc
- 字段线索：straightVec, legs, totalLength, moveSpace, baseRotation, lastDeepFloor
- 方法线索：solidity, drownFloor, add, unloaded, destroy, resetLegs

### `core/src/mindustry/entities/comp/MechComp.java`

- 知识页：[core-src-mindustry-entities-comp-mechcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-mechcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/MechComp.java`
- SHA1：`8e4334da6d08b8bd2f9928e2521e42357ae3a8cf`
- 声明：class MechCompimplements Posc, Hitboxc, Unitc, Mechc, ElevationMovec
- 字段线索：walkExtension, walked
- 方法线索：update, walkExtend, rotateMove, moveAt, approach

### `core/src/mindustry/entities/comp/MinerComp.java`

- 知识页：[core-src-mindustry-entities-comp-minercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-minercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/MinerComp.java`
- SHA1：`fb3dc8ae977bcd86b4ace4e7458ae23f508aacc1`
- 声明：class MinerCompimplements Itemsc, Posc, Teamc, Rotc, Drawc
- 字段线索：mineTimer
- 方法线索：canMine, offloadImmediately, validMine, update

### `core/src/mindustry/entities/comp/OwnerComp.java`

- 知识页：[core-src-mindustry-entities-comp-ownercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-ownercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/OwnerComp.java`
- SHA1：`e0ece8294d494bddc9241ca1681d6e0fa17e97c8`
- 声明：class OwnerComp
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/comp/PayloadComp.java`

- 知识页：[core-src-mindustry-entities-comp-payloadcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-payloadcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/PayloadComp.java`
- SHA1：`b517880be09457c7b0d50ce8aff1546efc219314`
- 声明：class PayloadCompimplements Posc, Rotc, Hitboxc, Unitc
- 字段线索：payloadPower
- 方法线索：update, remove, destroy

### `core/src/mindustry/entities/comp/PhysicsComp.java`

- 知识页：[core-src-mindustry-entities-comp-physicscomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-physicscomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/PhysicsComp.java`
- SHA1：`774d5dc097166823e7419a22bf7819e978fc862a`
- 声明：class PhysicsCompimplements Velc, Hitboxc
- 字段线索：physref
- 方法线索：未抽取

### `core/src/mindustry/entities/comp/PlayerComp.java`

- 知识页：[core-src-mindustry-entities-comp-playercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-playercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/PlayerComp.java`
- SHA1：`b1415895b278841bad7e2368eb3e183a2348b67e`
- 声明：class PlayerCompimplements UnitController, Entityc, Syncc, Timerc, Drawc
- 字段线索：deathDelay, pingDuration, con, locale, deathTimer, lastText
- 方法线索：getPreviewPlans, handlePreviewPlans, isBuilder, bestCore, icon, displayAmmo

### `core/src/mindustry/entities/comp/PosComp.java`

- 知识页：[core-src-mindustry-entities-comp-poscomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-poscomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/PosComp.java`
- SHA1：`250994d7cb10f24777112757905f14f57b15e52c`
- 声明：class PosCompimplements Position
- 字段线索：未抽取
- 方法线索：buildOn, tileOn, getX, getY

### `core/src/mindustry/entities/comp/PosTeamDef.java`

- 知识页：[core-src-mindustry-entities-comp-posteamdef-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-posteamdef-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/PosTeamDef.java`
- SHA1：`c93762080730ee31c5372f71e49f3e5faefbc9ce`
- 声明：class PosTeamDef
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/comp/PowerGraphUpdaterComp.java`

- 知识页：[core-src-mindustry-entities-comp-powergraphupdatercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-powergraphupdatercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/PowerGraphUpdaterComp.java`
- SHA1：`0d82ac88bd015449d077e7f4e12a390fb33bbc7c`
- 声明：class PowerGraphUpdaterCompimplements Entityc
- 字段线索：graph
- 方法线索：update

### `core/src/mindustry/entities/comp/PuddleComp.java`

- 知识页：[core-src-mindustry-entities-comp-puddlecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-puddlecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/PuddleComp.java`
- SHA1：`43884dde4133f1daf29883550bf1c59b283ec601`
- 声明：class PuddleCompimplements Posc, Puddlec, Drawc, Syncc
- 字段线索：rect, paramPuddle, unitCons, lastRipple
- 方法线索：getFlammability, update, draw, clipSize, remove, afterRead

### `core/src/mindustry/entities/comp/RotComp.java`

- 知识页：[core-src-mindustry-entities-comp-rotcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-rotcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/RotComp.java`
- SHA1：`711245850dcda4b1045bf46dfee2999f4185e502`
- 声明：class RotCompimplements Entityc
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/comp/SegmentComp.java`

- 知识页：[core-src-mindustry-entities-comp-segmentcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-segmentcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/SegmentComp.java`
- SHA1：`ab0ab732db86e14b33c26bc926e4841760827f35`
- 声明：class SegmentCompimplements Posc, Rotc, Hitboxc, Unitc, Segmentc
- 字段线索：headSegment, segmentIndex
- 方法线索：isHead, addChild, ignoreSolids, update, playerControllable, shouldUpdateController

### `core/src/mindustry/entities/comp/ShieldComp.java`

- 知识页：[core-src-mindustry-entities-comp-shieldcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-shieldcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/ShieldComp.java`
- SHA1：`957a153be7ff8619465d0962a866d92a91ae9e33`
- 声明：class ShieldCompimplements Healthc, Posc
- 字段线索：armor, shieldAlpha
- 方法线索：damage, damagePierce, damageArmorMult, rawDamage, update

### `core/src/mindustry/entities/comp/ShielderComp.java`

- 知识页：[core-src-mindustry-entities-comp-shieldercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-shieldercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/ShielderComp.java`
- SHA1：`964e9e95f348a4a41fbf936c393820e833eb58eb`
- 声明：class ShielderCompimplements Damagec, Teamc, Posc
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/comp/StatusComp.java`

- 知识页：[core-src-mindustry-entities-comp-statuscomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-statuscomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/StatusComp.java`
- SHA1：`84c379180a61acb0d01c243facc8140575059d50`
- 声明：class StatusCompimplements Posc
- 字段线索：statuses, applied, speedMultiplier, disarmed
- 方法线索：apply, getDuration, clearStatuses, unapply, isBoss, isImmune

### `core/src/mindustry/entities/comp/SyncComp.java`

- 知识页：[core-src-mindustry-entities-comp-synccomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-synccomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/SyncComp.java`
- SHA1：`0df52cb225a55e4ae6aa889062356a67e84a1192`
- 声明：class SyncCompimplements Entityc
- 字段线索：updateSpacing
- 方法线索：update, remove

### `core/src/mindustry/entities/comp/TankComp.java`

- 知识页：[core-src-mindustry-entities-comp-tankcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-tankcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/TankComp.java`
- SHA1：`bf9228b05009427edaad3e494350560a4f3f820a`
- 声明：class TankCompimplements Posc, Hitboxc, Unitc, ElevationMovec
- 字段线索：lastSlowdown, treadTime, walked, lastDeepFloor
- 方法线索：update, floorSpeedMultiplier, moveAt, approach

### `core/src/mindustry/entities/comp/TeamComp.java`

- 知识页：[core-src-mindustry-entities-comp-teamcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-teamcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/TeamComp.java`
- SHA1：`e939e50ab99cc425e806b0aae8f8c64b962f638c`
- 声明：class TeamCompimplements Posc
- 字段线索：未抽取
- 方法线索：cheating, core, closestCore, closestEnemyCore

### `core/src/mindustry/entities/comp/TimedComp.java`

- 知识页：[core-src-mindustry-entities-comp-timedcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-timedcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/TimedComp.java`
- SHA1：`0ea7c736f341aeaf3e3bb53a2574ebd3ce81a1f8`
- 声明：class TimedCompimplements Entityc, Scaled
- 字段线索：未抽取
- 方法线索：update, fin

### `core/src/mindustry/entities/comp/TimedKillComp.java`

- 知识页：[core-src-mindustry-entities-comp-timedkillcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-timedkillcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/TimedKillComp.java`
- SHA1：`6bcb0545a39b6de109dea8711e639693f902b046`
- 声明：class TimedKillCompimplements Entityc, Healthc, Scaled
- 字段线索：未抽取
- 方法线索：update, fin

### `core/src/mindustry/entities/comp/TimerComp.java`

- 知识页：[core-src-mindustry-entities-comp-timercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-timercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/TimerComp.java`
- SHA1：`e847321baddedfc77e5544e656a7e5f96e77ea41`
- 声明：class TimerComp
- 字段线索：timer
- 方法线索：timer

### `core/src/mindustry/entities/comp/UnderwaterMoveComp.java`

- 知识页：[core-src-mindustry-entities-comp-underwatermovecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-underwatermovecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/UnderwaterMoveComp.java`
- SHA1：`ed02aedc9dbeaa05645670be06fc1010f51b9f75`
- 声明：class UnderwaterMoveCompimplements WaterMovec
- 字段线索：未抽取
- 方法线索：draw, collisionLayer, hittable, targetable

### `core/src/mindustry/entities/comp/UnitComp.java`

- 知识页：[core-src-mindustry-entities-comp-unitcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-unitcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/UnitComp.java`
- SHA1：`d3c07ff29c55574a449e720efd36e819e5b19ed8`
- 声明：class UnitCompimplements Healthc, Physicsc, Hitboxc, Statusc, Teamc, Itemsc, Rotc, Unitc, Weaponsc, Drawc, Syncc, Shieldc, Displayable, Ranged, Minerc, Builderc, Senseable, Settable
- 字段线索：tmp1, warpDst, controller, trail, dockedType, lastCommanded
- 方法线索：checkTarget, isGrounded, isFlying, canDrown, wobble, moveAt

### `core/src/mindustry/entities/comp/UnitTetherComp.java`

- 知识页：[core-src-mindustry-entities-comp-unittethercomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-unittethercomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/UnitTetherComp.java`
- SHA1：`487e5c6c3aab8b6bb98cac49f00a8aa40b7904b8`
- 声明：class UnitTetherCompimplements Unitc
- 字段线索：spawner, spawnerUnitId
- 方法线索：afterRead, afterSync, update

### `core/src/mindustry/entities/comp/VelComp.java`

- 知识页：[core-src-mindustry-entities-comp-velcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-velcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/VelComp.java`
- SHA1：`a506d028e7ae67d4afb448561da0638684753003`
- 声明：class VelCompimplements Posc
- 字段线索：drag
- 方法线索：update, solidity

### `core/src/mindustry/entities/comp/WaterCrawlComp.java`

- 知识页：[core-src-mindustry-entities-comp-watercrawlcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-watercrawlcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/WaterCrawlComp.java`
- SHA1：`746a168a4323388e623b218dbec3395c6d0ade33`
- 声明：class WaterCrawlCompimplements Posc, Velc, Hitboxc, Unitc, Crawlc
- 字段线索：未抽取
- 方法线索：solidity, onSolid, floorSpeedMultiplier, onLiquid

### `core/src/mindustry/entities/comp/WaterMoveComp.java`

- 知识页：[core-src-mindustry-entities-comp-watermovecomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-watermovecomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/WaterMoveComp.java`
- SHA1：`19ab0c146cee9cac7043f7f36c044722aa30b307`
- 声明：class WaterMoveCompimplements Posc, Velc, Hitboxc, Unitc
- 字段线索：tleft, trailColor
- 方法线索：update, add, draw, solidity, onSolid, floorSpeedMultiplier

### `core/src/mindustry/entities/comp/WeaponsComp.java`

- 知识页：[core-src-mindustry-entities-comp-weaponscomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-weaponscomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/WeaponsComp.java`
- SHA1：`1fb98593f50b4d27b50d115b3d56d276761da94b`
- 声明：class WeaponsCompimplements Teamc, Posc, Rotc, Velc, Statusc
- 字段线索：未抽取
- 方法线索：remove, update

### `core/src/mindustry/entities/comp/WorldLabelComp.java`

- 知识页：[core-src-mindustry-entities-comp-worldlabelcomp-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-comp-worldlabelcomp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/comp/WorldLabelComp.java`
- SHA1：`165aad2dd6a06d0857532484d34e3267a4aea75c`
- 声明：class WorldLabelCompimplements Posc, Drawc, Syncc
- 字段线索：flagBackground, text, fontSize, flags, parent
- 方法线索：clipSize, draw, hide


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
