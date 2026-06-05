# Package `arc.discord` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.discord`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.discord`
- 文件数：1

## 主要依赖线索

- `arc.func.*` × 1
- `arc.util.*` × 1
- `arc.util.serialization.*` × 1
- `java.io.*` × 1
- `java.lang.reflect.*` × 1
- `java.net.*` × 1
- `java.nio.*` × 1
- `java.nio.channels.*` × 1
- `java.util.*` × 1
- `java.util.concurrent.*` × 1

## 文件逐个分析

### `extensions/discord/src/arc/discord/DiscordRPC.java`

- 知识页：[extensions-discord-src-arc-discord-discordrpc-java.md](../mindustry-source-files/arc/extensions-discord-src-arc-discord-discordrpc-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/discord/src/arc/discord/DiscordRPC.java`
- SHA1：`1e7e255f450b048e15938877bd96333e983641fe`
- 声明：class DiscordRPC, class Packet, enum PacketOp
- 字段线索：pid, clientId, pipe, onActivityJoin, onActivitySpectate, onActivityJoinRequest
- 方法线索：Exception, NoDiscordClientException, IllegalStateException, toBytes, toString, toJson


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
