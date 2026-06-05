# arc:extensions/arcnet/src/arc/net/NetListener.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/NetListener.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`extensions/arcnet/src/arc/net/NetListener.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/NetListener.java`
- SHA1：`232398ebb5ede208a754c5fe730092e52f7690fe`
- 大小：4924 bytes
- 行数：142

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`interface NetListener`。

关键词：net, arc

## Package

`arc.net`

## 类型声明

- `interface NetListener`
- `class QueuedListenerimplements NetListener`
- `class ThreadedListenerextends QueuedListener`
- `class LagListenerextends QueuedListener`

## 字段线索

- `listener`
- `threadPool`
- `lagMillisMax`
- `runnables`

## 方法线索

- `connected`
- `disconnected`
- `received`
- `idle`
- `IllegalArgumentException`
- `queue`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
