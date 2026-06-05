# arc:arc-core/src/arc/struct/ObjectFloatMap.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectFloatMap.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/struct/ObjectFloatMap.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectFloatMap.java`
- SHA1：`e33d92e43b160bf66c5e70408f73339dfd4a7da8`
- 大小：26422 bytes
- 行数：803

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class ObjectFloatMap<K> implements Iterable<ObjectFloatMap.Entry<K>>`。

关键词：arc

## Package

`arc.struct`

## 类型声明

- `class ObjectFloatMap<K> implements Iterable<ObjectFloatMap.Entry<K>>`
- `class Entry<K>`
- `class MapIterator<K>`
- `class Entries<K> extends MapIterator<K> implements Iterable<Entry<K>>, Iterator<Entry<K>>`
- `class Valuesextends MapIterator<Object>`
- `class Keys<K> extends MapIterator<K> implements Iterable<K>, Iterator<K>`

## 字段线索

- `PRIME1`
- `PRIME2`
- `PRIME3`
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
- `map`
- `hasNext`
- `entry`

## 方法线索

- `IllegalArgumentException`
- `each`
- `put`
- `putAll`
- `copy`
- `set`
- `putResize`
- `push`
- `putStash`
- `get`
- `getStash`
- `increment`
- `getAndIncrementStash`
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

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
