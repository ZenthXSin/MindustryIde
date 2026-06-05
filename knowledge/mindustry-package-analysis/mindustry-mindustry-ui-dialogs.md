# Package `mindustry.ui.dialogs` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ui.dialogs`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

原版内容定义包：集中声明 Blocks、Items、Liquids、UnitTypes、Planets 等内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ui.dialogs`
- 文件数：38

## 主要依赖线索

- `arc.*` × 32
- `arc.scene.ui.*` × 32
- `mindustry.gen.*` × 31
- `arc.scene.ui.layout.*` × 29
- `arc.util.*` × 28
- `mindustry.ui.*` × 20
- `arc.graphics.*` × 19
- `arc.struct.*` × 18
- `arc.func.*` × 14
- `arc.input.*` × 14
- `mindustry.*` × 13
- `mindustry.graphics.*` × 12
- `arc.math.*` × 10
- `arc.graphics.g2d.*` × 10
- `arc.scene.style.*` × 10
- `mindustry.type.*` × 9
- `mindustry.game.*` × 9
- `arc.scene.event.*` × 9
- `arc.scene.*` × 7
- `mindustry.content.*` × 7

## 文件逐个分析

### `core/src/mindustry/ui/dialogs/AboutDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-aboutdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-aboutdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/AboutDialog.java`
- SHA1：`54d2707b23207d27edfcfdd78d716d5a55e81294`
- 声明：class AboutDialogextends BaseDialog
- 字段线索：bannedItems
- 方法线索：showCredits

### `core/src/mindustry/ui/dialogs/AdminsDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-adminsdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-adminsdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/AdminsDialog.java`
- SHA1：`3186f4e9a48c75cb2e3381260723ec607b9fd902`
- 声明：class AdminsDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：setup

### `core/src/mindustry/ui/dialogs/BansDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-bansdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-bansdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/BansDialog.java`
- SHA1：`e7d0c4b235f50a5b5790201f5016bbedcf6feace`
- 声明：class BansDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：setup

### `core/src/mindustry/ui/dialogs/BaseDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-basedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-basedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/BaseDialog.java`
- SHA1：`1716622997ec6977d779510141b80e8abd14a9d8`
- 声明：class BaseDialogextends Dialog
- 字段线索：wasPaused, shouldPause
- 方法线索：makeButtonOverlay, onResize, addCloseListener, addCloseButton

### `core/src/mindustry/ui/dialogs/CampaignCompleteDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-campaigncompletedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-campaigncompletedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/CampaignCompleteDialog.java`
- SHA1：`3715adcd1277499ca25c5d9e8c9cb171bfe908f4`
- 声明：class CampaignCompleteDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：show

### `core/src/mindustry/ui/dialogs/CampaignRulesDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-campaignrulesdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-campaignrulesdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/CampaignRulesDialog.java`
- SHA1：`e4b38c17024ec6a9c98f1c7391b93e50c42e676a`
- 声明：class CampaignRulesDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：show

### `core/src/mindustry/ui/dialogs/CanvasEditDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-canvaseditdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-canvaseditdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/CanvasEditDialog.java`
- SHA1：`7020cd33df6530a70c1621c802f432934fe26c1f`
- 声明：class CanvasEditDialogextends BaseDialog
- 字段线索：refreshTime
- 方法线索：touchDown, touchDragged, draw

### `core/src/mindustry/ui/dialogs/ColorPicker.java`

- 知识页：[core-src-mindustry-ui-dialogs-colorpicker-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-colorpicker-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/ColorPicker.java`
- SHA1：`9e8829eadec4a219c10c9f5a28687d4d8c09c0ad`
- 声明：class ColorPickerextends BaseDialog
- 字段线索：hueTex, cons
- 方法线索：show, draw

### `core/src/mindustry/ui/dialogs/ContentInfoDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-contentinfodialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-contentinfodialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/ContentInfoDialog.java`
- SHA1：`471e751bc148652bc58a531545e8da79142d74db`
- 声明：class ContentInfoDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：show

### `core/src/mindustry/ui/dialogs/CustomGameDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-customgamedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-customgamedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/CustomGameDialog.java`
- SHA1：`2ca3ee3d7b68c4b733ad8d711f3d5793bccdec34`
- 声明：class CustomGameDialogextends MapListDialog
- 字段线索：dialog
- 方法线索：showMap

### `core/src/mindustry/ui/dialogs/CustomRulesDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-customrulesdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-customrulesdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/CustomRulesDialog.java`
- SHA1：`57da8322e0fcea44de502c30937dd0c301a20277`
- 声明：class CustomRulesDialogextends BaseDialog
- 字段线索：main, resetter, loadoutDialog, bannedBlocks, bannedUnits, showRuleEditRule
- 方法线索：show, category, team, number, numberi, check

### `core/src/mindustry/ui/dialogs/DatabaseDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-databasedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-databasedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/DatabaseDialog.java`
- SHA1：`afd95452fa469536a729761757f718fc2678e4c2`
- 声明：class DatabaseDialogextends BaseDialog
- 字段线索：sortedContents, tmpCategory, search, all, allTabs, tab
- 方法线索：未抽取

