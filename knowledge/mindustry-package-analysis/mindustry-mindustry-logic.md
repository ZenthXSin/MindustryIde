# Package `mindustry.logic` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.logic`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.logic`
- 文件数：33

## 主要依赖线索

- `arc.util.*` × 14
- `mindustry.gen.*` × 12
- `arc.graphics.*` × 9
- `arc.struct.*` × 9
- `arc.*` × 8
- `mindustry.game.*` × 7
- `mindustry.ctype.*` × 6
- `mindustry.graphics.*` × 6
- `arc.func.*` × 6
- `arc.math.*` × 5
- `mindustry.*` × 5
- `arc.scene.ui.*` × 5
- `arc.scene.ui.layout.*` × 5
- `mindustry.ui.*` × 5
- `mindustry.logic.LExecutor.*` × 4
- `arc.math.geom.*` × 3
- `mindustry.logic.LStatements.*` × 3
- `arc.audio.*` × 2
- `mindustry.type.*` × 2
- `mindustry.world.*` × 2

## 文件逐个分析

### `core/src/mindustry/logic/ConditionOp.java`

- 知识页：[core-src-mindustry-logic-conditionop-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-conditionop-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/ConditionOp.java`
- SHA1：`b7d740d1f982f4af8524be1bab99e8f467c7316e`
- 声明：enum ConditionOp, interface CondObjOpLambda, interface CondOpLambda
- 字段线索：all, objFunction, function, symbol
- 方法线索：test, toString

### `core/src/mindustry/logic/Controllable.java`

- 知识页：[core-src-mindustry-logic-controllable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-controllable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/Controllable.java`
- SHA1：`397f4fdb574349fa2cf1203b5eef2aad46385d24`
- 声明：interface Controllable
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/logic/CutsceneAction.java`

- 知识页：[core-src-mindustry-logic-cutsceneaction-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-cutsceneaction-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/CutsceneAction.java`
- SHA1：`7deae6fab49ba24f14a7ae44221537f06b2079ca`
- 声明：enum CutsceneAction
- 字段线索：all
- 方法线索：未抽取

### `core/src/mindustry/logic/FetchType.java`

- 知识页：[core-src-mindustry-logic-fetchtype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-fetchtype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/FetchType.java`
- SHA1：`a61b2636408e9321dcbf038ad18dd50fd8a5c65b`
- 声明：enum FetchType
- 字段线索：all
- 方法线索：未抽取

### `core/src/mindustry/logic/GlobalVars.java`

- 知识页：[core-src-mindustry-logic-globalvars-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-globalvars-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/GlobalVars.java`
- SHA1：`2eff7de4124eb6cf6788297366b6f7eee0bfc6bb`
- 声明：class GlobalVars, class VarEntry
- 字段线索：ctrlProcessor, lookableContent, writableLookableContent, rand, varClientMobile, vars
- 方法线索：init, update, waitVar, getEntries, lookupLogicId, get

### `core/src/mindustry/logic/GlobalVarsDialog.java`

- 知识页：[core-src-mindustry-logic-globalvarsdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-globalvarsdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/GlobalVarsDialog.java`
- SHA1：`971cccdb43d9da55f07af41e1d06125bbb041d57`
- 声明：class GlobalVarsDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/logic/LAccess.java`

- 知识页：[core-src-mindustry-logic-laccess-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-laccess-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LAccess.java`
- SHA1：`d511ac342ad7fd2913ad553a6c96990b212e2b6e`
- 声明：enum LAccess
- 字段线索：params, isObj, all
- 方法线索：未抽取

### `core/src/mindustry/logic/LAssembler.java`

- 知识页：[core-src-mindustry-logic-lassembler-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lassembler-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LAssembler.java`
- SHA1：`3e2d795f2aeea6b21985fb363efb4bba28e7132e`
- 声明：class LAssembler
- 字段线索：customParsers, invalidNumNegative, invalidNumPositive, privileged, vars, instructions
- 方法线索：LParser, var, putConst, putVar, getVar

### `core/src/mindustry/logic/LCanvas.java`

- 知识页：[core-src-mindustry-logic-lcanvas-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lcanvas-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LCanvas.java`
- SHA1：`651d3c1e236dd9b7ed6b0be892860e7bf49f5edf`
- 声明：class LCanvasextends Table, class DragLayoutextends WidgetGroup, class StatementElemextends Table
- 字段线索：tmpOccupiers1, tmpOccupiers2, tmpBits1, tmpBits2, invalidJump, canvas
- 方法线索：touchDown, longPress, rebuild, add, addAt, save

### `core/src/mindustry/logic/LCategory.java`

- 知识页：[core-src-mindustry-logic-lcategory-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lcategory-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LCategory.java`
- SHA1：`17e6751079305738e69c82a6c0f3ce38c71dde14`
- 声明：class LCategoryimplements Comparable<LCategory>
- 字段线索：all, unknown, name, id, color, icon
- 方法线索：localized, description, compareTo

### `core/src/mindustry/logic/LExecutor.java`

- 知识页：[core-src-mindustry-logic-lexecutor-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lexecutor-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LExecutor.java`
- SHA1：`a0dd705281e7bb3b9582a32583ad4093a4ed688e`
- 声明：class LExecutor, interface LInstruction, class UnitBindIimplements LInstruction
- 字段线索：maxInstructions, maxGraphicsBuffer, instructions, vars, queryResult, binds
- 方法线索：initialized, runOnce, load, run, pack, packSign

### `core/src/mindustry/logic/LLocate.java`

- 知识页：[core-src-mindustry-logic-llocate-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-llocate-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LLocate.java`
- SHA1：`17b99f9a11954efe5590b046487611bb5d6adf05`
- 声明：enum LLocate
- 字段线索：all
- 方法线索：未抽取

### `core/src/mindustry/logic/LMarkerControl.java`

- 知识页：[core-src-mindustry-logic-lmarkercontrol-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lmarkercontrol-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LMarkerControl.java`
- SHA1：`85c777649679db20d830fb9a016ff098ccfb635d`
- 声明：enum LMarkerControl
- 字段线索：params, all
- 方法线索：未抽取

### `core/src/mindustry/logic/LParser.java`

- 知识页：[core-src-mindustry-logic-lparser-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lparser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LParser.java`
- SHA1：`30fc6d82ba1e5913b3127dc46b1a494a5fb00a80`
- 声明：class LParser, class JumpIndex
- 字段线索：tokens, maxJumps, opNameChanges, jumps, jumpLocations
- 方法线索：RuntimeException, String

### `core/src/mindustry/logic/LReadable.java`

- 知识页：[core-src-mindustry-logic-lreadable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lreadable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LReadable.java`
- SHA1：`083e1197784bf632b7b7bb4e93e172120016d51b`
- 声明：interface LReadable
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/logic/LStatement.java`

- 知识页：[core-src-mindustry-logic-lstatement-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lstatement-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LStatement.java`
- SHA1：`54de67f067c75fa925e254139ce2a47d36022f7f`
- 声明：class LStatement
- 字段线索：aligns, nameToAlign, alignToName, elem
- 方法线索：category, copy, hidden, privileged, nonPrivileged, param

### `core/src/mindustry/logic/LStatements.java`

- 知识页：[core-src-mindustry-logic-lstatements-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lstatements-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LStatements.java`
- SHA1：`08fe46cbf219ac8965c5fae278303d839ef951a8`
- 声明：class LStatements, class CommentStatementextends LStatement, class InvalidStatementextends LStatement
- 字段线索：comment, output, input, type, x, value
- 方法线索：build, NoopI, ReadI, category, WriteI, afterRead

### `core/src/mindustry/logic/LUnitControl.java`

- 知识页：[core-src-mindustry-logic-lunitcontrol-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lunitcontrol-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LUnitControl.java`
- SHA1：`3a53e618dd3abd11f2697f688f759a33fdac7d93`
- 声明：enum LUnitControl
- 字段线索：params, all
- 方法线索：move

### `core/src/mindustry/logic/LVar.java`

- 知识页：[core-src-mindustry-logic-lvar-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lvar-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LVar.java`
- SHA1：`d383454f07c2f28e965a72c01f1e034c09562908`
- 声明：class LVar
- 字段线索：name, id, constant, objval, numval, syncTime
- 方法线索：bool, num, numOrNan, numf, numfWorld, numfOrNan

### `core/src/mindustry/logic/LWritable.java`

- 知识页：[core-src-mindustry-logic-lwritable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-lwritable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LWritable.java`
- SHA1：`2e996653ee507817634c15346c670fef841d49a1`
- 声明：interface LWritable
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/logic/LogicDialog.java`

- 知识页：[core-src-mindustry-logic-logicdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-logicdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LogicDialog.java`
- SHA1：`5f7407ca023cd38ec9b9d4a6d2213182cff6caf4`
- 声明：class LogicDialogextends BaseDialog
- 字段线索：canvas
- 方法线索：setup, shouldShowVariables, showAddDialog, show

### `core/src/mindustry/logic/LogicFx.java`

- 知识页：[core-src-mindustry-logic-logicfx-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-logicfx-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LogicFx.java`
- SHA1：`9e7090d92e23340f42b660d0280b8b8bcda26910`
- 声明：class LogicFx, class EffectEntry
- 字段线索：map, name, effect, color, data, bounds
- 方法线索：bounds, name, size, rotate, color, data

### `core/src/mindustry/logic/LogicOp.java`

- 知识页：[core-src-mindustry-logic-logicop-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-logicop-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LogicOp.java`
- SHA1：`23753ce539d3a60aed225f96b549b823636df3dc`
- 声明：enum LogicOp, interface OpObjLambda2, interface OpLambda2
- 字段线索：all, objFunction2, function2, function1, func, symbol
- 方法线索：toString

### `core/src/mindustry/logic/LogicRule.java`

- 知识页：[core-src-mindustry-logic-logicrule-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-logicrule-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/LogicRule.java`
- SHA1：`df159954c4af94f1be69537e39a96aad3e4c2a62`
- 声明：enum LogicRule
- 字段线索：all
- 方法线索：未抽取

### `core/src/mindustry/logic/MessageType.java`

- 知识页：[core-src-mindustry-logic-messagetype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-messagetype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/MessageType.java`
- SHA1：`5ddf54f4eea3afaf4fa1423072fd1bfa0d5ee8d9`
- 声明：enum MessageType
- 字段线索：all
- 方法线索：未抽取

### `core/src/mindustry/logic/QueryShape.java`

- 知识页：[core-src-mindustry-logic-queryshape-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-queryshape-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/QueryShape.java`
- SHA1：`11773da79f143db873bcde052b7f085071e46b71`
- 声明：enum QueryShape
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/logic/QueryType.java`

- 知识页：[core-src-mindustry-logic-querytype-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-querytype-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/QueryType.java`
- SHA1：`46084417f462e769ca363c1016363b4e9098891a`
- 声明：enum QueryType
- 字段线索：queryable
- 方法线索：未抽取

### `core/src/mindustry/logic/RadarSort.java`

- 知识页：[core-src-mindustry-logic-radarsort-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-radarsort-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/RadarSort.java`
- SHA1：`a6c016249dc939b76efc3a36484d2ae79db94d20`
- 声明：enum RadarSort, interface RadarSortFunc
- 字段线索：func, all
- 方法线索：未抽取

### `core/src/mindustry/logic/RadarTarget.java`

- 知识页：[core-src-mindustry-logic-radartarget-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-radartarget-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/RadarTarget.java`
- SHA1：`e927ddd99c2c5e5bddc4c2bcd99af8daec1517d1`
- 声明：enum RadarTarget, interface RadarTargetFunc
- 字段线索：func, all
- 方法线索：未抽取

### `core/src/mindustry/logic/Ranged.java`

- 知识页：[core-src-mindustry-logic-ranged-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-ranged-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/Ranged.java`
- SHA1：`41a1cb0d5f5352c92b65714eda2141610146578f`
- 声明：interface Rangedextends Posc, Teamc
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/logic/Senseable.java`

- 知识页：[core-src-mindustry-logic-senseable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-senseable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/Senseable.java`
- SHA1：`1c8fb6b1e3439f1771af6d0605b7ae538183d7c1`
- 声明：interface Senseable
- 字段线索：未抽取
- 方法线索：sense, senseObject

### `core/src/mindustry/logic/Settable.java`

- 知识页：[core-src-mindustry-logic-settable-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-settable-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/Settable.java`
- SHA1：`041aa46aad43837bd9944315d7ea7ad6a4120503`
- 声明：interface Settable
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/logic/TileLayer.java`

- 知识页：[core-src-mindustry-logic-tilelayer-java.md](../mindustry-source-files/mindustry/core-src-mindustry-logic-tilelayer-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/logic/TileLayer.java`
- SHA1：`cddc13f608082dc37b74bbd74492cd436aaed0e1`
- 声明：enum TileLayer
- 字段线索：all
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
