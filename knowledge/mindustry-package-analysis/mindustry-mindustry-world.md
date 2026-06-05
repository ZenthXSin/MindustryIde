# Package `mindustry.world` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world`
- 文件数：12

## 主要依赖线索

- `arc.util.*` × 7
- `mindustry.gen.*` × 7
- `arc.math.*` × 5
- `arc.math.geom.*` × 5
- `mindustry.annotations.Annotations.*` × 5
- `mindustry.content.*` × 5
- `arc.func.*` × 4
- `arc.struct.*` × 4
- `mindustry.type.*` × 4
- `arc.*` × 3
- `arc.graphics.*` × 3
- `mindustry.game.*` × 3
- `arc.scene.ui.layout.*` × 2
- `mindustry.entities.*` × 2
- `mindustry.game.EventType.*` × 2
- `arc.util.io.*` × 2
- `java.util.*` × 2
- `arc.audio.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.graphics.g2d.TextureAtlas.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/Block.java`

- 知识页：[core-src-mindustry-world-block-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-block-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/Block.java`
- SHA1：`0264ec5beee63d609f6924d973097e8b884b34ab`
- 声明：class Blockextends UnlockableContent implements Senseable
- 字段线索：hasItems, hasLiquids, hasPower, outputsLiquid, consumesPower, outputsPower
- 方法线索：drawBase, drawShadow, percentSolid, drawEnvironmentLight, drawPlace, drawSideRegion

### `core/src/mindustry/world/Build.java`

- 知识页：[core-src-mindustry-world-build-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-build-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/Build.java`
- SHA1：`315207a1c9df1c20a25616700ace99902db36683`
- 声明：class Build
- 字段线索：tmp
- 方法线索：未抽取

### `core/src/mindustry/world/CachedTile.java`

- 知识页：[core-src-mindustry-world-cachedtile-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-cachedtile-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/CachedTile.java`
- SHA1：`9f47ca01f5e2aeae1294a246e03ebc5fe4a8103f`
- 声明：class CachedTileextends Tile
- 字段线索：未抽取
- 方法线索：preChanged, changeBuild

### `core/src/mindustry/world/ColorMapper.java`

- 知识页：[core-src-mindustry-world-colormapper-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-colormapper-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/ColorMapper.java`
- SHA1：`765082b8bb650eb3802174282dc2f2e7f471f595`
- 声明：class ColorMapper
- 字段线索：color2block
- 方法线索：未抽取

### `core/src/mindustry/world/DirectionalItemBuffer.java`

- 知识页：[core-src-mindustry-world-directionalitembuffer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-directionalitembuffer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/DirectionalItemBuffer.java`
- SHA1：`6908cbe054332e179dff98b3cfd2dce88142d47d`
- 声明：class DirectionalItemBuffer, class BufferItemStruct, class BufferItemLegacyStruct
- 字段线索：buffers, indexes
- 方法线索：accepts, accept, poll, remove, write, read

### `core/src/mindustry/world/Edges.java`

- 知识页：[core-src-mindustry-world-edges-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-edges-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/Edges.java`
- SHA1：`aa9e97e2bf31e382822653db00232e154a119b81`
- 声明：class Edges
- 字段线索：maxRadius, edges, edgeInside, polygons
- 方法线索：RuntimeException

### `core/src/mindustry/world/ItemBuffer.java`

- 知识页：[core-src-mindustry-world-itembuffer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-itembuffer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/ItemBuffer.java`
- SHA1：`511d99ce19ec3f4178639a5d7e33a2c74833c922`
- 声明：class ItemBuffer, class TimeItemStruct
- 字段线索：buffer, index
- 方法线索：accepts, accept, poll, remove, write, read

### `core/src/mindustry/world/Tile.java`

- 知识页：[core-src-mindustry-world-tile-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-tile-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/Tile.java`
- SHA1：`567321aa78f83bbb554f2aef746a1c5c01a8e7a3`
- 声明：class Tileimplements Position, QuadTreeObject, Displayable, class PackedTileDataStruct
- 字段线索：tileChange, preChange, floorChange, overlayChange, tileSet, staleGraphs
- 方法线索：pos, array, relativeTo, absoluteRelativeTo, getFlammability, worldx

### `core/src/mindustry/world/TileGen.java`

- 知识页：[core-src-mindustry-world-tilegen-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-tilegen-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/TileGen.java`
- SHA1：`51e016dee5174ead4f97a5eed61d76f2cd252de8`
- 声明：class TileGen
- 字段线索：floor, block, overlay
- 方法线索：reset

### `core/src/mindustry/world/Tiles.java`

- 知识页：[core-src-mindustry-world-tiles-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-tiles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/Tiles.java`
- SHA1：`bd42b1c57723a68b04424ff74b7089ff27eb48d1`
- 声明：class Tilesimplements Iterable<Tile>, class TileIteratorimplements Iterator<Tile>
- 字段线索：height, array, puddles, fires
- 方法线索：getTmpFloorState, setTmpFloorState, getTmpBlockState, setTmpBlockState, getPuddle, setPuddle

### `core/src/mindustry/world/WorldContext.java`

- 知识页：[core-src-mindustry-world-worldcontext-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-worldcontext-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/WorldContext.java`
- SHA1：`aa82e24facd00160c6736e951dd2cc56b1f587c2`
- 声明：interface WorldContext
- 字段线索：未抽取
- 方法线索：onReadBuilding, onReadTileData, isMap

### `core/src/mindustry/world/WorldParams.java`

- 知识页：[core-src-mindustry-world-worldparams-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-worldparams-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/WorldParams.java`
- SHA1：`a728592119ba1bdc66c8eb7d5ac0a0bf12964bc4`
- 声明：class WorldParams
- 字段线索：seedOffset, saveInfo, corePositionOverride
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
