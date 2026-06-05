# Package `mindustry.ui` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ui`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

UI 包：负责 Scene2D 界面、Fragments、Dialogs、Styles 与编辑器界面。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ui`
- 文件数：16

## 主要依赖线索

- `arc.scene.ui.layout.*` × 10
- `arc.graphics.g2d.*` × 8
- `arc.util.*` × 8
- `arc.*` × 7
- `arc.graphics.*` × 6
- `arc.scene.style.*` × 6
- `mindustry.gen.*` × 6
- `mindustry.graphics.*` × 6
- `arc.scene.*` × 5
- `arc.scene.ui.*` × 4
- `arc.struct.*` × 4
- `arc.func.*` × 3
- `arc.math.*` × 3
- `mindustry.core.*` × 3
- `arc.math.geom.*` × 2
- `mindustry.*` × 2
- `mindustry.type.*` × 2
- `arc.graphics.g2d.TextureAtlas.*` × 2
- `mindustry.annotations.Annotations.*` × 2
- `arc.util.pooling.*` × 1

## 文件逐个分析

### `core/src/mindustry/ui/Bar.java`

- 知识页：[core-src-mindustry-ui-bar-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-bar-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/Bar.java`
- SHA1：`807db4ab43d532e9999cc43d37fdc6c205a288fb`
- 声明：class Barextends Element
- 字段线索：scissor, fraction, name, outlineRadius, blinkColor
- 方法线索：reset, set, snap, outline, flash, blink

### `core/src/mindustry/ui/BorderImage.java`

- 知识页：[core-src-mindustry-ui-borderimage-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-borderimage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/BorderImage.java`
- SHA1：`4054f3290e8978e3287188fc8121b0a1c53ebeeb`
- 声明：class BorderImageextends Image
- 字段线索：thickness, borderColor
- 方法线索：border, draw

### `core/src/mindustry/ui/CoreItemsDisplay.java`

- 知识页：[core-src-mindustry-ui-coreitemsdisplay-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-coreitemsdisplay-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/CoreItemsDisplay.java`
- SHA1：`d179557f3b842ee365b8ddea5fb95f195ea5b0a3`
- 声明：class CoreItemsDisplayextends Table
- 字段线索：usedItems, core
- 方法线索：resetUsed

### `core/src/mindustry/ui/Displayable.java`

- 知识页：[core-src-mindustry-ui-displayable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-displayable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/Displayable.java`
- SHA1：`d65aa7275d11cf67febcc8d1b324284915811280`
- 声明：interface Displayable
- 字段线索：未抽取
- 方法线索：displayable

### `core/src/mindustry/ui/Fonts.java`

- 知识页：[core-src-mindustry-ui-fonts-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fonts-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/Fonts.java`
- SHA1：`c317dab9f9949478f3fbcd8f0d241e3d1620ba52`
- 声明：class Fonts
- 字段线索：mainFont, unscaled, unicodeIcons, unicodeToName, stringIcons, largeIcons
- 方法线索：RuntimeException, loadSync, draw, imageSize, fontParameter, FreeTypeFontParameter

### `core/src/mindustry/ui/GridImage.java`

- 知识页：[core-src-mindustry-ui-gridimage-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-gridimage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/GridImage.java`
- SHA1：`86add9fb36867f9f2bb6598a3842b1a89dfe3ce2`
- 声明：class GridImageextends Element
- 字段线索：imageHeight
- 方法线索：draw, setImageSize

### `core/src/mindustry/ui/IntFormat.java`

- 知识页：[core-src-mindustry-ui-intformat-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-intformat-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/IntFormat.java`
- SHA1：`1b547ef724eaf953ed942970922e79509c82453e`
- 声明：class IntFormat
- 字段线索：builder, text, lastValue, converter
- 方法线索：get

### `core/src/mindustry/ui/ItemsDisplay.java`

- 知识页：[core-src-mindustry-ui-itemsdisplay-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-itemsdisplay-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/ItemsDisplay.java`
- SHA1：`4d86e3703a210e2e45f6c88894f625ca911e6641`
- 声明：class ItemsDisplayextends Table
- 字段线索：未抽取
- 方法线索：rebuild

### `core/src/mindustry/ui/Links.java`

- 知识页：[core-src-mindustry-ui-links-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-links-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/Links.java`
- SHA1：`cf4ff8e636a6d4ef9ddb1865da17a36d5e59e28a`
- 声明：class Links, class LinkEntry
- 字段线索：links, link, color, icon
- 方法线索：未抽取

### `core/src/mindustry/ui/Menus.java`

- 知识页：[core-src-mindustry-ui-menus-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-menus-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/Menus.java`
- SHA1：`afdc04c56fac99def772829be99582d307a8fd15`
- 声明：class Menus, interface MenuListener, interface TextInputListener
- 字段线索：menuListeners, textInputListeners
- 方法线索：未抽取

### `core/src/mindustry/ui/Minimap.java`

- 知识页：[core-src-mindustry-ui-minimap-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-minimap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/Minimap.java`
- SHA1：`dd3ca21ff32a2efde8e7f85a9cf8d9984a60fd55`
- 声明：class Minimapextends Table
- 字段线索：未抽取
- 方法线索：clicked, act, draw, scrolled, touchUp, touchDragged

### `core/src/mindustry/ui/MobileButton.java`

- 知识页：[core-src-mindustry-ui-mobilebutton-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-mobilebutton-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/MobileButton.java`
- SHA1：`7a9e062e2fb4d2e030d7fa1549c9ca79ab670e18`
- 声明：class MobileButtonextends ImageButton
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/ui/MultiReqImage.java`

- 知识页：[core-src-mindustry-ui-multireqimage-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-multireqimage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/MultiReqImage.java`
- SHA1：`62c2c41e0c4bb8d68b7a5b849331f84980fc1de3`
- 声明：class MultiReqImageextends Stack
- 字段线索：displays, time
- 方法线索：add, act

### `core/src/mindustry/ui/ReqImage.java`

- 知识页：[core-src-mindustry-ui-reqimage-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-reqimage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/ReqImage.java`
- SHA1：`d2a8bfe73dae89f7aed7e97dd3751a001e837a18`
- 声明：class ReqImageextends Stack
- 字段线索：valid
- 方法线索：draw, valid

### `core/src/mindustry/ui/Styles.java`

- 知识页：[core-src-mindustry-ui-styles-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-styles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/Styles.java`
- SHA1：`90f32c5c8193897e995de38c37fcb340df2ca020`
- 声明：class Styles
- 字段线索：accentDrawable, underlineb, logict, selected, noBarPane, defaultSlider
- 方法线索：getLeftWidth, getRightWidth, getTopHeight, getBottomHeight

### `core/src/mindustry/ui/WarningBar.java`

- 知识页：[core-src-mindustry-ui-warningbar-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-warningbar-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/WarningBar.java`
- SHA1：`c8fd08ccc779a3da12905c9a705845624e252d45`
- 声明：class WarningBarextends Element
- 字段线索：barWidth
- 方法线索：draw


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
