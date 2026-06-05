# Package `mindustry.ai.types` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ai.types`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ai.types`
- 文件数：16

## 主要依赖线索

- `mindustry.entities.units.*` × 15
- `mindustry.gen.*` × 14
- `arc.math.*` × 10
- `mindustry.ai.*` × 9
- `mindustry.entities.*` × 9
- `arc.util.*` × 8
- `mindustry.world.*` × 8
- `arc.struct.*` × 5
- `mindustry.*` × 5
- `arc.math.geom.*` × 4
- `mindustry.world.meta.*` × 4
- `mindustry.world.blocks.ConstructBlock.*` × 3
- `mindustry.type.*` × 3
- `mindustry.core.*` × 3
- `mindustry.game.Teams.*` × 2
- `mindustry.world.blocks.units.UnitCargoUnloadPoint.*` × 1
- `mindustry.world.blocks.payloads.*` × 1
- `mindustry.logic.*` × 1
- `mindustry.world.blocks.storage.CoreBlock.*` × 1
- `mindustry.world.blocks.distribution.*` × 1

## 文件逐个分析

### `core/src/mindustry/ai/types/AssemblerAI.java`

- 知识页：[core-src-mindustry-ai-types-assemblerai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-assemblerai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/AssemblerAI.java`
- SHA1：`7a51a980ebf56d139e32e867523f8e21c796ceda`
- 声明：class AssemblerAIextends AIController
- 字段线索：targetPos, targetAngle
- 方法线索：updateMovement, inPosition

### `core/src/mindustry/ai/types/BoostAI.java`

- 知识页：[core-src-mindustry-ai-types-boostai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-boostai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/BoostAI.java`
- SHA1：`3cfa594f7a3654649c276dc87c4987b2a0023a5a`
- 声明：class BoostAIextends AIController
- 字段线索：未抽取
- 方法线索：updateUnit

### `core/src/mindustry/ai/types/BuilderAI.java`

- 知识页：[core-src-mindustry-ai-types-builderai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-builderai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/BuilderAI.java`
- SHA1：`dfe8de0b10c51433fae0a889e5ad70c89481f56d`
- 声明：class BuilderAIextends AIController
- 字段线索：buildRadius, assistFollowing, following, enemy, lastPlan, fleeRange
- 方法线索：init, updateMovement, nearEnemy, fallback, PrebuildAI, useFallback

### `core/src/mindustry/ai/types/CargoAI.java`

- 知识页：[core-src-mindustry-ai-types-cargoai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-cargoai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/CargoAI.java`
- SHA1：`df8922bdfa5685f72d3512240fe41df8e2b1800c`
- 声明：class CargoAIextends AIController
- 字段线索：orderedItems, targets, emptyWaitTime, transferRange, unloadTarget, itemTarget
- 方法线索：updateMovement, findDropTarget, findAnyTarget

### `core/src/mindustry/ai/types/CommandAI.java`

- 知识页：[core-src-mindustry-ai-types-commandai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-commandai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/CommandAI.java`
- SHA1：`2b1c6700fad740c524f04b9e21d29d64ae7c02f5`
- 声明：class CommandAIextends AIController
- 字段线索：maxCommandQueueSize, vecOut, noFound, tmpPayload, transferStateNone, commandQueue
- 方法线索：currentCommand, command, hasStance, setStance, disableStance, stanceChanged

### `core/src/mindustry/ai/types/DefenderAI.java`

- 知识页：[core-src-mindustry-ai-types-defenderai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-defenderai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/DefenderAI.java`
- SHA1：`1543d3f22ccb23b60799690466ac8b5bfa375ed8`
- 声明：class DefenderAIextends AIController
- 字段线索：未抽取
- 方法线索：updateMovement, updateTargeting, findTarget

### `core/src/mindustry/ai/types/FlyingAI.java`

- 知识页：[core-src-mindustry-ai-types-flyingai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-flyingai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/FlyingAI.java`
- SHA1：`83baaae06cd142c581337cd100f1d12dcbfb48d7`
- 声明：class FlyingAIextends AIController
- 字段线索：rand, randomTargets
- 方法线索：updateMovement, findTarget, findMainTarget

### `core/src/mindustry/ai/types/FlyingFollowAI.java`

- 知识页：[core-src-mindustry-ai-types-flyingfollowai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-flyingfollowai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/FlyingFollowAI.java`
- SHA1：`8cb6838f1584f0aa8fa827de9b61ba7e30c8e85f`
- 声明：class FlyingFollowAIextends FlyingAI
- 字段线索：following
- 方法线索：updateMovement, shouldFaceTarget, updateVisuals, fallback, FlyingAI, useFallback

### `core/src/mindustry/ai/types/GroundAI.java`

- 知识页：[core-src-mindustry-ai-types-groundai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-groundai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/GroundAI.java`
- SHA1：`cce358e9d4fe650b426d13001acacfdc72cfe2b1`
- 声明：class GroundAIextends AIController
- 字段线索：stuckRange
- 方法线索：updateMovement

### `core/src/mindustry/ai/types/HugAI.java`

- 知识页：[core-src-mindustry-ai-types-hugai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-hugai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/HugAI.java`
- SHA1：`722584768fabaf3c5d19e34934e7d44d6e88d2d3`
- 声明：class HugAIextends AIController
- 字段线索：未抽取
- 方法线索：updateMovement

### `core/src/mindustry/ai/types/LogicAI.java`

- 知识页：[core-src-mindustry-ai-types-logicai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-logicai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/LogicAI.java`
- SHA1：`488ea01c4d16ff6ec637e70833cbb14abb144d88`
- 声明：class LogicAIextends AIController
- 字段线索：transferDelay, logicControlTimeout, control, moveRad, controlTimer, controller
- 方法线索：keepState, updateMovement, checkTargetTimer, checkTarget, retarget, invalid

### `core/src/mindustry/ai/types/MinerAI.java`

- 知识页：[core-src-mindustry-ai-types-minerai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-minerai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/MinerAI.java`
- SHA1：`6280431b941419deab71feae206c6ac4977e24fe`
- 声明：class MinerAIextends AIController
- 字段线索：mining, targetItem, ore
- 方法线索：stanceChanged, updateMovement

### `core/src/mindustry/ai/types/MissileAI.java`

- 知识页：[core-src-mindustry-ai-types-missileai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-missileai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/MissileAI.java`
- SHA1：`d206f61beab7d11b8b88d0a89478998b4761c666`
- 声明：class MissileAIextends AIController
- 字段线索：shooter
- 方法线索：resetTimers, updateMovement, target, retarget

### `core/src/mindustry/ai/types/PrebuildAI.java`

- 知识页：[core-src-mindustry-ai-types-prebuildai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-prebuildai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/PrebuildAI.java`
- SHA1：`44f9d736f64265bdf412b6df8ff636c9adb63817`
- 声明：class PrebuildAIextends AIController
- 字段线索：priorities, tmpCopy
- 方法线索：canBuild, updateMovement

### `core/src/mindustry/ai/types/RepairAI.java`

- 知识页：[core-src-mindustry-ai-types-repairai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-repairai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/RepairAI.java`
- SHA1：`35e1bd37af57e5f028dc54c61661804859ec6d8c`
- 声明：class RepairAIextends AIController
- 字段线索：retreatDst
- 方法线索：updateMovement, updateTargeting

### `core/src/mindustry/ai/types/SuicideAI.java`

- 知识页：[core-src-mindustry-ai-types-suicideai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-types-suicideai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/types/SuicideAI.java`
- SHA1：`a13bbd04d438ff239c310ace679e6c3aba8d0a65`
- 声明：class SuicideAIextends GroundAI
- 字段线索：blockedByBlock
- 方法线索：updateUnit, target


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
