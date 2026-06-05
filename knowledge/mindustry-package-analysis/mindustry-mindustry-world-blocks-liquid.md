# Package `mindustry.world.blocks.liquid` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.liquid`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.liquid`
- 文件数：6

## 主要依赖线索

- `mindustry.gen.*` × 6
- `mindustry.type.*` × 5
- `arc.graphics.g2d.*` × 4
- `mindustry.world.*` × 3
- `mindustry.world.meta.*` × 3
- `mindustry.world.blocks.distribution.*` × 2
- `arc.graphics.*` × 2
- `arc.util.*` × 2
- `mindustry.annotations.Annotations.*` × 2
- `mindustry.graphics.*` × 2
- `arc.*` × 1
- `arc.func.*` × 1
- `arc.math.*` × 1
- `arc.math.geom.*` × 1
- `arc.struct.*` × 1
- `mindustry.content.*` × 1
- `mindustry.entities.*` × 1
- `mindustry.entities.units.*` × 1
- `mindustry.input.*` × 1
- `mindustry.world.blocks.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/blocks/liquid/ArmoredConduit.java`

- 知识页：[core-src-mindustry-world-blocks-liquid-armoredconduit-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-liquid-armoredconduit-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/liquid/ArmoredConduit.java`
- SHA1：`58a055d4718460544bf9d0e5dc36047e5557128c`
- 声明：class ArmoredConduitextends Conduit, class ArmoredConduitBuildextends ConduitBuild
- 字段线索：未抽取
- 方法线索：blends, acceptLiquid

### `core/src/mindustry/world/blocks/liquid/Conduit.java`

- 知识页：[core-src-mindustry-world-blocks-liquid-conduit-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-liquid-conduit-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/liquid/Conduit.java`
- SHA1：`ddf71c4e466bfdad3d38d4355ba0dd7e14308486`
- 声明：class Conduitextends LiquidBlock implements Autotiler, class ConduitBuildextends LiquidBuild implements ChainedBuilding
- 字段线索：rotatePad, rotateOffsets, timerFlow, botColor, rotateRegions, padCorners
- 方法线索：init, load, drawPlanRegion, getReplacement, blends, handlePlacementLine

### `core/src/mindustry/world/blocks/liquid/LiquidBlock.java`

- 知识页：[core-src-mindustry-world-blocks-liquid-liquidblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-liquid-liquidblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/liquid/LiquidBlock.java`
- SHA1：`01c7104026b8a2dfeaa81f407cc4a49d8e95e56b`
- 声明：class LiquidBlockextends Block, class LiquidBuildextends Building
- 字段线索：未抽取
- 方法线索：icons, draw

### `core/src/mindustry/world/blocks/liquid/LiquidBridge.java`

- 知识页：[core-src-mindustry-world-blocks-liquid-liquidbridge-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-liquid-liquidbridge-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/liquid/LiquidBridge.java`
- SHA1：`f4931d33dd2397f36e99124be269437871053e69`
- 声明：class LiquidBridgeextends ItemBridge, class LiquidBridgeBuildextends ItemBridgeBuild
- 字段线索：未抽取
- 方法线索：updateTransport, doDump

### `core/src/mindustry/world/blocks/liquid/LiquidJunction.java`

- 知识页：[core-src-mindustry-world-blocks-liquid-liquidjunction-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-liquid-liquidjunction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/liquid/LiquidJunction.java`
- SHA1：`3e79cd9892928d88af0c7950bc7884044206574b`
- 声明：class LiquidJunctionextends LiquidBlock, class LiquidJunctionBuildextends Building
- 字段线索：未抽取
- 方法线索：setStats, setBars, icons, draw, getLiquidDestination

### `core/src/mindustry/world/blocks/liquid/LiquidRouter.java`

- 知识页：[core-src-mindustry-world-blocks-liquid-liquidrouter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-liquid-liquidrouter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/liquid/LiquidRouter.java`
- SHA1：`8e3b309f2bea6d9e85a7042b91b813f8d3b7c215`
- 声明：class LiquidRouterextends LiquidBlock, class LiquidRouterBuildextends LiquidBuild
- 字段线索：liquidPadding
- 方法线索：icons, updateTile, draw, acceptLiquid


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
