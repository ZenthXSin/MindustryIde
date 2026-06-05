# Package `mindustry.world.consumers` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.consumers`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.consumers`
- 文件数：24

## 主要依赖线索

- `mindustry.type.*` × 17
- `mindustry.gen.*` × 16
- `mindustry.world.meta.*` × 15
- `arc.scene.ui.layout.*` × 12
- `mindustry.world.*` × 11
- `arc.func.*` × 10
- `mindustry.ui.*` × 10
- `arc.struct.*` × 6
- `mindustry.*` × 4
- `arc.util.*` × 3
- `arc.*` × 1
- `arc.math.*` × 1
- `mindustry.content.*` × 1
- `mindustry.entities.*` × 1
- `mindustry.game.EventType.*` × 1
- `mindustry.ctype.*` × 1

## 文件逐个分析

### `core/src/mindustry/world/consumers/Consume.java`

- 知识页：[core-src-mindustry-world-consumers-consume-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consume-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/Consume.java`
- SHA1：`a58751bd033a292963aad7366f2add6086c84d9e`
- 声明：class Consume
- 字段线索：optional, booster, update, multiplier
- 方法线索：apply, optional, boost, update, ignore, build

### `core/src/mindustry/world/consumers/ConsumeCoolant.java`

- 知识页：[core-src-mindustry-world-consumers-consumecoolant-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumecoolant-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeCoolant.java`
- SHA1：`4de4e46a74386a0010815bb72383d2130b8568b5`
- 声明：class ConsumeCoolantextends ConsumeLiquidFilter
- 字段线索：maxTemp, allowLiquid
- 方法线索：未抽取

### `core/src/mindustry/world/consumers/ConsumeItemCharged.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemcharged-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemcharged-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemCharged.java`
- SHA1：`3195c23b8ce98a5c57bd50d34dc4e7e14b4b1d6f`
- 声明：class ConsumeItemChargedextends ConsumeItemEfficiency
- 字段线索：minCharge
- 方法线索：itemEfficiencyMultiplier

### `core/src/mindustry/world/consumers/ConsumeItemDynamic.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemdynamic-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemdynamic-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemDynamic.java`
- SHA1：`277138ff36420e52961d0e78a0d198752cb1d607`
- 声明：class ConsumeItemDynamicextends Consume
- 字段线索：items
- 方法线索：apply, build, rebuild, trigger, efficiency

### `core/src/mindustry/world/consumers/ConsumeItemEfficiency.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemefficiency-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemefficiency-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemEfficiency.java`
- SHA1：`2322a9178af6671d4cfd0f5c8ab232512926bf40`
- 声明：class ConsumeItemEfficiencyextends ConsumeItemFilter
- 字段线索：itemDurationMultipliers
- 方法线索：display

### `core/src/mindustry/world/consumers/ConsumeItemExplode.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemexplode-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemexplode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemExplode.java`
- SHA1：`c31bb5cf2a01146710af03989cf6e8f3ea9f6546`
- 声明：class ConsumeItemExplodeextends ConsumeItemFilter
- 字段线索：damage, baseChance, explodeEffect
- 方法线索：update, build, trigger, display, apply, efficiency

### `core/src/mindustry/world/consumers/ConsumeItemExplosive.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemexplosive-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemexplosive-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemExplosive.java`
- SHA1：`bd19635d482033dc182282e805bee581246b5aa6`
- 声明：class ConsumeItemExplosiveextends ConsumeItemEfficiency
- 字段线索：minExplosiveness
- 方法线索：itemEfficiencyMultiplier

### `core/src/mindustry/world/consumers/ConsumeItemFilter.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemFilter.java`
- SHA1：`a1bc49e422e174d8181b34c14e76c9556392012b`
- 声明：class ConsumeItemFilterextends Consume
- 字段线索：filter
- 方法线索：apply, build, update, trigger, efficiency, display

### `core/src/mindustry/world/consumers/ConsumeItemFlammable.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemflammable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemflammable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemFlammable.java`
- SHA1：`2b62c9c68273cba3e1300c0653b374c98cc308d9`
- 声明：class ConsumeItemFlammableextends ConsumeItemEfficiency
- 字段线索：minFlammability
- 方法线索：itemEfficiencyMultiplier

### `core/src/mindustry/world/consumers/ConsumeItemList.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemlist-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemlist-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemList.java`
- SHA1：`d2f9c9d94834935e99dff18546e8bdbbaa3e564f`
- 声明：class ConsumeItemListextends ConsumeItemFilter
- 字段线索：itemMultipliers
- 方法线索：setMultipliers, efficiencyMultiplier

### `core/src/mindustry/world/consumers/ConsumeItemRadioactive.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitemradioactive-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitemradioactive-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItemRadioactive.java`
- SHA1：`1cb1abe26831b0cf857479ffa19fba81247d7a56`
- 声明：class ConsumeItemRadioactiveextends ConsumeItemEfficiency
- 字段线索：minRadioactivity
- 方法线索：itemEfficiencyMultiplier

### `core/src/mindustry/world/consumers/ConsumeItems.java`

- 知识页：[core-src-mindustry-world-consumers-consumeitems-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeitems-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeItems.java`
- SHA1：`8f965c8dcb81e4b3da037e3f2acea1e4d4cfa5d0`
- 声明：class ConsumeItemsextends Consume
- 字段线索：items
- 方法线索：apply, build, trigger, efficiency, display

### `core/src/mindustry/world/consumers/ConsumeLiquid.java`

- 知识页：[core-src-mindustry-world-consumers-consumeliquid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeliquid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeLiquid.java`
- SHA1：`22acc3b1a4831e9d382077889a28ba7346e34251`
- 声明：class ConsumeLiquidextends ConsumeLiquidBase
- 字段线索：liquid
- 方法线索：apply, build, update, efficiency, display, consumes

### `core/src/mindustry/world/consumers/ConsumeLiquidBase.java`

- 知识页：[core-src-mindustry-world-consumers-consumeliquidbase-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeliquidbase-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeLiquidBase.java`
- SHA1：`9995a9d152cf802769376d5afc98e2480432cb3d`
- 声明：class ConsumeLiquidBaseextends Consume
- 字段线索：amount
- 方法线索：apply

### `core/src/mindustry/world/consumers/ConsumeLiquidFilter.java`

- 知识页：[core-src-mindustry-world-consumers-consumeliquidfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeliquidfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeLiquidFilter.java`
- SHA1：`7eb3834cf92ee868ca6b484d410e0037bdccbbe0`
- 声明：class ConsumeLiquidFilterextends ConsumeLiquidBase
- 字段线索：filter
- 方法线索：apply, build, update, efficiency, efficiencyMultiplier, display

### `core/src/mindustry/world/consumers/ConsumeLiquidFlammable.java`

- 知识页：[core-src-mindustry-world-consumers-consumeliquidflammable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeliquidflammable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeLiquidFlammable.java`
- SHA1：`0925600421a745debc649d3e1c7942718a29498f`
- 声明：class ConsumeLiquidFlammableextends ConsumeLiquidFilter
- 字段线索：minFlammability
- 方法线索：display, liquidEfficiencyMultiplier

### `core/src/mindustry/world/consumers/ConsumeLiquids.java`

- 知识页：[core-src-mindustry-world-consumers-consumeliquids-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeliquids-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeLiquids.java`
- SHA1：`82ba56560f8caa951f44bf9a6454d180b068888b`
- 声明：class ConsumeLiquidsextends Consume
- 字段线索：liquids
- 方法线索：apply, build, update, efficiency, display

### `core/src/mindustry/world/consumers/ConsumeLiquidsDynamic.java`

- 知识页：[core-src-mindustry-world-consumers-consumeliquidsdynamic-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumeliquidsdynamic-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumeLiquidsDynamic.java`
- SHA1：`7d4d3690646f3bad6063c1d7cf1b065af1eb4303`
- 声明：class ConsumeLiquidsDynamicextends Consume
- 字段线索：liquids
- 方法线索：apply, build, rebuild, update, efficiency

### `core/src/mindustry/world/consumers/ConsumePayloadDynamic.java`

- 知识页：[core-src-mindustry-world-consumers-consumepayloaddynamic-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumepayloaddynamic-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumePayloadDynamic.java`
- SHA1：`a33cf8c297bcb3894f6a89b3661f00d8223ff28a`
- 声明：class ConsumePayloadDynamicextends Consume
- 字段线索：payloads
- 方法线索：efficiency, trigger, display, build, rebuild

### `core/src/mindustry/world/consumers/ConsumePayloadFilter.java`

- 知识页：[core-src-mindustry-world-consumers-consumepayloadfilter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumepayloadfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumePayloadFilter.java`
- SHA1：`67cd22cda13a4c64cb934c9171335da7c8d54c57`
- 声明：class ConsumePayloadFilterextends Consume
- 字段线索：fitting, filter
- 方法线索：efficiency, trigger, display, build

### `core/src/mindustry/world/consumers/ConsumePayloads.java`

- 知识页：[core-src-mindustry-world-consumers-consumepayloads-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumepayloads-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumePayloads.java`
- SHA1：`886f5c94e47715a858bddf21ded497d86ed8d5eb`
- 声明：class ConsumePayloadsextends Consume
- 字段线索：payloads
- 方法线索：efficiency, trigger, display, build

### `core/src/mindustry/world/consumers/ConsumePower.java`

- 知识页：[core-src-mindustry-world-consumers-consumepower-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumepower-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumePower.java`
- SHA1：`f4b92e9f3a8bcf18888b8f0f621fb70a89502690`
- 声明：class ConsumePowerextends Consume
- 字段线索：usage, capacity, buffered
- 方法线索：apply, ignore, efficiency, display, requestedPower

### `core/src/mindustry/world/consumers/ConsumePowerCondition.java`

- 知识页：[core-src-mindustry-world-consumers-consumepowercondition-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumepowercondition-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumePowerCondition.java`
- SHA1：`95a90e0d596ec49db29d57d004ca7c279331a880`
- 声明：class ConsumePowerConditionextends ConsumePower
- 字段线索：consume
- 方法线索：requestedPower

### `core/src/mindustry/world/consumers/ConsumePowerDynamic.java`

- 知识页：[core-src-mindustry-world-consumers-consumepowerdynamic-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-consumers-consumepowerdynamic-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/consumers/ConsumePowerDynamic.java`
- SHA1：`15a70ba0ca8d9eadeed933e2ba9b628796cd0c58`
- 声明：class ConsumePowerDynamicextends ConsumePower
- 字段线索：usage, displayedPowerUsage
- 方法线索：requestedPower, display


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
