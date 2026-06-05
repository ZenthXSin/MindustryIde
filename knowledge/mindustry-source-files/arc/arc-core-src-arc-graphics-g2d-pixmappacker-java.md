# arc:arc-core/src/arc/graphics/g2d/PixmapPacker.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/PixmapPacker.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/graphics/g2d/PixmapPacker.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/PixmapPacker.java`
- SHA1：`f8f6d32aabfa5eb746a27f0af8b3ee61c0c6a0cb`
- 大小：33699 bytes
- 行数：896

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class PixmapPackerimplements Disposable`。

关键词：arc, graphics

## Package

`arc.graphics.g2d`

## 类型声明

- `class PixmapPackerimplements Disposable`
- `interface PackStrategy`
- `class Page`
- `class GuillotineStrategyimplements PackStrategy`
- `class Node`
- `class GuillotinePageextends Page`
- `class SkylineStrategyimplements PackStrategy`
- `class SkylinePageextends Page`

## 字段线索

- `pages`
- `addedRects`
- `rect`
- `leftChild`
- `rightChild`
- `full`
- `splits`
- `pads`

## 方法线索

- `sort`
- `ArcRuntimeException`
- `getPages`
- `forceDispose`
- `getPageWidth`
- `setPageWidth`
- `getPageHeight`
- `setPageHeight`
- `getPadding`
- `setPadding`
- `getDuplicateBorder`
- `setDuplicateBorder`
- `getPackToTexture`
- `setPackToTexture`
- `getTransparentColor`
- `setTransparentColor`
- `getSplits`
- `getPads`
- `getSplitPoint`
- `setDirty`
- `getPixmap`
- `getTexture`
- `updateTexture`
- `dispose`
- `pack`
- `insert`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
