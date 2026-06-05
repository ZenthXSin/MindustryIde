# Package `mindustry.io.versions` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.io.versions`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.io.versions`
- 文件数：16

## 主要依赖线索

- `java.io.*` × 9
- `mindustry.world.*` × 3
- `mindustry.gen.*` × 3
- `mindustry.io.*` × 3
- `mindustry.content.*` × 2
- `mindustry.game.*` × 2
- `arc.func.*` × 2
- `arc.*` × 1
- `arc.struct.*` × 1
- `mindustry.ui.dialogs.JoinDialog.*` × 1
- `arc.util.io.*` × 1
- `arc.util.*` × 1
- `mindustry.game.Teams.*` × 1
- `mindustry.entities.*` × 1

## 文件逐个分析

### `core/src/mindustry/io/versions/LegacyIO.java`

- 知识页：[core-src-mindustry-io-versions-legacyio-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-legacyio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/LegacyIO.java`
- SHA1：`1a767e4e357681c0224217ce0f40a9dfda07011e`
- 声明：class LegacyIO
- 字段线索：unitMap
- 方法线索：未抽取

### `core/src/mindustry/io/versions/LegacyRegionSaveVersion.java`

- 知识页：[core-src-mindustry-io-versions-legacyregionsaveversion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-legacyregionsaveversion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/LegacyRegionSaveVersion.java`
- SHA1：`c44b8e7d9444d467758380c18c1dd5d4550f67a4`
- 声明：class LegacyRegionSaveVersionextends ShortChunkSaveVersion
- 字段线索：未抽取
- 方法线索：read

### `core/src/mindustry/io/versions/LegacySaveVersion.java`

- 知识页：[core-src-mindustry-io-versions-legacysaveversion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-legacysaveversion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/LegacySaveVersion.java`
- SHA1：`e84564abe8afb0f510721d8f2d71943e0e2a19fe`
- 声明：class LegacySaveVersionextends LegacyRegionSaveVersion
- 字段线索：未抽取
- 方法线索：readMap, IOException, readLegacyEntities

### `core/src/mindustry/io/versions/LegacySaveVersion2.java`

- 知识页：[core-src-mindustry-io-versions-legacysaveversion2-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-legacysaveversion2-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/LegacySaveVersion2.java`
- SHA1：`b4c40d7fc6490d4022054e7c18ea0edbebdc4ed9`
- 声明：class LegacySaveVersion2extends LegacyRegionSaveVersion
- 字段线索：未抽取
- 方法线索：readWorldEntities

### `core/src/mindustry/io/versions/Save1.java`

- 知识页：[core-src-mindustry-io-versions-save1-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save1-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save1.java`
- SHA1：`ccead8731930346b22345193ae49cf440da8f018`
- 声明：class Save1extends LegacySaveVersion
- 字段线索：未抽取
- 方法线索：readEntities

### `core/src/mindustry/io/versions/Save10.java`

- 知识页：[core-src-mindustry-io-versions-save10-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save10-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save10.java`
- SHA1：`7462b78abcb7da501bcd940c3eb006803904f16a`
- 声明：class Save10extends SaveVersion
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/io/versions/Save11.java`

- 知识页：[core-src-mindustry-io-versions-save11-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save11-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save11.java`
- SHA1：`e0c1dc889bb77704015d0a2b443629fa72c550d6`
- 声明：class Save11extends SaveVersion
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/io/versions/Save2.java`

- 知识页：[core-src-mindustry-io-versions-save2-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save2-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save2.java`
- SHA1：`a0a3f863c9aabda42e4bf6138eabd8ba5553472b`
- 声明：class Save2extends LegacySaveVersion
- 字段线索：未抽取
- 方法线索：readEntities

### `core/src/mindustry/io/versions/Save3.java`

- 知识页：[core-src-mindustry-io-versions-save3-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save3-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save3.java`
- SHA1：`cb044e752c1409d767835f7ec2bc0915991ee6c2`
- 声明：class Save3extends LegacySaveVersion
- 字段线索：未抽取
- 方法线索：readEntities

### `core/src/mindustry/io/versions/Save4.java`

- 知识页：[core-src-mindustry-io-versions-save4-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save4-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save4.java`
- SHA1：`bbb6e6105014305b3f6854fc17359a7836aa580c`
- 声明：class Save4extends LegacySaveVersion2
- 字段线索：未抽取
- 方法线索：readEntities

### `core/src/mindustry/io/versions/Save5.java`

- 知识页：[core-src-mindustry-io-versions-save5-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save5-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save5.java`
- SHA1：`48f5e263d8a71b3ba6776d58e06cf0669cbb1414`
- 声明：class Save5extends LegacySaveVersion2
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/io/versions/Save6.java`

- 知识页：[core-src-mindustry-io-versions-save6-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save6-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save6.java`
- SHA1：`280a2a0618a477f3b80c9fed6fde7b6de5e31ec0`
- 声明：class Save6extends LegacyRegionSaveVersion
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/io/versions/Save7.java`

- 知识页：[core-src-mindustry-io-versions-save7-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save7-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save7.java`
- SHA1：`406602ca9c041364ff4323aa11a8b8c705af759c`
- 声明：class Save7extends ShortChunkSaveVersion
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/io/versions/Save8.java`

- 知识页：[core-src-mindustry-io-versions-save8-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save8-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save8.java`
- SHA1：`82e5ed0b90b8faa6326008f87d930a96a41705d9`
- 声明：class Save8extends ShortChunkSaveVersion
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/io/versions/Save9.java`

- 知识页：[core-src-mindustry-io-versions-save9-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-save9-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/Save9.java`
- SHA1：`b77722f203705e36d4f41bea64eec6e88713912f`
- 声明：class Save9extends ShortChunkSaveVersion
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/io/versions/ShortChunkSaveVersion.java`

- 知识页：[core-src-mindustry-io-versions-shortchunksaveversion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-io-versions-shortchunksaveversion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/io/versions/ShortChunkSaveVersion.java`
- SHA1：`3512b4280e49cbc058b7e9daf65161a1cd489be0`
- 声明：class ShortChunkSaveVersionextends SaveVersion
- 字段线索：未抽取
- 方法线索：readWorldEntities, readMap, IOException


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
