# Package `math` (arc)

> Source: 本地源码仓库 `arc` 中 package `math`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`math`
- 文件数：9

## 主要依赖线索

- `org.junit.Test` × 6
- `arc.math.geom.Vec2` × 2
- `org.junit.Assert` × 2
- `arc.math.Mathf` × 2
- `arc.util.*` × 2
- `org.junit.*` × 2
- `arc.math.geom.Rect` × 2
- `arc.struct.Seq` × 1
- `arc.math.geom.Bezier` × 1
- `org.junit.Before` × 1
- `org.junit.runner.RunWith` × 1
- `org.junit.runners.Parameterized` × 1
- `org.junit.runners.Parameterized.Parameter` × 1
- `org.junit.runners.Parameterized.Parameters` × 1
- `java.util.ArrayList` × 1
- `java.util.Collection` × 1
- `arc.util.noise.*` × 1
- `arc.func.*` × 1
- `arc.struct.*` × 1
- `arc.util.pooling.*` × 1

## 文件逐个分析

### `arc-core/test/math/BezierTest.java`

- 知识页：[arc-core-test-math-beziertest-java.md](../mindustry-source-files/arc/arc-core-test-math-beziertest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/BezierTest.java`
- SHA1：`236ddd49b54bb93f0251813642916ba6185875ba`
- 声明：class BezierTest, enum ImportType
- 字段线索：epsilon, epsilonApprimations, type, useSetter, bezier
- 方法线索：setup, create, testLinear2D

### `arc-core/test/math/IntersectorTest.java`

- 知识页：[arc-core-test-math-intersectortest-java.md](../mindustry-source-files/arc/arc-core-test-math-intersectortest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/IntersectorTest.java`
- SHA1：`7d208944b61c215c9298a9a01928e3422ec73820`
- 声明：class IntersectorTest
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/test/math/MathfTest.java`

- 知识页：[arc-core-test-math-mathftest-java.md](../mindustry-source-files/arc/arc-core-test-math-mathftest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/MathfTest.java`
- SHA1：`2f80e01d0042d9ecfbaa52478518d7e8e495fb31`
- 声明：class MathfTest
- 字段线索：未抽取
- 方法线索：lerpAngleDeg, lerpAngleDegCrossingZero, lerpAngleDegCrossingZeroBackwards

### `arc-core/test/math/NoiseTest.java`

- 知识页：[arc-core-test-math-noisetest-java.md](../mindustry-source-files/arc/arc-core-test-math-noisetest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/NoiseTest.java`
- SHA1：`c3bbeb4d3cf0ce21310eed38ed8f914afcb20351`
- 声明：class NoiseTest
- 字段线索：未抽取
- 方法线索：perfcomp

### `arc-core/test/math/PoolTest.java`

- 知识页：[arc-core-test-math-pooltest-java.md](../mindustry-source-files/arc/arc-core-test-math-pooltest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/PoolTest.java`
- SHA1：`b57a7252f8fb3f62de46da66d547ceef2756308e`
- 声明：class PoolTest
- 字段线索：未抽取
- 方法线索：allocation

### `arc-core/test/math/RectangleTest.java`

- 知识页：[arc-core-test-math-rectangletest-java.md](../mindustry-source-files/arc/arc-core-test-math-rectangletest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/RectangleTest.java`
- SHA1：`1086097be5837b9a242c62ed6f4a5686d180890a`
- 声明：class RectangleTest
- 字段线索：未抽取
- 方法线索：testToString, testFromString

### `arc-core/test/math/Shape2DTest.java`

- 知识页：[arc-core-test-math-shape2dtest-java.md](../mindustry-source-files/arc/arc-core-test-math-shape2dtest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/Shape2DTest.java`
- SHA1：`c2008eb146ed7f40039aee6778cedb49747dbf91`
- 声明：class Shape2DTest
- 字段线索：未抽取
- 方法线索：testCircle, testRectangle

### `arc-core/test/math/Vector2Test.java`

- 知识页：[arc-core-test-math-vector2test-java.md](../mindustry-source-files/arc/arc-core-test-math-vector2test-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/Vector2Test.java`
- SHA1：`5f7770ebe6abc4a64d911cd15b38c10534e06421`
- 声明：class Vector2Test
- 字段线索：未抽取
- 方法线索：testToString, testFromString

### `arc-core/test/math/Vector3Test.java`

- 知识页：[arc-core-test-math-vector3test-java.md](../mindustry-source-files/arc/arc-core-test-math-vector3test-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/math/Vector3Test.java`
- SHA1：`2a24f23268c9d7332a70d3aaa3c6d8b785c75366`
- 声明：class Vector3Test
- 字段线索：未抽取
- 方法线索：testToString, testFromString


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
