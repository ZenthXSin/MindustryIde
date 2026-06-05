# arc:extensions/tiled/src/arc/maps/loaders/BaseTmxMapLoader.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/loaders/BaseTmxMapLoader.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`extensions/tiled/src/arc/maps/loaders/BaseTmxMapLoader.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/extensions/tiled/src/arc/maps/loaders/BaseTmxMapLoader.java`
- SHA1：`15de46a4318973de4aee3f29648cabcc1d76c6f7`
- 大小：19513 bytes
- 行数：440

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class BaseTmxMapLoader<P extends AssetLoaderParameters<TiledMap>> extends AsynchronousAssetLoader<TiledMap, P>`。

关键词：load, tile, arc

## Package

`arc.maps.loaders`

## 类型声明

- `class BaseTmxMapLoader<P extends AssetLoaderParameters<TiledMap>> extends AsynchronousAssetLoader<TiledMap, P>`
- `class Parametersextends AssetLoaderParameters<TiledMap>`

## 字段线索

- `FLAG_FLIP_HORIZONTALLY`
- `FLAG_FLIP_VERTICALLY`
- `FLAG_FLIP_DIAGONALLY`
- `MASK_CLEAR`
- `xml`
- `root`
- `convertObjectToTileSpace`
- `flipY`
- `mapTileWidth`
- `mapTileHeight`
- `mapWidthInPixels`
- `mapHeightInPixels`
- `map`
- `generateMipMaps`
- `textureMinFilter`
- `textureMagFilter`

## 方法线索

- `ArcRuntimeException`
- `loadTileGroup`
- `loadLayer`
- `loadTileLayer`
- `loadObjectGroup`
- `loadImageLayer`
- `loadBasicLayerInfo`
- `loadObject`
- `loadProperties`
- `castProperty`
- `createTileLayerCell`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
