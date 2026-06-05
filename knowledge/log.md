## [2026-05-01] synthesize | Learn Mindustry Mod overview and tutorial relations
## [2026-05-01] update | knowledge index reordered for Learn Mindustry Mod priority
## [2026-05-10] synthesize | Mindustry Environment Block Fields
- Verified the public fields and behavior of `mindustry.world.blocks.environment.Floor`, `OverlayFloor`, `OreBlock`, `TiledFloor`, `TiledWall`, plus the commonly used inherited `Block` fields.
- Added `knowledge/concepts/mindustry-environment-block-fields.md` and indexed it in `knowledge/index.md`.

## [2026-05-10] synthesize | Aegires energy field drawing
- Verified that Aegires in `mindustry.content.UnitTypes` uses `EnergyFieldAbility`, and that `mindustry.entities.abilities.EnergyFieldAbility.draw(Unit)` renders the orb with two filled circles, rotating arcs, and light.
- Added `knowledge/concepts/mindustry-aegires-energy-field.md` and indexed it.

## [2026-05-10] synthesize | Mindustry vanilla glow DrawBlock
- Verified `mindustry.world.draw.DrawGlowRegion` as the canonical vanilla glow DrawBlock and noted its additive blending, layer, and warmup-driven alpha.
- Added `knowledge/concepts/mindustry-vanilla-glow-drawblocks.md` and indexed it.

## [2026-05-10] update | Mindustry vanilla glow DrawBlock
- Refined `knowledge/concepts/mindustry-vanilla-glow-drawblocks.md` with confirmed `Blocks.java` line references for `DrawGlowRegion` usage.
## [2026-05-10] synthesize | Learn Mindustry Mod: Kotlin Developer View

## [2026-05-10] synthesize | Mindustry / Arc full source file index
- Generated file-level source indexes for local Mindustry and Arc repositories with path, size, hash, and declaration summaries.
- Declined duplicating full source text into markdown pages; source of truth remains local repositories with hash-based traceability.

## [2026-05-10] synthesize | Mindustry / Arc per-file knowledge pages
- Generated 1768 per-file knowledge pages under `knowledge/mindustry-source-files/`.
- Each page includes source path, hash, package, declarations, field/method clues, and example Mod sampling evidence was checked first.

## [2026-05-10] synthesize | Mindustry / Arc package-oriented file analysis
- Generated 129 package analysis pages under `knowledge/mindustry-package-analysis/`, covering 1768 source files.
- Each package page groups files by package and lists per-file source path, SHA1, declarations, fields, and method clues.

## [2026-05-10] synthesize | Mindustry source content analysis start
- Started source-content analysis from mindustry.world, arc.struct, and arc.util.serialization, with local source verification.

## [2026-05-10] synthesize | Mindustry source content analysis continuation
- Cross-checked mindustry.world.Block, mindustry.entities.bullet.BulletType, mindustry.type.UnitType, mindustry.core.ContentLoader/ContentParser, and arc.util.serialization.Json.
- Sampled local mod implementations under 源码和示例/mods, including BetaMindy, ProjectUnityPrivate_V8, and MultiCrafterLib.

## [2026-05-10] synthesize | Mindustry content loading chain and hybrid mod pattern
- Extended the analysis page with a third-round synthesis across Tile, Block, ContentParser, BulletType, UnitType, and example mods.
- Added planned concept entries to knowledge index for the content loading chain and hybrid JSON/Java mod pattern.

## [2026-05-10] synthesize | Mindustry Content Loading Chain
- Added a dedicated concept page that summarizes the staged content loading pipeline across `ContentLoader`, `ContentParser`, and `Json`.
- Linked the concept into `knowledge/index.md` and related JSON pages.

## [2026-05-10] synthesize | Mindustry JSON and Java Hybrid Mod Pattern
- Added a dedicated concept page describing the hybrid Java/JSON mod pattern observed in `BetaMindy`, `ProjectUnityPrivate_V8`, and `MultiCrafterLib`.
- Linked the concept into `knowledge/index.md` and related JSON pages.
## [2026-05-10] synthesize | Mindustry BulletType and UnitType Content Pattern
- Expanded the concept page with explicit source evidence from `mindustry.mod.ContentParser`, `mindustry.entities.bullet.BasicBulletType`, `mindustry.type.UnitType`, `mindustry.type.Weapon`, and example mods.
- Clarified that JSON is a front-end for the same runtime content object model, and that units compose weapon behavior through nested public-field objects.

## [2026-05-10] synthesize | Building / GenericCrafter runtime chain
- Cross-checked `mindustry.world.Block`, `mindustry.entities.comp.BuildingComp`, and `mindustry.world.blocks.production.GenericCrafter`.
- Confirmed the runtime chain from static block definition to building module assembly to production tick execution.
- Appended the result to `knowledge/analysis/mindustry-source-content-analysis-start.md` and `knowledge/concepts/mindustry-content-loading-chain.md`.

## [2026-05-10] synthesize | Mindustry Mod lifecycle and parser boundary
- Rechecked `ContentLoader`, `ContentParser`, `BetaMindy`, `ProjectUnityPrivate_V8`, and `MultiCrafterLib`.
- Added `knowledge/concepts/mindustry-mod-lifecycle-parser-boundary.md` and indexed it.
- Extended the source analysis page with lifecycle/parser and GenericCrafter production-loop conclusions.

## [2026-05-10] synthesize | Mindustry Kotlin Mod Structure

## [2026-05-10] synthesize | Mindustry 原版着色器渲染实现路线
## [2026-05-11] synthesize | Mindustry 原版着色器渲染从零复刻路线
- Verified `mindustry.core.Renderer`, `mindustry.graphics.Shaders`, and `mindustry.graphics.Layer` as the source of truth for vanilla rendering order, framebuffer capture/blit, and shader uniforms.
- Added `knowledge/concepts/mindustry-vanilla-shader-rendering-from-zero.md` and indexed it in `knowledge/index.md`.

## [2026-05-11] synthesize | VoidShield shader linking error: `v_texCoords` missing from vertex output

## [2026-05-11] synthesize | Tianlu Mod 科技树问题分析

- 2026-05-14: 新增 [VoidShield VSBlocks 建筑配置总览](analysis/voidshield-vsblocks-building-configs.md)，汇总 `VSBlocks` 里全部建筑的非动画配置字段与基类默认值。

## [2026-05-14] synthesize | VoidShield VSBlocks 数值平衡方案