### `core/src/mindustry/ui/dialogs/DiscordDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-discorddialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-discorddialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/DiscordDialog.java`
- SHA1：`e48a83888eba699d8032fe2121c7f6d18d6b723e`
- 声明：class DiscordDialogextends Dialog
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/ui/dialogs/EditorMapsDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-editormapsdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-editormapsdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/EditorMapsDialog.java`
- SHA1：`a259f3ed2cadc598820c7cfb9897e5da8008a66d`
- 声明：class EditorMapsDialogextends MapListDialog
- 字段线索：未抽取
- 方法线索：buildButtons, showMap

### `core/src/mindustry/ui/dialogs/EffectsDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-effectsdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-effectsdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/EffectsDialog.java`
- SHA1：`1c7e8e24c6c6e58d4ec29f8d09e3cc516e98835a`
- 声明：class EffectsDialogextends BaseDialog, class BoundsBatchextends Batch, class EffectCellextends Element
- 字段线索：bounds
- 方法线索：EffectsDialog, show, getData, calculateSize, draw, flush

### `core/src/mindustry/ui/dialogs/FileChooser.java`

- 知识页：[core-src-mindustry-ui-dialogs-filechooser-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-filechooser-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/FileChooser.java`
- SHA1：`c593f228e29a5c523099e6b8bc03f6e1806348ee`
- 声明：class FileChooserextends BaseDialog, class FileHistory
- 字段线索：homeDirectory, lastDirectory, files, pane, filefield, ok
- 方法线索：setupWidgets, updateFileFieldStatus, getFileNames, push, back, forward

### `core/src/mindustry/ui/dialogs/FullTextDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-fulltextdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-fulltextdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/FullTextDialog.java`
- SHA1：`efa06e1f6cbd4ef9f83b1b2def7071fa53260f02`
- 声明：class FullTextDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：show

### `core/src/mindustry/ui/dialogs/GameOverDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-gameoverdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-gameoverdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/GameOverDialog.java`
- SHA1：`a735dc69f34ed84266a5fb201b32bd0ef7a89722`
- 声明：class GameOverDialogextends BaseDialog, class StatLabelextends Table
- 字段线索：winner, hudShown, progress
- 方法线索：show, addStat

### `core/src/mindustry/ui/dialogs/HostDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-hostdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-hostdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/HostDialog.java`
- SHA1：`07ace28224381430c5e9bebbac2b1616f0a3d4a7`
- 声明：class HostDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：runHost

### `core/src/mindustry/ui/dialogs/IconSelectDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-iconselectdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-iconselectdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/IconSelectDialog.java`
- SHA1：`74e9a4a93f9bcc195d6ec978a5d1e11f25367a2f`
- 声明：class IconSelectDialogextends Dialog
- 字段线索：consumer
- 方法线索：show

### `core/src/mindustry/ui/dialogs/JoinDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-joindialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-joindialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/JoinDialog.java`
- SHA1：`6ff0b06dce81af6284aabf8d4e46abb849ce373e`
- 声明：class JoinDialogextends BaseDialog, class Server
- 字段线索：ip, port, content, lastHost
- 方法线索：connect, reconnect, loadServers, saveServers, getVersionString

### `core/src/mindustry/ui/dialogs/KeybindDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-keybinddialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-keybinddialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/KeybindDialog.java`
- SHA1：`bd3a127302b550e87ffb25b35c6d4bcd12b3c385`
- 声明：class KeybindDialogextends Dialog
- 字段线索：rebindKey, rebindAxis, rebindMin, minKey, rebindDialog, bindsTable
- 方法线索：addCloseButton, rebuildBinds, openDialog, touchDown, keyDown, scrolled

### `core/src/mindustry/ui/dialogs/LanguageDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-languagedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-languagedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/LanguageDialog.java`
- SHA1：`8ffdca9765ffca7c6f0058f546bf770e6b2b8997`
- 声明：class LanguageDialogextends BaseDialog
- 字段线索：displayNames, lastLocale
- 方法线索：setup, getLocale

### `core/src/mindustry/ui/dialogs/LaunchLoadoutDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-launchloadoutdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-launchloadoutdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/LaunchLoadoutDialog.java`
- SHA1：`983665d9ba52a4cc22818bf5a39e857c5a94989a`
- 声明：class LaunchLoadoutDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：show

### `core/src/mindustry/ui/dialogs/LoadDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-loaddialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-loaddialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/LoadDialog.java`
- SHA1：`a8c04fd4bc24e4479961334eb506da289ed0554f`
- 声明：class LoadDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：setup, rebuild, addSetup, runLoadSave, modifyButton, show

### `core/src/mindustry/ui/dialogs/LoadoutDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-loadoutdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-loadoutdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/LoadoutDialog.java`
- SHA1：`0efc16563f083f4eee3f788e4f3f72dc22add9d9`
- 声明：class LoadoutDialogextends BaseDialog
- 字段线索：hider, resetter, updater, stacks, originalStacks, validator
- 方法线索：maxItems, show, reseed, step

