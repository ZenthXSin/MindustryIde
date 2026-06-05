# arc:arc-core/src/arc/util/serialization/Jval.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/Jval.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/util/serialization/Jval.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/Jval.java`
- SHA1：`daf133422277b0cf380ba88785d2a035404732eb`
- 大小：41329 bytes
- 行数：1166

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class Jval`。

关键词：arc

## Package

`arc.util.serialization`

## 类型声明

- `class Jval`
- `class JsonMapextends ArrayMap<String, Jval>`
- `class JsonArrayextends Seq<Jval>`
- `class WritingBufferextends Writer`
- `enum Jformat`
- `enum Jtype`
- `class Hparser`
- `class JsonParseExceptionextends RuntimeException`

## 字段线索

- `TRUE`
- `value`
- `writer`
- `buffer`
- `fill`
- `reader`
- `index`
- `line`
- `lineOffset`
- `current`
- `peek`
- `capture`
- `isArray`
- `offset`
- `column`
- `needsEscapeName`

## 方法线索

- `Jval`
- `Hparser`
- `ArcRuntimeException`
- `RuntimeException`
- `getType`
- `isObject`
- `isArray`
- `isNumber`
- `isString`
- `isBoolean`
- `isTrue`
- `isFalse`
- `isNull`
- `asObject`
- `asArray`
- `asInt`
- `asLong`
- `asFloat`
- `asDouble`
- `asString`
- `asBool`
- `asNumber`
- `get`
- `add`
- `put`
- `remove`
- `has`
- `getInt`
- `getLong`
- `getFloat`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
