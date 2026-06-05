# Package `arc.scene.utils` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.scene.utils`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.scene.utils`
- 文件数：4

## 主要依赖线索

- `arc.math.geom.Rect` × 1
- `arc.scene.Group` × 1
- `arc.func.*` × 1
- `arc.graphics.*` × 1
- `arc.scene.style.*` × 1
- `arc.scene.ui.*` × 1
- `arc.scene.ui.ImageButton.*` × 1
- `arc.scene.ui.TextButton.*` × 1
- `arc.Core` × 1
- `arc.struct.Seq` × 1
- `arc.struct.OrderedSet` × 1
- `arc.scene.Element` × 1
- `arc.scene.event.ChangeListener.ChangeEvent` × 1
- `arc.util.pooling.Pools` × 1
- `java.util.Iterator` × 1

## 文件逐个分析

### `arc-core/src/arc/scene/utils/Cullable.java`

- 知识页：[arc-core-src-arc-scene-utils-cullable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-utils-cullable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/utils/Cullable.java`
- SHA1：`734eff990f18a93079f323e10656f25fe0800fcf`
- 声明：interface Cullable
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/scene/utils/Disableable.java`

- 知识页：[arc-core-src-arc-scene-utils-disableable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-utils-disableable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/utils/Disableable.java`
- SHA1：`b205c5c5c58d7591ac9621259e08cf0d32f8c095`
- 声明：interface Disableable
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/scene/utils/Elem.java`

- 知识页：[arc-core-src-arc-scene-utils-elem-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-utils-elem-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/utils/Elem.java`
- SHA1：`33b55633cf351357689f75972df929a45538a0c2`
- 声明：class Elem
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/scene/utils/Selection.java`

- 知识页：[arc-core-src-arc-scene-utils-selection-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-utils-selection-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/utils/Selection.java`
- SHA1：`95dc2a0196b0064f542a3225637d44e89ec8b79e`
- 声明：class Selection<T> implements Disableable, Iterable<T>
- 字段线索：selected, old, element, toggle, programmaticChangeEvents
- 方法线索：setActor, choose, hasItems, isEmpty, size, items


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
