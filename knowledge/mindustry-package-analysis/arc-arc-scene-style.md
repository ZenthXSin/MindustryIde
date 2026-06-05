# Package `arc.scene.style` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.scene.style`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

输入输出包：负责存档、地图、序列化、导入导出与版本兼容。

## 规模

- 仓库：`arc`
- Package：`arc.scene.style`
- 文件数：8

## 主要依赖线索

- `arc.graphics.Color` × 2
- `arc.graphics.g2d.NinePatch` × 2
- `arc.scene.ui.layout.*` × 2
- `arc.graphics.g2d.Draw` × 2
- `arc.graphics.g2d.TextureRegion` × 2
- `arc.util.Tmp` × 2
- `arc.graphics.*` × 1

## 文件逐个分析

### `arc-core/src/arc/scene/style/BaseDrawable.java`

- 知识页：[arc-core-src-arc-scene-style-basedrawable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-basedrawable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/BaseDrawable.java`
- SHA1：`0e9aef41c122cdfc2adaad978deaa91c91f2afbf`
- 声明：class BaseDrawableimplements Drawable
- 字段线索：name, minHeight
- 方法线索：draw, getLeftWidth, setLeftWidth, getRightWidth, setRightWidth, getTopHeight

### `arc-core/src/arc/scene/style/Drawable.java`

- 知识页：[arc-core-src-arc-scene-style-drawable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-drawable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/Drawable.java`
- SHA1：`87ce55c1bd0dac91f68559e2be7e193e81f52f74`
- 声明：interface Drawable
- 字段线索：未抽取
- 方法线索：imageSize

### `arc-core/src/arc/scene/style/NinePatchDrawable.java`

- 知识页：[arc-core-src-arc-scene-style-ninepatchdrawable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-ninepatchdrawable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/NinePatchDrawable.java`
- SHA1：`9a34325d481354e78381cd5886108c9bcf2a080e`
- 声明：class NinePatchDrawableextends BaseDrawable implements TransformDrawable
- 字段线索：patch
- 方法线索：draw, getPatch, setPatch, tint

### `arc-core/src/arc/scene/style/ScaledNinePatchDrawable.java`

- 知识页：[arc-core-src-arc-scene-style-scaledninepatchdrawable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-scaledninepatchdrawable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/ScaledNinePatchDrawable.java`
- SHA1：`ebd8b274f78f3d7f92d52d27edcdda843b474ef4`
- 声明：class ScaledNinePatchDrawableextends NinePatchDrawable
- 字段线索：scale
- 方法线索：draw, setPatch, getLeftWidth, getRightWidth, getTopHeight, getBottomHeight

### `arc-core/src/arc/scene/style/Style.java`

- 知识页：[arc-core-src-arc-scene-style-style-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-style-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/Style.java`
- SHA1：`c491bca208102fae07efda6eb90e79570bdf3980`
- 声明：class Style
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/scene/style/TextureRegionDrawable.java`

- 知识页：[arc-core-src-arc-scene-style-textureregiondrawable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-textureregiondrawable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/TextureRegionDrawable.java`
- SHA1：`534fd5582a4b3b54447af9422a2eaf4c0ea29cb6`
- 声明：class TextureRegionDrawableextends BaseDrawable implements TransformDrawable
- 字段线索：region, tint, scale
- 方法线索：imageSize, draw, set, getRegion, setRegion, tint

### `arc-core/src/arc/scene/style/TiledDrawable.java`

- 知识页：[arc-core-src-arc-scene-style-tileddrawable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-tileddrawable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/TiledDrawable.java`
- SHA1：`acd68f0c94a46fccaef9b312cf062669da6d32a7`
- 声明：class TiledDrawableextends TextureRegionDrawable
- 字段线索：color, tileHeight
- 方法线索：setRegion, setTileSize, draw, UnsupportedOperationException, getColor, tint

### `arc-core/src/arc/scene/style/TransformDrawable.java`

- 知识页：[arc-core-src-arc-scene-style-transformdrawable-java.md](../mindustry-source-files/arc/arc-core-src-arc-scene-style-transformdrawable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/scene/style/TransformDrawable.java`
- SHA1：`67cbcd67988828c5bde5a619debef8ed1f412e2c`
- 声明：interface TransformDrawableextends Drawable
- 字段线索：未抽取
- 方法线索：draw


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
