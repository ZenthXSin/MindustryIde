# arc:extensions/arcnet/src/arc/net/Client.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/Client.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`extensions/arcnet/src/arc/net/Client.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/Client.java`
- SHA1：`43dadfcf7b641f033f95810c29d441304f60a8e1`
- 大小：18333 bytes
- 行数：484

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class Clientextends Connection implements EndPoint`。

关键词：net, arc

## Package

`arc.net`

## 类型声明

- `class Clientextends Connection implements EndPoint`

## 字段线索

- `serialization`
- `selector`
- `emptySelects`
- `udpRegistered`
- `tcpRegistrationLock`
- `udpRegistrationLock`
- `shutdown`
- `updateLock`
- `updateThread`
- `connectTimeout`
- `connectHost`
- `connectTcpPort`
- `connectUdpPort`
- `isClosed`
- `discoverExecutor`
- `discoveryPacket`
- `isDone`

## 方法线索

- `RuntimeException`
- `setDiscoveryPacket`
- `connect`
- `IllegalArgumentException`
- `IllegalStateException`
- `SocketTimeoutException`
- `reconnect`
- `update`
- `handleNetException`
- `run`
- `start`
- `stop`
- `close`
- `dispose`
- `setKeepAliveUDP`
- `getUpdateThread`
- `getSerialization`
- `broadcast`
- `discoverHosts`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
