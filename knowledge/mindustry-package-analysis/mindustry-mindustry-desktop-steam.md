# Package `mindustry.desktop.steam` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.desktop.steam`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

网络包：负责客户端/服务端连接、包、同步与多人游戏状态。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.desktop.steam`
- 文件数：5

## 主要依赖线索

- `com.codedisaster.steamworks.*` × 4
- `arc.*` × 3
- `arc.util.*` × 3
- `arc.func.*` × 2
- `arc.struct.*` × 2
- `mindustry.game.EventType.*` × 2
- `mindustry.game.*` × 2
- `com.codedisaster.steamworks.SteamMatchmaking.*` × 1
- `com.codedisaster.steamworks.SteamNetworking.*` × 1
- `mindustry.core.*` × 1
- `mindustry.net.ArcNetProvider.*` × 1
- `mindustry.net.*` × 1
- `mindustry.net.Net.*` × 1
- `mindustry.net.Packets.*` × 1
- `java.io.*` × 1
- `java.nio.*` × 1
- `java.util.concurrent.*` × 1
- `arc.files.*` × 1
- `arc.scene.ui.*` × 1
- `com.codedisaster.steamworks.SteamRemoteStorage.*` × 1

## 文件逐个分析

### `desktop/src/mindustry/desktop/steam/SNet.java`

- 知识页：[desktop-src-mindustry-desktop-steam-snet-java.md](../mindustry-source-files/mindustry/desktop-src-mindustry-desktop-steam-snet-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/desktop/src/mindustry/desktop/steam/SNet.java`
- SHA1：`93f0cce6c1efd4433b71834793d352701b6ec89e`
- 声明：class SNetimplements SteamNetworkingCallback, SteamMatchmakingCallback, SteamFriendsCallback, NetProvider, class SteamConnectionextends NetConnection
- 字段线索：snet, smat, friends, provider, serializer, writeBuffer
- 方法线索：update, isSteamClient, connectClient, IOException, sendClient, disconnectClient

### `desktop/src/mindustry/desktop/steam/SStats.java`

- 知识页：[desktop-src-mindustry-desktop-steam-sstats-java.md](../mindustry-source-files/mindustry/desktop-src-mindustry-desktop-steam-sstats-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/desktop/src/mindustry/desktop/steam/SStats.java`
- SHA1：`aed437e86c1e2047fa0233e491dc7970576a298d`
- 声明：class SStatsimplements SteamUserStatsCallback
- 字段线索：stats, updated, statSavePeriod
- 方法线索：onUpdate, onUserStatsReceived, onUserStatsStored

### `desktop/src/mindustry/desktop/steam/SUser.java`

- 知识页：[desktop-src-mindustry-desktop-steam-suser-java.md](../mindustry-source-files/mindustry/desktop-src-mindustry-desktop-steam-suser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/desktop/src/mindustry/desktop/steam/SUser.java`
- SHA1：`d830df34f99fb2d67c7e164e67a4d6eb23443b4a`
- 声明：class SUserimplements SteamUserCallback
- 字段线索：user
- 方法线索：未抽取

### `desktop/src/mindustry/desktop/steam/SVars.java`

- 知识页：[desktop-src-mindustry-desktop-steam-svars-java.md](../mindustry-source-files/mindustry/desktop-src-mindustry-desktop-steam-svars-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/desktop/src/mindustry/desktop/steam/SVars.java`
- SHA1：`e062876a73669be9490551918bfee231143724e4`
- 声明：class SVars
- 字段线索：steamID, net, stats, workshop, user
- 方法线索：未抽取

### `desktop/src/mindustry/desktop/steam/SWorkshop.java`

- 知识页：[desktop-src-mindustry-desktop-steam-sworkshop-java.md](../mindustry-source-files/mindustry/desktop-src-mindustry-desktop-steam-sworkshop-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/desktop/src/mindustry/desktop/steam/SWorkshop.java`
- SHA1：`75b1f4f22f6a69377c633234afcac03b719928cc`
- 声明：class SWorkshopimplements SteamUGCCallback
- 字段线索：ugc, workshopFiles, detailHandlers, itemHandlers, updatedHandlers
- 方法线索：getWorkshopFiles, publish, viewListing, onUGCQueryCompleted, onSubscribeItem, onUnsubscribeItem


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
