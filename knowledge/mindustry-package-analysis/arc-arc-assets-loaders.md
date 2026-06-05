# Package `arc.assets.loaders` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.assets.loaders`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`arc.assets.loaders`
- 文件数：14

## 主要依赖线索

- `arc.files.Fi` × 8
- `arc.assets.AssetLoaderParameters` × 7
- `arc.assets.AssetManager` × 7
- `arc.assets.*` × 6
- `arc.files.*` × 6
- `arc.struct.*` × 6
- `arc.assets.AssetDescriptor` × 5
- `arc.struct.Seq` × 5
- `arc.graphics.*` × 3
- `arc.*` × 3
- `arc.graphics.Texture.*` × 2
- `arc.audio.*` × 2
- `arc.util.*` × 2
- `arc.graphics.Pixmap.*` × 1
- `arc.assets.loaders.FontLoader.*` × 1
- `arc.graphics.Texture` × 1
- `arc.graphics.Texture.TextureFilter` × 1
- `arc.graphics.g2d.Font` × 1
- `arc.graphics.g2d.Font.FontData` × 1
- `arc.graphics.g2d.TextureAtlas` × 1

## 文件逐个分析

### `arc-core/src/arc/assets/loaders/AssetLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-assetloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-assetloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/AssetLoader.java`
- SHA1：`9fafc9451f2364dd9c1af89d0561d6a236e7c5cc`
- 声明：class AssetLoader<T, P extends AssetLoaderParameters<T>>
- 字段线索：resolver
- 方法线索：resolve

