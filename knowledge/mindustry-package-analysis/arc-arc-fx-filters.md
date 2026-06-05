# Package `arc.fx.filters` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.fx.filters`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

网络包：负责客户端/服务端连接、包、同步与多人游戏状态。

## 规模

- 仓库：`arc`
- Package：`arc.fx.filters`
- 文件数：28

## 主要依赖线索

- `arc.fx.*` × 26
- `arc.*` × 19
- `arc.graphics.*` × 7
- `arc.fx.util.*` × 6
- `arc.graphics.gl.*` × 5
- `arc.math.geom.*` × 5
- `arc.util.*` × 5
- `arc.graphics.Pixmap.*` × 2
- `arc.graphics.Blending` × 1

## 文件逐个分析

### `extensions/fx/src/arc/fx/filters/BiasFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-biasfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-biasfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/BiasFilter.java`
- SHA1：`4fedb97e337763a5870572961679dd965f6dbd44`
- 声明：class BiasFilterextends FxFilter
- 字段线索：bias
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/BloomFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-bloomfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-bloomfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/BloomFilter.java`
- SHA1：`b262a87b098e9961d12c37954f113a9b5b4341ba`
- 声明：class BloomFilterextends FxFilter
- 字段线索：buffer, blur, threshold, combine, blending, scaling
- 方法线索：rebind, resize, dispose, render

### `extensions/fx/src/arc/fx/filters/BlurFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-blurfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-blurfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/BlurFilter.java`
- SHA1：`da3349aa7a12fb7f3feca01b38a9fc2f84a29ba1`
- 声明：class BlurFilterextends FxFilter
- 字段线索：blur, pingPongBuffer, copy, blending, firstRender
- 方法线索：dispose, resize, rebind, render

### `extensions/fx/src/arc/fx/filters/ChromaticAberrationFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-chromaticaberrationfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-chromaticaberrationfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/ChromaticAberrationFilter.java`
- SHA1：`4f0341dd2cf07723cfa2f28e625973e42f2c29f5`
- 声明：class ChromaticAberrationFilterextends FxFilter
- 字段线索：maxDistortion
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/CombineFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-combinefilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-combinefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/CombineFilter.java`
- SHA1：`5fe83b43746f8b298eae265e245e08d311efd94d`
- 声明：class CombineFilterextends FxFilter
- 字段线索：src1int, inputTexture2
- 方法线索：setInput, setParams, onBeforeRender

### `extensions/fx/src/arc/fx/filters/Convolve1dFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-convolve1dfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-convolve1dfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/Convolve1dFilter.java`
- SHA1：`c4fd4f32be5e4e474e18d1db31ddb591982fae9d`
- 声明：class Convolve1dFilterextends FxFilter
- 字段线索：length, weights, offsets
- 方法线索：setWeights, dispose, setParams

### `extensions/fx/src/arc/fx/filters/Convolve2dFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-convolve2dfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-convolve2dfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/Convolve2dFilter.java`
- SHA1：`c7446ae1be486f7511e43af71e7b7bd70149beaf`
- 声明：class Convolve2dFilterextends MultipassVfxFilter
- 字段线索：radius, length, offsetsVert, vert
- 方法线索：dispose, setParams, render

### `extensions/fx/src/arc/fx/filters/CopyFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-copyfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-copyfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/CopyFilter.java`
- SHA1：`aa737e195c1c78acd19da85b79b2bcd3044e38cb`
- 声明：class CopyFilterextends FxFilter
- 字段线索：未抽取
- 方法线索：未抽取

### `extensions/fx/src/arc/fx/filters/CrtFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-crtfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-crtfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/CrtFilter.java`
- SHA1：`055cd10f2a344e7847a355dd34c8aa32cdf6b6cd`
- 声明：class CrtFilterextends FxFilter, enum SizeSource, enum LineStyle
- 字段线索：viewportSize, sizeSource
- 方法线索：resize, setParams

### `extensions/fx/src/arc/fx/filters/FilmGrainFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-filmgrainfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-filmgrainfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/FilmGrainFilter.java`
- SHA1：`4dc01a98eba67c487982b293e7a78a2ccf79e64e`
- 声明：class FilmGrainFilterextends FxFilter
- 字段线索：seed
- 方法线索：setSeed, setParams, update

### `extensions/fx/src/arc/fx/filters/FisheyeDistortionFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-fisheyedistortionfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-fisheyedistortionfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/FisheyeDistortionFilter.java`
- SHA1：`1351bf0442f7a3ea4a729fff651be3ed1d5b121d`
- 声明：class FisheyeDistortionFilterextends FxFilter
- 字段线索：未抽取
- 方法线索：未抽取

### `extensions/fx/src/arc/fx/filters/FxaaFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-fxaafilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-fxaafilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/FxaaFilter.java`
- SHA1：`22be607040eeecb4ad3f9e177502a68b5cfe4448`
- 声明：class FxaaFilterextends FxFilter
- 字段线索：viewportInverse, fxaaReduceMin, fxaaReduceMul, fxaaSpanMax
- 方法线索：resize, setParams

### `extensions/fx/src/arc/fx/filters/GaussianBlurFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-gaussianblurfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-gaussianblurfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/GaussianBlurFilter.java`
- SHA1：`c941da942e09df811dfba62d361d278ca531f26f`
- 声明：class GaussianBlurFilterextends MultipassVfxFilter, enum Tap, enum BlurType
- 字段线索：type, amount, passes, invHeight, convolve, X
- 方法线索：dispose, resize, setParams, render, getType, setType

