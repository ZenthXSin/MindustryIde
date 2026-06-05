# arc:arc-core/src/arc/input/GestureDetector.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/GestureDetector.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/input/GestureDetector.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/input/GestureDetector.java`
- SHA1：`1bc0c45266e9dd5e146b19389515cf3ee2536a45`
- 大小：16462 bytes
- 行数：445

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class GestureDetectorimplements InputProcessor`。

关键词：arc, input

## Package

`arc.input`

## 类型声明

- `class GestureDetectorimplements InputProcessor`
- `interface GestureListener`
- `class VelocityTracker`

## 字段线索

- `listener`
- `tracker`
- `pointer2`
- `initialPointer1`
- `initialPointer2`
- `longPressTask`
- `tapRectangleWidth`
- `tapRectangleHeight`
- `tapCountInterval`
- `longPressSeconds`
- `maxFlingDelay`
- `inTapRectangle`
- `tapCount`
- `lastTapTime`
- `lastTapY`
- `lastTapPointer`
- `lastTapButton`
- `pinching`
- `panning`
- `tapRectangleCenterY`

## 方法线索

- `run`
- `getListener`
- `touchDown`
- `touchDragged`
- `touchUp`
- `cancel`
- `isLongPressed`
- `isPanning`
- `reset`
- `isWithinTapRectangle`
- `invalidateTapSquare`
- `setTapSquareSize`
- `setTapRectangleSize`
- `setTapCountInterval`
- `setLongPressSeconds`
- `setMaxFlingDelay`
- `tap`
- `longPress`
- `fling`
- `pan`
- `panStop`
- `zoom`
- `pinch`
- `pinchStop`
- `start`
- `update`
- `getVelocityX`
- `getVelocityY`
- `getAverage`
- `getSum`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
