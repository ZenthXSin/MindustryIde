# Package `mindustry.maps.filters` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.maps.filters`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.maps.filters`
- 文件数：18

## 主要依赖线索

- `mindustry.world.*` × 18
- `mindustry.gen.*` × 17
- `mindustry.content.*` × 12
- `arc.struct.*` × 6
- `mindustry.maps.filters.FilterOption.*` × 6
- `arc.math.*` × 6
- `arc.util.*` × 4
- `mindustry.world.blocks.storage.*` × 3
- `arc.scene.ui.*` × 3
- `arc.scene.ui.layout.*` × 3
- `mindustry.*` × 3
- `arc.*` × 2
- `mindustry.world.blocks.environment.*` × 2
- `arc.func.*` × 1
- `arc.input.*` × 1
- `arc.scene.*` × 1
- `arc.scene.event.*` × 1
- `arc.scene.style.*` × 1
- `mindustry.ui.*` × 1
- `mindustry.ui.dialogs.*` × 1

## 文件逐个分析

### `core/src/mindustry/maps/filters/BlendFilter.java`

- 知识页：[core-src-mindustry-maps-filters-blendfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-blendfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/BlendFilter.java`
- SHA1：`c4f2886b9a5fc5445ef86fbc5a41e10c79f60ad8`
- 声明：class BlendFilterextends GenerateFilter
- 字段线索：radius, block
- 方法线索：options, isBuffered, icon, apply

### `core/src/mindustry/maps/filters/ClearFilter.java`

- 知识页：[core-src-mindustry-maps-filters-clearfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-clearfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/ClearFilter.java`
- SHA1：`c119d2867f53db9743e337f56740bf47feb01d0e`
- 声明：class ClearFilterextends GenerateFilter
- 字段线索：target, replace, ignore
- 方法线索：options, icon, apply

### `core/src/mindustry/maps/filters/CoreSpawnFilter.java`

- 知识页：[core-src-mindustry-maps-filters-corespawnfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-corespawnfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/CoreSpawnFilter.java`
- SHA1：`67ece2003cd5fdb584c44094fd31da49198a10fb`
- 声明：class CoreSpawnFilterextends GenerateFilter
- 字段线索：amount
- 方法线索：options, icon, apply, isPost

### `core/src/mindustry/maps/filters/DistortFilter.java`

- 知识页：[core-src-mindustry-maps-filters-distortfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-distortfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/DistortFilter.java`
- SHA1：`442c4e2fe5fd57c9de5e61c3b60aa914f11cf60f`
- 声明：class DistortFilterextends GenerateFilter
- 字段线索：scl
- 方法线索：options, isBuffered, icon, apply

### `core/src/mindustry/maps/filters/EnemySpawnFilter.java`

- 知识页：[core-src-mindustry-maps-filters-enemyspawnfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-enemyspawnfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/EnemySpawnFilter.java`
- SHA1：`8b1f41c680ea739d9344f73e5100773fb12735ad`
- 声明：class EnemySpawnFilterextends GenerateFilter
- 字段线索：amount
- 方法线索：options, icon, apply, isPost

### `core/src/mindustry/maps/filters/FilterOption.java`

- 知识页：[core-src-mindustry-maps-filters-filteroption-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-filteroption-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/FilterOption.java`
- SHA1：`b96522a03e109f71eab4c979a707f849d63b7612`
- 声明：class FilterOption, class SliderOptionextends FilterOption, class BlockOptionextends FilterOption
- 字段线索：floorsOnly, wallsOnly, floorsOptional, wallsOptional, wallsOresOptional, oresOnly
- 方法线索：display, build

### `core/src/mindustry/maps/filters/GenerateFilter.java`

- 知识页：[core-src-mindustry-maps-filters-generatefilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-generatefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/GenerateFilter.java`
- SHA1：`80e45c899ef129136743be477b12ba9c00deeeec`
- 声明：class GenerateFilterimplements Cloneable, Serializable, class GenerateInput, interface TileProvider
- 字段线索：seed, height, overlay, packedData
- 方法线索：apply, draw, simpleName, name, icon, randomize

### `core/src/mindustry/maps/filters/LogicFilter.java`

- 知识页：[core-src-mindustry-maps-filters-logicfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-logicfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/LogicFilter.java`
- SHA1：`ec9c490045322da8a665dafd74551de13f41bdad`
- 声明：class LogicFilterextends GenerateFilter
- 字段线索：maxInstructionsExecution, code, loop
- 方法线索：options, build, apply, icon, isPost

### `core/src/mindustry/maps/filters/MedianFilter.java`

- 知识页：[core-src-mindustry-maps-filters-medianfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-medianfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/MedianFilter.java`
- SHA1：`42e78f00e0bfa9dda1c09b0bb4ee24b02895b839`
- 声明：class MedianFilterextends GenerateFilter
- 字段线索：blocks, radius, percentile
- 方法线索：options, isBuffered, icon, apply

### `core/src/mindustry/maps/filters/MirrorFilter.java`

- 知识页：[core-src-mindustry-maps-filters-mirrorfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-mirrorfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/MirrorFilter.java`
- SHA1：`ba909a7f6b133d4ed8fbce8da3af95ef1535f926`
- 声明：class MirrorFilterextends GenerateFilter
- 字段线索：v1, angle, rotate
- 方法线索：options, icon, apply, draw

### `core/src/mindustry/maps/filters/NoiseFilter.java`

- 知识页：[core-src-mindustry-maps-filters-noisefilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-noisefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/NoiseFilter.java`
- SHA1：`aaab9515660a8f52f1595aab9f7e459fd8642ce3`
- 声明：class NoiseFilterextends GenerateFilter
- 字段线索：scl, floor
- 方法线索：options, icon, apply

### `core/src/mindustry/maps/filters/OreFilter.java`

- 知识页：[core-src-mindustry-maps-filters-orefilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-orefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/OreFilter.java`
- SHA1：`d08c8ff6cd99a85eeee0748cd9cf2a24baf5b7a0`
- 声明：class OreFilterextends GenerateFilter
- 字段线索：scl, ore
- 方法线索：options, icon, apply

### `core/src/mindustry/maps/filters/OreMedianFilter.java`

- 知识页：[core-src-mindustry-maps-filters-oremedianfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-oremedianfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/OreMedianFilter.java`
- SHA1：`930c46eaf71cea838010b8d1cd5fd1f40b69a3d2`
- 声明：class OreMedianFilterextends GenerateFilter
- 字段线索：blocks, radius, percentile
- 方法线索：options, isBuffered, icon, apply

### `core/src/mindustry/maps/filters/RandomItemFilter.java`

- 知识页：[core-src-mindustry-maps-filters-randomitemfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-randomitemfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/RandomItemFilter.java`
- SHA1：`fb6387209ccfb5701a4f00142609a3300ee022c0`
- 声明：class RandomItemFilterextends GenerateFilter
- 字段线索：drops, chance
- 方法线索：options, apply, isPost

### `core/src/mindustry/maps/filters/RiverNoiseFilter.java`

- 知识页：[core-src-mindustry-maps-filters-rivernoisefilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-rivernoisefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/RiverNoiseFilter.java`
- SHA1：`5c90f754e5589cfdd93c96c95382581cc1716d62`
- 声明：class RiverNoiseFilterextends GenerateFilter
- 字段线索：scl, floor
- 方法线索：options, icon, apply

### `core/src/mindustry/maps/filters/ScatterFilter.java`

- 知识页：[core-src-mindustry-maps-filters-scatterfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-scatterfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/ScatterFilter.java`
- SHA1：`5bb997fb2bfa44efe728e7b681bdc5fa2f1bac90`
- 声明：class ScatterFilterextends GenerateFilter
- 字段线索：chance, flooronto
- 方法线索：options, icon, apply

### `core/src/mindustry/maps/filters/SpawnPathFilter.java`

- 知识页：[core-src-mindustry-maps-filters-spawnpathfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-spawnpathfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/SpawnPathFilter.java`
- SHA1：`97f2f884ea34c4fa4f0bbb21a8d42cb289f3d9b3`
- 声明：class SpawnPathFilterextends GenerateFilter
- 字段线索：radius, block
- 方法线索：options, icon, apply, isPost

### `core/src/mindustry/maps/filters/TerrainFilter.java`

- 知识页：[core-src-mindustry-maps-filters-terrainfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-maps-filters-terrainfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/maps/filters/TerrainFilter.java`
- SHA1：`610569af20e9edd2734f488e7efbaf2820eecf67`
- 声明：class TerrainFilterextends GenerateFilter
- 字段线索：scl, floor
- 方法线索：options, icon, apply


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
