# Package `arc.backend.android` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.backend.android`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.backend.android`
- 文件数：10

## 主要依赖线索

- `arc.*` × 6
- `android.os.*` × 4
- `android.app.*` × 3
- `android.view.*` × 3
- `arc.backend.android.surfaceview.*` × 3
- `android.util.*` × 3
- `android.annotation.*` × 2
- `android.content.*` × 2
- `android.content.res.*` × 2
- `android.widget.*` × 2
- `arc.struct.*` × 2
- `arc.util.*` × 2
- `android.hardware.*` × 2
- `android.opengl.*` × 2
- `arc.graphics.*` × 2
- `arc.util.Log` × 2
- `arc.input.*` × 2
- `android.net.*` × 1
- `arc.Application` × 1
- `arc.audio.*` × 1

## 文件逐个分析

### `backends/backend-android/src/arc/backend/android/AndroidApplication.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidapplication-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidapplication-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidApplication.java`
- SHA1：`ab2590f1889b6014f8d7c060826e3566aee1e32c`
- 声明：class AndroidApplicationextends Activity implements Application, interface AndroidEventListener
- 字段线索：MINIMUM_SDK, listeners, runnables, executedRunnables, eventListeners, lastEventNumber
- 方法线索：initialize, initializeForView, init, ArcRuntimeException, createLayoutParams, createWakeLock

### `backends/backend-android/src/arc/backend/android/AndroidApplicationConfiguration.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidapplicationconfiguration-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidapplicationconfiguration-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidApplicationConfiguration.java`
- SHA1：`30410333c22ac423e5bb1b13f6d9a179066f62c3`
- 声明：class AndroidApplicationConfiguration
- 字段线索：r, depth, numSamples, useAccelerometer, useGyroscope, useCompass
- 方法线索：未抽取

### `backends/backend-android/src/arc/backend/android/AndroidApplicationLogger.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidapplicationlogger-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidapplicationlogger-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidApplicationLogger.java`
- SHA1：`c0508403bff192506aea3c464d55a727ce46df04`
- 声明：class AndroidApplicationLoggerimplements LogHandler
- 字段线索：未抽取
- 方法线索：log

### `backends/backend-android/src/arc/backend/android/AndroidFi.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidfi-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidfi-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidFi.java`
- SHA1：`83d9777307f1cdaf4f48766dc7486f228510b1b4`
- 声明：class AndroidFiextends Fi
- 字段线索：assets
- 方法线索：child, AndroidFi, sibling, parent, read, ArcRuntimeException

### `backends/backend-android/src/arc/backend/android/AndroidFiles.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidfiles-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidfiles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidFiles.java`
- SHA1：`1339020fc34efb2544ed6794377fcab137ed39ab`
- 声明：class AndroidFilesimplements Files
- 字段线索：sdcard, localpath, assets
- 方法线索：get, AndroidFi, getCachePath, getExternalStoragePath, isExternalStorageAvailable, getLocalStoragePath

### `backends/backend-android/src/arc/backend/android/AndroidGL20.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidgl20-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidgl20-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidGL20.java`
- SHA1：`d1f67ade388f3bc8a8c4a622daf4c006cf51f156`
- 声明：class AndroidGL20implements GL20
- 字段线索：ints, buffer
- 方法线索：glActiveTexture, glAttachShader, glBindAttribLocation, glBindBuffer, glBindFramebuffer, glBindRenderbuffer

### `backends/backend-android/src/arc/backend/android/AndroidGL30.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidgl30-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidgl30-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidGL30.java`
- SHA1：`5e7c39f9333c1048bcab740a5395f501e98ea5c8`
- 声明：class AndroidGL30extends AndroidGL20 implements GL30
- 字段线索：未抽取
- 方法线索：glReadBuffer, glDrawRangeElements, glTexImage3D, glTexSubImage3D, glCopyTexSubImage3D, glGenQueries

### `backends/backend-android/src/arc/backend/android/AndroidGraphics.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidgraphics-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidgraphics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidGraphics.java`
- SHA1：`6fae76f95c8dd8a6c32f783f1f131d777172abb6`
- 声明：class AndroidGraphicsextends Graphics implements Renderer
- 字段线索：logTag, config, view, lastFrameTime, deltaTime, frameStart
- 方法线索：createGLSurfaceView, getEglConfigChooser, ArcEglConfigChooser, updatePpi, checkGL20, getGL20

### `backends/backend-android/src/arc/backend/android/AndroidInput.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidinput-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidInput.java`
- SHA1：`16ccf883abd1390df709b20dc61c1292a168012f`
- 声明：class AndroidInputextends Input implements OnKeyListener, OnTouchListener, OnGenericMotionListener, class KeyEvent, class TouchEvent
- 字段线索：maxTouches, accelerometerValues, gyroscopeValues, vibrator, magneticFieldValues, rotationVectorValues
- 方法线索：newObject, KeyEvent, TouchEvent, getAccelerometer, getGyroscope, getOrientation

### `backends/backend-android/src/arc/backend/android/AndroidInputMap.java`

- 知识页：[backends-backend-android-src-arc-backend-android-androidinputmap-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-androidinputmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidInputMap.java`
- SHA1：`f4f9ddfd568aa0fbf52acb1773be717f57505d50`
- 声明：class AndroidInputMap
- 字段线索：未抽取
- 方法线索：getKeyCode


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
