# Package `mindustry.ios` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ios`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ios`
- 文件数：1

## 主要依赖线索

- `arc.*` × 1
- `arc.Input.*` × 1
- `arc.backend.robovm.*` × 1
- `arc.files.*` × 1
- `arc.func.*` × 1
- `arc.scene.ui.layout.*` × 1
- `arc.util.*` × 1
- `arc.util.io.*` × 1
- `mindustry.*` × 1
- `mindustry.game.EventType.*` × 1
- `mindustry.game.Saves.*` × 1
- `mindustry.io.*` × 1
- `mindustry.net.*` × 1
- `mindustry.ui.*` × 1
- `org.robovm.apple.coregraphics.*` × 1
- `org.robovm.apple.foundation.*` × 1
- `org.robovm.apple.uikit.*` × 1
- `org.robovm.objc.block.*` × 1

## 文件逐个分析

### `ios/src/mindustry/ios/IOSLauncher.java`

- 知识页：[ios-src-mindustry-ios-ioslauncher-java.md](../mindustry-source-files/mindustry/ios-src-mindustry-ios-ioslauncher-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/ios/src/mindustry/ios/IOSLauncher.java`
- SHA1：`32d33d2b041566d7def3c04a892dfd7318eba420`
- 声明：class IOSLauncherextends IOSApplication.Delegate, class ChooserDelegateextends NSObject implements UIDocumentBrowserViewControllerDelegate
- 字段线索：forced
- 方法线索：createApplication, IOSApplication, showFileChooser, didPickDocumentURLs, didPickDocumentsAtURLs, didRequestDocumentCreationWithHandler


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
