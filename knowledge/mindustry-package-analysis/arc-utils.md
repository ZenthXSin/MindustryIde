# Package `utils` (arc)

> Source: 本地源码仓库 `arc` 中 package `utils`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`arc`
- Package：`utils`
- 文件数：3

## 主要依赖线索

- `org.junit.*` × 2
- `arc.struct.*` × 1
- `arc.Files.*` × 1
- `arc.files.*` × 1
- `arc.util.*` × 1
- `arc.util.serialization.*` × 1
- `arc.util.serialization.Jval.*` × 1
- `arc.struct.Queue` × 1
- `org.junit.Assert` × 1
- `org.junit.Test` × 1
- `java.util.Iterator` × 1

## 文件逐个分析

### `arc-core/test/utils/BitsTest.java`

- 知识页：[arc-core-test-utils-bitstest-java.md](../mindustry-source-files/arc/arc-core-test-utils-bitstest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/utils/BitsTest.java`
- SHA1：`71bd6711ae70e65b57128c06021990c09f8762cf`
- 声明：class BitsTest
- 字段线索：未抽取
- 方法线索：testHashcodeAndEquals, testXor, testOr, testAnd

### `arc-core/test/utils/JvalTest.java`

- 知识页：[arc-core-test-utils-jvaltest-java.md](../mindustry-source-files/arc/arc-core-test-utils-jvaltest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/utils/JvalTest.java`
- SHA1：`b2418657bd960416c4023d542d5eee6f66a463ca`
- 声明：class JvalTest
- 字段线索：未抽取
- 方法线索：parseExponential, parseUnquotedStringArray, parseUnquotedComma, parseUnquotedString, parseWithComma, parseJson

### `arc-core/test/utils/QueueTest.java`

- 知识页：[arc-core-test-utils-queuetest-java.md](../mindustry-source-files/arc/arc-core-test-utils-queuetest-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/test/utils/QueueTest.java`
- SHA1：`dd6715d2b0a07a1fbea99b29613326120f630ce0`
- 声明：class QueueTest
- 字段线索：q, peeked, size, peek, pop
- 方法线索：resizableQueueTest, resizableDequeTest, getTest, removeTest, indexOfTest, iteratorTest


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
