# Package `arc` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc`
- 文件数：9

## 主要依赖线索

- `arc.util.*` × 4
- `arc.struct.*` × 3
- `arc.files.Fi` × 3
- `arc.audio.Audio` × 2
- `arc.func.*` × 2
- `java.net.*` × 1
- `arc.assets.AssetManager` × 1
- `arc.graphics.Camera` × 1
- `arc.graphics.GL20` × 1
- `arc.graphics.GL30` × 1
- `arc.graphics.g2d.Batch` × 1
- `arc.graphics.g2d.TextureAtlas` × 1
- `arc.scene.Scene` × 1
- `arc.util.I18NBundle` × 1
- `arc.struct.Seq` × 1
- `arc.struct.ObjectMap` × 1
- `arc.func.Cons` × 1
- `arc.util.ArcRuntimeException` × 1
- `arc.Graphics.Cursor.*` × 1
- `arc.graphics.*` × 1

## 文件逐个分析

### `arc-core/src/arc/Application.java`

- 知识页：[arc-core-src-arc-application-java.md](../mindustry-source-files/arc/arc-core-src-arc-application-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/Application.java`
- SHA1：`6e74d4a4ee64d215e9d0ca9b96270a38ccc29be7`
- 声明：interface Applicationextends Disposable, enum ApplicationType
- 字段线索：未抽取
- 方法线索：addListener, removeListener, defaultUpdate, isDesktop, isHeadless, isAndroid

### `arc-core/src/arc/ApplicationCore.java`

- 知识页：[arc-core-src-arc-applicationcore-java.md](../mindustry-source-files/arc/arc-core-src-arc-applicationcore-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/ApplicationCore.java`
- SHA1：`e0bcd48041c0c718a061042099b9b13f118274b2`
- 声明：class ApplicationCoreimplements ApplicationListener
- 字段线索：modules
- 方法线索：add, init, resize, update, pause, resume

### `arc-core/src/arc/ApplicationListener.java`

- 知识页：[arc-core-src-arc-applicationlistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-applicationlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/ApplicationListener.java`
- SHA1：`21ed39358e6298cfd55c21d22b79e45bd2892c2d`
- 声明：interface ApplicationListener
- 字段线索：未抽取
- 方法线索：init, resize, update, pause, resume, dispose

### `arc-core/src/arc/Core.java`

- 知识页：[arc-core-src-arc-core-java.md](../mindustry-source-files/arc/arc-core-src-arc-core-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/Core.java`
- SHA1：`cde2866db1a3abc95d98c076cea9106d44b071b1`
- 声明：class Core
- 字段线索：app, graphics, audio, input, files, settings
- 方法线索：未抽取

### `arc-core/src/arc/Events.java`

- 知识页：[arc-core-src-arc-events-java.md](../mindustry-source-files/arc/arc-core-src-arc-events-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/Events.java`
- SHA1：`5859695f08db160db24b58380bf1636abb000d33`
- 声明：class Events
- 字段线索：events
- 方法线索：未抽取

### `arc-core/src/arc/Files.java`

- 知识页：[arc-core-src-arc-files-java.md](../mindustry-source-files/arc/arc-core-src-arc-files-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/Files.java`
- SHA1：`e65ff71c95cd17371744a2c1bf5ace7bd873975b`
- 声明：interface Files, enum FileType
- 字段线索：未抽取
- 方法线索：classpath, internal, external, absolute, local, cache

### `arc-core/src/arc/Graphics.java`

- 知识页：[arc-core-src-arc-graphics-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/Graphics.java`
- SHA1：`6516f854b42ddb3af00fed2dbc56f705493de479`
- 声明：class Graphicsimplements Disposable, class BufferFormat, interface Cursorextends arc.util.Disposable
- 字段线索：lastCursor, a, stencil, samples, coverageSampling
- 方法线索：isGL30Available, supportsInstancing, clear, isPortrait, getAspect, isHidden

### `arc-core/src/arc/Input.java`

- 知识页：[arc-core-src-arc-input-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/Input.java`
- SHA1：`7dee1c039f2f67b031a2497b476e0677ae4b3d2f`
- 声明：class Input, enum Orientation, enum Peripheral
- 字段线索：keyboard, inputMultiplexer, caughtKeys, mouseReturn, useKeyboard, multiline
- 方法线索：mouseWorld, mouseScreen, mouseWorldX, mouseWorldY, mouse, setUseKeyboard

### `arc-core/src/arc/Settings.java`

- 知识页：[arc-core-src-arc-settings-java.md](../mindustry-source-files/arc/arc-core-src-arc-settings-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/Settings.java`
- SHA1：`4a1c030f18dd13c89e921ed0fa345a60a08dc6ae`
- 声明：class Settings
- 字段线索：typeBool, maxBackups, dataDirectory, appName, defaults, values
- 方法线索：setJson, setCompressed, getAppName, setAppName, setErrorHandler, setAutosave


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
