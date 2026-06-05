# Package `mindustry.entities.part` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities.part`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

实体系统包：负责单位、子弹、特效、群组、AI 行为和运行时实体逻辑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities.part`
- 文件数：7

## 主要依赖线索

- `arc.graphics.g2d.*` × 7
- `arc.util.*` × 7
- `arc.math.*` × 6
- `arc.graphics.*` × 6
- `mindustry.graphics.*` × 4
- `arc.struct.*` × 2
- `mindustry.*` × 1
- `mindustry.content.*` × 1
- `mindustry.entities.*` × 1
- `arc.*` × 1

## 文件逐个分析

### `core/src/mindustry/entities/part/DrawPart.java`

- 知识页：[core-src-mindustry-entities-part-drawpart-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-part-drawpart-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/part/DrawPart.java`
- SHA1：`8bc0ff674b1ba964f1efdb916e6a4276fd7d78cf`
- 声明：class DrawPart, class PartParams, class PartMove
- 字段线索：params, turretShading, under, weaponIndex, recoilIndex, charge
- 方法线索：load, getOutlines, set, setRecoil, constant, getClamp

### `core/src/mindustry/entities/part/EffectSpawnerPart.java`

- 知识页：[core-src-mindustry-entities-part-effectspawnerpart-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-part-effectspawnerpart-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/part/EffectSpawnerPart.java`
- SHA1：`0ae7367af94f514873e8beba6063422725dd0aad`
- 声明：class EffectSpawnerPartextends DrawPart
- 字段线索：rotation, mirror, effectRandRot, effectInterval, effectIntervalFrom, effectChance
- 方法线索：draw

### `core/src/mindustry/entities/part/FlarePart.java`

- 知识页：[core-src-mindustry-entities-part-flarepart-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-part-flarepart-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/part/FlarePart.java`
- SHA1：`6dd002c47537a958975102e0f470209341876fa3`
- 声明：class FlarePartextends DrawPart
- 字段线索：sides, radius, spinSpeed, followRotation, color1, clampProgress
- 方法线索：draw, load

### `core/src/mindustry/entities/part/HaloPart.java`

- 知识页：[core-src-mindustry-entities-part-halopart-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-part-halopart-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/part/HaloPart.java`
- SHA1：`d6e4c30ca0618dd4c86c6789f972d436521b7a05`
- 声明：class HaloPartextends DrawPart
- 字段线索：hollow, shapes, sides, radius, triLength, haloRadius
- 方法线索：draw, load

### `core/src/mindustry/entities/part/HoverPart.java`

- 知识页：[core-src-mindustry-entities-part-hoverpart-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-part-hoverpart-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/part/HoverPart.java`
- SHA1：`0c482e575de09102777eff357781e58b4076c4a1`
- 声明：class HoverPartextends DrawPart
- 字段线索：radius, phase, circles, color, mirror, layer
- 方法线索：draw, load

### `core/src/mindustry/entities/part/RegionPart.java`

- 知识页：[core-src-mindustry-entities-part-regionpart-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-part-regionpart-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/part/RegionPart.java`
- SHA1：`2c00330e881890e28eaeb4837ab9f9f90ec70322`
- 声明：class RegionPartextends DrawPart
- 字段线索：childParam, suffix, name, light, regions, outlines
- 方法线索：draw, load, getOutlines

### `core/src/mindustry/entities/part/ShapePart.java`

- 知识页：[core-src-mindustry-entities-part-shapepart-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-part-shapepart-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/part/ShapePart.java`
- SHA1：`da96e9b258984c1b6d5673b3d3cfe90b7bdfd3c4`
- 声明：class ShapePartextends DrawPart
- 字段线索：circle, sides, radius, rotation, moveRot, rotateSpeed
- 方法线索：draw, load


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
