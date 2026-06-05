# Package `arc.assets` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.assets`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`arc.assets`
- 文件数：6

## 主要依赖线索

- `arc.util.*` × 3
- `arc.files.*` × 2
- `java.util.concurrent.*` × 2
- `arc.struct.*` × 2
- `arc.func.*` × 1
- `arc.assets.loaders.AssetLoader` × 1
- `arc.assets.loaders.AsynchronousAssetLoader` × 1
- `arc.assets.loaders.SynchronousAssetLoader` × 1
- `arc.struct.Seq` × 1
- `arc.files.Fi` × 1
- `arc.*` × 1
- `arc.assets.loaders.*` × 1
- `arc.audio.*` × 1
- `arc.graphics.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.graphics.gl.*` × 1

## 文件逐个分析

### `arc-core/src/arc/assets/AssetDescriptor.java`

- 知识页：[arc-core-src-arc-assets-assetdescriptor-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-assetdescriptor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/AssetDescriptor.java`
- SHA1：`75c595a7a62e99671aa1859887291aa6054c50ad`
- 声明：class AssetDescriptor<T>
- 字段线索：fileName, type, params, file, loaded, errored
- 方法线索：toString

### `arc-core/src/arc/assets/AssetErrorListener.java`

- 知识页：[arc-core-src-arc-assets-asseterrorlistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-asseterrorlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/AssetErrorListener.java`
- SHA1：`d5b1f216273d047505843dc351d215982f4d9db5`
- 声明：interface AssetErrorListener
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/assets/AssetLoaderParameters.java`

- 知识页：[arc-core-src-arc-assets-assetloaderparameters-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-assetloaderparameters-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/AssetLoaderParameters.java`
- SHA1：`197ae4a549761de7d56499a56e5a3fe1fda302a7`
- 声明：class AssetLoaderParameters<T>, interface LoadedCallback
- 字段线索：loadedCallback
- 方法线索：未抽取

### `arc-core/src/arc/assets/AssetLoadingTask.java`

- 知识页：[arc-core-src-arc-assets-assetloadingtask-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-assetloadingtask-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/AssetLoadingTask.java`
- SHA1：`680763a64714495eaaefa51988960cecb4fb9cb4`
- 声明：class AssetLoadingTaskimplements Callable<Void>
- 字段线索：assetDesc, loader, executor, startTime, asyncDone, dependenciesLoaded
- 方法线索：call, update, handleSyncLoader, handleAsyncLoader, ArcRuntimeException, resolve

### `arc-core/src/arc/assets/AssetManager.java`

- 知识页：[arc-core-src-arc-assets-assetmanager-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-assetmanager-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/AssetManager.java`
- SHA1：`ac0fba9c13434aa4d63cd65604ef346376e4106f`
- 声明：class AssetManagerimplements Disposable, class RefCountedContainer
- 字段线索：assets, assetTypes, assetDependencies, injected, loaders, loadQueue
- 方法线索：getFileHandleResolver, loadAsync, loadSync, IllegalArgumentException, getDependencies, ArcRuntimeException

### `arc-core/src/arc/assets/Loadable.java`

- 知识页：[arc-core-src-arc-assets-loadable-java.md](../mindustry-source-files/arc/arc-core-src-arc-assets-loadable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/Loadable.java`
- SHA1：`bc7c645a3762be933f0c807c5d1324d1e90380b5`
- 声明：interface Loadable
- 字段线索：未抽取
- 方法线索：loadAsync, loadSync, getName, getDependencies


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
