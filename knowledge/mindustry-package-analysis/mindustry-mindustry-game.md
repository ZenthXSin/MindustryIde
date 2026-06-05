# Package `mindustry.game` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.game`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.game`
- 文件数：21

## 主要依赖线索

- `arc.struct.*` × 17
- `arc.util.*` × 16
- `mindustry.type.*` × 13
- `arc.*` × 9
- `mindustry.content.*` × 9
- `mindustry.gen.*` × 8
- `mindustry.world.*` × 8
- `arc.math.*` × 8
- `mindustry.*` × 7
- `mindustry.ctype.*` × 6
- `arc.func.*` × 6
- `arc.math.geom.*` × 5
- `java.util.*` × 5
- `arc.graphics.*` × 5
- `mindustry.world.blocks.storage.CoreBlock.*` × 4
- `mindustry.core.*` × 4
- `mindustry.io.*` × 4
- `arc.util.serialization.*` × 4
- `mindustry.annotations.Annotations.*` × 3
- `mindustry.game.EventType.*` × 3

## 文件逐个分析

### `core/src/mindustry/game/AttackIndicators.java`

- 知识页：[core-src-mindustry-game-attackindicators-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-attackindicators-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/AttackIndicators.java`
- SHA1：`482c90b2364c333fc2de1658efd8fd316e7d6467`
- 声明：class AttackIndicators, class IndicatorStruct
- 字段线索：duration, indicators, posToIndex
- 方法线索：list, clear, add, update

### `core/src/mindustry/game/CampaignRules.java`

- 知识页：[core-src-mindustry-game-campaignrules-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-campaignrules-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/CampaignRules.java`
- SHA1：`5efa62a0f314e68e00b58289606355fef5649117`
- 声明：class CampaignRules
- 字段线索：difficulty, fog, showSpawns, sectorInvasion, randomWaveAI, legacyLaunchPads
- 方法线索：apply

### `core/src/mindustry/game/CampaignStats.java`

- 知识页：[core-src-mindustry-game-campaignstats-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-campaignstats-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/CampaignStats.java`
- SHA1：`4daef0eea8fada01d3211128e6e8c74c54470568`
- 声明：class CampaignStats
- 字段线索：enemyUnitsDestroyed, enemyBuildingsDestroyed, unitsProduced, unitsDestroyed, buildingsBuilt, buildingsDeconstructed
- 方法线索：未抽取

### `core/src/mindustry/game/Difficulty.java`

- 知识页：[core-src-mindustry-game-difficulty-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-difficulty-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Difficulty.java`
- SHA1：`b2b428a8977871eb6adce62b79e29ac833b0168b`
- 声明：enum Difficulty
- 字段线索：all, waveTimeMultiplier
- 方法线索：info, localized, percentStat, percentStatNeg

### `core/src/mindustry/game/EventType.java`

- 知识页：[core-src-mindustry-game-eventtype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-eventtype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/EventType.java`
- SHA1：`616cefcf74a034c09b1cf16e1cea9976fdca32ee`
- 声明：class EventType, enum Trigger, class WinEvent
- 字段线索：multiPacker, patches, isMap, sector, stack, from
- 方法线索：set

### `core/src/mindustry/game/FogControl.java`

- 知识页：[core-src-mindustry-game-fogcontrol-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-fogcontrol-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/FogControl.java`
- SHA1：`b53da33352286f81a2efa64f7b3f756f19e8ecd7`
- 声明：class FogControlimplements CustomChunk, class StaticFogThreadextends Thread, class DynamicFogThreadextends Thread
- 字段线索：wh, dynamicUpdateInterval, notifyStatic, fog, staticEvents, dynamicEventQueue
- 方法线索：isDiscovered, isVisible, isVisibleTile, resetFog, data, forceUpdate

### `core/src/mindustry/game/GameStats.java`

- 知识页：[core-src-mindustry-game-gamestats-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-gamestats-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/GameStats.java`
- SHA1：`c3e0c4fcd2f5ef90b7c01895bc91b048936e8f76`
- 声明：class GameStats
- 字段线索：enemyUnitsDestroyed, wavesLasted, buildingsBuilt, buildingsDeconstructed, buildingsDestroyed, unitsCreated
- 方法线索：getPlaced, getDestroyed

### `core/src/mindustry/game/Gamemode.java`

- 知识页：[core-src-mindustry-game-gamemode-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-gamemode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Gamemode.java`
- SHA1：`dd332dc25dd19ce00ad7b1633982339e53421320`
- 声明：enum Gamemode
- 字段线索：rules, validator, hidden, all
- 方法线索：apply, valid, description, toString

### `core/src/mindustry/game/MapMarkers.java`

- 知识页：[core-src-mindustry-game-mapmarkers-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-mapmarkers-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/MapMarkers.java`
- SHA1：`b0396047d774e0f6c3604e34cb0daec6f5ae8ff3`
- 声明：class MapMarkersimplements Iterable<ObjectiveMarker>
- 字段线索：map, all
- 方法线索：add, remove, has, size, write, read

### `core/src/mindustry/game/MapObjectives.java`

- 知识页：[core-src-mindustry-game-mapobjectives-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-mapobjectives-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/MapObjectives.java`
- SHA1：`34a4d51feeae7a1c8cd04468c56f03525ea8a450`
- 声明：class MapObjectivesimplements Iterable<MapObjective>, Eachable<MapObjective>, class MapObjectiveimplements Serializable, class ResearchObjectiveextends MapObjective
- 字段线索：allObjectiveTypes, allMarkerTypes, markerNameToType, allMarkerTypeNames, all, hidden
- 方法线索：add, flatten, update, any, clear, eachRunning

### `core/src/mindustry/game/Objectives.java`

- 知识页：[core-src-mindustry-game-objectives-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-objectives-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Objectives.java`
- SHA1：`f366b4051c4fbfcc67037f7da45186e32cac114a`
- 声明：class Objectives, class Researchimplements Objective, class Produceimplements Objective
- 字段线索：content, preset, planet
- 方法线索：complete, display, toString, build

### `core/src/mindustry/game/Rules.java`

- 知识页：[core-src-mindustry-game-rules-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-rules-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Rules.java`
- SHA1：`f521477ca84f7d1379a6853dd9d11daf3096af13`
- 声明：class Rules, class TeamRule, class TeamRulesimplements JsonSerializable
- 字段线索：allowEditRules, infiniteResources, teams, waveTimer, waveSending, waves
- 方法线索：copy, mode, hasEnv, buildRadius, unitBuildSpeed, unitCost

### `core/src/mindustry/game/Saves.java`

- 知识页：[core-src-mindustry-game-saves-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-saves-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Saves.java`
- SHA1：`2e6c02e044d023bf43ca6fb667b904fa61c109c5`
- 声明：class Saves, class Remap, class SaveSlot
- 字段线索：dateFormat, lastSectorSave, saving, time, lastTimestamp, file
- 方法线索：clearOldMegabaseSectors, load, update, getTotalPlaytime, resetSave, isSaving

### `core/src/mindustry/game/Schematic.java`

- 知识页：[core-src-mindustry-game-schematic-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-schematic-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Schematic.java`
- SHA1：`8f4ea746ff11e14fba9185608e70cf1a3525b770`
- 声明：class Schematicimplements Publishable, Comparable<Schematic>, class Stile
- 字段线索：tiles, labels, tags, height, file, mod
- 方法线索：powerProduction, powerConsumption, requirements, hasCore, findCore, name

### `core/src/mindustry/game/Schematics.java`

- 知识页：[core-src-mindustry-game-schematics-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-schematics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Schematics.java`
- SHA1：`48d706f250a744c6be83e0ef83b8b3edade0d385`
- 声明：class Schematicsimplements Loadable
- 字段线索：tmpSchem, tmpSchem2, header, version, limitSchematicSize, padding
- 方法线索：loadSync, load, loadLoadouts, overwrite, all, saveChanges

### `core/src/mindustry/game/SectorInfo.java`

- 知识页：[core-src-mindustry-game-sectorinfo-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-sectorinfo-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/SectorInfo.java`
- SHA1：`6a6bdf3dacf0fcc76c0efefe0ad2be3276d71802`
- 声明：class SectorInfo, class ExportStat
- 字段线索：valueWindow, refreshPeriod, returnf, production, rawProduction, export
- 方法线索：sectorDataMatches, handleCoreItem, handleProduction, handleItemExport, handleItemImport, getExport

### `core/src/mindustry/game/SpawnGroup.java`

- 知识页：[core-src-mindustry-game-spawngroup-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-spawngroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/SpawnGroup.java`
- SHA1：`03c94f204e0e43fe1800cffa23d2ecd7f659e219`
- 声明：class SpawnGroupimplements JsonSerializable, Cloneable
- 字段线索：never, type, end, begin, spacing, max
- 方法线索：canSpawn, getSpawned, getShield, createUnit, write, read

### `core/src/mindustry/game/Team.java`

- 知识页：[core-src-mindustry-game-team-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-team-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Team.java`
- SHA1：`87bf6e5e8a7fdb13620c7cc5ce256bc8dddf83ca`
- 声明：class Teamimplements Comparable<Team>, Senseable
- 字段线索：id, color, palette, palettei, ignoreUnitCap, emoji
- 方法线索：items, rules, data, core, active, isAlive

### `core/src/mindustry/game/Teams.java`

- 知识页：[core-src-mindustry-game-teams-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-teams-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Teams.java`
- SHA1：`d7c1e0aa0e9bdcbe6fdc0d82aa98a88368b39927`
- 声明：class Teams, class TeamData, class BlockPlan
- 字段线索：map, active, present, bosses, derelictBuffer, team
- 方法线索：closestEnemyCore, closestCore, anyEnemyCoresWithinBuildRadius, anyEnemyCoresWithin, eachEnemyCore, get

### `core/src/mindustry/game/Universe.java`

- 知识页：[core-src-mindustry-game-universe-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-universe-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Universe.java`
- SHA1：`0e44734d440c1fe12085689ad1d12a187dae64ca`
- 声明：class Universe
- 字段线索：seconds, netSeconds, secondCounter, turn, turnCounter, lastLoadout
- 方法线索：updateGlobal, turn, updatePlanet, update, clearLoadoutInfo, getLaunchResources

### `core/src/mindustry/game/Waves.java`

- 知识页：[core-src-mindustry-game-waves-java.md](../mindustry-source-files/mindustry/core-src-mindustry-game-waves-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/game/Waves.java`
- SHA1：`a040b95c795953e38c18afbcb8f6003a6e8b3cf4`
- 声明：class Waves
- 字段线索：waveVersion, spawns
- 方法线索：get


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
