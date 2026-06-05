# mindustry:core/src/mindustry/net/ArcNetProvider.java

> Source: `/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/ArcNetProvider.java`

## 源码位置

- 仓库：`mindustry`
- 相对路径：`core/src/mindustry/net/ArcNetProvider.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/ArcNetProvider.java`
- SHA1：`e63906ab0ec039fbdd348f2f60a6e0a431aeae1d`
- 大小：21384 bytes
- 行数：581

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class ArcNetProviderimplements NetProvider`。

关键词：net, arc

## Package

`mindustry.net`

## 类型声明

- `class ArcNetProviderimplements NetProvider`
- `class ArcConnectionextends NetConnection`
- `class PacketSerializerimplements NetSerializer`

## 字段线索

- `client`
- `packetSupplier`
- `server`
- `connections`
- `decompressor`
- `compressor`
- `packetSpamLimit`
- `clientUdpErrorRate`
- `connection`
- `debug`
- `upload`
- `downloadAccum`
- `lastPos`

## 方法线索

- `handleNetException`
- `connected`
- `disconnected`
- `received`
- `setConnectFilter`
- `connectClient`
- `disconnectClient`
- `sendClient`
- `pingHost`
- `pingHostImpl`
- `discoverServers`
- `dispose`
- `getConnections`
- `hostServer`
- `closeServer`
- `isConnected`
- `sendStream`
- `start`
- `next`
- `send`
- `close`
- `read`
- `write`
- `writeFramework`
- `readFramework`
- `RuntimeException`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
