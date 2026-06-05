# Package `arc.scene.actions` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.scene.actions`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.scene.actions`
- 文件数：33

## 主要依赖线索

- `arc.scene.Action` × 14
- `arc.util.pooling.Pool` × 5
- `arc.scene.Element` × 4
- `arc.scene.*` × 4
- `arc.graphics.Color` × 3
- `arc.scene.event.EventListener` × 3
- `arc.math.Interp` × 2
- `arc.scene.event.Touchable` × 2
- `arc.struct.Seq` × 2
- `arc.util.Align` × 2
- `arc.func.Prov` × 1
- `arc.util.pooling.Pools` × 1
- `arc.math.Mathf` × 1

## 文件逐个分析

### `arc-core/src/arc/scene/actions/Actions.java`

- 知识页：[arc-core-src-arc-scene-actions-actions-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-actions-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/Actions.java`
- SHA1：`94ae196fcf6657fe6fe7e7227f0d82d9dab06c60`
- 声明：class Actions
- 字段线索：未抽取
- 方法线索：OriginAction

### `arc-core/src/arc/scene/actions/AddAction.java`

- 知识页：[arc-core-src-arc-scene-actions-addaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-addaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/AddAction.java`
- SHA1：`f8494c877cf3746cbbb0dfba0a8a0318e716df7c`
- 声明：class AddActionextends Action
- 字段线索：action
- 方法线索：act, getAction, setAction, restart, reset

### `arc-core/src/arc/scene/actions/AddListenerAction.java`

- 知识页：[arc-core-src-arc-scene-actions-addlisteneraction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-addlisteneraction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/AddListenerAction.java`
- SHA1：`f2e733adfc13b5f1a6f01d9325718ad35087178b`
- 声明：class AddListenerActionextends Action
- 字段线索：listener, capture
- 方法线索：act, getListener, setListener, getCapture, setCapture, reset

### `arc-core/src/arc/scene/actions/AfterAction.java`

- 知识页：[arc-core-src-arc-scene-actions-afteraction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-afteraction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/AfterAction.java`
- SHA1：`d0106dac372b938f43dace9ae00648ebfae5607f`
- 声明：class AfterActionextends DelegateAction
- 字段线索：waitForActions
- 方法线索：setTarget, restart, delegate

### `arc-core/src/arc/scene/actions/AlphaAction.java`

- 知识页：[arc-core-src-arc-scene-actions-alphaaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-alphaaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/AlphaAction.java`
- SHA1：`48d394193a99aea5aaf7d5132032c7b3c829c913`
- 声明：class AlphaActionextends TemporalAction
- 字段线索：end, color
- 方法线索：begin, update, reset, getColor, setColor, getAlpha

### `arc-core/src/arc/scene/actions/ColorAction.java`

- 知识页：[arc-core-src-arc-scene-actions-coloraction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-coloraction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/ColorAction.java`
- SHA1：`a268418860198f6dbb8737061315f44a4a937311`
- 声明：class ColorActionextends TemporalAction
- 字段线索：end, startA, color
- 方法线索：begin, update, reset, getColor, setColor, getEndColor

### `arc-core/src/arc/scene/actions/DelayAction.java`

- 知识页：[arc-core-src-arc-scene-actions-delayaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-delayaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/DelayAction.java`
- SHA1：`cd3a534e182420450599c8d49acbf71cb4ca6671`
- 声明：class DelayActionextends DelegateAction
- 字段线索：time
- 方法线索：delegate, finish, restart, getTime, setTime, getDuration

### `arc-core/src/arc/scene/actions/DelegateAction.java`

- 知识页：[arc-core-src-arc-scene-actions-delegateaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-delegateaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/DelegateAction.java`
- SHA1：`63f2d76bcdcffdee05996c36cf6a837c69fcd63e`
- 声明：class DelegateActionextends Action
- 字段线索：action
- 方法线索：getAction, setAction, restart, reset, setActor, setTarget

### `arc-core/src/arc/scene/actions/FloatAction.java`

- 知识页：[arc-core-src-arc-scene-actions-floataction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-floataction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/FloatAction.java`
- SHA1：`d9238e40d287b9fe2dc9b63b6a2db8cee0058e88`
- 声明：class FloatActionextends TemporalAction
- 字段线索：end, value
- 方法线索：begin, update, getValue, setValue, getStart, setStart

### `arc-core/src/arc/scene/actions/IntAction.java`

- 知识页：[arc-core-src-arc-scene-actions-intaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-intaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/IntAction.java`
- SHA1：`9c74ddcba6d8b1851f52667fb6c6b25abfaadee0`
- 声明：class IntActionextends TemporalAction
- 字段线索：end, value
- 方法线索：begin, update, getValue, setValue, getStart, setStart

### `arc-core/src/arc/scene/actions/LayoutAction.java`

- 知识页：[arc-core-src-arc-scene-actions-layoutaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-layoutaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/LayoutAction.java`
- SHA1：`c479d51d247b5e19a28d56d298eebd14e54b94f4`
- 声明：class LayoutActionextends Action
- 字段线索：enabled
- 方法线索：act, isEnabled, setLayoutEnabled

### `arc-core/src/arc/scene/actions/MoveByAction.java`

- 知识页：[arc-core-src-arc-scene-actions-movebyaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-movebyaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/MoveByAction.java`
- SHA1：`f014ddce5d83e5f84219674082b1efaaecf4b527`
- 声明：class MoveByActionextends RelativeTemporalAction
- 字段线索：amountY
- 方法线索：updateRelative, setAmount, getAmountX, setAmountX, getAmountY, setAmountY

### `arc-core/src/arc/scene/actions/MoveToAction.java`

- 知识页：[arc-core-src-arc-scene-actions-movetoaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-movetoaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/MoveToAction.java`
- SHA1：`a0293c7e448b1e22f588e9eb5684f17bbdb3c69e`
- 声明：class MoveToActionextends TemporalAction
- 字段线索：startY, endY, alignment
- 方法线索：begin, update, reset, setPosition, getX, setX

### `arc-core/src/arc/scene/actions/OriginAction.java`

- 知识页：[arc-core-src-arc-scene-actions-originaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-originaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/OriginAction.java`
- SHA1：`0057c1703ae0f5bcc3245a7f94967a548398f733`
- 声明：class OriginActionextends Action
- 字段线索：未抽取
- 方法线索：act

### `arc-core/src/arc/scene/actions/ParallelAction.java`

- 知识页：[arc-core-src-arc-scene-actions-parallelaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-parallelaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/ParallelAction.java`
- SHA1：`c049f47bbe2aa1e9977e54a327f51eaf69d7178e`
- 声明：class ParallelActionextends Action
- 字段线索：complete
- 方法线索：act, restart, reset, addAction, setActor, getActions

### `arc-core/src/arc/scene/actions/RelativeTemporalAction.java`

- 知识页：[arc-core-src-arc-scene-actions-relativetemporalaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-relativetemporalaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RelativeTemporalAction.java`
- SHA1：`2f94fc2d46987b607407f5e97a280abceb55560e`
- 声明：class RelativeTemporalActionextends TemporalAction
- 字段线索：lastPercent
- 方法线索：begin, update

### `arc-core/src/arc/scene/actions/RemoveAction.java`

- 知识页：[arc-core-src-arc-scene-actions-removeaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-removeaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RemoveAction.java`
- SHA1：`2ab843be124092e4c0d7a4f056a1c6920c57b1fd`
- 声明：class RemoveActionextends Action
- 字段线索：action
- 方法线索：act, getAction, setAction, reset

### `arc-core/src/arc/scene/actions/RemoveActorAction.java`

- 知识页：[arc-core-src-arc-scene-actions-removeactoraction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-removeactoraction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RemoveActorAction.java`
- SHA1：`42eb8668daa8fd7a60e197433a4e2341edef0a26`
- 声明：class RemoveActorActionextends Action
- 字段线索：removed
- 方法线索：act, restart

### `arc-core/src/arc/scene/actions/RemoveListenerAction.java`

- 知识页：[arc-core-src-arc-scene-actions-removelisteneraction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-removelisteneraction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RemoveListenerAction.java`
- SHA1：`116794343d2cdcf58d5cd8bcde6e42e36391213c`
- 声明：class RemoveListenerActionextends Action
- 字段线索：listener, capture
- 方法线索：act, getListener, setListener, getCapture, setCapture, reset

### `arc-core/src/arc/scene/actions/RepeatAction.java`

- 知识页：[arc-core-src-arc-scene-actions-repeataction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-repeataction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RepeatAction.java`
- SHA1：`20d77883afca0351f0377fcfd20955096b18a029`
- 声明：class RepeatActionextends DelegateAction
- 字段线索：FOREVER, executedCount, finished
- 方法线索：delegate, finish, restart, getCount, setCount

### `arc-core/src/arc/scene/actions/RotateByAction.java`

- 知识页：[arc-core-src-arc-scene-actions-rotatebyaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-rotatebyaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RotateByAction.java`
- SHA1：`899e2963e3bb4a952d16b83bd2d359b7336dd419`
- 声明：class RotateByActionextends RelativeTemporalAction
- 字段线索：amount
- 方法线索：updateRelative, getAmount, setAmount

### `arc-core/src/arc/scene/actions/RotateToAction.java`

- 知识页：[arc-core-src-arc-scene-actions-rotatetoaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-rotatetoaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RotateToAction.java`
- SHA1：`68ef0f19cc263f50f01d4dec9b8eaa05244c0520`
- 声明：class RotateToActionextends TemporalAction
- 字段线索：end, useShortestDirection
- 方法线索：begin, update, getRotation, setRotation, isUseShortestDirection, setUseShortestDirection

### `arc-core/src/arc/scene/actions/RunnableAction.java`

- 知识页：[arc-core-src-arc-scene-actions-runnableaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-runnableaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/RunnableAction.java`
- SHA1：`47633d11e0498b9167da1e640fa0e4d27c05b68a`
- 声明：class RunnableActionextends Action
- 字段线索：runnable, ran
- 方法线索：act, run, restart, reset, getRunnable, setRunnable

### `arc-core/src/arc/scene/actions/ScaleByAction.java`

- 知识页：[arc-core-src-arc-scene-actions-scalebyaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-scalebyaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/ScaleByAction.java`
- SHA1：`ebb76aa32c75b1e3f2a990a0243432541d92b5ee`
- 声明：class ScaleByActionextends RelativeTemporalAction
- 字段线索：amountY
- 方法线索：updateRelative, setAmount, getAmountX, setAmountX, getAmountY, setAmountY

### `arc-core/src/arc/scene/actions/ScaleToAction.java`

- 知识页：[arc-core-src-arc-scene-actions-scaletoaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-scaletoaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/ScaleToAction.java`
- SHA1：`cfd9cac9787e65c4fb1f371447fc96060a0fde90`
- 声明：class ScaleToActionextends TemporalAction
- 字段线索：startY, endY
- 方法线索：begin, update, setScale, getX, setX, getY

### `arc-core/src/arc/scene/actions/SequenceAction.java`

- 知识页：[arc-core-src-arc-scene-actions-sequenceaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-sequenceaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/SequenceAction.java`
- SHA1：`b1465d97692a2ca1c5cdb2ad3eb28e5ca9d57648`
- 声明：class SequenceActionextends ParallelAction
- 字段线索：index
- 方法线索：act, restart

### `arc-core/src/arc/scene/actions/SizeByAction.java`

- 知识页：[arc-core-src-arc-scene-actions-sizebyaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-sizebyaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/SizeByAction.java`
- SHA1：`3b334106d15365c26621b9356b718bb5b56ce5ef`
- 声明：class SizeByActionextends RelativeTemporalAction
- 字段线索：amountHeight
- 方法线索：updateRelative, setAmount, getAmountWidth, setAmountWidth, getAmountHeight, setAmountHeight

### `arc-core/src/arc/scene/actions/SizeToAction.java`

- 知识页：[arc-core-src-arc-scene-actions-sizetoaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-sizetoaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/SizeToAction.java`
- SHA1：`e3e88671d8dcbaba2f3e25c8104df02e81900083`
- 声明：class SizeToActionextends TemporalAction
- 字段线索：startHeight, endHeight
- 方法线索：begin, update, setSize, getWidth, setWidth, getHeight

### `arc-core/src/arc/scene/actions/TemporalAction.java`

- 知识页：[arc-core-src-arc-scene-actions-temporalaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-temporalaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/TemporalAction.java`
- SHA1：`dc69a6a7f0a64d33123cad8b3b6cfc1008785e37`
- 声明：class TemporalActionextends Action
- 字段线索：time, interpolation, complete
- 方法线索：act, begin, end, finish, restart, reset

### `arc-core/src/arc/scene/actions/TimeScaleAction.java`

- 知识页：[arc-core-src-arc-scene-actions-timescaleaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-timescaleaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/TimeScaleAction.java`
- SHA1：`21076b2f9c78019ca7028865357e43eed151c9e2`
- 声明：class TimeScaleActionextends DelegateAction
- 字段线索：scale
- 方法线索：delegate, getScale, setScale

### `arc-core/src/arc/scene/actions/TouchableAction.java`

- 知识页：[arc-core-src-arc-scene-actions-touchableaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-touchableaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/TouchableAction.java`
- SHA1：`d09afe4baefca2ccbbd98e4f14e77e8b46b94afd`
- 声明：class TouchableActionextends Action
- 字段线索：touchable
- 方法线索：act, getTouchable, touchable

### `arc-core/src/arc/scene/actions/TranslateByAction.java`

- 知识页：[arc-core-src-arc-scene-actions-translatebyaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-translatebyaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/TranslateByAction.java`
- SHA1：`5e2f4df912be4538b65dd10f219f6d5874cb86e7`
- 声明：class TranslateByActionextends RelativeTemporalAction
- 字段线索：amountY
- 方法线索：updateRelative, setAmount, getAmountX, setAmountX, getAmountY, setAmountY

### `arc-core/src/arc/scene/actions/VisibleAction.java`

- 知识页：[arc-core-src-arc-scene-actions-visibleaction-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-actions-visibleaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/actions/VisibleAction.java`
- SHA1：`998ea7efec330048d936c2c2f6642e4342297edb`
- 声明：class VisibleActionextends Action
- 字段线索：visible
- 方法线索：act, isVisible, setVisible


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
