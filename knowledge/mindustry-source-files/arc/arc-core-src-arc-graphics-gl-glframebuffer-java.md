# arc:arc-core/src/arc/graphics/gl/GLFrameBuffer.java

> Source: `/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/GLFrameBuffer.java`

## 源码位置

- 仓库：`arc`
- 相对路径：`arc-core/src/arc/graphics/gl/GLFrameBuffer.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Arc/arc-core/src/arc/graphics/gl/GLFrameBuffer.java`
- SHA1：`b2eb59a6b4bd5332ac648e7f46e0c83c7a7631ae`
- 大小：22103 bytes
- 行数：547

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class GLFrameBuffer<T extends GLTexture> implements Disposable`。

关键词：arc, graphics

## Package

`arc.graphics.gl`

## 类型声明

- `class GLFrameBuffer<T extends GLTexture> implements Disposable`
- `class FrameBufferTextureAttachmentSpec`
- `class FrameBufferRenderBufferAttachmentSpec`
- `class GLFrameBufferBuilder<U extends GLFrameBuffer<? extends GLTexture>>`
- `class FrameBufferBuilderextends GLFrameBufferBuilder<FrameBuffer>`
- `class FloatFrameBufferBuilderextends GLFrameBufferBuilder<FloatFrameBuffer>`
- `class FrameBufferCubemapBuilderextends GLFrameBufferBuilder<FrameBufferCubemap>`

## 字段线索

- `GL_DEPTH24_STENCIL8_OES`
- `currentBoundFramebuffer`
- `defaultFramebufferHandle`
- `bufferNesting`
- `defaultFramebufferHandleInitialized`
- `textureAttachments`
- `lastBoundFramebuffer`
- `framebufferHandle`
- `depthbufferHandle`
- `stencilbufferHandle`
- `depthStencilPackedBufferHandle`
- `hasDepthStencilPackedBuffer`
- `isMRT`
- `bufferBuilder`
- `height`
- `textureAttachmentSpecs`
- `stencilRenderBufferSpec`
- `depthRenderBufferSpec`
- `packedStencilDepthRenderBufferSpec`
- `hasStencilRenderBuffer`

## 方法线索

- `getTexture`
- `getTextureAttachments`
- `build`
- `IllegalStateException`
- `checkValidBuilder`
- `ArcRuntimeException`
- `dispose`
- `bind`
- `isBound`
- `begin`
- `beginBind`
- `setFrameBufferViewport`
- `end`
- `endBind`
- `getFramebufferHandle`
- `getDepthBufferHandle`
- `getStencilBufferHandle`
- `getDepthStencilPackedBuffer`
- `getHeight`
- `getWidth`
- `isColorTexture`
- `addColorTextureAttachment`
- `addBasicColorTextureAttachment`
- `addFloatAttachment`
- `addDepthTextureAttachment`
- `addStencilTextureAttachment`
- `addDepthRenderBuffer`
- `addStencilRenderBuffer`
- `addStencilDepthPackedRenderBuffer`
- `addBasicDepthRenderBuffer`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
