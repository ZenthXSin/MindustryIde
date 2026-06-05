# Package `mindustry.content` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.content`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.content`
- 文件数：15

## 主要依赖线索

- `mindustry.type.*` × 12
- `arc.graphics.*` × 9
- `arc.struct.*` × 8
- `arc.util.*` × 6
- `arc.math.*` × 5
- `mindustry.graphics.*` × 5
- `mindustry.entities.bullet.*` × 4
- `mindustry.game.*` × 4
- `mindustry.gen.*` × 4
- `mindustry.entities.*` × 3
- `mindustry.entities.abilities.*` × 3
- `mindustry.world.*` × 3
- `mindustry.game.Objectives.*` × 3
- `arc.*` × 3
- `arc.math.geom.*` × 3
- `mindustry.entities.effect.*` × 2
- `mindustry.entities.part.*` × 2
- `mindustry.entities.pattern.*` × 2
- `mindustry.type.unit.*` × 2
- `arc.graphics.g2d.*` × 2

## 文件逐个分析

### `core/src/mindustry/content/Blocks.java`

- 知识页：[core-src-mindustry-content-blocks-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-blocks-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Blocks.java`
- SHA1：`622764961f6949ae95b7bc7343395308af964889`
- 声明：class Blocks
- 字段线索：interplanetaryAccelerator
- 方法线索：未抽取

### `core/src/mindustry/content/Bullets.java`

- 知识页：[core-src-mindustry-content-bullets-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-bullets-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Bullets.java`
- SHA1：`1f130ba3a4dbc74bd78af5ab5715be3908854bf3`
- 声明：class Bullets
- 字段线索：fireball
- 方法线索：未抽取

### `core/src/mindustry/content/ErekirTechTree.java`

- 知识页：[core-src-mindustry-content-erekirtechtree-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-erekirtechtree-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/ErekirTechTree.java`
- SHA1：`20934503b0ddf94e2eaf9a13f52ac04a2400f555`
- 声明：class ErekirTechTree
- 字段线索：balanced
- 方法线索：rebalanceBullet

### `core/src/mindustry/content/Fx.java`

- 知识页：[core-src-mindustry-content-fx-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-fx-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Fx.java`
- SHA1：`589680bd17704ccf613b44e6120c89eaa0ee3170`
- 声明：class Fx
- 字段线索：rand, v, none
- 方法线索：未抽取

### `core/src/mindustry/content/Items.java`

- 知识页：[core-src-mindustry-content-items-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-items-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Items.java`
- SHA1：`db71086540148a36865ea19b5da5bb045976d419`
- 声明：class Items
- 字段线索：dormantCyst, serpuloItems
- 方法线索：未抽取

### `core/src/mindustry/content/Liquids.java`

- 知识页：[core-src-mindustry-content-liquids-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-liquids-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Liquids.java`
- SHA1：`8cac075d97491e21141990b275367d7979678fbd`
- 声明：class Liquids
- 字段线索：cyanogen
- 方法线索：未抽取

### `core/src/mindustry/content/Loadouts.java`

- 知识页：[core-src-mindustry-content-loadouts-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-loadouts-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Loadouts.java`
- SHA1：`78962a0077f92f1d31b346b1f217b8218891930b`
- 声明：class Loadouts
- 字段线索：basicBastion
- 方法线索：未抽取

### `core/src/mindustry/content/Planets.java`

- 知识页：[core-src-mindustry-content-planets-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-planets-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Planets.java`
- SHA1：`abe40e035f3e2688a505a8cdba74a449eb9133e7`
- 声明：class Planets
- 字段线索：verilus
- 方法线索：Planet, MultiMesh

### `core/src/mindustry/content/SectorPresets.java`

- 知识页：[core-src-mindustry-content-sectorpresets-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-sectorpresets-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/SectorPresets.java`
- SHA1：`b6c2024d81550f8a99c4ccd861596ac280d429e3`
- 声明：class SectorPresets
- 字段线索：origin
- 方法线索：未抽取

### `core/src/mindustry/content/SerpuloTechTree.java`

- 知识页：[core-src-mindustry-content-serpulotechtree-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-serpulotechtree-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/SerpuloTechTree.java`
- SHA1：`f9b5986cf56fe0aa3a8cec1084bfe15c9a8103b7`
- 声明：class SerpuloTechTree
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/content/StatusEffects.java`

- 知识页：[core-src-mindustry-content-statuseffects-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-statuseffects-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/StatusEffects.java`
- SHA1：`177c1920f75440ef399c7e9bb54964881d2e2d60`
- 声明：class StatusEffects
- 字段线索：dynamic
- 方法线索：未抽取

### `core/src/mindustry/content/TeamEntries.java`

- 知识页：[core-src-mindustry-content-teamentries-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-teamentries-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/TeamEntries.java`
- SHA1：`df5cda38489e08bd5daaa3cd7305933d6a7384e1`
- 声明：class TeamEntries
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/content/TechTree.java`

- 知识页：[core-src-mindustry-content-techtree-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-techtree-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/TechTree.java`
- SHA1：`1da43307c60d2fd69ff88d36e60e6a03b5755c2f`
- 声明：class TechTree, class TechNode
- 字段线索：context, all, roots, depth, icon, name
- 方法线索：each, addDatabaseTab, addPlanet, icon, localizedName, setupRequirements

### `core/src/mindustry/content/UnitTypes.java`

- 知识页：[core-src-mindustry-content-unittypes-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-unittypes-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/UnitTypes.java`
- SHA1：`5eb17ac4e578d56c16bc2c5815f3f84e9118b4d1`
- 声明：class UnitTypes
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/content/Weathers.java`

- 知识页：[core-src-mindustry-content-weathers-java.md](../mindustry-source-files/mindustry/core-src-mindustry-content-weathers-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/content/Weathers.java`
- SHA1：`7654933a97a32e9b6eee7b27f461075b6e6308e7`
- 声明：class Weathers
- 字段线索：suspendParticles
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
