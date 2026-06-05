# Package `mindustry.annotations.entity` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.annotations.entity`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.annotations.entity`
- 文件数：2

## 主要依赖线索

- `arc.files.*` × 2
- `arc.struct.*` × 2
- `arc.util.*` × 2
- `com.squareup.javapoet.*` × 2
- `mindustry.annotations.Annotations.*` × 2
- `mindustry.annotations.*` × 2
- `mindustry.annotations.util.*` × 2
- `mindustry.annotations.util.TypeIOResolver.*` × 2
- `javax.lang.model.element.*` × 2
- `java.lang.annotation.*` × 2
- `arc.math.*` × 1
- `arc.util.serialization.*` × 1
- `arc.func.*` × 1
- `arc.util.io.*` × 1
- `arc.util.pooling.Pool.*` × 1
- `arc.util.pooling.*` × 1
- `com.squareup.javapoet.TypeSpec.*` × 1
- `com.sun.source.tree.*` × 1
- `javax.annotation.processing.*` × 1
- `javax.lang.model.type.*` × 1

## 文件逐个分析

### `annotations/src/main/java/mindustry/annotations/entity/EntityIO.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-entity-entityio-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-entity-entityio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/entity/EntityIO.java`
- SHA1：`5b7682dad6a8b40e42b4710391f1266b4556af79`
- 声明：class EntityIO, class Revision, class RevisionField
- 字段线索：json, targetSuf, replacements, serializer, name, type
- 方法线索：io, cont, econt, ncont, st, s

### `annotations/src/main/java/mindustry/annotations/entity/EntityProcess.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-entity-entityprocess-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-entity-entityprocess-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/entity/EntityProcess.java`
- SHA1：`b4303f7842d115a40272332e8b65ed17a7fd9d1b`
- 声明：class EntityProcessextends BaseProcessor, class GroupDefinition, class EntityDefinition
- 字段线索：name, baseType, components, collides, manualInclusions, groups
- 方法线索：process, interfaceToComp, IllegalArgumentException, toString


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
