# Package `arc.mock` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.mock`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.mock`
- 文件数：7

## 主要依赖线索

- `arc.*` × 5
- `arc.graphics.*` × 2
- `arc.struct.*` × 1
- `arc.audio.*` × 1
- `arc.files.*` × 1
- `arc.util.*` × 1
- `java.io.*` × 1
- `java.nio.*` × 1
- `arc.Graphics.Cursor.*` × 1
- `arc.graphics.gl.*` × 1

## 文件逐个分析

### `arc-core/src/arc/mock/MockApplication.java`

- 知识页：[arc-core-src-arc-mock-mockapplication-java.md](../mindustry-source-files/arc/arc-core-src-arc-mock-mockapplication-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/mock/MockApplication.java`
- SHA1：`7fb085dff5b4f912ab1136d8487dcad7e8e26112`
- 声明：class MockApplicationimplements Application
- 字段线索：未抽取
- 方法线索：getListeners, getType, getClipboardText, setClipboardText, post, exit

### `arc-core/src/arc/mock/MockAudio.java`

- 知识页：[arc-core-src-arc-mock-mockaudio-java.md](../mindustry-source-files/arc/arc-core-src-arc-mock-mockaudio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/mock/MockAudio.java`
- SHA1：`3e42e27bc9eba8f65fe33293f9514023953f4237`
- 声明：class MockAudioextends Audio
- 字段线索：未抽取
- 方法线索：initialize

### `arc-core/src/arc/mock/MockFiles.java`

- 知识页：[arc-core-src-arc-mock-mockfiles-java.md](../mindustry-source-files/arc/arc-core-src-arc-mock-mockfiles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/mock/MockFiles.java`
- SHA1：`10988cbf5d0734f257a2061b82cdd4c4ecd4710e`
- 声明：class MockFilesimplements Files
- 字段线索：未抽取
- 方法线索：get, Fi, getExternalStoragePath, isExternalStorageAvailable, getLocalStoragePath, File

### `arc-core/src/arc/mock/MockGL20.java`

- 知识页：[arc-core-src-arc-mock-mockgl20-java.md](../mindustry-source-files/arc/arc-core-src-arc-mock-mockgl20-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/mock/MockGL20.java`
- SHA1：`92713536f5373065356cec824b4398c0f0a5b823`
- 声明：class MockGL20implements GL20
- 字段线索：未抽取
- 方法线索：glActiveTexture, glBindTexture, glBlendFunc, glClear, glClearColor, glClearDepthf

### `arc-core/src/arc/mock/MockGraphics.java`

- 知识页：[arc-core-src-arc-mock-mockgraphics-java.md](../mindustry-source-files/arc/arc-core-src-arc-mock-mockgraphics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/mock/MockGraphics.java`
- SHA1：`290f34c358aa4fa4d09b427daefefea8b2487885`
- 声明：class MockGraphicsextends Graphics
- 字段线索：未抽取
- 方法线索：isGL30Available, getGL20, setGL20, getGL30, setGL30, getWidth

### `arc-core/src/arc/mock/MockInput.java`

- 知识页：[arc-core-src-arc-mock-mockinput-java.md](../mindustry-source-files/arc/arc-core-src-arc-mock-mockinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/mock/MockInput.java`
- SHA1：`1bfa28cd708e880352c8442ef8a326b544043b2c`
- 声明：class MockInputextends Input
- 字段线索：未抽取
- 方法线索：mouseX, deltaX, mouseY, deltaY, isTouched, justTouched

### `arc-core/src/arc/mock/MockSettings.java`

- 知识页：[arc-core-src-arc-mock-mocksettings-java.md](../mindustry-source-files/arc/arc-core-src-arc-mock-mocksettings-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/mock/MockSettings.java`
- SHA1：`8614ad1a348785cfc2de0766cf96feb59333ba3f`
- 声明：class MockSettingsextends Settings
- 字段线索：未抽取
- 方法线索：load, forceSave


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
