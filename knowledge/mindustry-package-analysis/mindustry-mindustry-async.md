# Package `mindustry.async` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.async`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.async`
- 文件数：4

## 主要依赖线索

- `arc.struct.*` × 3
- `arc.util.*` × 2
- `arc.math.*` × 2
- `arc.math.geom.*` × 2
- `mindustry.*` × 2
- `arc.*` × 1
- `mindustry.game.EventType.*` × 1
- `java.util.concurrent.*` × 1
- `java.util.*` × 1
- `arc.math.geom.QuadTree.*` × 1
- `mindustry.async.PhysicsProcess.PhysicsWorld.*` × 1
- `mindustry.entities.*` × 1
- `mindustry.gen.*` × 1

## 文件逐个分析

### `core/src/mindustry/async/AsyncCore.java`

- 知识页：[core-src-mindustry-async-asynccore-java.md](../mindustry-source-files/mindustry/core-src-mindustry-async-asynccore-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/async/AsyncCore.java`
- SHA1：`3583d1e4f5e4eea45bd0f809fa09f86f2157c0fb`
- 声明：class AsyncCore
- 字段线索：processes, futures, executor
- 方法线索：begin, end, complete, RuntimeException

### `core/src/mindustry/async/AsyncProcess.java`

- 知识页：[core-src-mindustry-async-asyncprocess-java.md](../mindustry-source-files/mindustry/core-src-mindustry-async-asyncprocess-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/async/AsyncProcess.java`
- SHA1：`3cd5668db4262977f6e28e35f0975a8ee22f724c`
- 声明：interface AsyncProcess
- 字段线索：未抽取
- 方法线索：init, reset, begin, process, end, shouldProcess

### `core/src/mindustry/async/AvoidanceProcess.java`

- 知识页：[core-src-mindustry-async-avoidanceprocess-java.md](../mindustry-source-files/mindustry/core-src-mindustry-async-avoidanceprocess-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/async/AvoidanceProcess.java`
- SHA1：`73492e75d621c38d55baabd24204d2b663e8314b`
- 声明：class AvoidanceProcessimplements AsyncProcess
- 字段线索：wheight, swap
- 方法线索：init, reset, begin, process, shouldProcess

### `core/src/mindustry/async/PhysicsProcess.java`

- 知识页：[core-src-mindustry-async-physicsprocess-java.md](../mindustry-source-files/mindustry/core-src-mindustry-async-physicsprocess-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/async/PhysicsProcess.java`
- SHA1：`93a007d9ccb8639c867f39134afe1876e05d6440`
- 声明：class PhysicsProcessimplements AsyncProcess, class PhysicRef, class PhysicsWorld
- 字段线索：layers, physics, refs, group, entity, body
- 方法线索：begin, process, end, reset, init, add


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
