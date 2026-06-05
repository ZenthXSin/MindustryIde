# mindustry:core/src/mindustry/core/NetServer.java

> Source: `/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/NetServer.java`

## 源码位置

- 仓库：`mindustry`
- 相对路径：`core/src/mindustry/core/NetServer.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/NetServer.java`
- SHA1：`c5a7880300fb35c0eee809b528977dab35a0d464`
- 大小：52539 bytes
- 行数：1301

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class NetServerimplements ApplicationListener`。

关键词：net

## Package

`mindustry.core`

## 类型声明

- `class NetServerimplements ApplicationListener`
- `class VoteSession`
- `interface TeamAssigner`
- `interface ChatFormatter`
- `interface InvalidCommandHandler`

## 字段线索

- `maxSnapshotSize`
- `blockSyncTime`
- `fbuffer`
- `dataWrites`
- `hiddenIds`
- `healthSeq`
- `vector`
- `plansOut`
- `correctDist`
- `admins`
- `clientCommands`
- `assigner`
- `chatFormatter`
- `invalidHandler`
- `closing`
- `buildHealthChanged`
- `currentlyKicking`
- `kickDuration`
- `voteDuration`
- `voteCooldown`

## 方法线索

- `init`
- `registerCommands`
- `votesRequired`
- `assignTeam`
- `sendWorldData`
- `addPacketHandler`
- `addBinaryPacketHandler`
- `addLogicDataHandler`
- `logClientStatus`
- `isWaitingForPlayers`
- `update`
- `buildHealthUpdate`
- `openServer`
- `kickAll`
- `writeBlockSnapshots`
- `writeEntitySnapshot`
- `fixName`
- `checkColor`
- `clientPlanSnapshotSend`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
