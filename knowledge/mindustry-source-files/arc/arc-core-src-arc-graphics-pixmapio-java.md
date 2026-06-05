# arc:arc-core/src/arc/graphics/PixmapIO.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/PixmapIO.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/graphics/PixmapIO.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/PixmapIO.java`
- SHA1：`b7605d8988464f4bdb821339a226e3d1b8aa1054`
- 大小：12972 bytes
- 行数：341

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class PixmapIO`。

关键词：arc, graphics

## Package

`arc.graphics`

## 类型声明

- `class PixmapIO`
- `class PngWriterimplements Disposable`
- `class ChunkBufferextends DataOutputStream`
- `class PngReader`

## 字段线索

- `SIGNATURE`
- `IHDR`
- `COLOR_ARGB`
- `COMPRESSION_DEFLATE`
- `FILTER_NONE`
- `INTERLACE_NONE`
- `buffer`
- `deflater`
- `flipY`
- `crc`
- `ctypeRgba`
- `height`
- `interlace`
- `cs`
- `imgData`
- `buf`
- `palette`

## 方法线索

- `ArcRuntimeException`
- `Pixmap`
- `setFlipY`
- `setCompression`
- `write`
- `dispose`
- `endChunk`
- `read`
- `IOException`
- `readChunks`
- `getImage`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
