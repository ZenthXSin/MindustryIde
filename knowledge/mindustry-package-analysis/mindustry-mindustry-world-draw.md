# Package `mindustry.world.draw` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.draw`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.draw`
- 文件数：36

## 主要依赖线索

- `mindustry.gen.*` × 36
- `arc.graphics.g2d.*` × 35
- `mindustry.world.*` × 28
- `arc.*` × 25
- `arc.util.*` × 24
- `arc.graphics.*` × 21
- `arc.math.*` × 21
- `mindustry.graphics.*` × 16
- `mindustry.entities.units.*` × 13
- `arc.struct.*` × 4
- `arc.math.Interp.*` × 3
- `mindustry.type.*` × 3
- `mindustry.world.blocks.production.*` × 2
- `mindustry.entities.part.*` × 2
- `mindustry.world.blocks.heat.*` × 2
- `mindustry.world.blocks.production.HeatCrafter.*` × 1
- `mindustry.world.blocks.liquid.*` × 1
- `arc.math.geom.*` × 1
- `mindustry.world.blocks.production.Pump.*` × 1
- `mindustry.world.blocks.defense.turrets.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/draw/DrawArcSmelt.java`

- 知识页：[core-src-mindustry-world-draw-drawarcsmelt-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawarcsmelt-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawArcSmelt.java`
- SHA1：`446c3877a956b086299481fa97aec8f911773c3f`
- 声明：class DrawArcSmeltextends DrawBlock
- 字段线索：flameColor, flameRad, x, alpha, particles, particleLife
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawBlock.java`

- 知识页：[core-src-mindustry-world-draw-drawblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawBlock.java`
- SHA1：`067b59bc18237d97b4943c61029a409303b089fb`
- 声明：class DrawBlock
- 字段线索：rand, iconOverride
- 方法线索：getRegionsToOutline, draw, drawLight, drawPlan, load, icons

### `core/src/mindustry/world/draw/DrawBlockParts.java`

- 知识页：[core-src-mindustry-world-draw-drawblockparts-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawblockparts-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawBlockParts.java`
- SHA1：`0a1d839e3109a484e36520d9254000cbaaf5de3a`
- 声明：class DrawBlockPartsextends DrawBlock
- 字段线索：parts, preview
- 方法线索：getRegionsToOutline, drawPlan, draw, load, icons

### `core/src/mindustry/world/draw/DrawBlurSpin.java`

- 知识页：[core-src-mindustry-world-draw-drawblurspin-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawblurspin-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawBlurSpin.java`
- SHA1：`b7362378158dc4f95c8f822b0b3784c1134f61da`
- 声明：class DrawBlurSpinextends DrawBlock
- 字段线索：blurRegion, suffix, rotateSpeed
- 方法线索：draw, icons, load

### `core/src/mindustry/world/draw/DrawBubbles.java`

- 知识页：[core-src-mindustry-world-draw-drawbubbles-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawbubbles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawBubbles.java`
- SHA1：`a4bd1401d9a666b0caabba00aa89999c46e8865f`
- 声明：class DrawBubblesextends DrawBlock
- 字段线索：color, amount, strokeMin, recurrence, fill
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawCells.java`

- 知识页：[core-src-mindustry-world-draw-drawcells-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawcells-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawCells.java`
- SHA1：`98c88b49cb7b6f457bdf7d000628878682f944ba`
- 声明：class DrawCellsextends DrawBlock
- 字段线索：middle, color, particles, range
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawCircles.java`

- 知识页：[core-src-mindustry-world-draw-drawcircles-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawcircles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawCircles.java`
- SHA1：`034e59f56dfe5116251aa28e02845555539341c6`
- 声明：class DrawCirclesextends DrawBlock
- 字段线索：color, amount, strokeMin, radius, strokeInterp
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawCrucibleFlame.java`

- 知识页：[core-src-mindustry-world-draw-drawcrucibleflame-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawcrucibleflame-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawCrucibleFlame.java`
- SHA1：`ad39e414c5aee53a230f0dd364b5c0213b7ab133`
- 声明：class DrawCrucibleFlameextends DrawBlock
- 字段线索：flameColor, flameRad, alpha, particles, particleLife, particleInterp
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawCultivator.java`

- 知识页：[core-src-mindustry-world-draw-drawcultivator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawcultivator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawCultivator.java`
- SHA1：`87af80f891d6793a94be9112bac5d67715294e40`
- 声明：class DrawCultivatorextends DrawBlock
- 字段线索：plantColor, plantColorLight, bottomColor, bubbles, strokeMin, recurrence
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawDefault.java`

- 知识页：[core-src-mindustry-world-draw-drawdefault-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawdefault-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawDefault.java`
- SHA1：`363955eebef792756bc37f1e804731f9eb22d975`
- 声明：class DrawDefaultextends DrawBlock
- 字段线索：未抽取
- 方法线索：draw, drawPlan, icons

### `core/src/mindustry/world/draw/DrawFade.java`

- 知识页：[core-src-mindustry-world-draw-drawfade-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawfade-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawFade.java`
- SHA1：`e5a7365dee494ee6845ef2a9892a5ae33015ec26`
- 声明：class DrawFadeextends DrawBlock
- 字段线索：suffix, alpha, region
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawFlame.java`

- 知识页：[core-src-mindustry-world-draw-drawflame-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawflame-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawFlame.java`
- SHA1：`ecba1f0e30159868ef5bb167f7022eda272fffc5`
- 声明：class DrawFlameextends DrawBlock
- 字段线索：flameColor, top, lightRadius, flameRadius, flameX
- 方法线索：load, draw, drawLight

### `core/src/mindustry/world/draw/DrawFrames.java`

- 知识页：[core-src-mindustry-world-draw-drawframes-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawframes-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawFrames.java`
- SHA1：`f8af9cbff7fc41bb38465b0a887454bf0bb07a5a`
- 声明：class DrawFramesextends DrawBlock
- 字段线索：frames, interval, sine, regions
- 方法线索：draw, icons, load

### `core/src/mindustry/world/draw/DrawGlowRegion.java`

- 知识页：[core-src-mindustry-world-draw-drawglowregion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawglowregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawGlowRegion.java`
- SHA1：`38844615a2f3fd7fffdc3302e00352d478d4a3ee`
- 声明：class DrawGlowRegionextends DrawBlock
- 字段线索：blending, suffix, alpha, rotateSpeed, layer, rotate
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawHeatInput.java`

- 知识页：[core-src-mindustry-world-draw-drawheatinput-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawheatinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawHeatInput.java`
- SHA1：`4aa3fe6d13b8c9ef539a7c5ea5b3525df69e37bc`
- 声明：class DrawHeatInputextends DrawBlock
- 字段线索：suffix, heatColor, heatPulse, heat
- 方法线索：drawPlan, draw, load

### `core/src/mindustry/world/draw/DrawHeatOutput.java`

- 知识页：[core-src-mindustry-world-draw-drawheatoutput-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawheatoutput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawHeatOutput.java`
- SHA1：`d423dfbaf7ed81e539323fc70226d99f4afbef68`
- 声明：class DrawHeatOutputextends DrawBlock
- 字段线索：top2, heatColor, heatPulse, rotOffset, drawGlow
- 方法线索：draw, drawPlan, load

### `core/src/mindustry/world/draw/DrawHeatRegion.java`

- 知识页：[core-src-mindustry-world-draw-drawheatregion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawheatregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawHeatRegion.java`
- SHA1：`88da1db725139bd48eaf253776993cc9199c3560`
- 声明：class DrawHeatRegionextends DrawBlock
- 字段线索：color, pulse, layer, heat, suffix
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawLiquidOutputs.java`

- 知识页：[core-src-mindustry-world-draw-drawliquidoutputs-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawliquidoutputs-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawLiquidOutputs.java`
- SHA1：`dfd9e6cfd0d640ccc0be0919f7d3ea2702a8faf7`
- 声明：class DrawLiquidOutputsextends DrawBlock
- 字段线索：liquidOutputRegions
- 方法线索：draw, drawPlan, load

### `core/src/mindustry/world/draw/DrawLiquidRegion.java`

- 知识页：[core-src-mindustry-world-draw-drawliquidregion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawliquidregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawLiquidRegion.java`
- SHA1：`639b3c0dfa476c6ee95fee828a4659791a3627d2`
- 声明：class DrawLiquidRegionextends DrawBlock
- 字段线索：drawLiquid, liquid, suffix, alpha
- 方法线索：draw, load, RuntimeException

### `core/src/mindustry/world/draw/DrawLiquidTile.java`

- 知识页：[core-src-mindustry-world-draw-drawliquidtile-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawliquidtile-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawLiquidTile.java`
- SHA1：`843d81c93fa0afc2d947772867a3734a452c1fe6`
- 声明：class DrawLiquidTileextends DrawBlock
- 字段线索：drawLiquid, padding, padLeft, alpha
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawMulti.java`

- 知识页：[core-src-mindustry-world-draw-drawmulti-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawmulti-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawMulti.java`
- SHA1：`83ffdcf4abb01d9ca2b51df761238378e937e7f3`
- 声明：class DrawMultiextends DrawBlock
- 字段线索：drawers
- 方法线索：getRegionsToOutline, draw, drawPlan, drawLight, load, icons

### `core/src/mindustry/world/draw/DrawMultiWeave.java`

- 知识页：[core-src-mindustry-world-draw-drawmultiweave-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawmultiweave-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawMultiWeave.java`
- SHA1：`69491b9839c8499d5cf796a57ef27dda972c26bf`
- 声明：class DrawMultiWeaveextends DrawBlock
- 字段线索：glow, rotateSpeed, fadeWeave, glowColor, pulse
- 方法线索：draw, icons, load

### `core/src/mindustry/world/draw/DrawParticles.java`

- 知识页：[core-src-mindustry-world-draw-drawparticles-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawparticles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawParticles.java`
- SHA1：`ec9beea9fa5453e26758f2159f1fde3b041f027d`
- 声明：class DrawParticlesextends DrawBlock
- 字段线索：color, sides, x, alpha, particles, particleRotation
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawPistons.java`

- 知识页：[core-src-mindustry-world-draw-drawpistons-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawpistons-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawPistons.java`
- SHA1：`98826c889c7b214fde95a19d5543b41dcf3a94cf`
- 声明：class DrawPistonsextends DrawBlock
- 字段线索：sinMag, sides, suffix, iconRegion
- 方法线索：drawPlan, draw, load, icons

### `core/src/mindustry/world/draw/DrawPlasma.java`

- 知识页：[core-src-mindustry-world-draw-drawplasma-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawplasma-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawPlasma.java`
- SHA1：`f8a88f57780f884a4889566243e1baad9b6d7e07`
- 声明：class DrawPlasmaextends DrawFlame
- 字段线索：y, regions, suffix, plasmas, plasma1
- 方法线索：load, drawLight, draw

### `core/src/mindustry/world/draw/DrawPower.java`

- 知识页：[core-src-mindustry-world-draw-drawpower-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawpower-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawPower.java`
- SHA1：`78816766324afb337dd8725213ef3ce67717a2fb`
- 声明：class DrawPowerextends DrawBlock
- 字段线索：fullRegion, suffix, drawPlan, mixcol, emptyLightColor, fullLightColor
- 方法线索：draw, drawPlan, icons, load

### `core/src/mindustry/world/draw/DrawPulseShape.java`

- 知识页：[core-src-mindustry-world-draw-drawpulseshape-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawpulseshape-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawPulseShape.java`
- SHA1：`04f065475001a93afa23ae7f8d3c6bffddad433a`
- 声明：class DrawPulseShapeextends DrawBlock
- 字段线索：color, stroke, radiusScl, layer, square
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawPumpLiquid.java`

- 知识页：[core-src-mindustry-world-draw-drawpumpliquid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawpumpliquid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawPumpLiquid.java`
- SHA1：`67f720b998a268d9a88871422e0e5d1ce22f3d87`
- 声明：class DrawPumpLiquidextends DrawBlock
- 字段线索：liquid
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawRegion.java`

- 知识页：[core-src-mindustry-world-draw-drawregion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawRegion.java`
- SHA1：`5643e1c960e3279e0b52d11c69bdb8b91916903b`
- 声明：class DrawRegionextends DrawBlock
- 字段线索：region, suffix, name, color, spinSprite, drawPlan
- 方法线索：draw, drawPlan, icons, load

### `core/src/mindustry/world/draw/DrawShape.java`

- 知识页：[core-src-mindustry-world-draw-drawshape-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawshape-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawShape.java`
- SHA1：`cc903264f50deb186ab83ec9296d5c043404051a`
- 声明：class DrawShapeextends DrawBlock
- 字段线索：color, sides, radius, useWarmupRadius
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawSideRegion.java`

- 知识页：[core-src-mindustry-world-draw-drawsideregion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawsideregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawSideRegion.java`
- SHA1：`d68d900c5e45be46b55b8f2ca113131ba2484685`
- 声明：class DrawSideRegionextends DrawBlock
- 字段线索：top2
- 方法线索：draw, drawPlan, load, icons

### `core/src/mindustry/world/draw/DrawSoftParticles.java`

- 知识页：[core-src-mindustry-world-draw-drawsoftparticles-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawsoftparticles-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawSoftParticles.java`
- SHA1：`cc1946fcaa41c2d03fb9ea5469d774d5f7d42ab0`
- 声明：class DrawSoftParticlesextends DrawBlock
- 字段线索：region, color, x, alpha, particles, particleLife
- 方法线索：draw, load

### `core/src/mindustry/world/draw/DrawSpikes.java`

- 知识页：[core-src-mindustry-world-draw-drawspikes-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawspikes-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawSpikes.java`
- SHA1：`2c211d188015a2d6bbd05b08122e854c84270037`
- 声明：class DrawSpikesextends DrawBlock
- 字段线索：color, amount, stroke, radius
- 方法线索：draw

### `core/src/mindustry/world/draw/DrawTurret.java`

- 知识页：[core-src-mindustry-world-draw-drawturret-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawturret-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawTurret.java`
- SHA1：`2d43bdb4fc8e4c714782779b542ab74b94b2e447`
- 声明：class DrawTurretextends DrawBlock
- 字段线索：rand, parts, basePrefix, liquidDraw, turretLayer, outline
- 方法线索：getRegionsToOutline, drawPlan, draw, drawTurret, drawHeat, load

### `core/src/mindustry/world/draw/DrawWarmupRegion.java`

- 知识页：[core-src-mindustry-world-draw-drawwarmupregion-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawwarmupregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawWarmupRegion.java`
- SHA1：`47f5382ad5c98d554fb0a572a3e548d24686f26e`
- 声明：class DrawWarmupRegionextends DrawBlock
- 字段线索：sinMag, color, region
- 方法线索：drawPlan, draw, load

### `core/src/mindustry/world/draw/DrawWeave.java`

- 知识页：[core-src-mindustry-world-draw-drawweave-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-draw-drawweave-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/draw/DrawWeave.java`
- SHA1：`152ffd22f9d09320c027485248e6aa0ddabccd1c`
- 声明：class DrawWeaveextends DrawBlock
- 字段线索：weave, y
- 方法线索：draw, icons, load


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
