# arc:arc-core/src/arc/scene/ui/TextField.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/TextField.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/scene/ui/TextField.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/TextField.java`
- SHA1：`fe58b64b036a96aa79ec04711ea40d0b1a721b98`
- 大小：41417 bytes
- 行数：1142

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class TextFieldextends Element implements Disableable`。

关键词：ui, arc, scene

## Package

`arc.scene.ui`

## 类型声明

- `class TextFieldextends Element implements Disableable`
- `interface TextFieldListener`
- `interface TextFieldFilter`
- `interface TextFieldValidator`
- `class TextFieldStyleextends Style`
- `class KeyRepeatTaskextends Task`
- `class TextFieldClickListenerextends ClickListener`

## 字段线索

- `BACKSPACE`
- `TAB`
- `DELETE`
- `BULLET`
- `tmp1`
- `tmp2`
- `tmp3`
- `keyRepeatInitialTime`
- `keyRepeatTime`
- `imeData`
- `layout`
- `glyphPositions`
- `text`
- `selectionStart`
- `hasSelection`
- `writeEnters`
- `displayText`
- `textOffset`
- `inputDialogListener`
- `style`

## 方法线索

- `initialize`
- `createInputListener`
- `TextFieldClickListener`
- `letterUnderCursor`
- `isWordCharacter`
- `wordUnderCursor`
- `removeInputDialog`
- `addInputDialog`
- `getMaxLength`
- `setMaxLength`
- `clearText`
- `setOnlyFontChars`
- `getStyle`
- `setStyle`
- `calculateOffsets`
- `getBackgroundDrawable`
- `draw`
- `isValid`
- `getTextY`
- `drawSelection`
- `drawText`
- `drawCursor`
- `updateDisplayText`
- `blink`
- `copy`
- `cut`
- `paste`
- `next`
- `findNextTextField`
- `getDefaultInputListener`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
