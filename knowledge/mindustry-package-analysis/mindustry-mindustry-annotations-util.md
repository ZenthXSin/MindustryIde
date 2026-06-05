# Package `mindustry.annotations.util` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.annotations.util`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.annotations.util`
- 文件数：6

## 主要依赖线索

- `javax.lang.model.element.*` × 6
- `mindustry.annotations.*` × 5
- `javax.lang.model.type.*` × 4
- `arc.struct.*` × 4
- `com.sun.tools.javac.code.Attribute.*` × 2
- `java.lang.Class` × 2
- `com.squareup.javapoet.*` × 2
- `com.sun.source.tree.*` × 2
- `arc.func.*` × 1
- `com.sun.tools.javac.code.*` × 1
- `com.sun.tools.javac.code.Attribute.Array` × 1
- `com.sun.tools.javac.code.Attribute.Enum` × 1
- `com.sun.tools.javac.code.Attribute.Error` × 1
- `com.sun.tools.javac.code.Attribute.Visitor` × 1
- `com.sun.tools.javac.code.Scope.*` × 1
- `com.sun.tools.javac.code.Type` × 1
- `com.sun.tools.javac.code.Symbol.*` × 1
- `com.sun.tools.javac.code.Type.ArrayType` × 1
- `com.sun.tools.javac.util.List` × 1
- `com.sun.tools.javac.util.Name` × 1

## 文件逐个分析

### `annotations/src/main/java/mindustry/annotations/util/AnnotationProxyMaker.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-util-annotationproxymaker-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-util-annotationproxymaker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/util/AnnotationProxyMaker.java`
- SHA1：`8226358c735fd0cdbfe8afb8901a064cf94836ac`
- 声明：class AnnotationProxyMaker, class ValueVisitorimplements Visitor
- 字段线索：anno, annoType, meth, returnClass, value
- 方法线索：generateAnnotation, generateValue, visitConstant, visitClass, visitArray, visitEnum

### `annotations/src/main/java/mindustry/annotations/util/Selement.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-util-selement-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-util-selement-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/util/Selement.java`
- SHA1：`86880ba0cde9c51f650b95d576f8ef89927c680e`
- 声明：class Selement<T extends Element>
- 字段线索：e
- 方法线索：doc, enclosed, fullName, asType, Stype, asVar

### `annotations/src/main/java/mindustry/annotations/util/Smethod.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-util-smethod-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-util-smethod-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/util/Smethod.java`
- SHA1：`586b0dbda106492fe684885a59451f8c5a173145`
- 声明：class Smethodextends Selement<ExecutableElement>
- 字段线索：未抽取
- 方法线索：isAny, descString, is, type, Stype, thrown

### `annotations/src/main/java/mindustry/annotations/util/Stype.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-util-stype-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-util-stype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/util/Stype.java`
- SHA1：`fca163de621c76ddb3211973cb46429f328a406a`
- 声明：class Stypeextends Selement<TypeElement>
- 字段线索：未抽取
- 方法线索：Stype, fullName, interfaces, allInterfaces, isInterface, superclasses

### `annotations/src/main/java/mindustry/annotations/util/Svar.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-util-svar-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-util-svar-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/util/Svar.java`
- SHA1：`5d749a2cf5d7415a777da9230f558cbd88807d5d`
- 声明：class Svarextends Selement<VariableElement>
- 字段线索：未抽取
- 方法线索：descString, enclosingType, Stype, isAny, is, tree

### `annotations/src/main/java/mindustry/annotations/util/TypeIOResolver.java`

- 知识页：[annotations-src-main-java-mindustry-annotations-util-typeioresolver-java.md](../mindustry-source-files/mindustry/annotations-src-main-java-mindustry-annotations-util-typeioresolver-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/annotations/src/main/java/mindustry/annotations/util/TypeIOResolver.java`
- SHA1：`7cc593c914fe61ff8f0b18b50e7b9c5552a12e95`
- 声明：class TypeIOResolver, class ClassSerializer
- 字段线索：netReaders
- 方法线索：getNetWriter, getNetReader


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
