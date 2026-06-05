# Package `arc.util` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.util`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

UI 包：负责 Scene2D 界面、Fragments、Dialogs、Styles 与编辑器界面。

## 规模

- 仓库：`arc`
- Package：`arc.util`
- 文件数：38

## 主要依赖线索

- `arc.struct.*` × 10
- `arc.func.*` × 6
- `java.io.*` × 5
- `java.util.*` × 5
- `arc.*` × 4
- `arc.math.*` × 4
- `java.nio.*` × 3
- `arc.struct.Seq` × 3
- `arc.util.io.*` × 3
- `java.lang.reflect.*` × 3
- `arc.graphics.*` × 3
- `java.net.*` × 2
- `java.util.concurrent.*` × 2
- `arc.files.*` × 2
- `java.util.Comparator` × 2
- `arc.Core` × 2
- `arc.struct.ObjectMap` × 1
- `arc.func.Cons` × 1
- `java.util.Arrays` × 1
- `java.io.PrintWriter` × 1

## 文件逐个分析

### `arc-core/src/arc/util/Align.java`

- 知识页：[arc-core-src-arc-util-align-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-align-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Align.java`
- SHA1：`96a74a9491914b4e0ce91cc7d64dcc103886e493`
- 声明：class Align
- 字段线索：center, top, bottom, left, right, topLeft
- 方法线索：未抽取

### `arc-core/src/arc/util/ArcNativesLoader.java`

- 知识页：[arc-core-src-arc-util-arcnativesloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-arcnativesloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/ArcNativesLoader.java`
- SHA1：`68392f4a736c387025ff204ed92f6602982dcde9`
- 声明：class ArcNativesLoader
- 字段线索：disableNativesLoading, loaded
- 方法线索：未抽取

### `arc-core/src/arc/util/ArcRuntimeException.java`

- 知识页：[arc-core-src-arc-util-arcruntimeexception-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-arcruntimeexception-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/ArcRuntimeException.java`
- SHA1：`865d889df4e7691a0d723804aed218a51bdbda11`
- 声明：class ArcRuntimeExceptionextends RuntimeException
- 字段线索：serialVersionUID
- 方法线索：未抽取

### `arc-core/src/arc/util/Bench.java`

- 知识页：[arc-core-src-arc-util-bench-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-bench-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Bench.java`
- SHA1：`dd931ea8ccc4dc861117ffc4726d37bef1a670f2`
- 声明：class Bench
- 字段线索：totalStart, lastName, times, last
- 方法线索：未抽取

### `arc-core/src/arc/util/Buffers.java`

- 知识页：[arc-core-src-arc-util-buffers-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-buffers-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Buffers.java`
- SHA1：`a98d5eb918a425519eec359aa5a98530c6243d1c`
- 声明：class Buffers
- 字段线索：unsafeBuffers, allocatedUnsafe
- 方法线索：ArcRuntimeException, IllegalArgumentException

### `arc-core/src/arc/util/ColorCodes.java`

- 知识页：[arc-core-src-arc-util-colorcodes-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-colorcodes-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/ColorCodes.java`
- SHA1：`00fa8bb0fd075ef8ec7fd56d8e1beb0143edb644`
- 声明：class ColorCodes
- 字段线索：flush, values
- 方法线索：未抽取

### `arc-core/src/arc/util/CommandHandler.java`

- 知识页：[arc-core-src-arc-util-commandhandler-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-commandhandler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/CommandHandler.java`
- SHA1：`38d347b82432f1437ddb0423d9f187f8ee79203a`
- 声明：class CommandHandler, enum ResponseType, class Command
- 字段线索：prefix, commands, orderedCommands, text, paramText, description
- 方法线索：setPrefix, getPrefix, handleMessage, CommandResponse, removeCommand, register

### `arc-core/src/arc/util/Disposable.java`

- 知识页：[arc-core-src-arc-util-disposable-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-disposable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Disposable.java`
- SHA1：`0ae9b802acf29d82b85227f68b02e82585c55678`
- 声明：interface Disposable
- 字段线索：未抽取
- 方法线索：isDisposed

### `arc-core/src/arc/util/Eachable.java`

- 知识页：[arc-core-src-arc-util-eachable-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-eachable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Eachable.java`
- SHA1：`9cdf45b8e49e49a910f0925bb1f23c916bb1e99d`
- 声明：interface Eachable<T>
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/Http.java`

- 知识页：[arc-core-src-arc-util-http-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-http-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Http.java`
- SHA1：`344be80ddeb27aa5fbeef520a17b25840f66124b`
- 声明：class Http, class HttpResponse, class HttpRequest
- 字段线索：exec, connection, status, method, url, headers
- 方法线索：HttpRequest, getContentLength, getResult, getResultAsString, getResultAsStream, getStatus

### `arc-core/src/arc/util/I18NBundle.java`

- 知识页：[arc-core-src-arc-util-i18nbundle-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-i18nbundle-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/I18NBundle.java`
- SHA1：`036c127f424099ecb684fad9128b0d57abf4e525`
- 声明：class I18NBundle
- 字段线索：DEFAULT_ENCODING, ROOT_LOCALE, simpleFormatter, parent, locale, properties
- 方法线索：MissingResourceException, load, getLocale, setLocale, get, getOrNull

### `arc-core/src/arc/util/Interval.java`

- 知识页：[arc-core-src-arc-util-interval-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-interval-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Interval.java`
- SHA1：`bb464f384a5167d8d553a3c2d90e0b416d3cb6fd`
- 声明：class Interval
- 字段线索：未抽取
- 方法线索：get, check, reset, clear, getTime, getTimes

### `arc-core/src/arc/util/Log.java`

- 知识页：[arc-core-src-arc-util-log-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-log-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Log.java`
- SHA1：`f6fb314322cabeebd9a60d563d5681a1bc5df0cc`
- 声明：class Log, enum LogLevel, interface LogFormatter
- 字段线索：empty, useColors, level, logger, formatter
- 方法线索：format, log

### `arc-core/src/arc/util/Nullable.java`

- 知识页：[arc-core-src-arc-util-nullable-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-nullable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Nullable.java`
- SHA1：`b07a775968f9e7ffa89e7f421287465939c463cb`
- 声明：Nullable.java
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/OS.java`

- 知识页：[arc-core-src-arc-util-os-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-os-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/OS.java`
- SHA1：`994ea70d327a3054da7845d3ecfdd64157822b33`
- 声明：class OS
- 字段线索：cores, username, userHome, osName, osVersion, osArch
- 方法线索：RuntimeException

### `arc-core/src/arc/util/Pack.java`

- 知识页：[arc-core-src-arc-util-pack-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-pack-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Pack.java`
- SHA1：`c5029ef9b0acf7fd1dd8463117808daa2364850d`
- 声明：class Pack
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/PerformanceCounter.java`

- 知识页：[arc-core-src-arc-util-performancecounter-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-performancecounter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/PerformanceCounter.java`
- SHA1：`993a9318bc84c4473b58c1915f0dd0f6fb14b7ca`
- 声明：class PerformanceCounter
- 字段线索：nano2seconds, time, load, name, current, valid
- 方法线索：tick, start, stop, reset, toString, commas

### `arc-core/src/arc/util/PerformanceCounters.java`

- 知识页：[arc-core-src-arc-util-performancecounters-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-performancecounters-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/PerformanceCounters.java`
- SHA1：`3dbe7ae283dea4eafe6462baab1d654495faf315`
- 声明：class PerformanceCounters
- 字段线索：nano2seconds, counters, lastTick, t
- 方法线索：add, tick, toString

### `arc-core/src/arc/util/QuickSelect.java`

- 知识页：[arc-core-src-arc-util-quickselect-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-quickselect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/QuickSelect.java`
- SHA1：`703897368054678212f35c2723e6c90bce104aba`
- 声明：class QuickSelect<T>
- 字段线索：array, comp
- 方法线索：select, partition, recursiveSelect, medianOfThreePivot, swap

### `arc-core/src/arc/util/Ratekeeper.java`

- 知识页：[arc-core-src-arc-util-ratekeeper-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-ratekeeper-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Ratekeeper.java`
- SHA1：`99243dd1a20cf03e9a6fd411621e990298116003`
- 声明：class Ratekeeper
- 字段线索：occurences, lastTime
- 方法线索：allow, reset

### `arc-core/src/arc/util/Reflect.java`

- 知识页：[arc-core-src-arc-util-reflect-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-reflect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Reflect.java`
- SHA1：`52bb961e10f29680f88324df243924ef0131797a`
- 声明：class Reflect
- 字段线索：未抽取
- 方法线索：RuntimeException

### `arc-core/src/arc/util/Scaling.java`

- 知识页：[arc-core-src-arc-util-scaling-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-scaling-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Scaling.java`
- SHA1：`d6c11ee62a5c6e691389b0c11d3b59abfc3003e0`
- 声明：enum Scaling
- 字段线索：temp
- 方法线索：apply

### `arc-core/src/arc/util/ScreenRecorder.java`

- 知识页：[arc-core-src-arc-util-screenrecorder-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-screenrecorder-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/ScreenRecorder.java`
- SHA1：`b0a8fae06cc6624a727ae33af21e8f53cc17dce6`
- 声明：class ScreenRecorder
- 字段线索：record
- 方法线索：未抽取

### `arc-core/src/arc/util/ScreenUtils.java`

- 知识页：[arc-core-src-arc-util-screenutils-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-screenutils-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/ScreenUtils.java`
- SHA1：`c7b1ce1ff08a28311caf651696e82a4f6eee64a0`
- 声明：class ScreenUtils
- 字段线索：w, h, potW, potH, pixmap, potPixmap
- 方法线索：未抽取

### `arc-core/src/arc/util/Select.java`

- 知识页：[arc-core-src-arc-util-select-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-select-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Select.java`
- SHA1：`221ad68dec563e87b9a97956239315eb46b10573`
- 声明：class Select
- 字段线索：instance, quickSelect
- 方法线索：ArcRuntimeException

### `arc-core/src/arc/util/SharedLibraryLoader.java`

- 知识页：[arc-core-src-arc-util-sharedlibraryloader-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-sharedlibraryloader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/SharedLibraryLoader.java`
- SHA1：`3dd2aef3225e7addafb2fcded9290710973bf5a6`
- 声明：class SharedLibraryLoader
- 字段线索：loadedLibraries, nativesJar
- 方法线索：crc, mapLibraryName, load, ArcRuntimeException, readFile, extractFile

### `arc-core/src/arc/util/Strings.java`

- 知识页：[arc-core-src-arc-util-strings-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-strings-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Strings.java`
- SHA1：`df0f35823e1c98ba65d925316836eb50f148ecac`
- 声明：class Strings
- 字段线索：tmp1, filenamePattern, utf8
- 方法线索：RuntimeException, stringify, String, IllegalArgumentException

### `arc-core/src/arc/util/Structs.java`

- 知识页：[arc-core-src-arc-util-structs-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-structs-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Structs.java`
- SHA1：`ea537ecc3bfb09b522ce0dba04f3555a097dfe64`
- 声明：class Structs
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/util/TaskQueue.java`

- 知识页：[arc-core-src-arc-util-taskqueue-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-taskqueue-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/TaskQueue.java`
- SHA1：`bd5d70901eac73b27aa4068b7b214fcc54885421`
- 声明：class TaskQueue
- 字段线索：runnables, executedRunnables
- 方法线索：run, size, clear, post

### `arc-core/src/arc/util/TextFormatter.java`

- 知识页：[arc-core-src-arc-util-textformatter-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-textformatter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/TextFormatter.java`
- SHA1：`0fddc114f253f934cbae50ff01deb2ee2015915a`
- 声明：class TextFormatter
- 字段线索：messageFormat, buffer
- 方法线索：format, replaceEscapeChars, simpleFormat, IllegalArgumentException

### `arc-core/src/arc/util/Threads.java`

- 知识页：[arc-core-src-arc-util-threads-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-threads-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Threads.java`
- SHA1：`f74feda1d56a7da6051159c07504546204262590`
- 声明：class Threads
- 字段线索：未抽取
- 方法线索：initialValue, ArcRuntimeException, ThreadPoolExecutor, RuntimeException

### `arc-core/src/arc/util/Time.java`

- 知识页：[arc-core-src-arc-util-time-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-time-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Time.java`
- SHA1：`9811efc1a7daa94660592d7c07e4cf86122cf9ce`
- 声明：class Time, class DelayRunimplements Poolable
- 字段线索：toSeconds, delta, globalTime, nanosPerMilli, globalTimeRaw, runs
- 方法线索：reset

### `arc-core/src/arc/util/Timekeeper.java`

- 知识页：[arc-core-src-arc-util-timekeeper-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-timekeeper-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Timekeeper.java`
- SHA1：`3444749851c4aea86a76f396f619693a7a56a5d2`
- 声明：class Timekeeper
- 字段线索：intervalMs, lastTime
- 方法线索：Timekeeper, poll, get, reset

### `arc-core/src/arc/util/Timer.java`

- 知识页：[arc-core-src-arc-util-timer-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-timer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Timer.java`
- SHA1：`808d12a848271ef94dca1cc9a7578855b3823f46`
- 声明：class Timer, class Taskimplements Runnable, class TimerThreadimplements Runnable, ApplicationListener
- 字段线索：threadLock, thread, tasks, app, timer, files
- 方法线索：run, postTask, scheduleTask, stop, start, update

### `arc-core/src/arc/util/Tmp.java`

- 知识页：[arc-core-src-arc-util-tmp-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-tmp-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/Tmp.java`
- SHA1：`cf48fe6b849d64f05fb052f3752cb3db51e0d696`
- 声明：class Tmp
- 字段线索：v1, v2, v3, v4, v5, v6
- 方法线索：未抽取

### `arc-core/src/arc/util/UnsafeRunnable.java`

- 知识页：[arc-core-src-arc-util-unsaferunnable-java.md](../mindustry-source-files/arc/arc-core-src-arc-util-unsaferunnable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/util/UnsafeRunnable.java`
- SHA1：`24bf50d745ec8d751f3eed86346f0b586e67f84e`
- 声明：interface UnsafeRunnable
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/unsafe/Java16Buffers.java`

- 知识页：[arc-core-unsafe-java16buffers-java.md](../mindustry-source-files/arc/arc-core-unsafe-java16buffers-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/unsafe/Java16Buffers.java`
- SHA1：`3728d987202f5cca6f9db9082c8f13f35ff15913`
- 声明：class Java16Buffers
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/unsafe/UnsafeBuffers.java`

- 知识页：[arc-core-unsafe-unsafebuffers-java.md](../mindustry-source-files/arc/arc-core-unsafe-unsafebuffers-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/unsafe/UnsafeBuffers.java`
- SHA1：`40a5dd6ee41e8787457bc539f21a10d26c3a3cae`
- 声明：class UnsafeBuffers
- 字段线索：unsafe, bufferOffset, initialized
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
