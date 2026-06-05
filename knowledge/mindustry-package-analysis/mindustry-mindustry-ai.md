# Package `mindustry.ai` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ai`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

原版内容定义包：集中声明 Blocks、Items、Liquids、UnitTypes、Planets 等内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ai`
- 文件数：13

## 主要依赖线索

- `arc.util.*` × 13
- `arc.struct.*` × 12
- `arc.*` × 10
- `mindustry.gen.*` × 9
- `arc.math.geom.*` × 8
- `arc.math.*` × 8
- `mindustry.world.*` × 7
- `mindustry.content.*` × 6
- `mindustry.core.*` × 6
- `mindustry.game.*` × 6
- `mindustry.type.*` × 6
- `arc.func.*` × 5
- `mindustry.game.EventType.*` × 5
- `mindustry.*` × 4
- `mindustry.game.Teams.*` × 3
- `mindustry.world.blocks.storage.*` × 3
- `mindustry.ctype.*` × 3
- `mindustry.world.blocks.environment.*` × 3
- `mindustry.ai.types.*` × 3
- `mindustry.entities.*` × 3

## 文件逐个分析

### `core/src/mindustry/ai/Astar.java`

- 知识页：[core-src-mindustry-ai-astar-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-astar-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/Astar.java`
- SHA1：`f4787dc6251e9eccd365b37f4d6009f8bfc7c72d`
- 声明：class Astar, interface DistanceHeuristic, interface TileHeuristic
- 字段线索：manhattan, out, queue, costs, rotations
- 方法线索：cost

### `core/src/mindustry/ai/BaseBuilderAI.java`

- 知识页：[core-src-mindustry-ai-basebuilderai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-basebuilderai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/BaseBuilderAI.java`
- SHA1：`2279484060e76a58d02fdc610c49d4859030cbd7`
- 声明：class BaseBuilderAI
- 字段线索：axis, attempts, emptyChance, timerStep, placeIntervalMin, pathStep
- 方法线索：update, randomPosition, tryPlace

### `core/src/mindustry/ai/BaseRegistry.java`

- 知识页：[core-src-mindustry-ai-baseregistry-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-baseregistry-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/BaseRegistry.java`
- SHA1：`48459232a2dceeaf48920f0d74857238692ff355`
- 声明：class BaseRegistry, class BasePartimplements Comparable<BasePart>
- 字段线索：cores, parts, reqParts, ores, oreFloors, schematic
- 方法线索：forResource, load, RuntimeException, compareTo

### `core/src/mindustry/ai/BlockIndexer.java`

- 知识页：[core-src-mindustry-ai-blockindexer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-blockindexer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/BlockIndexer.java`
- SHA1：`90f3c23d59c2b6a377e15ca762e54126568e804b`
- 声明：class BlockIndexer, class TurretQuadtreeextends QuadTree<Building>
- 字段线索：quadrantSize, rect, returnBool, quadHeight, wallOres, damagedTiles
- 方法线索：getAllPresentOres, updatePresentOres, removeFloorIndex, addFloorIndex, getFlaggedFloors, removeIndex

### `core/src/mindustry/ai/ControlPathfinder.java`

- 知识页：[core-src-mindustry-ai-controlpathfinder-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-controlpathfinder-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/ControlPathfinder.java`
- SHA1：`bf830e0368960ee21d7fc4475f8b58e963538682`
- 声明：class ControlPathfinderimplements Runnable, class PathRequest, class FieldCache
- 字段线索：wallImpassableCap, solidCap, initialized, showDebug, costGround, costIdGround
- 方法线索：checkEvents, updateTile, updateSingleTile, start, stop, getCluster

### `core/src/mindustry/ai/ItemUnitStance.java`

- 知识页：[core-src-mindustry-ai-itemunitstance-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-itemunitstance-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/ItemUnitStance.java`
- SHA1：`ee1ed6a2a4f8d360bc50238c645e14258fd201a8`
- 声明：class ItemUnitStanceextends UnitStance
- 字段线索：itemToStance, all, item
- 方法线索：localized, getIcon, TextureRegionDrawable

### `core/src/mindustry/ai/PathfindQueue.java`

- 知识页：[core-src-mindustry-ai-pathfindqueue-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-pathfindqueue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/PathfindQueue.java`
- SHA1：`46b0e48d007ca3218d8941ebdee08e471a2c933d`
- 声明：class PathfindQueue
- 字段线索：CAPACITY_RATIO_LOW, CAPACITY_RATIO_HI, queue, weights, size
- 方法线索：empty, add, peek, clear, poll, siftUp

### `core/src/mindustry/ai/Pathfinder.java`

- 知识页：[core-src-mindustry-ai-pathfinder-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-pathfinder-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/Pathfinder.java`
- SHA1：`9cc2d62bac537970565198360cbda7ce6983421d`
- 声明：class Pathfinderimplements Runnable, class EnemyCoreFieldextends Flowfield, class PositionTargetextends Flowfield
- 字段线索：maxUpdate, neverRefresh, updateFPS, updateInterval, wheight, impassable
- 方法线索：clearCache, packTile, get, start, stop, updateTile

### `core/src/mindustry/ai/RtsAI.java`

- 知识页：[core-src-mindustry-ai-rtsai-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-rtsai-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/RtsAI.java`
- SHA1：`2418efb41f7e4aa78aa5736e138a8381962a61a0`
- 声明：class RtsAI
- 字段线索：targets, squad, used, assignedTargets, squadRadius, timeUpdate
- 方法线索：update, findTarget

### `core/src/mindustry/ai/UnitCommand.java`

- 知识页：[core-src-mindustry-ai-unitcommand-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-unitcommand-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/UnitCommand.java`
- SHA1：`186c655e1dee59a1396ff247baca86ed758cad0c`
- 声明：class UnitCommandextends MappableContent
- 字段线索：loopPayloadCommand, icon, controller, switchToMove, drawTarget, resetTarget
- 方法线索：localized, getIcon, getEmoji, getContentType, toString

### `core/src/mindustry/ai/UnitGroup.java`

- 知识页：[core-src-mindustry-ai-unitgroup-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-unitgroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/UnitGroup.java`
- SHA1：`5fe8a2f348530550f2b69d05af008444811a2d18`
- 声明：class UnitGroup
- 字段线索：units, collisionLayer, originalPositions, valid
- 方法线索：calculateFormation, updateRaycast

### `core/src/mindustry/ai/UnitStance.java`

- 知识页：[core-src-mindustry-ai-unitstance-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-unitstance-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/UnitStance.java`
- SHA1：`f2649ac67ef70c2b6be462653255d0359948b68d`
- 声明：class UnitStanceextends MappableContent
- 字段线索：mineAuto, icon, keybind, incompatibleCommands, incompatibleStances, toggle
- 方法线索：init, isCompatible, localized, getIcon, getEmoji, getContentType

### `core/src/mindustry/ai/WaveSpawner.java`

- 知识页：[core-src-mindustry-ai-wavespawner-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ai-wavespawner-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/WaveSpawner.java`
- SHA1：`9524e55aa564c3b4547203f0df68648b09383b9a`
- 声明：class WaveSpawner, interface SpawnConsumer
- 字段线索：margin, tmpCount, spawns, spawning, any, firstSpawn
- 方法线索：getFirstSpawn, countSpawns, getSpawns, playerNear, spawnEnemies, spawnUnit


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
