# Package `arc.net` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.net`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

网络包：负责客户端/服务端连接、包、同步与多人游戏状态。

## 规模

- 仓库：`arc`
- Package：`arc.net`
- 文件数：16

## 主要依赖线索

- `java.io.IOException` × 6
- `java.net.*` × 5
- `java.nio.channels.*` × 4
- `java.nio.ByteBuffer` × 4
- `arc.func.*` × 2
- `arc.net.FrameworkMessage.*` × 2
- `arc.util.*` × 2
- `java.io.*` × 2
- `java.nio.*` × 2
- `java.util.*` × 2
- `java.util.concurrent.*` × 2
- `java.net.Socket` × 2
- `java.net.DatagramPacket` × 1
- `arc.net.FrameworkMessage.Ping` × 1
- `java.nio.channels.SocketChannel` × 1
- `java.io.InputStream` × 1
- `java.util.LinkedList` × 1
- `arc.math.*` × 1
- `arc.struct.*` × 1
- `arc.net.FrameworkMessage.DiscoverHost` × 1

## 文件逐个分析

### `extensions/arcnet/src/arc/net/ArcNet.java`

- 知识页：[extensions-arcnet-src-arc-net-arcnet-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-arcnet-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/ArcNet.java`
- SHA1：`0c0ee610e96934fcc15f1c730de668335851ff35`
- 声明：class ArcNet
- 字段线索：errorHandler
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/ArcNetException.java`

- 知识页：[extensions-arcnet-src-arc-net-arcnetexception-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-arcnetexception-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/ArcNetException.java`
- SHA1：`11c5f886fb49500bf7f966cd8f720fa169b932ae`
- 声明：class ArcNetExceptionextends RuntimeException
- 字段线索：未抽取
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/Client.java`

- 知识页：[extensions-arcnet-src-arc-net-client-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-client-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/Client.java`
- SHA1：`43dadfcf7b641f033f95810c29d441304f60a8e1`
- 声明：class Clientextends Connection implements EndPoint
- 字段线索：serialization, selector, emptySelects, udpRegistered, tcpRegistrationLock, udpRegistrationLock
- 方法线索：RuntimeException, setDiscoveryPacket, connect, IllegalArgumentException, IllegalStateException, SocketTimeoutException

### `extensions/arcnet/src/arc/net/ClientDiscoveryHandler.java`

- 知识页：[extensions-arcnet-src-arc-net-clientdiscoveryhandler-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-clientdiscoveryhandler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/ClientDiscoveryHandler.java`
- SHA1：`0294ad87a9c8f82b7d029f78055485a03bad9a3e`
- 声明：interface ClientDiscoveryHandler
- 字段线索：未抽取
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/Connection.java`

- 知识页：[extensions-arcnet-src-arc-net-connection-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-connection-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/Connection.java`
- SHA1：`d85dde3d9ef7fedec1ee205e59348d9a36042895`
- 声明：class Connection
- 字段线索：name, listeners, listenerLock, lastPingID, lastPingSendTime, returnTripTime
- 方法线索：getID, isConnected, getLastProtocolError, sendTCP, sendUDP, IllegalArgumentException

### `extensions/arcnet/src/arc/net/DcReason.java`

- 知识页：[extensions-arcnet-src-arc-net-dcreason-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-dcreason-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/DcReason.java`
- SHA1：`21c86a936fb1bd9804e4917eaa75b39be09af261`
- 声明：enum DcReason
- 字段线索：未抽取
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/EndPoint.java`

- 知识页：[extensions-arcnet-src-arc-net-endpoint-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-endpoint-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/EndPoint.java`
- SHA1：`9e68baa5d0fb80835a4eab82f0506ca03d95925f`
- 声明：interface EndPointextends Runnable
- 字段线索：未抽取
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/FrameworkMessage.java`

- 知识页：[extensions-arcnet-src-arc-net-frameworkmessage-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-frameworkmessage-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/FrameworkMessage.java`
- SHA1：`1d86744126ef57af7778b890e9dfed3606983e17`
- 声明：interface FrameworkMessage, class RegisterTCPimplements FrameworkMessage, class RegisterUDPimplements FrameworkMessage
- 字段线索：connectionID, id, isReply
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/InputStreamSender.java`

- 知识页：[extensions-arcnet-src-arc-net-inputstreamsender-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-inputstreamsender-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/InputStreamSender.java`
- SHA1：`b0e597328fc15e2f307e22333977c5201a7fea70`
- 声明：class InputStreamSenderextends TcpIdleSender
- 字段线索：input, chunk
- 方法线索：ArcNetException

### `extensions/arcnet/src/arc/net/NetListener.java`

- 知识页：[extensions-arcnet-src-arc-net-netlistener-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-netlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/NetListener.java`
- SHA1：`232398ebb5ede208a754c5fe730092e52f7690fe`
- 声明：interface NetListener, class QueuedListenerimplements NetListener, class ThreadedListenerextends QueuedListener
- 字段线索：listener, threadPool, lagMillisMax, runnables
- 方法线索：connected, disconnected, received, idle, IllegalArgumentException, queue

### `extensions/arcnet/src/arc/net/NetSerializer.java`

- 知识页：[extensions-arcnet-src-arc-net-netserializer-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-netserializer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/NetSerializer.java`
- SHA1：`da4c5e4a702049f5ad3db3aa07c05738ca7b0a1e`
- 声明：interface NetSerializer
- 字段线索：未抽取
- 方法线索：getLengthLength, writeLength, readLength

### `extensions/arcnet/src/arc/net/Server.java`

- 知识页：[extensions-arcnet-src-arc-net-server-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-server-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/Server.java`
- SHA1：`8144ac272ed754fe0932fbc2c37d068dc19f05f8`
- 声明：class Serverimplements EndPoint, class DiscoveryReceiver, interface ServerConnectFilter
- 字段线索：serializer, objectBufferSize, selector, emptySelects, serverChannel, udp
- 方法线索：connected, disconnected, received, idle, RuntimeException, setMulticast

### `extensions/arcnet/src/arc/net/ServerDiscoveryHandler.java`

- 知识页：[extensions-arcnet-src-arc-net-serverdiscoveryhandler-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-serverdiscoveryhandler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/ServerDiscoveryHandler.java`
- SHA1：`7cc664ec2b7f90275d3a049b7469540e06de9ad4`
- 声明：interface ServerDiscoveryHandler, interface ReponseHandler
- 字段线索：未抽取
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/TcpConnection.java`

- 知识页：[extensions-arcnet-src-arc-net-tcpconnection-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-tcpconnection-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/TcpConnection.java`
- SHA1：`3224722dc923842d3c9e755785d51e02e5952fe7`
- 声明：class TcpConnection
- 字段线索：writeBuffer, serialization, selectionKey, lastReadTime, currentObjectLength, writeLock
- 方法线索：accept, connect, readObject, SocketException, ArcNetException, writeOperation

### `extensions/arcnet/src/arc/net/TcpIdleSender.java`

- 知识页：[extensions-arcnet-src-arc-net-tcpidlesender-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-tcpidlesender-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/TcpIdleSender.java`
- SHA1：`f4f6f267091f8860ca941fa765cbe68469552f33`
- 声明：class TcpIdleSenderimplements NetListener
- 字段线索：未抽取
- 方法线索：idle, start

### `extensions/arcnet/src/arc/net/UdpConnection.java`

- 知识页：[extensions-arcnet-src-arc-net-udpconnection-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-udpconnection-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/UdpConnection.java`
- SHA1：`db6a38a184f185be47d1f2686ffafa0d96b3cbe6`
- 声明：class UdpConnection
- 字段线索：writeBuffer, serialization, selectionKey, writeLock, lastCommunicationTime
- 方法线索：bind, connect, IOException, readFromAddress, SocketException, readObject


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