### `core/src/mindustry/ui/dialogs/MapListDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-maplistdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-maplistdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/MapListDialog.java`
- SHA1：`d7b581b6b26913cd762bab82c23aa43bff3a9f72`
- 声明：class MapListDialogextends BaseDialog
- 字段线索：searchString, modes, availablePlanets, mapTable, searchField, showBuiltIn
- 方法线索：showMap, clicked, longPress, show

### `core/src/mindustry/ui/dialogs/MapPlayDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-mapplaydialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-mapplaydialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/MapPlayDialog.java`
- SHA1：`e28f1f58f83d35d0b0552ad6d142091b1e55c53e`
- 声明：class MapPlayDialogextends BaseDialog
- 字段线索：playListener
- 方法线索：show, displayGameModeHelp

### `core/src/mindustry/ui/dialogs/ModsDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-modsdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-modsdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/ModsDialog.java`
- SHA1：`514952fe3b4f5c3ac0d576931c61a5c68ac50e9f`
- 声明：class ModsDialogextends BaseDialog
- 字段线索：textureCache, modImportProgress, cancelledImport, searchtxt, modList, orderDate
- 方法线索：Date, showMod, showModBrowser, rebuildBrowser, draw, handleMod

### `core/src/mindustry/ui/dialogs/PaletteDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-palettedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-palettedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/PaletteDialog.java`
- SHA1：`cfac11c3df2b8864c381c226f8fd2e13c492a068`
- 声明：class PaletteDialogextends Dialog
- 字段线索：cons
- 方法线索：build, show

### `core/src/mindustry/ui/dialogs/PausedDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-pauseddialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-pauseddialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/PausedDialog.java`
- SHA1：`140a6820b0ce1c608ac2f47730143699c0c4abe0`
- 声明：class PausedDialogextends BaseDialog
- 字段线索：processors, save, load, rulesDialog
- 方法线索：checkPlaytest, runExitSave

### `core/src/mindustry/ui/dialogs/PlanetDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-planetdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-planetdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/PlanetDialog.java`
- SHA1：`121d5c672cefa198122ca30a7a0ab28d2552a7c4`
- 声明：class PlanetDialogextends BaseDialog implements PlanetInterfaceRenderer, enum Mode
- 字段线索：debugSelect, sectorShowDuration, buffer, loadouts, planets, state
- 方法线索：keyDown, scrolled, zoom, touchUp, tap, show

### `core/src/mindustry/ui/dialogs/ResearchDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-researchdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-researchdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/ResearchDialog.java`
- SHA1：`486deb3c3f9ad7f6d980ff96702bbd250af88b53`
- 声明：class ResearchDialogextends BaseDialog, class LayoutNodeextends TreeNode<LayoutNode>, class TechTreeNodeextends TreeNode<TechTreeNode>
- 字段线索：debugShowRequirements, nodeSize, nodes, root, lastNode, bounds
- 方法线索：scrolled, mouseMoved, zoom, touchUp, pan, rebuildItems

### `core/src/mindustry/ui/dialogs/SaveDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-savedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-savedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/SaveDialog.java`
- SHA1：`a27c0fc40dd6b0959d0ad921526d7b9126c91f1c`
- 声明：class SaveDialogextends LoadDialog
- 字段线索：未抽取
- 方法线索：addSetup, modifyButton

### `core/src/mindustry/ui/dialogs/SchematicsDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-schematicsdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-schematicsdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/SchematicsDialog.java`
- SHA1：`6ad4e0b42fcfc5c32ec2f83feced4edc3588e4b7`
- 声明：class SchematicsDialogextends BaseDialog, class SchematicImageextends Image, class SchematicInfoDialogextends BaseDialog
- 字段线索：tagh, info, firstSchematic, search, searchField, rebuildPane
- 方法线索：showInfo, showImport, showExport, showEdit, show, draw

### `core/src/mindustry/ui/dialogs/SectorSelectDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-sectorselectdialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-sectorselectdialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/SectorSelectDialog.java`
- SHA1：`d97131610bce8b9989965d3bcc1edcde24a68602`
- 声明：class SectorSelectDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：show

### `core/src/mindustry/ui/dialogs/SettingsMenuDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-settingsmenudialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-settingsmenudialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/SettingsMenuDialog.java`
- SHA1：`1201ea348e943b4d38956057569f17582382bfda`
- 声明：class SettingsMenuDialogextends BaseDialog, interface StringProcessor, class SettingsCategory
- 字段线索：graphics, game, sound, main, prefs, menu
- 方法线索：addCategory, getCategories, exportData, importData, IllegalArgumentException, back

### `core/src/mindustry/ui/dialogs/TraceDialog.java`

- 知识页：[core-src-mindustry-ui-dialogs-tracedialog-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-dialogs-tracedialog-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/dialogs/TraceDialog.java`
- SHA1：`f2c1575e299c0dde42e23d1a1e16c5f62c5dc20f`
- 声明：class TraceDialogextends BaseDialog
- 字段线索：未抽取
- 方法线索：show, copy


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
