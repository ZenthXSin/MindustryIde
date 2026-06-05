# Package `arc.util.noise` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.util.noise`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`arc.util.noise`
- 文件数：5

## 主要依赖线索

- `arc.math.Rand` × 1
- `java.util.Random` × 1

## 文件逐个分析

### `arc-core/src/arc/util/noise/Noise.java`

- 知识页：[arc-core-src-arc-util-noise-noise-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-noise-noise-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/noise/Noise.java`
- SHA1：`2da29e616dbb17e1e5e963350437edad91033930`
- 声明：class Noise
- 字段线索：seed, P, B, M, NP, N
- 方法线索：rawNoise

### `arc-core/src/arc/util/noise/Ridged.java`

- 知识页：[arc-core-src-arc-util-noise-ridged-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-noise-ridged-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/noise/Ridged.java`
- SHA1：`3cdd3488378650ddf01042b696e176fafce14082`
- 声明：class Ridged
- 字段线索：X_NOISE_GEN, Y_NOISE_GEN, Z_NOISE_GEN, SEED_NOISE_GEN, SHIFT_NOISE_GEN, quality
- 方法线索：range, gradientNoise3D, gradientNoise, lerp, scurve3, scurve5

### `arc-core/src/arc/util/noise/Simplex.java`

- 知识页：[arc-core-src-arc-util-noise-simplex-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-noise-simplex-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/noise/Simplex.java`
- SHA1：`791f963d281d69554be24af37dd010fa5354c943`
- 声明：class Simplex
- 字段线索：grad3, grad4, simplex
- 方法线索：perm, fastfloor, dot

### `arc-core/src/arc/util/noise/VectorTable.java`

- 知识页：[arc-core-src-arc-util-noise-vectortable-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-noise-vectortable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/noise/VectorTable.java`
- SHA1：`da2db0440e424615e3c5659ea6adf7b35f3aac06`
- 声明：class VectorTable
- 字段线索：randomVectors
- 方法线索：未抽取

### `arc-core/src/arc/util/noise/VoronoiNoise.java`

- 知识页：[arc-core-src-arc-util-noise-voronoinoise-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-noise-voronoinoise-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/noise/VoronoiNoise.java`
- SHA1：`dfc4127dc9b1c3ee1b2330b1ce2fe6e1162d547b`
- 声明：class VoronoiNoise
- 字段线索：SQRT_2, SQRT_3, useDistance, seed, useManhattan, rnd
- 方法线索：getDistance, isUseDistance, setUseDistance, getSeed, setSeed, noise


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
