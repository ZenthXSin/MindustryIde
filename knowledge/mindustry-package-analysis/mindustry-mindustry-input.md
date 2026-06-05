# Package `mindustry.input` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.input`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

Mod 包：负责 Mod 加载、脚本、类加载器、元数据、依赖与错误处理。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.input`
- 文件数：6

## 主要依赖线索

- `arc.input.*` × 4
- `mindustry.*` × 4
- `arc.*` × 4
- `arc.math.*` × 4
- `arc.math.geom.*` × 4
- `arc.struct.*` × 4
- `arc.graphics.g2d.*` × 3
- `arc.scene.*` × 3
- `arc.scene.ui.layout.*` × 3
- `arc.util.*` × 3
- `mindustry.entities.units.*` × 3
- `arc.graphics.*` × 2
- `mindustry.core.*` × 2
- `mindustry.game.EventType.*` × 2
- `mindustry.game.*` × 2
- `arc.func.*` × 2
- `arc.input.GestureDetector.*` × 2
- `arc.input.KeyBind.*` × 1
- `arc.Graphics.*` × 1
- `arc.Graphics.Cursor.*` × 1

## 文件逐个分析

### `core/src/mindustry/input/Binding.java`

- 知识页：[core-src-mindustry-input-binding-java.md](../mindustry-source-files/mindustry/core-src-mindustry-input-binding-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/input/Binding.java`
- SHA1：`873aea15c4572f4e106cac754c2bcd79ce50bb27`
- 声明：class Binding
- 字段线索：moveX
- 方法线索：未抽取

### `core/src/mindustry/input/DesktopInput.java`

- 知识页：[core-src-mindustry-input-desktopinput-java.md](../mindustry-source-files/mindustry/core-src-mindustry-input-desktopinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/input/DesktopInput.java`
- SHA1：`9b47fae05bd7f6a39203f246f390822f4e48dcfc`
- 声明：class DesktopInputextends InputHandler
- 字段线索：movement, cursorType, selectX, schematicY, mode, selectScale
- 方法线索：reset, buildUI, drawTop, drawBottom, update, useSchematic

### `core/src/mindustry/input/InputHandler.java`

- 知识页：[core-src-mindustry-input-inputhandler-java.md](../mindustry-source-files/mindustry/core-src-mindustry-input-inputhandler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/input/InputHandler.java`
- SHA1：`75899b1de113058c69339a568706eb6385a77b8d`
- 声明：class InputHandlerimplements InputProcessor, GestureListener
- 字段线索：queuedCommands, playerSelectRange, unitSelectRadScl, stancesOut, removed, intSet
- 方法线索：ValidateException, createPlanLists, find, updateSelectQuadtree, addLock, locked

### `core/src/mindustry/input/MobileInput.java`

- 知识页：[core-src-mindustry-input-mobileinput-java.md](../mindustry-source-files/mindustry/core-src-mindustry-input-mobileinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/input/MobileInput.java`
- SHA1：`7b5cb83ab74a8a0ce5259e6e3c8b7fd9be4b457b`
- 声明：class MobileInputextends InputHandler implements GestureListener
- 字段线索：maxPanSpeed, edgePan, vector, lastZoom, lastLineY, lineScale
- 方法线索：buildPlacementUI, showCancel, hasSchematic, buildUI, drawBottom, drawTop

### `core/src/mindustry/input/PlaceMode.java`

- 知识页：[core-src-mindustry-input-placemode-java.md](../mindustry-source-files/mindustry/core-src-mindustry-input-placemode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/input/PlaceMode.java`
- SHA1：`b902be593d432085e9b00c8b65b38f8cad49cca8`
- 声明：enum PlaceMode
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/input/Placement.java`

- 知识页：[core-src-mindustry-input-placement-java.md](../mindustry-source-files/mindustry/core-src-mindustry-input-placement-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/input/Placement.java`
- SHA1：`99f7f45110420caec75083bea53ec98cfc3d38d5`
- 声明：class Placement, class NormalizeDrawResult, class NormalizeResult
- 字段线索：plans1, tmpPoints, result, drawResult, bres, points
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
