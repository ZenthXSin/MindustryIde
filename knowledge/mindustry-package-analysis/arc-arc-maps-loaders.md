# Package `arc.maps.loaders` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.maps.loaders`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.maps.loaders`
- 文件数：4

## 主要依赖线索

- `arc.graphics.g2d.TextureRegion` × 3
- `arc.assets.loaders.FileHandleResolver` × 2
- `arc.maps.loaders.XmlReader.*` × 2
- `arc.struct.Seq` × 2
- `arc.files.Fi` × 2
- `arc.maps.*` × 2
- `arc.util.ArcRuntimeException` × 2
- `java.io.*` × 2
- `arc.assets.AssetManager` × 2
- `arc.struct.ObjectMap` × 2
- `arc.graphics.Texture` × 2
- `arc.assets.AssetLoaderParameters` × 1
- `arc.assets.loaders.AsynchronousAssetLoader` × 1
- `arc.graphics.Color` × 1
- `arc.graphics.Texture.TextureFilter` × 1
- `arc.maps.objects.*` × 1
- `arc.maps.TileLayer.Cell` × 1
- `arc.math.geom.Polygon` × 1
- `arc.math.geom.Polyline` × 1
- `arc.util.io.Streams` × 1

## 文件逐个分析

### `extensions/tiled/src/arc/maps/loaders/BaseTmxMapLoader.java`

- 知识页：[extensions-tiled-src-arc-maps-loaders-basetmxmaploader-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-loaders-basetmxmaploader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/loaders/BaseTmxMapLoader.java`
- SHA1：`15de46a4318973de4aee3f29648cabcc1d76c6f7`
- 声明：class BaseTmxMapLoader<P extends AssetLoaderParameters<TiledMap>> extends AsynchronousAssetLoader<TiledMap, P>, class Parametersextends AssetLoaderParameters<TiledMap>
- 字段线索：FLAG_FLIP_HORIZONTALLY, FLAG_FLIP_VERTICALLY, FLAG_FLIP_DIAGONALLY, MASK_CLEAR, xml, root
- 方法线索：ArcRuntimeException, loadTileGroup, loadLayer, loadTileLayer, loadObjectGroup, loadImageLayer

### `extensions/tiled/src/arc/maps/loaders/ImageResolver.java`

- 知识页：[extensions-tiled-src-arc-maps-loaders-imageresolver-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-loaders-imageresolver-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/loaders/ImageResolver.java`
- SHA1：`56d532b42e4c7c15b375ffa788522c3467297284`
- 声明：interface ImageResolver, class DirectImageResolverimplements ImageResolver, class AssetManagerImageResolverimplements ImageResolver
- 字段线索：images, assetManager, atlas
- 方法线索：getImage, TextureRegion

### `extensions/tiled/src/arc/maps/loaders/TmxMapLoader.java`

- 知识页：[extensions-tiled-src-arc-maps-loaders-tmxmaploader-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-loaders-tmxmaploader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/loaders/TmxMapLoader.java`
- SHA1：`4a05e950c5e2e8bd34273f08eb2eed21eefa0899`
- 声明：class TmxMapLoaderextends BaseTmxMapLoader<TmxMapLoader.Parameters>, class Parametersextends BaseTmxMapLoader.Parameters
- 字段线索：未抽取
- 方法线索：load, ArcRuntimeException, loadAsync, loadSync, getDependencies, loadTilemap

### `extensions/tiled/src/arc/maps/loaders/XmlReader.java`

- 知识页：[extensions-tiled-src-arc-maps-loaders-xmlreader-java.md](../mindustry-source-files/arc/extensions-tiled-src-arc-maps-loaders-xmlreader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/loaders/XmlReader.java`
- SHA1：`7efacec27deb83cf28b059fa15c4da15b4a856f2`
- 声明：class XmlReader, class Xml
- 字段线索：xml_start, _xml_actions, _xml_key_offsets, _xml_trans_keys, _xml_single_lengths, _xml_range_lengths
- 方法线索：parse, SerializationException, open, attribute, entity, text


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
