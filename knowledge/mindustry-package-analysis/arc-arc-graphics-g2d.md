# Package `arc.graphics.g2d` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.graphics.g2d`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.graphics.g2d`
- 文件数：21

## 主要依赖线索

- `arc.graphics.*` × 17
- `arc.graphics.gl.*` × 9
- `arc.*` × 9
- `arc.math.*` × 8
- `arc.util.*` × 8
- `arc.struct.*` × 7
- `arc.math.geom.*` × 6
- `arc.struct.Seq` × 5
- `arc.math.Mathf` × 3
- `arc.graphics.Texture.TextureFilter` × 3
- `arc.struct.FloatSeq` × 3
- `java.util.*` × 3
- `arc.files.Fi` × 2
- `arc.graphics.g2d.GlyphLayout.GlyphRun` × 2
- `arc.util.ArcRuntimeException` × 2
- `arc.graphics.g2d.Font.FontData` × 2
- `arc.graphics.g2d.Font.Glyph` × 2
- `arc.util.Align` × 2
- `arc.util.pooling.Pools` × 2
- `java.util.concurrent.*` × 2

## 文件逐个分析

### `arc-core/src/arc/graphics/g2d/Animation.java`

- 知识页：[arc-core-src-arc-graphics-g2d-animation-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-animation-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/Animation.java`
- SHA1：`9fadf36a4960abd7374eb5ebdbebbc3dc65df18e`
- 声明：class Animation<T>, enum PlayMode
- 字段线索：frameDuration, animationDuration, lastFrameNumber, lastStateTime, playMode
- 方法线索：getKeyFrame, getKeyFrameIndex, getKeyFrames, setKeyFrames, getPlayMode, setPlayMode

### `arc-core/src/arc/graphics/g2d/Batch.java`

- 知识页：[arc-core-src-arc-graphics-g2d-batch-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-batch-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/Batch.java`
- SHA1：`64200578a274ed93d85c46ab85547c6c46240c75`
- 声明：class Batchimplements Disposable
- 字段线索：z, idx, lastTexture, apply, transformMatrix, projectionMatrix
- 方法线索：z, setSort, setPackedColor, getPackedColor, setPackedMixColor, getPackedMixColor

### `arc-core/src/arc/graphics/g2d/Bloom.java`

- 知识页：[arc-core-src-arc-graphics-g2d-bloom-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-bloom-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/Bloom.java`
- SHA1：`436fbfa358054f7554fd4f2da4da8b4b222f2bd7`
- 声明：class Bloom
- 字段线索：blurPasses, blending, blurShader, pingPong2, threshold, capturing
- 方法线索：resume, resize, init, setClearColor, capture, capturePause

### `arc-core/src/arc/graphics/g2d/CacheBatch.java`

- 知识页：[arc-core-src-arc-graphics-g2d-cachebatch-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-cachebatch-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/CacheBatch.java`
- SHA1：`6b0f8b3130df8d1c6ed1fd77e4819e8648fae0bd`
- 声明：class CacheBatchextends Batch
- 字段线索：未抽取
- 方法线索：flush, setPackedColor, getPackedColor, setProjection, beginCache, endCache

### `arc-core/src/arc/graphics/g2d/DistanceFieldFont.java`

- 知识页：[arc-core-src-arc-graphics-g2d-distancefieldfont-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-distancefieldfont-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/DistanceFieldFont.java`
- SHA1：`57ac4cb21033b4e22151d51dfb40577cb28cbd39`
- 声明：class DistanceFieldFontextends Font, class DistanceFieldFontCacheextends FontCache
- 字段线索：distanceFieldSmoothing, regions, font
- 方法线索：Shader, load, newFontCache, DistanceFieldFontCache, getDistanceFieldSmoothing, setDistanceFieldSmoothing

### `arc-core/src/arc/graphics/g2d/Draw.java`

- 知识页：[arc-core-src-arc-graphics-g2d-draw-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-draw-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/Draw.java`
- SHA1：`7c838ce140b798941dad8954c47df527010d9bbd`
- 声明：class Draw
- 字段线索：squad, carr, vertices, zTransformer, actualZ, retColor
- 方法线索：未抽取

### `arc-core/src/arc/graphics/g2d/Fill.java`

- 知识页：[arc-core-src-arc-graphics-g2d-fill-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-fill-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/Fill.java`
- SHA1：`1d3b20632bd11cfc2ff7aca3e51b6710a6bf8e32`
- 声明：class Fill
- 字段线索：vertices, circleRegion, polyFloats
- 方法线索：未抽取

### `arc-core/src/arc/graphics/g2d/Font.java`

- 知识页：[arc-core-src-arc-graphics-g2d-font-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-font-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/Font.java`
- SHA1：`11398fcaee1bd3a63077c092e6f27b02afa9bf7f`
- 声明：class Fontimplements Disposable, class Glyph, class FontData
- 字段线索：LOG2_PAGE_SIZE, PAGE_SIZE, PAGES, data, cache, flipped
- 方法线索：IllegalArgumentException, indexOf, load, draw, getColor, setColor

### `arc-core/src/arc/graphics/g2d/FontCache.java`

- 知识页：[arc-core-src-arc-graphics-g2d-fontcache-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-fontcache-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/FontCache.java`
- SHA1：`7075e273d8b38634ed037196cc96933fef524b26`
- 声明：class FontCache
- 字段线索：tempColor, font, layouts, pooledLayouts, color, integer
- 方法线索：IllegalArgumentException, setPosition, translate, setRotation, tint, setAlphas

### `arc-core/src/arc/graphics/g2d/ForkJoinHolder.java`

- 知识页：[arc-core-src-arc-graphics-g2d-forkjoinholder-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-forkjoinholder-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/ForkJoinHolder.java`
- SHA1：`42c4e2dbd1ce7bdb1593807e6941036a7bcdb986`
- 声明：class ForkJoinHolder
- 字段线索：pool, populateTask
- 方法线索：未抽取

### `arc-core/src/arc/graphics/g2d/GlyphLayout.java`

- 知识页：[arc-core-src-arc-graphics-g2d-glyphlayout-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-glyphlayout-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/GlyphLayout.java`
- SHA1：`be868c2cefaecc5c5fd6117aedd4a30a8c81a6c2`
- 声明：class GlyphLayoutimplements Poolable, class GlyphRunimplements Poolable
- 字段线索：runs, colorStack, ignoreMarkup, height, color, glyphs
- 方法线索：free, setText, truncate, wrap, adjustLastGlyph, parseColorMarkup

### `arc-core/src/arc/graphics/g2d/Lines.java`

- 知识页：[arc-core-src-arc-graphics-g2d-lines-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-lines-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/Lines.java`
- SHA1：`a9453341a710f2d29ec5d44b27b42737d2b5d6d4`
- 声明：class Lines
- 字段线索：useLegacyLine, stroke, vector, floats, floatBuilder, building
- 方法线索：未抽取

### `arc-core/src/arc/graphics/g2d/NinePatch.java`

- 知识页：[arc-core-src-arc-graphics-g2d-ninepatch-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-ninepatch-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/NinePatch.java`
- SHA1：`91450120533d59855fbff2c666da6e35309e2991`
- 声明：class NinePatch
- 字段线索：TOP_LEFT, TOP_CENTER, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT
- 方法线索：IllegalArgumentException, ArcRuntimeException, load, add, set, prepareVertices

### `arc-core/src/arc/graphics/g2d/PixmapPacker.java`

- 知识页：[arc-core-src-arc-graphics-g2d-pixmappacker-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-pixmappacker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/PixmapPacker.java`
- SHA1：`f8f6d32aabfa5eb746a27f0af8b3ee61c0c6a0cb`
- 声明：class PixmapPackerimplements Disposable, interface PackStrategy, class Page
- 字段线索：pages, addedRects, rect, leftChild, rightChild, full
- 方法线索：sort, ArcRuntimeException, getPages, forceDispose, getPageWidth, setPageWidth

### `arc-core/src/arc/graphics/g2d/PixmapRegion.java`

- 知识页：[arc-core-src-arc-graphics-g2d-pixmapregion-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-pixmapregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/PixmapRegion.java`
- SHA1：`5347a1c411a55295eaf79ba6fb815847a207ac8f`
- 声明：class PixmapRegion
- 字段线索：pixmap, height
- 方法线索：get, getRaw, getA, set, crop

### `arc-core/src/arc/graphics/g2d/ScissorStack.java`

- 知识页：[arc-core-src-arc-graphics-g2d-scissorstack-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-scissorstack-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/ScissorStack.java`
- SHA1：`7e467dea5effa22e23d257c4e3b850ff12766238`
- 声明：class ScissorStack
- 字段线索：viewport, tmp, scissors
- 方法线索：未抽取

### `arc-core/src/arc/graphics/g2d/ScreenQuad.java`

- 知识页：[arc-core-src-arc-graphics-g2d-screenquad-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-screenquad-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/ScreenQuad.java`
- SHA1：`0f3306429a9cf5f39a62e5e22fb3ec688f1f3436`
- 声明：class ScreenQuadimplements Disposable
- 字段线索：mesh
- 方法线索：render, dispose

### `arc-core/src/arc/graphics/g2d/SpriteBatch.java`

- 知识页：[arc-core-src-arc-graphics-g2d-spritebatch-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-spritebatch-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/SpriteBatch.java`
- SHA1：`7ea465656eeb623736b9185ef2cfc9283b9b361e`
- 声明：class SpriteBatchextends Batch, class DrawRequest, class CountingSort
- 字段线索：VERTEX_SIZE, SPRITE_SIZE, initialSize, emptyVertices, commonPool, mesh
- 方法线索：dispose, setSort, setShader, IllegalArgumentException, setBlending, z

### `arc-core/src/arc/graphics/g2d/SpriteCache.java`

- 知识页：[arc-core-src-arc-graphics-g2d-spritecache-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-spritecache-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/SpriteCache.java`
- SHA1：`74304434d33922bb5abe6f2163deb8ae17b2e87e`
- 声明：class SpriteCacheimplements Disposable, class Cache
- 字段线索：VERTEX_SIZE, tempVertices, mesh, transformMatrix, projectionMatrix, combinedMatrix
- 方法线索：IllegalArgumentException, Shader, getCaches, setColor, getColor, getPackedColor

### `arc-core/src/arc/graphics/g2d/TextureAtlas.java`

- 知识页：[arc-core-src-arc-graphics-g2d-textureatlas-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-textureatlas-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/TextureAtlas.java`
- SHA1：`42d614f2503ce1906eee543a973f6eeeab5d7eea`
- 声明：class TextureAtlasimplements Disposable, class TextureAtlasData, class AtlasPage
- 字段线索：textures, regions, drawables, regionmap, pixmaps, white
- 方法线索：setDrawableScale, load, getPixmap, disposePixmap, addRegion, getRegions

### `arc-core/src/arc/graphics/g2d/TextureRegion.java`

- 知识页：[arc-core-src-arc-graphics-g2d-textureregion-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-g2d-textureregion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/g2d/TextureRegion.java`
- SHA1：`e35142332dc25153c63cf08bb0f622e41eeebb40`
- 声明：class TextureRegion
- 字段线索：texture, v2, height, scale
- 方法线索：asAtlas, found, set, setU, setV, setU2


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
