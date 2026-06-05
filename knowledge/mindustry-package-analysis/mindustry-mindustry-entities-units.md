# Package `mindustry.entities.units` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities.units`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

实体系统包：负责单位、子弹、特效、群组、AI 行为和运行时实体逻辑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities.units`
- 文件数：5

## 主要依赖线索

- `arc.util.*` × 4
- `mindustry.gen.*` × 4
- `mindustry.type.*` × 3
- `arc.math.geom.*` × 2
- `mindustry.game.*` × 2
- `mindustry.world.*` × 2
- `arc.math.*` × 1
- `mindustry.*` × 1
- `mindustry.ai.*` × 1
- `mindustry.ai.types.*` × 1
- `mindustry.async.*` × 1
- `mindustry.entities.*` × 1
- `mindustry.world.blocks.payloads.*` × 1
- `mindustry.world.meta.*` × 1
- `arc.func.*` × 1
- `arc.math.geom.QuadTree.*` × 1
- `mindustry.content.*` × 1
- `mindustry.audio.*` × 1

## 文件逐个分析

### `core/src/mindustry/entities/units/AIController.java`

- 知识页：[core-src-mindustry-entities-units-aicontroller-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-units-aicontroller-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/units/AIController.java`
- SHA1：`403faffe5b05bfb823d1d1fc8a696825ca8ac881`
- 声明：class AIControllerimplements UnitController
- 字段线索：vec, rotateBackTimer, timerTarget, unit, timer, fallback
- 方法线索：resetTimers, updateUnit, hasStance, stanceChanged, keepState, afterRead

### `core/src/mindustry/entities/units/BuildPlan.java`

- 知识页：[core-src-mindustry-entities-units-buildplan-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-units-buildplan-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/units/BuildPlan.java`
- SHA1：`94c95f001b6a92af958edf72849845b437c8c307`
- 声明：class BuildPlanimplements Position, QuadTreeObject
- 字段线索：rotation, block, breaking, config, progress, cachedValid
- 方法线索：placeable, isRotation, isDerelictRepair, samePos, pointConfig, copy

### `core/src/mindustry/entities/units/StatusEntry.java`

- 知识页：[core-src-mindustry-entities-units-statusentry-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-units-statusentry-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/units/StatusEntry.java`
- SHA1：`45febf445f6793c1975e20c7113c4eae6ab90ea3`
- 声明：class StatusEntry
- 字段线索：effect, time, damageTime, damageMultiplier
- 方法线索：set

### `core/src/mindustry/entities/units/UnitController.java`

- 知识页：[core-src-mindustry-entities-units-unitcontroller-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-units-unitcontroller-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/units/UnitController.java`
- SHA1：`a358f0a4dc65a225ad744e3b998834e728c82615`
- 声明：interface UnitController
- 字段线索：未抽取
- 方法线索：unit, hit, isValidController, isLogicControllable, updateUnit, removed

### `core/src/mindustry/entities/units/WeaponMount.java`

- 知识页：[core-src-mindustry-entities-units-weaponmount-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-units-weaponmount-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/units/WeaponMount.java`
- SHA1：`85c0b5428460f2b6c2a68a3ba562efd0f0a104a6`
- 声明：class WeaponMount
- 字段线索：weapon, reload, rotation, recoil, recoils, targetRotation
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
