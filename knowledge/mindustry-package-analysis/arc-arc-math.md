# Package `arc.math` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.math`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.math`
- 文件数：14

## 主要依赖线索

- `arc.math.geom.*` × 5
- `arc.util.*` × 3
- `arc.struct.FloatSeq` × 2
- `arc.struct.IntSeq` × 2
- `arc.struct.ShortSeq` × 2
- `java.util.*` × 2
- `arc.*` × 1
- `arc.func.*` × 1
- `arc.struct.Seq` × 1
- `arc.struct.BoolSeq` × 1
- `arc.math.geom.Geometry` × 1
- `arc.math.geom.Intersector` × 1
- `arc.math.geom.Vec2` × 1
- `arc.struct.*` × 1
- `java.util.Random` × 1

## 文件逐个分析

### `arc-core/src/arc/math/Affine2.java`

- 知识页：[arc-core-src-arc-math-affine2-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-affine2-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Affine2.java`
- SHA1：`021e3ab3662c5f704ef91a5005dac324dd133f42`
- 声明：class Affine2
- 字段线索：m00, m10
- 方法线索：idt, set, setToTranslation, setToScaling, setToRotation, setToRotationRad

### `arc-core/src/arc/math/Angles.java`

- 知识页：[arc-core-src-arc-math-angles-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-angles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Angles.java`
- SHA1：`0c49406a180970d1e8d25801e3abd7f88bf1cf77`
- 声明：class Angles, interface ParticleConsumer
- 字段线索：rand, rv
- 方法线索：未抽取

### `arc-core/src/arc/math/CumulativeDistribution.java`

- 知识页：[arc-core-src-arc-math-cumulativedistribution-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-cumulativedistribution-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/CumulativeDistribution.java`
- SHA1：`a301dc8090f9afe968ad78d5ee95c023a55f3576`
- 声明：class CumulativeDistribution<T>, class CumulativeValue
- 字段线索：values, value, frequency, interval
- 方法线索：add, generate, generateNormalized, generateUniform, value, size

### `arc-core/src/arc/math/DelaunayTriangulator.java`

- 知识页：[arc-core-src-arc-math-delaunaytriangulator-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-delaunaytriangulator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/DelaunayTriangulator.java`
- SHA1：`504669fd15883fde0af2fd7c0fbdfd1a4547b2df`
- 声明：class DelaunayTriangulator
- 字段线索：EPSILON, INSIDE, COMPLETE, INCOMPLETE, quicksortStack, triangles
- 方法线索：computeTriangles, circumCircle, sort, quicksortPartition, trim

### `arc-core/src/arc/math/EarClippingTriangulator.java`

- 知识页：[arc-core-src-arc-math-earclippingtriangulator-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-earclippingtriangulator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/EarClippingTriangulator.java`
- SHA1：`ab82426afb34ad36e2f15b5ebf127aced504d46e`
- 声明：class EarClippingTriangulator
- 字段线索：CONCAVE, CONVEX, indicesArray, vertexTypes, triangles, indices
- 方法线索：computeTriangles, triangulate, classifyVertex, findEarTip, isEarTip, cutEarTip

### `arc-core/src/arc/math/Extrapolator.java`

- 知识页：[arc-core-src-arc-math-extrapolator-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-extrapolator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Extrapolator.java`
- SHA1：`91a0e731a5067b1f1a692de44f9a6ee83ee02eaa`
- 声明：class Extrapolator
- 字段线索：lastPacketPos, tmpArr2, updateTime, size
- 方法线索：addSample, reset, readPosition, estimateLatency, estimateUpdateTime, estimates

### `arc-core/src/arc/math/FloatCounter.java`

- 知识页：[arc-core-src-arc-math-floatcounter-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-floatcounter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/FloatCounter.java`
- SHA1：`3c4720ebe5d4604f3fe4aa03aba43e6ad871b5dd`
- 声明：class FloatCounter
- 字段线索：mean, count, total, min, max, average
- 方法线索：put, reset

### `arc-core/src/arc/math/Interp.java`

- 知识页：[arc-core-src-arc-math-interp-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-interp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Interp.java`
- SHA1：`58882c0f98dbd2574281310a983841c606eadd99`
- 声明：interface Interp, class Powimplements Interp, class PowInextends Pow
- 字段线索：power, scale, bounces, heights
- 方法线索：apply, out, IllegalArgumentException

### `arc-core/src/arc/math/LinearRegression.java`

- 知识页：[arc-core-src-arc-math-linearregression-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-linearregression-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/LinearRegression.java`
- SHA1：`8bfddf9110dd0223e0fa2aeeb4a81082ff040e51`
- 声明：class LinearRegression
- 字段线索：slope
- 方法线索：calculate, predict

### `arc-core/src/arc/math/Mat.java`

- 知识页：[arc-core-src-arc-math-mat-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-mat-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Mat.java`
- SHA1：`46f8cd81eeb261faff29db62d4ab77563470242a`
- 声明：class Mat
- 字段线索：M00, M01, M02, M10, M11, M12
- 方法线索：setOrtho, idt, mul, mulLeft, setToRotation, setToRotationRad

### `arc-core/src/arc/math/Mathf.java`

- 知识页：[arc-core-src-arc-math-mathf-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-mathf-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Mathf.java`
- SHA1：`79c854118fc3245baf81e437345c790de01f8648`
- 声明：class Mathf
- 字段线索：signs, zeroOne, booleans, FLOAT_ROUNDING_ERROR, PI, PI2
- 方法线索：未抽取

### `arc-core/src/arc/math/Rand.java`

- 知识页：[arc-core-src-arc-math-rand-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-rand-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Rand.java`
- SHA1：`280dc750e86171308f8304ffd7b756a3cc41a9e2`
- 声明：class Randextends Random
- 字段线索：NORM_DOUBLE, NORM_FLOAT, seed0, seed1, s0, bits
- 方法线索：nextLong, nextInt, nextDouble, nextFloat, nextBoolean, nextBytes

### `arc-core/src/arc/math/Scaled.java`

- 知识页：[arc-core-src-arc-math-scaled-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-scaled-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/Scaled.java`
- SHA1：`f9894fa8e9be7bc196f6e70a2a16c413ccf123e8`
- 声明：interface Scaled
- 字段线索：未抽取
- 方法线索：fout, fin, finpow, foutpow, finpowdown, foutpowdown

### `arc-core/src/arc/math/WindowedMean.java`

- 知识页：[arc-core-src-arc-math-windowedmean-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-windowedmean-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/WindowedMean.java`
- SHA1：`44eadb2403cfb5bdb5792cb9dbe252122e6b7519`
- 声明：class WindowedMean
- 字段线索：未抽取
- 方法线索：reset, get, hasEnoughData, clear, fill, add


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
