# Package `power` (mindustry)

> Source: 本地源码仓库 `mindustry` 中 package `power`；文件级页来自 `knowledge/mindustry-source-files/manifest.json`。

## 包职责

通用支撑包：负责该命名空间下的工具、抽象、平台适配或内容定义。

## 规模

- 仓库：`mindustry`
- Package：`power`
- 文件数：4

## 主要依赖线索

- `mindustry.world.*` × 4
- `mindustry.world.blocks.power.*` × 4
- `org.junit.jupiter.api.*` × 4
- `arc.util.*` × 3
- `mindustry.*` × 3
- `mindustry.content.*` × 3
- `mindustry.core.*` × 3
- `mindustry.game.*` × 2
- `mindustry.type.*` × 2
- `mindustry.world.blocks.power.PowerGenerator.*` × 2
- `mindustry.gen.*` × 2
- `arc.struct.*` × 1
- `mindustry.world.blocks.power.ConsumeGenerator.*` × 1
- `mindustry.world.consumers.*` × 1
- `mindustry.world.blocks.production.*` × 1
- `arc.*` × 1
- `arc.mock.*` × 1
- `arc.math.*` × 1

## 文件逐个分析

### `tests/src/test/java/power/ConsumeGeneratorTests.java`

- 知识页：[tests-src-test-java-power-consumegeneratortests-java.md](../mindustry-source-files/mindustry/tests-src-test-java-power-consumegeneratortests-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tests/src/test/java/power/ConsumeGeneratorTests.java`
- SHA1：`caa2d635c018f253cc8e5014aa05a34906275783`
- 声明：class ConsumeGeneratorTestsextends PowerTestFixture, enum InputType
- 字段线索：build, fakeItemDuration, maximumLiquidUsage
- 方法线索：createGenerator, generatorWorksProperlyWithLiquidInput, generatorWorksProperlyWithItemInput, efficiencyRemainsConstantWithinItemDuration_ItemsOnly

### `tests/src/test/java/power/DirectConsumerTests.java`

- 知识页：[tests-src-test-java-power-directconsumertests-java.md](../mindustry-source-files/mindustry/tests-src-test-java-power-directconsumertests-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tests/src/test/java/power/DirectConsumerTests.java`
- SHA1：`496daaa127bba033a76d82a56423a3f00683162c`
- 声明：class DirectConsumerTestsextends PowerTestFixture
- 字段线索：fakes
- 方法线索：noPowerRequestedWithNoItems, noPowerRequestedWithInsufficientItems, powerRequestedWithSufficientItems

### `tests/src/test/java/power/PowerTestFixture.java`

- 知识页：[tests-src-test-java-power-powertestfixture-java.md](../mindustry-source-files/mindustry/tests-src-test-java-power-powertestfixture-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tests/src/test/java/power/PowerTestFixture.java`
- SHA1：`174f87d7283c227a75b695c9e903203e5829d7fb`
- 声明：class PowerTestFixture
- 字段线索：未抽取
- 方法线索：initializeDependencies, PowerGenerator, Battery, PowerBlock, RuntimeException

### `tests/src/test/java/power/PowerTests.java`

- 知识页：[tests-src-test-java-power-powertests-java.md](../mindustry-source-files/mindustry/tests-src-test-java-power-powertests-java.md)
- 源码：`/home/zenxsin/cow/源码和示例/Mindustry/tests/src/test/java/power/PowerTests.java`
- SHA1：`6bd44ce3c99983da799339c69165f7a03b07a369`
- 声明：class PowerTestsextends PowerTestFixture, class PowerGraphTests
- 字段线索：未抽取
- 方法线索：init, directConsumerSatisfactionIsAsExpected, batteryCapacityIsAsExpected, directConsumptionStopsWithNoPower


## Related

- [Mindustry / Arc Per-File Knowledge Pages](../mindustry-source-files/overview.md)
- [Mindustry / Arc Full Source Knowledge Index Plan](../mindustry-source-index/overview.md)
