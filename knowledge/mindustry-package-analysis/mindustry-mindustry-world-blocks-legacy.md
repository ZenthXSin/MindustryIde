# Package `mindustry.world.blocks.legacy` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.legacy`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.legacy`
- 文件数：4

## 主要依赖线索

- `arc.util.io.*` × 3
- `mindustry.gen.*` × 3
- `mindustry.world.*` × 2
- `mindustry.content.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/blocks/legacy/LegacyBlock.java`

- 知识页：[core-src-mindustry-world-blocks-legacy-legacyblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-legacy-legacyblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/legacy/LegacyBlock.java`
- SHA1：`586abccafcdcb52b1cc695a6535cb4f129f5db8a`
- 声明：class LegacyBlockextends Block
- 字段线索：未抽取
- 方法线索：removeSelf

### `core/src/mindustry/world/blocks/legacy/LegacyCommandCenter.java`

- 知识页：[core-src-mindustry-world-blocks-legacy-legacycommandcenter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-legacy-legacycommandcenter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/legacy/LegacyCommandCenter.java`
- SHA1：`3d97fc33172fe2aa8c9f967022dcdc8ead9c152f`
- 声明：class LegacyCommandCenterextends LegacyBlock, class CommandBuildextends Building
- 字段线索：未抽取
- 方法线索：write, read

### `core/src/mindustry/world/blocks/legacy/LegacyMechPad.java`

- 知识页：[core-src-mindustry-world-blocks-legacy-legacymechpad-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-legacy-legacymechpad-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/legacy/LegacyMechPad.java`
- SHA1：`3a0d2e543e4a8eb907212f7830f4148c95e73d49`
- 声明：class LegacyMechPadextends LegacyBlock, class LegacyMechPadBuildextends Building
- 字段线索：未抽取
- 方法线索：read

### `core/src/mindustry/world/blocks/legacy/LegacyUnitFactory.java`

- 知识页：[core-src-mindustry-world-blocks-legacy-legacyunitfactory-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-legacy-legacyunitfactory-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/legacy/LegacyUnitFactory.java`
- SHA1：`50d8ef8327602452b641f888add5fa39a41b2ba3`
- 声明：class LegacyUnitFactoryextends LegacyBlock, class LegacyUnitFactoryBuildextends Building
- 字段线索：replacement
- 方法线索：removeSelf, read


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
