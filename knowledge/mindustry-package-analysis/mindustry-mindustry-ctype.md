# Package `mindustry.ctype` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ctype`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ctype`
- 文件数：4

## 主要依赖线索

- `arc.util.*` × 3
- `mindustry.mod.*` × 3
- `mindustry.*` × 2
- `mindustry.type.*` × 2
- `arc.files.*` × 1
- `mindustry.mod.Mods.*` × 1
- `mindustry.ai.*` × 1
- `mindustry.entities.bullet.*` × 1
- `mindustry.world.*` × 1
- `arc.*` × 1
- `arc.func.*` × 1
- `arc.graphics.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.graphics.g2d.TextureAtlas.*` × 1
- `arc.scene.ui.layout.*` × 1
- `arc.struct.*` × 1
- `mindustry.annotations.Annotations.*` × 1
- `mindustry.content.*` × 1
- `mindustry.content.TechTree.*` × 1
- `mindustry.game.EventType.*` × 1

## 文件逐个分析

### `core/src/mindustry/ctype/Content.java`

- 知识页：[core-src-mindustry-ctype-content-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ctype-content-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ctype/Content.java`
- SHA1：`a8d3174891c7b40187fa144c45e89b7650d60e86`
- 声明：class Contentimplements Comparable<Content>, class ModContentInfo
- 字段线索：id, minfo, mod, sourceFile, error, baseError
- 方法线索：init, postInit, afterPatch, load, loadIcon, hasErrored

### `core/src/mindustry/ctype/ContentType.java`

- 知识页：[core-src-mindustry-ctype-contenttype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ctype-contenttype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ctype/ContentType.java`
- SHA1：`2b76ba14d4a8a0269bd26023a99635a8d8c3cb0d`
- 声明：enum ContentType
- 字段线索：all, contentClass
- 方法线索：未抽取

### `core/src/mindustry/ctype/MappableContent.java`

- 知识页：[core-src-mindustry-ctype-mappablecontent-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ctype-mappablecontent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ctype/MappableContent.java`
- SHA1：`27db3e2953de0d279a0d13d2e3dc54118976f8ef`
- 声明：class MappableContentextends Content
- 字段线索：name
- 方法线索：toString

### `core/src/mindustry/ctype/UnlockableContent.java`

- 知识页：[core-src-mindustry-ctype-unlockablecontent-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ctype-unlockablecontent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ctype/UnlockableContent.java`
- SHA1：`b1395d40063f31344982613118ddc391bdf979b1`
- 声明：class UnlockableContentextends MappableContent
- 字段线索：stats, localizedName, credit, alwaysUnlocked, inlineDescription, hideDetails
- 方法线索：postInit, loadIcon, afterPatch, isBanned, isOnPlanet, getLogicId


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
