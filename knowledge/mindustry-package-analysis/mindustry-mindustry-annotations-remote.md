# Package `mindustry.annotations.remote` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.annotations.remote`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.annotations.remote`
- 文件数：4

## 主要依赖线索

- `arc.struct.*` × 3
- `mindustry.annotations.Annotations.*` × 3
- `mindustry.annotations.util.*` × 3
- `javax.lang.model.element.*` × 3
- `mindustry.annotations.*` × 2
- `mindustry.annotations.util.TypeIOResolver.*` × 2
- `arc.util.io.*` × 1
- `com.squareup.javapoet.*` × 1
- `java.io.*` × 1
- `arc.util.*` × 1
- `javax.annotation.processing.*` × 1
- `javax.lang.model.type.*` × 1

## 文件逐个分析

### `annotations/src/main/java/mindustry/annotations/remote/CallGenerator.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-remote-callgenerator-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-remote-callgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/remote/CallGenerator.java`
- SHA1：`f999efce52f47de82af9ac34d856f325e855193e`
- 声明：class CallGenerator
- 字段线索：未抽取
- 方法线索：未抽取

### `annotations/src/main/java/mindustry/annotations/remote/MethodEntry.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-remote-methodentry-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-remote-methodentry-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/remote/MethodEntry.java`
- SHA1：`1f552d63f535cce97da87c1ff94760bc5b4236c2`
- 声明：class MethodEntry
- 字段线索：className, targetMethod, packetClassName, where, target, local
- 方法线索：hashCode

### `annotations/src/main/java/mindustry/annotations/remote/RemoteProcess.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-remote-remoteprocess-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-remote-remoteprocess-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/remote/RemoteProcess.java`
- SHA1：`ec5f126fef139c8008b8489dfc05b30bb3f492fb`
- 声明：class RemoteProcessextends BaseProcessor
- 字段线索：callLocation
- 方法线索：process

### `annotations/src/main/java/mindustry/annotations/remote/SerializerResolver.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-remote-serializerresolver-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-remote-serializerresolver-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/remote/SerializerResolver.java`
- SHA1：`228191844fc691d710c2bc78d651ecb35fea1e9c`
- 声明：class SerializerResolver
- 字段线索：未抽取
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
