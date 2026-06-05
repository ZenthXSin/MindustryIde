# Package `arc.util.viewport` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.util.viewport`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`arc.util.viewport`
- 文件数：7

## 主要依赖线索

- `arc.graphics.Camera` × 7
- `arc.util.Scaling` × 5
- `arc.math.geom.Vec2` × 2
- `arc.ApplicationListener` × 1
- `arc.Core` × 1
- `arc.graphics.g2d.ScissorStack` × 1
- `arc.graphics.gl.HdpiUtils` × 1
- `arc.math.Mat` × 1
- `arc.math.geom.*` × 1

## 文件逐个分析

### `arc-core/src/arc/util/viewport/ExtendViewport.java`

- 知识页：[arc-core-src-arc-util-viewport-extendviewport-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-viewport-extendviewport-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/viewport/ExtendViewport.java`
- SHA1：`58ed6ac83cedf8323251cd5513e6160e9f298c87`
- 声明：class ExtendViewportextends Viewport
- 字段线索：minWorldHeight, maxWorldHeight
- 方法线索：update, getMinWorldWidth, setMinWorldWidth, getMinWorldHeight, setMinWorldHeight, getMaxWorldWidth

### `arc-core/src/arc/util/viewport/FillViewport.java`

- 知识页：[arc-core-src-arc-util-viewport-fillviewport-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-viewport-fillviewport-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/viewport/FillViewport.java`
- SHA1：`f8f68bbdc7df1a1345c9360f4cdfaf125f285960`
- 声明：class FillViewportextends ScalingViewport
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/viewport/FitViewport.java`

- 知识页：[arc-core-src-arc-util-viewport-fitviewport-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-viewport-fitviewport-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/viewport/FitViewport.java`
- SHA1：`3c210cee3fc3aba74245d68906cce97db3420c32`
- 声明：class FitViewportextends ScalingViewport
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/viewport/ScalingViewport.java`

- 知识页：[arc-core-src-arc-util-viewport-scalingviewport-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-viewport-scalingviewport-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/viewport/ScalingViewport.java`
- SHA1：`acb5171aa72498676e4c67a6d6fa264e668b220b`
- 声明：class ScalingViewportextends Viewport
- 字段线索：scaling
- 方法线索：update, getScaling, setScaling

### `arc-core/src/arc/util/viewport/ScreenViewport.java`

- 知识页：[arc-core-src-arc-util-viewport-screenviewport-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-viewport-screenviewport-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/viewport/ScreenViewport.java`
- SHA1：`d7c079f141f9e2a640fe37e1ece0ab175a14f4ae`
- 声明：class ScreenViewportextends Viewport
- 字段线索：unitsPerPixel
- 方法线索：update, getUnitsPerPixel, setUnitsPerPixel

### `arc-core/src/arc/util/viewport/StretchViewport.java`

- 知识页：[arc-core-src-arc-util-viewport-stretchviewport-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-viewport-stretchviewport-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/viewport/StretchViewport.java`
- SHA1：`f2ea44b84ae459612d308b63039b2cbc58e3d9ec`
- 声明：class StretchViewportextends ScalingViewport
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/viewport/Viewport.java`

- 知识页：[arc-core-src-arc-util-viewport-viewport-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-viewport-viewport-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/viewport/Viewport.java`
- SHA1：`d15a558330f9cd9fa675ea7d911b165cfdea6c7c`
- 声明：class Viewport
- 字段线索：tmp, camera, worldHeight, screenHeight
- 方法线索：apply, update, unproject, project, calculateScissors, toScreenCoordinates


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