### `extensions/fx/src/arc/fx/filters/HdrFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-hdrfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-hdrfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/HdrFilter.java`
- SHA1：`0366c69b6dab1d40dd6310c0c90615f16cf44edd`
- 声明：class HdrFilterextends FxFilter
- 字段线索：exposure, gamma
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/LensFlareFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-lensflarefilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-lensflarefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/LensFlareFilter.java`
- SHA1：`9a7e24cd576a66d359bf0d4ebb24867d55817cdb`
- 声明：class LensFlareFilterextends FxFilter
- 字段线索：viewport, lightPosition, color, intensity
- 方法线索：resize, setParams

### `extensions/fx/src/arc/fx/filters/LevelsFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-levelsfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-levelsfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/LevelsFilter.java`
- SHA1：`750945f8642c276defd809813e462594da4bd590`
- 声明：class LevelsFilterextends FxFilter
- 字段线索：brightness, contrast, saturation, hue, gamma
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/MixFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-mixfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-mixfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/MixFilter.java`
- SHA1：`b9e96832d9cc6d06629a7ead3aa46937b0857b25`
- 声明：class MixFilterextends FxFilter
- 字段线索：inputTexture2, mix
- 方法线索：setInput, UnsupportedOperationException, resize, setParams, onBeforeRender

### `extensions/fx/src/arc/fx/filters/MotionBlurFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-motionblurfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-motionblurfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/MotionBlurFilter.java`
- SHA1：`3b8e36e50f6742889820f9d71e2657dc5e8c34e3`
- 声明：class MotionBlurFilterextends FxFilter, enum BlurFunction
- 字段线索：copyFilter, localBuffer, blurOpacity, lastFrameTex, fragmentShaderName
- 方法线索：resize, dispose, rebind, setParams, onBeforeRender, render

### `extensions/fx/src/arc/fx/filters/MultipassVfxFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-multipassvfxfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-multipassvfxfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/MultipassVfxFilter.java`
- SHA1：`b712927f3134103b61ced6e5f0fc373db6d070c6`
- 声明：class MultipassVfxFilterimplements Disposable
- 字段线索：未抽取
- 方法线索：resize

### `extensions/fx/src/arc/fx/filters/NfaaFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-nfaafilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-nfaafilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/NfaaFilter.java`
- SHA1：`a3501c3cfbb3c1d7485aeb9de29ca4c00c848655`
- 声明：class NfaaFilterextends FxFilter
- 字段线索：viewportInverse
- 方法线索：resize, setParams

### `extensions/fx/src/arc/fx/filters/NoiseFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-noisefilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-noisefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/NoiseFilter.java`
- SHA1：`aa0e808582e6e461e06cc4b2d09372a1202ea79d`
- 声明：class NoiseFilterextends FxFilter
- 字段线索：amount, speed
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/OldTvFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-oldtvfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-oldtvfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/OldTvFilter.java`
- SHA1：`747d11f00b26ea4a59e2a8b8086fa885fba34f56`
- 声明：class OldTvFilterextends FxFilter
- 字段线索：resolution
- 方法线索：resize, setParams

### `extensions/fx/src/arc/fx/filters/RadialBlurFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-radialblurfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-radialblurfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/RadialBlurFilter.java`
- SHA1：`5d53222887ff8277ffac7de9ed05915e20417185`
- 声明：class RadialBlurFilterextends FxFilter
- 字段线索：passes, strength, originX, originY, zoom
- 方法线索：getOriginX, getOriginY, setOrigin, setParams

### `extensions/fx/src/arc/fx/filters/RadialDistortionFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-radialdistortionfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-radialdistortionfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/RadialDistortionFilter.java`
- SHA1：`912ec21aa313c5f0cb41844a846202e1137fe9fa`
- 声明：class RadialDistortionFilterextends FxFilter
- 字段线索：zoom, distortion
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/RippleFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-ripplefilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-ripplefilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/RippleFilter.java`
- SHA1：`f789758d067cca42f8ded10ea886e7325f0a7fc4`
- 声明：class RippleFilterextends FxFilter
- 字段线索：speed
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/ThresholdFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-thresholdfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-thresholdfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/ThresholdFilter.java`
- SHA1：`fd30b30a1bd68392d840f0982731609c248aadaa`
- 声明：class ThresholdFilterextends FxFilter
- 字段线索：gamma
- 方法线索：setParams

### `extensions/fx/src/arc/fx/filters/VignettingFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-vignettingfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-vignettingfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/VignettingFilter.java`
- SHA1：`259d035be711dbda5d1663976ddd1dbef33691ba`
- 声明：class VignettingFilterextends FxFilter
- 字段线索：lutTexture, vignetteX, vignetteY, centerX, centerY, intensity
- 方法线索：setLut, setParams, onBeforeRender

### `extensions/fx/src/arc/fx/filters/ZoomFilter.java`

- 知识页：[extensions-fx-src-arc-fx-filters-zoomfilter-java.md](../mindustry-source-files/arc/extensions-fx-src-arc-fx-filters-zoomfilter-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/extensions/fx/src/arc/fx/filters/ZoomFilter.java`
- SHA1：`cb0d3c920f22773951051af7d9513a1b239bcbf2`
- 声明：class ZoomFilterextends FxFilter
- 字段线索：originX, originY, zoom
- 方法线索：setOrigin, setParams


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
