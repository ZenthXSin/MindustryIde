# Package `mindustry.type.weather` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `mindustry.type.weather`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

内容类型包：负责 Item、Liquid、UnitType、SectorPreset、Planet 等可注册内容。

## 规模

- 仓库：`mindustry`
- Package：`mindustry.type.weather`
- 文件数：4

## 主要依赖线索

- `mindustry.type.*` × 4
- `arc.*` × 2
- `arc.graphics.*` × 2
- `arc.graphics.g2d.*` × 2
- `mindustry.gen.*` × 2
- `arc.graphics.Texture.*` × 1
- `arc.util.*` × 1
- `mindustry.content.*` × 1

## 文件逐个分析

### `core/src/mindustry/type/weather/MagneticStorm.java`

- 知识页：[core-src-mindustry-type-weather-magneticstorm-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weather-magneticstorm-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weather/MagneticStorm.java`
- SHA1：`e2590b08b31716c546a03c764127ff4e74644f32`
- 声明：class MagneticStormextends Weather
- 字段线索：未抽取
- 方法线索：未抽取

### `core/src/mindustry/type/weather/ParticleWeather.java`

- 知识页：[core-src-mindustry-type-weather-particleweather-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weather-particleweather-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weather/ParticleWeather.java`
- SHA1：`acd8f34bbfc069bdea03b7bb9c80da9963ee7d33`
- 声明：class ParticleWeatherextends Weather
- 字段线索：particleRegion, color, region, yspeed, sinSclMin, noiseColor
- 方法线索：load, update, drawOver

### `core/src/mindustry/type/weather/RainWeather.java`

- 知识页：[core-src-mindustry-type-weather-rainweather-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weather-rainweather-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weather/RainWeather.java`
- SHA1：`a361e22c3467044cc9ab49d7eb6d41b247d2c029`
- 声明：class RainWeatherextends Weather
- 字段线索：yspeed, liquid, splashes, color
- 方法线索：load, drawOver, drawUnder

### `core/src/mindustry/type/weather/SolarFlare.java`

- 知识页：[core-src-mindustry-type-weather-solarflare-java.md](../mindustry-source-files/mindustry/core-src-mindustry-type-weather-solarflare-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/type/weather/SolarFlare.java`
- SHA1：`db1529c59b8ec1ac6365bc27d63c8518ec41344e`
- 声明：class SolarFlareextends Weather
- 字段线索：未抽取
- 方法线索：未抽取


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
