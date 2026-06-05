# Package `arc.scene.ui.layout` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.scene.ui.layout`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

UI 包：负责 Scene2D 界面、Fragments、Dialogs、Styles 与编辑器界面。

## 规模

- 仓库：`arc`
- Package：`arc.scene.ui.layout`
- 文件数：7

## 主要依赖线索

- `arc.scene.*` × 5
- `arc.func.*` × 4
- `arc.scene.event.*` × 3
- `arc.util.*` × 3
- `arc.graphics.*` × 2
- `arc.scene.style.*` × 2
- `arc.scene.ui.*` × 2
- `arc.scene.ui.Button.*` × 2
- `arc.scene.ui.Label.*` × 2
- `arc.scene.ui.ScrollPane.*` × 2
- `arc.scene.ui.TextField.*` × 2
- `arc.scene.utils.*` × 2
- `arc.graphics.g2d.*` × 2
- `arc.struct.*` × 2
- `arc.scene.ui.Tooltip.*` × 1
- `arc.util.pooling.Pool.*` × 1
- `arc.*` × 1
- `arc.struct.Seq` × 1
- `arc.struct.SnapshotSeq` × 1
- `arc.scene.Element` × 1

## 文件逐个分析

### `arc-core/src/arc/scene/ui/layout/Cell.java`

- 知识页：[arc-core-src-arc-scene-ui-layout-cell-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-layout-cell-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/layout/Cell.java`
- SHA1：`b6bc7af07dc3d80149d4164fa955424ea4779fa9`
- 声明：class Cell<T extends Element> implements Poolable
- 字段线索：dset, defaults, unset, table
- 方法线索：setLayout, clearElement, with, self, get, hasElement

### `arc-core/src/arc/scene/ui/layout/Collapser.java`

- 知识页：[arc-core-src-arc-scene-ui-layout-collapser-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-layout-collapser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/layout/Collapser.java`
- SHA1：`3eed79dbda93eec84af73dc7d2729eb94ed04e25`
- 声明：class Collapserextends WidgetGroup, class CollapseActionextends Action
- 字段线索：collapseAction
- 方法线索：setDuration, setCollapsed, toggle, isCollapsed, updateTouchable, setEnforceMinSize

### `arc-core/src/arc/scene/ui/layout/Scl.java`

- 知识页：[arc-core-src-arc-scene-ui-layout-scl-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-layout-scl-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/layout/Scl.java`
- SHA1：`ddeb7f40b8b278c58d67d9a3ef63d4b0fc2dce20`
- 声明：class Scl
- 字段线索：scl, addition, product, debugScale
- 方法线索：未抽取

### `arc-core/src/arc/scene/ui/layout/Spacer.java`

- 知识页：[arc-core-src-arc-scene-ui-layout-spacer-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-layout-spacer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/layout/Spacer.java`
- SHA1：`3a7772d5c51aef9c991e70d112184f074ca591b3`
- 声明：class Spacerextends Element
- 字段线索：未抽取
- 方法线索：act, getPrefHeight, getPrefWidth

### `arc-core/src/arc/scene/ui/layout/Stack.java`

- 知识页：[arc-core-src-arc-scene-ui-layout-stack-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-layout-stack-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/layout/Stack.java`
- SHA1：`d1006cff0a8743881f07fc2130118321e7a61026`
- 声明：class Stackextends WidgetGroup
- 字段线索：minHeight, sizeInvalid
- 方法线索：invalidate, computeSize, add, layout, getPrefWidth, getPrefHeight

### `arc-core/src/arc/scene/ui/layout/Table.java`

- 知识页：[arc-core-src-arc-scene-ui-layout-table-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-layout-table-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/layout/Table.java`
- SHA1：`cc409ff49648250605b20dd867435b53f8f329f7`
- 声明：class Tableextends WidgetGroup, interface DrawRect
- 字段线索：rowWeightedHeight, cellPool, cells, cellDefaults, rows, implicitEndRow
- 方法线索：obtainCell, fill, draw, drawBackground, background, getBackground

### `arc-core/src/arc/scene/ui/layout/WidgetGroup.java`

- 知识页：[arc-core-src-arc-scene-ui-layout-widgetgroup-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-layout-widgetgroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/layout/WidgetGroup.java`
- SHA1：`6f4d25fe97be987f8b2f26a1078ee758167db8f8`
- 声明：class WidgetGroupextends Group
- 字段线索：needsLayout, layoutEnabled
- 方法线索：getMinWidth, getMinHeight, getPrefWidth, getPrefHeight, setLayoutEnabled, validate


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
