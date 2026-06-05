# Arc Source File Index

> Source: `/home/zenxsin/cow/源码和示例/Arc`

本页是源码级知识索引：每个源文件一条知识点记录。完整源代码不直接复制进知识库页面，原因是体量过大且会制造重复快照；知识页记录路径、大小、hash、包名/类型摘要，读取原文以本地源码路径为准。

## Repository Summary

- Files indexed: 638
- Source bytes: 4288935

## Files

| File | Size | SHA1-12 | Package / declarations |
|---|---:|---|---|
| `README.md` | 1841 | `d81eb456bcdd` |  |
| `arc-core/build.gradle` | 5199 | `87fbd45b6bb6` |  |
| `arc-core/src/arc/Application.java` | 4482 | `6e74d4a4ee64` | arc; interface Application, enum ApplicationType |
| `arc-core/src/arc/ApplicationCore.java` | 1650 | `e0bcd48041c0` | arc; class ApplicationCore |
| `arc-core/src/arc/ApplicationListener.java` | 2046 | `21ed39358e62` | arc; interface ApplicationListener |
| `arc-core/src/arc/Core.java` | 885 | `cde2866db1a3` | arc; class Core |
| `arc-core/src/arc/Events.java` | 1821 | `5859695f08db` | arc; class Events |
| `arc-core/src/arc/Files.java` | 3953 | `e65ff71c95cd` | arc; interface Files, enum FileType |
| `arc-core/src/arc/Graphics.java` | 15515 | `6516f854b42d` | arc; class Graphics, class BufferFormat, interface Cursor, enum SystemCursor |
| `arc-core/src/arc/Input.java` | 15030 | `7dee1c039f2f` | arc; class Input, enum Orientation, enum Peripheral, class TextInput |
| `arc-core/src/arc/Settings.java` | 15084 | `4a1c030f18dd` | arc; class Settings |
| `arc-core/src/arc/assets/AssetDescriptor.java` | 1780 | `75c595a7a62e` | arc.assets; class AssetDescriptor |
| `arc-core/src/arc/assets/AssetErrorListener.java` | 120 | `d5b1f216273d` | arc.assets; interface AssetErrorListener |
| `arc-core/src/arc/assets/AssetLoaderParameters.java` | 530 | `197ae4a54976` | arc.assets; class AssetLoaderParameters, interface LoadedCallback |
| `arc-core/src/arc/assets/AssetLoadingTask.java` | 6088 | `680763a64714` | arc.assets; class AssetLoadingTask |
| `arc-core/src/arc/assets/AssetManager.java` | 32106 | `ac0fba9c1343` | arc.assets; class AssetManager |
| `arc-core/src/arc/assets/Loadable.java` | 306 | `bc7c645a3762` | arc.assets; interface Loadable |
| `arc-core/src/arc/assets/loaders/AssetLoader.java` | 1552 | `9fafc9451f23` | arc.assets.loaders; class AssetLoader |
| `arc-core/src/arc/assets/loaders/AsynchronousAssetLoader.java` | 1189 | `18fc80a09d5f` | arc.assets.loaders; class AsynchronousAssetLoader |
| `arc-core/src/arc/assets/loaders/CubemapLoader.java` | 2933 | `a48406cc601d` | arc.assets.loaders; class CubemapLoader, class CubemapLoaderInfo, class CubemapParameter |
| `arc-core/src/arc/assets/loaders/CustomLoader.java` | 609 | `e346d52420b8` | arc.assets.loaders; class CustomLoader |
| `arc-core/src/arc/assets/loaders/FileHandleResolver.java` | 356 | `91c4091edc01` | arc.assets.loaders; interface FileHandleResolver |
| `arc-core/src/arc/assets/loaders/FontLoader.java` | 4617 | `5b87c3ba88da` | arc.assets.loaders; class FontLoader, class FontParameter |
| `arc-core/src/arc/assets/loaders/I18NBundleLoader.java` | 2958 | `844d55649f27` | arc.assets.loaders; class I18NBundleLoader, class I18NBundleParameter |
| `arc-core/src/arc/assets/loaders/MusicLoader.java` | 1892 | `3ff550611542` | arc.assets.loaders; class MusicLoader, class MusicParameter |
| `arc-core/src/arc/assets/loaders/PixmapLoader.java` | 1155 | `ed0e25bb77eb` | arc.assets.loaders; class PixmapLoader, class PixmapParameter |
| `arc-core/src/arc/assets/loaders/ShaderProgramLoader.java` | 4824 | `02c93f078986` | arc.assets.loaders; class ShaderProgramLoader, class ShaderProgramParameter |
| `arc-core/src/arc/assets/loaders/SoundLoader.java` | 1756 | `63071871eb79` | arc.assets.loaders; class SoundLoader, class SoundParameter |
| `arc-core/src/arc/assets/loaders/SynchronousAssetLoader.java` | 427 | `f2584a4813cb` | arc.assets.loaders; class SynchronousAssetLoader |
| `arc-core/src/arc/assets/loaders/TextureAtlasLoader.java` | 2459 | `37da0d8101d3` | arc.assets.loaders; class TextureAtlasLoader, class TextureAtlasParameter |
| `arc-core/src/arc/assets/loaders/TextureLoader.java` | 3075 | `41d5ed0c8ce1` | arc.assets.loaders; class TextureLoader, class TextureLoaderInfo, class TextureParameter |
| `arc-core/src/arc/audio/Audio.java` | 5589 | `ada289c6b458` | arc.audio; class Audio |
| `arc-core/src/arc/audio/AudioBus.java` | 1305 | `dbc926ffa4ee` | arc.audio; class AudioBus |
| `arc-core/src/arc/audio/AudioFilter.java` | 161 | `a9e728858bed` | arc.audio; class AudioFilter |
| `arc-core/src/arc/audio/AudioSource.java` | 1951 | `99050353b2b1` | arc.audio; class AudioSource |
| `arc-core/src/arc/audio/Filters.java` | 2225 | `81f10391ed54` | arc.audio; class Filters, class BiquadFilter, class EchoFilter, class LofiFilter, class FlangerFilter |
| `arc-core/src/arc/audio/Music.java` | 5041 | `a08128a5c63e` | arc.audio; class Music |
| `arc-core/src/arc/audio/RandomSound.java` | 598 | `c8f2c798dbad` | arc.audio; class RandomSound |
| `arc-core/src/arc/audio/Soloud.java` | 9202 | `097feeffff90` | arc.audio; class Soloud |
| `arc-core/src/arc/audio/Sound.java` | 8769 | `b16a1250f518` | arc.audio; class Sound |
| `arc-core/src/arc/files/Fi.java` | 37611 | `0d6d953d68d2` | arc.files; class Fi |
| `arc-core/src/arc/files/ZipFi.java` | 5379 | `08e2a93abba6` | arc.files; class ZipFi |
| `arc-core/src/arc/func/Boolc.java` | 70 | `3c014e35c7e3` | arc.func; interface Boolc |
| `arc-core/src/arc/func/Boolf.java` | 70 | `73d872a1f620` | arc.func; interface Boolf |
| `arc-core/src/arc/func/Boolf2.java` | 79 | `fac1292334b9` | arc.func; interface Boolf2 |
| `arc-core/src/arc/func/Boolf3.java` | 93 | `a945de36bd74` | arc.func; interface Boolf3 |
| `arc-core/src/arc/func/Boolp.java` | 64 | `f366be4c4118` | arc.func; interface Boolp |
| `arc-core/src/arc/func/Cons.java` | 66 | `486887ffd2a3` | arc.func; interface Cons |
| `arc-core/src/arc/func/Cons2.java` | 75 | `97e3679b7fad` | arc.func; interface Cons2 |
| `arc-core/src/arc/func/Cons3.java` | 104 | `a93bda921e94` | arc.func; interface Cons3 |
| `arc-core/src/arc/func/Cons4.java` | 119 | `a671dc70740e` | arc.func; interface Cons4 |
| `arc-core/src/arc/func/ConsT.java` | 134 | `6e9dbab128aa` | arc.func; interface ConsT |
| `arc-core/src/arc/func/FloatFloatf.java` | 75 | `28e550384992` | arc.func; interface FloatFloatf |
| `arc-core/src/arc/func/Floatc.java` | 69 | `f9e4970ea6ec` | arc.func; interface Floatc |
| `arc-core/src/arc/func/Floatc2.java` | 79 | `83a916afd094` | arc.func; interface Floatc2 |
| `arc-core/src/arc/func/Floatc4.java` | 99 | `a4fafe15794d` | arc.func; interface Floatc4 |
| `arc-core/src/arc/func/Floatf.java` | 69 | `85e541785431` | arc.func; interface Floatf |
| `arc-core/src/arc/func/Floatp.java` | 63 | `31e027ae17c6` | arc.func; interface Floatp |
| `arc-core/src/arc/func/Func.java` | 70 | `298d74748274` | arc.func; interface Func |
| `arc-core/src/arc/func/Func2.java` | 89 | `062b10e0ae59` | arc.func; interface Func2 |
| `arc-core/src/arc/func/Func3.java` | 104 | `3dc51d4da792` | arc.func; interface Func3 |
| `arc-core/src/arc/func/IntIntf.java` | 71 | `53d7f94ab829` | arc.func; interface IntIntf |
| `arc-core/src/arc/func/Intc.java` | 65 | `a511b3749d82` | arc.func; interface Intc |
| `arc-core/src/arc/func/Intc2.java` | 73 | `a690321bd99a` | arc.func; interface Intc2 |
| `arc-core/src/arc/func/Intc4.java` | 89 | `f168e1edae2f` | arc.func; interface Intc4 |
| `arc-core/src/arc/func/Intf.java` | 65 | `065bd2030627` | arc.func; interface Intf |
| `arc-core/src/arc/func/Intp.java` | 59 | `2eb37b4334e5` | arc.func; interface Intp |
| `arc-core/src/arc/func/Longf.java` | 67 | `ceeb20c292df` | arc.func; interface Longf |
| `arc-core/src/arc/func/Prov.java` | 60 | `b8d9d444a128` | arc.func; interface Prov |
| `arc-core/src/arc/graphics/Blending.java` | 1101 | `e303013cd4cc` | arc.graphics; class Blending |
| `arc-core/src/arc/graphics/Camera.java` | 6202 | `d5f942670c93` | arc.graphics; class Camera |
| `arc-core/src/arc/graphics/Color.java` | 32164 | `a74b5a66c47f` | arc.graphics; class Color |
| `arc-core/src/arc/graphics/Colors.java` | 3463 | `ed0aaf63dd0a` | arc.graphics; class Colors |
| `arc-core/src/arc/graphics/Cubemap.java` | 6815 | `7ead65ecc4cf` | arc.graphics; class Cubemap, enum CubemapSide |
| `arc-core/src/arc/graphics/CubemapData.java` | 1456 | `9cafb25beff8` | arc.graphics; interface CubemapData |
| `arc-core/src/arc/graphics/GL20.java` | 20909 | `b2cda1afda26` | arc.graphics; interface GL20 |
| `arc-core/src/arc/graphics/GL30.java` | 18834 | `d3e7e4568c76` | arc.graphics; interface GL30 |
| `arc-core/src/arc/graphics/GLTexture.java` | 7258 | `a110a2dbbfff` | arc.graphics; class GLTexture |
| `arc-core/src/arc/graphics/Gl.java` | 31954 | `11cb333323ac` | arc.graphics; class Gl |
| `arc-core/src/arc/graphics/Mesh.java` | 12047 | `d65fd9ffe2f8` | arc.graphics; class Mesh |
| `arc-core/src/arc/graphics/Pixmap.java` | 32672 | `d0d9836ee73f` | arc.graphics; class Pixmap |
| `arc-core/src/arc/graphics/PixmapIO.java` | 12972 | `b7605d898846` | arc.graphics; class PixmapIO, class PngWriter, class ChunkBuffer, class PngReader |
| `arc-core/src/arc/graphics/Pixmaps.java` | 14805 | `ef5b50908313` | arc.graphics; class Pixmaps |
| `arc-core/src/arc/graphics/Texture.java` | 5540 | `3382c7d21deb` | arc.graphics; class Texture, enum TextureFilter, enum TextureWrap |
| `arc-core/src/arc/graphics/TextureArray.java` | 1768 | `905e9c0d1283` | arc.graphics; class TextureArray |
| `arc-core/src/arc/graphics/TextureArrayData.java` | 1800 | `65cc7efaee61` | arc.graphics; interface TextureArrayData |
| `arc-core/src/arc/graphics/TextureData.java` | 2907 | `ad63ceed1047` | arc.graphics; interface TextureData |
| `arc-core/src/arc/graphics/VertexAttribute.java` | 3794 | `60d60789bfca` | arc.graphics; class VertexAttribute |
| `arc-core/src/arc/graphics/g2d/Animation.java` | 7937 | `9fadf36a4960` | arc.graphics.g2d; class Animation, enum PlayMode |
| `arc-core/src/arc/graphics/g2d/Batch.java` | 3133 | `64200578a274` | arc.graphics.g2d; class Batch |
| `arc-core/src/arc/graphics/g2d/Bloom.java` | 7159 | `436fbfa35805` | arc.graphics.g2d; class Bloom |
| `arc-core/src/arc/graphics/g2d/CacheBatch.java` | 2712 | `6b0f8b3130df` | arc.graphics.g2d; class CacheBatch |
| `arc-core/src/arc/graphics/g2d/DistanceFieldFont.java` | 7173 | `57ac4cb21033` | arc.graphics.g2d; class DistanceFieldFont, class DistanceFieldFontCache |
| `arc-core/src/arc/graphics/g2d/Draw.java` | 16636 | `7c838ce140b7` | arc.graphics.g2d; class Draw |
| `arc-core/src/arc/graphics/g2d/Fill.java` | 12420 | `1d3b20632bd1` | arc.graphics.g2d; class Fill |
| `arc-core/src/arc/graphics/g2d/Font.java` | 41548 | `11398fcaee1b` | arc.graphics.g2d; class Font, class Glyph |
| `arc-core/src/arc/graphics/g2d/FontCache.java` | 22923 | `7075e273d8b3` | arc.graphics.g2d; class FontCache |
| `arc-core/src/arc/graphics/g2d/ForkJoinHolder.java` | 253 | `42c4e2dbd1ce` | arc.graphics.g2d; class ForkJoinHolder |
| `arc-core/src/arc/graphics/g2d/GlyphLayout.java` | 22891 | `be868c2cefae` | arc.graphics.g2d; class GlyphLayout |
| `arc-core/src/arc/graphics/g2d/Lines.java` | 16573 | `a9453341a710` | arc.graphics.g2d; class Lines |
| `arc-core/src/arc/graphics/g2d/NinePatch.java` | 22811 | `91450120533d` | arc.graphics.g2d; class NinePatch |
| `arc-core/src/arc/graphics/g2d/PixmapPacker.java` | 33699 | `f8f6d32aabfa` | arc.graphics.g2d; class PixmapPacker |
| `arc-core/src/arc/graphics/g2d/PixmapRegion.java` | 1704 | `5347a1c411a5` | arc.graphics.g2d; class PixmapRegion |
| `arc-core/src/arc/graphics/g2d/ScissorStack.java` | 6139 | `7e467dea5eff` | arc.graphics.g2d; class ScissorStack |
| `arc-core/src/arc/graphics/g2d/ScreenQuad.java` | 571 | `0f3306429a9c` | arc.graphics.g2d; class ScreenQuad |
| `arc-core/src/arc/graphics/g2d/SpriteBatch.java` | 30618 | `7ea465656eeb` | arc.graphics.g2d; class SpriteBatch, class CountingSort |
| `arc-core/src/arc/graphics/g2d/SpriteCache.java` | 23403 | `74304434d339` | arc.graphics.g2d; class SpriteCache |
| `arc-core/src/arc/graphics/g2d/TextureAtlas.java` | 18697 | `42d614f2503c` | arc.graphics.g2d; class TextureAtlas, class TextureAtlasData, class AtlasPage, class Region, class AtlasRegion |
| `arc-core/src/arc/graphics/g2d/TextureRegion.java` | 10450 | `e35142332dc2` | arc.graphics.g2d; class TextureRegion |
| `arc-core/src/arc/graphics/gl/FacedCubemapData.java` | 7780 | `868474fdc181` | arc.graphics.gl; class FacedCubemapData |
| `arc-core/src/arc/graphics/gl/FileTextureArrayData.java` | 2402 | `93117ed4e232` | arc.graphics.gl; class FileTextureArrayData |
| `arc-core/src/arc/graphics/gl/FileTextureData.java` | 2012 | `938c22f6e54c` | arc.graphics.gl; class FileTextureData |
| `arc-core/src/arc/graphics/gl/FloatFrameBuffer.java` | 2347 | `d11a4c324844` | arc.graphics.gl; class FloatFrameBuffer |
| `arc-core/src/arc/graphics/gl/FloatTextureData.java` | 3647 | `db604094bec9` | arc.graphics.gl; class FloatTextureData |
| `arc-core/src/arc/graphics/gl/FrameBuffer.java` | 6061 | `9ffabce5a514` | arc.graphics.gl; class FrameBuffer |
| `arc-core/src/arc/graphics/gl/FrameBufferCubemap.java` | 4635 | `fdcdc0898ac3` | arc.graphics.gl; class FrameBufferCubemap |
| `arc-core/src/arc/graphics/gl/GLFrameBuffer.java` | 22103 | `b2eb59a6b4bd` | arc.graphics.gl; class GLFrameBuffer |
| `arc-core/src/arc/graphics/gl/GLOnlyTextureData.java` | 2842 | `07854cf91490` | arc.graphics.gl; class GLOnlyTextureData |
| `arc-core/src/arc/graphics/gl/GLVersion.java` | 4139 | `87ece7cced59` | arc.graphics.gl; class GLVersion, enum GlType |
| `arc-core/src/arc/graphics/gl/HdpiMode.java` | 717 | `952642c824c6` | arc.graphics.gl; enum HdpiMode |
| `arc-core/src/arc/graphics/gl/HdpiUtils.java` | 3770 | `eb1c42c57678` | arc.graphics.gl; class HdpiUtils |
| `arc-core/src/arc/graphics/gl/IndexArray.java` | 3305 | `4792c72e2b33` | arc.graphics.gl; class IndexArray |
| `arc-core/src/arc/graphics/gl/IndexBufferObject.java` | 5902 | `d97744933d9a` | arc.graphics.gl; class IndexBufferObject |
| `arc-core/src/arc/graphics/gl/IndexBufferObjectSubData.java` | 5834 | `496db50b8cc4` | arc.graphics.gl; class IndexBufferObjectSubData |
| `arc-core/src/arc/graphics/gl/IndexData.java` | 2423 | `e79cceef3167` | arc.graphics.gl; interface IndexData |
| `arc-core/src/arc/graphics/gl/MipMapTextureData.java` | 1608 | `b48fd438d46a` | arc.graphics.gl; class MipMapTextureData |
| `arc-core/src/arc/graphics/gl/PixmapTextureData.java` | 1496 | `e4f8ae1009d6` | arc.graphics.gl; class PixmapTextureData |
| `arc-core/src/arc/graphics/gl/Shader.java` | 26945 | `276d01c07920` | arc.graphics.gl; class Shader |
| `arc-core/src/arc/graphics/gl/VertexArray.java` | 3648 | `0bb29927e107` | arc.graphics.gl; class VertexArray |
| `arc-core/src/arc/graphics/gl/VertexBufferObject.java` | 4925 | `90598f761eae` | arc.graphics.gl; class VertexBufferObject |
| `arc-core/src/arc/graphics/gl/VertexBufferObjectWithVAO.java` | 6044 | `62f278d42a2b` | arc.graphics.gl; class VertexBufferObjectWithVAO |
| `arc-core/src/arc/graphics/gl/VertexData.java` | 2442 | `b76b1dcda728` | arc.graphics.gl; interface VertexData |
| `arc-core/src/arc/input/GestureDetector.java` | 16462 | `1bc0c45266e9` | arc.input; class GestureDetector, interface GestureListener, class VelocityTracker |
| `arc-core/src/arc/input/InputEventQueue.java` | 6696 | `8ab582d8d1fa` | arc.input; class InputEventQueue |
| `arc-core/src/arc/input/InputMultiplexer.java` | 4668 | `197078d7fa19` | arc.input; class InputMultiplexer |
| `arc-core/src/arc/input/InputProcessor.java` | 2677 | `81c10104d6cb` | arc.input; interface InputProcessor |
| `arc-core/src/arc/input/KeyBind.java` | 4932 | `a45c546f55ad` | arc.input; class KeyBind, interface KeybindValue, class Axis |
| `arc-core/src/arc/input/KeyCode.java` | 8381 | `ba958897b3ad` | arc.input; enum KeyCode, enum KeyType |
| `arc-core/src/arc/input/KeyboardDevice.java` | 1795 | `0daed9600e30` | arc.input; class KeyboardDevice |
| `arc-core/src/arc/math/Affine2.java` | 21480 | `021e3ab3662c` | arc.math; class Affine2 |
| `arc-core/src/arc/math/Angles.java` | 5342 | `0c49406a1809` | arc.math; class Angles, interface ParticleConsumer |
| `arc-core/src/arc/math/CumulativeDistribution.java` | 4781 | `a301dc8090f9` | arc.math; class CumulativeDistribution, class CumulativeValue |
| `arc-core/src/arc/math/DelaunayTriangulator.java` | 13673 | `504669fd1588` | arc.math; class DelaunayTriangulator |
| `arc-core/src/arc/math/EarClippingTriangulator.java` | 9096 | `ab82426afb34` | arc.math; class EarClippingTriangulator |
| `arc-core/src/arc/math/Extrapolator.java` | 7008 | `91a0e731a506` | arc.math; class Extrapolator |
| `arc-core/src/arc/math/FloatCounter.java` | 1858 | `3c4720ebe5d4` | arc.math; class FloatCounter |
| `arc-core/src/arc/math/Interp.java` | 10882 | `58882c0f98db` | arc.math; interface Interp, class Pow, class PowIn, class PowOut, class Exp |
| `arc-core/src/arc/math/LinearRegression.java` | 944 | `8bfddf9110dd` | arc.math; class LinearRegression |
| `arc-core/src/arc/math/Mat.java` | 21093 | `46f8cd81eeb2` | arc.math; class Mat |
| `arc-core/src/arc/math/Mathf.java` | 25869 | `79c854118fc3` | arc.math; class Mathf |
| `arc-core/src/arc/math/Rand.java` | 8043 | `280dc750e861` | arc.math; class Rand |
| `arc-core/src/arc/math/Scaled.java` | 1121 | `f9894fa8e9be` | arc.math; interface Scaled |
| `arc-core/src/arc/math/WindowedMean.java` | 4863 | `44eadb2403cf` | arc.math; class WindowedMean |
| `arc-core/src/arc/math/geom/BSpline.java` | 12590 | `155ffc54fc24` | arc.math.geom; class BSpline |
| `arc-core/src/arc/math/geom/Bezier.java` | 8586 | `83413596444c` | arc.math.geom; class Bezier |
| `arc-core/src/arc/math/geom/BoundingBox.java` | 9184 | `530cd4a4c857` | arc.math.geom; class BoundingBox |
| `arc-core/src/arc/math/geom/Bresenham2.java` | 5738 | `0c2ab67859b6` | arc.math.geom; class Bresenham2 |
| `arc-core/src/arc/math/geom/CatmullRomSpline.java` | 8406 | `fbd5096dafbd` | arc.math.geom; class CatmullRomSpline |
| `arc-core/src/arc/math/geom/Circle.java` | 6739 | `4664de7ad62d` | arc.math.geom; class Circle |
| `arc-core/src/arc/math/geom/ConvexHull.java` | 10083 | `b92c4651ba5e` | arc.math.geom; class ConvexHull |
| `arc-core/src/arc/math/geom/Ellipse.java` | 6310 | `abf0377e3903` | arc.math.geom; class Ellipse |
| `arc-core/src/arc/math/geom/Geometry.java` | 22608 | `265515d86185` | arc.math.geom; class Geometry |
| `arc-core/src/arc/math/geom/IntQuadTree.java` | 10062 | `750e4266f01b` | arc.math.geom; class IntQuadTree, interface IntQuadTreeProvider |
| `arc-core/src/arc/math/geom/Intersector.java` | 36587 | `279f76f2be5b` | arc.math.geom; class Intersector |
| `arc-core/src/arc/math/geom/Path.java` | 1290 | `8434370ceec1` | arc.math.geom; interface Path |
| `arc-core/src/arc/math/geom/Point2.java` | 5538 | `43245430be73` | arc.math.geom; class Point2 |
| `arc-core/src/arc/math/geom/Point3.java` | 5113 | `809443671eb2` | arc.math.geom; class Point3 |
| `arc-core/src/arc/math/geom/Polygon.java` | 8251 | `ef339cedd402` | arc.math.geom; class Polygon |
| `arc-core/src/arc/math/geom/Polyline.java` | 5483 | `745fd44b706c` | arc.math.geom; class Polyline |
| `arc-core/src/arc/math/geom/Position.java` | 1162 | `7bff31599519` | arc.math.geom; interface Position |
| `arc-core/src/arc/math/geom/QuadTree.java` | 11698 | `8a2978ad38d7` | arc.math.geom; class QuadTree, interface QuadTreeObject |
| `arc-core/src/arc/math/geom/Rect.java` | 15507 | `d4bf170f9e4b` | arc.math.geom; class Rect |
| `arc-core/src/arc/math/geom/Shape2D.java` | 296 | `15d749eb1cd8` | arc.math.geom; interface Shape2D |
| `arc-core/src/arc/math/geom/Spring1D.java` | 920 | `8fabb7fa2f8d` | arc.math.geom; class Spring1D |
| `arc-core/src/arc/math/geom/Spring2D.java` | 1254 | `a6c3848b73ba` | arc.math.geom; class Spring2D |
| `arc-core/src/arc/math/geom/Vec2.java` | 20166 | `4797e55f1d76` | arc.math.geom; class Vec2 |
| `arc-core/src/arc/math/geom/Vec3.java` | 21360 | `560ca38943cb` | arc.math.geom; class Vec3 |
| `arc-core/src/arc/math/geom/Vector.java` | 7927 | `ac4de26a858b` | arc.math.geom; interface Vector |
| `arc-core/src/arc/mock/MockApplication.java` | 592 | `7fb085dff5b4` | arc.mock; class MockApplication |
| `arc-core/src/arc/mock/MockAudio.java` | 329 | `3e42e27bc9eb` | arc.mock; class MockAudio |
| `arc-core/src/arc/mock/MockFiles.java` | 661 | `10988cbf5d07` | arc.mock; class MockFiles |
| `arc-core/src/arc/mock/MockGL20.java` | 14049 | `92713536f537` | arc.mock; class MockGL20 |
| `arc-core/src/arc/mock/MockGraphics.java` | 3072 | `290f34c358aa` | arc.mock; class MockGraphics |
| `arc-core/src/arc/mock/MockInput.java` | 1099 | `1bfa28cd708e` | arc.mock; class MockInput |
| `arc-core/src/arc/mock/MockSettings.java` | 178 | `8614ad1a3487` | arc.mock; class MockSettings |
| `arc-core/src/arc/scene/Action.java` | 3985 | `735c2e2c54da` | arc.scene; class Action |
| `arc-core/src/arc/scene/Element.java` | 34573 | `7756228cc20c` | arc.scene; class Element |
| `arc-core/src/arc/scene/Group.java` | 18950 | `91cb084a8e70` | arc.scene; class Group |
| `arc-core/src/arc/scene/Scene.java` | 30544 | `7049b06cc3dc` | arc.scene; class Scene |
| `arc-core/src/arc/scene/actions/Actions.java` | 18992 | `94ae196fcf66` | arc.scene.actions; class Actions |
| `arc-core/src/arc/scene/actions/AddAction.java` | 623 | `f8494c877cf3` | arc.scene.actions; class AddAction |
| `arc-core/src/arc/scene/actions/AddListenerAction.java` | 881 | `f2e733adfc13` | arc.scene.actions; class AddListenerAction |
| `arc-core/src/arc/scene/actions/AfterAction.java` | 1124 | `d0106dac372b` | arc.scene.actions; class AfterAction |
| `arc-core/src/arc/scene/actions/AlphaAction.java` | 1164 | `48d394193a99` | arc.scene.actions; class AlphaAction |
| `arc-core/src/arc/scene/actions/ColorAction.java` | 1545 | `a26841886019` | arc.scene.actions; class ColorAction |
| `arc-core/src/arc/scene/actions/DelayAction.java` | 1236 | `cd3a534e1824` | arc.scene.actions; class DelayAction |
| `arc-core/src/arc/scene/actions/DelegateAction.java` | 1408 | `63f2d76bcdcf` | arc.scene.actions; class DelegateAction |
| `arc-core/src/arc/scene/actions/FloatAction.java` | 1284 | `d9238e40d287` | arc.scene.actions; class FloatAction |
| `arc-core/src/arc/scene/actions/IntAction.java` | 1258 | `9c74ddcba6d8` | arc.scene.actions; class IntAction |
| `arc-core/src/arc/scene/actions/LayoutAction.java` | 569 | `c479d51d247b` | arc.scene.actions; class LayoutAction |
| `arc-core/src/arc/scene/actions/MoveByAction.java` | 693 | `f014ddce5d83` | arc.scene.actions; class MoveByAction |
| `arc-core/src/arc/scene/actions/MoveToAction.java` | 1327 | `a0293c7e448b` | arc.scene.actions; class MoveToAction |
| `arc-core/src/arc/scene/actions/OriginAction.java` | 240 | `0057c1703ae0` | arc.scene.actions; class OriginAction |
| `arc-core/src/arc/scene/actions/ParallelAction.java` | 3050 | `c049f47bbe2a` | arc.scene.actions; class ParallelAction |
| `arc-core/src/arc/scene/actions/RelativeTemporalAction.java` | 543 | `2f94fc2d4698` | arc.scene.actions; class RelativeTemporalAction |
| `arc-core/src/arc/scene/actions/RemoveAction.java` | 541 | `2ab843be1240` | arc.scene.actions; class RemoveAction |
| `arc-core/src/arc/scene/actions/RemoveActorAction.java` | 441 | `42eb8668daa8` | arc.scene.actions; class RemoveActorAction |
| `arc-core/src/arc/scene/actions/RemoveListenerAction.java` | 895 | `116794343d2c` | arc.scene.actions; class RemoveListenerAction |
| `arc-core/src/arc/scene/actions/RepeatAction.java` | 1110 | `20d77883afca` | arc.scene.actions; class RepeatAction |
| `arc-core/src/arc/scene/actions/RotateByAction.java` | 494 | `899e2963e3bb` | arc.scene.actions; class RotateByAction |
| `arc-core/src/arc/scene/actions/RotateToAction.java` | 1714 | `68ef0f19cc26` | arc.scene.actions; class RotateToAction |
| `arc-core/src/arc/scene/actions/RunnableAction.java` | 1115 | `47633d11e049` | arc.scene.actions; class RunnableAction |
| `arc-core/src/arc/scene/actions/ScaleByAction.java` | 917 | `ebb76aa32c75` | arc.scene.actions; class ScaleByAction |
| `arc-core/src/arc/scene/actions/ScaleToAction.java` | 925 | `cfd9cac9787e` | arc.scene.actions; class ScaleToAction |
| `arc-core/src/arc/scene/actions/SequenceAction.java` | 1728 | `b1465d97692a` | arc.scene.actions; class SequenceAction |
| `arc-core/src/arc/scene/actions/SizeByAction.java` | 810 | `3b334106d153` | arc.scene.actions; class SizeByAction |
| `arc-core/src/arc/scene/actions/SizeToAction.java` | 956 | `e3e88671d8dc` | arc.scene.actions; class SizeToAction |
| `arc-core/src/arc/scene/actions/TemporalAction.java` | 3185 | `dc69a6a7f0a6` | arc.scene.actions; class TemporalAction |
| `arc-core/src/arc/scene/actions/TimeScaleAction.java` | 436 | `21076b2f9c78` | arc.scene.actions; class TimeScaleAction |
| `arc-core/src/arc/scene/actions/TouchableAction.java` | 544 | `d09afe4baefc` | arc.scene.actions; class TouchableAction |
| `arc-core/src/arc/scene/actions/TranslateByAction.java` | 707 | `5e2f4df912be` | arc.scene.actions; class TranslateByAction |
| `arc-core/src/arc/scene/actions/VisibleAction.java` | 480 | `998ea7efec33` | arc.scene.actions; class VisibleAction |
| `arc-core/src/arc/scene/event/ChangeListener.java` | 778 | `f1636a87da4e` | arc.scene.event; class ChangeListener, class ChangeEvent |
| `arc-core/src/arc/scene/event/ClickListener.java` | 7253 | `115bb73b57a4` | arc.scene.event; class ClickListener |
| `arc-core/src/arc/scene/event/DragListener.java` | 3486 | `778a6c4df5a4` | arc.scene.event; class DragListener |
| `arc-core/src/arc/scene/event/DragScrollListener.java` | 2355 | `7e8b972d02b6` | arc.scene.event; class DragScrollListener |
| `arc-core/src/arc/scene/event/ElementGestureListener.java` | 6407 | `9c12c8f96866` | arc.scene.event; class ElementGestureListener |
| `arc-core/src/arc/scene/event/EventListener.java` | 460 | `e8a6dd4dcdf2` | arc.scene.event; interface EventListener |
| `arc-core/src/arc/scene/event/FocusListener.java` | 1623 | `90976d2843e9` | arc.scene.event; class FocusListener, class FocusEvent, enum Type |
| `arc-core/src/arc/scene/event/HandCursorListener.java` | 1274 | `a9705209aded` | arc.scene.event; class HandCursorListener |
| `arc-core/src/arc/scene/event/IbeamCursorListener.java` | 694 | `29b1dd4f2b06` | arc.scene.event; class IbeamCursorListener |
| `arc-core/src/arc/scene/event/InputEvent.java` | 2207 | `b2ecf473613f` | arc.scene.event; class InputEvent, enum InputEventType |
| `arc-core/src/arc/scene/event/InputListener.java` | 4994 | `eb54169d6a30` | arc.scene.event; class InputListener |
| `arc-core/src/arc/scene/event/ResizeListener.java` | 349 | `4489fa130ca5` | arc.scene.event; class ResizeListener |
| `arc-core/src/arc/scene/event/SceneEvent.java` | 2513 | `ca68232cdd4d` | arc.scene.event; class SceneEvent |
| `arc-core/src/arc/scene/event/SceneResizeEvent.java` | 79 | `bf232e137f5e` | arc.scene.event; class SceneResizeEvent |
| `arc-core/src/arc/scene/event/Touchable.java` | 569 | `d58c12595287` | arc.scene.event; enum Touchable |
| `arc-core/src/arc/scene/event/VisibilityEvent.java` | 272 | `ab740fa59568` | arc.scene.event; class VisibilityEvent |
| `arc-core/src/arc/scene/event/VisibilityListener.java` | 494 | `cae2b379e371` | arc.scene.event; class VisibilityListener |
| `arc-core/src/arc/scene/style/BaseDrawable.java` | 2474 | `0e9aef41c122` | arc.scene.style; class BaseDrawable |
| `arc-core/src/arc/scene/style/Drawable.java` | 1005 | `87ce55c1bd0d` | arc.scene.style; interface Drawable |
| `arc-core/src/arc/scene/style/NinePatchDrawable.java` | 2220 | `9a34325d4813` | arc.scene.style; class NinePatchDrawable |
| `arc-core/src/arc/scene/style/ScaledNinePatchDrawable.java` | 1294 | `ebd8b274f78f` | arc.scene.style; class ScaledNinePatchDrawable |
| `arc-core/src/arc/scene/style/Style.java` | 58 | `c491bca20810` | arc.scene.style; class Style |
| `arc-core/src/arc/scene/style/TextureRegionDrawable.java` | 2487 | `534fd5582a4b` | arc.scene.style; class TextureRegionDrawable |
| `arc-core/src/arc/scene/style/TiledDrawable.java` | 3623 | `acd68f0c94a4` | arc.scene.style; class TiledDrawable |
| `arc-core/src/arc/scene/style/TransformDrawable.java` | 281 | `67cbcd679888` | arc.scene.style; interface TransformDrawable |
| `arc-core/src/arc/scene/ui/Button.java` | 10471 | `f6c2a2942617` | arc.scene.ui; class Button, class ButtonStyle |
| `arc-core/src/arc/scene/ui/ButtonGroup.java` | 5338 | `761e09c55e66` | arc.scene.ui; class ButtonGroup |
| `arc-core/src/arc/scene/ui/CheckBox.java` | 2673 | `5e459d8b9abf` | arc.scene.ui; class CheckBox, class CheckBoxStyle |
| `arc-core/src/arc/scene/ui/ColorImage.java` | 281 | `23c0f2e1f7be` | arc.scene.ui; class ColorImage |
| `arc-core/src/arc/scene/ui/Dialog.java` | 19030 | `ad5a78eee3d6` | arc.scene.ui; class Dialog, class DialogStyle |
| `arc-core/src/arc/scene/ui/Image.java` | 5509 | `dd89138e91d7` | arc.scene.ui; class Image |
| `arc-core/src/arc/scene/ui/ImageButton.java` | 6204 | `7865fa4d5163` | arc.scene.ui; class ImageButton, class ImageButtonStyle |
| `arc-core/src/arc/scene/ui/Label.java` | 12731 | `e3236f8617af` | arc.scene.ui; class Label, class LabelStyle |
| `arc-core/src/arc/scene/ui/ProgressBar.java` | 15780 | `46a197576537` | arc.scene.ui; class ProgressBar, class ProgressBarStyle |
| `arc-core/src/arc/scene/ui/ScrollPane.java` | 40919 | `c3b3e6254f2e` | arc.scene.ui; class ScrollPane |
| `arc-core/src/arc/scene/ui/Slider.java` | 7821 | `f977786b365d` | arc.scene.ui; class Slider, class SliderStyle |
| `arc-core/src/arc/scene/ui/TextArea.java` | 15945 | `5da746868d4c` | arc.scene.ui; class TextArea, class TextAreaListener |
| `arc-core/src/arc/scene/ui/TextButton.java` | 3950 | `c09541910e13` | arc.scene.ui; class TextButton, class TextButtonStyle |
| `arc-core/src/arc/scene/ui/TextField.java` | 41417 | `fe58b64b036a` | arc.scene.ui; class TextField |
| `arc-core/src/arc/scene/ui/Tooltip.java` | 9552 | `1bf2295910c4` | arc.scene.ui; class Tooltip, class Tooltips |
| `arc-core/src/arc/scene/ui/Touchpad.java` | 8302 | `c1101fb40025` | arc.scene.ui; class Touchpad, class TouchpadStyle |
| `arc-core/src/arc/scene/ui/TreeElement.java` | 23174 | `5978b0bf9833` | arc.scene.ui; class TreeElement, class TreeElementNode |
| `arc-core/src/arc/scene/ui/layout/Cell.java` | 18492 | `b6bc7af07dc3` | arc.scene.ui.layout; class Cell |
| `arc-core/src/arc/scene/ui/layout/Collapser.java` | 4952 | `3eed79dbda93` | arc.scene.ui.layout; class Collapser, class CollapseAction |
| `arc-core/src/arc/scene/ui/layout/Scl.java` | 997 | `ddeb7f40b8b2` | arc.scene.ui.layout; class Scl |
| `arc-core/src/arc/scene/ui/layout/Spacer.java` | 847 | `3a7772d5c51a` | arc.scene.ui.layout; class Spacer |
| `arc-core/src/arc/scene/ui/layout/Stack.java` | 4641 | `d1006cff0a87` | arc.scene.ui.layout; class Stack |
| `arc-core/src/arc/scene/ui/layout/Table.java` | 45369 | `cc409ff49648` | arc.scene.ui.layout; class Table |
| `arc-core/src/arc/scene/ui/layout/WidgetGroup.java` | 3955 | `6f4d25fe97be` | arc.scene.ui.layout; class WidgetGroup |
| `arc-core/src/arc/scene/utils/Cullable.java` | 616 | `734eff990f18` | arc.scene.utils; interface Cullable |
| `arc-core/src/arc/scene/utils/Disableable.java` | 127 | `b205c5c5c58d` | arc.scene.utils; interface Disableable |
| `arc-core/src/arc/scene/utils/Elem.java` | 2405 | `33b55633cf35` | arc.scene.utils; class Elem |
| `arc-core/src/arc/scene/utils/Selection.java` | 8836 | `95dc2a0196b0` | arc.scene.utils; class Selection |
| `arc-core/src/arc/struct/ArrayMap.java` | 21275 | `458018d8fbfc` | arc.struct; class ArrayMap, class Entries, class Values |
| `arc-core/src/arc/struct/BinaryHeap.java` | 5677 | `3a569496a268` | arc.struct; class BinaryHeap, class Node |
| `arc-core/src/arc/struct/Bits.java` | 12614 | `8705297c0f09` | arc.struct; class Bits |
| `arc-core/src/arc/struct/BoolSeq.java` | 12801 | `fd8349d29f05` | arc.struct; class BoolSeq |
| `arc-core/src/arc/struct/ByteSeq.java` | 13687 | `b7cdf2784e42` | arc.struct; class ByteSeq |
| `arc-core/src/arc/struct/ComparableTimSort.java` | 34811 | `91347dc16c4b` | arc.struct; class ComparableTimSort |
| `arc-core/src/arc/struct/DelayedRemovalSeq.java` | 5266 | `0429999edf91` | arc.struct; class DelayedRemovalSeq |
| `arc-core/src/arc/struct/EnumSet.java` | 1322 | `79ea494ed933` | arc.struct; class EnumSet |
| `arc-core/src/arc/struct/FloatSeq.java` | 14815 | `5cf289b732d1` | arc.struct; class FloatSeq |
| `arc-core/src/arc/struct/GridBits.java` | 895 | `ee81191acac2` | arc.struct; class GridBits |
| `arc-core/src/arc/struct/GridMap.java` | 1096 | `90b15bed343e` | arc.struct; class GridMap |
| `arc-core/src/arc/struct/IntFloatMap.java` | 28164 | `0631a7ccd95f` | arc.struct; class IntFloatMap |
| `arc-core/src/arc/struct/IntIntMap.java` | 29718 | `21515c77210b` | arc.struct; class IntIntMap |
| `arc-core/src/arc/struct/IntMap.java` | 29001 | `d224d9aeb8f8` | arc.struct; class IntMap |
| `arc-core/src/arc/struct/IntQueue.java` | 9951 | `038403a75ac8` | arc.struct; class IntQueue |
| `arc-core/src/arc/struct/IntSeq.java` | 15522 | `a3f5b2640d15` | arc.struct; class IntSeq |
| `arc-core/src/arc/struct/IntSet.java` | 18256 | `03e14b31e7a7` | arc.struct; class IntSet, class IntSetIterator |
| `arc-core/src/arc/struct/LongMap.java` | 29120 | `98726e9d2f1f` | arc.struct; class LongMap |
| `arc-core/src/arc/struct/LongQueue.java` | 10588 | `7a69f06e37c0` | arc.struct; class LongQueue |
| `arc-core/src/arc/struct/LongSeq.java` | 13721 | `f462b336ca7b` | arc.struct; class LongSeq |
| `arc-core/src/arc/struct/ObjectFloatMap.java` | 26422 | `e33d92e43b16` | arc.struct; class ObjectFloatMap |
| `arc-core/src/arc/struct/ObjectIntMap.java` | 27249 | `0174f24f4bee` | arc.struct; class ObjectIntMap |
| `arc-core/src/arc/struct/ObjectMap.java` | 29628 | `20f645e47430` | arc.struct; class ObjectMap |
| `arc-core/src/arc/struct/ObjectSet.java` | 20236 | `d9a1fac74916` | arc.struct; class ObjectSet, class ObjectSetIterator |
| `arc-core/src/arc/struct/OrderedMap.java` | 7603 | `8ad9039de96c` | arc.struct; class OrderedMap, class OrderedMapEntries, class OrderedMapKeys, class OrderedMapValues |
| `arc-core/src/arc/struct/OrderedSet.java` | 3826 | `c0af7ce0a7a0` | arc.struct; class OrderedSet, class OrderedSetIterator |
| `arc-core/src/arc/struct/PQueue.java` | 5834 | `66bc09e775a4` | arc.struct; class PQueue |
| `arc-core/src/arc/struct/Queue.java` | 17834 | `e50c21449b29` | arc.struct; class Queue, class QueueIterable, class QueueIterator |
| `arc-core/src/arc/struct/Seq.java` | 36221 | `8725fa770028` | arc.struct; class Seq |
| `arc-core/src/arc/struct/ShortSeq.java` | 14036 | `512dc1b4fd48` | arc.struct; class ShortSeq |
| `arc-core/src/arc/struct/SnapshotSeq.java` | 4543 | `19203ea42aa1` | arc.struct; class SnapshotSeq |
| `arc-core/src/arc/struct/Sort.java` | 2547 | `e8a0860ba970` | arc.struct; class Sort |
| `arc-core/src/arc/struct/StringMap.java` | 1306 | `2e68c303b40c` | arc.struct; class StringMap |
| `arc-core/src/arc/struct/TimSort.java` | 36585 | `d45ad2804601` | arc.struct; class TimSort |
| `arc-core/src/arc/util/Align.java` | 1678 | `96a74a949191` | arc.util; class Align |
| `arc-core/src/arc/util/ArcNativesLoader.java` | 415 | `68392f4a736c` | arc.util; class ArcNativesLoader |
| `arc-core/src/arc/util/ArcRuntimeException.java` | 395 | `865d889df4e7` | arc.util; class ArcRuntimeException |
| `arc-core/src/arc/util/Bench.java` | 870 | `dd931ea8ccc4` | arc.util; class Bench |
| `arc-core/src/arc/util/Buffers.java` | 12717 | `a98d5eb918a4` | arc.util; class Buffers |
| `arc-core/src/arc/util/ColorCodes.java` | 2255 | `00fa8bb0fd07` | arc.util; class ColorCodes |
| `arc-core/src/arc/util/CommandHandler.java` | 8467 | `38d347b82432` | arc.util; class CommandHandler, enum ResponseType, class Command, interface CommandRunner, class CommandParam |
| `arc-core/src/arc/util/Disposable.java` | 250 | `0ae9b802acf2` | arc.util; interface Disposable |
| `arc-core/src/arc/util/Eachable.java` | 108 | `9cdf45b8e49e` | arc.util; interface Eachable |
| `arc-core/src/arc/util/Http.java` | 15414 | `344be80ddeb2` | arc.util; class Http, class HttpResponse, class HttpRequest, class HttpStatusException, enum HttpMethod |
| `arc-core/src/arc/util/I18NBundle.java` | 21587 | `036c127f4240` | arc.util; class I18NBundle |
| `arc-core/src/arc/util/Interval.java` | 968 | `bb464f384a51` | arc.util; class Interval |
| `arc-core/src/arc/util/Log.java` | 3981 | `f6fb314322ca` | arc.util; class Log, enum LogLevel, interface LogFormatter, class DefaultLogFormatter, interface LogHandler |
| `arc-core/src/arc/util/Nullable.java` | 290 | `b07a775968f9` | arc.util;  |
| `arc-core/src/arc/util/OS.java` | 6657 | `994ea70d327a` | arc.util; class OS |
| `arc-core/src/arc/util/Pack.java` | 3282 | `c5029ef9b0ac` | arc.util; class Pack |
| `arc-core/src/arc/util/PerformanceCounter.java` | 4378 | `993a9318bc84` | arc.util; class PerformanceCounter |
| `arc-core/src/arc/util/PerformanceCounters.java` | 1341 | `3dbe7ae283de` | arc.util; class PerformanceCounters |
| `arc-core/src/arc/util/QuickSelect.java` | 2700 | `703897368054` | arc.util; class QuickSelect |
| `arc-core/src/arc/util/Ratekeeper.java` | 666 | `99243dd1a20c` | arc.util; class Ratekeeper |
| `arc-core/src/arc/util/Reflect.java` | 3972 | `52bb961e10f2` | arc.util; class Reflect |
| `arc-core/src/arc/util/Scaling.java` | 4078 | `d6c11ee62a5c` | arc.util; enum Scaling |
| `arc-core/src/arc/util/ScreenRecorder.java` | 873 | `b0a8fae06cc6` | arc.util; class ScreenRecorder |
| `arc-core/src/arc/util/ScreenUtils.java` | 5665 | `c7b1ce1ff08a` | arc.util; class ScreenUtils |
| `arc-core/src/arc/util/Select.java` | 2999 | `221ad68dec56` | arc.util; class Select |
| `arc-core/src/arc/util/SharedLibraryLoader.java` | 11667 | `3dd2aef3225e` | arc.util; class SharedLibraryLoader |
| `arc-core/src/arc/util/Strings.java` | 25024 | `df0f35823e1c` | arc.util; class Strings |
| `arc-core/src/arc/util/Structs.java` | 7801 | `ea537ecc3bfb` | arc.util; class Structs |
| `arc-core/src/arc/util/TaskQueue.java` | 767 | `bd5d70901eac` | arc.util; class TaskQueue |
| `arc-core/src/arc/util/TextFormatter.java` | 6612 | `0fddc114f253` | arc.util; class TextFormatter |
| `arc-core/src/arc/util/Threads.java` | 4966 | `f74feda1d56a` | arc.util; class Threads |
| `arc-core/src/arc/util/Time.java` | 4392 | `9811efc1a7da` | arc.util; class Time, class DelayRun |
| `arc-core/src/arc/util/Timekeeper.java` | 1051 | `3444749851c4` | arc.util; class Timekeeper |
| `arc-core/src/arc/util/Timer.java` | 12352 | `808d12a84827` | arc.util; class Timer, class Task, class TimerThread |
| `arc-core/src/arc/util/Tmp.java` | 1778 | `cf48fe6b849d` | arc.util; class Tmp |
| `arc-core/src/arc/util/UnsafeRunnable.java` | 132 | `24bf50d745ec` | arc.util; interface UnsafeRunnable |
| `arc-core/src/arc/util/io/ByteBufferInput.java` | 1898 | `2fd0b72b3d8d` | arc.util.io; class ByteBufferInput |
| `arc-core/src/arc/util/io/ByteBufferOutput.java` | 3094 | `f07b98e6cd39` | arc.util.io; class ByteBufferOutput |
| `arc-core/src/arc/util/io/CRC.java` | 985 | `1de91bdaf27c` | arc.util.io; class CRC |
| `arc-core/src/arc/util/io/CounterInputStream.java` | 734 | `b0ef656f5f27` | arc.util.io; class CounterInputStream |
| `arc-core/src/arc/util/io/FastDeflaterOutputStream.java` | 470 | `8d66f35d93bd` | arc.util.io; class FastDeflaterOutputStream |
| `arc-core/src/arc/util/io/LittleEndianInputStream.java` | 2505 | `c9e1c0a1feca` | arc.util.io; class LittleEndianInputStream |
| `arc-core/src/arc/util/io/PropertiesUtils.java` | 14642 | `0ff448f3d8d2` | arc.util.io; class PropertiesUtils |
| `arc-core/src/arc/util/io/Reads.java` | 7023 | `6bc466ff9e84` | arc.util.io; class Reads |
| `arc-core/src/arc/util/io/ReusableByteInStream.java` | 750 | `0f4b6d167e64` | arc.util.io; class ReusableByteInStream |
| `arc-core/src/arc/util/io/ReusableByteOutStream.java` | 310 | `ee7a0ac417d5` | arc.util.io; class ReusableByteOutStream |
| `arc-core/src/arc/util/io/Streams.java` | 6507 | `c31102cf863f` | arc.util.io; class Streams, class OptimizedByteArrayOutputStream |
| `arc-core/src/arc/util/io/Writes.java` | 2459 | `c7474d7db022` | arc.util.io; class Writes |
| `arc-core/src/arc/util/noise/Noise.java` | 7973 | `2da29e616dbb` | arc.util.noise; class Noise |
| `arc-core/src/arc/util/noise/Ridged.java` | 11009 | `3cdd34883786` | arc.util.noise; class Ridged |
| `arc-core/src/arc/util/noise/Simplex.java` | 19437 | `791f963d281d` | arc.util.noise; class Simplex |
| `arc-core/src/arc/util/noise/VectorTable.java` | 9196 | `da2db0440e42` | arc.util.noise; class VectorTable |
| `arc-core/src/arc/util/noise/VoronoiNoise.java` | 7213 | `dfc4127dc9b1` | arc.util.noise; class VoronoiNoise |
| `arc-core/src/arc/util/pooling/Pool.java` | 3512 | `cd4585521579` | arc.util.pooling; class Pool, interface Poolable |
| `arc-core/src/arc/util/pooling/Pools.java` | 3226 | `1237801b1965` | arc.util.pooling; class Pools |
| `arc-core/src/arc/util/serialization/Base64Coder.java` | 12270 | `8c9e426550fa` | arc.util.serialization; class Base64Coder, class CharMap |
| `arc-core/src/arc/util/serialization/BaseJsonReader.java` | 239 | `dd7ed8492ddb` | arc.util.serialization; interface BaseJsonReader |
| `arc-core/src/arc/util/serialization/BaseJsonWriter.java` | 703 | `a46932c94856` | arc.util.serialization; interface BaseJsonWriter |
| `arc-core/src/arc/util/serialization/Json.java` | 56516 | `aa97c1cec46a` | arc.util.serialization; class Json |
| `arc-core/src/arc/util/serialization/JsonReader.java` | 38943 | `e8f92f8d482f` | arc.util.serialization; class JsonReader |
| `arc-core/src/arc/util/serialization/JsonValue.java` | 46681 | `38d6bdd1f37a` | arc.util.serialization; class JsonValue |
| `arc-core/src/arc/util/serialization/JsonWriter.java` | 7508 | `13f5678f4b21` | arc.util.serialization; class JsonWriter, enum OutputType, class JsonObject |
| `arc-core/src/arc/util/serialization/Jval.java` | 41329 | `daf133422277` | arc.util.serialization; class Jval, class JsonMap, class JsonArray, class WritingBuffer, enum Jformat |
| `arc-core/src/arc/util/serialization/SerializationException.java` | 1884 | `71c9ab9413b6` | arc.util.serialization; class SerializationException |
| `arc-core/src/arc/util/serialization/UBJsonReader.java` | 8583 | `8896e02ca136` | arc.util.serialization; class UBJsonReader |
| `arc-core/src/arc/util/serialization/UBJsonWriter.java` | 22407 | `58a83d8e25a8` | arc.util.serialization; class UBJsonWriter |
| `arc-core/src/arc/util/viewport/ExtendViewport.java` | 4332 | `58ed6ac83ced` | arc.util.viewport; class ExtendViewport |
| `arc-core/src/arc/util/viewport/FillViewport.java` | 698 | `f8f68bbdc7df` | arc.util.viewport; class FillViewport |
| `arc-core/src/arc/util/viewport/FitViewport.java` | 705 | `3c210cee3fc3` | arc.util.viewport; class FitViewport |
| `arc-core/src/arc/util/viewport/ScalingViewport.java` | 1933 | `acb5171aa724` | arc.util.viewport; class ScalingViewport |
| `arc-core/src/arc/util/viewport/ScreenViewport.java` | 1204 | `d7c079f141f9` | arc.util.viewport; class ScreenViewport |
| `arc-core/src/arc/util/viewport/StretchViewport.java` | 683 | `f2ea44b84ae4` | arc.util.viewport; class StretchViewport |
| `arc-core/src/arc/util/viewport/Viewport.java` | 7363 | `d15a558330f9` | arc.util.viewport; class Viewport |
| `arc-core/test/PixmapTest.java` | 3646 | `d93de7f94ddf` | class PixmapTest |
| `arc-core/test/SkinGenerator.java` | 2736 | `28c8ce4b3134` | class SkinGenerator |
| `arc-core/test/StringsTest.java` | 2121 | `ae8009a318bd` | class StringsTest |
| `arc-core/test/math/BezierTest.java` | 2775 | `236ddd49b54b` | math; class BezierTest, enum ImportType |
| `arc-core/test/math/IntersectorTest.java` | 1433 | `7d208944b61c` | math; class IntersectorTest |
| `arc-core/test/math/MathfTest.java` | 893 | `2f80e01d0042` | math; class MathfTest |
| `arc-core/test/math/NoiseTest.java` | 731 | `c3bbeb4d3cf0` | math; class NoiseTest |
| `arc-core/test/math/PoolTest.java` | 1317 | `b57a7252f8fb` | math; class PoolTest |
| `arc-core/test/math/RectangleTest.java` | 441 | `1086097be583` | math; class RectangleTest |
| `arc-core/test/math/Shape2DTest.java` | 1044 | `c2008eb146ed` | math; class Shape2DTest |
| `arc-core/test/math/Vector2Test.java` | 405 | `5f7770ebe6ab` | math; class Vector2Test |
| `arc-core/test/math/Vector3Test.java` | 445 | `2a24f23268c9` | math; class Vector3Test |
| `arc-core/test/resources/generated.json` | 26651 | `8dd6391ab255` |  |
| `arc-core/test/utils/BitsTest.java` | 1625 | `71bd6711ae70` | utils; class BitsTest |
| `arc-core/test/utils/JvalTest.java` | 4634 | `b2418657bd96` | utils; class JvalTest |
| `arc-core/test/utils/QueueTest.java` | 9525 | `dd6715d2b0a0` | utils; class QueueTest |
| `arc-core/unsafe/Java16Buffers.java` | 422 | `3728d987202f` | arc.util; class Java16Buffers |
| `arc-core/unsafe/UnsafeBuffers.java` | 1433 | `40a5dd6ee41e` | arc.util; class UnsafeBuffers |
| `backends/backend-android/build.gradle` | 598 | `95abebf64765` |  |
| `backends/backend-android/src/arc/backend/android/AndroidApplication.java` | 13856 | `ab2590f1889b` | arc.backend.android; class AndroidApplication, interface AndroidEventListener |
| `backends/backend-android/src/arc/backend/android/AndroidApplicationConfiguration.java` | 3146 | `30410333c22a` | arc.backend.android; class AndroidApplicationConfiguration |
| `backends/backend-android/src/arc/backend/android/AndroidApplicationLogger.java` | 889 | `c0508403bff1` | arc.backend.android; class AndroidApplicationLogger |
| `backends/backend-android/src/arc/backend/android/AndroidFi.java` | 8493 | `83d9777307f1` | arc.backend.android; class AndroidFi |
| `backends/backend-android/src/arc/backend/android/AndroidFiles.java` | 1299 | `1339020fc34e` | arc.backend.android; class AndroidFiles |
| `backends/backend-android/src/arc/backend/android/AndroidGL20.java` | 20245 | `d1f67ade388f` | arc.backend.android; class AndroidGL20 |
| `backends/backend-android/src/arc/backend/android/AndroidGL30.java` | 14880 | `5e7c39f9333c` | arc.backend.android; class AndroidGL30 |
| `backends/backend-android/src/arc/backend/android/AndroidGraphics.java` | 16325 | `6fae76f95c8d` | arc.backend.android; class AndroidGraphics |
| `backends/backend-android/src/arc/backend/android/AndroidInput.java` | 36207 | `16ccf883abd1` | arc.backend.android; class AndroidInput |
| `backends/backend-android/src/arc/backend/android/AndroidInputMap.java` | 6484 | `f4f9ddfd568a` | arc.backend.android; class AndroidInputMap |
| `backends/backend-android/src/arc/backend/android/surfaceview/ArcEglConfigChooser.java` | 9481 | `95a2a59a885b` | arc.backend.android.surfaceview; class ArcEglConfigChooser |
| `backends/backend-android/src/arc/backend/android/surfaceview/FillResolutionStrategy.java` | 1349 | `91b1615c4437` | arc.backend.android.surfaceview; class FillResolutionStrategy |
| `backends/backend-android/src/arc/backend/android/surfaceview/FixedResolutionStrategy.java` | 1313 | `cda477a272e3` | arc.backend.android.surfaceview; class FixedResolutionStrategy |
| `backends/backend-android/src/arc/backend/android/surfaceview/GLSurfaceView20.java` | 14211 | `743110dfe741` | arc.backend.android.surfaceview; class GLSurfaceView20, class ContextFactory, class ConfigChooser |
| `backends/backend-android/src/arc/backend/android/surfaceview/RatioResolutionStrategy.java` | 1248 | `bf4ca8ffac3d` | arc.backend.android.surfaceview; class RatioResolutionStrategy |
| `backends/backend-android/src/arc/backend/android/surfaceview/ResolutionStrategy.java` | 624 | `fa7c12652942` | arc.backend.android.surfaceview; interface ResolutionStrategy, class MeasuredDimension |
| `backends/backend-headless/src/arc/backend/headless/HeadlessApplication.java` | 3856 | `694b68b281b7` | arc.backend.headless; class HeadlessApplication |
| `backends/backend-robovm/build.gradle` | 934 | `ffbec34892d2` |  |
| `backends/backend-robovm/src/arc/backend/robovm/IOSApplication.java` | 10191 | `2ddab10889cf` | arc.backend.robovm; class IOSApplication, class Delegate |
| `backends/backend-robovm/src/arc/backend/robovm/IOSApplicationConfiguration.java` | 2423 | `4da091d5a854` | arc.backend.robovm; class IOSApplicationConfiguration |
| `backends/backend-robovm/src/arc/backend/robovm/IOSDevice.java` | 8538 | `e9786e69adfb` | arc.backend.robovm; class IOSDevice |
| `backends/backend-robovm/src/arc/backend/robovm/IOSFi.java` | 1413 | `e2aaa1e77418` | arc.backend.robovm; class IOSFi |
| `backends/backend-robovm/src/arc/backend/robovm/IOSFiles.java` | 1568 | `a652be5bf0cc` | arc.backend.robovm; class IOSFiles |
| `backends/backend-robovm/src/arc/backend/robovm/IOSGLES20.java` | 12106 | `391b4f545517` | arc.backend.robovm; class IOSGLES20 |
| `backends/backend-robovm/src/arc/backend/robovm/IOSGLES30.java` | 7877 | `ccf13ae92f04` | arc.backend.robovm; class IOSGLES30 |
| `backends/backend-robovm/src/arc/backend/robovm/IOSGraphics.java` | 12519 | `ea206f05f58f` | arc.backend.robovm; class IOSGraphics, class IOSGraphicsDelegate |
| `backends/backend-robovm/src/arc/backend/robovm/IOSInput.java` | 23234 | `5b7e4a30e1e0` | arc.backend.robovm; class IOSInput |
| `backends/backend-robovm/src/arc/backend/robovm/IOSKeymap.java` | 6373 | `0931208361d0` | arc.backend.robovm; class IOSKeymap |
| `backends/backend-robovm/src/arc/backend/robovm/IOSScreenBounds.java` | 593 | `6f09f58b39f1` | arc.backend.robovm; class IOSScreenBounds |
| `backends/backend-robovm/src/arc/backend/robovm/IOSUIViewController.java` | 3901 | `338310c14413` | arc.backend.robovm; class IOSUIViewController |
| `backends/backend-robovm/src/arc/backend/robovm/IOSViewControllerListener.java` | 493 | `e3bcd1eb5e65` | arc.backend.robovm; interface IOSViewControllerListener |
| `backends/backend-robovm/src/arc/backend/robovm/custom/HWMachine.java` | 1101 | `ef2335afa30b` | arc.backend.robovm.custom; class HWMachine |
| `backends/backend-robovm/src/arc/backend/robovm/custom/UIAcceleration.java` | 2074 | `46b7bb343ce7` | arc.backend.robovm.custom;  |
| `backends/backend-robovm/src/arc/backend/robovm/custom/UIAccelerometer.java` | 2372 | `11dcda01c213` | arc.backend.robovm.custom;  |
| `backends/backend-robovm/src/arc/backend/robovm/custom/UIAccelerometerDelegate.java` | 1466 | `2aeb480552d0` | arc.backend.robovm.custom;  |
| `backends/backend-robovm/src/arc/backend/robovm/custom/UIAccelerometerDelegateAdapter.java` | 1620 | `c0c159205d79` | arc.backend.robovm.custom;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLContext.java` | 3182 | `feae517e6665` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLDrawableColorFormat.java` | 1576 | `0a58c77e9742` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLDrawableDepthFormat.java` | 1561 | `6593e939b4a2` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLDrawableMultisample.java` | 1550 | `57f7721c2b00` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLDrawableStencilFormat.java` | 1559 | `7fe9909cd10e` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLKView.java` | 4698 | `a314e5a09244` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLKViewController.java` | 3427 | `c4c1b07ee60a` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLKViewControllerDelegate.java` | 1339 | `639c86ea69c3` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLKViewControllerDelegateAdapter.java` | 1452 | `f918e05c9da3` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLKViewDelegate.java` | 1414 | `0b6aaabb33bf` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLKViewDelegateAdapter.java` | 1517 | `72dd733f84cb` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLLayer.java` | 3307 | `4b0daf164a28` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLRenderingAPI.java` | 1541 | `6e0a766d3d8d` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/MGLSharegroup.java` | 1694 | `4cd4eb186290` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/bindings/metalangle/khronos_boolean_enum_t.java` | 1590 | `9ea93d64529d` | com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;  |
| `backends/backend-sdl/build.gradle` | 5813 | `8020302cab27` |  |
| `backends/backend-sdl/src/arc/backend/sdl/SdlApplication.java` | 12582 | `b6a9a179f78b` | arc.backend.sdl; class SdlApplication, class SdlError |
| `backends/backend-sdl/src/arc/backend/sdl/SdlConfig.java` | 1257 | `22e7fd3869cd` | arc.backend.sdl; class SdlConfig |
| `backends/backend-sdl/src/arc/backend/sdl/SdlFiles.java` | 1768 | `07fd5af220fb` | arc.backend.sdl; class SdlFiles, class SdlFi |
| `backends/backend-sdl/src/arc/backend/sdl/SdlGL20.java` | 18595 | `49f9e4a857fa` | arc.backend.sdl; class SdlGL20 |
| `backends/backend-sdl/src/arc/backend/sdl/SdlGL30.java` | 12544 | `fa12b25c2eb4` | arc.backend.sdl; class SdlGL30 |
| `backends/backend-sdl/src/arc/backend/sdl/SdlGraphics.java` | 7749 | `000cf4df88a0` | arc.backend.sdl; class SdlGraphics, class SdlCursor |
| `backends/backend-sdl/src/arc/backend/sdl/SdlInput.java` | 7767 | `c69f6c9b4c31` | arc.backend.sdl; class SdlInput, class EditEvent, class ImeData |
| `backends/backend-sdl/src/arc/backend/sdl/SdlKeymap.java` | 3930 | `07180f948092` | arc.backend.sdl; class SdlKeymap |
| `backends/backend-sdl/src/arc/backend/sdl/SdlScanmap.java` | 4568 | `dda85bd84509` | arc.backend.sdl; class SdlScanmap |
| `backends/backend-sdl/src/arc/backend/sdl/jni/SDL.java` | 14954 | `6ff541081c3c` | arc.backend.sdl.jni; class SDL |
| `backends/backend-sdl/src/arc/backend/sdl/jni/SDLGL.java` | 42166 | `5a80f39305eb` | arc.backend.sdl.jni; class SDLGL |
| `backends/backend-sdl3/build.gradle` | 292 | `2f0b0ba322a1` |  |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlApplication.java` | 14854 | `0b4c3aa0ae95` | arc.backend.sdl; class SdlApplication, class SdlError |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlConfig.java` | 1311 | `d1dec9ddd769` | arc.backend.sdl; class SdlConfig |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlFiles.java` | 1768 | `07fd5af220fb` | arc.backend.sdl; class SdlFiles, class SdlFi |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlGL20.java` | 29836 | `377fa381bcd8` | arc.backend.sdl; class SdlGL20 |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlGL30.java` | 19428 | `dbe7ead60ee7` | arc.backend.sdl; class SdlGL30 |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlGraphics.java` | 8177 | `7a8eb6f25972` | arc.backend.sdl; class SdlGraphics, class SdlCursor |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlInput.java` | 8176 | `a5dd17e97949` | arc.backend.sdl; class SdlInput, class ImeData, class EditEvent |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlKeymap.java` | 3930 | `07180f948092` | arc.backend.sdl; class SdlKeymap |
| `backends/backend-sdl3/src/arc/backend/sdl/SdlScanmap.java` | 4568 | `dda85bd84509` | arc.backend.sdl; class SdlScanmap |
| `backends/build.gradle` | 160 | `945df6a80da3` |  |
| `build.gradle` | 3419 | `153878435430` |  |
| `extensions/arcnet/src/arc/net/ArcNet.java` | 204 | `0c0ee610e969` | arc.net; class ArcNet |
| `extensions/arcnet/src/arc/net/ArcNetException.java` | 378 | `11c5f886fb49` | arc.net; class ArcNetException |
| `extensions/arcnet/src/arc/net/Client.java` | 18333 | `43dadfcf7b64` | arc.net; class Client |
| `extensions/arcnet/src/arc/net/ClientDiscoveryHandler.java` | 934 | `0294ad87a9c8` | arc.net; interface ClientDiscoveryHandler |
| `extensions/arcnet/src/arc/net/Connection.java` | 11103 | `d85dde3d9ef7` | arc.net; class Connection |
| `extensions/arcnet/src/arc/net/DcReason.java` | 69 | `21c86a936fb1` | arc.net; enum DcReason |
| `extensions/arcnet/src/arc/net/EndPoint.java` | 1141 | `9e68baa5d0fb` | arc.net; interface EndPoint |
| `extensions/arcnet/src/arc/net/FrameworkMessage.java` | 1026 | `1d86744126ef` | arc.net; interface FrameworkMessage, class RegisterTCP, class RegisterUDP, class KeepAlive, class DiscoverHost |
| `extensions/arcnet/src/arc/net/InputStreamSender.java` | 1054 | `b0e597328fc1` | arc.net; class InputStreamSender |
| `extensions/arcnet/src/arc/net/NetListener.java` | 4924 | `232398ebb5ed` | arc.net; interface NetListener, class QueuedListener, class ThreadedListener, class LagListener |
| `extensions/arcnet/src/arc/net/NetSerializer.java` | 963 | `da4c5e4a7020` | arc.net; interface NetSerializer |
| `extensions/arcnet/src/arc/net/Server.java` | 25159 | `8144ac272ed7` | arc.net; class Server |
| `extensions/arcnet/src/arc/net/ServerDiscoveryHandler.java` | 532 | `7cc664ec2b7f` | arc.net; interface ServerDiscoveryHandler, interface ReponseHandler |
| `extensions/arcnet/src/arc/net/TcpConnection.java` | 8214 | `3224722dc923` | arc.net; class TcpConnection |
| `extensions/arcnet/src/arc/net/TcpIdleSender.java` | 734 | `f4f6f267091f` | arc.net; class TcpIdleSender |
| `extensions/arcnet/src/arc/net/UdpConnection.java` | 4860 | `db6a38a184f1` | arc.net; class UdpConnection |
| `extensions/arcnet/src/arc/net/dns/ArcDns.java` | 5990 | `efaaf122e6c2` | arc.net.dns; class ArcDns |
| `extensions/arcnet/src/arc/net/dns/JndiContextNameserverProvider.java` | 2895 | `6aa1e1cec7d8` | arc.net.dns; class JndiContextNameserverProvider, class Inner |
| `extensions/arcnet/src/arc/net/dns/NameserverProvider.java` | 455 | `b802e8cdb5c4` | arc.net.dns; interface NameserverProvider |
| `extensions/arcnet/src/arc/net/dns/ResolvConfNameserverProvider.java` | 1610 | `d9d180baded7` | arc.net.dns; class ResolvConfNameserverProvider |
| `extensions/arcnet/src/arc/net/dns/SRVRecord.java` | 964 | `336fb3188cca` | arc.net.dns; class SRVRecord |
| `extensions/arcnet/src/arc/net/dns/WellKnownNameserverProvider.java` | 506 | `a08978b5489d` | arc.net.dns; class WellKnownNameserverProvider |
| `extensions/build.gradle` | 156 | `a1d58f4db4a6` |  |
| `extensions/discord/src/arc/discord/DiscordRPC.java` | 14818 | `1e7e255f450b` | arc.discord; class DiscordRPC, class Packet, enum PacketOp, class NoDiscordClientException, class User |
| `extensions/filedialogs/build.gradle` | 678 | `b848ef140fa0` |  |
| `extensions/filedialogs/src/arc/filedialogs/FileDialogs.java` | 6032 | `dbebc0071f11` | arc.filedialogs; class FileDialogs |
| `extensions/flabel/src/arc/flabel/FConfig.java` | 3630 | `c8a568911118` | arc.flabel; class FConfig |
| `extensions/flabel/src/arc/flabel/FEffect.java` | 3120 | `352e9f12650f` | arc.flabel; class FEffect |
| `extensions/flabel/src/arc/flabel/FGlyph.java` | 1582 | `6317edcf1382` | arc.flabel; class FGlyph |
| `extensions/flabel/src/arc/flabel/FLabel.java` | 24911 | `7f42dd8027f9` | arc.flabel; class FLabel |
| `extensions/flabel/src/arc/flabel/FListener.java` | 1479 | `dd18e5d18fdf` | arc.flabel; interface FListener |
| `extensions/flabel/src/arc/flabel/FParser.java` | 11270 | `bfc80caf657d` | arc.flabel; class FParser, interface TokenHandler, enum InternalToken, enum TokenCategory, class TokenEntry |
| `extensions/flabel/src/arc/flabel/effects/BlinkEffect.java` | 1403 | `fe70b71b25a0` | arc.flabel.effects; class BlinkEffect |
| `extensions/flabel/src/arc/flabel/effects/EaseEffect.java` | 1733 | `b5f781dd102d` | arc.flabel.effects; class EaseEffect |
| `extensions/flabel/src/arc/flabel/effects/FadeEffect.java` | 2113 | `73422211e391` | arc.flabel.effects; class FadeEffect |
| `extensions/flabel/src/arc/flabel/effects/GradientEffect.java` | 1531 | `1eb40201faf8` | arc.flabel.effects; class GradientEffect |
| `extensions/flabel/src/arc/flabel/effects/JumpEffect.java` | 1784 | `5f291152d874` | arc.flabel.effects; class JumpEffect |
| `extensions/flabel/src/arc/flabel/effects/RainbowEffect.java` | 1503 | `235bab778afc` | arc.flabel.effects; class RainbowEffect |
| `extensions/flabel/src/arc/flabel/effects/ShakeEffect.java` | 1962 | `53048af7a7fe` | arc.flabel.effects; class ShakeEffect |
| `extensions/flabel/src/arc/flabel/effects/SickEffect.java` | 2237 | `841805b60c29` | arc.flabel.effects; class SickEffect |
| `extensions/flabel/src/arc/flabel/effects/WaveEffect.java` | 1510 | `9083f99ad5d8` | arc.flabel.effects; class WaveEffect |
| `extensions/flabel/src/arc/flabel/effects/WindEffect.java` | 2587 | `b47a4ac2a90d` | arc.flabel.effects; class WindEffect |
| `extensions/freetype/build.gradle` | 2692 | `2a6f27dfbcb1` |  |
| `extensions/freetype/src/arc/freetype/FreeType.java` | 27790 | `eb06db486de1` | arc.freetype; class FreeType, class Pointer, class Library, class Face, class Size |
| `extensions/freetype/src/arc/freetype/FreeTypeFontGenerator.java` | 37294 | `0fd912688c5c` | arc.freetype; class FreeTypeFontGenerator |
| `extensions/freetype/src/arc/freetype/FreeTypeFontGeneratorLoader.java` | 1579 | `4c171bca9f97` | arc.freetype; class FreeTypeFontGeneratorLoader, class FreeTypeFontGeneratorParameters |
| `extensions/freetype/src/arc/freetype/FreetypeFontLoader.java` | 2602 | `cfadb4964b41` | arc.freetype; class FreetypeFontLoader, class FreeTypeFontLoaderParameter |
| `extensions/fx/assets/vfxshaders/bias.frag` | 241 | `cfdef6533bce` |  |
| `extensions/fx/assets/vfxshaders/blur.vert` | 152 | `4e11c05f9cce` |  |
| `extensions/fx/assets/vfxshaders/chromatic-aberration.frag` | 1143 | `e1af4a0e62ca` |  |
| `extensions/fx/assets/vfxshaders/combine.frag` | 1271 | `4142f157660a` |  |
| `extensions/fx/assets/vfxshaders/convolve-1d.frag` | 412 | `55907b2039e4` |  |
| `extensions/fx/assets/vfxshaders/copy.frag` | 126 | `17b0f4d470b4` |  |
| `extensions/fx/assets/vfxshaders/crt.frag` | 2350 | `5ee76ca9c05a` |  |
| `extensions/fx/assets/vfxshaders/default.vert` | 309 | `84f664aa1b79` |  |
| `extensions/fx/assets/vfxshaders/film-grain.frag` | 369 | `ded991018275` |  |
| `extensions/fx/assets/vfxshaders/fisheye.frag` | 640 | `9a074f48b59f` |  |
| `extensions/fx/assets/vfxshaders/fxaa.frag` | 2953 | `db159d4a5135` |  |
| `extensions/fx/assets/vfxshaders/hdr.frag` | 406 | `65dd3e332b63` |  |
| `extensions/fx/assets/vfxshaders/lensflare.frag` | 1874 | `2c6ca30ba1ae` |  |
| `extensions/fx/assets/vfxshaders/levels.frag` | 1328 | `321fab3c47ab` |  |
| `extensions/fx/assets/vfxshaders/mix.frag` | 232 | `937bef231104` |  |
| `extensions/fx/assets/vfxshaders/motionblur-max.frag` | 301 | `1ea01230c404` |  |
| `extensions/fx/assets/vfxshaders/motionblur-mix.frag` | 300 | `2ec8785ad806` |  |
| `extensions/fx/assets/vfxshaders/nfaa.frag` | 2759 | `2799ef8e8943` |  |
| `extensions/fx/assets/vfxshaders/noise.frag` | 434 | `54b4266fdc18` |  |
| `extensions/fx/assets/vfxshaders/old-tv.frag` | 943 | `a677c9ebcb5a` |  |
| `extensions/fx/assets/vfxshaders/radial-blur.frag` | 510 | `ed6722e8631e` |  |
| `extensions/fx/assets/vfxshaders/radial-blur.vert` | 233 | `48d7889aa866` |  |
| `extensions/fx/assets/vfxshaders/radial-distortion.frag` | 588 | `8d9e379aa50d` |  |
| `extensions/fx/assets/vfxshaders/ripple.frag` | 519 | `c216ee632ea7` |  |
| `extensions/fx/assets/vfxshaders/screenspace.vert` | 153 | `81ee9772b0bc` |  |
| `extensions/fx/assets/vfxshaders/threshold.frag` | 596 | `44819ac03eb0` |  |
| `extensions/fx/assets/vfxshaders/vignetting.frag` | 2255 | `59cd4f197356` |  |
| `extensions/fx/assets/vfxshaders/zoom.frag` | 207 | `60db96acd857` |  |
| `extensions/fx/assets/vfxshaders/zoom.vert` | 267 | `c6ca664c1982` |  |
| `extensions/fx/build.gradle` | 256 | `f2d79f16f35d` |  |
| `extensions/fx/src/arc/fx/FxFilter.java` | 3880 | `d2394841782b` | arc.fx; class FxFilter |
| `extensions/fx/src/arc/fx/FxProcessor.java` | 10628 | `e6708acf5978` | arc.fx; class FxProcessor |
| `extensions/fx/src/arc/fx/filters/BiasFilter.java` | 507 | `4fedb97e3377` | arc.fx.filters; class BiasFilter |
| `extensions/fx/src/arc/fx/filters/BloomFilter.java` | 2227 | `b262a87b098e` | arc.fx.filters; class BloomFilter |
| `extensions/fx/src/arc/fx/filters/BlurFilter.java` | 2304 | `da3349aa7a12` | arc.fx.filters; class BlurFilter |
| `extensions/fx/src/arc/fx/filters/ChromaticAberrationFilter.java` | 594 | `4f0341dd2cf0` | arc.fx.filters; class ChromaticAberrationFilter |
| `extensions/fx/src/arc/fx/filters/CombineFilter.java` | 1256 | `5fe83b43746f` | arc.fx.filters; class CombineFilter |
| `extensions/fx/src/arc/fx/filters/Convolve1dFilter.java` | 1336 | `c4fd4f32be5e` | arc.fx.filters; class Convolve1dFilter |
| `extensions/fx/src/arc/fx/filters/Convolve2dFilter.java` | 1221 | `c7446ae1be48` | arc.fx.filters; class Convolve2dFilter |
| `extensions/fx/src/arc/fx/filters/CopyFilter.java` | 157 | `aa737e195c1c` | arc.fx.filters; class CopyFilter |
| `extensions/fx/src/arc/fx/filters/CrtFilter.java` | 1651 | `055cd10f2a34` | arc.fx.filters; class CrtFilter, enum SizeSource, enum LineStyle |
| `extensions/fx/src/arc/fx/filters/FilmGrainFilter.java` | 720 | `4dc01a98eba6` | arc.fx.filters; class FilmGrainFilter |
| `extensions/fx/src/arc/fx/filters/FisheyeDistortionFilter.java` | 366 | `1351bf0442f7` | arc.fx.filters; class FisheyeDistortionFilter |
| `extensions/fx/src/arc/fx/filters/FxaaFilter.java` | 1379 | `22be607040ee` | arc.fx.filters; class FxaaFilter |
| `extensions/fx/src/arc/fx/filters/GaussianBlurFilter.java` | 7412 | `c941da942e09` | arc.fx.filters; class GaussianBlurFilter, enum Tap, enum BlurType |
| `extensions/fx/src/arc/fx/filters/HdrFilter.java` | 782 | `0366c69b6dab` | arc.fx.filters; class HdrFilter |
| `extensions/fx/src/arc/fx/filters/LensFlareFilter.java` | 1086 | `9a7e24cd576a` | arc.fx.filters; class LensFlareFilter |
| `extensions/fx/src/arc/fx/filters/LevelsFilter.java` | 883 | `750945f8642c` | arc.fx.filters; class LevelsFilter |
| `extensions/fx/src/arc/fx/filters/MixFilter.java` | 1533 | `b9e96832d9cc` | arc.fx.filters; class MixFilter |
| `extensions/fx/src/arc/fx/filters/MotionBlurFilter.java` | 2619 | `3b8e36e50f67` | arc.fx.filters; class MotionBlurFilter, enum BlurFunction |
| `extensions/fx/src/arc/fx/filters/MultipassVfxFilter.java` | 562 | `b712927f3134` | arc.fx.filters; class MultipassVfxFilter |
| `extensions/fx/src/arc/fx/filters/NfaaFilter.java` | 869 | `a3501c3cfbb3` | arc.fx.filters; class NfaaFilter |
| `extensions/fx/src/arc/fx/filters/NoiseFilter.java` | 675 | `aa0e808582e6` | arc.fx.filters; class NoiseFilter |
| `extensions/fx/src/arc/fx/filters/OldTvFilter.java` | 707 | `747d11f00b26` | arc.fx.filters; class OldTvFilter |
| `extensions/fx/src/arc/fx/filters/RadialBlurFilter.java` | 1929 | `5d53222887ff` | arc.fx.filters; class RadialBlurFilter |
| `extensions/fx/src/arc/fx/filters/RadialDistortionFilter.java` | 604 | `912ec21aa313` | arc.fx.filters; class RadialDistortionFilter |
| `extensions/fx/src/arc/fx/filters/RippleFilter.java` | 669 | `f789758d067c` | arc.fx.filters; class RippleFilter |
| `extensions/fx/src/arc/fx/filters/ThresholdFilter.java` | 495 | `fd30b30a1bd6` | arc.fx.filters; class ThresholdFilter |
| `extensions/fx/src/arc/fx/filters/VignettingFilter.java` | 2581 | `259d035be711` | arc.fx.filters; class VignettingFilter |
| `extensions/fx/src/arc/fx/filters/ZoomFilter.java` | 1170 | `cb0d3c920f22` | arc.fx.filters; class ZoomFilter |
| `extensions/fx/src/arc/fx/util/FxBufferQueue.java` | 2197 | `bf9f2e520e80` | arc.fx.util; class FxBufferQueue |
| `extensions/fx/src/arc/fx/util/FxBufferRenderer.java` | 1504 | `24f1e2c0b44b` | arc.fx.util; class FxBufferRenderer |
| `extensions/fx/src/arc/fx/util/FxWidgetGroup.java` | 4350 | `088835be4abf` | arc.fx.util; class FxWidgetGroup |
| `extensions/fx/src/arc/fx/util/PingPongBuffer.java` | 6230 | `f7020a060a46` | arc.fx.util; class PingPongBuffer |
| `extensions/g3d/src/arc/graphics/g3d/Camera3D.java` | 9797 | `13ec981f8544` | arc.graphics.g3d; class Camera3D |
| `extensions/g3d/src/arc/graphics/g3d/PlaneBatch3D.java` | 4314 | `7812c295d02c` | arc.graphics.g3d; class PlaneBatch3D |
| `extensions/g3d/src/arc/graphics/g3d/VertexBatch3D.java` | 8996 | `7a6d2989e0e1` | arc.graphics.g3d; class VertexBatch3D |
| `extensions/g3d/src/arc/math/geom/Frustum.java` | 7695 | `ed3d116844a1` | arc.math.geom; class Frustum |
| `extensions/g3d/src/arc/math/geom/Icosphere.java` | 2713 | `4890b436dcca` | arc.math.geom; class Icosphere |
| `extensions/g3d/src/arc/math/geom/Intersector3D.java` | 23933 | `a53ed5370391` | arc.math.geom; class Intersector3D |
| `extensions/g3d/src/arc/math/geom/Mat3D.java` | 69993 | `5e356d8510c6` | arc.math.geom; class Mat3D |
| `extensions/g3d/src/arc/math/geom/MeshResult.java` | 162 | `2ef24db51353` | arc.math.geom; class MeshResult |
| `extensions/g3d/src/arc/math/geom/Plane.java` | 5437 | `fb640d3bd2c8` | arc.math.geom; class Plane, enum PlaneSide |
| `extensions/g3d/src/arc/math/geom/Quat.java` | 38004 | `873012c5a772` | arc.math.geom; class Quat |
| `extensions/g3d/src/arc/math/geom/Ray.java` | 3015 | `9eead01de539` | arc.math.geom; class Ray |
| `extensions/g3d/src/arc/math/geom/Segment.java` | 1667 | `1af28586671f` | arc.math.geom; class Segment |
| `extensions/g3d/src/arc/math/geom/Sphere.java` | 1592 | `9edd61f36c1c` | arc.math.geom; class Sphere |
| `extensions/packer/src/arc/packer/FileProcessor.java` | 9051 | `20bea492331f` | arc.packer; class FileProcessor, class Entry |
| `extensions/packer/src/arc/packer/GridPacker.java` | 2809 | `63a11db532c5` | arc.packer; class GridPacker |
| `extensions/packer/src/arc/packer/ImageProcessor.java` | 14401 | `87310665252d` | arc.packer; class ImageProcessor |
| `extensions/packer/src/arc/packer/MaxRectsPacker.java` | 34741 | `cf1b64f26683` | arc.packer; class MaxRectsPacker, class BinarySearch, class MaxRects |
| `extensions/packer/src/arc/packer/TexturePacker.java` | 24991 | `244bc1698a6b` | arc.packer; class TexturePacker, class Page, class Alias, class Rect |
| `extensions/packer/src/arc/packer/TexturePackerFileProcessor.java` | 8564 | `2afeca704cc3` | arc.packer; class TexturePackerFileProcessor |
| `extensions/packer/src/arc/packer/TextureUnpacker.java` | 8297 | `01d6dce34311` | arc.packer; class TextureUnpacker |
| `extensions/profiling/src/arc/profiling/GL20Interceptor.java` | 28013 | `98288bf13ee0` | arc.profiling; class GL20Interceptor |
| `extensions/profiling/src/arc/profiling/GL30Interceptor.java` | 45331 | `6a57d53900ce` | arc.profiling; class GL30Interceptor |
| `extensions/profiling/src/arc/profiling/GLErrorListener.java` | 1778 | `890ec789b10c` | arc.profiling; interface GLErrorListener |
| `extensions/profiling/src/arc/profiling/GLInterceptor.java` | 1148 | `e4ed44087516` | arc.profiling; class GLInterceptor |
| `extensions/profiling/src/arc/profiling/GLProfiler.java` | 3606 | `159f16aff0c8` | arc.profiling; class GLProfiler |
| `extensions/recorder/src/arc/gif/GifRecorder.java` | 8069 | `aa1af74761ec` | arc.gif; class GifRecorder |
| `extensions/tiled/src/arc/maps/ImageLayer.java` | 317 | `a27a5a6fe232` | arc.maps; class ImageLayer |
| `extensions/tiled/src/arc/maps/MapGroupLayer.java` | 455 | `6769edf8edbc` | arc.maps; class MapGroupLayer |
| `extensions/tiled/src/arc/maps/MapLayer.java` | 2573 | `ba487e44fa8f` | arc.maps; class MapLayer |
| `extensions/tiled/src/arc/maps/MapObject.java` | 347 | `c95a5eef2b01` | arc.maps; class MapObject |
| `extensions/tiled/src/arc/maps/MapProperties.java` | 2394 | `36561614c079` | arc.maps; class MapProperties |
| `extensions/tiled/src/arc/maps/MapTile.java` | 674 | `81e9263e3215` | arc.maps; class MapTile |
| `extensions/tiled/src/arc/maps/TileLayer.java` | 1917 | `ce7b59e4bf41` | arc.maps; class TileLayer, class Cell |
| `extensions/tiled/src/arc/maps/TileSet.java` | 1350 | `797d8b5639c0` | arc.maps; class TileSet |
| `extensions/tiled/src/arc/maps/TileSets.java` | 2341 | `8693978beb2f` | arc.maps; class TileSets |
| `extensions/tiled/src/arc/maps/TiledMap.java` | 1083 | `49bfbfac2ea3` | arc.maps; class TiledMap |
| `extensions/tiled/src/arc/maps/loaders/BaseTmxMapLoader.java` | 19513 | `15de46a43189` | arc.maps.loaders; class BaseTmxMapLoader, class Parameters |
| `extensions/tiled/src/arc/maps/loaders/ImageResolver.java` | 1599 | `56d532b42e4c` | arc.maps.loaders; interface ImageResolver, class DirectImageResolver, class AssetManagerImageResolver, class TextureAtlasImageResolver |
| `extensions/tiled/src/arc/maps/loaders/TmxMapLoader.java` | 19179 | `4a05e950c5e2` | arc.maps.loaders; class TmxMapLoader, class Parameters |
| `extensions/tiled/src/arc/maps/loaders/XmlReader.java` | 31330 | `7efacec27deb` | arc.maps.loaders; class XmlReader, class Xml |
| `extensions/tiled/src/arc/maps/objects/CircleMapObject.java` | 632 | `0badbc25ebe8` | arc.maps.objects; class CircleMapObject |
| `extensions/tiled/src/arc/maps/objects/EllipseMapObject.java` | 817 | `0262144e46be` | arc.maps.objects; class EllipseMapObject |
| `extensions/tiled/src/arc/maps/objects/PolygonMapObject.java` | 605 | `148c54bc448a` | arc.maps.objects; class PolygonMapObject |
| `extensions/tiled/src/arc/maps/objects/PolylineMapObject.java` | 599 | `98aac7fff4ad` | arc.maps.objects; class PolylineMapObject |
| `extensions/tiled/src/arc/maps/objects/RectangleMapObject.java` | 838 | `512cf2ba279a` | arc.maps.objects; class RectangleMapObject |
| `extensions/tiled/src/arc/maps/objects/TextureMapObject.java` | 613 | `192c0d2b9a18` | arc.maps.objects; class TextureMapObject |
| `extensions/tiled/src/arc/maps/objects/TileMapObject.java` | 690 | `f2a53c40b063` | arc.maps.objects; class TileMapObject |
| `gradle.properties` | 96 | `942d8e9db8e9` |  |
| `gradle/wrapper/gradle-wrapper.properties` | 202 | `5d84d66258f6` |  |
| `natives/build.gradle` | 99 | `982501c6efd8` |  |
| `settings.gradle` | 844 | `d7cd6c763544` |  |
