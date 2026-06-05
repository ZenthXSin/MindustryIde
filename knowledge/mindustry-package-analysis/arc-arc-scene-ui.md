# Package `arc.scene.ui` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.scene.ui`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

UI 包：负责 Scene2D 界面、Fragments、Dialogs、Styles 与编辑器界面。

## 规模

- 仓库：`arc`
- Package：`arc.scene.ui`
- 文件数：17

## 主要依赖线索

- `arc.*` × 9
- `arc.scene.*` × 9
- `arc.scene.style.*` × 8
- `arc.math.geom.*` × 7
- `arc.scene.event.*` × 7
- `arc.graphics.g2d.*` × 7
- `arc.scene.style.Drawable` × 6
- `arc.math.*` × 6
- `arc.util.*` × 6
- `arc.struct.*` × 5
- `arc.scene.ui.layout.*` × 5
- `arc.scene.utils.*` × 5
- `arc.graphics.Color` × 5
- `arc.graphics.*` × 5
- `arc.input.*` × 5
- `arc.scene.event.ChangeListener.*` × 4
- `arc.util.pooling.*` × 4
- `arc.func.*` × 4
- `arc.scene.Element` × 4
- `arc.scene.ui.layout.Cell` × 3

## 文件逐个分析

### `arc-core/src/arc/scene/ui/Button.java`