### `arc-core/src/arc/assets/loaders/AsynchronousAssetLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-asynchronousassetloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-asynchronousassetloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/AsynchronousAssetLoader.java`
- SHA1：`18fc80a09d5f851a29b927146e80ad62e87e078f`
- 声明：class AsynchronousAssetLoader<T, P extends AssetLoaderParameters<T>> extends AssetLoader<T, P>
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/assets/loaders/CubemapLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-cubemaploader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-cubemaploader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/CubemapLoader.java`
- SHA1：`a48406cc601ddba274595730d68ca8daf78ef0a1`
- 声明：class CubemapLoaderextends AsynchronousAssetLoader<Cubemap, CubemapLoader.CubemapParameter>, class CubemapLoaderInfo, class CubemapParameterextends AssetLoaderParameters<Cubemap>
- 字段线索：format, cubemap, cubemapData, minFilter, magFilter, wrapU
- 方法线索：loadAsync, loadSync, getDependencies

### `arc-core/src/arc/assets/loaders/CustomLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-customloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-customloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/CustomLoader.java`
- SHA1：`e346d52420b8e4e5da415aecfcd6cfc6440d596c`
- 声明：class CustomLoaderextends AsynchronousAssetLoader
- 字段线索：loaded
- 方法线索：loadSync, getDependencies

### `arc-core/src/arc/assets/loaders/FileHandleResolver.java`

- 知识页：[arc-core-src-arc-assets-loaders-filehandleresolver-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-filehandleresolver-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/FileHandleResolver.java`
- SHA1：`91c4091edc01f2484b347a32927ce509020d54ae`
- 声明：interface FileHandleResolver
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/assets/loaders/FontLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-fontloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-fontloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/FontLoader.java`
- SHA1：`5b87c3ba88dab09bacf6a0681954c1d2a8614d0c`
- 声明：class FontLoaderextends AsynchronousAssetLoader<Font, FontParameter>, class FontParameterextends AssetLoaderParameters<Font>
- 字段线索：flip, genMipMaps, minFilter, magFilter, fontData, atlasName
- 方法线索：getDependencies, loadAsync, loadSync, ArcRuntimeException, Font

### `arc-core/src/arc/assets/loaders/I18NBundleLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-i18nbundleloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-i18nbundleloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/I18NBundleLoader.java`
- SHA1：`844d55649f27203ea46a838276840656c77dd988`
- 声明：class I18NBundleLoaderextends AsynchronousAssetLoader<I18NBundle, I18NBundleLoader.I18NBundleParameter>, class I18NBundleParameterextends AssetLoaderParameters<I18NBundle>
- 字段线索：locale, encoding
- 方法线索：loadAsync, loadSync, getDependencies

### `arc-core/src/arc/assets/loaders/MusicLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-musicloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-musicloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/MusicLoader.java`
- SHA1：`3ff550611542b5b1a2cba883077763c27653f7d7`
- 声明：class MusicLoaderextends AsynchronousAssetLoader<Music, MusicLoader.MusicParameter>, class MusicParameterextends AssetLoaderParameters<Music>
- 字段线索：music
- 方法线索：getLoadedMusic, loadAsync, loadSync, getDependencies

### `arc-core/src/arc/assets/loaders/PixmapLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-pixmaploader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-pixmaploader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/PixmapLoader.java`
- SHA1：`ed0e25bb77eb695c9426cdc2d5fba844df981e0c`
- 声明：class PixmapLoaderextends AsynchronousAssetLoader<Pixmap, PixmapLoader.PixmapParameter>, class PixmapParameterextends AssetLoaderParameters<Pixmap>
- 字段线索：未抽取
- 方法线索：loadAsync, loadSync, getDependencies

### `arc-core/src/arc/assets/loaders/ShaderProgramLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-shaderprogramloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-shaderprogramloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/ShaderProgramLoader.java`
- SHA1：`02c93f078986dc183e1b2172b25f619aa39d768b`
- 声明：class ShaderProgramLoaderextends AsynchronousAssetLoader<Shader, ShaderProgramLoader.ShaderProgramParameter>, class ShaderProgramParameterextends AssetLoaderParameters<Shader>
- 字段线索：vertexFileSuffix, fragmentFileSuffix, vertexFile, fragmentFile, logOnCompileFailure, prependVertexCode
- 方法线索：getDependencies, loadAsync, loadSync

### `arc-core/src/arc/assets/loaders/SoundLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-soundloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-soundloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/SoundLoader.java`
- SHA1：`63071871eb792e309e6513763164038e7637b554`
- 声明：class SoundLoaderextends AsynchronousAssetLoader<Sound, SoundLoader.SoundParameter>, class SoundParameterextends AssetLoaderParameters<Sound>
- 字段线索：sound
- 方法线索：getLoadedSound, loadAsync, loadSync, getDependencies

### `arc-core/src/arc/assets/loaders/SynchronousAssetLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-synchronousassetloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-synchronousassetloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/SynchronousAssetLoader.java`
- SHA1：`f2584a4813cb4da887933fd8a11a21b15db538e7`
- 声明：class SynchronousAssetLoader<T, P extends AssetLoaderParameters<T>> extends AssetLoader<T, P>
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/assets/loaders/TextureAtlasLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-textureatlasloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-textureatlasloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/TextureAtlasLoader.java`
- SHA1：`37da0d8101d3ddd55d5606f0f1b110abb37c5630`
- 声明：class TextureAtlasLoaderextends SynchronousAssetLoader<TextureAtlas, TextureAtlasLoader.TextureAtlasParameter>, class TextureAtlasParameterextends AssetLoaderParameters<TextureAtlas>
- 字段线索：flip
- 方法线索：load, getDependencies

### `arc-core/src/arc/assets/loaders/TextureLoader.java`

- 知识页：[arc-core-src-arc-assets-loaders-textureloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loaders-textureloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/loaders/TextureLoader.java`
- SHA1：`41d5ed0c8ce1a1f2d07dcb186b8d711cb8a42745`
- 声明：class TextureLoaderextends AsynchronousAssetLoader<Texture, TextureLoader.TextureParameter>, class TextureLoaderInfo, class TextureParameterextends AssetLoaderParameters<Texture>
- 字段线索：genMipMaps, texture, textureData, minFilter, magFilter, wrapU
- 方法线索：loadAsync, loadSync, getDependencies


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
