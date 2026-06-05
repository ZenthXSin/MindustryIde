# arc:backends/backend-robovm/src/arc/backend/robovm/IOSInput.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSInput.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`backends/backend-robovm/src/arc/backend/robovm/IOSInput.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-robovm/src/arc/backend/robovm/IOSInput.java`
- SHA1：`5b7e4a30e1e0af8390cc5781e0415581d6b3526c`
- 大小：23234 bytes
- 行数：666

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class IOSInputextends Input`。

关键词：arc, input

## Package

`arc.backend.robovm`

## 类型声明

- `class IOSInputextends Input`
- `class NSObjectWrapper<T extends NSObject>`
- `class NSSetExtensionsextends NSExtensions`
- `class NSArrayExtensionsextends NSExtensions`
- `class TouchEvent`
- `class KeyEvent`
- `class HiddenTextFieldextends UITextField`

## 字段线索

- `MAX_TOUCHES`
- `UI_ACCELERATION_WRAPPER`
- `POINTER_NOT_FOUND`
- `UI_TOUCH_WRAPPER`
- `keyEventPool`
- `keyEvents`
- `accelerometerDelegate`
- `currentEventTimeStamp`
- `textfield`
- `locY`
- `HANDLE_OFFSET`
- `instance`
- `KEY_DOWN`
- `KEY_UP`
- `KEY_TYPED`

## 方法线索

- `newObject`
- `KeyEvent`
- `TouchEvent`
- `shouldChangeCharacters`
- `shouldEndEditing`
- `shouldReturn`
- `setupAccelerometer`
- `didAccelerate`
- `getAccelerometer`
- `mouseX`
- `deltaX`
- `mouseY`
- `deltaY`
- `isTouched`
- `justTouched`
- `getPressure`
- `getTextInput`
- `clicked`
- `cancel`
- `isShowingTextInput`
- `setOnscreenKeyboardVisible`
- `setKeyboardCloseOnReturnKey`
- `getKeyboardTextField`
- `createDefaultTextField`
- `vibrate`
- `getCurrentEventTime`
- `isPeripheralAvailable`
- `getRotation`
- `getNativeOrientation`
- `onTouch`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
