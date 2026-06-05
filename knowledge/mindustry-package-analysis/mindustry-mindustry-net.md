# Package `mindustry.net` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.net`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

世界层包：负责 Tile、Block、Building、地图格子、消耗、绘制与放置等核心机制。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.net`
- 文件数：15

## 主要依赖线索

- `arc.*` × 9
- `arc.util.*` × 9
- `java.io.*` × 9
- `arc.struct.*` × 8
- `mindustry.gen.*` × 8
- `mindustry.*` × 7
- `arc.func.*` × 5
- `arc.util.io.*` × 5
- `mindustry.net.Packets.*` × 5
- `mindustry.core.*` × 4
- `mindustry.io.*` × 4
- `mindustry.net.Administration.*` × 3
- `arc.util.serialization.*` × 3
- `arc.util.Log.*` × 2
- `mindustry.type.*` × 2
- `arc.net.*` × 2
- `arc.net.Server.*` × 2
- `mindustry.game.EventType.*` × 2
- `net.jpountz.lz4.*` × 2
- `arc.files.*` × 2

## 文件逐个分析

### `core/src/mindustry/net/Administration.java`

- 知识页：[core-src-mindustry-net-administration-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-administration-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Administration.java`
- SHA1：`9a73d43e17a2f41614775d276791ecffa217001c`
- 声明：class Administration, class Config, class PlayerInfoimplements Serializable
- 字段线索：bannedIPs, whitelist, chatFilters, actionFilters, subnetBans, dosBlacklist
- 方法线索：getKickTime, handleKicked, getSubnetBans, removeSubnetBan, addSubnetBan, isSubnetBanned

### `core/src/mindustry/net/ArcNetProvider.java`

- 知识页：[core-src-mindustry-net-arcnetprovider-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-arcnetprovider-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/ArcNetProvider.java`
- SHA1：`e63906ab0ec039fbdd348f2f60a6e0a431aeae1d`
- 声明：class ArcNetProviderimplements NetProvider, class ArcConnectionextends NetConnection, class PacketSerializerimplements NetSerializer
- 字段线索：client, packetSupplier, server, connections, decompressor, compressor
- 方法线索：handleNetException, connected, disconnected, received, setConnectFilter, connectClient

### `core/src/mindustry/net/BeControl.java`

- 知识页：[core-src-mindustry-net-becontrol-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-becontrol-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/BeControl.java`
- SHA1：`e08b57cb03ecaa384f717dc9bfe4b6db5fc0311a`
- 声明：class BeControl
- 字段线索：updateInterval, checkUpdates, updateAvailable, updateUrl, updateBuild
- 方法线索：active, init, checkUpdate, isUpdateAvailable, showUpdateDialog, download

### `core/src/mindustry/net/CrashHandler.java`

- 知识页：[core-src-mindustry-net-crashhandler-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-crashhandler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/CrashHandler.java`
- SHA1：`164f4d31b10ddc06b85be00eca10607645ae1842`
- 声明：class CrashHandler
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/net/Host.java`

- 知识页：[core-src-mindustry-net-host-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-host-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Host.java`
- SHA1：`8814ae506d4fe5e33f97d931711e91ffede250b7`
- 声明：class Host
- 字段线索：name, address, description, wave, playerLimit, version
- 方法线索：未抽取

### `core/src/mindustry/net/Net.java`

- 知识页：[core-src-mindustry-net-net-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-net-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Net.java`
- SHA1：`88fc1c83985ced18b15b7304032d48a209c4a44d`
- 声明：class Net, interface NetProvider
- 字段线索：packetProvs, packetClasses, packetToId, server, active, clientLoaded
- 方法线索：handleException, showError, setClientLoaded, setClientConnected, connect, IOException

### `core/src/mindustry/net/NetConnection.java`

- 知识页：[core-src-mindustry-net-netconnection-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-netconnection-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/NetConnection.java`
- SHA1：`2d3d593791939a9a9682c7f3decc29fd316f60dc`
- 声明：class NetConnection
- 字段线索：address, uuid, modclient, player, kicked, syncTime
- 方法线索：kick, kickDisconnect, isConnected, sendStream, RuntimeException

### `core/src/mindustry/net/NetworkIO.java`

- 知识页：[core-src-mindustry-net-networkio-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-networkio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/NetworkIO.java`
- SHA1：`274db07e08a799e20330fe0468fca5902f55469b`
- 声明：class NetworkIO
- 字段线索：未抽取
- 方法线索：RuntimeException, Host, String

### `core/src/mindustry/net/Packet.java`

- 知识页：[core-src-mindustry-net-packet-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-packet-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Packet.java`
- SHA1：`94188c6928f75677140f83caff87bf0334aea96d`
- 声明：class Packet
- 字段线索：NODATA, BAIS, READ, priorityLow, priorityNormal, priorityHigh
- 方法线索：read, write, allow, handled, getPriority, handleClient

### `core/src/mindustry/net/Packets.java`

- 知识页：[core-src-mindustry-net-packets-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-packets-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Packets.java`
- SHA1：`dd12ca6fc004e97dec35efd1f05809d102a322aa`
- 声明：class Packets, enum KickReason, enum AdminAction
- 字段线索：all, quiet, addressTCP, reason, lastid, id
- 方法线索：toString, extraText, getPriority, allow, write, read

### `core/src/mindustry/net/ServerGroup.java`

- 知识页：[core-src-mindustry-net-servergroup-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-servergroup-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/ServerGroup.java`
- SHA1：`79901fdc9d49cc1ee71522e1e49a45012209e8aa`
- 声明：class ServerGroup
- 字段线索：name, addresses, prioritized
- 方法线索：hidden, favorite, setHidden, setFavorite

### `core/src/mindustry/net/SteamAdmin.java`

- 知识页：[core-src-mindustry-net-steamadmin-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-steamadmin-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/SteamAdmin.java`
- SHA1：`1b372b890436399cd14e34194792e7843488b81a`
- 声明：class SteamAdmin, class SteamAdminData
- 字段线索：scheduled, data, checkInterval
- 方法线索：未抽取

### `core/src/mindustry/net/Streamable.java`

- 知识页：[core-src-mindustry-net-streamable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-streamable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Streamable.java`
- SHA1：`e4e10f3605b72c50cfd440086848edf4cf217b35`
- 声明：class Streamableextends Packet, class StreamBuilder
- 字段线索：stream, id, type, total
- 方法线索：getPriority, allow, progress, add, RuntimeException, build

### `core/src/mindustry/net/ValidateException.java`

- 知识页：[core-src-mindustry-net-validateexception-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-validateexception-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/ValidateException.java`
- SHA1：`2539e384f30ed9a8b058b45ccb3967f705b2cf8f`
- 声明：class ValidateExceptionextends RuntimeException
- 字段线索：player
- 方法线索：未抽取

### `core/src/mindustry/net/WorldReloader.java`

- 知识页：[core-src-mindustry-net-worldreloader-java.md](../mindustry-source-files/mindustry/core-src-mindustry-net-worldreloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/WorldReloader.java`
- SHA1：`f860ddab795316deabae133e4d148a29eaa533c2`
- 声明：class WorldReloader
- 字段线索：未抽取
- 方法线索：begin, end


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
