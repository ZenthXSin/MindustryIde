# Package `mindustry.world.blocks.logic` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.logic`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.logic`
- 文件数：7

## 主要依赖线索

- `arc.graphics.g2d.*` × 6
- `arc.util.io.*` × 6
- `mindustry.gen.*` × 6
- `arc.graphics.*` × 5
- `arc.util.*` × 5
- `mindustry.logic.*` × 5
- `mindustry.world.*` × 5
- `arc.math.geom.*` × 4
- `arc.scene.ui.layout.*` × 4
- `arc.struct.*` × 4
- `mindustry.annotations.Annotations.*` × 4
- `arc.math.*` × 3
- `mindustry.ui.*` × 3
- `mindustry.graphics.*` × 3
- `arc.*` × 3
- `mindustry.world.meta.*` × 3
- `mindustry.ui.dialogs.*` × 2
- `arc.Graphics.*` × 2
- `arc.Graphics.Cursor.*` × 2
- `arc.util.pooling.*` × 2

## 文件逐个分析

### `core/src/mindustry/world/blocks/logic/CanvasBlock.java`

- 知识页：[core-src-mindustry-world-blocks-logic-canvasblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-logic-canvasblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/logic/CanvasBlock.java`
- SHA1：`6deff470b901f0159b6127df78694277d27445a7`
- 声明：class CanvasBlockextends Block, class CanvasBuildextends Building implements LReadable, LWritable
- 字段线索：padding, canvasSize, palette, bitsPerPixel, colorToIndex, previewPixmap
- 方法线索：setPaletteFromString, init, drawPlanRegion, makePixmap, getByte, setPixel

### `core/src/mindustry/world/blocks/logic/LogicBlock.java`

- 知识页：[core-src-mindustry-world-blocks-logic-logicblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-logic-logicblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/logic/LogicBlock.java`
- SHA1：`8809ee09b8f22c514f294a546465d3b94f2aad59`
- 声明：class LogicBlockextends Block, class LogicLink, class LogicBuildextends Building implements Ranged, LReadable, LWritable
- 字段线索：maxByteLen, maxLinks, maxNameLength, usedBuildings, waitIndices, waitValues
- 方法线索：checkForceDark, accessible, canBreak, RuntimeException, setStats, drawPlace

### `core/src/mindustry/world/blocks/logic/LogicDisplay.java`

- 知识页：[core-src-mindustry-world-blocks-logic-logicdisplay-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-logic-logicdisplay-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/logic/LogicDisplay.java`
- SHA1：`734f623b786996f68db94ab4b66a76a219caf2f7`
- 声明：class LogicDisplayextends Block, class LogicDisplayBuildextends Building, enum GraphicsType
- 字段线索：commandClear, displays, displayDrawType, scaleStep, maxSides, displaySize
- 方法线索：setStats, init, draw, sense, flushCommands, ensureBuffer

### `core/src/mindustry/world/blocks/logic/MemoryBlock.java`

- 知识页：[core-src-mindustry-world-blocks-logic-memoryblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-logic-memoryblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/logic/MemoryBlock.java`
- SHA1：`e4c49f795abc4886d18c385e2c1ced1c7b93fb07`
- 声明：class MemoryBlockextends Block, class MemoryBuildextends Building implements LReadable, LWritable
- 字段线索：memoryCapacity, memory
- 方法线索：setStats, accessible, canBreak, canPickup, collide, displayable

### `core/src/mindustry/world/blocks/logic/MessageBlock.java`

- 知识页：[core-src-mindustry-world-blocks-logic-messageblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-logic-messageblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/logic/MessageBlock.java`
- SHA1：`f1a94f9c6ed993e50b0fb174e5c0b618bdf601e9`
- 声明：class MessageBlockextends Block, class MessageBuildextends Building implements LReadable
- 字段线索：maxTextLength, maxNewlines, message
- 方法线索：accessible, canBreak, drawSelect, shouldShowConfigure, buildConfiguration, onConfigureBuildTapped

### `core/src/mindustry/world/blocks/logic/SwitchBlock.java`

- 知识页：[core-src-mindustry-world-blocks-logic-switchblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-logic-switchblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/logic/SwitchBlock.java`
- SHA1：`9a89b675344b6368b29e559f9ec53f8822a8f8f2`
- 声明：class SwitchBlockextends Block, class SwitchBuildextends Building
- 字段线索：clickSound
- 方法线索：accessible, canBreak, damage, canPickup, collide, configTapped

### `core/src/mindustry/world/blocks/logic/TileableLogicDisplay.java`

- 知识页：[core-src-mindustry-world-blocks-logic-tileablelogicdisplay-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-logic-tileablelogicdisplay-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/logic/TileableLogicDisplay.java`
- SHA1：`9a894ec5999f9241a6f0f0df36f5d277c7e67a05`
- 声明：class TileableLogicDisplayextends LogicDisplay, class MergeBuffer, class TileableLogicDisplayBuildextends LogicDisplayBuild
- 字段线索：queue, displays, buffers, processed, maxDisplayDimensions, frameSize
- 方法线索：toString, sense, display, onProximityUpdate, getBufferRegion, draw


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
