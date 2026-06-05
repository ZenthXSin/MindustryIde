# Mindustry Environment Block Fields

> Source: `源码和示例/Mindustry/core/src/mindustry/world/blocks/environment/Floor.java`, `OverlayFloor.java`, `OreBlock.java`, `TiledFloor.java`, `TiledWall.java`, `源码和示例/Mindustry/core/src/mindustry/world/Block.java`

## Scope

这里的“environment”指 `mindustry.world.blocks.environment.*` 下的环境类方块。它们大多继承 `mindustry.world.Block`，其中 `Floor` 是核心基类，其余类型在此基础上叠加自己的字段和绘制/放置规则。

## Floor 公开字段

来自 `core/src/mindustry/world/blocks/environment/Floor.java`：

- `edge: String = "stone"`
- `speedMultiplier: float = 1f`
- `dragMultiplier: float = 1f`
- `damageTaken: float = 0f`
- `drownTime: float = 0f`
- `walkEffect: Effect = Fx.none`
- `walkSound: Sound = Sounds.none`
- `walkSoundVolume: float = 0.1f`
- `walkSoundPitchMin: float = 0.8f`
- `walkSoundPitchMax: float = 1.2f`
- `drownUpdateEffect: Effect = Fx.bubble`
- `status: StatusEffect = StatusEffects.none`
- `statusDuration: float = 60f`
- `liquidDrop: Liquid = null`
- `liquidMultiplier: float = 1f`
- `isLiquid: boolean`
- `overlayAlpha: float = 0.65f`
- `supportsOverlay: boolean = false`
- `shallow: boolean = false`
- `blendGroup: Block = this`
- `oreDefault: boolean = false`
- `oreScale: float = 24f`
- `oreThreshold: float = 0.828f`
- `wall: Block = Blocks.air`
- `decoration: Block = Blocks.air`
- `canShadow: boolean = true`
- `forceDrawLight: boolean = false`
- `needsSurface: boolean = true`
- `allowCorePlacement: boolean = false`
- `wallOre: boolean = false`
- `blendId: int = -1`
- `tilingVariants: int = 0`
- `autotile: boolean = false`
- `autotileMidVariants: int = 1`
- `autotileVariants: int = 1`
- `drawEdgeIn: boolean = true`
- `drawEdgeOut: boolean = true`

### Floor 内部缓存/运行时字段

- `tilingRegions: TextureRegion[][][]`
- `autotileRegions: TextureRegion[]`
- `autotileMidRegions: TextureRegion[]`
- `autotileVariantRegions: TextureRegion[][]`
- `tilingSize: int`
- `edges: TextureRegion[][]`
- `blenders: Seq<Floor>`
- `blended: Bits`
- `dirs: int[]`
- `edgeRegion: TextureRegion`

## OverlayFloor

`OverlayFloor` 自身几乎不新增字段，主要变化是：

- 继承 `Floor` 的全部字段
- 构造时强制 `useColor = false`
- `canPlaceOn(...)` 受 `wallOre` 影响
- `drawBase(...)` 使用 `variantRegions` 绘制

## OreBlock

`OreBlock` 继承 `OverlayFloor`，没有新增大量公开字段，核心配置是：

- `localizedName`
- `itemDrop`
- `variants = 3`
- `mapColor`
- `useColor = true`

并且 `init()` 会强制检查 `itemDrop != null`。

## TiledFloor

来自 `core/src/mindustry/world/blocks/environment/TiledFloor.java`：

- `sizedRegions: TextureRegion[][][][]`
- `maxSize: int = 3`

## TiledWall

来自 `core/src/mindustry/world/blocks/environment/TiledWall.java`：

- `sizedRegions: TextureRegion[][][][]`
- `maxSize: int = 3`

## 常一起用的 Block 字段

来自 `core/src/mindustry/world/Block.java`，环境类最常配合这些字段：

- `variants`
- `useColor`
- `itemDrop`
- `solid`
- `floating`
- `placeableLiquid`
- `placeableOn`
- `ignoreBuildDarkness`
- `hasShadow`
- `customShadow`
- `lightColor`
- `emitLight`
- `obstructsLight`
- `lightRadius`
- `buildVisibility`
- `replaceable`
- `alwaysReplace`
- `envRequired`
- `envEnabled`
- `envDisabled`
- `fillsTile`
- `forceDark`

## 写环境类时的注意点

- `Floor` 是基础：地面效果、状态、液体、边缘、自动贴图都在这里。
- `OverlayFloor` 适合“叠在地面上的东西”，如矿层、表层装饰。
- `OreBlock` 必须有 `itemDrop`，否则初始化直接报错。
- `autotile = true` 时，`variants` 会被置 0，不能和普通 variants 的思路混用。
- `Tiling` / `TiledFloor` / `TiledWall` 依赖资源尺寸一致，否则会退化或出问题。
- `wallOre` 会影响覆盖在墙上的矿逻辑。
- `supportsOverlay`、`needsSurface`、`allowCorePlacement` 会直接影响可放置性。

## Related

- [BasicGenerator ore() 方法用法](mindustry-basic-generator-ore.md)
- [Mindustry Autotiler 用法](mindustry-autotiler.md)
- [Mindustry Rendering System](mindustry/rendering-system.md)
