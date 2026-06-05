# Package `mindustry.mod` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.mod`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

原版内容定义包：集中声明 Blocks、Items、Liquids、UnitTypes、Planets 等内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.mod`
- 文件数：11

## 主要依赖线索

- `arc.struct.*` × 5
- `arc.util.*` × 5
- `arc.files.*` × 4
- `mindustry.*` × 4
- `arc.*` × 3
- `arc.func.*` × 3
- `arc.util.serialization.*` × 3
- `arc.util.serialization.Jval.*` × 3
- `java.net.*` × 2
- `arc.graphics.*` × 2
- `arc.graphics.g2d.*` × 2
- `arc.util.serialization.Json.*` × 2
- `mindustry.core.*` × 2
- `mindustry.ctype.*` × 2
- `mindustry.gen.*` × 2
- `arc.audio.*` × 1
- `arc.math.*` × 1
- `arc.math.geom.*` × 1
- `arc.scene.ui.layout.*` × 1
- `mindustry.ai.*` × 1

## 文件逐个分析

### `core/src/mindustry/mod/ClassLoaderCloser.java`

- 知识页：[core-src-mindustry-mod-classloadercloser-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-classloadercloser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/ClassLoaderCloser.java`
- SHA1：`dda4ef033cf505c6a00823b6c0eac1156ea94c71`
- 声明：class ClassLoaderCloser
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/mod/ClassMap.java`

- 知识页：[core-src-mindustry-mod-classmap-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-classmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/ClassMap.java`
- SHA1：`73cc406ef7629e213c30c722c88883d8a66c95cc`
- 声明：class ClassMap
- 字段线索：classes
- 方法线索：未抽取

### `core/src/mindustry/mod/ContentParser.java`

- 知识页：[core-src-mindustry-mod-contentparser-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-contentparser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/ContentParser.java`
- SHA1：`dc58f1d96fd747ed129619102d89859bfa9194d6`
- 声明：class ContentParser, interface FieldParser, interface TypeParser<T extends Content>
- 字段线索：ignoreUnknownFields, typesToSearch, implicitNullable, reads, postreads, toBeParsed
- 方法线索：MultiEffect, IllegalArgumentException, MultiBulletType, DrawMulti, RuntimeException, Mat3D

### `core/src/mindustry/mod/DataPatcher.java`

- 知识页：[core-src-mindustry-mod-datapatcher-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-datapatcher-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/DataPatcher.java`
- SHA1：`3999159fab5f50efb3820fecd19491f4e47f2034`
- 声明：class DataPatcher, class PatchSet, class FieldData
- 字段线索：root, nameToType, parser, applied, contentLoader, usedpatches
- 方法线索：createParser, warn, isPatched, apply, unapply, RuntimeException

### `core/src/mindustry/mod/Mod.java`

- 知识页：[core-src-mindustry-mod-mod-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-mod-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/Mod.java`
- SHA1：`754bf2a7480f656f03737245bc93a4e3ddf2da48`
- 声明：class Mod
- 字段线索：未抽取
- 方法线索：getConfigFolder, getConfig, init, loadContent, packSprites, registerServerCommands

### `core/src/mindustry/mod/ModClassLoader.java`

- 知识页：[core-src-mindustry-mod-modclassloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-modclassloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/ModClassLoader.java`
- SHA1：`3fc748968366eb5e6063aa83ac4446d2e86740c0`
- 声明：class ModClassLoaderextends ClassLoader
- 字段线索：children, inChild
- 方法线索：initialValue, addChild, findClass, ClassNotFoundException

### `core/src/mindustry/mod/ModListing.java`

- 知识页：[core-src-mindustry-mod-modlisting-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-modlisting-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/ModListing.java`
- SHA1：`511408658725d8facc695dd17fc8a3c59a9b8b7d`
- 声明：class ModListing
- 字段线索：minGameVersion, legacyCompatible, contentTypes, stars
- 方法线索：toString

### `core/src/mindustry/mod/Mods.java`

- 知识页：[core-src-mindustry-mod-mods-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-mods-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/Mods.java`
- SHA1：`5c5b267b4954d9025fb04265f02c82376c1326d2`
- 声明：class Modsimplements Loadable, class RegionEntry, class LoadRunimplements Comparable<LoadRun>
- 字段线索：metaFiles, blacklistedMods, json, scripts, parser, bundles
- 方法线索：mainLoader, getConfigFolder, getConfig, listFiles, importMod, IOException

### `core/src/mindustry/mod/NoPatch.java`

- 知识页：[core-src-mindustry-mod-nopatch-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-nopatch-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/NoPatch.java`
- SHA1：`8bc72c672e40e8a8c3658d060d9a76a2e394af13`
- 声明：NoPatch.java
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/mod/Plugin.java`

- 知识页：[core-src-mindustry-mod-plugin-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-plugin-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/Plugin.java`
- SHA1：`853c171285693c71e7aba57c6a8e979907d4c762`
- 声明：class Pluginextends Mod
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/mod/Scripts.java`

- 知识页：[core-src-mindustry-mod-scripts-java.md](../mindustry-source-files/mindustry/core-src-mindustry-mod-scripts-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/mod/Scripts.java`
- SHA1：`5b4e71bac1e9f15581a4b52cb9e01480d1679f79`
- 声明：class Scriptsimplements Disposable, class ScriptModuleProviderextends UrlModuleSourceProvider
- 字段线索：context, scope, errored, directory
- 方法线索：hasErrored, runConsole, getError, log, newFloats, run


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