- 知识页：[arc-core-src-arc-scene-ui-button-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-button-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/Button.java`
- SHA1：`f6c2a294261794906448de302f027140a519f092`
- 声明：class Buttonextends Table implements Disableable, class ButtonStyleextends Style
- 字段线索：style, clickListener, programmaticChangeEvents, disabled, checkedOffsetY
- 方法线索：act, initialize, clicked, toggle, isChecked, setChecked

### `arc-core/src/arc/scene/ui/ButtonGroup.java`

- 知识页：[arc-core-src-arc-scene-ui-buttongroup-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-buttongroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/ButtonGroup.java`
- SHA1：`761e09c55e666e2dac34f3a88c843f7ff8ed2e13`
- 声明：class ButtonGroup<T extends Button>
- 字段线索：buttons, checkedButtons, maxCheckCount, uncheckLast, lastChecked
- 方法线索：add, remove, clear, canCheck, uncheckAll, getChecked

### `arc-core/src/arc/scene/ui/CheckBox.java`

- 知识页：[arc-core-src-arc-scene-ui-checkbox-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-checkbox-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/CheckBox.java`
- SHA1：`5e459d8b9abf3abdf698d70d874f48d5968c7c27`
- 声明：class CheckBoxextends TextButton, class CheckBoxStyleextends TextButtonStyle
- 字段线索：image, imageCell, style, checkboxOff, checkboxOnOver
- 方法线索：getStyle, setStyle, draw, getImage, getImageCell

### `arc-core/src/arc/scene/ui/ColorImage.java`

- 知识页：[arc-core-src-arc-scene-ui-colorimage-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-colorimage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/ColorImage.java`
- SHA1：`23c0f2e1f7bea77251d266ed374d6d1625a562dc`
- 声明：class ColorImageextends Image
- 字段线索：set
- 方法线索：draw

### `arc-core/src/arc/scene/ui/Dialog.java`

- 知识页：[arc-core-src-arc-scene-ui-dialog-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-dialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/Dialog.java`
- SHA1：`ad5a78eee3d64a745bd6e33d2aae60a1026f9c2e`
- 声明：class Dialogextends Table, class DialogStyleextends Style
- 字段线索：defaultShowAction, ignoreTouchDown, tmpPosition, tmpSize, MOVE, edge
- 方法线索：touchDown, updateEdge, touchUp, touchDragged, mouseMoved, scrolled

### `arc-core/src/arc/scene/ui/Image.java`

- 知识页：[arc-core-src-arc-scene-ui-image-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-image-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/Image.java`
- SHA1：`dd89138e91d77d905191819e7bdc1dec1a45942c`
- 声明：class Imageextends Element
- 字段线索：imageHeight, scaling, align, drawable
- 方法线索：layout, draw, getRegion, getDrawable, setDrawable, setScaling

### `arc-core/src/arc/scene/ui/ImageButton.java`

- 知识页：[arc-core-src-arc-scene-ui-imagebutton-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-imagebutton-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/ImageButton.java`
- SHA1：`7865fa4d5163bb6c8386fc03e146e0094166c094`
- 声明：class ImageButtonextends Button, class ImageButtonStyleextends ButtonStyle
- 字段线索：image, style, imageDisabled, imageDisabledColor
- 方法线索：getStyle, setStyle, IllegalArgumentException, replaceImage, updateImage, draw

### `arc-core/src/arc/scene/ui/Label.java`

- 知识页：[arc-core-src-arc-scene-ui-label-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-label-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/Label.java`
- SHA1：`e3236f8617af00d1f7cb95eb8c54b5ffcadbc55e`
- 声明：class Labelextends Element, class LabelStyleextends Style
- 字段线索：tempColor, prefSizeLayout, layout, prefSize, text, style
- 方法线索：getStyle, setStyle, setText, setTextInternal, textEquals, getText

### `arc-core/src/arc/scene/ui/ProgressBar.java`

- 知识页：[arc-core-src-arc-scene-ui-progressbar-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-progressbar-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/ProgressBar.java`
- SHA1：`46a19757653730de9c5711753767aa3eb4484484`
- 声明：class ProgressBarextends Element implements Disableable, class ProgressBarStyleextends Style
- 字段线索：vertical, style, stepSize, animateFromValue, animateTime, animateInterpolation
- 方法线索：getStyle, setStyle, act, draw, getValue, getVisualValue

### `arc-core/src/arc/scene/ui/ScrollPane.java`

- 知识页：[arc-core-src-arc-scene-ui-scrollpane-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-scrollpane-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/ScrollPane.java`
- SHA1：`c3b3e6254f2e73b6989a6a7d71c6fa7435be3f87`
- 声明：class ScrollPaneextends WidgetGroup, class ScrollPaneStyleextends Style
- 字段线索：hScrollBounds, vScrollBounds, hKnobBounds, vKnobBounds, lastPoint, widgetAreaBounds
- 方法线索：enter, touchDown, touchUp, touchDragged, mouseMoved, pan

### `arc-core/src/arc/scene/ui/Slider.java`

- 知识页：[arc-core-src-arc-scene-ui-slider-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-slider-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/Slider.java`
- SHA1：`f977786b365dd8064e6155423c8de28bce4c6b08`
- 声明：class Sliderextends ProgressBar, class SliderStyleextends ProgressBarStyle
- 字段线索：visualInterpolationInverse, snapValues, threshold, style, knob, bg
- 方法线索：touchDown, touchUp, touchDragged, enter, exit, getStyle

### `arc-core/src/arc/scene/ui/TextArea.java`

- 知识页：[arc-core-src-arc-scene-ui-textarea-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-textarea-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/TextArea.java`
- SHA1：`5da746868d4cffc4b511cf921e422094a6397ea8`
- 声明：class TextAreaextends TextField, class TextAreaListenerextends TextFieldClickListener
- 字段线索：linesBreak, cursorLine, firstLineShowing, moveOffset, lastText, linesShowing
- 方法线索：initialize, letterUnderCursor, setPrefRows, getPrefHeight, getLines, newLineAtEnd

### `arc-core/src/arc/scene/ui/TextButton.java`

- 知识页：[arc-core-src-arc-scene-ui-textbutton-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-textbutton-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/TextButton.java`
- SHA1：`c09541910e1357ef4261a85078d5d79eb1bc743d`
- 声明：class TextButtonextends Button, class TextButtonStyleextends ButtonStyle
- 字段线索：label, style, font, disabledFontColor
- 方法线索：getStyle, setStyle, draw, getLabel, getLabelCell, getText

### `arc-core/src/arc/scene/ui/TextField.java`

- 知识页：[arc-core-src-arc-scene-ui-textfield-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-textfield-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/TextField.java`
- SHA1：`fe58b64b036a96aa79ec04711ea40d0b1a721b98`
- 声明：class TextFieldextends Element implements Disableable, interface TextFieldListener, interface TextFieldFilter
- 字段线索：BACKSPACE, TAB, DELETE, BULLET, tmp1, tmp2
- 方法线索：initialize, createInputListener, TextFieldClickListener, letterUnderCursor, isWordCharacter, wordUnderCursor

### `arc-core/src/arc/scene/ui/Tooltip.java`

- 知识页：[arc-core-src-arc-scene-ui-tooltip-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-tooltip-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/Tooltip.java`
- SHA1：`1bf2295910c44c6ca6e0667aded1b3d076b754b6`
- 声明：class Tooltipextends InputListener, class Tooltips
- 字段线索：tmp, manager, container, instant, targetActor, show
- 方法线索：act, getManager, getContainer, setInstant, setAlways, touchDown

### `arc-core/src/arc/scene/ui/Touchpad.java`

- 知识页：[arc-core-src-arc-scene-ui-touchpad-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-touchpad-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/Touchpad.java`
- SHA1：`c1101fb4002554d64ef23e1640f33a5341faa18d`
- 声明：class Touchpadextends Element, class TouchpadStyle
- 字段线索：knobBounds, touchBounds, deadzoneBounds, knobPosition, knobPercent, style
- 方法线索：touchDown, touchDragged, touchUp, getStyle, setStyle, hit

### `arc-core/src/arc/scene/ui/TreeElement.java`

- 知识页：[arc-core-src-arc-scene-ui-treeelement-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-ui-treeelement-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/ui/TreeElement.java`
- SHA1：`5978b0bf98331bfd658a939374835e2cba52b26b`
- 声明：class TreeElementextends WidgetGroup, class TreeElementNode, class TreeStyle
- 字段线索：rootNodes, selection, prefHeight, sizeInvalid, foundNode, clickListener
- 方法线索：changed, findExpandedObjects, findNode, collapseAll, expandAll, initialize


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
