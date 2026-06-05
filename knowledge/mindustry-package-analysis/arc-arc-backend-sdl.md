# Package `arc.backend.sdl` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.backend.sdl`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.backend.sdl`
- 文件数：18

## 主要依赖线索

- `arc.util.*` × 9
- `arc.*` × 8
- `arc.graphics.*` × 8
- `arc.struct.*` × 6
- `java.nio.*` × 6
- `arc.input.*` × 6
- `arc.backend.sdl.jni.*` × 4
- `arc.files.*` × 4
- `arc.scene.ui.*` × 4
- `java.io.*` × 4
- `arc.graphics.gl.*` × 4
- `java.util.*` × 3
- `org.lwjgl.sdl.*` × 3
- `org.lwjgl.opengl.*` × 3
- `arc.audio.*` × 2
- `arc.func.*` × 2
- `arc.math.geom.*` × 2
- `java.net.*` × 2
- `arc.Files.*` × 2
- `arc.Graphics.Cursor.*` × 2

## 文件逐个分析

### `backends/backend-sdl/src/arc/backend/sdl/SdlApplication.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlapplication-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlapplication-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlApplication.java`
- SHA1：`b6a9a179f78b44c02098cf5a4c93c918a5e6a777`
- 声明：class SdlApplicationimplements Application, class SdlErrorextends RuntimeException
- 字段线索：listeners, runnables, inputs, graphics, input, config
- 方法线索：addTextInputListener, update, initIcon, init, loop, listen

### `backends/backend-sdl/src/arc/backend/sdl/SdlConfig.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlconfig-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlconfig-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlConfig.java`
- SHA1：`22e7fd3869cd0ef6ed8ec81fb17c12da89517392`
- 声明：class SdlConfig
- 字段线索：r, depth, samples, hdpiMode, width, height
- 方法线索：setWindowIcon

### `backends/backend-sdl/src/arc/backend/sdl/SdlFiles.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlfiles-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlfiles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlFiles.java`
- SHA1：`07fd5af220fb1cc32fa22680bab61fef0dc777bc`
- 声明：class SdlFilesimplements Files, class SdlFiextends Fi
- 字段线索：externalPath, localPath
- 方法线索：get, SdlFi, getExternalStoragePath, isExternalStorageAvailable, getLocalStoragePath, isLocalStorageAvailable

### `backends/backend-sdl/src/arc/backend/sdl/SdlGL20.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlgl20-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlgl20-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlGL20.java`
- SHA1：`49f9e4a857faaaff5fe00c32363c50280fbaf901`
- 声明：class SdlGL20implements GL20
- 字段线索：未抽取
- 方法线索：glActiveTexture, glBindTexture, glBlendFunc, glClear, glClearColor, glClearDepthf

### `backends/backend-sdl/src/arc/backend/sdl/SdlGL30.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlgl30-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlgl30-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlGL30.java`
- SHA1：`fa12b25c2eb46d70ecd3d7ee2d031251854bb7a0`
- 声明：class SdlGL30extends SdlGL20 implements GL30
- 字段线索：未抽取
- 方法线索：glReadBuffer, glDrawRangeElements, glTexImage3D, glTexSubImage3D, glCopyTexSubImage3D, glGenQueries

### `backends/backend-sdl/src/arc/backend/sdl/SdlGraphics.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlgraphics-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlgraphics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlGraphics.java`
- SHA1：`000cf4df88a07abaf0bf29e2425a992b042ec8fa`
- 声明：class SdlGraphicsextends Graphics, class SdlCursorimplements Cursor
- 字段线索：gl20, gl30, glVersion, bufferFormat, app, cursors
- 方法线索：ArcRuntimeException, isGL30Available, getGL20, setGL20, getGL30, setGL30

### `backends/backend-sdl/src/arc/backend/sdl/SdlInput.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlinput-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlInput.java`
- SHA1：`c69f6c9b4c31ec8d9d156717ac8a0e432d68dce2`
- 声明：class SdlInputextends Input, class EditEvent, class ImeData
- 字段线索：queue, mouseY, deltaY, mousePressed, strcpy, stringEditEvents
- 方法线索：mouseX, deltaX, mouseY, deltaY, isTouched, justTouched

### `backends/backend-sdl/src/arc/backend/sdl/SdlKeymap.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlkeymap-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlkeymap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlKeymap.java`
- SHA1：`07180f9480927ec52310ce01baf06b90a3b589f7`
- 声明：class SdlKeymap
- 字段线索：未抽取
- 方法线索：未抽取

