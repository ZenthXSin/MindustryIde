# Package `mindustry.editor` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.editor`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

原版内容定义包：集中声明 Blocks、Items、Liquids、UnitTypes、Planets 等内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.editor`
- 文件数：22

## 主要依赖线索

- `arc.struct.*` × 17
- `arc.util.*` × 16
- `mindustry.gen.*` × 16
- `arc.scene.ui.layout.*` × 13
- `arc.*` × 11
- `arc.func.*` × 11
- `arc.graphics.*` × 11
- `arc.scene.ui.*` × 11
- `mindustry.graphics.*` × 11
- `mindustry.game.*` × 11
- `mindustry.ui.*` × 10
- `arc.math.geom.*` × 10
- `arc.math.*` × 10
- `mindustry.ui.dialogs.*` × 9
- `mindustry.content.*` × 9
- `mindustry.world.*` × 8
- `mindustry.*` × 8
- `arc.graphics.g2d.*` × 7
- `mindustry.world.blocks.environment.*` × 6
- `arc.input.*` × 6

## 文件逐个分析

### `core/src/mindustry/editor/BannedContentDialog.java`

- 知识页：[core-src-mindustry-editor-bannedcontentdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-bannedcontentdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/BannedContentDialog.java`
- SHA1：`c11f6fd0bed7ef539478bcb6020fdf5ee8cea32e`
- 声明：class BannedContentDialog<T extends UnlockableContent> extends BaseDialog
- 字段线索：type, selectedTable, deselectedTable, contentSet, pred, contentSearch
- 方法线索：show, build, rebuildTables, rebuildTable

### `core/src/mindustry/editor/DrawOperation.java`

