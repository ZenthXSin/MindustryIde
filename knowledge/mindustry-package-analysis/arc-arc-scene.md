# Package `arc.scene` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.scene`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.scene`
- 文件数：4

## 主要依赖线索

- `arc.graphics.g2d.*` × 3
- `arc.math.geom.*` × 3
- `arc.*` × 2
- `arc.func.*` × 2
- `arc.graphics.*` × 2
- `arc.input.*` × 2
- `arc.math.*` × 2
- `arc.scene.event.*` × 2
- `arc.scene.event.InputEvent.*` × 2
- `arc.struct.*` × 2
- `arc.util.*` × 2
- `arc.util.pooling.*` × 2
- `arc.scene.style.*` × 2
- `arc.scene.actions.DelayAction` × 1
- `arc.scene.actions.TemporalAction` × 1
- `arc.util.pooling.Pool` × 1
- `arc.util.pooling.Pool.Poolable` × 1
- `arc.scene.actions.*` × 1
- `arc.scene.utils.*` × 1
- `arc.struct.Seq` × 1

## 文件逐个分析

### `arc-core/src/arc/scene/Action.java`

- 知识页：[arc-core-src-arc-scene-action-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-action-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/Action.java`
- SHA1：`735c2e2c54da4c349b81ff5ac9c722778fda5801`
- 声明：class Actionimplements Poolable
- 字段线索：actor, target, pool
- 方法线索：restart, getActor, setActor, getTarget, setTarget, reset

### `arc-core/src/arc/scene/Element.java`

- 知识页：[arc-core-src-arc-scene-element-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-element-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/Element.java`
- SHA1：`7756228cc20c1785a8ed3bcf51fd30577a3d0646`
- 声明：class Element
- 字段线索：color, scaleX, name, fillParent, translation, visible
- 方法线索：draw, act, updateVisibility, hasMouse, hasKeyboard, hasScroll

### `arc-core/src/arc/scene/Group.java`

- 知识页：[arc-core-src-arc-scene-group-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-group-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/Group.java`
- SHA1：`91cb084a8e709a142f35bebd5cc8dd05cb6ff932`
- 声明：class Groupextends Element implements Cullable
- 字段线索：tmp, children, worldTransform, computedTransform, oldTransform, transform
- 方法线索：act, draw, drawChildren, computeTransform, applyTransform, resetTransform

### `arc-core/src/arc/scene/Scene.java`

- 知识页：[arc-core-src-arc-scene-scene-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-scene-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/Scene.java`
- SHA1：`7049b06cc3dc015db499d1ab1003c742530a2dc9`
- 声明：class Sceneimplements InputProcessor, class TouchFocusimplements Poolable
- 字段线索：root, marginBottom, styleDefaults, tempCoords, pointerOverActors, pointerTouched
- 方法线索：calculateScissors, getHeight, getWidth, registerStyles, hasField, hasMouse


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
