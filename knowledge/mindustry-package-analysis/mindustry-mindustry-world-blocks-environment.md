# Package `mindustry.world.blocks.environment` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.environment`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.environment`
- 文件数：25

## 主要依赖线索

- `mindustry.world.*` × 25
- `arc.graphics.g2d.*` × 23
- `arc.util.*` × 16
- `arc.math.*` × 13
- `mindustry.gen.*` × 11
- `arc.*` × 9
- `mindustry.annotations.Annotations.*` × 9
- `mindustry.graphics.*` × 9
- `arc.graphics.*` × 8
- `mindustry.content.*` × 7
- `mindustry.entities.units.*` × 6
- `arc.scene.ui.layout.*` × 4
- `mindustry.*` × 4
- `arc.math.geom.*` × 4
- `mindustry.world.blocks.*` × 3
- `mindustry.graphics.MultiPacker.*` × 3
- `mindustry.game.*` × 3
- `arc.struct.*` × 2
- `mindustry.entities.*` × 2
- `mindustry.type.*` × 2

## 文件逐个分析

### `core/src/mindustry/world/blocks/environment/AirBlock.java`

- 知识页：[core-src-mindustry-world-blocks-environment-airblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-airblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/AirBlock.java`
- SHA1：`87c0c4b41057fc8573736342ea9a1ac2af71527a`
- 声明：class AirBlockextends Floor
- 字段线索：未抽取
- 方法线索：drawBase, load, init, isHidden, variantRegions

### `core/src/mindustry/world/blocks/environment/CharacterOverlay.java`

- 知识页：[core-src-mindustry-world-blocks-environment-characteroverlay-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-characteroverlay-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/CharacterOverlay.java`
- SHA1：`e901078b7ec92e703a3cbfc285a82209e4611b1d`
- 声明：class CharacterOverlayextends OverlayFloor, class CharOverlayDataStruct
- 字段线索：chars, color
- 方法线索：drawBase, getConfig, drawPlanRegion, onPicked, buildEditorConfig, placeEnded

### `core/src/mindustry/world/blocks/environment/Cliff.java`

- 知识页：[core-src-mindustry-world-blocks-environment-cliff-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-cliff-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/Cliff.java`
- SHA1：`981b8bf623eb50e9b720db9de4dc8abce0936475`
- 声明：class Cliffextends Block
- 字段线索：size
- 方法线索：drawBase, minimapColor

### `core/src/mindustry/world/blocks/environment/ColoredFloor.java`

- 知识页：[core-src-mindustry-world-blocks-environment-coloredfloor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-coloredfloor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/ColoredFloor.java`
- SHA1：`e0d3105c72ba29fced8d6f1f0dacbf73792daa70`
- 声明：class ColoredFloorextends Floor
- 字段线索：flagIgnoreDifferentColor, flagSmoothBlend, verts, defaultColor, defaultColorRgba
- 方法线索：init, buildEditorConfig, getConfig, drawBase, sample, drawOverlay

### `core/src/mindustry/world/blocks/environment/ColoredWall.java`

- 知识页：[core-src-mindustry-world-blocks-environment-coloredwall-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-coloredwall-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/ColoredWall.java`
- SHA1：`d377e5c7209fe17c9a1c5b9f3cbb26890ff45aab`
- 声明：class ColoredWallextends StaticWall
- 字段线索：flagIgnoreDifferentColor, flagApplyDarkness, defaultColor, defaultColorRgba
- 方法线索：init, getConfig, buildEditorConfig, drawBase, blockChanged, placeEnded

### `core/src/mindustry/world/blocks/environment/EmptyFloor.java`

- 知识页：[core-src-mindustry-world-blocks-environment-emptyfloor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-emptyfloor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/EmptyFloor.java`
- SHA1：`425244a525d1921f60adb3707eff39ddd94878ca`
- 声明：class EmptyFloorextends Floor
- 字段线索：未抽取
- 方法线索：drawBase

### `core/src/mindustry/world/blocks/environment/Floor.java`

- 知识页：[core-src-mindustry-world-blocks-environment-floor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-floor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/Floor.java`
- SHA1：`cfde6fdfab9dad2c8fc9e428a915b179d613df4a`
- 声明：class Floorextends Block, class UpdateRenderState
- 字段线索：edge, speedMultiplier, dragMultiplier, damageTaken, drownTime, walkEffect
- 方法线索：load, init, getDisplayIcon, getDisplayName, createIcons, drawBase

### `core/src/mindustry/world/blocks/environment/OreBlock.java`

- 知识页：[core-src-mindustry-world-blocks-environment-oreblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-oreblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/OreBlock.java`
- SHA1：`ac50dd57d7afa47bdda5fd2226af483d20ca6679`
- 声明：class OreBlockextends OverlayFloor
- 字段线索：未抽取
- 方法线索：setup, createIcons, init, IllegalArgumentException, getDisplayName

### `core/src/mindustry/world/blocks/environment/OverlayFloor.java`

- 知识页：[core-src-mindustry-world-blocks-environment-overlayfloor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-overlayfloor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/OverlayFloor.java`
- SHA1：`a69baad4d7ba262af67d6b1011bc5dc5c5b77cf0`
- 声明：class OverlayFloorextends Floor
- 字段线索：未抽取
- 方法线索：canPlaceOn, drawBase

### `core/src/mindustry/world/blocks/environment/Prop.java`

- 知识页：[core-src-mindustry-world-blocks-environment-prop-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-prop-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/Prop.java`
- SHA1：`6e33203c7475895d385595bf4401c9cb955acc48`
- 声明：class Propextends Block
- 字段线索：layer
- 方法线索：drawBase, icons

### `core/src/mindustry/world/blocks/environment/RemoveOre.java`

- 知识页：[core-src-mindustry-world-blocks-environment-removeore-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-removeore-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/RemoveOre.java`
- SHA1：`1b3373ffeee8a2771449e109a71b84dfedfdfb66`
- 声明：class RemoveOreextends OverlayFloor
- 字段线索：未抽取
- 方法线索：drawPlan, canPlaceOn, canReplace, placeEnded

### `core/src/mindustry/world/blocks/environment/RemoveWall.java`

- 知识页：[core-src-mindustry-world-blocks-environment-removewall-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-removewall-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/RemoveWall.java`
- SHA1：`98b31f36e37a711850b0eb638c2076c4cc7c9f95`
- 声明：class RemoveWallextends Block
- 字段线索：未抽取
- 方法线索：drawPlan, canPlaceOn, canReplace, placeEnded

### `core/src/mindustry/world/blocks/environment/RuneOverlay.java`

- 知识页：[core-src-mindustry-world-blocks-environment-runeoverlay-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-runeoverlay-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/RuneOverlay.java`
- SHA1：`ab13ff6d55fa91f96cf5d942b53bec0faa6e7c95`
- 声明：class RuneOverlayextends OverlayFloor
- 字段线索：characters, unicodeOffset, color
- 方法线索：drawBase, getConfig, drawPlanRegion, onPicked, buildEditorConfig, placeEnded

### `core/src/mindustry/world/blocks/environment/SeaBush.java`

- 知识页：[core-src-mindustry-world-blocks-environment-seabush-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-seabush-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/SeaBush.java`
- SHA1：`67e2f26a575d04ea06542ef68c57c9e5b601559e`
- 声明：class SeaBushextends Prop
- 字段线索：lobesMin, botAngle, sclMin, rand
- 方法线索：drawBase

### `core/src/mindustry/world/blocks/environment/Seaweed.java`

- 知识页：[core-src-mindustry-world-blocks-environment-seaweed-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-seaweed-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/Seaweed.java`
- SHA1：`660da1450b7863a7aeb4d255e955a9bc0a93aa98`
- 声明：class Seaweedextends Prop
- 字段线索：未抽取
- 方法线索：drawBase

### `core/src/mindustry/world/blocks/environment/ShallowLiquid.java`

- 知识页：[core-src-mindustry-world-blocks-environment-shallowliquid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-shallowliquid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/ShallowLiquid.java`
- SHA1：`c6955059e190c70fe16116abea3a21bf8ef72194`
- 声明：class ShallowLiquidextends Floor
- 字段线索：floorBase, liquidOpacity
- 方法线索：set, createIcons

### `core/src/mindustry/world/blocks/environment/SpawnBlock.java`

- 知识页：[core-src-mindustry-world-blocks-environment-spawnblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-spawnblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/SpawnBlock.java`
- SHA1：`9ce29be753a423a142c138b7174af29b0f0f3a9e`
- 声明：class SpawnBlockextends OverlayFloor
- 字段线索：未抽取
- 方法线索：drawBase

### `core/src/mindustry/world/blocks/environment/StaticTree.java`

- 知识页：[core-src-mindustry-world-blocks-environment-statictree-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-statictree-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/StaticTree.java`
- SHA1：`273921837933f2c17700a19378b8b4429efde1ad`
- 声明：class StaticTreeextends StaticWall
- 字段线索：未抽取
- 方法线索：drawBase

### `core/src/mindustry/world/blocks/environment/StaticWall.java`

- 知识页：[core-src-mindustry-world-blocks-environment-staticwall-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-staticwall-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/StaticWall.java`
- SHA1：`5820ebfb0ef5ab7e21f6dfed3834ffcef4023561`
- 声明：class StaticWallextends Prop
- 字段线索：split, autotile, autotileMidVariants, autotileMidRegions
- 方法线索：drawBase, variant, checkAutotileSame, load, canReplace

### `core/src/mindustry/world/blocks/environment/SteamVent.java`

- 知识页：[core-src-mindustry-world-blocks-environment-steamvent-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-steamvent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/SteamVent.java`
- SHA1：`5dbc25da6aa775b4ef2aa642e9e9a6bfc98a1329`
- 声明：class SteamVentextends Floor
- 字段线索：offsets, parent, effect, effectColor, effectSpacing
- 方法线索：drawMain, updateRender, shouldIndex, isCenterVent, renderUpdate, checkAdjacent

### `core/src/mindustry/world/blocks/environment/TallBlock.java`

- 知识页：[core-src-mindustry-world-blocks-environment-tallblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-tallblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/TallBlock.java`
- SHA1：`97800b983a632453359e5f1cc79b08230d534b94`
- 声明：class TallBlockextends Block
- 字段线索：shadowOffset, layer, shadowLayer, rotationRand, shadowAlpha
- 方法线索：init, drawBase, drawShadow, icons

### `core/src/mindustry/world/blocks/environment/TiledFloor.java`

- 知识页：[core-src-mindustry-world-blocks-environment-tiledfloor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-tiledfloor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/TiledFloor.java`
- SHA1：`39e9809b42ca0230501b5984b42262deb4795f8e`
- 声明：class TiledFloorextends Floor, class TiledStateStruct
- 字段线索：sizedRegions, maxSize
- 方法线索：load, floorChanged, drawMain

### `core/src/mindustry/world/blocks/environment/TiledWall.java`

- 知识页：[core-src-mindustry-world-blocks-environment-tiledwall-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-tiledwall-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/TiledWall.java`
- SHA1：`d62c9b595458e0a337fc97fe700aaa618f5b9be7`
- 声明：class TiledWallextends StaticWall
- 字段线索：sizedRegions, maxSize
- 方法线索：load, blockChanged, drawBase

### `core/src/mindustry/world/blocks/environment/TreeBlock.java`

- 知识页：[core-src-mindustry-world-blocks-environment-treeblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-treeblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/TreeBlock.java`
- SHA1：`43fdcf571f5e7fb05123f8a05b2f0a80b7175f25`
- 声明：class TreeBlockextends Block
- 字段线索：shadowOffset
- 方法线索：drawBase, drawShadow

### `core/src/mindustry/world/blocks/environment/WobbleProp.java`

- 知识页：[core-src-mindustry-world-blocks-environment-wobbleprop-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-environment-wobbleprop-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/WobbleProp.java`
- SHA1：`809ca057e081f27ef64c0ab459d68c500bb389f0`
- 声明：class WobblePropextends Prop
- 字段线索：wscl
- 方法线索：drawBase


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
