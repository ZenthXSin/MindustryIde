# Package `arc.backend.robovm` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.backend.robovm`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.backend.robovm`
- 文件数：13

## 主要依赖线索

- `arc.*` × 6
- `org.robovm.apple.uikit.*` × 6
- `org.robovm.apple.foundation.*` × 5
- `arc.struct.*` × 4
- `arc.util.*` × 4
- `org.robovm.apple.coregraphics.*` × 4
- `arc.graphics.gl.*` × 4
- `arc.backend.robovm.custom.*` × 3
- `com.badlogic.gdx.backends.iosrobovm.bindings.metalangle.*` × 3
- `org.robovm.objc.annotation.*` × 3
- `arc.graphics.*` × 2
- `org.robovm.rt.bro.*` × 2
- `java.nio.Buffer` × 2
- `java.nio.FloatBuffer` × 2
- `java.nio.IntBuffer` × 2
- `org.robovm.rt.bro.annotation.*` × 2
- `arc.input.*` × 2
- `arc.audio.*` × 1
- `org.robovm.apple.dispatch.*` × 1
- `arc.func.*` × 1

## 文件逐个分析

### `backends/backend-robovm/src/arc/backend/robovm/IOSApplication.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosapplication-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosapplication-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSApplication.java`
- SHA1：`2ddab10889cf2aca71e9524c42c652646d3b6009`
- 声明：class IOSApplicationimplements Application, class Delegateextends UIApplicationDelegateAdapter
- 字段线索：lastScreenBounds, listeners, runnables, statusBarFrame, app
- 方法线索：didFinishLaunching, getUIViewController, getUIWindow, computeBounds, getScreenBounds, guessUnknownPpi

### `backends/backend-robovm/src/arc/backend/robovm/IOSApplicationConfiguration.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosapplicationconfiguration-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosapplicationconfiguration-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSApplicationConfiguration.java`
- SHA1：`4da091d5a854eaa01ff9c8a86780f6e442a62d67`
- 声明：class IOSApplicationConfiguration
- 字段线索：preventScreenDimming, orientationPortrait, orientationLandscape, statusBarVisible, hdpiMode, colorFormat
- 方法线索：未抽取

### `backends/backend-robovm/src/arc/backend/robovm/IOSDevice.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosdevice-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosdevice-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSDevice.java`
- SHA1：`e9786e69adfb0d1f6f8cd6615368f44ee2bd9793`
- 声明：class IOSDevice
- 字段线索：cache, classifier, machineString, ppi
- 方法线索：getDevice, addDeviceToMap, toString

### `backends/backend-robovm/src/arc/backend/robovm/IOSFi.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosfi-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosfi-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSFi.java`
- SHA1：`e2aaa1e774181926408184c0987424990e3e7914`
- 声明：class IOSFiextends Fi
- 字段线索：未抽取
- 方法线索：child, IOSFi, parent, sibling, file

### `backends/backend-robovm/src/arc/backend/robovm/IOSFiles.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosfiles-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosfiles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSFiles.java`
- SHA1：`a652be5bf0cc1a0ad5f7295292e0634069dfb742`
- 声明：class IOSFilesimplements Files
- 字段线索：appDir, externalPath, localPath, cachePath, internalPath
- 方法线索：getInternalStoragePath, getCachePath, get, IOSFi, getExternalStoragePath, isExternalStorageAvailable

### `backends/backend-robovm/src/arc/backend/robovm/IOSGLES20.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosgles20-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosgles20-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSGLES20.java`
- SHA1：`391b4f54551793eb4ad59c391ffe5517441cd15a`
- 声明：class IOSGLES20implements GL20
- 字段线索：height
- 方法线索：glViewport

### `backends/backend-robovm/src/arc/backend/robovm/IOSGLES30.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosgles30-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosgles30-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSGLES30.java`
- SHA1：`ccf13ae92f04c839341862a8b4ed3499f217c3f9`
- 声明：class IOSGLES30extends IOSGLES20 implements GL30
- 字段线索：未抽取
- 方法线索：未抽取

### `backends/backend-robovm/src/arc/backend/robovm/IOSGraphics.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosgraphics-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosgraphics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSGraphics.java`
- SHA1：`ea206f05f58f118e62009c8aa7f1d16a7b7518c5`
- 声明：class IOSGraphicsextends Graphics, class IOSGraphicsDelegateextends NSObject implements MGLKViewDelegate, MGLKViewControllerDelegate
- 字段线索：tag, resume, appPaused, ppiX, ppiY, ppcX
- 方法线索：touchesBegan, touchesCancelled, touchesEnded, touchesMoved, draw, resume

### `backends/backend-robovm/src/arc/backend/robovm/IOSInput.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosinput-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSInput.java`
- SHA1：`5b7e4a30e1e0af8390cc5781e0415581d6b3526c`
- 声明：class IOSInputextends Input, class NSObjectWrapper<T extends NSObject>, class NSSetExtensionsextends NSExtensions
- 字段线索：MAX_TOUCHES, UI_ACCELERATION_WRAPPER, POINTER_NOT_FOUND, UI_TOUCH_WRAPPER, keyEventPool, keyEvents
- 方法线索：newObject, KeyEvent, TouchEvent, shouldChangeCharacters, shouldEndEditing, shouldReturn

### `backends/backend-robovm/src/arc/backend/robovm/IOSKeymap.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-ioskeymap-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-ioskeymap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSKeymap.java`
- SHA1：`0931208361d011a847223bf9b43c7dcb9ff3487f`
- 声明：class IOSKeymap
- 字段线索：未抽取
- 方法线索：getKeyCode

### `backends/backend-robovm/src/arc/backend/robovm/IOSScreenBounds.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosscreenbounds-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosscreenbounds-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSScreenBounds.java`
- SHA1：`6f09f58b39f1ecd0dd4b6afb4f2bd771fb95af36`
- 声明：class IOSScreenBounds
- 字段线索：y, height, backBufferHeight
- 方法线索：未抽取

### `backends/backend-robovm/src/arc/backend/robovm/IOSUIViewController.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosuiviewcontroller-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosuiviewcontroller-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSUIViewController.java`
- SHA1：`338310c14413f20b81cc4d5ba8560416d9b6a40e`
- 声明：class IOSUIViewControllerextends MGLKViewController
- 字段线索：app, graphics, oldBounds, newBounds
- 方法线索：viewWillAppear, viewDidAppear, getSupportedInterfaceOrientations, UIInterfaceOrientationMask, shouldAutorotate, getPreferredScreenEdgesDeferringSystemGestures

### `backends/backend-robovm/src/arc/backend/robovm/IOSViewControllerListener.java`

- 知识页：[backends-backend-robovm-src-arc-backend-robovm-iosviewcontrollerlistener-java.md](../mindustry-source-files/arc/backends-backend-robovm-src-arc-backend-robovm-iosviewcontrollerlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSViewControllerListener.java`
- SHA1：`e3bcd1eb5e6500a1232d8ee735b74860c584354a`
- 声明：interface IOSViewControllerListener
- 字段线索：未抽取
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
