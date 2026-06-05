# Package `arc.util.pooling` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.util.pooling`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`arc.util.pooling`
- 文件数：2

## 主要依赖线索

- `arc.struct.Seq` × 2
- `arc.struct.ObjectMap` × 1
- `arc.func.Prov` × 1

## 文件逐个分析

### `arc-core/src/arc/util/pooling/Pool.java`

- 知识页：[arc-core-src-arc-util-pooling-pool-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-pooling-pool-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/pooling/Pool.java`
- SHA1：`cd4585521579c8f44a930206aa5ea0a360219111`
- 声明：class Pool<T>, interface Poolable
- 字段线索：max, freeObjects, peak
- 方法线索：obtain, free, reset, freeAll, clear, getFree

### `arc-core/src/arc/util/pooling/Pools.java`

- 知识页：[arc-core-src-arc-util-pooling-pools-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-pooling-pools-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/pooling/Pools.java`
- SHA1：`1237801b1965ff1fffdabed9300a6330ea05e987`
- 声明：class Pools
- 字段线索：typePools
- 方法线索：newObject


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