- 知识页：[core-src-mindustry-editor-drawoperation-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-drawoperation-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/DrawOperation.java`
- SHA1：`672ca7c6e0ebd2fc18a23db1d6935b8782a22156`
- 声明：class DrawOperation, class TileOpStruct, class TileOpDataStruct
- 字段线索：opFloor, array
- 方法线索：isEmpty, size, remove, addOperation, undo, redo

### `core/src/mindustry/editor/EditorRenderer.java`

- 知识页：[core-src-mindustry-editor-editorrenderer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-editorrenderer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/EditorRenderer.java`
- SHA1：`bb30599fb615c48e7ba990344ea0383f8214af8d`
- 声明：class EditorRendererimplements Disposable
- 字段线索：packPad, chunkSize, tmpTiles, chunks, recacheChunks, height
- 方法线索：resize, draw, dispose

### `core/src/mindustry/editor/EditorSpriteCache.java`

- 知识页：[core-src-mindustry-editor-editorspritecache-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-editorspritecache-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/EditorSpriteCache.java`
- SHA1：`f2e06bac56329892fba03126602191f4284d1f32`
- 声明：class EditorSpriteCacheimplements Disposable
- 字段线索：vertexSize, mesh, textures, counts, packH, tmpVertices
- 方法线索：isEmpty, build, draw, pack, render, dispose

### `core/src/mindustry/editor/EditorTile.java`

- 知识页：[core-src-mindustry-editor-editortile-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-editortile-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/EditorTile.java`
- SHA1：`3a34de776078e55c3eabd07cfbe320907f04247b`
- 声明：class EditorTileextends Tile
- 字段线索：未抽取
- 方法线索：setFloor, isEditorTile, setBlock, setTeam, setOverlay, fireChanged

### `core/src/mindustry/editor/EditorTool.java`

- 知识页：[core-src-mindustry-editor-editortool-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-editortool-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/EditorTool.java`
- SHA1：`1327bac778530799c1e91d4e6d3affd9a01b2bb0`
- 声明：enum EditorTool
- 字段线索：chance, all, altModes, key, mode, edit
- 方法线索：touched, touchedLine

### `core/src/mindustry/editor/MapEditor.java`

- 知识页：[core-src-mindustry-editor-mapeditor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapeditor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapEditor.java`
- SHA1：`e673617f5faa89d251b56b48eb9ae03d8938453e`
- 声明：class MapEditor, class Contextimplements WorldContext
- 字段线索：brushSizes, tags, renderer, context, stack, currentOp
- 方法线索：isLoading, beginEdit, updateRenderer, load, createTiles, createMap

### `core/src/mindustry/editor/MapEditorDialog.java`

- 知识页：[core-src-mindustry-editor-mapeditordialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapeditordialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapEditorDialog.java`
- SHA1：`c3d0b0c9b27fc97f8dc45b6c7425e37ee9de3e78`
- 声明：class MapEditorDialogextends Dialog implements Disposable
- 字段线索：view, infoDialog, loadDialog, resizeDialog, generateDialog, sectorGenDialog
- 方法线索：Exception, resumeEditing, editInGame, resumeAfterPlaytest, playtest, handleSaveBuiltin

### `core/src/mindustry/editor/MapGenerateDialog.java`

- 知识页：[core-src-mindustry-editor-mapgeneratedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapgeneratedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapGenerateDialog.java`
- SHA1：`579c9053537820a3f7c593f72380f21ce0d61aa9`
- 声明：class MapGenerateDialogextends BaseDialog
- 字段线索：applied
- 方法线索：changeBuild, setBlock, show, applyToEditor, draw

### `core/src/mindustry/editor/MapInfoDialog.java`

- 知识页：[core-src-mindustry-editor-mapinfodialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapinfodialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapInfoDialog.java`
- SHA1：`4a773243d58da62c6c5f377d4139a9d4729992f2`
- 声明：class MapInfoDialogextends BaseDialog
- 字段线索：waveInfo, generate, ruleInfo, objectives, locales, processors
- 方法线索：setup

### `core/src/mindustry/editor/MapLoadDialog.java`

- 知识页：[core-src-mindustry-editor-maploaddialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-maploaddialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapLoadDialog.java`
- SHA1：`4d67c548423dd300fa291ee38339f0dbf4da4864`
- 声明：class MapLoadDialogextends BaseDialog
- 字段线索：selected
- 方法线索：rebuild

### `core/src/mindustry/editor/MapLocalesDialog.java`

- 知识页：[core-src-mindustry-editor-maplocalesdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-maplocalesdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapLocalesDialog.java`
- SHA1：`7be9af6d9da0716da987fad984d607ad3b437a5a`
- 声明：class MapLocalesDialogextends BaseDialog, enum PropertyStatus
- 字段线索：cardWidth, filterStyle, contentIcons, locales, lastSaved, saved
- 方法线索：show, setup, buildTables, buildLocalesTable, buildMain, updateCard

### `core/src/mindustry/editor/MapObjectivesCanvas.java`

- 知识页：[core-src-mindustry-editor-mapobjectivescanvas-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapobjectivescanvas-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapObjectivesCanvas.java`
- SHA1：`17a8d874e797afa11ab93001d77092ea044e8675`
- 声明：class MapObjectivesCanvasextends WidgetGroup, class ObjectiveTilemapextends WidgetGroup, class ObjectiveTileextends Table
- 字段线索：objWidth, unitSize, objectives, tilemap, query, pressed
- 方法线索：touchDown, pan, tap, touchUp, clearObjectives, stopQuery

### `core/src/mindustry/editor/MapObjectivesDialog.java`

- 知识页：[core-src-mindustry-editor-mapobjectivesdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapobjectivesdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapObjectivesDialog.java`
- SHA1：`fe6f165da71b4477e4a8e9d70f799c5c2e8c0597`
- 声明：class MapObjectivesDialogextends BaseDialog, interface FieldInterpreter<T>, interface FieldProvider<T>
- 字段线索：canvas, out, providers, interpreters, raw, key
- 方法线索：show, rebuildObjectives, IllegalArgumentException, TypeInfo

### `core/src/mindustry/editor/MapPatchesDialog.java`

- 知识页：[core-src-mindustry-editor-mappatchesdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mappatchesdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapPatchesDialog.java`
- SHA1：`964921ae7fa27bd24a545460531351cdeb0548c2`
- 声明：class MapPatchesDialogextends BaseDialog
- 字段线索：list
- 方法线索：setup

### `core/src/mindustry/editor/MapProcessorsDialog.java`

- 知识页：[core-src-mindustry-editor-mapprocessorsdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapprocessorsdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapProcessorsDialog.java`
- SHA1：`be2a1e470246854f729aa3ad7091cae96eafcb4e`
- 声明：class MapProcessorsDialogextends BaseDialog
- 字段线索：iconSelect, search, processors, list
- 方法线索：rebuild, setup

### `core/src/mindustry/editor/MapResizeDialog.java`

- 知识页：[core-src-mindustry-editor-mapresizedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapresizedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapResizeDialog.java`
- SHA1：`ad634017c20df7558b80dd26aa382f2b6a653be5`
- 声明：class MapResizeDialogextends BaseDialog, interface ResizeListener
- 字段线索：minSize
- 方法线索：未抽取

### `core/src/mindustry/editor/MapView.java`

- 知识页：[core-src-mindustry-editor-mapview-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-mapview-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/MapView.java`
- SHA1：`11a40a6cd542d53e3399fda0009c49a15a7f44ec`
- 声明：class MapViewextends Element implements GestureListener
- 字段线索：offsety, zoom, grid, image, vec, rect
- 方法线索：mouseMoved, enter, touchDown, touchUp, touchDragged, getTool

### `core/src/mindustry/editor/OperationStack.java`

- 知识页：[core-src-mindustry-editor-operationstack-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-operationstack-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/OperationStack.java`
- SHA1：`754fceec70060ca9f1371cd08ba6de31df25814c`
- 声明：class OperationStack
- 字段线索：maxSize, stack, index
- 方法线索：clear, add, canUndo, canRedo, undo, redo

### `core/src/mindustry/editor/SectorGenerateDialog.java`

- 知识页：[core-src-mindustry-editor-sectorgeneratedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-sectorgeneratedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/SectorGenerateDialog.java`
- SHA1：`dee730e3ad4b72c70aaf5beb06f59e7b37dfc9af`
- 声明：class SectorGenerateDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/editor/WaveGraph.java`

- 知识页：[core-src-mindustry-editor-wavegraph-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-wavegraph-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/WaveGraph.java`
- SHA1：`27de8fa077771acf91a46a5b6f2460fc9ad32977`
- 声明：class WaveGraphextends Table, enum Mode
- 字段线索：groups, mode, values, used, maxTotal, maxHealth
- 方法线索：enter, pan, zoom, touchUp, clampZoom, linePoint

### `core/src/mindustry/editor/WaveInfoDialog.java`

- 知识页：[core-src-mindustry-editor-waveinfodialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-editor-waveinfodialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/editor/WaveInfoDialog.java`
- SHA1：`86b676e7f93d964bd33c0dbefcc88bddba20b621`
- 声明：class WaveInfoDialogextends BaseDialog, enum Sort
- 字段线索：expandedGroup, table, search, filterType, sort, reverseSort
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
