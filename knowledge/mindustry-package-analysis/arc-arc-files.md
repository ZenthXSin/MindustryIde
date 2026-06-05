# Package `arc.files` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.files`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

Arc 文件系统包：负责 Fi、FileHandle、Classpath/Local/Absolute 文件访问。

## 规模

- 仓库：`arc`
- Package：`arc.files`
- 文件数：2

## 主要依赖线索

- `arc.Files.*` × 2
- `arc.struct.*` × 2
- `arc.util.*` × 2
- `java.io.*` × 2
- `java.util.zip.*` × 2
- `arc.*` × 1
- `arc.func.*` × 1
- `arc.graphics.*` × 1
- `arc.util.io.*` × 1
- `java.nio.*` × 1
- `java.nio.channels.*` × 1
- `java.nio.channels.FileChannel.*` × 1
- `java.util.*` × 1

## 文件逐个分析

### `arc-core/src/arc/files/Fi.java`

- 知识页：[arc-core-src-arc-files-fi-java.md](../mindustry-source-files/arc/arc-core-src-arc-files-fi-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/files/Fi.java`
- SHA1：`0d6d953d68d22ac6a4d848b2b8e70f25aa125ccd`
- 声明：class Fiimplements Comparable<Fi>
- 字段线索：file, type
- 方法线索：Fi, ArcRuntimeException, path, absolutePath, name, extEquals

### `arc-core/src/arc/files/ZipFi.java`

- 知识页：[arc-core-src-arc-files-zipfi-java.md](../mindustry-source-files/arc/arc-core-src-arc-files-zipfi-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/files/ZipFi.java`
- SHA1：`08e2a93abba65f3f349b7199f9d2d5374787b496`
- 声明：class ZipFiextends Fi
- 字段线索：children, parent, path, allDirectories, entry, zip
- 方法线索：ArcRuntimeException, delete, exists, child, Fi, name


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
