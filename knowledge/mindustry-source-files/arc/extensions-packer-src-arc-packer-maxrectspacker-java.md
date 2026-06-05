# arc:extensions/packer/src/arc/packer/MaxRectsPacker.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/MaxRectsPacker.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`extensions/packer/src/arc/packer/MaxRectsPacker.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/extensions/packer/src/arc/packer/MaxRectsPacker.java`
- SHA1：`cf1b64f2668319fd10de71f16508df6447b2376c`
- 大小：34741 bytes
- 行数：758

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class MaxRectsPackerimplements Packer`。

关键词：arc

## Package

`arc.packer`

## 类型声明

- `class MaxRectsPackerimplements Packer`
- `class BinarySearch`
- `class MaxRects`
- `enum FreeRectChoiceHeuristic`

## 字段线索

- `settings`
- `methods`
- `maxRects`
- `sort`
- `rectComparator`
- `mod4`
- `fuzziness`
- `binHeight`
- `usedRectangles`
- `freeRectangles`
- `rectanglesToCheckWhenPruning`

## 方法线索

- `compare`
- `RuntimeException`
- `pack`
- `packPage`
- `packAtSize`
- `getBest`
- `reset`
- `next`
- `init`
- `insert`
- `getResult`
- `placeRect`
- `scoreRect`
- `getOccupancy`
- `findPositionForNewNodeBottomLeft`
- `findPositionForNewNodeBestShortSideFit`
- `findPositionForNewNodeBestLongSideFit`
- `findPositionForNewNodeBestAreaFit`
- `commonIntervalLength`
- `contactPointScoreNode`
- `findPositionForNewNodeContactPoint`
- `splitFreeNode`
- `pruneFreeList`
- `isContainedIn`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
