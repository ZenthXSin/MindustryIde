# arc:backends/backend-android/src/arc/backend/android/AndroidGraphics.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidGraphics.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`backends/backend-android/src/arc/backend/android/AndroidGraphics.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidGraphics.java`
- SHA1：`6fae76f95c8dd8a6c32f783f1f131d777172abb6`
- 大小：16325 bytes
- 行数：531

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class AndroidGraphicsextends Graphics implements Renderer`。

关键词：arc, graphics

## Package

`arc.backend.android`

## 类型声明

- `class AndroidGraphicsextends Graphics implements Renderer`

## 字段线索

- `logTag`
- `config`
- `view`
- `lastFrameTime`
- `deltaTime`
- `frameStart`
- `frameId`
- `frames`
- `fps`
- `ppiX`
- `ppiY`
- `ppcX`
- `ppcY`
- `density`
- `bufferFormat`
- `isContinuous`

## 方法线索

- `createGLSurfaceView`
- `getEglConfigChooser`
- `ArcEglConfigChooser`
- `updatePpi`
- `checkGL20`
- `getGL20`
- `setGL20`
- `getGL30`
- `setGL30`
- `getHeight`
- `getWidth`
- `getBackBufferWidth`
- `getBackBufferHeight`
- `setupGL`
- `onSurfaceChanged`
- `onSurfaceCreated`
- `logConfig`
- `getAttrib`
- `onDrawFrame`
- `updateSafeAreaInsets`
- `getSafeInsets`
- `getFrameId`
- `getDeltaTime`
- `getGLVersion`
- `getFramesPerSecond`
- `getView`
- `getPpiX`
- `getPpiY`
- `getPpcX`
- `getPpcY`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
