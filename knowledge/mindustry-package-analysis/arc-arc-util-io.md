# Package `arc.util.io` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.util.io`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.util.io`
- 文件数：12

## 主要依赖线索

- `java.io.*` × 7
- `java.nio.*` × 3
- `arc.util.*` × 3
- `java.io.IOException` × 2
- `java.io.OutputStream` × 1
- `java.util.zip.DeflaterOutputStream` × 1
- `arc.struct.ObjectMap` × 1
- `arc.struct.ObjectMap.Entry` × 1
- `java.io.BufferedReader` × 1
- `java.io.Reader` × 1
- `java.io.Writer` × 1
- `java.util.Date` × 1
- `java.io.ByteArrayInputStream` × 1
- `java.io.ByteArrayOutputStream` × 1
- `arc.func.*` × 1

## 文件逐个分析

### `arc-core/src/arc/util/io/ByteBufferInput.java`

- 知识页：[arc-core-src-arc-util-io-bytebufferinput-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-bytebufferinput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/ByteBufferInput.java`
- SHA1：`2fd0b72b3d8dea5b1de74476e5c9e059d7c4b3d3`
- 声明：class ByteBufferInputimplements DataInput
- 字段线索：buffer
- 方法线索：setBuffer, readFully, skipBytes, readBoolean, readByte, readUnsignedByte

### `arc-core/src/arc/util/io/ByteBufferOutput.java`

- 知识页：[arc-core-src-arc-util-io-bytebufferoutput-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-bytebufferoutput-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/ByteBufferOutput.java`
- SHA1：`f07b98e6cd39be1a8262b1b4036dc466eaaedfbe`
- 声明：class ByteBufferOutputimplements DataOutput
- 字段线索：buffer, strlen
- 方法线索：write, writeBoolean, writeByte, writeShort, writeChar, writeInt

### `arc-core/src/arc/util/io/CRC.java`

- 知识页：[arc-core-src-arc-util-io-crc-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-crc-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/CRC.java`
- SHA1：`1de91bdaf27c39f49fb5e4b0b5dca8128df71a2a`
- 声明：class CRC
- 字段线索：table
- 方法线索：init, update, updateByte, getDigest

### `arc-core/src/arc/util/io/CounterInputStream.java`

- 知识页：[arc-core-src-arc-util-io-counterinputstream-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-counterinputstream-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/CounterInputStream.java`
- SHA1：`b0ef656f5f274cd655a5c490450df53ceeb712a8`
- 声明：class CounterInputStreamextends FilterInputStream
- 字段线索：count
- 方法线索：resetCount, skip, read

### `arc-core/src/arc/util/io/FastDeflaterOutputStream.java`

- 知识页：[arc-core-src-arc-util-io-fastdeflateroutputstream-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-fastdeflateroutputstream-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/FastDeflaterOutputStream.java`
- SHA1：`8d66f35d93bd267aac9026e310a610eb8c6ab042`
- 声明：class FastDeflaterOutputStreamextends DeflaterOutputStream
- 字段线索：tmp
- 方法线索：write

### `arc-core/src/arc/util/io/LittleEndianInputStream.java`

- 知识页：[arc-core-src-arc-util-io-littleendianinputstream-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-littleendianinputstream-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/LittleEndianInputStream.java`
- SHA1：`c9e1c0a1feca0f5305c6876c82adeb95ed7ac112`
- 声明：class LittleEndianInputStreamextends FilterInputStream implements DataInput
- 字段线索：din
- 方法线索：readFully, skipBytes, readBoolean, readByte, readUnsignedByte, readShort

### `arc-core/src/arc/util/io/PropertiesUtils.java`

- 知识页：[arc-core-src-arc-util-io-propertiesutils-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-propertiesutils-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/PropertiesUtils.java`
- SHA1：`0ff448f3d8d26057c2eeb681d02e446124b5d18f`
- 声明：class PropertiesUtils
- 字段线索：NONE, LINE_SEPARATOR
- 方法线索：IllegalArgumentException, ArcRuntimeException

### `arc-core/src/arc/util/io/Reads.java`

- 知识页：[arc-core-src-arc-util-io-reads-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-reads-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/Reads.java`
- SHA1：`6bc466ff9e841c68b793bc46411ab0aeb970de3d`
- 声明：class Readsimplements Closeable
- 字段线索：bytearr, chararr, input
- 方法线索：Reads, checkEOF, RuntimeException, l, i, s

### `arc-core/src/arc/util/io/ReusableByteInStream.java`

- 知识页：[arc-core-src-arc-util-io-reusablebyteinstream-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-reusablebyteinstream-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/ReusableByteInStream.java`
- SHA1：`0f4b6d167e649e5724268a30a32161f0cfc62dcc`
- 声明：class ReusableByteInStreamextends ByteArrayInputStream
- 字段线索：未抽取
- 方法线索：position, setBytes

### `arc-core/src/arc/util/io/ReusableByteOutStream.java`

- 知识页：[arc-core-src-arc-util-io-reusablebyteoutstream-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-reusablebyteoutstream-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/ReusableByteOutStream.java`
- SHA1：`ee7a0ac417d5b70cb5fd57e43b8ed945ea27cff5`
- 声明：class ReusableByteOutStreamextends ByteArrayOutputStream
- 字段线索：未抽取
- 方法线索：getBytes

### `arc-core/src/arc/util/io/Streams.java`

- 知识页：[arc-core-src-arc-util-io-streams-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-streams-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/Streams.java`
- SHA1：`c31102cf863f307ba114aea544d50a732c9b62f9`
- 声明：class Streams, class OptimizedByteArrayOutputStreamextends ByteArrayOutputStream
- 字段线索：defaultBufferSize, emptyBytes
- 方法线索：getBuffer

### `arc-core/src/arc/util/io/Writes.java`

- 知识页：[arc-core-src-arc-util-io-writes-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-io-writes-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/io/Writes.java`
- SHA1：`c7474d7db0229865f717f6647d649ebdc1131f01`
- 声明：class Writesimplements Closeable
- 字段线索：output
- 方法线索：Writes, l, RuntimeException, i, b, bool


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
