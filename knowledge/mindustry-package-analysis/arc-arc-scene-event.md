# Package `arc.scene.event` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.scene.event`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

Arc Scene2D UI 包：负责 Element、Table、Widget、事件输入与布局。

## 规模

- 仓库：`arc`
- Package：`arc.scene.event`
- 文件数：17

## 主要依赖线索

- `arc.scene.Element` × 8
- `arc.input.KeyCode` × 4
- `arc.math.geom.Vec2` × 3
- `arc.Core` × 2
- `arc.scene.Scene` × 2
- `arc.util.*` × 1
- `arc.math.Interp` × 1
- `arc.scene.ui.ScrollPane` × 1
- `arc.util.Timer` × 1
- `arc.util.Timer.Task` × 1
- `arc.input.GestureDetector` × 1
- `arc.input.GestureDetector.GestureListener` × 1
- `arc.*` × 1
- `arc.Graphics.Cursor.*` × 1
- `arc.func.*` × 1
- `arc.scene.*` × 1
- `arc.scene.utils.*` × 1
- `arc.Graphics.Cursor.SystemCursor` × 1
- `arc.util.pooling.Pool.Poolable` × 1

## 文件逐个分析

### `arc-core/src/arc/scene/event/ChangeListener.java`

- 知识页：[arc-core-src-arc-scene-event-changelistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-changelistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/ChangeListener.java`
- SHA1：`f1636a87da4eaa1678a8181bab5606e171fbe824`
- 声明：class ChangeListenerimplements EventListener, class ChangeEventextends SceneEvent
- 字段线索：未抽取
- 方法线索：handle

### `arc-core/src/arc/scene/event/ClickListener.java`

- 知识页：[arc-core-src-arc-scene-event-clicklistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-clicklistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/ClickListener.java`
- SHA1：`115bb73b57a46ce369b081f5425e9308c452f395`
- 声明：class ClickListenerextends InputListener
- 字段线索：visualPressedDuration, clicked, tapSquareSize, pressedPointer, pressedButton, button
- 方法线索：touchDown, touchDragged, touchUp, enter, exit, cancel

### `arc-core/src/arc/scene/event/DragListener.java`

- 知识页：[arc-core-src-arc-scene-event-draglistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-draglistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/DragListener.java`
- SHA1：`778a6c4df5a429f85763f550b46fa70cb0f915c3`
- 声明：class DragListenerextends InputListener
- 字段线索：tapSquareSize, pressedPointer, button, dragging, deltaY
- 方法线索：touchDown, touchDragged, touchUp, dragStart, drag, dragStop

### `arc-core/src/arc/scene/event/DragScrollListener.java`

- 知识页：[arc-core-src-arc-scene-event-dragscrolllistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-dragscrolllistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/DragScrollListener.java`
- SHA1：`7e8b972d02b6e48f514824a4deefcb47e84a7dcc`
- 声明：class DragScrollListenerextends DragListener
- 字段线索：scroll, scrollDown
- 方法线索：run, setup, drag, dragStop

### `arc-core/src/arc/scene/event/ElementGestureListener.java`

- 知识页：[arc-core-src-arc-scene-event-elementgesturelistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-elementgesturelistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/ElementGestureListener.java`
- SHA1：`9c12c8f96866a33b25398f53de63233ce12c03be`
- 声明：class ElementGestureListenerimplements EventListener
- 字段线索：tmpCoords, detector, initialPointer1, pointer1
- 方法线索：tap, longPress, fling, pan, zoom, pinch

### `arc-core/src/arc/scene/event/EventListener.java`

- 知识页：[arc-core-src-arc-scene-event-eventlistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-eventlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/EventListener.java`
- SHA1：`e8a6dd4dcdf2f46cb10133099be17aaf61647097`
- 声明：interface EventListener
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/scene/event/FocusListener.java`

- 知识页：[arc-core-src-arc-scene-event-focuslistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-focuslistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/FocusListener.java`
- SHA1：`90976d2843e926faae3af42479a22315dd5f282b`
- 声明：class FocusListenerimplements EventListener, class FocusEventextends SceneEvent, enum Type
- 字段线索：focused, type, relatedActor
- 方法线索：handle, keyboardFocusChanged, scrollFocusChanged, reset

### `arc-core/src/arc/scene/event/HandCursorListener.java`

- 知识页：[arc-core-src-arc-scene-event-handcursorlistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-handcursorlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/HandCursorListener.java`
- SHA1：`a9705209aded2089d81c87886ea21bf470ec46ba`
- 声明：class HandCursorListenerextends ClickListener
- 字段线索：enabled, checkEnabled
- 方法线索：enter, exit, isDisabled

### `arc-core/src/arc/scene/event/IbeamCursorListener.java`

- 知识页：[arc-core-src-arc-scene-event-ibeamcursorlistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-ibeamcursorlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/IbeamCursorListener.java`
- SHA1：`29b1dd4f2b069cbd325f9b600319eae1e2f6cda0`
- 声明：class IbeamCursorListenerextends ClickListener
- 字段线索：未抽取
- 方法线索：enter, exit

### `arc-core/src/arc/scene/event/InputEvent.java`

- 知识页：[arc-core-src-arc-scene-event-inputevent-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-inputevent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/InputEvent.java`
- SHA1：`b2ecf473613f8be38c6f49d60db3219180ed6eb1`
- 声明：class InputEventextends SceneEvent, enum InputEventType
- 字段线索：type, stageY, pointer, scrollAmountY, keyCode, character
- 方法线索：reset, toCoordinates, isTouchFocusCancel, toString

### `arc-core/src/arc/scene/event/InputListener.java`

- 知识页：[arc-core-src-arc-scene-event-inputlistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-inputlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/InputListener.java`
- SHA1：`eb54169d6a30431aad9193f0faff99d364d609f3`
- 声明：class InputListenerimplements EventListener
- 字段线索：tmpCoords
- 方法线索：handle, touchDown, touchUp, touchDragged, mouseMoved, enter

### `arc-core/src/arc/scene/event/ResizeListener.java`

- 知识页：[arc-core-src-arc-scene-event-resizelistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-resizelistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/ResizeListener.java`
- SHA1：`4489fa130ca57344af3247d76521a9befa6254ba`
- 声明：class ResizeListenerimplements EventListener
- 字段线索：未抽取
- 方法线索：handle, resized

### `arc-core/src/arc/scene/event/SceneEvent.java`

- 知识页：[arc-core-src-arc-scene-event-sceneevent-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-sceneevent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/SceneEvent.java`
- SHA1：`ca68232cdd4d2c43119fd6613b76767a36c14085`
- 声明：class SceneEventimplements Poolable
- 字段线索：targetActor, listenerActor, capture, bubbles, handled, stopped
- 方法线索：handle, cancel, stop, reset

### `arc-core/src/arc/scene/event/SceneResizeEvent.java`

- 知识页：[arc-core-src-arc-scene-event-sceneresizeevent-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-sceneresizeevent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/SceneResizeEvent.java`
- SHA1：`bf232e137f5e832d14d49673546de5e313ed9113`
- 声明：class SceneResizeEventextends SceneEvent
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/scene/event/Touchable.java`

- 知识页：[arc-core-src-arc-scene-event-touchable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-touchable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/Touchable.java`
- SHA1：`d58c1259528705248ce097771cf1ea2603671902`
- 声明：enum Touchable
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/scene/event/VisibilityEvent.java`

- 知识页：[arc-core-src-arc-scene-event-visibilityevent-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-visibilityevent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/VisibilityEvent.java`
- SHA1：`ab740fa59568c867d5780558324263a9e7ac1fa5`
- 声明：class VisibilityEventextends SceneEvent
- 字段线索：hide
- 方法线索：isHide

### `arc-core/src/arc/scene/event/VisibilityListener.java`

- 知识页：[arc-core-src-arc-scene-event-visibilitylistener-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-event-visibilitylistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/event/VisibilityListener.java`
- SHA1：`cae2b379e371936c7c7744461f2d0f5efcaa590c`
- 声明：class VisibilityListenerimplements EventListener
- 字段线索：未抽取
- 方法线索：handle, shown, hidden


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
