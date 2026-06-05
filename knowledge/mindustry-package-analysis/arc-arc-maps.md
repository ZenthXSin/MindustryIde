# Package `arc.maps` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.maps`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.maps`
- 文件数：10

## 主要依赖线索

- `arc.struct.Seq` × 5
- `java.util.Iterator` × 3
- `arc.graphics.g2d.TextureRegion` × 2
- `arc.util.ArcRuntimeException` × 1
- `arc.graphics.Color` × 1
- `arc.struct.ObjectMap` × 1
- `arc.struct.IntMap` × 1
- `arc.assets.AssetManager` × 1
- `arc.util.Disposable` × 1

## 文件逐个分析

### `extensions/tiled/src/arc/maps/ImageLayer.java`

- 知识页：[extensions-tiled-src-arc-maps-imagelayer-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-imagelayer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/ImageLayer.java`
- SHA1：`a27a5a6fe232c69d5e83c0cfb5444d8fb3d3d6c9`
- 声明：class ImageLayerextends MapLayer
- 字段线索：region, x, y
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/MapGroupLayer.java`

- 知识页：[extensions-tiled-src-arc-maps-mapgrouplayer-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-mapgrouplayer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/MapGroupLayer.java`
- SHA1：`6769edf8edbc79b430c53e9ec3d986e40d90a474`
- 声明：class MapGroupLayerextends MapLayer
- 字段线索：layers
- 方法线索：invalidateRenderOffset

### `extensions/tiled/src/arc/maps/MapLayer.java`

- 知识页：[extensions-tiled-src-arc-maps-maplayer-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-maplayer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/MapLayer.java`
- SHA1：`ba487e44fa8f063e4bcc05a4bea9570e70a030dd`
- 声明：class MapLayer
- 字段线索：name, opacity, visible, offsetX, offsetY, renderOffsetX
- 方法线索：getOffsetX, setOffsetX, getOffsetY, setOffsetY, getRenderOffsetX, getRenderOffsetY

### `extensions/tiled/src/arc/maps/MapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-mapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-mapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/MapObject.java`
- SHA1：`c95a5eef2b01fb79224aa88d67c6ba8200e0f7e0`
- 声明：class MapObject
- 字段线索：name, opacity, visible, properties, color
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/MapProperties.java`

- 知识页：[extensions-tiled-src-arc-maps-mapproperties-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-mapproperties-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/MapProperties.java`
- SHA1：`36561614c0797ccdf8c25e9795f74be26054ddf8`
- 声明：class MapProperties
- 字段线索：properties
- 方法线索：containsKey, put, putAll, remove, clear, getKeys

### `extensions/tiled/src/arc/maps/MapTile.java`

- 知识页：[extensions-tiled-src-arc-maps-maptile-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-maptile-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/MapTile.java`
- SHA1：`81e9263e3215e6531914d4d2759444f9a3d48566`
- 声明：class MapTile
- 字段线索：id, region, offsetX, offsetY, properties, objects
- 方法线索：getProperties, getObjects

### `extensions/tiled/src/arc/maps/TileLayer.java`

- 知识页：[extensions-tiled-src-arc-maps-tilelayer-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-tilelayer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/TileLayer.java`
- SHA1：`ce7b59e4bf41dc5047ad3b2cc68529bcc7aa3087`
- 声明：class TileLayerextends MapLayer, class Cell
- 字段线索：width, height, tileWidth, tileHeight, cells, ROTATE_0
- 方法线索：getCell, setCell, getTile

### `extensions/tiled/src/arc/maps/TileSet.java`

- 知识页：[extensions-tiled-src-arc-maps-tileset-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-tileset-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/TileSet.java`
- SHA1：`797d8b5639c0f174186a19ce57779255625298f5`
- 声明：class TileSetimplements Iterable<MapTile>
- 字段线索：name, properties, tiles
- 方法线索：getProperties, get, iterator, put, remove, size

### `extensions/tiled/src/arc/maps/TileSets.java`

- 知识页：[extensions-tiled-src-arc-maps-tilesets-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-tilesets-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/TileSets.java`
- SHA1：`8693978beb2f0369a8bdfc0d10db183b751b6aa3`
- 声明：class TileSetsimplements Iterable<TileSet>
- 字段线索：tilesets
- 方法线索：getTileSet, addTileSet, removeTileSet, getTile, iterator

### `extensions/tiled/src/arc/maps/TiledMap.java`

- 知识页：[extensions-tiled-src-arc-maps-tiledmap-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-tiledmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/TiledMap.java`
- SHA1：`49bfbfac2ea36bb012b67092cbadfadcde464381`
- 声明：class TiledMapimplements Disposable
- 字段线索：layers, properties, tilesets, ownedResources
- 方法线索：setOwnedResources, dispose


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
