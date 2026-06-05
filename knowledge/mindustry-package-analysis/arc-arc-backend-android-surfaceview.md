# Package `arc.backend.android.surfaceview` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.backend.android.surfaceview`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.backend.android.surfaceview`
- 文件数：6

## 主要依赖线索

- `android.opengl.GLSurfaceView` × 2
- `android.util.Log` × 2
- `javax.microedition.khronos.egl.EGL10` × 2
- `javax.microedition.khronos.egl.EGLConfig` × 2
- `javax.microedition.khronos.egl.EGLDisplay` × 2
- `android.view.View` × 2
- `android.opengl.GLSurfaceView.EGLConfigChooser` × 1
- `android.annotation.TargetApi` × 1
- `android.content.Context` × 1
- `android.graphics.PixelFormat` × 1
- `android.os.SystemClock` × 1
- `android.view.KeyCharacterMap` × 1
- `android.view.KeyEvent` × 1
- `android.view.inputmethod.BaseInputConnection` × 1
- `android.view.inputmethod.EditorInfo` × 1
- `android.view.inputmethod.InputConnection` × 1
- `javax.microedition.khronos.egl.EGLContext` × 1

## 文件逐个分析

### `backends/backend-android/src/arc/backend/android/surfaceview/ArcEglConfigChooser.java`

- 知识页：[backends-backend-android-src-arc-backend-android-surfaceview-arceglconfigchooser-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-surfaceview-arceglconfigchooser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/surfaceview/ArcEglConfigChooser.java`
- SHA1：`95a2a59a885b7c174aeca259fc542d239c606428`
- 声明：class ArcEglConfigChooserimplements GLSurfaceView.EGLConfigChooser
- 字段线索：EGL_COVERAGE_BUFFERS_NV, EGL_COVERAGE_SAMPLES_NV, EGL_OPENGL_ES2_BIT, TAG, mConfigAttribs, mRedSize
- 方法线索：chooseConfig, IllegalArgumentException, findConfigAttrib, printConfigs, printConfig

### `backends/backend-android/src/arc/backend/android/surfaceview/FillResolutionStrategy.java`

- 知识页：[backends-backend-android-src-arc-backend-android-surfaceview-fillresolutionstrategy-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-surfaceview-fillresolutionstrategy-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/surfaceview/FillResolutionStrategy.java`
- SHA1：`91b1615c443761f0580e4e07d3b73990a0f73582`
- 声明：class FillResolutionStrategyimplements ResolutionStrategy
- 字段线索：width, height
- 方法线索：calcMeasures, MeasuredDimension

### `backends/backend-android/src/arc/backend/android/surfaceview/FixedResolutionStrategy.java`

- 知识页：[backends-backend-android-src-arc-backend-android-surfaceview-fixedresolutionstrategy-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-surfaceview-fixedresolutionstrategy-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/surfaceview/FixedResolutionStrategy.java`
- SHA1：`cda477a272e3cb627b618715bdc79b35798265fa`
- 声明：class FixedResolutionStrategyimplements ResolutionStrategy
- 字段线索：width, height
- 方法线索：calcMeasures, MeasuredDimension

### `backends/backend-android/src/arc/backend/android/surfaceview/GLSurfaceView20.java`

- 知识页：[backends-backend-android-src-arc-backend-android-surfaceview-glsurfaceview20-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-surfaceview-glsurfaceview20-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/surfaceview/GLSurfaceView20.java`
- SHA1：`743110dfe74130b9b6b365f7ad7ba615293f6f4b`
- 声明：class GLSurfaceView20extends GLSurfaceView, class ContextFactoryimplements GLSurfaceView.EGLContextFactory, class ConfigChooserimplements GLSurfaceView.EGLConfigChooser
- 字段线索：DEBUG, TAG, targetGLESVersion, resolutionStrategy, eventTime, EGL_CONTEXT_CLIENT_VERSION
- 方法线索：checkEglError, onMeasure, onCreateInputConnection, BaseInputConnection, deleteSurroundingText, sendDownUpKeyEventForBackwardCompatibility

### `backends/backend-android/src/arc/backend/android/surfaceview/RatioResolutionStrategy.java`

- 知识页：[backends-backend-android-src-arc-backend-android-surfaceview-ratioresolutionstrategy-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-surfaceview-ratioresolutionstrategy-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/surfaceview/RatioResolutionStrategy.java`
- SHA1：`bf4ca8ffac3d730ffc0673179055ce2ef4af41c7`
- 声明：class RatioResolutionStrategyimplements ResolutionStrategy
- 字段线索：ratio, specWidth, specHeight, desiredRatio, realRatio
- 方法线索：calcMeasures, MeasuredDimension

### `backends/backend-android/src/arc/backend/android/surfaceview/ResolutionStrategy.java`

- 知识页：[backends-backend-android-src-arc-backend-android-surfaceview-resolutionstrategy-java.md](../mindustry-source-files/arc/backends-backend-android-src-arc-backend-android-surfaceview-resolutionstrategy-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/surfaceview/ResolutionStrategy.java`
- SHA1：`fa7c126529425747f1ec8055d148515c5a28905c`
- 声明：interface ResolutionStrategy, class MeasuredDimension
- 字段线索：width, height
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
