# Package `arc.maps.objects` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.maps.objects`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.maps.objects`
- 文件数：7

## 主要依赖线索

- `arc.maps.MapObject` × 6
- `arc.graphics.g2d.TextureRegion` × 2
- `arc.math.geom.Circle` × 1
- `arc.math.geom.Ellipse` × 1
- `arc.math.geom.Polygon` × 1
- `arc.math.geom.Polyline` × 1
- `arc.math.geom.Rect` × 1
- `arc.maps.*` × 1

## 文件逐个分析

### `extensions/tiled/src/arc/maps/objects/CircleMapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-objects-circlemapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-objects-circlemapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/objects/CircleMapObject.java`
- SHA1：`0badbc25ebe8bf7046974ccc54ab0d46bae6cdb7`
- 声明：class CircleMapObjectextends MapObject
- 字段线索：circle
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/objects/EllipseMapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-objects-ellipsemapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-objects-ellipsemapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/objects/EllipseMapObject.java`
- SHA1：`0262144e46be35c7d4ea33253722b11e2c31d9b1`
- 声明：class EllipseMapObjectextends MapObject
- 字段线索：ellipse
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/objects/PolygonMapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-objects-polygonmapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-objects-polygonmapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/objects/PolygonMapObject.java`
- SHA1：`148c54bc448ae984136b19f277ef2e8b0ad72e77`
- 声明：class PolygonMapObjectextends MapObject
- 字段线索：polygon
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/objects/PolylineMapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-objects-polylinemapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-objects-polylinemapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/objects/PolylineMapObject.java`
- SHA1：`98aac7fff4adbe4f13d9f7056235bfb32352e42a`
- 声明：class PolylineMapObjectextends MapObject
- 字段线索：polyline
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/objects/RectangleMapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-objects-rectanglemapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-objects-rectanglemapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/objects/RectangleMapObject.java`
- SHA1：`512cf2ba279a545e97273f1b84253323d00b7845`
- 声明：class RectangleMapObjectextends MapObject
- 字段线索：rect
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/objects/TextureMapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-objects-texturemapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-objects-texturemapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/objects/TextureMapObject.java`
- SHA1：`192c0d2b9a18f20444d14614a7a02df9b8ae31aa`
- 声明：class TextureMapObjectextends MapObject
- 字段线索：x, y, originX, originY, scaleX, scaleY
- 方法线索：未抽取

### `extensions/tiled/src/arc/maps/objects/TileMapObject.java`

- 知识页：[extensions-tiled-src-arc-maps-objects-tilemapobject-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-objects-tilemapobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/objects/TileMapObject.java`
- SHA1：`f2a53c40b0636ec9da62f7c7263103d7ad8dd4d1`
- 声明：class TileMapObjectextends TextureMapObject
- 字段线索：flipHorizontally, flipVertically, tile
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
