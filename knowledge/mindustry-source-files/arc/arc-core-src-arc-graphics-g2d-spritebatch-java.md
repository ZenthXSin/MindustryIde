# arc:arc-core/src/arc/graphics/g2d/SpriteBatch.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/SpriteBatch.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/graphics/g2d/SpriteBatch.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/SpriteBatch.java`
- SHA1：`7ea465656eeb623736b9185ef2cfc9283b9b361e`
- 大小：30618 bytes
- 行数：865

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class SpriteBatchextends Batch`。

关键词：arc, graphics

## Package

`arc.graphics.g2d`

## 类型声明

- `class SpriteBatchextends Batch`
- `class DrawRequest`
- `class CountingSort`
- `class CountingSortTaskimplements Runnable`
- `class CountingSortTask2implements Runnable`
- `class PopulateTaskextends RecursiveAction`

## 字段线索

- `VERTEX_SIZE`
- `SPRITE_SIZE`
- `initialSize`
- `emptyVertices`
- `commonPool`
- `mesh`
- `buffer`
- `tmpVertices`
- `flushing`
- `requests`
- `requestZ`
- `numRequests`
- `contiguous`
- `intZ`
- `last`
- `req`
- `itemZ`
- `L`
- `sorted`
- `locs`

## 方法线索

- `dispose`
- `setSort`
- `setShader`
- `IllegalArgumentException`
- `setBlending`
- `z`
- `discard`
- `draw`
- `prepare`
- `expandRequests`
- `flush`
- `flushRequests`
- `drawSuper`
- `sortRequests`
- `sortRequestsThreaded`
- `sortRequestsStandard`
- `set`
- `run`
- `countingSortMapMT`
- `countingSortMap`
- `compute`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
