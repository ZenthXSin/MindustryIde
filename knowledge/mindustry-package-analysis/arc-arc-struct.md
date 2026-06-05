# Package `arc.struct` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.struct`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

Arc 集合包：负责 Seq、ObjectMap、IntMap 等高性能集合。

## 规模

- 仓库：`arc`
- Package：`arc.struct`
- 文件数：34

## 主要依赖线索

- `java.util.*` × 10
- `arc.math.Mathf` × 10
- `arc.util.*` × 9
- `java.util.NoSuchElementException` × 8
- `arc.math.*` × 7
- `arc.func.*` × 7
- `arc.util.ArcRuntimeException` × 6
- `java.util.Arrays` × 5
- `java.util.Comparator` × 4
- `java.util.Iterator` × 4
- `arc.struct.ObjectMap.*` × 1
- `java.util.BitSet` × 1
- `arc.math.geom.Vec2` × 1
- `arc.struct.LongMap.Values` × 1
- `arc.func.Intc` × 1
- `arc.func.Cons2` × 1
- `arc.func.Prov` × 1
- `arc.util.Strings` × 1

## 文件逐个分析

### `arc-core/src/arc/struct/ArrayMap.java`

- 知识页：[arc-core-src-arc-struct-arraymap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-arraymap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ArrayMap.java`
- SHA1：`458018d8fbfceb6fdfde641eba72b1fc53e3ef0d`
- 声明：class ArrayMap<K, V> implements Iterable<ObjectMap.Entry<K, V>>, class Entries<K, V> implements Iterable<Entry<K, V>>, Iterator<Entry<K, V>>, class Values<V> implements Iterable<V>, Iterator<V>
- 字段线索：keys, values, size, ordered, entries2, valuesIter2
- 方法线索：put, putAll, IllegalArgumentException, get, getKey, getKeyAt

### `arc-core/src/arc/struct/BinaryHeap.java`

- 知识页：[arc-core-src-arc-struct-binaryheap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-binaryheap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/BinaryHeap.java`
- SHA1：`3a569496a2688e07c2f6f4305092a7ea5d100e27`
- 声明：class BinaryHeap<T extends BinaryHeap.Node>, class Node
- 字段线索：isMaxHeap, size, nodes
- 方法线索：add, contains, peek, pop, remove, isEmpty

### `arc-core/src/arc/struct/Bits.java`

- 知识页：[arc-core-src-arc-struct-bits-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-bits-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/Bits.java`
- SHA1：`8705297c0f0991ae605c1023da1002c9bd5bf751`
- 声明：class Bits
- 字段线索：word
- 方法线索：set, get, getAndClear, getAndSet, flip, checkCapacity

### `arc-core/src/arc/struct/BoolSeq.java`

- 知识页：[arc-core-src-arc-struct-boolseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-boolseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/BoolSeq.java`
- SHA1：`fd8349d29f0559065bacb06d6deb1d09d220b68a`
- 声明：class BoolSeq
- 字段线索：items, size, ordered
- 方法线索：BoolSeq, add, addAll, IllegalArgumentException, get, set

### `arc-core/src/arc/struct/ByteSeq.java`

- 知识页：[arc-core-src-arc-struct-byteseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-byteseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ByteSeq.java`
- SHA1：`b7cdf2784e42ba0090ea940628ef62692c41cb18`
- 声明：class ByteSeq
- 字段线索：items, size, ordered
- 方法线索：ByteSeq, add, addAll, IllegalArgumentException, get, set

### `arc-core/src/arc/struct/ComparableTimSort.java`

- 知识页：[arc-core-src-arc-struct-comparabletimsort-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-comparabletimsort-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ComparableTimSort.java`
- SHA1：`91347dc16c4bd1288262dfd9086ac19871e31d33`
- 声明：class ComparableTimSort
- 字段线索：MIN_MERGE, MIN_GALLOP, INITIAL_TMP_STORAGE_LENGTH, DEBUG, runBase, runLen
- 方法线索：sort, IllegalArgumentException, doSort, pushRun, mergeCollapse, mergeForceCollapse

### `arc-core/src/arc/struct/DelayedRemovalSeq.java`

- 知识页：[arc-core-src-arc-struct-delayedremovalseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-delayedremovalseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/DelayedRemovalSeq.java`
- SHA1：`0429999edf91ddcefc5527980610a64e4b7df6d7`
- 声明：class DelayedRemovalSeq<T> extends Seq<T>
- 字段线索：iterating, remove, clear
- 方法线索：begin, end, removeIntern, remove, removeRange, clear

### `arc-core/src/arc/struct/EnumSet.java`

- 知识页：[arc-core-src-arc-struct-enumset-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-enumset-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/EnumSet.java`
- SHA1：`79ea494ed93360b877445fbad73c6fb7255e07bf`
- 声明：class EnumSet<T extends Enum<T>>
- 字段线索：mask, array, size
- 方法线索：with, contains, containsAny, containsAll

### `arc-core/src/arc/struct/FloatSeq.java`

- 知识页：[arc-core-src-arc-struct-floatseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-floatseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/FloatSeq.java`
- SHA1：`5cf289b732d132309380b841a62f807c38f10a18`
- 声明：class FloatSeq
- 字段线索：items, size, ordered
- 方法线索：FloatSeq, toVec2Array, add, addAll, IllegalArgumentException, get

### `arc-core/src/arc/struct/GridBits.java`

- 知识页：[arc-core-src-arc-struct-gridbits-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-gridbits-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/GridBits.java`
- SHA1：`ee81191acac2991983b2509860cc6fed5b8596b5`
- 声明：class GridBits
- 字段线索：bits, height
- 方法线索：set, get, clear, width, height

### `arc-core/src/arc/struct/GridMap.java`

- 知识页：[arc-core-src-arc-struct-gridmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-gridmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/GridMap.java`
- SHA1：`90b15bed343e67091dd8bcc7ed16de34843ec214`
- 声明：class GridMap<T>
- 字段线索：map
- 方法线索：get, containsKey, put, remove, values, keys

### `arc-core/src/arc/struct/IntFloatMap.java`

- 知识页：[arc-core-src-arc-struct-intfloatmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-intfloatmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntFloatMap.java`
- SHA1：`0631a7ccd95f0f98b02d66fe86d7e447bcdd19ac`
- 声明：class IntFloatMapimplements Iterable<IntFloatMap.Entry>, class Entry, class MapIterator
- 字段线索：PRIME1, PRIME2, PRIME3, EMPTY, size, loadFactor
- 方法线索：IllegalArgumentException, put, putAll, putResize, push, putStash

### `arc-core/src/arc/struct/IntIntMap.java`

- 知识页：[arc-core-src-arc-struct-intintmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-intintmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntIntMap.java`
- SHA1：`21515c77210b8c04c7afbf05e87b4730e7856a7d`
- 声明：class IntIntMapimplements Iterable<IntIntMap.Entry>, class Entry, class MapIterator
- 字段线索：PRIME1, PRIME2, PRIME3, EMPTY, size, loadFactor
- 方法线索：IllegalArgumentException, put, putAll, putResize, push, putStash

### `arc-core/src/arc/struct/IntMap.java`

- 知识页：[arc-core-src-arc-struct-intmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-intmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntMap.java`
- SHA1：`d224d9aeb8f8bf24c05172f51d1186f4caa0234c`
- 声明：class IntMap<V> implements Iterable<IntMap.Entry<V>>, class Entry<V>, class MapIterator<V>
- 字段线索：PRIME1, PRIME2, PRIME3, EMPTY, size, loadFactor
- 方法线索：IllegalArgumentException, put, putAll, putResize, push, putStash

### `arc-core/src/arc/struct/IntQueue.java`

- 知识页：[arc-core-src-arc-struct-intqueue-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-intqueue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntQueue.java`
- SHA1：`038403a75ac8a123eeb3f7891097b316d52a7fe2`
- 声明：class IntQueue
- 字段线索：size, values, head, tail, needed, newArray
- 方法线索：addLast, addFirst, shrink, ensureCapacity, resize, removeFirst

### `arc-core/src/arc/struct/IntSeq.java`

- 知识页：[arc-core-src-arc-struct-intseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-intseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntSeq.java`
- SHA1：`a3f5b2640d1533ea6d1b61f71c72dc794c73ea57`
- 声明：class IntSeq
- 字段线索：items, size, ordered
- 方法线索：IntSeq, mode, each, count, sum, chunked

### `arc-core/src/arc/struct/IntSet.java`

- 知识页：[arc-core-src-arc-struct-intset-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-intset-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/IntSet.java`
- SHA1：`03e14b31e7a7f402fb442eb0fc75df5ea3874507`
- 声明：class IntSet, class IntSetIterator
- 字段线索：PRIME1, PRIME2, PRIME3, EMPTY, size, loadFactor
- 方法线索：IllegalArgumentException, each, add, addAll, addResize, push

### `arc-core/src/arc/struct/LongMap.java`

- 知识页：[arc-core-src-arc-struct-longmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-longmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/LongMap.java`
- SHA1：`98726e9d2f1f5e3824f8c1d61293e104e34af2c4`
- 声明：class LongMap<V> implements Iterable<LongMap.Entry<V>>, class Entry<V>, class MapIterator<V>
- 字段线索：PRIME1, PRIME2, PRIME3, EMPTY, size, loadFactor
- 方法线索：IllegalArgumentException, put, putAll, putResize, push, putStash

### `arc-core/src/arc/struct/LongQueue.java`

- 知识页：[arc-core-src-arc-struct-longqueue-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-longqueue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/LongQueue.java`
- SHA1：`7a69f06e37c03798db75c045ae8b72408b6f3e48`
- 声明：class LongQueue
- 字段线索：size, values, head, tail, needed, newArray
- 方法线索：addLast, addFirst, shrink, ensureCapacity, resize, removeFirst

### `arc-core/src/arc/struct/LongSeq.java`

- 知识页：[arc-core-src-arc-struct-longseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-longseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/LongSeq.java`
- SHA1：`f462b336ca7bc2ee122f9cfee46e24ebb8b39d59`
- 声明：class LongSeq
- 字段线索：items, size, ordered
- 方法线索：LongSeq, add, addAll, IllegalArgumentException, get, set

### `arc-core/src/arc/struct/ObjectFloatMap.java`

- 知识页：[arc-core-src-arc-struct-objectfloatmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-objectfloatmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectFloatMap.java`
- SHA1：`e33d92e43b160bf66c5e70408f73339dfd4a7da8`
- 声明：class ObjectFloatMap<K> implements Iterable<ObjectFloatMap.Entry<K>>, class Entry<K>, class MapIterator<K>
- 字段线索：PRIME1, PRIME2, PRIME3, size, loadFactor, threshold
- 方法线索：IllegalArgumentException, each, put, putAll, copy, set

### `arc-core/src/arc/struct/ObjectIntMap.java`

- 知识页：[arc-core-src-arc-struct-objectintmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-objectintmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectIntMap.java`
- SHA1：`0174f24f4bee577377f13c3edb0acc7fbc370784`
- 声明：class ObjectIntMap<K> implements Iterable<ObjectIntMap.Entry<K>>, class Entry<K>, class MapIterator<K>
- 字段线索：PRIME1, PRIME2, PRIME3, size, loadFactor, threshold
- 方法线索：IllegalArgumentException, put, putAll, copy, set, putResize

### `arc-core/src/arc/struct/ObjectMap.java`

- 知识页：[arc-core-src-arc-struct-objectmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-objectmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectMap.java`
- SHA1：`20f645e4743098ef2324bd2dd79cc9f1fda44c04`
- 声明：class ObjectMap<K, V> implements Iterable<ObjectMap.Entry<K, V>>, class Entry<K, V>, class MapIterator<K, V, I> implements Iterable<I>, Iterator<I>
- 字段线索：PRIME1, PRIME2, PRIME3, size, loadFactor, threshold
- 方法线索：IllegalArgumentException, each, set, put, putAll, putResize

### `arc-core/src/arc/struct/ObjectSet.java`

- 知识页：[arc-core-src-arc-struct-objectset-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-objectset-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ObjectSet.java`
- SHA1：`d9a1fac74916fb786432b1b1dddc370201ef8119`
- 声明：class ObjectSet<T> implements Iterable<T>, Eachable<T>, class ObjectSetIteratorimplements Iterable<T>, Iterator<T>
- 字段线索：PRIME1, PRIME2, PRIME3, size, loadFactor, threshold
- 方法线索：IllegalArgumentException, copy, select, toSeq, each, find

### `arc-core/src/arc/struct/OrderedMap.java`

- 知识页：[arc-core-src-arc-struct-orderedmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-orderedmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/OrderedMap.java`
- SHA1：`8ad9039de96c0455c4f2daccdf38edc2bfaaa0bd`
- 声明：class OrderedMap<K, V> extends ObjectMap<K, V>, class OrderedMapEntries<K, V> extends Entries<K, V>, class OrderedMapKeys<K> extends Keys<K>
- 字段线索：keys
- 方法线索：put, remove, removeIndex, clear, orderedKeys, values

### `arc-core/src/arc/struct/OrderedSet.java`

- 知识页：[arc-core-src-arc-struct-orderedset-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-orderedset-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/OrderedSet.java`
- SHA1：`c0af7ce0a7a0033c3f92c230f69bb45f5a02286c`
- 声明：class OrderedSet<T> extends ObjectSet<T>, class OrderedSetIteratorextends ObjectSetIterator
- 字段线索：items
- 方法线索：first, add, remove, removeIndex, clear, orderedItems

### `arc-core/src/arc/struct/PQueue.java`

- 知识页：[arc-core-src-arc-struct-pqueue-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-pqueue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/PQueue.java`
- SHA1：`66bc09e775a4ac28f6fb08ae365fbbc2a17cc192`
- 声明：class PQueue<E>
- 字段线索：CAPACITY_RATIO_LOW, CAPACITY_RATIO_HI, queue, size, comparator
- 方法线索：empty, add, peek, get, size, clear

### `arc-core/src/arc/struct/Queue.java`

- 知识页：[arc-core-src-arc-struct-queue-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-queue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/Queue.java`
- SHA1：`e50c21449b29f1612fbdfb07d15fd01bc3c84abb`
- 声明：class Queue<T> implements Iterable<T>, Eachable<T>, class QueueIterable<T> implements Iterable<T>, class QueueIteratorimplements Iterator<T>, Iterable<T>
- 字段线索：size, values, head, tail, iterable, needed
- 方法线索：toArray, addLast, add, addFirst, shrink, ensureCapacity

### `arc-core/src/arc/struct/Seq.java`

- 知识页：[arc-core-src-arc-struct-seq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-seq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/Seq.java`
- SHA1：`8725fa77002878be16ba38e08dca816273502c84`
- 声明：class Seq<T> implements Iterable<T>, Eachable<T>, class SeqIterable<T> implements Iterable<T>, class SeqIteratorimplements Iterator<T>
- 字段线索：iteratorsAllocated, items, size, ordered, iterable, array
- 方法线索：asSet, copy, list, sumf, sum, each

### `arc-core/src/arc/struct/ShortSeq.java`

- 知识页：[arc-core-src-arc-struct-shortseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-shortseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/ShortSeq.java`
- SHA1：`512dc1b4fd48c7776b2b69c89feefd11d9c0dd75`
- 声明：class ShortSeq
- 字段线索：items, size, ordered
- 方法线索：ShortSeq, add, addAll, IllegalArgumentException, get, set

### `arc-core/src/arc/struct/SnapshotSeq.java`

- 知识页：[arc-core-src-arc-struct-snapshotseq-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-snapshotseq-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/SnapshotSeq.java`
- SHA1：`19203ea42aa113caefe94c46647fb3de7f8bec45`
- 声明：class SnapshotSeq<T> extends Seq<T>
- 字段线索：recycled, snapshots
- 方法线索：begin, end, modified, set, insert, swap

### `arc-core/src/arc/struct/Sort.java`

- 知识页：[arc-core-src-arc-struct-sort-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-sort-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/Sort.java`
- SHA1：`e8a0860ba970224fdb8dcaa312d573231b6ef9e7`
- 声明：class Sort
- 字段线索：instance, timSort, comparableTimSort
- 方法线索：未抽取

### `arc-core/src/arc/struct/StringMap.java`

- 知识页：[arc-core-src-arc-struct-stringmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-stringmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/StringMap.java`
- SHA1：`2e68c303b40c5e8904362c463e7e049584a5ee40`
- 声明：class StringMapextends ObjectMap<String, String>
- 字段线索：未抽取
- 方法线索：getBool, getInt, getFloat, getLong

### `arc-core/src/arc/struct/TimSort.java`

- 知识页：[arc-core-src-arc-struct-timsort-java.md](../mindustry-source-files/arc/arc-core-src-arc-struct-timsort-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/struct/TimSort.java`
- SHA1：`d45ad2804601d0f674009fd435fb09cc0e41c6ab`
- 声明：class TimSort<T>
- 字段线索：MIN_MERGE, MIN_GALLOP, INITIAL_TMP_STORAGE_LENGTH, DEBUG, runBase, runLen
- 方法线索：IllegalArgumentException, doSort, pushRun, mergeCollapse, mergeForceCollapse, mergeAt


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
