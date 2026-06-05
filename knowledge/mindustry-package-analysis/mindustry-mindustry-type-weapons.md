# Package `mindustry.type.weapons` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.type.weapons`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.type.weapons`
- 文件数：5

## 主要依赖线索

- `mindustry.entities.units.*` × 5
- `mindustry.gen.*` × 5
- `mindustry.type.*` × 5
- `arc.math.*` × 4
- `arc.graphics.g2d.*` × 3
- `mindustry.entities.bullet.*` × 2
- `arc.util.*` × 2
- `arc.*` × 2
- `arc.graphics.*` × 2
- `arc.math.geom.*` × 2
- `arc.scene.ui.layout.*` × 2
- `mindustry.content.*` × 2
- `mindustry.entities.*` × 2
- `mindustry.*` × 1
- `mindustry.core.*` × 1
- `mindustry.graphics.*` × 1
- `mindustry.world.blocks.units.*` × 1
- `mindustry.world.meta.*` × 1

## 文件逐个分析

### `core/src/mindustry/type/weapons/BuildWeapon.java`

- 知识页：[core-src-mindustry-type-weapons-buildweapon-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weapons-buildweapon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weapons/BuildWeapon.java`
- SHA1：`7899f0d39ce9e24d04012ab43b92a5afab1b0064`
- 声明：class BuildWeaponextends Weapon
- 字段线索：未抽取
- 方法线索：update, draw

### `core/src/mindustry/type/weapons/MineWeapon.java`

- 知识页：[core-src-mindustry-type-weapons-mineweapon-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weapons-mineweapon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weapons/MineWeapon.java`
- SHA1：`65edcc8ecaca75146233ec0fcd5244b488f0e1fe`
- 声明：class MineWeaponextends Weapon
- 字段线索：未抽取
- 方法线索：update, draw

### `core/src/mindustry/type/weapons/PointDefenseBulletWeapon.java`

- 知识页：[core-src-mindustry-type-weapons-pointdefensebulletweapon-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weapons-pointdefensebulletweapon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weapons/PointDefenseBulletWeapon.java`
- SHA1：`bbcef7d587345c5902c95c23e02f00ec004d8914`
- 声明：class PointDefenseBulletWeaponextends Weapon
- 字段线索：damageTargetWeight
- 方法线索：findTarget, checkTarget, handleBullet

### `core/src/mindustry/type/weapons/PointDefenseWeapon.java`

- 知识页：[core-src-mindustry-type-weapons-pointdefenseweapon-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weapons-pointdefenseweapon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weapons/PointDefenseWeapon.java`
- SHA1：`58c3bf563c86314e5905e2b8dbe8e04a8452f589`
- 声明：class PointDefenseWeaponextends Weapon
- 字段线索：color, beamEffect
- 方法线索：addStats, findTarget, checkTarget, shoot

### `core/src/mindustry/type/weapons/RepairBeamWeapon.java`

- 知识页：[core-src-mindustry-type-weapons-repairbeamweapon-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weapons-repairbeamweapon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weapons/RepairBeamWeapon.java`
- SHA1：`17fbecce4011231c346eb153dd44def990177cfd`
- 声明：class RepairBeamWeaponextends Weapon, class HealBeamMountextends WeaponMount
- 字段线索：targetBuildings, repairSpeed, fractionRepairSpeed, beamWidth, pulseRadius, pulseStroke
- 方法线索：addStats, dps, load, findTarget, checkTarget, shoot


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
