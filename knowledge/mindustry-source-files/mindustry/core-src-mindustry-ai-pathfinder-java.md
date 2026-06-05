# mindustry:core/src/mindustry/ai/Pathfinder.java

> Source: `/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/Pathfinder.java`

## 源码位置

- 仓库：`mindustry`
- 相对路径：`core/src/mindustry/ai/Pathfinder.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ai/Pathfinder.java`
- SHA1：`9cc2d62bac537970565198360cbda7ce6983421d`
- 大小：26682 bytes
- 行数：748

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class Pathfinderimplements Runnable`。

关键词：未命中固定关键词

## Package

`mindustry.ai`

## 类型声明

- `class Pathfinderimplements Runnable`
- `class EnemyCoreFieldextends Flowfield`
- `class PositionTargetextends Flowfield`
- `class Flowfield`
- `interface PathCost`
- `class PathTileStruct`

## 字段线索

- `maxUpdate`
- `neverRefresh`
- `updateFPS`
- `updateInterval`
- `wheight`
- `impassable`
- `fieldCore`
- `fieldTypes`
- `costGround`
- `costTypes`
- `lastRefreshTime`
- `refreshIntervalMs`
- `randomTargets`
- `rand`
- `position`
- `refreshRate`
- `team`
- `cost`
- `hasComplete`
- `dirty`

## 方法线索

- `clearCache`
- `packTile`
- `get`
- `start`
- `stop`
- `updateTile`
- `run`
- `getField`
- `updateTargets`
- `preloadPath`
- `registerPath`
- `updateFrontier`
- `getPositions`
- `getCost`
- `hasTargets`
- `hasCompleteWeights`
- `updateTargetPositions`
- `needsRefresh`
- `passable`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
