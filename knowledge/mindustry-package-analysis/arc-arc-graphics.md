# Package `arc.graphics` (arc)

> Source: 本地源码仓库 `arc` 中 package `arc.graphics`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`arc`
- Package：`arc.graphics`
- 文件数：19

## 主要依赖线索

- `arc.util.*` × 7
- `arc.*` × 6
- `arc.files.*` × 5
- `arc.graphics.gl.*` × 5
- `java.nio.*` × 5
- `arc.math.geom.*` × 4
- `arc.math.*` × 3
- `java.util.*` × 3
- `arc.graphics.Texture.*` × 3
- `arc.struct.*` × 2
- `arc.graphics.g2d.*` × 2
- `java.io.*` × 2
- `arc.Core` × 1
- `arc.Graphics` × 1
- `arc.Input` × 1
- `arc.math.Mat` × 1
- `java.nio.Buffer` × 1
- `java.nio.FloatBuffer` × 1
- `java.nio.IntBuffer` × 1
- `arc.struct.Bits` × 1

## 文件逐个分析

### `arc-core/src/arc/graphics/Blending.java`

- 知识页：[arc-core-src-arc-graphics-blending-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-blending-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Blending.java`
- SHA1：`e303013cd4cc058d045c32e93e9c94ef8d630c51`
- 声明：class Blending
- 字段线索：normal, dstAlpha
- 方法线索：apply

### `arc-core/src/arc/graphics/Camera.java`

- 知识页：[arc-core-src-arc-graphics-camera-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-camera-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Camera.java`
- SHA1：`d5f942670c938240a0c9c4bd34ae482df83ba0a8`
- 声明：class Camera
- 字段线索：tmpVector, position, mat, inv, height
- 方法线索：update, resize, unproject, project, bounds

### `arc-core/src/arc/graphics/Color.java`

- 知识页：[arc-core-src-arc-graphics-color-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-color-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Color.java`
- SHA1：`a74b5a66c47f6dbf9497e0159a9ee3d7c5d101f4`
- 声明：class Color
- 字段线索：white, lightGray, gray, darkGray, black, clear
- 方法线索：fromDouble, rgb565, rgba4444, rgb888, rgba8888, argb8888

### `arc-core/src/arc/graphics/Colors.java`

- 知识页：[arc-core-src-arc-graphics-colors-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-colors-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Colors.java`
- SHA1：`ed0aaf63dd0a98c3fb80dd1eb0ad0fa55ab05996`
- 声明：class Colors
- 字段线索：map
- 方法线索：未抽取

### `arc-core/src/arc/graphics/Cubemap.java`

- 知识页：[arc-core-src-arc-graphics-cubemap-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-cubemap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Cubemap.java`
- SHA1：`7ead65ecc4cfe61952855e0ad813db7d6f466a37`
- 声明：class Cubemapextends GLTexture, enum CubemapSide
- 字段线索：data, all, index, glEnum, up, direction
- 方法线索：load, getCubemapData, getDepth, getGLEnum, getUp, getDirection

### `arc-core/src/arc/graphics/CubemapData.java`

- 知识页：[arc-core-src-arc-graphics-cubemapdata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-cubemapdata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/CubemapData.java`
- SHA1：`9cafb25beff852dc0d9debfb2cea847d4041c4d1`
- 声明：interface CubemapData
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/graphics/GL20.java`

- 知识页：[arc-core-src-arc-graphics-gl20-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl20-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/GL20.java`
- SHA1：`b2cda1afda264a278bf7b03f5cf9bbf433ce2551`
- 声明：interface GL20
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/graphics/GL30.java`

- 知识页：[arc-core-src-arc-graphics-gl30-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl30-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/GL30.java`
- SHA1：`d3e7e4568c7626f45d35aab32f1be5f0e15062de`
- 声明：interface GL30extends GL20
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/graphics/GLTexture.java`

- 知识页：[arc-core-src-arc-graphics-gltexture-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gltexture-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/GLTexture.java`
- SHA1：`a110a2dbbfff2102072be5ea21c35d129ce432b2`
- 声明：class GLTextureimplements Disposable
- 字段线索：glTarget, height, glHandle, minFilter, magFilter, uWrap
- 方法线索：bind, getMinFilter, getMagFilter, getUWrap, getVWrap, getTextureObjectHandle

### `arc-core/src/arc/graphics/Gl.java`

- 知识页：[arc-core-src-arc-graphics-gl-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-gl-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Gl.java`
- SHA1：`11cb333323ac3b830d6853559bc3fc198193f61e`
- 声明：class Gl
- 字段线索：optimize, esVersion20, ibuf, fbuf, lastActiveTexture, lastBoundTextures
- 方法线索：未抽取

### `arc-core/src/arc/graphics/Mesh.java`

- 知识页：[arc-core-src-arc-graphics-mesh-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-mesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Mesh.java`
- SHA1：`d65fd9ffe2f8573baa7c7d96a481b2e037dc558a`
- 声明：class Meshimplements Disposable
- 字段线索：vertexSize, attributes, vertices, indices
- 方法线索：setVertices, updateVertices, setIndices, getIndices, IllegalArgumentException, getNumIndices

### `arc-core/src/arc/graphics/Pixmap.java`

- 知识页：[arc-core-src-arc-graphics-pixmap-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-pixmap-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Pixmap.java`
- SHA1：`d0d9836ee73fb6dbdb34450a8cd014ae466e0ee3`
- 声明：class Pixmapimplements Disposable, enum Format
- 字段线索：supportsBufferCopy, height, pixels, all, glType
- 方法线索：copy, each, replace, fill, in, crop

### `arc-core/src/arc/graphics/PixmapIO.java`

- 知识页：[arc-core-src-arc-graphics-pixmapio-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-pixmapio-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/PixmapIO.java`
- SHA1：`b7605d8988464f4bdb821339a226e3d1b8aa1054`
- 声明：class PixmapIO, class PngWriterimplements Disposable, class ChunkBufferextends DataOutputStream
- 字段线索：SIGNATURE, IHDR, COLOR_ARGB, COMPRESSION_DEFLATE, FILTER_NONE, INTERLACE_NONE
- 方法线索：ArcRuntimeException, Pixmap, setFlipY, setCompression, write, dispose

### `arc-core/src/arc/graphics/Pixmaps.java`

- 知识页：[arc-core-src-arc-graphics-pixmaps-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-pixmaps-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Pixmaps.java`
- SHA1：`ef5b50908313a508e27073df1c785bf7db7102dc`
- 声明：class Pixmaps
- 字段线索：offsets, drawPixmap, tmpArray
- 方法线索：Texture, TextureRegion

### `arc-core/src/arc/graphics/Texture.java`

- 知识页：[arc-core-src-arc-graphics-texture-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-texture-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/Texture.java`
- SHA1：`3382c7d21deb6c0108746a6f14f7d14edb074743`
- 声明：class Textureextends GLTexture, enum TextureFilter, enum TextureWrap
- 字段线索：all, glEnum
- 方法线索：load, draw, getDepth, getTextureData, isDisposed, toString

### `arc-core/src/arc/graphics/TextureArray.java`

- 知识页：[arc-core-src-arc-graphics-texturearray-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-texturearray-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/TextureArray.java`
- SHA1：`905e9c0d128389cd8ebe79b06860b2cfac3db171`
- 声明：class TextureArrayextends GLTexture
- 字段线索：data
- 方法线索：ArcRuntimeException, load, getDepth

### `arc-core/src/arc/graphics/TextureArrayData.java`

- 知识页：[arc-core-src-arc-graphics-texturearraydata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-texturearraydata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/TextureArrayData.java`
- SHA1：`65cc7efaee616761350af87bc6716cbda301ca5c`
- 声明：interface TextureArrayData
- 字段线索：未抽取
- 方法线索：未抽取

### `arc-core/src/arc/graphics/TextureData.java`

- 知识页：[arc-core-src-arc-graphics-texturedata-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-texturedata-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/TextureData.java`
- SHA1：`ad63ceed104787617e14d5789274d197429cead8`
- 声明：interface TextureData
- 字段线索：未抽取
- 方法线索：getPixmap, load, FileTextureData

### `arc-core/src/arc/graphics/VertexAttribute.java`

- 知识页：[arc-core-src-arc-graphics-vertexattribute-java.md](../mindustry-source-files/arc/arc-core-src-arc-graphics-vertexattribute-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/VertexAttribute.java`
- SHA1：`60d60789bfcaffdb227ba0717263dfd20900a0fc`
- 声明：class VertexAttribute
- 字段线索：position, components, normalized, type, alias, size
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
