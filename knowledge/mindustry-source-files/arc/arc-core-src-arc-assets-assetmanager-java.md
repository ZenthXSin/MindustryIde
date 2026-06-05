# arc:arc-core/src/arc/assets/AssetManager.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/AssetManager.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/assets/AssetManager.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/assets/AssetManager.java`
- SHA1：`ac0fba9c13434aa4d63cd65604ef346376e4106f`
- 大小：32106 bytes
- 行数：846

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class AssetManagerimplements Disposable`。

关键词：arc

## Package

`arc.assets`

## 类型声明

- `class AssetManagerimplements Disposable`
- `class RefCountedContainer`

## 字段线索

- `assets`
- `assetTypes`
- `assetDependencies`
- `injected`
- `loaders`
- `loadQueue`
- `executor`
- `tasks`
- `resolver`

## 方法线索

- `getFileHandleResolver`
- `loadAsync`
- `loadSync`
- `IllegalArgumentException`
- `getDependencies`
- `ArcRuntimeException`
- `update`
- `finishLoading`
- `finishLoadingAsset`
- `injectDependencies`
- `nextTask`
- `addTask`
- `updateTask`
- `taskFailed`
- `incrementRefCountedDependencies`
- `handleTaskError`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
