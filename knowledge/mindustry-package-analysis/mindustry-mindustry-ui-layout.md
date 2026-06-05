# Package `mindustry.ui.layout` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ui.layout`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

UI 包：负责 Scene2D 界面、Fragments、Dialogs、Styles 与编辑器界面。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ui.layout`
- 文件数：4

## 主要依赖线索

- `arc.struct.*` × 3
- `arc.math.geom.*` × 1
- `arc.math.*` × 1

## 文件逐个分析

### `core/src/mindustry/ui/layout/BranchTreeLayout.java`

- 知识页：[core-src-mindustry-ui-layout-branchtreelayout-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-layout-branchtreelayout-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/layout/BranchTreeLayout.java`
- SHA1：`ef5b5bbdd1f14b157973940b5fa6f63a24d8326b`
- 声明：class BranchTreeLayoutimplements TreeLayout, enum TreeLocation, enum TreeAlignment
- 字段线索：rootLocation, alignment, gapBetweenLevels, gapBetweenNodes, sizeOfLevel, boundsLeft
- 方法线索：layout, getWidthOrHeightOfNode, getNodeThickness, getNodeSize, isLevelChangeInYAxis, getLevelChangeSign

### `core/src/mindustry/ui/layout/RadialTreeLayout.java`

- 知识页：[core-src-mindustry-ui-layout-radialtreelayout-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-layout-radialtreelayout-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/layout/RadialTreeLayout.java`
- SHA1：`8d26c2db160ea536a7a95bd53f9b0ecb95b3dd0b`
- 声明：class RadialTreeLayoutimplements TreeLayout
- 字段线索：visited, queue, delta
- 方法线索：layout

### `core/src/mindustry/ui/layout/RowTreeLayout.java`

- 知识页：[core-src-mindustry-ui-layout-rowtreelayout-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-layout-rowtreelayout-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/layout/RowTreeLayout.java`
- SHA1：`11ce4afe62a7c780615a576941e22d16e590d380`
- 声明：class RowTreeLayoutimplements TreeLayout
- 字段线索：未抽取
- 方法线索：layout

### `core/src/mindustry/ui/layout/TreeLayout.java`

- 知识页：[core-src-mindustry-ui-layout-treelayout-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-layout-treelayout-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/layout/TreeLayout.java`
- SHA1：`c468d30024282e7ba2c79052b31bf2e989dae046`
- 声明：interface TreeLayout, class TreeNode<T extends TreeNode>
- 字段线索：y, children, parent, cachedWidth, number, ancestor
- 方法线索：isLeaf, calcWidth


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
