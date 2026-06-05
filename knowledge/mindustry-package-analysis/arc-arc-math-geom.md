# Package `arc.math.geom` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.math.geom`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.math.geom`
- 文件数：35

## 主要依赖线索

- `arc.math.*` × 11
- `arc.math.Mathf` × 8
- `arc.struct.*` × 8
- `arc.struct.Seq` × 3
- `arc.func.*` × 3
- `arc.util.*` × 3
- `arc.math.geom.Plane.*` × 2
- `arc.util.ArcRuntimeException` × 1
- `arc.func.Intc2` × 1
- `arc.util.pooling.Pool` × 1
- `arc.util.pooling.Pools` × 1
- `arc.struct.FloatSeq` × 1
- `arc.struct.IntSeq` × 1
- `arc.struct.ShortSeq` × 1
- `arc.math.Angles` × 1
- `arc.math.geom.QuadTree.*` × 1
- `arc.math.Interp` × 1
- `java.util.*` × 1

## 文件逐个分析

### `arc-core/src/arc/math/geom/BSpline.java`

- 知识页：[arc-core-src-arc-math-geom-bspline-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-bspline-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/BSpline.java`
- SHA1：`155ffc54fc2478eab8888b3fd1905abbdebd4e05`
- 声明：class BSpline<T extends Vector<T>> implements Path<T>
- 字段线索：d6, controlPoints, knots, degree, continuous, spanCount
- 方法线索：set, valueAt, derivativeAt, nearest, approximate, locate

### `arc-core/src/arc/math/geom/Bezier.java`

- 知识页：[arc-core-src-arc-math-geom-bezier-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-bezier-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Bezier.java`
- SHA1：`83413596444cf0a220488ff714d5654d41398404`
- 声明：class Bezier<T extends Vector<T>> implements Path<T>
- 字段线索：points, tmp, tmp2, tmp3, dt, dt2
- 方法线索：set, ArcRuntimeException, valueAt, derivativeAt, approximate, locate

### `arc-core/src/arc/math/geom/BoundingBox.java`

- 知识页：[arc-core-src-arc-math-geom-boundingbox-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-boundingbox-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/BoundingBox.java`
- SHA1：`530cd4a4c857b7b8be8c25395d77a0f9c7d3ab3e`
- 声明：class BoundingBox
- 字段线索：min, max, cnt, dim
- 方法线索：min, max, getCenter, getCenterX, getCenterY, getCenterZ

### `arc-core/src/arc/math/geom/Bresenham2.java`

- 知识页：[arc-core-src-arc-math-geom-bresenham2-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-bresenham2-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Bresenham2.java`
- SHA1：`0c2ab67859b6ccd690f4511cc3b1ed6b20f53496`
- 声明：class Bresenham2
- 字段线索：points, pool
- 方法线索：line, lineNoDiagonal

### `arc-core/src/arc/math/geom/CatmullRomSpline.java`

- 知识页：[arc-core-src-arc-math-geom-catmullromspline-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-catmullromspline-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/CatmullRomSpline.java`
- SHA1：`fbd5096dafbd45b7465ba96b3cabf0716aa38f9d`
- 声明：class CatmullRomSpline<T extends Vector<T>> implements Path<T>
- 字段线索：controlPoints, continuous, spanCount, tmp, tmp2, tmp3
- 方法线索：set, valueAt, derivativeAt, nearest, approximate, locate

### `arc-core/src/arc/math/geom/Circle.java`

- 知识页：[arc-core-src-arc-math-geom-circle-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-circle-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Circle.java`
- SHA1：`4664de7ad62dd5b712cd0eddb250cf7a93c065eb`
- 声明：class Circleimplements Shape2D
- 字段线索：y, radius, radiusDiff, dx, dy, dst
- 方法线索：set, setPosition, setX, setY, setRadius, contains

### `arc-core/src/arc/math/geom/ConvexHull.java`

- 知识页：[arc-core-src-arc-math-geom-convexhull-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-convexhull-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/ConvexHull.java`
- SHA1：`b92c4651ba5ec95dfebd7d0078d3cc9cb7833752`
- 声明：class ConvexHull
- 字段线索：quicksortStack, hull, indices, originalIndices, sortedPoints
- 方法线索：computePolygon, computeIndices, ccw, sort, quicksortPartition, sortWithIndices

### `arc-core/src/arc/math/geom/Ellipse.java`

- 知识页：[arc-core-src-arc-math-geom-ellipse-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-ellipse-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Ellipse.java`
- SHA1：`abf0377e3903c2acfbca6c6a93b56bdf7d506c9e`
- 声明：class Ellipseimplements Shape2D
- 字段线索：y, height, prime
- 方法线索：contains, set, setPosition, setSize, area, circumference

### `arc-core/src/arc/math/geom/Geometry.java`

- 知识页：[arc-core-src-arc-math-geom-geometry-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-geometry-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Geometry.java`
- SHA1：`265515d861854ab52b78590b4a15bed2e0360e31`
- 声明：class Geometry, interface Raycaster, interface SolidChecker
- 字段线索：d4, d4c, d4x, d4y, d8, d8edge
- 方法线索：IllegalArgumentException

### `arc-core/src/arc/math/geom/IntQuadTree.java`

- 知识页：[arc-core-src-arc-math-geom-intquadtree-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-intquadtree-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/IntQuadTree.java`
- SHA1：`750e4266f01bb27a2ec2abc5ea3eba1250324d90`
- 声明：class IntQuadTree, interface IntQuadTreeProvider
- 字段线索：tmp, maxObjectsPerNode, prov, bounds, objects, topRight
- 方法线索：split, unsplit, insert, remove, clear, getFittingChild

### `arc-core/src/arc/math/geom/Intersector.java`

- 知识页：[arc-core-src-arc-math-geom-intersector-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-intersector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Intersector.java`
- SHA1：`279f76f2be5b34181de777e5e53f3c16978f504a`
- 声明：class Intersector, class MinimumTranslationVector
- 字段线索：v0, v1, v2, floatArray, floatArray2, ip
- 方法线索：det, detd

### `arc-core/src/arc/math/geom/Path.java`

- 知识页：[arc-core-src-arc-math-geom-path-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-path-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Path.java`
- SHA1：`8434370ceec1a700a7d441fab57dcb4616113705`
- 声明：interface Path<T>
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/math/geom/Point2.java`

- 知识页：[arc-core-src-arc-math-geom-point2-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-point2-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Point2.java`
- SHA1：`43245430be73bd1bd0b8e8114f3d6f791c0d33df`
- 声明：class Point2
- 字段线索：x, y
- 方法线索：Point2, pack, set, dst2, dst, add

### `arc-core/src/arc/math/geom/Point3.java`

- 知识页：[arc-core-src-arc-math-geom-point3-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-point3-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Point3.java`
- SHA1：`809443671eb2d66ba9135f5fc9a3cbd8c4b03a8b`
- 声明：class Point3
- 字段线索：serialVersionUID, x, y, z, prime
- 方法线索：set, dst2, dst, add, sub, cpy

### `arc-core/src/arc/math/geom/Polygon.java`

- 知识页：[arc-core-src-arc-math-geom-polygon-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-polygon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Polygon.java`
- SHA1：`ef339cedd4028594d16e772d9cc01c4f51612cb3`
- 声明：class Polygonimplements Shape2D
- 字段线索：localVertices, worldVertices, y, originY, rotation, scaleX
- 方法线索：getVertices, setVertices, getTransformedVertices, setOrigin, setPosition, translate

### `arc-core/src/arc/math/geom/Polyline.java`

- 知识页：[arc-core-src-arc-math-geom-polyline-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-polyline-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Polyline.java`
- SHA1：`745fd44b706c1617456364519dca092bbc349b71`
- 声明：class Polylineimplements Shape2D
- 字段线索：localVertices, worldVertices, y, originY, rotation, scaleX
- 方法线索：getVertices, setVertices, getTransformedVertices, getLength, getScaledLength, getX

### `arc-core/src/arc/math/geom/Position.java`

- 知识页：[arc-core-src-arc-math-geom-position-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-position-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Position.java`
- SHA1：`7bff31599519f255af3be856765ea5356d4a61c4`
- 声明：interface Position
- 字段线索：xd, yd
- 方法线索：angleTo, dst2, dst, within

### `arc-core/src/arc/math/geom/QuadTree.java`

- 知识页：[arc-core-src-arc-math-geom-quadtree-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-quadtree-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/QuadTree.java`
- SHA1：`8a2978ad38d767417a75e1b93922a5c49dbe0ae6`
- 声明：class QuadTree<T extends QuadTreeObject>, interface QuadTreeObject
- 字段线索：tmp, maxObjectsPerNode, bounds, objects, topRight, leaf
- 方法线索：split, unsplit, insert, remove, clear, getFittingChild

### `arc-core/src/arc/math/geom/Rect.java`

- 知识页：[arc-core-src-arc-math-geom-rect-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-rect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Rect.java`
- SHA1：`d4bf170f9e4b9c1709c2fca18b69dbd59b23b289`
- 声明：class Rectimplements Shape2D
- 字段线索：tmp, tmp2, y, height, prime
- 方法线索：setCentered, set, getX, setX, getY, setY

### `arc-core/src/arc/math/geom/Shape2D.java`

- 知识页：[arc-core-src-arc-math-geom-shape2d-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-shape2d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Shape2D.java`
- SHA1：`15d749eb1cd82fdf00b06be827b2d6f2edc4250b`
- 声明：interface Shape2D
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/math/geom/Spring1D.java`

- 知识页：[arc-core-src-arc-math-geom-spring1d-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-spring1d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Spring1D.java`
- SHA1：`8fabb7fa2f8d9bbf2bf8337498130dbea1d645ed`
- 声明：class Spring1D
- 字段线索：value, target, velocity, damping, frequency
- 方法线索：update

### `arc-core/src/arc/math/geom/Spring2D.java`

- 知识页：[arc-core-src-arc-math-geom-spring2d-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-spring2d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Spring2D.java`
- SHA1：`a6c3848b73ba7622a2930509f31539786fc371a6`
- 声明：class Spring2D
- 字段线索：value, target, velocity, damping, frequency
- 方法线索：update

### `arc-core/src/arc/math/geom/Vec2.java`

- 知识页：[arc-core-src-arc-math-geom-vec2-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-vec2-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Vec2.java`
- SHA1：`4797e55f1d7604e4f32b0b9f3b4c9110cd39ebb0`
- 声明：class Vec2implements Vector<Vec2>, Position
- 字段线索：X, x, y, x_d, y_d, xd
- 方法线索：trns, trnsExact, snap, div, cpy, Vec2

### `arc-core/src/arc/math/geom/Vec3.java`

- 知识页：[arc-core-src-arc-math-geom-vec3-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-vec3-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Vec3.java`
- SHA1：`560ca38943cb4eea5e3b45c37c311f1685f1e2d2`
- 声明：class Vec3implements Vector<Vec3>
- 字段线索：X, Y, Z, Zero, tmpMat, x
- 方法线索：set, div, setFromSpherical, setToRandomDirection, cpy, Vec3

### `arc-core/src/arc/math/geom/Vector.java`

- 知识页：[arc-core-src-arc-math-geom-vector-java.md](../mindustry-source-files/arc/arc-core-src-arc-math-geom-vector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/math/geom/Vector.java`
- SHA1：`ac4de26a858b3c81e92ed0f0e86c035147d0420c`
- 声明：interface Vector<T extends Vector<T>>
- 字段线索：未抽取
- 方法线索：plus, minus, unaryMinus, times

### `extensions/g3d/src/arc/math/geom/Frustum.java`

- 知识页：[extensions-g3d-src-arc-math-geom-frustum-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-frustum-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Frustum.java`
- SHA1：`ed3d116844a1e61ba8a5aec1af333328b11f3351`
- 声明：class Frustum
- 字段线索：clipSpacePlanePoints, clipSpacePlanePointsArray, tmpV, planes, planePoints, planePointsArray
- 方法线索：update, containsPoint, containsSphere, containsSphereWithoutNearFar, containsBounds

### `extensions/g3d/src/arc/math/geom/Icosphere.java`

- 知识页：[extensions-g3d-src-arc-math-geom-icosphere-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-icosphere-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Icosphere.java`
- SHA1：`4890b436dccaeb929a2eb701a4c0023f9ee16a1a`
- 声明：class Icosphere
- 字段线索：t, baseVert, baseFace
- 方法线索：Vec3

### `extensions/g3d/src/arc/math/geom/Intersector3D.java`

- 知识页：[extensions-g3d-src-arc-math-geom-intersector3d-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-intersector3d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Intersector3D.java`
- SHA1：`a53ed537039106eb2463b7481eda785f91ca7683`
- 声明：class Intersector3D, class SplitTriangle
- 字段线索：v0, v1, v2, p, i, best
- 方法线索：toString

### `extensions/g3d/src/arc/math/geom/Mat3D.java`

- 知识页：[extensions-g3d-src-arc-math-geom-mat3d-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-mat3d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Mat3D.java`
- SHA1：`5e356d8510c696d2961d7728a9c79009ef2aae0c`
- 声明：class Mat3D
- 字段线索：M00, M01, M02, M03, M10, M11
- 方法线索：set, cpy, Mat3D, trn, getValues, mul

### `extensions/g3d/src/arc/math/geom/MeshResult.java`

- 知识页：[extensions-g3d-src-arc-math-geom-meshresult-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-meshresult-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/MeshResult.java`
- SHA1：`2ef24db5135393fc256b1d0fe7bb5abd859bb656`
- 声明：class MeshResult
- 字段线索：vertices, indices
- 方法线索：未抽取

### `extensions/g3d/src/arc/math/geom/Plane.java`

- 知识页：[extensions-g3d-src-arc-math-geom-plane-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-plane-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Plane.java`
- SHA1：`fb640d3bd2c8e5ed8bc468b6c3b35f3f57ad29c1`
- 声明：class Plane, enum PlaneSide
- 字段线索：normal, d
- 方法线索：set, project, distance, testPoint, isFrontFacing, getNormal

### `extensions/g3d/src/arc/math/geom/Quat.java`

- 知识页：[extensions-g3d-src-arc-math-geom-quat-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-quat-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Quat.java`
- SHA1：`873012c5a7727e8c8309325cc34d1c487b5fda0c`
- 声明：class Quat
- 字段线索：tmp1, tmp2, x, y, z, w
- 方法线索：set, cpy, Quat, len, toString, setEulerAngles

### `extensions/g3d/src/arc/math/geom/Ray.java`

- 知识页：[extensions-g3d-src-arc-math-geom-ray-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-ray-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Ray.java`
- SHA1：`9eead01de5397e308899c65b233e98b8172d537f`
- 声明：class Ray
- 字段线索：origin, direction, prime
- 方法线索：cpy, Ray, getEndPoint, set, toString, equals

### `extensions/g3d/src/arc/math/geom/Segment.java`

- 知识页：[extensions-g3d-src-arc-math-geom-segment-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-segment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Segment.java`
- SHA1：`1af28586671f56fd83b4a7560bcf61032e5134e5`
- 声明：class Segment
- 字段线索：a, b, prime
- 方法线索：len, len2, equals, hashCode

### `extensions/g3d/src/arc/math/geom/Sphere.java`

- 知识页：[extensions-g3d-src-arc-math-geom-sphere-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-math-geom-sphere-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/math/geom/Sphere.java`
- SHA1：`9edd61f36c1c67a1b766e6ba91efe373b12accb8`
- 声明：class Sphere
- 字段线索：PI_4_3, center, radius, prime
- 方法线索：overlaps, hashCode, equals, volume, surfaceArea


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
