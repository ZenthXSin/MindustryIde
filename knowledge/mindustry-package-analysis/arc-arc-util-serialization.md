# Package `arc.util.serialization` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.util.serialization`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.util.serialization`
- 文件数：11

## 主要依赖线索

- `arc.util.*` × 5
- `java.io.*` × 4
- `java.io.IOException` × 4
- `arc.util.serialization.JsonWriter.*` × 3
- `arc.struct.*` × 3
- `arc.util.Strings` × 3
- `arc.files.Fi` × 2
- `java.io.InputStream` × 2
- `arc.files.*` × 2
- `arc.util.io.*` × 2
- `arc.struct.Seq` × 2
- `java.io.Writer` × 2
- `arc.struct.IntSet.*` × 1
- `arc.struct.ObjectMap.*` × 1
- `arc.struct.Queue` × 1
- `arc.struct.OrderedMap.*` × 1
- `arc.util.Timer` × 1
- `arc.util.serialization.JsonValue.*` × 1
- `java.lang.reflect.*` × 1
- `java.util.*` × 1

## 文件逐个分析

### `arc-core/src/arc/util/serialization/Base64Coder.java`

- 知识页：[arc-core-src-arc-util-serialization-base64coder-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-base64coder-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/Base64Coder.java`
- SHA1：`8c9e426550fa1b88ba9e0bcf9ceaf03d47f8b903`
- 声明：class Base64Coder, class CharMap
- 字段线索：regularMap, systemLineSeparator, encodingMap, decodingMap
- 方法线索：String, IllegalArgumentException, getDecodingMap, getEncodingMap

### `arc-core/src/arc/util/serialization/BaseJsonReader.java`

- 知识页：[arc-core-src-arc-util-serialization-basejsonreader-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-basejsonreader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/BaseJsonReader.java`
- SHA1：`dd7ed8492ddbb4dfbd1d1a082df779d1bed3985e`
- 声明：interface BaseJsonReader
- 字段线索：未抽取
- 方法线索：parse

### `arc-core/src/arc/util/serialization/BaseJsonWriter.java`

- 知识页：[arc-core-src-arc-util-serialization-basejsonwriter-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-basejsonwriter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/BaseJsonWriter.java`
- SHA1：`a46932c94856f6c4f322d220f0894eecd5ab5fcf`
- 声明：interface BaseJsonWriterextends Closeable
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/serialization/Json.java`

- 知识页：[arc-core-src-arc-util-serialization-json-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-json-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/Json.java`
- SHA1：`aa97c1cec46a28beb545aeee7d370efee7088add`
- 声明：class Json, interface Serializer<T>, interface JsonSerializable
- 字段线索：debug, typeToFields, tagToClass, classToTag, classToSerializer, classToDefaultValues
- 方法线索：getIgnoreUnknownFields, setIgnoreUnknownFields, setIgnoreDeprecated, setReadDeprecated, setOutputType, setQuoteLongValues

### `arc-core/src/arc/util/serialization/JsonReader.java`

- 知识页：[arc-core-src-arc-util-serialization-jsonreader-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-jsonreader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/JsonReader.java`
- SHA1：`e8f92f8d482f9a2bf47fad9f7353ff0f97e3854e`
- 声明：class JsonReaderimplements BaseJsonReader
- 字段线索：json_start, json_first_final, json_error, json_en_object, json_en_array, json_en_main
- 方法线索：parse, SerializationException, addChild, startObject, startArray, pop

### `arc-core/src/arc/util/serialization/JsonValue.java`

- 知识页：[arc-core-src-arc-util-serialization-jsonvalue-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-jsonvalue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/JsonValue.java`
- SHA1：`38d6bdd1f37a8d473af9fb227a65ea2065a9e56d`
- 声明：class JsonValueimplements Iterable<JsonValue>, enum ValueType, class PrettyPrintSettings
- 字段线索：name, parent, size, type, stringValue, doubleValue
- 方法线索：get, has, require, remove, asString, asFloat

### `arc-core/src/arc/util/serialization/JsonWriter.java`

- 知识页：[arc-core-src-arc-util-serialization-jsonwriter-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-jsonwriter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/JsonWriter.java`
- SHA1：`13f5678f4b2128882832945f8aef2df831ae90d7`
- 声明：class JsonWriterextends Writer implements BaseJsonWriter, enum OutputType, class JsonObject
- 字段线索：writer, stack, current, named, outputType, quoteLongValues
- 方法线索：getWriter, setOutputType, setQuoteLongValues, name, object, array

### `arc-core/src/arc/util/serialization/Jval.java`

- 知识页：[arc-core-src-arc-util-serialization-jval-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-jval-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/Jval.java`
- SHA1：`daf133422277b0cf380ba88785d2a035404732eb`
- 声明：class Jval, class JsonMapextends ArrayMap<String, Jval>, class JsonArrayextends Seq<Jval>
- 字段线索：TRUE, value, writer, buffer, fill, reader
- 方法线索：Jval, Hparser, ArcRuntimeException, RuntimeException, getType, isObject

### `arc-core/src/arc/util/serialization/SerializationException.java`

- 知识页：[arc-core-src-arc-util-serialization-serializationexception-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-serializationexception-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/SerializationException.java`
- SHA1：`71c9ab9413b62ee0620283d2be4efcd261c49f83`
- 声明：class SerializationExceptionextends RuntimeException
- 字段线索：trace
- 方法线索：causedBy, getMessage, addTrace

### `arc-core/src/arc/util/serialization/UBJsonReader.java`

- 知识页：[arc-core-src-arc-util-serialization-ubjsonreader-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-ubjsonreader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/UBJsonReader.java`
- SHA1：`8896e02ca136b841f9960c1a30258279c70de470`
- 声明：class UBJsonReaderimplements BaseJsonReader
- 字段线索：val, key, child, dataType, size, result
- 方法线索：parse, SerializationException, parseWihoutClosing, JsonValue, ArcRuntimeException, parseArray

### `arc-core/src/arc/util/serialization/UBJsonWriter.java`

- 知识页：[arc-core-src-arc-util-serialization-ubjsonwriter-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-serialization-ubjsonwriter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/serialization/UBJsonWriter.java`
- SHA1：`58a83d8e25a8065fb9c286533d4c6a983ec68c80`
- 声明：class UBJsonWriterimplements Closeable, BaseJsonWriter, class JsonObject
- 字段线索：out, stack, current, named, array
- 方法线索：reset, object, array, name, value, IOException


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
