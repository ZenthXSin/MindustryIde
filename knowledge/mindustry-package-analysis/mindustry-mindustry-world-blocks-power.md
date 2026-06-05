# Package `mindustry.world.blocks.power` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.world.blocks.power`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

方块实现包：负责 Block/Building 子类、生产、物流、防御、环境、载荷、电力等游戏世界结构。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.world.blocks.power`
- 文件数：17

## 主要依赖线索

- `arc.math.*` × 15
- `mindustry.world.meta.*` × 14
- `arc.util.*` × 13
- `mindustry.graphics.*` × 12
- `arc.struct.*` × 10
- `mindustry.gen.*` × 10
- `arc.graphics.g2d.*` × 9
- `arc.graphics.*` × 8
- `arc.*` × 8
- `mindustry.ui.*` × 8
- `mindustry.annotations.Annotations.*` × 7
- `mindustry.world.*` × 7
- `mindustry.content.*` × 6
- `arc.util.io.*` × 6
- `mindustry.entities.*` × 5
- `mindustry.entities.units.*` × 4
- `mindustry.world.draw.*` × 4
- `mindustry.type.*` × 4
- `arc.math.geom.*` × 3
- `mindustry.game.*` × 3

## 文件逐个分析

### `core/src/mindustry/world/blocks/power/Battery.java`

- 知识页：[core-src-mindustry-world-blocks-power-battery-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-battery-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/Battery.java`
- SHA1：`d74a9751c544a9f873fe67b896365c5fc28be812`
- 声明：class Batteryextends PowerDistributor, class BatteryBuildextends Building
- 字段线索：drawer, emptyLightColor, fullLightColor
- 方法线索：init, load, drawPlanRegion, icons, getRegionsToOutline, draw

### `core/src/mindustry/world/blocks/power/BeamNode.java`

