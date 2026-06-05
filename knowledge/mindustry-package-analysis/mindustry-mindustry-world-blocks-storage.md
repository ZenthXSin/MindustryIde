# Package `mindustry.world.blocks.storage` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.storage`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.storage`
- 文件数：3

## 主要依赖线索

- `arc.struct.*` × 3
- `arc.util.*` × 3
- `arc.graphics.*` × 2
- `arc.graphics.g2d.*` × 2
- `arc.math.*` × 2
- `arc.scene.ui.layout.*` × 2
- `arc.util.io.*` × 2
- `mindustry.annotations.Annotations.*` × 2
- `mindustry.content.*` × 2
- `mindustry.gen.*` × 2
- `mindustry.type.*` × 2
- `mindustry.world.*` × 2
- `mindustry.world.blocks.storage.CoreBlock.*` × 2
- `mindustry.world.meta.*` × 2
- `arc.*` × 1
- `arc.audio.*` × 1
- `arc.func.*` × 1
- `arc.math.geom.*` × 1
- `arc.scene.actions.*` × 1
- `arc.scene.event.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/blocks/storage/CoreBlock.java`

- 知识页：[core-src-mindustry-world-blocks-storage-coreblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-storage-coreblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/storage/CoreBlock.java`
- SHA1：`1efdf66b506838ae809bf679a308deb9bcacfef1`
- 声明：class CoreBlockextends StorageBlock, class CoreBuildextends Building implements LaunchAnimator
- 字段线索：cloudScaling, cloudAlphas, nextItems, thrusterSizes, thrusterLength, isFirstTier
- 方法线索：setStats, setBars, init, postInit, canBreak, canReplace

### `core/src/mindustry/world/blocks/storage/StorageBlock.java`

- 知识页：[core-src-mindustry-world-blocks-storage-storageblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-storage-storageblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/storage/StorageBlock.java`
- SHA1：`694f953f8d84eec19f37efa59b21fdd841984fa9`
- 声明：class StorageBlockextends Block, class StorageBuildextends Building
- 字段线索：coreMerge, linkedCore
- 方法线索：outputsItems, acceptItem, canUnload, handleItem, itemTaken, removeStack

### `core/src/mindustry/world/blocks/storage/Unloader.java`

- 知识页：[core-src-mindustry-world-blocks-storage-unloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-storage-unloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/storage/Unloader.java`
- SHA1：`abd39986b1c2743834ad8a97fbf0afec4ea2a462`
- 声明：class Unloaderextends Block, class ContainerStatimplements Poolable, class UnloaderBuildextends Building
- 字段线索：speed, allowCoreUnload, allItems, unloadTimer, rotations, sortItem
- 方法线索：init, setStats, drawPlanConfig, setBars, reset, isPossibleItem


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
