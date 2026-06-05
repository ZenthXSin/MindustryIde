# arc:extensions/arcnet/src/arc/net/Connection.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/Connection.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`extensions/arcnet/src/arc/net/Connection.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/Connection.java`
- SHA1：`d85dde3d9ef7fedec1ee205e59348d9a36042895`
- 大小：11103 bytes
- 行数：341

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class Connection`。

关键词：net, arc

## Package

`arc.net`

## 类型声明

- `class Connection`

## 字段线索

- `name`
- `listeners`
- `listenerLock`
- `lastPingID`
- `lastPingSendTime`
- `returnTripTime`
- `isConnected`
- `lastProtocolError`
- `arbitraryData`

## 方法线索

- `getID`
- `isConnected`
- `getLastProtocolError`
- `sendTCP`
- `sendUDP`
- `IllegalArgumentException`
- `IllegalStateException`
- `close`
- `updateReturnTripTime`
- `getReturnTripTime`
- `setKeepAliveTCP`
- `setTimeout`
- `addListener`
- `removeListener`
- `getEndPoint`
- `getRemoteAddressTCP`
- `getRemoteAddressUDP`
- `setName`
- `getTcpWriteBufferSize`
- `isIdle`
- `setIdleThreshold`
- `toString`
- `getArbitraryData`
- `setArbitraryData`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
