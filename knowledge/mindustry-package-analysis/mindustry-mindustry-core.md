# Package `mindustry.core` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.core`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.core`
- 文件数：13

## 主要依赖线索

- `arc.*` × 12
- `arc.util.*` × 12
- `arc.struct.*` × 9
- `arc.math.*` × 9
- `mindustry.game.EventType.*` × 8
- `mindustry.*` × 7
- `arc.func.*` × 6
- `mindustry.game.*` × 6
- `mindustry.gen.*` × 6
- `arc.files.*` × 5
- `arc.graphics.*` × 5
- `mindustry.content.*` × 5
- `mindustry.core.GameState.*` × 5
- `mindustry.type.*` × 4
- `mindustry.maps.*` × 4
- `arc.math.geom.*` × 4
- `mindustry.ctype.*` × 3
- `arc.audio.*` × 3
- `arc.graphics.g2d.*` × 3
- `mindustry.entities.*` × 3

## 文件逐个分析

### `core/src/mindustry/core/ContentLoader.java`

- 知识页：[core-src-mindustry-core-contentloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-contentloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/ContentLoader.java`
- SHA1：`2f2cbbca4cb4a558bcbbc1f2365e25ed003d367a`
- 声明：class ContentLoader
- 字段线索：contentNameMap, contentMap, nameMap, temporaryMapper, currentMod, lastAdded
- 方法线索：copy, createBaseContent, createModContent, logContent, IllegalArgumentException, init

### `core/src/mindustry/core/Control.java`

- 知识页：[core-src-mindustry-core-control-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-control-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/Control.java`
- SHA1：`3b78a12fba62fb5681045d7a20d28bd1c8accd08`
- 声明：class Controlimplements ApplicationListener, Loadable
- 字段线索：saves, sound, input, indicators, lastDamagedCore, timer
- 方法线索：forcePlaceAll, configurePlaced, placeLandBuild, loadAsync, loadSync, checkAutoUnlocks

### `core/src/mindustry/core/FileTree.java`

- 知识页：[core-src-mindustry-core-filetree-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-filetree-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/FileTree.java`
- SHA1：`0a49994e8b671f005add774a17de2fd5bf0f6eed`
- 声明：class FileTreeimplements FileHandleResolver
- 字段线索：files, loadedSounds, loadedMusic
- 方法线索：addFile, get, clear, resolve, loadSound, loadMusic

### `core/src/mindustry/core/GameState.java`

- 知识页：[core-src-mindustry-core-gamestate-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-gamestate-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/GameState.java`
- SHA1：`a1ccd9e9e3ddfd1adde5a0d16469b63df742c3b5`
- 声明：class GameState, enum State
- 字段线索：wave, wavetime, tick, updateId, gameOver, afterGameOver
- 方法线索：boss, set, hasSpawns, isCampaign, hasSector, isEditor

### `core/src/mindustry/core/Logic.java`

- 知识页：[core-src-mindustry-core-logic-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-logic-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/Logic.java`
- SHA1：`9d912758182a781336a97ac52f647a6a9025b07c`
- 声明：class Logicimplements ApplicationListener
- 字段线索：未抽取
- 方法线索：checkCampaignStats, checkOverlappingPlans, play, reset, skipWave, runWave

### `core/src/mindustry/core/NetClient.java`

- 知识页：[core-src-mindustry-core-netclient-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-netclient-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/NetClient.java`
- SHA1：`f8eebceb4c89212a22222819b2831b6e6ff9e48c`
- 声明：class NetClientimplements ApplicationListener
- 字段线索：entitySnapshotTimeout, dataTimeout, playerSyncTime, dataReads, tmpJsonMap, ping
- 方法线索：addPacketHandler, getPacketHandlers, addBinaryPacketHandler, getBinaryPacketHandlers, ValidateException, RuntimeException

### `core/src/mindustry/core/NetServer.java`

- 知识页：[core-src-mindustry-core-netserver-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-netserver-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/NetServer.java`
- SHA1：`c5a7880300fb35c0eee809b528977dab35a0d464`
- 声明：class NetServerimplements ApplicationListener, class VoteSession, interface TeamAssigner
- 字段线索：maxSnapshotSize, blockSyncTime, fbuffer, dataWrites, hiddenIds, healthSeq
- 方法线索：init, registerCommands, votesRequired, assignTeam, sendWorldData, addPacketHandler

### `core/src/mindustry/core/PerfCounter.java`

- 知识页：[core-src-mindustry-core-perfcounter-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-perfcounter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/PerfCounter.java`
- SHA1：`e12a9b758ffecd807c17a985f18126f3fb8323f8`
- 声明：enum PerfCounter
- 字段线索：all, meanWindow, refreshTimeMillis, valueRefreshTime, refreshValue, beginTime
- 方法线索：begin, end, valueMs, rawValueMs, rawValueNs

### `core/src/mindustry/core/Platform.java`

- 知识页：[core-src-mindustry-core-platform-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-platform-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/Platform.java`
- SHA1：`bc677e4d61a7f30a9522c92b5eca3ab9092a1442`
- 声明：interface Platform, interface FileWriter
- 字段线索：未抽取
- 方法线索：loadJar, loadClass, updateLobby, inviteFriends, publish, viewListing

### `core/src/mindustry/core/Renderer.java`

- 知识页：[core-src-mindustry-core-renderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-renderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/Renderer.java`
- SHA1：`4bafb3ca964dd35a41791d06e33d3a9c3b5715a6`
- 声明：class Rendererimplements ApplicationListener, class EnvRenderer
- 字段线索：laserOpacity, blocks, fog, minimap, overlays, lights
- 方法线索：shake, addEnvRenderer, addCustomBackground, init, loadFluidFrames, getFluidFrames

### `core/src/mindustry/core/UI.java`

- 知识页：[core-src-mindustry-core-ui-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-ui-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/UI.java`
- SHA1：`b2552c80874910331ebe96b691490c8c1aa5a89c`
- 声明：class UIimplements ApplicationListener, Loadable
- 字段线索：buffer, thousands, packer, menufrag, hudfrag, chatfrag
- 方法线索：loadAsync, loadSync, getDependencies, update, init, updateMargins

### `core/src/mindustry/core/Version.java`

- 知识页：[core-src-mindustry-core-version-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-version-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/Version.java`
- SHA1：`142c2ade04fd038bd99aafdfd87ce12c51897d73`
- 声明：class Version
- 字段线索：type, modifier, commitHash, buildDate, number, build
- 方法线索：未抽取

### `core/src/mindustry/core/World.java`

- 知识页：[core-src-mindustry-core-world-java.md](../mindustry-source-files/mindustry/core-src-mindustry-core-world-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/World.java`
- SHA1：`b511b7c7d90c217f15cd97108915c2b8ba729040`
- 声明：class World, class Contextimplements WorldContext, class FilterContextextends Context
- 字段线索：context, tiles, tileChanges, invalidMap, customMapLoaders, sector
- 方法线索：addMapLoader, isInvalidMap, solid, passable, wallSolid, wallSolidFull


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
