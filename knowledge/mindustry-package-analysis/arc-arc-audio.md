# Package `arc.audio` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.audio`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.audio`
- 文件数：9

## 主要依赖线索

- `arc.util.*` × 6
- `arc.*` × 5
- `arc.files.*` × 4
- `arc.Files.*` × 1
- `java.io.*` × 1
- `arc.math.*` × 1
- `arc.math.geom.*` × 1

## 文件逐个分析

### `arc-core/src/arc/audio/Audio.java`

- 知识页：[arc-core-src-arc-audio-audio-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-audio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/Audio.java`
- SHA1：`ada289c6b458b0ddc7a498b6bf425b2dffaab125`
- 声明：class Audioimplements Disposable
- 字段线索：globalPitch, falloff, defaultSoundMaxConcurrent, sfxVolume, soundBus, musicBus
- 方法线索：initialized, initialize, update, pause, resume, newSound

### `arc-core/src/arc/audio/AudioBus.java`

- 知识页：[arc-core-src-arc-audio-audiobus-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-audiobus-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/AudioBus.java`
- SHA1：`dbc926ffa4eec9b8c7ccbb6ccef140355e01e02a`
- 声明：class AudioBusextends AudioSource
- 字段线索：id
- 方法线索：setFilter, playing, play, stop, fadeFilterParam, setFilterParam

### `arc-core/src/arc/audio/AudioFilter.java`

- 知识页：[arc-core-src-arc-audio-audiofilter-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-audiofilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/AudioFilter.java`
- SHA1：`a9e728858bed27b5f715596302eddc6dd6fce2dd`
- 声明：class AudioFilter
- 字段线索：handle
- 方法线索：未抽取

### `arc-core/src/arc/audio/AudioSource.java`

- 知识页：[arc-core-src-arc-audio-audiosource-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-audiosource-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/AudioSource.java`
- SHA1：`99050353b2b142441c45aa64872c46e5cff7952c`
- 声明：class AudioSourceimplements Disposable
- 字段线索：handle
- 方法线索：setFilter, setPriority, setMaxConcurrent, setConcurrentGroup, setMinConcurrentInterrupt, countPlaying

### `arc-core/src/arc/audio/Filters.java`

- 知识页：[arc-core-src-arc-audio-filters-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-filters-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/Filters.java`
- SHA1：`81f10391ed540ae706b634e13dc0f1b12a9031c9`
- 声明：class Filters, class BiquadFilterextends AudioFilter, class EchoFilterextends AudioFilter
- 字段线索：paramWet
- 方法线索：set

### `arc-core/src/arc/audio/Music.java`

- 知识页：[arc-core-src-arc-audio-music-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-music-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/Music.java`
- SHA1：`a08128a5c63e7e39c8dbed77745a067bc20a0839`
- 声明：class Musicextends AudioSource
- 字段线索：未抽取
- 方法线索：load, play, pause, stop, isPlaying, isLooping

### `arc-core/src/arc/audio/RandomSound.java`

- 知识页：[arc-core-src-arc-audio-randomsound-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-randomsound-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/RandomSound.java`
- SHA1：`c8f2c798dbad68953eda18af833ad5e33f46c1ea`
- 声明：class RandomSoundextends Sound
- 字段线索：sounds
- 方法线索：load, play

### `arc-core/src/arc/audio/Soloud.java`

- 知识页：[arc-core-src-arc-audio-soloud-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-soloud-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/Soloud.java`
- SHA1：`097feeffff90d85b51c289e0eadabcbcaee4e5c3`
- 声明：class Soloud
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/audio/Sound.java`

- 知识页：[arc-core-src-arc-audio-sound-java.md](../mindustry-source-files/arc/arc-core-src-arc-audio-sound-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/audio/Sound.java`
- SHA1：`b16a1250f518aab9fcd2945983c0a56e98551cad`
- 声明：class Soundextends AudioSource
- 字段线索：bus, file, falloffOffset, minInterval
- 方法线索：load, play, setBus, stop, calcPan, calcVolume


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
