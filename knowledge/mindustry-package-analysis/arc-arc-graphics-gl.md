# Package `arc.graphics.gl` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.graphics.gl`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.graphics.gl`
- 文件数：23

## 主要依赖线索

- `arc.graphics.*` × 17
- `arc.util.*` × 16
- `java.nio.*` × 9
- `arc.*` × 7
- `arc.graphics.Pixmap.*` × 5
- `arc.files.*` × 4
- `arc.graphics.Texture.*` × 3
- `arc.struct.*` × 3
- `arc.graphics.Cubemap.*` × 2
- `arc.graphics.g2d.*` × 2
- `java.nio.ShortBuffer` × 2
- `arc.graphics.Pixmap` × 2
- `arc.graphics.Pixmap.Format` × 2
- `arc.graphics.TextureData` × 2
- `arc.util.ArcRuntimeException` × 2
- `arc.graphics.gl.GLVersion.*` × 1
- `arc.func.*` × 1
- `arc.Application` × 1
- `arc.util.Log` × 1
- `java.util.regex.Matcher` × 1

## 文件逐个分析

### `arc-core/src/arc/graphics/gl/FacedCubemapData.java`

- 知识页：[arc-core-src-arc-graphics-gl-facedcubemapdata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-facedcubemapdata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/FacedCubemapData.java`
- SHA1：`868474fdc1810b9a4f64cf34637bec7f1524bdaa`
- 声明：class FacedCubemapDataimplements CubemapData
- 字段线索：data
- 方法线索：load, isComplete, getTextureData, getWidth, getHeight, isPrepared

### `arc-core/src/arc/graphics/gl/FileTextureArrayData.java`

- 知识页：[arc-core-src-arc-graphics-gl-filetexturearraydata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-filetexturearraydata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/FileTextureArrayData.java`
- SHA1：`93117ed4e232eb34a93758c3dd6fb810ed78489d`
- 声明：class FileTextureArrayDataimplements TextureArrayData
- 字段线索：textureDatas, prepared, depth
- 方法线索：isPrepared, prepare, ArcRuntimeException, consumeTextureArrayData, getWidth, getHeight

### `arc-core/src/arc/graphics/gl/FileTextureData.java`

- 知识页：[arc-core-src-arc-graphics-gl-filetexturedata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-filetexturedata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/FileTextureData.java`
- SHA1：`938c22f6e54c46884aef38389d2335fc1f4d0867`
- 声明：class FileTextureDataimplements TextureData
- 字段线索：file
- 方法线索：isPrepared, prepare, consumePixmap, disposePixmap, getWidth, getHeight

### `arc-core/src/arc/graphics/gl/FloatFrameBuffer.java`

- 知识页：[arc-core-src-arc-graphics-gl-floatframebuffer-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-floatframebuffer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/FloatFrameBuffer.java`
- SHA1：`d11a4c324844fc2db6741fec2288db44180a271f`
- 声明：class FloatFrameBufferextends FrameBuffer
- 字段线索：未抽取
- 方法线索：create, resize, IllegalArgumentException, createTexture

### `arc-core/src/arc/graphics/gl/FloatTextureData.java`

- 知识页：[arc-core-src-arc-graphics-gl-floattexturedata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-floattexturedata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/FloatTextureData.java`
- SHA1：`db604094bec94d142eeb4a5a1faa4fc270bef852`
- 声明：class FloatTextureDataimplements TextureData
- 字段线索：未抽取
- 方法线索：isCustom, isPrepared, prepare, consumeCustomData, ArcRuntimeException, consumePixmap

### `arc-core/src/arc/graphics/gl/FrameBuffer.java`

- 知识页：[arc-core-src-arc-graphics-gl-framebuffer-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-framebuffer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/FrameBuffer.java`
- SHA1：`9ffabce5a5145c61dcec5281fd362d511f33a41c`
- 声明：class FrameBufferextends GLFrameBuffer<Texture>
- 字段线索：format
- 方法线索：create, blit, resizeCheck, resize, createTexture, disposeTexture

### `arc-core/src/arc/graphics/gl/FrameBufferCubemap.java`

- 知识页：[arc-core-src-arc-graphics-gl-framebuffercubemap-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-framebuffercubemap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/FrameBufferCubemap.java`
- SHA1：`fdcdc0898ac36b011767fd4e6db7c9b236b15416`
- 声明：class FrameBufferCubemapextends GLFrameBuffer<Cubemap>
- 字段线索：未抽取
- 方法线索：createTexture, disposeTexture, attachTexture, eachSide, bindSide

### `arc-core/src/arc/graphics/gl/GLFrameBuffer.java`

- 知识页：[arc-core-src-arc-graphics-gl-glframebuffer-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-glframebuffer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/GLFrameBuffer.java`
- SHA1：`b2eb59a6b4bd5332ac648e7f46e0c83c7a7631ae`
- 声明：class GLFrameBuffer<T extends GLTexture> implements Disposable, class FrameBufferTextureAttachmentSpec, class FrameBufferRenderBufferAttachmentSpec
- 字段线索：GL_DEPTH24_STENCIL8_OES, currentBoundFramebuffer, defaultFramebufferHandle, bufferNesting, defaultFramebufferHandleInitialized, textureAttachments
- 方法线索：getTexture, getTextureAttachments, build, IllegalStateException, checkValidBuilder, ArcRuntimeException

### `arc-core/src/arc/graphics/gl/GLOnlyTextureData.java`

- 知识页：[arc-core-src-arc-graphics-gl-glonlytexturedata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-glonlytexturedata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/GLOnlyTextureData.java`
- SHA1：`07854cf914905ba12447742fa0f720a7343cd15a`
- 声明：class GLOnlyTextureDataimplements TextureData
- 字段线索：未抽取
- 方法线索：isCustom, isPrepared, prepare, consumeCustomData, consumePixmap, ArcRuntimeException

### `arc-core/src/arc/graphics/gl/GLVersion.java`

- 知识页：[arc-core-src-arc-graphics-gl-glversion-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-glversion-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/GLVersion.java`
- SHA1：`87ece7cced59f291414e91a9da3e715ba4eafeb0`
- 声明：class GLVersion, enum GlType
- 字段线索：vendorString, rendererString, versionString, type, majorVersion, minorVersion
- 方法线索：extractVersion, parseInt, atLeast, getDebugVersionString, toString

### `arc-core/src/arc/graphics/gl/HdpiMode.java`

- 知识页：[arc-core-src-arc-graphics-gl-hdpimode-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-hdpimode-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/HdpiMode.java`
- SHA1：`952642c824c61fb3d82312d66fe5d90a32389fbd`
- 声明：enum HdpiMode
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/graphics/gl/HdpiUtils.java`

- 知识页：[arc-core-src-arc-graphics-gl-hdpiutils-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-hdpiutils-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/HdpiUtils.java`
- SHA1：`eb1c42c576782e567aa8d5f3bfab218945df82b0`
- 声明：class HdpiUtils
- 字段线索：mode
- 方法线索：未抽取

### `arc-core/src/arc/graphics/gl/IndexArray.java`

- 知识页：[arc-core-src-arc-graphics-gl-indexarray-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-indexarray-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/IndexArray.java`
- SHA1：`4792c72e2b33746684e309085cf04062f7b22f38`
- 声明：class IndexArrayimplements IndexData
- 字段线索：buffer, byteBuffer, empty, pos
- 方法线索：size, max, set, update, buffer, bind

### `arc-core/src/arc/graphics/gl/IndexBufferObject.java`

- 知识页：[arc-core-src-arc-graphics-gl-indexbufferobject-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-indexbufferobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/IndexBufferObject.java`
- SHA1：`d97744933d9a908249628a7bc05243ec1d2f4996`
- 声明：class IndexBufferObjectimplements IndexData
- 字段线索：buffer, byteBuffer, isDirect, usage, empty, pos
- 方法线索：size, max, set, update, buffer, bind

### `arc-core/src/arc/graphics/gl/IndexBufferObjectSubData.java`

- 知识页：[arc-core-src-arc-graphics-gl-indexbufferobjectsubdata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-indexbufferobjectsubdata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/IndexBufferObjectSubData.java`
- SHA1：`496db50b8cc4bb329e553f8d24b9021aca60f747`
- 声明：class IndexBufferObjectSubDataimplements IndexData
- 字段线索：buffer, byteBuffer, isDirect, usage, pos
- 方法线索：createBufferObject, size, max, set, update, buffer

### `arc-core/src/arc/graphics/gl/IndexData.java`

- 知识页：[arc-core-src-arc-graphics-gl-indexdata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-indexdata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/IndexData.java`
- SHA1：`e79cceef316742502d1dd1b5ce0d3f3f0925577b`
- 声明：interface IndexDataextends Disposable
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/graphics/gl/MipMapTextureData.java`

- 知识页：[arc-core-src-arc-graphics-gl-mipmaptexturedata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-mipmaptexturedata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/MipMapTextureData.java`
- SHA1：`b48fd438d46aafb2957aa16642502620e730861a`
- 声明：class MipMapTextureDataimplements TextureData
- 字段线索：未抽取
- 方法线索：isCustom, isPrepared, prepare, consumePixmap, ArcRuntimeException, disposePixmap

### `arc-core/src/arc/graphics/gl/PixmapTextureData.java`

- 知识页：[arc-core-src-arc-graphics-gl-pixmaptexturedata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-pixmaptexturedata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/PixmapTextureData.java`
- SHA1：`e4f8ae1009d6e962df26e5cd4025e76e936e26ab`
- 声明：class PixmapTextureDataimplements TextureData
- 字段线索：pixmap, useMipMaps, disposePixmap
- 方法线索：disposePixmap, consumePixmap, getWidth, getHeight, getFormat, useMipMaps

### `arc-core/src/arc/graphics/gl/Shader.java`

- 知识页：[arc-core-src-arc-graphics-gl-shader-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-shader-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/Shader.java`
- SHA1：`276d01c07920e62d6a610fd38e05b8c36a8417c3`
- 声明：class Shaderimplements Disposable
- 字段线索：positionAttribute, normalAttribute, colorAttribute, mixColorAttribute, texcoordAttribute, pedantic
- 方法线索：IllegalArgumentException, apply, preprocess, compileShaders, loadShader, createProgram

### `arc-core/src/arc/graphics/gl/VertexArray.java`

- 知识页：[arc-core-src-arc-graphics-gl-vertexarray-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-vertexarray-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/VertexArray.java`
- SHA1：`0bb29927e107667669203fe03c574a35c6abce89`
- 声明：class VertexArrayimplements VertexData
- 字段线索：mesh, buffer, byteBuffer, pos
- 方法线索：render, dispose, buffer, size, max, set

### `arc-core/src/arc/graphics/gl/VertexBufferObject.java`

- 知识页：[arc-core-src-arc-graphics-gl-vertexbufferobject-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-vertexbufferobject-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/VertexBufferObject.java`
- SHA1：`90598f761eae7c196acd3d8c3e058a056ada62be`
- 声明：class VertexBufferObjectimplements VertexData
- 字段线索：mesh, buffer, byteBuffer, ownsBuffer, bufferHandle, usage
- 方法线索：size, max, buffer, setBuffer, ArcRuntimeException, upload

### `arc-core/src/arc/graphics/gl/VertexBufferObjectWithVAO.java`

- 知识页：[arc-core-src-arc-graphics-gl-vertexbufferobjectwithvao-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-vertexbufferobjectwithvao-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/VertexBufferObjectWithVAO.java`
- SHA1：`62f278d42a2bb55b3e46c14ca65654933aa561f4`
- 声明：class VertexBufferObjectWithVAOimplements VertexData
- 字段线索：tmpHandle, mesh, buffer, byteBuffer, isStatic, usage
- 方法线索：size, max, buffer, upload, bufferChanged, set

### `arc-core/src/arc/graphics/gl/VertexData.java`

- 知识页：[arc-core-src-arc-graphics-gl-vertexdata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-vertexdata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/VertexData.java`
- SHA1：`b76b1dcda728e59abc91c9afdb8f46560bb17640`
- 声明：interface VertexDataextends Disposable
- 字段线索：未抽取
- 方法线索：render, ArcRuntimeException


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
