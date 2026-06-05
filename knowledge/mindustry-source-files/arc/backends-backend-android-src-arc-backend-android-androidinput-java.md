# arc:backends/backend-android/src/arc/backend/android/AndroidInput.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidInput.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`backends/backend-android/src/arc/backend/android/AndroidInput.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/backends/backend-android/src/arc/backend/android/AndroidInput.java`
- SHA1：`16ccf883abd1390df709b20dc61c1292a168012f`
- 大小：36207 bytes
- 行数：960

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class AndroidInputextends Input implements OnKeyListener, OnTouchListener, OnGenericMotionListener`。

关键词：arc, input

## Package

`arc.backend.android`

## 类型声明

- `class AndroidInputextends Input implements OnKeyListener, OnTouchListener, OnGenericMotionListener`
- `class KeyEvent`
- `class TouchEvent`
- `class SensorListenerimplements SensorEventListener`

## 字段线索

- `maxTouches`
- `accelerometerValues`
- `gyroscopeValues`
- `vibrator`
- `magneticFieldValues`
- `rotationVectorValues`
- `nativeOrientation`
- `hasMultitouch`
- `app`
- `context`
- `R`
- `orientation`
- `config`
- `manager`
- `handle`
- `compassAvailable`
- `rotationVectorAvailable`
- `azimuth`
- `pitch`
- `roll`

## 方法线索

- `newObject`
- `KeyEvent`
- `TouchEvent`
- `getAccelerometer`
- `getGyroscope`
- `getOrientation`
- `getTextInput`
- `beforeTextChanged`
- `onTextChanged`
- `afterTextChanged`
- `isShowingTextInput`
- `mouseX`
- `mouseY`
- `isTouched`
- `getPressure`
- `onTouch`
- `handleTouch`
- `toButton`
- `postTouchEvent`
- `onTap`
- `onDrop`
- `postTap`
- `onKey`
- `setOnscreenKeyboardVisible`
- `vibrate`
- `cancelVibrate`
- `justTouched`
- `updateOrientation`
- `getRotationMatrix`
- `isPeripheralAvailable`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
