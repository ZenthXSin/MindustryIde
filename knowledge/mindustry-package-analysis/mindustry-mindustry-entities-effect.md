# Package `mindustry.entities.effect` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.entities.effect`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

实体系统包：负责单位、子弹、特效、群组、AI 行为和运行时实体逻辑。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.entities.effect`
- 文件数：8

## 主要依赖线索

- `mindustry.entities.*` × 8
- `arc.graphics.*` × 7
- `arc.math.*` × 5
- `arc.graphics.g2d.*` × 3
- `mindustry.graphics.*` × 3
- `arc.util.*` × 3
- `arc.*` × 2
- `mindustry.content.*` × 2
- `arc.math.geom.*` × 1
- `arc.audio.*` × 1
- `arc.func.*` × 1
- `arc.struct.*` × 1
- `mindustry.game.EventType.*` × 1
- `mindustry.gen.*` × 1

## 文件逐个分析

### `core/src/mindustry/entities/effect/ExplosionEffect.java`

- 知识页：[core-src-mindustry-entities-effect-explosioneffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-explosioneffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/ExplosionEffect.java`
- SHA1：`f12625cf426fbb57425b886bc40ad7f57d1068ed`
- 声明：class ExplosionEffectextends Effect
- 字段线索：waveColor, waveLife, smokes
- 方法线索：未抽取

### `core/src/mindustry/entities/effect/MultiEffect.java`

- 知识页：[core-src-mindustry-entities-effect-multieffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-multieffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/MultiEffect.java`
- SHA1：`0e0d43b85e983841027ebcf83b8128c6f63330f2`
- 声明：class MultiEffectextends Effect
- 字段线索：effects
- 方法线索：create

### `core/src/mindustry/entities/effect/ParticleEffect.java`

- 知识页：[core-src-mindustry-entities-effect-particleeffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-particleeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/ParticleEffect.java`
- SHA1：`34d186aad19b597ab7a38ec700c6745fa15a2d59`
- 声明：class ParticleEffectextends Effect
- 字段线索：rand, rv, colorFrom, particles, randLength, casingFlip
- 方法线索：init, render

### `core/src/mindustry/entities/effect/RadialEffect.java`

- 知识页：[core-src-mindustry-entities-effect-radialeffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-radialeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/RadialEffect.java`
- SHA1：`5955c1b01be13ec6cac57b40dbeddee98e137a88`
- 声明：class RadialEffectextends Effect
- 字段线索：effect, rotationSpacing, lengthOffset, amount
- 方法线索：create

### `core/src/mindustry/entities/effect/SeqEffect.java`

- 知识页：[core-src-mindustry-entities-effect-seqeffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-seqeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/SeqEffect.java`
- SHA1：`2093a6488eaa6e8f88e00dcd702e151ee3f49ca3`
- 声明：class SeqEffectextends Effect
- 字段线索：effects
- 方法线索：init, render

### `core/src/mindustry/entities/effect/SoundEffect.java`

- 知识页：[core-src-mindustry-entities-effect-soundeffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-soundeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/SoundEffect.java`
- SHA1：`2a139ab7ca85431c51b6621e185aaa371077f703`
- 声明：class SoundEffectextends Effect
- 字段线索：sound, minPitch, maxPitch, minVolume, maxVolume, effect
- 方法线索：init, create

### `core/src/mindustry/entities/effect/WaveEffect.java`

- 知识页：[core-src-mindustry-entities-effect-waveeffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-waveeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/WaveEffect.java`
- SHA1：`df42a7d2ee209f6926b8314156bdb8e371187f57`
- 声明：class WaveEffectextends Effect
- 字段线索：colorFrom, lightColor, sizeFrom, sides, rotation, strokeFrom
- 方法线索：init, render

### `core/src/mindustry/entities/effect/WrapEffect.java`

- 知识页：[core-src-mindustry-entities-effect-wrapeffect-java.md](../mindustry-source-files/mindustry/core-src-mindustry-entities-effect-wrapeffect-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/entities/effect/WrapEffect.java`
- SHA1：`9c7df4975ec7c74af72a6be9c19d93d9befe4d4a`
- 声明：class WrapEffectextends Effect
- 字段线索：effect, color, rotation
- 方法线索：init, render, create


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
