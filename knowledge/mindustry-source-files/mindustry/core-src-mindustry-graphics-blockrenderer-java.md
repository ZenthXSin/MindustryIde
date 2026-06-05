# mindustry:core/src/mindustry/graphics/BlockRenderer.java

> Source: `/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/BlockRenderer.java`

## 源码位置

- 仓库：`mindustry`
- 相对路径：`core/src/mindustry/graphics/BlockRenderer.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/BlockRenderer.java`
- SHA1：`18c48fb407fb87ab8cb098d27a1ad2fd10d7b476`
- 大小：22682 bytes
- 行数：651

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class BlockRenderer`。

关键词：block, graphics

## Package

`mindustry.graphics`

## 类型声明

- `class BlockRenderer`
- `class BlockQuadtreeextends QuadTree<Tile>`
- `class BlockLightQuadtreeextends QuadTree<Tile>`
- `class OverlayQuadtreeextends QuadTree<Tile>`
- `class FloorQuadtreeextends QuadTree<Tile>`

## 字段线索

- `crackRegions`
- `drawQuadtreeDebug`
- `shadowColor`
- `initialRequests`
- `floor`
- `cracks`
- `tileview`
- `lightview`
- `updateFloors`
- `hadMapLimit`
- `lastRangeY`
- `brokenFade`
- `shadows`
- `dark`
- `outArray2`
- `shadowEvents`
- `darkEvents`
- `procLinks`
- `blockTree`
- `blockLightTree`

## 方法线索

- `reload`
- `updateShadows`
- `updateDarkness`
- `invalidateTile`
- `getShadowBuffer`
- `removeFloorIndex`
- `addFloorIndex`
- `removeOverlayIndex`
- `addOverlayIndex`
- `recacheWall`
- `checkChanges`
- `drawDarkness`
- `drawDestroyed`
- `processShadows`
- `drawShadows`
- `processBlocks`
- `drawBlocks`
- `updateShadow`
- `updateShadowTile`
- `hitbox`
- `newChild`
- `BlockQuadtree`
- `BlockLightQuadtree`
- `OverlayQuadtree`
- `FloorQuadtree`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