- 知识页：[core-src-mindustry-world-blocks-power-beamnode-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-beamnode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/BeamNode.java`
- SHA1：`dbab0b2725455d12cd8ce30b0a394603e0546baa`
- 声明：class BeamNodeextends PowerBlock, class BeamNodeBuildextends Building
- 字段线索：maxRange, range, laserColor1, laserColor2, pulseScl, laserWidth
- 方法线索：setBars, setStats, init, drawPlace, changePlacementPath, drawLaser

### `core/src/mindustry/world/blocks/power/ConsumeGenerator.java`

- 知识页：[core-src-mindustry-world-blocks-power-consumegenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-consumegenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/ConsumeGenerator.java`
- SHA1：`bf67ae74e5885b85026cbf40a4f1500f985ddba3`
- 声明：class ConsumeGeneratorextends PowerGenerator, class ConsumeGeneratorBuildextends GeneratorBuild
- 字段线索：itemDuration, warmupSpeed, effectChance, generateEffect, generateEffectRange, baseLightRadius
- 方法线索：setBars, init, afterPatch, setStats, updateEfficiencyMultiplier, updateTile

### `core/src/mindustry/world/blocks/power/HeaterGenerator.java`

- 知识页：[core-src-mindustry-world-blocks-power-heatergenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-heatergenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/HeaterGenerator.java`
- SHA1：`295c03cd0448cd9c8c2e6f9b060507b221cee803`
- 声明：class HeaterGeneratorextends ConsumeGenerator, class HeaterGeneratorBuildextends ConsumeGeneratorBuild implements HeatBlock
- 字段线索：heatOutput, warmupRate, heat
- 方法线索：setStats, rotatedOutput, setBars, updateTile, heatFrac, heat

### `core/src/mindustry/world/blocks/power/ImpactReactor.java`

- 知识页：[core-src-mindustry-world-blocks-power-impactreactor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-impactreactor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/ImpactReactor.java`
- SHA1：`78633e993bc31abd9cfdc98bd006ced73fe18439`
- 声明：class ImpactReactorextends PowerGenerator, class ImpactReactorBuildextends GeneratorBuild
- 字段线索：timerUse, warmupSpeed, itemDuration, totalProgress
- 方法线索：setBars, setStats, updateTile, warmup, totalProgress, ambientVolume

### `core/src/mindustry/world/blocks/power/LightBlock.java`

- 知识页：[core-src-mindustry-world-blocks-power-lightblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-lightblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/LightBlock.java`
- SHA1：`4e6fe4327723f9b95819214e8771e0910b8af3a9`
- 声明：class LightBlockextends Block, class LightBuildextends Building
- 字段线索：brightness, radius, color, smoothTime
- 方法线索：init, drawPlace, changePlacementPath, minimapColor, configured, control

### `core/src/mindustry/world/blocks/power/LongPowerNode.java`

- 知识页：[core-src-mindustry-world-blocks-power-longpowernode-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-longpowernode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/LongPowerNode.java`
- SHA1：`1780f349ae7f4229aa7acc148bdfcdc38563381a`
- 声明：class LongPowerNodeextends PowerNode, class LongPowerNodeBuildextends PowerNodeBuild
- 字段线索：glowColor, glowScl, warmup
- 方法线索：load, updateTile, draw

### `core/src/mindustry/world/blocks/power/NuclearReactor.java`

- 知识页：[core-src-mindustry-world-blocks-power-nuclearreactor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-nuclearreactor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/NuclearReactor.java`
- SHA1：`f6970a14d311b18421d7553f4f88edeb58f0a3bd`
- 声明：class NuclearReactorextends PowerGenerator, class NuclearReactorBuildextends GeneratorBuild implements HeatBlock
- 字段线索：timerFuel, lightColor, coolColor, hotColor, itemDuration, heating
- 方法线索：setStats, setBars, updateTile, heatFrac, heat, sense

### `core/src/mindustry/world/blocks/power/PowerBlock.java`

- 知识页：[core-src-mindustry-world-blocks-power-powerblock-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-powerblock-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/PowerBlock.java`
- SHA1：`de54c3ebdb3c905665142194a82623d2c30152af`
- 声明：class PowerBlockextends Block
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/power/PowerDiode.java`

- 知识页：[core-src-mindustry-world-blocks-power-powerdiode-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-powerdiode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/PowerDiode.java`
- SHA1：`541bac0cc0f659ef04364a6823d75b5a840a4707`
- 声明：class PowerDiodeextends Block, class PowerDiodeBuildextends Building
- 字段线索：未抽取
- 方法线索：setBars, drawPlanRegion, bar, draw, updateTile

### `core/src/mindustry/world/blocks/power/PowerDistributor.java`

- 知识页：[core-src-mindustry-world-blocks-power-powerdistributor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-powerdistributor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/PowerDistributor.java`
- SHA1：`52d85a8027166a0084438dbffc2c04cd091cea2f`
- 声明：class PowerDistributorextends PowerBlock
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/world/blocks/power/PowerGenerator.java`

- 知识页：[core-src-mindustry-world-blocks-power-powergenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-powergenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/PowerGenerator.java`
- SHA1：`1b90519e1e8c779a1551a070a2c9c86abd83b135`
- 声明：class PowerGeneratorextends PowerDistributor, class GeneratorBuildextends Building
- 字段线索：powerProduction, generationType, drawer, explosionRadius, explosionDamage, explodeEffect
- 方法线索：getDisplayedPowerProduction, icons, load, setStats, setBars, drawPlanRegion

### `core/src/mindustry/world/blocks/power/PowerGraph.java`

- 知识页：[core-src-mindustry-world-blocks-power-powergraph-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-powergraph-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/PowerGraph.java`
- SHA1：`b2aee2355ab320690dba3c20a3f64c4f4e337838`
- 声明：class PowerGraph
- 字段线索：queue, outArray1, outArray2, closedSet, producers, consumers
- 方法线索：getID, getLastScaledPowerIn, getLastScaledPowerOut, getLastCapacity, getPowerBalance, hasPowerBalanceSamples

### `core/src/mindustry/world/blocks/power/PowerNode.java`

- 知识页：[core-src-mindustry-world-blocks-power-powernode-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-powernode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/PowerNode.java`
- SHA1：`18065943e87c37281b9418b0a5a3aa5be3edd864`
- 声明：class PowerNodeextends PowerBlock, class PowerNodeBuildextends Building
- 字段线索：returnInt, graphs, maxRange, laserRange, maxNodes, autolink
- 方法线索：setBars, setStats, init, drawPlace, changePlacementPath, setupColor

### `core/src/mindustry/world/blocks/power/SolarGenerator.java`

- 知识页：[core-src-mindustry-world-blocks-power-solargenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-solargenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/SolarGenerator.java`
- SHA1：`79d9d0a7af4378dfeffdbf6b8ed6ad06d4969c03`
- 声明：class SolarGeneratorextends PowerGenerator, class SolarGeneratorBuildextends GeneratorBuild
- 字段线索：未抽取
- 方法线索：setStats, updateTile

### `core/src/mindustry/world/blocks/power/ThermalGenerator.java`

- 知识页：[core-src-mindustry-world-blocks-power-thermalgenerator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-thermalgenerator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/ThermalGenerator.java`
- SHA1：`44cc3907cba318485cdddceaf3090c1a4f27c311`
- 声明：class ThermalGeneratorextends PowerGenerator, class ThermalGeneratorBuildextends GeneratorBuild
- 字段线索：generateEffect, effectChance, minEfficiency, displayEfficiencyScale, displayEfficiency, outputLiquid
- 方法线索：getDisplayedPowerProduction, init, setStats, drawPlace, canPlaceOn, updateTile

### `core/src/mindustry/world/blocks/power/VariableReactor.java`

- 知识页：[core-src-mindustry-world-blocks-power-variablereactor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-world-blocks-power-variablereactor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/world/blocks/power/VariableReactor.java`
- SHA1：`ae6a6a896b209d66cb9cca3ea3869a3d8585b36b`
- 声明：class VariableReactorextends PowerGenerator, class VariableReactorBuildextends GeneratorBuild implements HeatConsumer
- 字段线索：maxHeat, unstableSpeed, warmupSpeed, effect, effectChance, effectColor
- 方法线索：setBars, setStats, updateTile, shouldExplode, draw, totalProgress


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
