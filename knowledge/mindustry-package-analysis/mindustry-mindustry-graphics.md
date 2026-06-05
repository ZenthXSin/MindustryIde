# Package `mindustry.graphics` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.graphics`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.graphics`
- 文件数：24

## 主要依赖线索

- `arc.graphics.*` × 20
- `arc.util.*` × 19
- `arc.*` × 16
- `arc.graphics.g2d.*` × 15
- `arc.math.*` × 15
- `arc.math.geom.*` × 14
- `arc.struct.*` × 13
- `arc.graphics.gl.*` × 10
- `arc.graphics.Texture.*` × 8
- `mindustry.world.*` × 8
- `mindustry.*` × 6
- `mindustry.game.EventType.*` × 6
- `mindustry.gen.*` × 6
- `arc.scene.ui.layout.*` × 5
- `mindustry.game.*` × 4
- `mindustry.content.*` × 3
- `java.util.*` × 3
- `mindustry.type.*` × 3
- `mindustry.game.Teams.*` × 2
- `mindustry.world.blocks.environment.*` × 2

## 文件逐个分析

### `core/src/mindustry/graphics/BlockRenderer.java`

- 知识页：[core-src-mindustry-graphics-blockrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-blockrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/BlockRenderer.java`
- SHA1：`18c48fb407fb87ab8cb098d27a1ad2fd10d7b476`
- 声明：class BlockRenderer, class BlockQuadtreeextends QuadTree<Tile>, class BlockLightQuadtreeextends QuadTree<Tile>
- 字段线索：crackRegions, drawQuadtreeDebug, shadowColor, initialRequests, floor, cracks
- 方法线索：reload, updateShadows, updateDarkness, invalidateTile, getShadowBuffer, removeFloorIndex

### `core/src/mindustry/graphics/CacheLayer.java`

- 知识页：[core-src-mindustry-graphics-cachelayer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-cachelayer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/CacheLayer.java`
- SHA1：`41ae5b2cf295b66b3c383830b19242bed56b7a44`
- 声明：class CacheLayer, class ShaderLayerextends CacheLayer
- 字段线索：walls, all, id, liquid, shader
- 方法线索：begin, end

### `core/src/mindustry/graphics/CubemapMesh.java`

- 知识页：[core-src-mindustry-graphics-cubemapmesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-cubemapmesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/CubemapMesh.java`
- SHA1：`98a6ba58c4ff23c3b8111cbcfae365577d9df72f`
- 声明：class CubemapMeshimplements Disposable
- 字段线索：vertices, mesh, shader, map
- 方法线索：setCubemap, render, dispose

### `core/src/mindustry/graphics/DebugCollisionRenderer.java`

- 知识页：[core-src-mindustry-graphics-debugcollisionrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-debugcollisionrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/DebugCollisionRenderer.java`
- SHA1：`227f4f126be1f415038464acbff4cd1056cc37c6`
- 声明：class DebugCollisionRenderer
- 字段线索：edges
- 方法线索：未抽取

### `core/src/mindustry/graphics/Drawf.java`

- 知识页：[core-src-mindustry-graphics-drawf-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-drawf-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/Drawf.java`
- SHA1：`3f4a10519cd9791264b3be3eb83ea58fa639cc1b`
- 声明：class Drawf
- 字段线索：vecs, points
- 方法线索：未抽取

### `core/src/mindustry/graphics/EnvRenderers.java`

- 知识页：[core-src-mindustry-graphics-envrenderers-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-envrenderers-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/EnvRenderers.java`
- SHA1：`93a5c56f77d06cea9bba9709fd4c3585dfe4daa1`
- 声明：class EnvRenderers
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/graphics/FloorRenderer.java`

- 知识页：[core-src-mindustry-graphics-floorrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-floorrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/FloorRenderer.java`
- SHA1：`73c3ce0e1fa5e375001e0854f3e2a7412dc13d58`
- 声明：class FloorRenderer, class ChunkMeshextends Mesh, class FloorRenderBatchextends Batch
- 字段线索：growSprites, attributes, chunksize, packPad, pad, dynamic
- 方法线索：dispose, getIndexData, getVertexBuffer, recacheTile, drawFloor, drawUnderwater

### `core/src/mindustry/graphics/FogRenderer.java`

- 知识页：[core-src-mindustry-graphics-fogrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-fogrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/FogRenderer.java`
- SHA1：`054a53dd811dcbc24e01e1b8c0558745bf502ec6`
- 声明：class FogRenderer
- 字段线索：staticFog, events, rect, lastTeam
- 方法线索：handleEvent, getStaticTexture, getDynamicTexture, drawFog, copyFromCpu

### `core/src/mindustry/graphics/IntelGpuCheck.java`

- 知识页：[core-src-mindustry-graphics-intelgpucheck-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-intelgpucheck-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/IntelGpuCheck.java`
- SHA1：`61d22029efa7030661dba0f1f87c157e707449ca`
- 声明：class IntelGpuCheck
- 字段线索：checkedLastLaunch
- 方法线索：未抽取

### `core/src/mindustry/graphics/InverseKinematics.java`

- 知识页：[core-src-mindustry-graphics-inversekinematics-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-inversekinematics-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/InverseKinematics.java`
- SHA1：`dd78717a743d53edd166a4bca901ed3fd98eba90`
- 声明：class InverseKinematics
- 字段线索：mat1, temp
- 方法线索：to

### `core/src/mindustry/graphics/Layer.java`

- 知识页：[core-src-mindustry-graphics-layer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-layer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/Layer.java`
- SHA1：`6d2890d33da15a5645583f7e858c0413acf9816f`
- 声明：class Layer
- 字段线索：min
- 方法线索：未抽取

### `core/src/mindustry/graphics/LightRenderer.java`

- 知识页：[core-src-mindustry-graphics-lightrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-lightrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/LightRenderer.java`
- SHA1：`1f6d3e0c21e7ef1ee87167457d2a8118def340e5`
- 声明：class LightRenderer, class CircleLight
- 字段线索：scaling, vertices, buffer, lights, circles, circleIndex
- 方法线索：add, line, enabled, draw, set

### `core/src/mindustry/graphics/LoadRenderer.java`

- 知识页：[core-src-mindustry-graphics-loadrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-loadrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/LoadRenderer.java`
- SHA1：`43d579cbae159502d6084b3f5e9c88f2cc98e29b`
- 声明：class LoadRendererimplements Disposable, class Bar
- 字段线索：color, colorRed, red, orange, floats, preview
- 方法线索：dispose, draw

### `core/src/mindustry/graphics/MenuRenderer.java`

- 知识页：[core-src-mindustry-graphics-menurenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-menurenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/MenuRenderer.java`
- SHA1：`fa941f6c846c93617e7a4d6deb2812e8c48a3046`
- 声明：class MenuRendererimplements Disposable
- 字段线索：darkness, width, cacheWall, camera, mat, shadows
- 方法线索：generate, cache, render, drawFlyers, flyers, dispose

### `core/src/mindustry/graphics/MinimapRenderer.java`

- 知识页：[core-src-mindustry-graphics-minimaprenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-minimaprenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/MinimapRenderer.java`
- SHA1：`511bec72587dc7fbd856f73a01c5f8916b241e06`
- 声明：class MinimapRenderer
- 字段线索：baseSize, units, pixmap, texture, region, rect
- 方法线索：update, getPixmap, zoomBy, setZoom, getZoom, reset

### `core/src/mindustry/graphics/MultiPacker.java`

- 知识页：[core-src-mindustry-graphics-multipacker-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-multipacker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/MultiPacker.java`
- SHA1：`8757da276d0d1445e2c3d97886e6b4984816a1d9`
- 声明：class MultiPackerimplements Disposable, enum PageType
- 字段线索：packers, outlined, all, width
- 方法线索：get, printStats, registerOutlined, isOutlined, getPacker, has

### `core/src/mindustry/graphics/NvGpuInfo.java`

- 知识页：[core-src-mindustry-graphics-nvgpuinfo-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-nvgpuinfo-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/NvGpuInfo.java`
- SHA1：`e1a13432407e497382007a8cc44948c734f6558f`
- 声明：class NvGpuInfo
- 字段线索：GL_GPU_MEM_INFO_TOTAL_AVAILABLE_MEM_NVX, GL_GPU_MEM_INFO_CURRENT_AVAILABLE_MEM_NVX, initialized
- 方法线索：未抽取

### `core/src/mindustry/graphics/OverlayRenderer.java`

- 知识页：[core-src-mindustry-graphics-overlayrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-overlayrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/OverlayRenderer.java`
- SHA1：`8357f9538b03e44f80272581b8e53158c4416b35`
- 声明：class OverlayRenderer, class CoreEdge
- 字段线索：indicatorLength, spawnerMargin, rect, unitFade, lastSelect, cedges
- 方法线索：updateCoreEdges, drawBottom, drawTop, checkApplySelection, displayed

### `core/src/mindustry/graphics/Pal.java`

- 知识页：[core-src-mindustry-graphics-pal-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-pal-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/Pal.java`
- SHA1：`18d7ef10ab37007e55bb38b8f809038e5db862f9`
- 声明：class Pal
- 字段线索：water
- 方法线索：未抽取

### `core/src/mindustry/graphics/ParticleRenderer.java`

- 知识页：[core-src-mindustry-graphics-particlerenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-particlerenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/ParticleRenderer.java`
- SHA1：`45ff43acc8b673986000396348ca285ca324e3c7`
- 声明：class ParticleRenderer
- 字段线索：useAsync, maxParticles, particleSize, particleVertexSize, globalDrag, cullPadding
- 方法线索：count, updateAndRender, update, render, add, makeShader

### `core/src/mindustry/graphics/Pixelator.java`

- 知识页：[core-src-mindustry-graphics-pixelator-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-pixelator-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/Pixelator.java`
- SHA1：`098867c1349d0e28205ac5b8c6c358d7236ad9f4`
- 声明：class Pixelatorimplements Disposable
- 字段线索：buffer, pre
- 方法线索：drawPixelate, register, enabled, dispose

### `core/src/mindustry/graphics/Shaders.java`

- 知识页：[core-src-mindustry-graphics-shaders-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-shaders-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/Shaders.java`
- SHA1：`4e37589a0c843ba124d047270cdcfe8ffd675a74`
- 声明：class Shaders, class AtmosphereShaderextends LoadShader, class PlanetShaderextends LoadShader
- 字段线索：blockbuild, shield, buildBeam, build, armor, darkness
- 方法线索：textureName, apply, loadNoise, add

### `core/src/mindustry/graphics/Trail.java`

- 知识页：[core-src-mindustry-graphics-trail-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-trail-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/Trail.java`
- SHA1：`b9488b27e2f14978a3ab56011d4d39e14f0d705d`
- 声明：class Trail
- 字段线索：length, points, lastX
- 方法线索：copy, width, clear, size, drawCap, draw

### `core/src/mindustry/graphics/Voronoi.java`

- 知识页：[core-src-mindustry-graphics-voronoi-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-voronoi-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/Voronoi.java`
- SHA1：`c33bab2bd323d80907ef63116c6057481b1144f2`
- 声明：class Voronoi, class Site, class Halfedge
- 字段线索：LE, RE, y2, site2
- 方法线索：Voronoi, next, bisect, pqbucket, pqinsert, pqdelete


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
