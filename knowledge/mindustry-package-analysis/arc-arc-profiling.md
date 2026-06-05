# Package `arc.profiling` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.profiling`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.profiling`
- 文件数：5

## 主要依赖线索

- `arc.*` × 2
- `arc.graphics.*` × 2
- `java.nio.*` × 2
- `arc.math.FloatCounter` × 2
- `arc.util.*` × 1
- `arc.graphics.GL20` × 1
- `arc.Graphics` × 1
- `arc.graphics.GL30` × 1

## 文件逐个分析

### `extensions/profiling/src/arc/profiling/GL20Interceptor.java`

- 知识页：[extensions-profiling-src-arc-profiling-gl20interceptor-java.md](../mindustry-source-files/arc/extensions-profiling-src-arc-profiling-gl20interceptor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/profiling/src/arc/profiling/GL20Interceptor.java`
- SHA1：`98288bf13ee0c9fbbd02641f2bd5aeb763b0a2fa`
- 声明：class GL20Interceptorextends GLInterceptor implements GL20
- 字段线索：gl20
- 方法线索：check, glActiveTexture, glBindTexture, glBlendFunc, glClear, glClearColor

### `extensions/profiling/src/arc/profiling/GL30Interceptor.java`

- 知识页：[extensions-profiling-src-arc-profiling-gl30interceptor-java.md](../mindustry-source-files/arc/extensions-profiling-src-arc-profiling-gl30interceptor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/profiling/src/arc/profiling/GL30Interceptor.java`
- SHA1：`6a57d53900ce0119121df6d0c33352404c704488`
- 声明：class GL30Interceptorextends GLInterceptor implements GL30
- 字段线索：gl30, result
- 方法线索：check, glActiveTexture, glBindTexture, glBlendFunc, glClear, glClearColor

### `extensions/profiling/src/arc/profiling/GLErrorListener.java`

- 知识页：[extensions-profiling-src-arc-profiling-glerrorlistener-java.md](../mindustry-source-files/arc/extensions-profiling-src-arc-profiling-glerrorlistener-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/profiling/src/arc/profiling/GLErrorListener.java`
- SHA1：`890ec789b10c0f2080d922701aff04dc30fa3a7e`
- 声明：interface GLErrorListener
- 字段线索：stack, glMethod
- 方法线索：RuntimeException

### `extensions/profiling/src/arc/profiling/GLInterceptor.java`

- 知识页：[extensions-profiling-src-arc-profiling-glinterceptor-java.md](../mindustry-source-files/arc/extensions-profiling-src-arc-profiling-glinterceptor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/profiling/src/arc/profiling/GLInterceptor.java`
- SHA1：`e4ed44087516c6a4cbe11addf3902d24c2f80f39`
- 声明：class GLInterceptorimplements GL20
- 字段线索：vertexCount, calls, textureBindings, drawCalls, shaderSwitches, stateChanges
- 方法线索：reset

### `extensions/profiling/src/arc/profiling/GLProfiler.java`

- 知识页：[extensions-profiling-src-arc-profiling-glprofiler-java.md](../mindustry-source-files/arc/extensions-profiling-src-arc-profiling-glprofiler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/profiling/src/arc/profiling/GLProfiler.java`
- SHA1：`159f16aff0c82fe8e5db4812abfd2d91c22245c3`
- 声明：class GLProfiler
- 字段线索：graphics, glInterceptor, listener, enabled
- 方法线索：enable, disable, getListener, setListener, isEnabled, getCalls


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
