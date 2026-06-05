# Package `arc.fx.util` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.fx.util`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.fx.util`
- 文件数：4

## 主要依赖线索

- `arc.graphics.*` × 4
- `arc.graphics.gl.*` × 3
- `arc.graphics.Texture.*` × 2
- `arc.util.*` × 2
- `arc.*` × 2
- `arc.struct.*` × 1
- `arc.fx.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.math.*` × 1
- `arc.math.geom.*` × 1
- `arc.scene.*` × 1
- `arc.scene.ui.layout.*` × 1
- `arc.util.viewport.*` × 1
- `arc.graphics.Pixmap.*` × 1

## 文件逐个分析

### `extensions/fx/src/arc/fx/util/FxBufferQueue.java`

- 知识页：[extensions-fx-src-arc-fx-util-fxbufferqueue-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-util-fxbufferqueue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/util/FxBufferQueue.java`
- SHA1：`bf9f2e520e802b729d2fba551a1b8bab2a0493f4`
- 声明：class FxBufferQueueimplements Disposable
- 字段线索：buffers, currentIdx, wrapU, wrapV, filterMin, filterMag
- 方法线索：IllegalArgumentException, dispose, resize, rebind, getCurrent, changeToNext

### `extensions/fx/src/arc/fx/util/FxBufferRenderer.java`

- 知识页：[extensions-fx-src-arc-fx-util-fxbufferrenderer-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-util-fxbufferrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/util/FxBufferRenderer.java`
- SHA1：`24f1e2c0b44b8d0443d3551c8eef46de70aaa63e`
- 声明：class FxBufferRendererimplements Disposable
- 字段线索：shader
- 方法线索：dispose, rebind, renderToScreen, renderToFbo

### `extensions/fx/src/arc/fx/util/FxWidgetGroup.java`

- 知识页：[extensions-fx-src-arc-fx-util-fxwidgetgroup-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-util-fxwidgetgroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/util/FxWidgetGroup.java`
- SHA1：`088835be4abf484fd1cc968c7401963cc419cacb`
- 声明：class FxWidgetGroupextends WidgetGroup
- 字段线索：fxProcessor, initialized, resizePending, matchWidgetSize, width, height
- 方法线索：getFxProcessor, isMatchWidgetSize, setMatchWidgetSize, setScene, sizeChanged, draw

### `extensions/fx/src/arc/fx/util/PingPongBuffer.java`

- 知识页：[extensions-fx-src-arc-fx-util-pingpongbuffer-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-util-pingpongbuffer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/util/PingPongBuffer.java`
- SHA1：`f7020a060a465ac7ecaab4ab45918f6bd0dc34f9`
- 声明：class PingPongBuffer
- 字段线索：buffer1, buffer2, bufDst, bufSrc, writeState, capturing
- 方法线索：dispose, resize, rebind, begin, IllegalStateException, swap


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
