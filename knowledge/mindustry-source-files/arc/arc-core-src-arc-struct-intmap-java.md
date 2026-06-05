# arc:arc-core/src/arc/struct/IntMap.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntMap.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/struct/IntMap.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntMap.java`
- SHA1：`d224d9aeb8f8bf24c05172f51d1186f4caa0234c`
- 大小：29001 bytes
- 行数：890

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class IntMap<V> implements Iterable<IntMap.Entry<V>>`。

关键词：arc

## Package

`arc.struct`

## 类型声明

- `class IntMap<V> implements Iterable<IntMap.Entry<V>>`
- `class Entry<V>`
- `class MapIterator<V>`
- `class Entries<V> extends MapIterator<V> implements Iterable<Entry<V>>, Iterator<Entry<V>>`
- `class Values<V> extends MapIterator<V> implements Iterable<V>, Iterator<V>`
- `class Keysextends MapIterator`

## 字段线索

- `PRIME1`
- `PRIME2`
- `PRIME3`
- `EMPTY`
- `size`
- `loadFactor`
- `threshold`
- `stashCapacity`
- `pushIterations`
- `entries2`
- `values2`
- `keys2`
- `key`
- `value`
- `INDEX_ILLEGAL`
- `INDEX_ZERO`
- `map`
- `hasNext`
- `entry`

## 方法线索

- `IllegalArgumentException`
- `put`
- `putAll`
- `putResize`
- `push`
- `putStash`
- `get`
- `getStash`
- `remove`
- `isEmpty`
- `shrink`
- `clear`
- `containsValue`
- `containsKey`
- `containsKeyStash`
- `findKey`
- `ensureCapacity`
- `resize`
- `hash2`
- `hash3`
- `hashCode`
- `equals`
- `toString`
- `iterator`
- `entries`
- `values`
- `keys`
- `reset`
- `IllegalStateException`
- `next`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
