# Package `mindustry.audio` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.audio`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.audio`
- 文件数：3

## 主要依赖线索

- `arc.*` × 3
- `arc.audio.*` × 3
- `arc.math.*` × 2
- `arc.struct.*` × 2
- `arc.util.*` × 2
- `mindustry.*` × 2
- `arc.audio.Filters.*` × 1
- `arc.files.*` × 1
- `arc.math.geom.*` × 1
- `mindustry.content.*` × 1
- `mindustry.game.EventType.*` × 1
- `mindustry.gen.*` × 1

## 文件逐个分析

### `core/src/mindustry/audio/SoundControl.java`

- 知识页：[core-src-mindustry-audio-soundcontrol-java.md](../mindustry-source-files/mindustry/core-src-mindustry-audio-soundcontrol-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/audio/SoundControl.java`
- SHA1：`f5d17818d20bbf144c41c0106d36c90f87934c27`
- 声明：class SoundControl, class SoundData
- 字段线索：finTime, ambientMusic, darkMusic, bossMusic, uiBus, lastRandomPlayed
- 方法线索：setupFilters, reload, loop, stop, update, updateLoops

### `core/src/mindustry/audio/SoundLoop.java`

- 知识页：[core-src-mindustry-audio-soundloop-java.md](../mindustry-source-files/mindustry/core-src-mindustry-audio-soundloop-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/audio/SoundLoop.java`
- SHA1：`8a3694c16ac34861c7a69dd78f97e8f42acde9f2`
- 声明：class SoundLoop
- 字段线索：fadeSpeed, sound, id, baseVolume
- 方法线索：update, stop

### `core/src/mindustry/audio/SoundPriority.java`

- 知识页：[core-src-mindustry-audio-soundpriority-java.md](../mindustry-source-files/mindustry/core-src-mindustry-audio-soundpriority-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/audio/SoundPriority.java`
- SHA1：`bb663cae387fad17ffd5524db6990a4cbcd17d39`
- 声明：class SoundPriority
- 字段线索：lastGroup
- 方法线索：max, sameGroup, set


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