### `backends/backend-sdl/src/arc/backend/sdl/SdlScanmap.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-sdlscanmap-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-sdlscanmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/SdlScanmap.java`
- SHA1：`dda85bd84509c4793243b8721f14c3bddb9c23d5`
- 声明：class SdlScanmap
- 字段线索：未抽取
- 方法线索：未抽取

### `backends/backend-sdl3/src/arc/backend/sdl/SdlApplication.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlapplication-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlapplication-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlApplication.java`
- SHA1：`0b4c3aa0ae95342981d370245b982fb6695f9ed3`
- 声明：class SdlApplicationimplements Application, class SdlErrorextends RuntimeException
- 字段线索：listeners, runnables, graphics, input, config, mainThread
- 方法线索：addTextInputListener, update, initIcon, init, loop, listen

### `backends/backend-sdl3/src/arc/backend/sdl/SdlConfig.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlconfig-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlconfig-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlConfig.java`
- SHA1：`d1dec9ddd7696b8e8352eee89d7ee35e2f76fc42`
- 声明：class SdlConfig
- 字段线索：r, depth, samples, hdpiMode, width, height
- 方法线索：setWindowIcon

### `backends/backend-sdl3/src/arc/backend/sdl/SdlFiles.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlfiles-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlfiles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlFiles.java`
- SHA1：`07fd5af220fb1cc32fa22680bab61fef0dc777bc`
- 声明：class SdlFilesimplements Files, class SdlFiextends Fi
- 字段线索：externalPath, localPath
- 方法线索：get, SdlFi, getExternalStoragePath, isExternalStorageAvailable, getLocalStoragePath, isLocalStorageAvailable

### `backends/backend-sdl3/src/arc/backend/sdl/SdlGL20.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlgl20-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlgl20-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlGL20.java`
- SHA1：`377fa381bcd85b9035398672bedc7937f073b263`
- 声明：class SdlGL20implements arc.graphics.GL20
- 字段线索：buffer, floatBuffer, intBuffer
- 方法线索：ensureBufferCapacity, toFloatBuffer, toIntBuffer, glActiveTexture, glAttachShader, glBindAttribLocation

### `backends/backend-sdl3/src/arc/backend/sdl/SdlGL30.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlgl30-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlgl30-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlGL30.java`
- SHA1：`dbe7ead60ee70df07ad9903401411a6cacd22750`
- 声明：class SdlGL30extends SdlGL20 implements arc.graphics.GL30
- 字段线索：未抽取
- 方法线索：glReadBuffer, glDrawRangeElements, ArcRuntimeException, glTexImage3D, glTexSubImage3D, glCopyTexSubImage3D

### `backends/backend-sdl3/src/arc/backend/sdl/SdlGraphics.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlgraphics-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlgraphics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlGraphics.java`
- SHA1：`7a8eb6f25972b12edb75234c2d9b8402e8857c1b`
- 声明：class SdlGraphicsextends Graphics, class SdlCursorimplements Cursor
- 字段线索：gl20, gl30, glVersion, bufferFormat, app, cursors
- 方法线索：ArcRuntimeException, isGL30Available, getGL20, setGL20, getGL30, setGL30

### `backends/backend-sdl3/src/arc/backend/sdl/SdlInput.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlinput-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlInput.java`
- SHA1：`a5dd17e979498329f87589d9cecb54be16e39da7`
- 声明：class SdlInputextends Input, class ImeData, class EditEvent
- 字段线索：queue, keycodeToScancode, mouseY, deltaY, mousePressed, stringEditEvents
- 方法线索：fixSign, getKeyName, mouseX, deltaX, mouseY, deltaY

### `backends/backend-sdl3/src/arc/backend/sdl/SdlKeymap.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlkeymap-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlkeymap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlKeymap.java`
- SHA1：`07180f9480927ec52310ce01baf06b90a3b589f7`
- 声明：class SdlKeymap
- 字段线索：未抽取
- 方法线索：未抽取

### `backends/backend-sdl3/src/arc/backend/sdl/SdlScanmap.java`

- 知识页：[backends-backend-sdl3-src-arc-backend-sdl-sdlscanmap-java.md](../mindustry-source-files/arc/backends-backend-sdl3-src-arc-backend-sdl-sdlscanmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl3/src/arc/backend/sdl/SdlScanmap.java`
- SHA1：`dda85bd84509c4793243b8721f14c3bddb9c23d5`
- 声明：class SdlScanmap
- 字段线索：未抽取
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
