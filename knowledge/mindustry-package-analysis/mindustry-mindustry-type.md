# Package `mindustry.type` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.type`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.type`
- 文件数：20

## 主要依赖线索

- `arc.struct.*` × 15
- `arc.util.*` × 11
- `mindustry.content.*` × 11
- `mindustry.ctype.*` × 10
- `arc.graphics.*` × 9
- `arc.math.*` × 9
- `arc.*` × 8
- `mindustry.*` × 8
- `arc.graphics.g2d.*` × 7
- `mindustry.gen.*` × 7
- `arc.func.*` × 7
- `arc.math.geom.*` × 6
- `mindustry.graphics.*` × 6
- `mindustry.entities.*` × 4
- `arc.audio.*` × 4
- `mindustry.game.*` × 4
- `mindustry.world.*` × 3
- `mindustry.world.meta.*` × 3
- `arc.scene.ui.layout.*` × 3
- `mindustry.annotations.Annotations.*` × 3

## 文件逐个分析

### `core/src/mindustry/type/Category.java`

- 知识页：[core-src-mindustry-type-category-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-category-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Category.java`
- SHA1：`736281dcdbde1d8d56b5d492e238ea81fbf518e1`
- 声明：enum Category
- 字段线索：all
- 方法线索：prev, next

### `core/src/mindustry/type/CellLiquid.java`

- 知识页：[core-src-mindustry-type-cellliquid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-cellliquid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/CellLiquid.java`
- SHA1：`c09ff7c6502711fa40b4144853d4ede092d8ebae`
- 声明：class CellLiquidextends Liquid
- 字段线索：colorFrom, cells, spreadTarget, maxSpread
- 方法线索：update, react, drawPuddle

### `core/src/mindustry/type/ErrorContent.java`

- 知识页：[core-src-mindustry-type-errorcontent-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-errorcontent-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/ErrorContent.java`
- SHA1：`16f1c07c859bcce96faff042724cfe2342014156`
- 声明：class ErrorContentextends Content
- 字段线索：未抽取
- 方法线索：getContentType

### `core/src/mindustry/type/Item.java`

- 知识页：[core-src-mindustry-type-item-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-item-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Item.java`
- SHA1：`d8930dc2789c11d68b0b7650862b77515e9153fd`
- 声明：class Itemextends UnlockableContent implements Senseable
- 字段线索：color, explosiveness, flammability, radioactivity, charge, hardness
- 方法线索：isOnPlanet, isHidden, loadIcon, setStats, toString, getContentType

### `core/src/mindustry/type/ItemSeq.java`

- 知识页：[core-src-mindustry-type-itemseq-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-itemseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/ItemSeq.java`
- SHA1：`880cd74520b84243fef5320116bb17194c6f6a46`
- 声明：class ItemSeqimplements Iterable<ItemStack>, JsonSerializable
- 字段线索：values, total
- 方法线索：checkNegative, copy, each, clear, toSeq, toArray

### `core/src/mindustry/type/ItemStack.java`

- 知识页：[core-src-mindustry-type-itemstack-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-itemstack-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/ItemStack.java`
- SHA1：`cda37725cb88bb29dcc3275cff9ab158b385e479`
- 声明：class ItemStackimplements Comparable<ItemStack>
- 字段线索：empty, item, amount
- 方法线索：set, copy, ItemStack, equals, compareTo, toString

### `core/src/mindustry/type/Liquid.java`

- 知识页：[core-src-mindustry-type-liquid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-liquid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Liquid.java`
- SHA1：`73859371a7341fff33080252dd0114225dd0f620`
- 声明：class Liquidextends UnlockableContent implements Senseable
- 字段线索：animationFrames, animationScaleGas, rand, gas, color, gasColor
- 方法线索：init, isHidden, getAnimationFrame, willBoil, canExtinguish, barColor

### `core/src/mindustry/type/LiquidStack.java`

- 知识页：[core-src-mindustry-type-liquidstack-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-liquidstack-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/LiquidStack.java`
- SHA1：`bb0ce2b8a92f3dd2b4ff814c7ab6f8254f9d5ffb`
- 声明：class LiquidStackimplements Comparable<LiquidStack>
- 字段线索：empty, liquid, amount
- 方法线索：set, copy, LiquidStack, equals, compareTo, toString

### `core/src/mindustry/type/MapLocales.java`

- 知识页：[core-src-mindustry-type-maplocales-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-maplocales-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/MapLocales.java`
- SHA1：`94ba280c625557cc7fa0cf3ae4c20561a03c5a39`
- 声明：class MapLocalesextends ObjectMap<String, StringMap> implements JsonSerializable
- 字段线索：未抽取
- 方法线索：write, read, copy, getProperty, containsProperty, getFormatted

### `core/src/mindustry/type/PayloadSeq.java`

- 知识页：[core-src-mindustry-type-payloadseq-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-payloadseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/PayloadSeq.java`
- SHA1：`8a1f22413af358b9cfb8cef251f349abeca90e86`
- 声明：class PayloadSeq
- 字段线索：payloads, total
- 方法线索：isEmpty, any, total, add, remove, removeAll

### `core/src/mindustry/type/PayloadStack.java`

- 知识页：[core-src-mindustry-type-payloadstack-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-payloadstack-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/PayloadStack.java`
- SHA1：`3846718f9046f829f592c36d0456314e7c680c2a`
- 声明：class PayloadStackimplements Comparable<PayloadStack>
- 字段线索：item, amount
- 方法线索：compareTo, equals, toString

### `core/src/mindustry/type/Planet.java`

- 知识页：[core-src-mindustry-type-planet-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-planet-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Planet.java`
- SHA1：`de7757ad59addb65b72099e2be9d9ba8892331e7`
- 声明：class Planetextends UnlockableContent, class PlanetData
- 字段线索：intersectResult, mat, points, tmpNormal, mesh, cloudMesh
- 方法线索：saveRules, loadRules, stats, loadStats, saveStats, clearStats

### `core/src/mindustry/type/Publishable.java`

- 知识页：[core-src-mindustry-type-publishable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-publishable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Publishable.java`
- SHA1：`2be8a4793a6ebd958601c1e5a6541ac79a090dbe`
- 声明：interface Publishable
- 字段线索：未抽取
- 方法线索：getSteamID, steamDescription, extraTags, hasSteamID, prePublish

### `core/src/mindustry/type/Sector.java`

- 知识页：[core-src-mindustry-type-sector-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-sector-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Sector.java`
- SHA1：`05b5db15d9488373bedffb2513fc6b4000186cea`
- 声明：class Sector, class SectorRect
- 字段线索：tmpSeq1, rect, plane, planet, tile, id
- 方法线索：near, isNear, displayThreat, unlocked, allowLaunchSchematics, allowLaunchLoadout

### `core/src/mindustry/type/SectorPreset.java`

- 知识页：[core-src-mindustry-type-sectorpreset-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-sectorpreset-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/SectorPreset.java`
- SHA1：`cfabd85309e736367d86c9a59d79e08cdbe12b49`
- 声明：class SectorPresetextends UnlockableContent
- 字段线索：generator, planet, sector, captureWave, rules, difficulty
- 方法线索：initialize, init, loadIcon, isHidden, getContentType

### `core/src/mindustry/type/StatusEffect.java`

- 知识页：[core-src-mindustry-type-statuseffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-statuseffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/StatusEffect.java`
- SHA1：`77346032bf39e73a1271737d0a2c3424c29e15c2`
- 声明：class StatusEffectextends UnlockableContent, interface TransitionHandler
- 字段线索：damageMultiplier, healthMultiplier, speedMultiplier, reloadMultiplier, buildSpeedMultiplier, dragMultiplier
- 方法线索：init, isHidden, setStats, showUnlock, update, onRemoved

### `core/src/mindustry/type/TeamEntry.java`

- 知识页：[core-src-mindustry-type-teamentry-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-teamentry-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/TeamEntry.java`
- SHA1：`c2f1459f570fecbe101779b774c8ea133575f3c4`
- 声明：class TeamEntryextends UnlockableContent
- 字段线索：team
- 方法线索：displayExtra, getContentType

### `core/src/mindustry/type/UnitType.java`

- 知识页：[core-src-mindustry-type-unittype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-unittype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/UnitType.java`
- SHA1：`8583a068a90dd4f02d7970441ba76e95806e1523`
- 声明：class UnitTypeextends UnlockableContent implements Senseable, class UnitEngineimplements Cloneable
- 字段线索：shadowTX, legOffset, tmpStances, envRequired, envEnabled, envDisabled
- 方法线索：postInit, createController, create, spawn, hasWeapons, targetable

### `core/src/mindustry/type/Weapon.java`

- 知识页：[core-src-mindustry-type-weapon-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weapon-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Weapon.java`
- SHA1：`4499ce19fc86f5c61e92c8a8731fe489d726e033`
- 声明：class Weaponimplements Cloneable
- 字段线索：name, bullet, ejectEffect, display, mirror, flipSprite
- 方法线索：hasStats, addStats, dps, shotsPerSec, drawOutline, draw

### `core/src/mindustry/type/Weather.java`

- 知识页：[core-src-mindustry-type-weather-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weather-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/Weather.java`
- SHA1：`3f955ffabf49add0b7c39497f880325cdaaa3f47`
- 声明：class Weatherextends UnlockableContent, class WeatherEntry, class WeatherStateCompimplements Drawc, Syncc
- 字段线索：rand, boundMax, duration, opacityMultiplier, attrs, sound
- 方法线索：create, instance, isActive, remove, update, updateEffect


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
