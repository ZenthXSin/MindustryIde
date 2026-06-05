# Package `mindustry.service` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.service`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

游戏状态包：负责 Rules、Teams、Events、Saves、Stats、Objective 等运行规则。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.service`
- 文件数：3

## 主要依赖线索

- `arc.util.*` × 2
- `arc.*` × 1
- `arc.struct.*` × 1
- `mindustry.*` × 1
- `mindustry.content.*` × 1
- `mindustry.entities.bullet.*` × 1
- `mindustry.game.EventType.*` × 1
- `mindustry.game.SectorInfo.*` × 1
- `mindustry.gen.*` × 1
- `mindustry.type.*` × 1
- `mindustry.world.*` × 1
- `mindustry.world.blocks.defense.Wall.*` × 1
- `mindustry.world.blocks.defense.turrets.Turret.*` × 1
- `mindustry.world.blocks.distribution.*` × 1
- `mindustry.world.blocks.production.AttributeCrafter.*` × 1
- `mindustry.world.blocks.production.SolidPump.*` × 1
- `mindustry.world.blocks.storage.*` × 1
- `mindustry.world.meta.*` × 1

## 文件逐个分析

### `core/src/mindustry/service/Achievement.java`

- 知识页：[core-src-mindustry-service-achievement-java.md](../mindustry-source-files/mindustry/core-src-mindustry-service-achievement-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/service/Achievement.java`
- SHA1：`307dd4709d34b37dc71b8d8e1f77c310f8fd095f`
- 声明：enum Achievement
- 字段线索：stat, statGoal, completed, all
- 方法线索：place10kBlocks, complete, uncomplete, checkCompletion, isAchieved

### `core/src/mindustry/service/GameService.java`

- 知识页：[core-src-mindustry-service-gameservice-java.md](../mindustry-source-files/mindustry/core-src-mindustry-service-gameservice-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/service/GameService.java`
- SHA1：`fc8df493ec08d1305ec97fa0359575283f4fd9c7`
- 声明：class GameService
- 字段线索：tmpTiles, blocksBuilt, t5s, checked, allSerpuloBlocks
- 方法线索：init, enabled, completeAchievement, clearAchievement, isAchieved, getStat

### `core/src/mindustry/service/SStat.java`

- 知识页：[core-src-mindustry-service-sstat-java.md](../mindustry-source-files/mindustry/core-src-mindustry-service-sstat-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/service/SStat.java`
- SHA1：`c818f1c1a6ca33a065ccee1700496cd91022efe5`
- 声明：enum SStat
- 字段线索：未抽取
- 方法线索：get, max, set, add


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
