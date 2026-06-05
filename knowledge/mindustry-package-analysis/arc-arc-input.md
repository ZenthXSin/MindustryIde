# Package `arc.input` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.input`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`arc.input`
- 文件数：7

## 主要依赖线索

- `arc.struct.*` × 3
- `arc.*` × 2
- `arc.util.*` × 2
- `arc.math.geom.*` × 1
- `arc.util.Timer.*` × 1
- `arc.struct.IntSeq` × 1
- `arc.util.Time` × 1
- `arc.ApplicationListener` × 1
- `arc.Input` × 1
- `arc.input.KeyBind.*` × 1

## 文件逐个分析

### `arc-core/src/arc/input/GestureDetector.java`

- 知识页：[arc-core-src-arc-input-gesturedetector-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-gesturedetector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/GestureDetector.java`
- SHA1：`1bc0c45266e9dd5e146b19389515cf3ee2536a45`
- 声明：class GestureDetectorimplements InputProcessor, interface GestureListener, class VelocityTracker
- 字段线索：listener, tracker, pointer2, initialPointer1, initialPointer2, longPressTask
- 方法线索：run, getListener, touchDown, touchDragged, touchUp, cancel

### `arc-core/src/arc/input/InputEventQueue.java`

- 知识页：[arc-core-src-arc-input-inputeventqueue-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-inputeventqueue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/InputEventQueue.java`
- SHA1：`8ab582d8d1fae7c53c1183f87d2d3520357098a7`
- 声明：class InputEventQueueimplements InputProcessor
- 字段线索：SKIP, KEY_DOWN, KEY_UP, KEY_TYPED, TOUCH_DOWN, TOUCH_UP
- 方法线索：getProcessor, setProcessor, drain, RuntimeException, queueTime, getCurrentEventTime

### `arc-core/src/arc/input/InputMultiplexer.java`

- 知识页：[arc-core-src-arc-input-inputmultiplexer-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-inputmultiplexer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/InputMultiplexer.java`
- SHA1：`197078d7fa194136237cc04423bac29932b7429f`
- 声明：class InputMultiplexerimplements InputProcessor
- 字段线索：processors
- 方法线索：addProcessor, removeProcessor, size, clear, getProcessors, setProcessors

### `arc-core/src/arc/input/InputProcessor.java`

- 知识页：[arc-core-src-arc-input-inputprocessor-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-inputprocessor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/InputProcessor.java`
- SHA1：`81c10104d6cbf5d30c07ac889ce9bc67b45350e0`
- 声明：interface InputProcessor
- 字段线索：未抽取
- 方法线索：keyDown, keyUp, keyTyped, touchDown, touchUp, touchDragged

### `arc-core/src/arc/input/KeyBind.java`

- 知识页：[arc-core-src-arc-input-keybind-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-keybind-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/KeyBind.java`
- SHA1：`a45c546f55ad9f7da03e40764d83ad4a3e9a9bf1`
- 声明：class KeyBind, interface KeybindValue, class Axisimplements KeybindValue
- 字段线索：all, name, defaultValue, category, value, max
- 方法线索：KeyBind, save, load, resetToDefault, isDefault, equals

### `arc-core/src/arc/input/KeyCode.java`

- 知识页：[arc-core-src-arc-input-keycode-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-keycode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/KeyCode.java`
- SHA1：`ba958897b3ad1a85a052b3fc02d8e43b1486d948`
- 声明：enum KeyCodeimplements KeybindValue, enum KeyType
- 字段线索：all, numbers, type, value, axis, cachedName
- 方法线索：getName, toString

### `arc-core/src/arc/input/KeyboardDevice.java`

- 知识页：[arc-core-src-arc-input-keyboarddevice-java.md](../mindustry-source-files/arc/arc-core-src-arc-input-keyboarddevice-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/KeyboardDevice.java`
- SHA1：`0daed9600e306316bcc736b2453385faa3c1c214`
- 声明：class KeyboardDeviceimplements InputProcessor
- 字段线索：pressed, lastFramePressed, justPressed, axes
- 方法线索：postUpdate, isPressed, isTapped, isReleased, getAxis, keyDown


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
