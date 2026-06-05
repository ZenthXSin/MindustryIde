# Package `mindustry.graphics.g3d` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.graphics.g3d`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

图形渲染包：负责 Draw、Layer、Shaders、CacheLayer、FrameBuffer 等渲染支撑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.graphics.g3d`
- 文件数：14

## 主要依赖线索

- `arc.math.geom.*` × 13
- `mindustry.type.*` × 8
- `arc.graphics.*` × 7
- `mindustry.graphics.*` × 5
- `arc.util.*` × 4
- `arc.math.*` × 4
- `arc.graphics.gl.*` × 3
- `arc.util.noise.*` × 3
- `arc.*` × 2
- `mindustry.graphics.g3d.PlanetGrid.*` × 2
- `arc.struct.*` × 1
- `mindustry.maps.generators.*` × 1
- `mindustry.content.*` × 1
- `mindustry.graphics.g3d.PlanetRenderer.*` × 1
- `arc.graphics.g2d.*` × 1
- `arc.graphics.g3d.*` × 1
- `mindustry.game.EventType.*` × 1

## 文件逐个分析

### `core/src/mindustry/graphics/g3d/GenericMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-genericmesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-genericmesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/GenericMesh.java`
- SHA1：`a173323c52c5dc98dc58a234abf8f1e157c6fe45`
- 声明：interface GenericMeshextends Disposable
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/graphics/g3d/HexMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-hexmesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-hexmesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/HexMesh.java`
- SHA1：`92e318f01eaebb68f77a8577a13b9847656ad1e1`
- 声明：class HexMeshextends PlanetMesh
- 字段线索：未抽取
- 方法线索：preRender

### `core/src/mindustry/graphics/g3d/HexMesher.java`

- 知识页：[core-src-mindustry-graphics-g3d-hexmesher-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-hexmesher-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/HexMesher.java`
- SHA1：`9e8c61cad82db7191ec590ead0188c6cefc4dc75`
- 声明：interface HexMesher
- 字段线索：未抽取
- 方法线索：getHeight, getColor, getEmissiveColor, isEmissive, skip

### `core/src/mindustry/graphics/g3d/HexSkyMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-hexskymesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-hexskymesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/HexSkyMesh.java`
- SHA1：`34c51fe2fe37ad6bcfa0150a75ed3ef1079cc480`
- 声明：class HexSkyMeshextends PlanetMesh
- 字段线索：mat, speed
- 方法线索：getHeight, getColor, skip, relRot, render, preRender

### `core/src/mindustry/graphics/g3d/MatMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-matmesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-matmesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/MatMesh.java`
- SHA1：`9cedacc2d63d0b74703c337533eddd035f92ccfc`
- 声明：class MatMeshimplements GenericMesh
- 字段线索：tmp
- 方法线索：render, dispose

### `core/src/mindustry/graphics/g3d/MeshBuilder.java`

- 知识页：[core-src-mindustry-graphics-g3d-meshbuilder-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-meshbuilder-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/MeshBuilder.java`
- SHA1：`71d5f7fddea9d1c50ec4873cd67bd871c40dd7d9`
- 声明：class MeshBuilder
- 字段线索：packNormals, tmpHeights
- 方法线索：getHeight, getColor

### `core/src/mindustry/graphics/g3d/MultiMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-multimesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-multimesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/MultiMesh.java`
- SHA1：`f7b5f00d1f53d5aefa35ebdc0330095bf091fb06`
- 声明：class MultiMeshimplements GenericMesh
- 字段线索：未抽取
- 方法线索：render, dispose

### `core/src/mindustry/graphics/g3d/NoiseMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-noisemesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-noisemesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/NoiseMesh.java`
- SHA1：`92361fb2568606ef274d36facf7af89551b30620`
- 声明：class NoiseMeshextends HexMesh
- 字段线索：未抽取
- 方法线索：getHeight, getColor

### `core/src/mindustry/graphics/g3d/PlanetGrid.java`

- 知识页：[core-src-mindustry-graphics-g3d-planetgrid-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-planetgrid-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/PlanetGrid.java`
- SHA1：`93470942b4db0da1d16d4837a33611c39b198e1f`
- 声明：class PlanetGrid, class Ptile, class Corner
- 字段线索：cache, x, z, iTiles, iTilesP, size
- 方法线索：addCorner, addEdge, pos, tileCount, cornerCount, edgeCount

### `core/src/mindustry/graphics/g3d/PlanetMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-planetmesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-planetmesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/PlanetMesh.java`
- SHA1：`9de188ec22d86191c1131298fbe30ad05f3aaa25`
- 声明：class PlanetMeshimplements GenericMesh
- 字段线索：mesh, planet, shader
- 方法线索：preRender, render, dispose

### `core/src/mindustry/graphics/g3d/PlanetParams.java`

- 知识页：[core-src-mindustry-graphics-g3d-planetparams-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-planetparams-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/PlanetParams.java`
- SHA1：`578f883f01ecb61882660389d241f0c8f5390cf9`
- 声明：class PlanetParams
- 字段线索：camPos, otherCamPos, otherCamAlpha, camUp, camDir, planet
- 方法线索：未抽取

### `core/src/mindustry/graphics/g3d/PlanetRenderer.java`

- 知识页：[core-src-mindustry-graphics-g3d-planetrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-planetrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/PlanetRenderer.java`
- SHA1：`259fe338fdef38e81bf5097981b35cb7ec331955`
- 声明：class PlanetRendererimplements Disposable, interface PlanetInterfaceRenderer
- 字段线索：outlineRad, outlineColor, cam, batch, projector, mat
- 方法线索：render, renderPlanet, renderTransparent, renderOrbit, renderSectors, drawArcLine

### `core/src/mindustry/graphics/g3d/ShaderSphereMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-shaderspheremesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-shaderspheremesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/ShaderSphereMesh.java`
- SHA1：`8a640e22aac0d5938795711f5498552554d22fa8`
- 声明：class ShaderSphereMeshextends PlanetMesh
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/graphics/g3d/SunMesh.java`

- 知识页：[core-src-mindustry-graphics-g3d-sunmesh-java.md](../mindustry-source-files/mindustry/core-src-mindustry-graphics-g3d-sunmesh-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/graphics/g3d/SunMesh.java`
- SHA1：`1568f4cf855d8e83b9a2222d00d656f5c54b180f`
- 声明：class SunMeshextends HexMesh
- 字段线索：未抽取
- 方法线索：getHeight, getColor


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
