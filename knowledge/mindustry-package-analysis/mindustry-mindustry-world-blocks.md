# Package `mindustry.world.blocks` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks`
- 文件数：10

## 主要依赖线索

- `mindustry.gen.*` × 5
- `arc.util.*` × 4
- `arc.graphics.g2d.*` × 3
- `arc.math.*` × 3
- `arc.*` × 3
- `java.util.*` × 2
- `arc.func.*` × 2
- `mindustry.entities.units.*` × 2
- `mindustry.world.*` × 2
- `arc.struct.*` × 2
- `arc.util.serialization.*` × 1
- `arc.util.serialization.Json.*` × 1
- `mindustry.world.meta.*` × 1
- `arc.math.geom.*` × 1
- `arc.Graphics.*` × 1
- `arc.Graphics.Cursor.*` × 1
- `arc.util.io.*` × 1
- `mindustry.*` × 1
- `mindustry.annotations.Annotations.*` × 1
- `mindustry.content.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/blocks/Attributes.java`

- 知识页：[core-src-mindustry-world-blocks-attributes-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-attributes-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/Attributes.java`
- SHA1：`f26768798d58741db7b2a5f731cfda74b98936e3`
- 声明：class Attributesimplements JsonSerializable
- 字段线索：arr
- 方法线索：clear, get, set, add, write, read

### `core/src/mindustry/world/blocks/Autotiler.java`

- 知识页：[core-src-mindustry-world-blocks-autotiler-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-autotiler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/Autotiler.java`
- SHA1：`bcc9c0c9d5727dbff3ecfc84fed05360da7c7004`
- 声明：interface Autotiler, class AutotilerHolder, enum SliceMode
- 字段线索：blendresult, directionals, plan, blendFinder
- 方法线索：sliced, topHalf, botHalf, buildBlending, transformCase, facing

### `core/src/mindustry/world/blocks/ConstructBlock.java`

- 知识页：[core-src-mindustry-world-blocks-constructblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-constructblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/ConstructBlock.java`
- SHA1：`cec51f926aa96649f2c73a99a92f2588068d786f`
- 声明：class ConstructBlockextends Block, class ConstructBuildextends Building
- 字段线索：consBlocks, lastTime, pitchSeq, lastPlayed, current, previous
- 方法线索：shouldPlay, calcPitch, isHidden, getDisplayName, getDisplayIcon, checkSolid

### `core/src/mindustry/world/blocks/ControlBlock.java`

- 知识页：[core-src-mindustry-world-blocks-controlblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-controlblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/ControlBlock.java`
- SHA1：`ef3c92aa35b6969969cd4cbef33adc3e83ce0156`
- 声明：interface ControlBlock
- 字段线索：未抽取
- 方法线索：isControlled, canControl, shouldAutoTarget

### `core/src/mindustry/world/blocks/ExplosionShield.java`

- 知识页：[core-src-mindustry-world-blocks-explosionshield-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-explosionshield-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/ExplosionShield.java`
- SHA1：`73fc36948cf371c20dde71a39a618aca918454c0`
- 声明：interface ExplosionShield
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/ItemSelection.java`

- 知识页：[core-src-mindustry-world-blocks-itemselection-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-itemselection-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/ItemSelection.java`
- SHA1：`104e4d6a95f3afcb50f573171c9242b5124888b4`
- 声明：class ItemSelection
- 字段线索：search, rowCount
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/LaunchAnimator.java`

- 知识页：[core-src-mindustry-world-blocks-launchanimator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-launchanimator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/LaunchAnimator.java`
- SHA1：`60c0bef194fba8d0b2f003d10cc6162896a5221d`
- 声明：interface LaunchAnimator
- 字段线索：未抽取
- 方法线索：drawLaunchGlobalZ

### `core/src/mindustry/world/blocks/RotBlock.java`

- 知识页：[core-src-mindustry-world-blocks-rotblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-rotblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/RotBlock.java`
- SHA1：`4c5839dbfc83ff84459256ae0406994119f77196`
- 声明：interface RotBlock
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/TileBitmask.java`

- 知识页：[core-src-mindustry-world-blocks-tilebitmask-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-tilebitmask-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/TileBitmask.java`
- SHA1：`7194e63a343171afaaf4585ff9e57ec66519bbdf`
- 声明：class TileBitmask
- 字段线索：values
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/UnitTetherBlock.java`

- 知识页：[core-src-mindustry-world-blocks-unittetherblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-unittetherblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/UnitTetherBlock.java`
- SHA1：`d52a7ff11881efbdbcc59f73436452d3aff22f0c`
- 声明：interface UnitTetherBlock
- 字段线索：未抽取
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
