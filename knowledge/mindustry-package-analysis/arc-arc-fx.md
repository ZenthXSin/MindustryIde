# Package `arc.fx` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.fx`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.fx`
- 文件数：2

## 主要依赖线索

- `arc.*` × 2
- `arc.graphics.*` × 2
- `arc.graphics.g2d.*` × 2
- `arc.graphics.gl.*` × 2
- `arc.util.*` × 2
- `arc.files.*` × 1
- `arc.fx.util.*` × 1
- `arc.graphics.Pixmap.*` × 1
- `arc.graphics.Texture.*` × 1
- `arc.struct.*` × 1

## 文件逐个分析

### `extensions/fx/src/arc/fx/FxFilter.java`

- 知识页：[extensions-fx-src-arc-fx-fxfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-fxfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/FxFilter.java`
- SHA1：`d2394841782bfe99fd6ba8ee05d1ae65ea613e05`
- 声明：class FxFilterimplements Disposable
- 字段线索：u_texture0, u_texture1, u_texture2, u_texture3, shader, inputTexture
- 方法线索：Shader, setInput, setOutput, dispose, resize, rebind

### `extensions/fx/src/arc/fx/FxProcessor.java`

- 知识页：[extensions-fx-src-arc-fx-fxprocessor-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-fxprocessor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/FxProcessor.java`
- SHA1：`e6708acf5978727f53a3e9e534932edad965d233`
- 声明：class FxProcessorimplements Disposable
- 字段线索：priorities, effectsAll, effectsEnabled, bufferRenderer, fboFormat, pingPongBuffer
- 方法线索：dispose, resize, rebind, getWidth, getHeight, isDisabled


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
