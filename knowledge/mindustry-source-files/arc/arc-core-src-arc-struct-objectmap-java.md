# arc:arc-core/src/arc/struct/ObjectMap.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectMap.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/struct/ObjectMap.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectMap.java`
- SHA1：`20f645e4743098ef2324bd2dd79cc9f1fda44c04`
- 大小：29628 bytes
- 行数：889

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class ObjectMap<K, V> implements Iterable<ObjectMap.Entry<K, V>>`。

关键词：arc

## Package

`arc.struct`

## 类型声明

- `class ObjectMap<K, V> implements Iterable<ObjectMap.Entry<K, V>>`
- `class Entry<K, V>`
- `class MapIterator<K, V, I> implements Iterable<I>, Iterator<I>`
- `class Entries<K, V> extends MapIterator<K, V, Entry<K, V>>`
- `class Values<V> extends MapIterator<Object, V, V>`
- `class Keys<K> extends MapIterator<K, Object, K>`

## 字段线索

- `PRIME1`
- `PRIME2`
- `PRIME3`
- `size`
- `loadFactor`
- `threshold`
- `stashCapacity`
- `pushIterations`
- `key`
- `value`
- `map`
- `hasNext`

## 方法线索

- `IllegalArgumentException`
- `each`
- `set`
- `put`
- `putAll`
- `putResize`
- `push`
- `putStash`
- `getThrow`
- `get`
- `getNull`
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
- `values`
- `keys`
- `reset`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
