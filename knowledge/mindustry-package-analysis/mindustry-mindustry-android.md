# Package `mindustry.android` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.android`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.android`
- 文件数：2

## 主要依赖线索

- `android.os.Build.*` × 2
- `android.os.*` × 2
- `arc.*` × 2
- `arc.backend.android.*` × 2
- `dalvik.system.*` × 2
- `android.*` × 1
- `android.app.*` × 1
- `android.content.*` × 1
- `android.content.pm.*` × 1
- `android.net.*` × 1
- `android.telephony.*` × 1
- `arc.files.*` × 1
- `arc.func.*` × 1
- `arc.scene.ui.layout.*` × 1
- `arc.util.*` × 1
- `mindustry.*` × 1
- `mindustry.game.Saves.*` × 1
- `mindustry.io.*` × 1
- `android.annotation.*` × 1
- `com.android.dex.*` × 1

## 文件逐个分析

### `android/src/mindustry/android/AndroidLauncher.java`

- 知识页：[android-src-mindustry-android-androidlauncher-java.md](../mindustry-source-files/mindustry/android-src-mindustry-android-androidlauncher-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/android/src/mindustry/android/AndroidLauncher.java`
- SHA1：`e694e13cd786b72a0afd2596a333fb20b2481ed7`
- 声明：class AndroidLauncherextends AndroidApplication
- 字段线索：PERMISSION_REQUEST_CODE
- 方法线索：onCreate, hide, getScriptContext, shareFile, loadJar, DexClassLoader

### `android/src/mindustry/android/AndroidRhinoContext.java`

- 知识页：[android-src-mindustry-android-androidrhinocontext-java.md](../mindustry-source-files/mindustry/android-src-mindustry-android-androidrhinocontext-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/android/src/mindustry/android/AndroidRhinoContext.java`
- SHA1：`8b75a23af43102114818d62c2e30d4b01b52bae9`
- 声明：class AndroidRhinoContext, class AndroidContextFactoryextends ContextFactory, class BaseAndroidClassLoaderextends ClassLoader implements GeneratedClassLoader
- 字段线索：cacheDirectory, instanceCounter, dexFile, last
- 方法线索：IllegalStateException, createClassLoader, InMemoryAndroidClassLoader, FileAndroidClassLoader, onContextReleased, defineClass


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
