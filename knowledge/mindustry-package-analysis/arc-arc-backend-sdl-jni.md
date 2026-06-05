# Package `arc.backend.sdl.jni` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.backend.sdl.jni`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

Arc 后端包：负责平台后端、Android/Desktop/SDL 等运行环境适配。

## 规模

- 仓库：`arc`
- Package：`arc.backend.sdl.jni`
- 文件数：2

## 主要依赖线索

- `arc.util.*` × 2
- `java.nio.*` × 2
- `java.io.*` × 1

## 文件逐个分析

### `backends/backend-sdl/src/arc/backend/sdl/jni/SDL.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-jni-sdl-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-jni-sdl-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/jni/SDL.java`
- SHA1：`6ff541081c3cbfd8a95a09573692144a2fcddee5`
- 声明：class SDL
- 字段线索：SDL_INIT_TIMER
- 方法线索：loadFile

### `backends/backend-sdl/src/arc/backend/sdl/jni/SDLGL.java`

- 知识页：[backends-backend-sdl-src-arc-backend-sdl-jni-sdlgl-java.md](../mindustry-source-files/arc/backends-backend-sdl-src-arc-backend-sdl-jni-sdlgl-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-sdl/src/arc/backend/sdl/jni/SDLGL.java`
- SHA1：`5a80f39305eb7cda8aa0252746de5931380a103b`
- 声明：class SDLGL
- 字段线索：bufferClass, byteBufferClass, charBufferClass, shortBufferClass, intBufferClass, longBufferClass
- 方法线索：nativeClassInitBuffer, nativeClassInit, getElementSizeShift, getBufferPosition


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
