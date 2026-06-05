# Package `mindustry.entities.pattern` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities.pattern`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

实体系统包：负责单位、子弹、特效、群组、AI 行为和运行时实体逻辑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities.pattern`
- 文件数：8

## 主要依赖线索

- `arc.util.*` × 8
- `arc.math.*` × 4
- `mindustry.entities.*` × 1

## 文件逐个分析

### `core/src/mindustry/entities/pattern/ShootAlternate.java`

- 知识页：[core-src-mindustry-entities-pattern-shootalternate-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shootalternate-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootAlternate.java`
- SHA1：`0eb52d97616d40963e215b95fb5f020892362e6b`
- 声明：class ShootAlternateextends ShootPattern
- 字段线索：barrels, spread, barrelOffset, mirror
- 方法线索：flip, shoot

### `core/src/mindustry/entities/pattern/ShootBarrel.java`

- 知识页：[core-src-mindustry-entities-pattern-shootbarrel-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shootbarrel-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootBarrel.java`
- SHA1：`a5eaa2dc6ba48104e443c11d55e99c0074b177ba`
- 声明：class ShootBarrelextends ShootPattern
- 字段线索：barrels, barrelOffset
- 方法线索：flip, shoot

### `core/src/mindustry/entities/pattern/ShootHelix.java`

- 知识页：[core-src-mindustry-entities-pattern-shoothelix-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shoothelix-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootHelix.java`
- SHA1：`9be2d81478b2fe0f7ddb38431a04eafe2ced40d1`
- 声明：class ShootHelixextends ShootPattern
- 字段线索：scl
- 方法线索：shoot

### `core/src/mindustry/entities/pattern/ShootMulti.java`

- 知识页：[core-src-mindustry-entities-pattern-shootmulti-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shootmulti-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootMulti.java`
- SHA1：`1cf8998f5258d5bfd6e94343d5dd1bf7f123e95d`
- 声明：class ShootMultiextends ShootPattern
- 字段线索：source, dest
- 方法线索：flip, shoot

### `core/src/mindustry/entities/pattern/ShootPattern.java`

- 知识页：[core-src-mindustry-entities-pattern-shootpattern-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shootpattern-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootPattern.java`
- SHA1：`c2ce40076eb9b48398ee629b4df7e840b6d8645c`
- 声明：class ShootPatternimplements Cloneable, interface BulletHandler
- 字段线索：shots, firstShotDelay, shotDelay
- 方法线索：shoot, flip, copy, RuntimeException

### `core/src/mindustry/entities/pattern/ShootSine.java`

- 知识页：[core-src-mindustry-entities-pattern-shootsine-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shootsine-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootSine.java`
- SHA1：`bd4b26fb3d90e5887c587116e1dfe1f12d719646`
- 声明：class ShootSineextends ShootPattern
- 字段线索：scl, mag
- 方法线索：shoot

### `core/src/mindustry/entities/pattern/ShootSpread.java`

- 知识页：[core-src-mindustry-entities-pattern-shootspread-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shootspread-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootSpread.java`
- SHA1：`7ab901bf08a1b655c069792949fa79461806b3b2`
- 声明：class ShootSpreadextends ShootPattern
- 字段线索：spread
- 方法线索：ShootSpread, shoot

### `core/src/mindustry/entities/pattern/ShootSummon.java`

- 知识页：[core-src-mindustry-entities-pattern-shootsummon-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-pattern-shootsummon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/pattern/ShootSummon.java`
- SHA1：`6df5400d08b8a939a08f09c07458332a69c4c251`
- 声明：class ShootSummonextends ShootPattern
- 字段线索：spread
- 方法线索：shoot


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
