# Package `mindustry.server` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.server`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.server`
- 文件数：2

## 主要依赖线索

- `arc.*` × 2
- `arc.util.*` × 2
- `mindustry.*` × 2
- `mindustry.core.*` × 2
- `mindustry.game.EventType.*` × 2
- `arc.files.*` × 1
- `arc.func.*` × 1
- `arc.struct.*` × 1
- `arc.util.Timer` × 1
- `arc.util.CommandHandler.*` × 1
- `arc.util.Timer.*` × 1
- `arc.util.serialization.*` × 1
- `arc.util.serialization.JsonValue.*` × 1
- `arc.util.serialization.Jval.*` × 1
- `mindustry.core.GameState.*` × 1
- `mindustry.game.*` × 1
- `mindustry.gen.*` × 1
- `mindustry.io.*` × 1
- `arc.backend.headless.*` × 1
- `mindustry.ctype.*` × 1

## 文件逐个分析

### `server/src/mindustry/server/ServerControl.java`

- 知识页：[server-src-mindustry-server-servercontrol-java.md](../mindustry-source-files/mindustry/server-src-mindustry-server-servercontrol-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/server/src/mindustry/server/ServerControl.java`
- SHA1：`2a445a379d5eb51a6e370f6842c0638fe8d42535`
- 声明：class ServerControlimplements ApplicationListener
- 字段线索：tags, dateTime, instance, handler, logFolder, autosaveCount
- 方法线索：setup, registerCommands, handleCommandString, cancelPlayTask, play, logToFile

### `server/src/mindustry/server/ServerLauncher.java`

- 知识页：[server-src-mindustry-server-serverlauncher-java.md](../mindustry-source-files/mindustry/server-src-mindustry-server-serverlauncher-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/server/src/mindustry/server/ServerLauncher.java`
- SHA1：`014d2750d4335fa6c4849fe64f03c05f74530f4a`
- 声明：class ServerLauncherimplements ApplicationListener
- 字段线索：args
- 方法线索：init


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
