# Package `mindustry.ui.fragments` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.ui.fragments`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

UI 包：负责 Scene2D 界面、Fragments、Dialogs、Styles 与编辑器界面。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.ui.fragments`
- 文件数：13

## 主要依赖线索

- `arc.*` × 13
- `arc.scene.*` × 13
- `arc.scene.ui.layout.*` × 12
- `arc.util.*` × 12
- `arc.math.*` × 10
- `arc.graphics.g2d.*` × 9
- `arc.scene.event.*` × 9
- `arc.scene.ui.*` × 9
- `arc.struct.*` × 9
- `mindustry.gen.*` × 8
- `arc.graphics.*` × 8
- `arc.scene.actions.*` × 7
- `mindustry.game.EventType.*` × 6
- `arc.input.*` × 6
- `mindustry.core.*` × 6
- `arc.func.*` × 5
- `mindustry.content.*` × 4
- `arc.math.geom.*` × 4
- `mindustry.*` × 4
- `mindustry.input.*` × 4

## 文件逐个分析

### `core/src/mindustry/ui/fragments/BlockConfigFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-blockconfigfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-blockconfigfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/BlockConfigFragment.java`
- SHA1：`52fb278607a2c218b463e4c1ba49d0e622da74ce`
- 声明：class BlockConfigFragment
- 字段线索：未抽取
- 方法线索：build, forceHide, isShown, getSelected, showConfig, hasConfigMouse

### `core/src/mindustry/ui/fragments/BlockInventoryFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-blockinventoryfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-blockinventoryfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/BlockInventoryFragment.java`
- SHA1：`cc0bbe821213e957c0cb9910835f873b473a15f4`
- 声明：class BlockInventoryFragment
- 字段线索：holdWithdraw, holdShrink
- 方法线索：build, showFor, hide, takeItem, rebuild, touchDown

### `core/src/mindustry/ui/fragments/ChatFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-chatfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-chatfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/ChatFragment.java`
- SHA1：`b27aac71c0423fec6a8b272ea9f48df83ae4d14a`
- 声明：class ChatFragmentextends Table, enum ChatMode
- 字段线索：messagesShown, messages, fadetime, shown, chatfield, fieldlabel
- 方法线索：build, clearMessages, setup, handleType, rect, draw

### `core/src/mindustry/ui/fragments/ConsoleFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-consolefragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-consolefragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/ConsoleFragment.java`
- SHA1：`865810821816491bbe17e50ab8afdb53a4eb8f77`
- 声明：class ConsoleFragmentextends Table
- 字段线索：messagesShown, messages, open, chatfield, fieldlabel, font
- 方法线索：build, clearMessages, setup, rect, draw, sendMessage

### `core/src/mindustry/ui/fragments/FadeInFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-fadeinfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-fadeinfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/FadeInFragment.java`
- SHA1：`711c75b11c5dacadff73bc517a0895176f853661`
- 声明：class FadeInFragment
- 字段线索：duration
- 方法线索：build, draw, act

### `core/src/mindustry/ui/fragments/HintsFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-hintsfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-hintsfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/HintsFragment.java`
- SHA1：`f333fd4830388729b50508bd649583bbfe294df2`
- 声明：class HintsFragment, enum DefaultHintimplements Hint, interface Hint
- 字段线索：isTutorial, foutTime, hints
- 方法线索：build, shown, isSerpulo, finished, finish, text

### `core/src/mindustry/ui/fragments/HudFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-hudfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-hudfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/HudFragment.java`
- SHA1：`b1d6789ba68181a707cfc737575e6b642403f228`
- 声明：class HudFragment, class SideBarextends Element
- 字段线索：dsize, blockfrag, coreItems, shown, flip, hudText
- 方法线索：addBlockSelection, rebuildBlockSelection, clicked, build, getPrefHeight, setHudText

### `core/src/mindustry/ui/fragments/LoadingFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-loadingfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-loadingfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/LoadingFragment.java`
- SHA1：`99093168f07a9ef96be90067ccd9f8664b571308`
- 声明：class LoadingFragment
- 字段线索：table, button, bar, nameLabel, cancelListener, progValue
- 方法线索：build, toFront, setProgress, snapProgress, setButton, setText

### `core/src/mindustry/ui/fragments/MenuFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-menufragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-menufragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/MenuFragment.java`
- SHA1：`94514bf1a45100b4b71d7b4587f8c17fcbc5b162`
- 声明：class MenuFragment, class MenuButton
- 字段线索：submenu, currentMenu, renderer, customButtons, desktopButtons, icon
- 方法线索：build, buildMobile, buildDesktop, checkPlay, fadeInMenu, fadeOutMenu

### `core/src/mindustry/ui/fragments/MinimapFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-minimapfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-minimapfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/MinimapFragment.java`
- SHA1：`44347b4ab7a8538af985c2a404d6318afa5f918a`
- 声明：class MinimapFragment
- 字段线索：shown, baseSize, elem
- 方法线索：getRectBounds, build, zoom, pan, touchDown, tap

### `core/src/mindustry/ui/fragments/PlacementFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-placementfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-placementfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/PlacementFragment.java`
- SHA1：`a40331eef73ebab68bf9a0afc9877bdd0bad5eeb`
- 声明：class PlacementFragment
- 字段线索：rowWidth, currentCategory
- 方法线索：hover, rebuild, build, draw

### `core/src/mindustry/ui/fragments/PlanConfigFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-planconfigfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-planconfigfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/PlanConfigFragment.java`
- SHA1：`378ec32a93f60c26f4a49452c0d13aafce607633`
- 声明：class PlanConfigFragment
- 字段线索：未抽取
- 方法线索：build, showConfig, forceHide, hide

### `core/src/mindustry/ui/fragments/PlayerListFragment.java`

- 知识页：[core-src-mindustry-ui-fragments-playerlistfragment-java.md](../mindustry-source-files/mindustry/core-src-mindustry-ui-fragments-playerlistfragment-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/ui/fragments/PlayerListFragment.java`
- SHA1：`22fc6a821903c72b6e6a1bb7307b19d4ec832d1e`
- 声明：class PlayerListFragment
- 字段线索：content, visible, timer, search, players
- 方法线索：build, rebuild, draw, toggle


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
