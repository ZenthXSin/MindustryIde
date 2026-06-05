# Package `arc.graphics.g3d` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.graphics.g3d`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.graphics.g3d`
- 文件数：3

## 主要依赖线索

- `arc.math.geom.*` × 3
- `arc.graphics.*` × 2
- `arc.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.math.*` × 1
- `arc.graphics.gl.*` × 1
- `arc.struct.*` × 1

## 文件逐个分析

### `extensions/g3d/src/arc/graphics/g3d/Camera3D.java`

- 知识页：[extensions-g3d-src-arc-graphics-g3d-camera3d-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-graphics-g3d-camera3d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/graphics/g3d/Camera3D.java`
- SHA1：`13ec981f85442338cecd8dee724d1532efcd8ad9`
- 声明：class Camera3D
- 字段线索：fov, near, far, perspective, height, position
- 方法线索：update, resize, lookAt, normalizeUp, unproject, project

### `extensions/g3d/src/arc/graphics/g3d/PlaneBatch3D.java`

- 知识页：[extensions-g3d-src-arc-graphics-g3d-planebatch3d-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-graphics-g3d-planebatch3d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/graphics/g3d/PlaneBatch3D.java`
- SHA1：`7812c295d02c641e8eeac9b7519c6341231b8917`
- 声明：class PlaneBatch3Dextends Batch
- 字段线索：up, batch, vertex, scaling, worldOriginX, worldOriginY
- 方法线索：setScaling, setPlane, proj, flush, draw, checkFlush

### `extensions/g3d/src/arc/graphics/g3d/VertexBatch3D.java`

- 知识页：[extensions-g3d-src-arc-graphics-g3d-vertexbatch3d-java.md](../mindustry-source-files/arc/extensions-g3d-src-arc-graphics-g3d-vertexbatch3d-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/g3d/src/arc/graphics/g3d/VertexBatch3D.java`
- SHA1：`7a6d2989e0e19f69fec1c97c08548a51291197ac`
- 声明：class VertexBatch3D
- 字段线索：maxVertices, mesh, numTexCoords, vertexSize, normalOffset, colorOffset
- 方法线索：Shader, buildVertexAttributes, setShader, color, texCoord, normal


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
