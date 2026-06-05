# Package `mindustry.world.meta` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.meta`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.meta`
- 文件数：12

## 主要依赖线索

- `arc.struct.*` × 5
- `arc.*` × 5
- `arc.util.*` × 4
- `mindustry.*` × 3
- `java.util.*` × 3
- `arc.scene.ui.layout.*` × 3
- `arc.graphics.*` × 2
- `arc.func.*` × 2
- `mindustry.content.*` × 2
- `mindustry.graphics.*` × 1
- `mindustry.gen.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.math.*` × 1
- `arc.scene.*` × 1
- `arc.scene.event.*` × 1
- `arc.scene.style.*` × 1
- `arc.scene.ui.*` × 1
- `arc.scene.ui.Tooltip.*` × 1
- `mindustry.core.*` × 1
- `mindustry.ctype.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/meta/Attribute.java`

- 知识页：[core-src-mindustry-world-meta-attribute-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-attribute-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/Attribute.java`
- SHA1：`d2c115ce5885553cef4bf0689a645cb28b0dbcfd`
- 声明：class Attribute
- 字段线索：all, map, heat, id, name
- 方法线索：env, toString

### `core/src/mindustry/world/meta/BlockFlag.java`

- 知识页：[core-src-mindustry-world-meta-blockflag-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-blockflag-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/BlockFlag.java`
- SHA1：`f6ee99ab5f373d34bc695ff304f46abb736e4fe1`
- 声明：enum BlockFlag
- 字段线索：all, allLogic
- 方法线索：未抽取

### `core/src/mindustry/world/meta/BlockGroup.java`

- 知识页：[core-src-mindustry-world-meta-blockgroup-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-blockgroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/BlockGroup.java`
- SHA1：`decc64beb4d757210fadd2d539192da58379b8a8`
- 声明：enum BlockGroup
- 字段线索：anyReplace
- 方法线索：未抽取

### `core/src/mindustry/world/meta/BlockStatus.java`

- 知识页：[core-src-mindustry-world-meta-blockstatus-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-blockstatus-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/BlockStatus.java`
- SHA1：`733dd0bdcfdd284a4264554e98265e24c02f594a`
- 声明：enum BlockStatus
- 字段线索：color
- 方法线索：未抽取

### `core/src/mindustry/world/meta/BuildVisibility.java`

- 知识页：[core-src-mindustry-world-meta-buildvisibility-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-buildvisibility-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/BuildVisibility.java`
- SHA1：`3ebdd31af90ba29973b288c398de3f4b68d5d009`
- 声明：class BuildVisibility
- 字段线索：hidden, visible
- 方法线索：visible

### `core/src/mindustry/world/meta/Env.java`

- 知识页：[core-src-mindustry-world-meta-env-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-env-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/Env.java`
- SHA1：`ab61498fd3d510b3e53bea83d3b6e18aef9dcae3`
- 声明：class Env
- 字段线索：terrestrial
- 方法线索：未抽取

### `core/src/mindustry/world/meta/Stat.java`

- 知识页：[core-src-mindustry-world-meta-stat-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-stat-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/Stat.java`
- SHA1：`e81e653e0b56b80ab7cad3b908d76f324691ef2b`
- 声明：class Statimplements Comparable<Stat>
- 字段线索：all, health, category, name, id
- 方法线索：localized, toString, compareTo

### `core/src/mindustry/world/meta/StatCat.java`

- 知识页：[core-src-mindustry-world-meta-statcat-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-statcat-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/StatCat.java`
- SHA1：`53f5e0e85fbd149106bb15e12b4d7b2d187e5ebe`
- 声明：class StatCatimplements Comparable<StatCat>
- 字段线索：all, general, name, id
- 方法线索：localized, toString, compareTo

### `core/src/mindustry/world/meta/StatUnit.java`

- 知识页：[core-src-mindustry-world-meta-statunit-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-statunit-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/StatUnit.java`
- SHA1：`ecc855db3ebc98bcd9a3c958b008843c59b2ba8f`
- 声明：class StatUnit
- 字段线索：blocks, space, name, icon
- 方法线索：localized

### `core/src/mindustry/world/meta/StatValue.java`

- 知识页：[core-src-mindustry-world-meta-statvalue-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-statvalue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/StatValue.java`
- SHA1：`4e208d54242ea42cc1619666dc37226f607060e2`
- 声明：interface StatValue
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/meta/StatValues.java`

- 知识页：[core-src-mindustry-world-meta-statvalues-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-statvalues-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/StatValues.java`
- SHA1：`071706cbeccfd8fb41b38c470223bf1286b6f7a9`
- 声明：class StatValues
- 字段线索：noteIcon
- 方法线索：未抽取

### `core/src/mindustry/world/meta/Stats.java`

- 知识页：[core-src-mindustry-world-meta-stats-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-meta-stats-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/meta/Stats.java`
- SHA1：`586c3f8f96a7eedb1015d4ddf2bcfa6612f6347f`
- 声明：class Stats
- 字段线索：useCategories, intialized, timePeriod, map, dirty
- 方法线索：add, addPercent, addMultModifier, addPercentModifier, replace, remove


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
