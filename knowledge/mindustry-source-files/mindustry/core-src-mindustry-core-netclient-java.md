# mindustry:core/src/mindustry/core/NetClient.java

> Source: `/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/NetClient.java`

## 源码位置

- 仓库：`mindustry`
- 相对路径：`core/src/mindustry/core/NetClient.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/core/NetClient.java`
- SHA1：`f8eebceb4c89212a22222819b2831b6e6ff9e48c`
- 大小：25949 bytes
- 行数：767

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class NetClientimplements ApplicationListener`。

关键词：net

## Package

`mindustry.core`

## 类型声明

- `class NetClientimplements ApplicationListener`

## 字段线索

- `entitySnapshotTimeout`
- `dataTimeout`
- `playerSyncTime`
- `dataReads`
- `tmpJsonMap`
- `ping`
- `connecting`
- `quiet`
- `quietReset`
- `timeoutTime`
- `lastSnapshotTimestamp`
- `lastSent`
- `removed`
- `byteStream`
- `dataStream`
- `dataStreamReads`
- `customPacketHandlers`
- `customBinaryPacketHandlers`
- `plansOut`
- `chunkSize`

## 方法线索

- `addPacketHandler`
- `getPacketHandlers`
- `addBinaryPacketHandler`
- `getBinaryPacketHandlers`
- `ValidateException`
- `RuntimeException`
- `update`
- `resetTimeout`
- `isConnecting`
- `getPing`
- `finishConnecting`
- `reset`
- `beginConnecting`
- `disconnectQuietly`
- `disconnectNoReset`
- `setQuiet`
- `clearRemovedEntity`
- `addRemovedEntity`
- `isEntityUsed`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
