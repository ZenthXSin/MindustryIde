# Package `arc.net.dns` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.net.dns`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

网络包：负责客户端/服务端连接、包、同步与多人游戏状态。

## 规模

- 仓库：`arc`
- Package：`arc.net.dns`
- 文件数：6

## 主要依赖线索

- `arc.struct.*` × 5
- `java.net.*` × 5
- `arc.util.*` × 3
- `java.io.*` × 2
- `java.util.*` × 2
- `arc.*` × 1
- `arc.math.*` × 1
- `arc.util.io.Streams.*` × 1
- `javax.naming.*` × 1
- `javax.naming.directory.*` × 1
- `arc.files.*` × 1

## 文件逐个分析

### `extensions/arcnet/src/arc/net/dns/ArcDns.java`

- 知识页：[extensions-arcnet-src-arc-net-dns-arcdns-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-dns-arcdns-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/dns/ArcDns.java`
- SHA1：`efaaf122e6c25adfdc3c7442d9c8daa7efa0fef4`
- 声明：class ArcDns
- 字段线索：dnsResolverPort, nameservers, nameserverProviders
- 方法线索：未抽取

### `extensions/arcnet/src/arc/net/dns/JndiContextNameserverProvider.java`

- 知识页：[extensions-arcnet-src-arc-net-dns-jndicontextnameserverprovider-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-dns-jndicontextnameserverprovider-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/dns/JndiContextNameserverProvider.java`
- SHA1：`6aa1e1cec7d87880b010eea6c769e96099eaf248`
- 声明：class JndiContextNameserverProviderimplements NameserverProvider, class Innerimplements NameserverProvider
- 字段线索：未抽取
- 方法线索：getNameservers, Inner, isEnabled

### `extensions/arcnet/src/arc/net/dns/NameserverProvider.java`

- 知识页：[extensions-arcnet-src-arc-net-dns-nameserverprovider-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-dns-nameserverprovider-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/dns/NameserverProvider.java`
- SHA1：`b802e8cdb5c4c17ac2ece82b876f62869958cb7b`
- 声明：interface NameserverProvider
- 字段线索：未抽取
- 方法线索：isEnabled

### `extensions/arcnet/src/arc/net/dns/ResolvConfNameserverProvider.java`

- 知识页：[extensions-arcnet-src-arc-net-dns-resolvconfnameserverprovider-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-dns-resolvconfnameserverprovider-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/dns/ResolvConfNameserverProvider.java`
- SHA1：`d9d180baded72dfbc7f75b97eb1b0d71259106a9`
- 声明：class ResolvConfNameserverProviderimplements NameserverProvider
- 字段线索：未抽取
- 方法线索：getNameservers, tryParseResolveConf, isEnabled

### `extensions/arcnet/src/arc/net/dns/SRVRecord.java`

- 知识页：[extensions-arcnet-src-arc-net-dns-srvrecord-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-dns-srvrecord-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/dns/SRVRecord.java`
- SHA1：`336fb3188cca13dc028365e343c2dc96251a60df`
- 声明：class SRVRecordimplements Comparable<SRVRecord>
- 字段线索：ttl, priority, weight, port, target
- 方法线索：toString, compareTo

### `extensions/arcnet/src/arc/net/dns/WellKnownNameserverProvider.java`

- 知识页：[extensions-arcnet-src-arc-net-dns-wellknownnameserverprovider-java.md](../mindustry-source-files/arc/extensions-arcnet-src-arc-net-dns-wellknownnameserverprovider-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/arcnet/src/arc/net/dns/WellKnownNameserverProvider.java`
- SHA1：`a08978b5489dafbdd5d9c496d1e22bc9a4f7b5fe`
- 声明：class WellKnownNameserverProviderimplements NameserverProvider
- 字段线索：nameservers
- 方法线索：getNameservers


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
