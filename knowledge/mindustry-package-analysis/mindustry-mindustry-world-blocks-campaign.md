# Package `mindustry.world.blocks.campaign` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.campaign`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.campaign`
- 文件数：3

## 主要依赖线索

- `arc.*` × 3
- `arc.Graphics.*` × 3
- `arc.Graphics.Cursor.*` × 3
- `arc.audio.*` × 3
- `arc.graphics.*` × 3
- `arc.graphics.g2d.*` × 3
- `arc.math.*` × 3
- `arc.scene.ui.layout.*` × 3
- `arc.struct.*` × 3
- `arc.util.*` × 3
- `arc.util.io.*` × 3
- `mindustry.annotations.Annotations.*` × 3
- `mindustry.content.*` × 3
- `mindustry.entities.*` × 2
- `mindustry.game.EventType.*` × 2
- `mindustry.gen.*` × 2
- `mindustry.graphics.*` × 2
- `arc.scene.actions.*` × 1
- `arc.scene.event.*` × 1
- `arc.scene.ui.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/blocks/campaign/Accelerator.java`

- 知识页：[core-src-mindustry-world-blocks-campaign-accelerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-campaign-accelerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/campaign/Accelerator.java`
- SHA1：`74806dccd1cb73ef61f5709ca33803a2aba5c654`
- 声明：class Acceleratorextends Block, class AcceleratorBuildextends Building implements LaunchAnimator
- 字段线索：launchBlock, powerBufferRequirement, launchCandidates, lightningSound, lightningSoundVolume, chargeSound
- 方法线索：init, setBars, outputsItems, updateTile, progress, isCoreBuilt

### `core/src/mindustry/world/blocks/campaign/LandingPad.java`

- 知识页：[core-src-mindustry-world-blocks-campaign-landingpad-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-campaign-landingpad-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/campaign/LandingPad.java`
- SHA1：`1ccf82d0dd8f0f084ac77eb6cf78d869a653281f`
- 声明：class LandingPadextends Block, class LandingPadBuildextends Building
- 字段线索：waiting, lastUpdateId, arrivalDuration, cooldownTime, consumeLiquidAmount, consumeLiquid
- 方法线索：init, build, efficiency, display, setBars, setStats

### `core/src/mindustry/world/blocks/campaign/LaunchPad.java`

- 知识页：[core-src-mindustry-world-blocks-campaign-launchpad-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-campaign-launchpad-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/campaign/LaunchPad.java`
- SHA1：`f951fc00cca7fc6353622a5c1f51aa5855144d2c`
- 声明：class LaunchPadextends Block, class LaunchPadBuildextends Building, class LaunchPayloadCompimplements Drawc, Timedc, Teamc
- 字段线索：launchTime, launchSoundPitchRand, launchSound, lightColor, acceptMultipleItems, lightStep
- 方法线索：setStats, setBars, outputsItems, icons, getCursor, shouldConsume


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
