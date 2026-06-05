# Mindustry Kotlin Mod Structure

> Source: 本地源码 `源码和示例/Mindustry/core/src/mindustry/mod/Mod.java`、`源码和示例/Mindustry/core/src/mindustry/core/ContentLoader.java`，以及本地 Kotlin 示例 `源码和示例/mods/VoidShield/src/voidshield/VoidShieldMod.kt`、`源码和示例/mods/VoidShield/src/voidshield/content/VSBlocks.kt`、`源码和示例/mods/Helium-master/src/main/kotlin/helium/Helium.kt`。

## 结论

Kotlin Mindustry Mod 的核心结构通常是：一个继承 `mindustry.mod.Mod` 的入口类，重写 `loadContent()` 注册内容，重写 `init()` 做运行期初始化、UI、事件监听、逻辑语句注册、分类应用等。

## 源码依据

- `mindustry.mod.Mod`：定义 `init()`、`loadContent()`、`packSprites()`、`registerServerCommands()`、`registerClientCommands()`。
- `mindustry.core.ContentLoader.createModContent()`：通过 `mods.loadContent()` 进入 mod 内容加载。
- `mindustry.core.ContentLoader.init()`：统一调用所有 `Content.init()`、`Content.postInit()`，然后触发 `ContentInitEvent`。
- `mindustry.core.ContentLoader.load()`：统一调用所有 `Content.loadIcon()`、`Content.load()`。

## Kotlin 示例模式

`VoidShieldMod.kt` 的结构：

- `class VoidShieldMod : Mod()` 作为入口类。
- `override fun loadContent()` 中调用 `VSBlocks.load()` 注册方块内容。
- `override fun init()` 中加载变量、逻辑扩展、分类、事件绘制与 shader 测试。

`VSBlocks.kt` 的结构：

- 使用 `object VSBlocks` 做内容集中注册器。
- 方块字段以 `var heatSink: HeaterBlock? = null` 形式保存引用。
- `fun load()` 中通过 `HeaterBlock("heat-sink").apply { ... }` 构造并配置方块。

`Helium.kt` 的结构：

- `class Helium : Mod()` 只负责入口。
- `override fun init()` 转发到 `He.init()`。
- 复杂状态、UI、资源加载放入单独的 `object He`。

## 实用规则

- 内容对象注册放 `loadContent()`。
- 依赖游戏 UI、事件、逻辑语句、运行期全局状态的初始化放 `init()` 或事件回调。
- Kotlin `object` 很适合做内容注册表，例如 `VSBlocks`。
- Kotlin `apply {}` 适合配置 Mindustry 的 public 字段风格 API。
- 若某个对象要被科技树、分类、UI 或其他内容引用，保存为 `var` 字段，别只创建匿名对象。

## Related

- [Learn Mindustry Mod: Kotlin Developer View](../analysis/lmm-kotlin-perspective.md)
- [Mindustry Mod Lifecycle and Parser Boundary](mindustry-mod-lifecycle-parser-boundary.md)
- [Mindustry Content Loading Chain](mindustry-content-loading-chain.md)
- [Mindustry Kotlin 多合成工厂](mindustry-kotlin-multi-recipe-crafter.md)
