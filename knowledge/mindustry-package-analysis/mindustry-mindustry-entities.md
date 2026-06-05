# Package `mindustry.entities` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

实体系统包：负责单位、子弹、特效、群组、AI 行为和运行时实体逻辑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities`
- 文件数：17

## 主要依赖线索

- `mindustry.gen.*` × 13
- `arc.math.geom.*` × 10
- `arc.util.*` × 9
- `arc.math.*` × 7
- `mindustry.content.*` × 7
- `mindustry.world.*` × 7
- `arc.struct.*` × 6
- `arc.*` × 5
- `arc.func.*` × 5
- `mindustry.game.*` × 4
- `arc.graphics.*` × 3
- `mindustry.type.*` × 3
- `mindustry.world.meta.*` × 3
- `mindustry.core.*` × 2
- `mindustry.game.EventType.*` × 2
- `mindustry.graphics.*` × 2
- `arc.graphics.g2d.*` × 2
- `mindustry.*` × 2
- `mindustry.annotations.Annotations.*` × 2
- `mindustry.entities.bullet.*` × 2

## 文件逐个分析

### `core/src/mindustry/entities/Damage.java`

- 知识页：[core-src-mindustry-entities-damage-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-damage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Damage.java`
- SHA1：`3e334b0d81a485fd2047579222e3ed13a6479364`
- 声明：class Damage, class Collidedimplements Pool.Poolable
- 字段线索：bulletDamageEvent, rect, hitrect, vec, collidedBlocks, damages
- 方法线索：set, reset

### `core/src/mindustry/entities/Effect.java`

- 知识页：[core-src-mindustry-entities-effect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Effect.java`
- SHA1：`f7c2dd66ae7e3efa6b1081b64480cd29f8bbf161`
- 声明：class Effect, class EffectContainerimplements Scaled
- 字段线索：shakeFalloff, container, all, initialized, id, renderer
- 方法线索：startDelay, init, followParent, rotWithParent, layer, baseRotation

### `core/src/mindustry/entities/EntityCollisions.java`

- 知识页：[core-src-mindustry-entities-entitycollisions-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-entitycollisions-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/EntityCollisions.java`
- SHA1：`62226cc69514400446455dd593f9cfb6c47ef8e4`
- 声明：class EntityCollisions, interface SolidPred
- 字段线索：seg, vector, r1, arrOut, hitCons, treeCons
- 方法线索：moveCheck, move, moveDelta, overlapsTile, checkCollide, updateCollision

### `core/src/mindustry/entities/EntityGroup.java`

- 知识页：[core-src-mindustry-entities-entitygroup-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-entitygroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/EntityGroup.java`
- SHA1：`eb7a15fcb46639687d440016c98ca136df9d73a6`
- 声明：class EntityGroup<T extends Entityc> implements Iterable<T>
- 字段线索：lastId, array, intersectArray, viewport, intersectRect, indexer
- 方法线索：checkIDCollisions, sort, collide, updatePhysics, update, copy

### `core/src/mindustry/entities/EntityIndexer.java`

- 知识页：[core-src-mindustry-entities-entityindexer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-entityindexer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/EntityIndexer.java`
- SHA1：`f7af77a9caa8723fcb9b8d029ff9afdbe1d1a823`
- 声明：interface EntityIndexer
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/Fires.java`

- 知识页：[core-src-mindustry-entities-fires-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-fires-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Fires.java`
- SHA1：`31c6f5c4501bfe2fb2f18d3b70df08d36bd51854`
- 声明：class Fires
- 字段线索：baseLifetime
- 方法线索：未抽取

### `core/src/mindustry/entities/GroupDefs.java`

- 知识页：[core-src-mindustry-entities-groupdefs-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-groupdefs-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/GroupDefs.java`
- SHA1：`925a70a801a87effd150fc0da67e2e9a9cd2f9c8`
- 声明：class GroupDefs<G>
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/Leg.java`

- 知识页：[core-src-mindustry-entities-leg-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-leg-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Leg.java`
- SHA1：`4e9cb01a9cd0493336d7c59dc1cb773d33adb26d`
- 声明：class Leg
- 字段线索：joint, group, moving, stage
- 方法线索：未抽取

### `core/src/mindustry/entities/LegDestroyData.java`

- 知识页：[core-src-mindustry-entities-legdestroydata-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-legdestroydata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/LegDestroyData.java`
- SHA1：`5a3784366d8c3527dcf35f7f960905e8dc4b27b9`
- 声明：class LegDestroyData
- 字段线索：b, region
- 方法线索：未抽取

### `core/src/mindustry/entities/Lightning.java`

- 知识页：[core-src-mindustry-entities-lightning-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-lightning-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Lightning.java`
- SHA1：`c8475d02444f5bbc356126511fed42b04dac78cd`
- 声明：class Lightning
- 字段线索：random, rect, entities, hit, maxChain, hitRange
- 方法线索：未抽取

### `core/src/mindustry/entities/Mover.java`

- 知识页：[core-src-mindustry-entities-mover-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-mover-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Mover.java`
- SHA1：`e8ff16e6605498d340bbf69d05d9d59082c000f6`
- 声明：interface Mover
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/Predict.java`

- 知识页：[core-src-mindustry-entities-predict-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-predict-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Predict.java`
- SHA1：`98b809aad854fac7283dd972313c09178fbd2c9a`
- 声明：class Predict
- 字段线索：vec, vresult
- 方法线索：未抽取

### `core/src/mindustry/entities/Puddles.java`

- 知识页：[core-src-mindustry-entities-puddles-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-puddles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Puddles.java`
- SHA1：`49cfdf3c1173991d5d643be23ca5f7450474f0b8`
- 声明：class Puddles
- 字段线索：maxLiquid
- 方法线索：未抽取

### `core/src/mindustry/entities/Sized.java`

- 知识页：[core-src-mindustry-entities-sized-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-sized-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Sized.java`
- SHA1：`816c84c096bb63d4d48f033a8b6f9a4e355e68c0`
- 声明：interface Sizedextends Position
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/entities/TargetPriority.java`

- 知识页：[core-src-mindustry-entities-targetpriority-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-targetpriority-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/TargetPriority.java`
- SHA1：`1b9312657ad427894f5d20ff793d7c916923a1ee`
- 声明：class TargetPriority
- 字段线索：wall
- 方法线索：未抽取

### `core/src/mindustry/entities/UnitSorts.java`

- 知识页：[core-src-mindustry-entities-unitsorts-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-unitsorts-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/UnitSorts.java`
- SHA1：`2b4066711b41e96d939f5111a6d79536ca3556bd`
- 声明：class UnitSorts
- 字段线索：closest, buildingDefault
- 方法线索：未抽取

### `core/src/mindustry/entities/Units.java`

- 知识页：[core-src-mindustry-entities-units-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-units-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/Units.java`
- SHA1：`05c71d945b88059ee35842ab32cfd41610f010b2`
- 声明：class Units, interface Sortf, interface BuildingPriorityf
- 字段线索：hitrect, result, cpriority, intResult, buildResult, anyEntityGround
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
