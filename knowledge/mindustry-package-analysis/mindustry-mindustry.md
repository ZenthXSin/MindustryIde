# Package `mindustry` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry`
- 文件数：2

## 主要依赖线索

- `arc.*` × 2
- `arc.assets.*` × 2
- `arc.files.*` × 2
- `arc.graphics.*` × 2
- `arc.util.*` × 2
- `arc.util.io.*` × 2
- `mindustry.ai.*` × 2
- `mindustry.core.*` × 2
- `mindustry.ctype.*` × 2
- `mindustry.game.EventType.*` × 2
- `mindustry.game.*` × 2
- `arc.assets.loaders.*` × 1
- `arc.audio.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.math.*` × 1
- `mindustry.audio.*` × 1
- `mindustry.game.Saves.*` × 1
- `mindustry.gen.*` × 1
- `arc.input.*` × 1
- `arc.scene.ui.layout.*` × 1

## 文件逐个分析

### `core/src/mindustry/ClientLauncher.java`

- 知识页：[core-src-mindustry-clientlauncher-java.md](../mindustry-source-files/mindustry/core-src-mindustry-clientlauncher-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ClientLauncher.java`
- SHA1：`8eb0a4bd6525a5f246cc6b91d9e9eb31c2f7ce49`
- 声明：class ClientLauncherextends ApplicationCore implements Platform
- 字段线索：loadingFPS, nextFrame, beginTime, lastTargetFps, finished, loader
- 方法线索：setup, loadAsync, loadSync, add, resize, update

### `core/src/mindustry/Vars.java`

- 知识页：[core-src-mindustry-vars-java.md](../mindustry-source-files/mindustry/core-src-mindustry-vars-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/Vars.java`
- SHA1：`f9050c7b2819b95980049f0cf0dde2da8a53f3ae`
- 声明：class Varsimplements Loadable
- 字段线索：failedToLaunch, loadLocales, loadedLogger, steamPlayerName, minModGameVersion, minJavaModGameVersion
- 方法线索：loadAsync


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
