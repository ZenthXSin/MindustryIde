# Extra-Utilities

- **仓库**: [guiYMOUR/mindustry-Extra-Utilities-mod](https://github.com/guiYMOUR/mindustry-Extra-Utilities-mod)
- **版本**: 1.2.3.2
- **作者**: guiY
- **语言**: Java（179 源文件，33,065 行）
- **类型**: Java mod（`ExtraUtilities.ExtraUtilitiesMod`）
- **minGameVersion**: 155
- **本地路径**: `源码和示例/mods/Extra-Utilities`

## 定位

"An extended mod for Mindustry"——guiY 的综合扩展 mod，覆盖方块、炮塔、单位、子弹、能力、AI、网络同步、UI 等几乎所有系统，是功能最为全面的 Mindustry mod 之一。

## 包结构

| 包 | 内容 |
|---|------|
| `content/` | 14 个内容定义类（Blocks, Items, BulletTypes, UnitTypes, Fx, StatusEffects, TechTree, Sounds, Planet, SectorPresets 等） |
| `worlds/blocks/` | 10 大类方块（distribution, effect, heat, liquid, logic, power, production, turret, unit, fireWork） |
| `worlds/drawer/` | 25 种自定义 DrawBlock 实现（彩虹、电弧、拖尾、弓形、棱镜等） |
| `worlds/entity/ability/` | 12 种单位能力（Battery, Boost, PcShieldArc, TerritoryField, boss, healthDisplay, propeller 等） |
| `worlds/entity/bullet/` | 25+ 种自定义子弹（BlackHole, ChainLightning, CtrlMissile, DeathLaser, ElectricStorm, PrismLaser 等） |
| `worlds/entity/weapon/` | 7 种自定义武器（Boost, ReRotPointDefense, TractorBeam, antiMissile, healCone 等） |
| `worlds/entity/animation/` | 动画系统（AnimationType, DeathAnimation） |
| `worlds/entity/unit/` | Boss 单位（bossEntity, bossType） |
| `worlds/consumers/` | 自定义消费者（BetterConsumeLiquidsDynamic, ConsumeLiquidDynamic） |
| `worlds/meta/` | 元数据（BufferItem, DirectionalItemBuffer, EUStat, TurretManager） |
| `worlds/forJS/` | JS 接口（shovel.java） |
| `ai/` | 3 种自定义 AI（DefenderHealAI, Firefighter, MinerPointAI） |
| `graphics/` | 渲染（MainRenderer, MainShader） |
| `ui/` | UI（EUI, DDItemsList, ItemDisplay, RogueLikeStart） |
| `input/` | 输入处理（EUAtLoad, EUInputHandler） |
| `net/` | 8 个网络同步包 |

## 特色系统

### 炮塔系统（20+ 种）
- MultiBulletTurret / MultiShootTurret: 多弹/多射
- Prism: 棱镜折射激光
- Fiammetta: 火焰炮塔
- LingSha / Penitent: 灵砂/忏悔者
- antiMissileTurret: 反导拦截
- BuffUpTurret / MendTurret: 增益/修复
- TowerDefence 子系统: CrystalTower, MineCell
- turret/wall/: Aparajito, Domain, ReleaseShieldWall

### 自定义 DrawBlock（25 种）
- DrawRainbow: 彩虹渐变
- DrawElectric: 电弧
- DrawTrail: 拖尾
- DrawBow/PartBow: 弓形旋转
- AimPart: 瞄准线
- ArbiterPart: 仲裁者
- DrawBall, DrawTri, DrawMk2, DrawRust, RunningLight 等

### 自定义子弹（25+ 种）
- BlackHoleBullet: 黑洞吸引
- ChainLightning/Fade: 链式闪电
- CtrlMissile: 逻辑可控导弹
- DeathLaser: 持续激光
- ElectricStorm: 区域电暴
- PrismLaser: 棱镜折射
- RainbowStorm: 彩虹风暴
- antiMissile: 反导拦截
- PercentDamage: 百分比伤害
- mixBoom: 混合爆炸
- liContinuousLaserBullet/liLaserBullet: 连续/脉冲激光

### 单位能力（12 种）
- BatteryAbility, BoostAbility, PcShieldArcAbility
- TerritoryFieldAbility（领域控制）
- bossUnitAbi（Boss 专属）
- healthDisplay（血量显示）
- propeller（螺旋桨视觉）
- DeathBullet（死亡爆炸）

### 网络同步（8 个包）
- CtrlMissileSyncPacket, DomainSyncPacket, ExplodeWallPacket
- ReleaseShieldWallBuildSyncPacket, MinerPointConfigCallPacket
- SetFloorOnlyPacket, MinerPointDroneSpawnedCallPacket

### 自定义 AI（3 种）
- DefenderHealAI: 防御+治疗
- Firefighter: 消防
- MinerPointAI: 自动矿机

### UI 扩展
- RogueLikeStart: Roguelike 开局选择
- DDItemsList / ItemDisplay / ItemImage: 物品展示

### 星球/战役
- TDPlanet, TDSectorPresets, EUTechTree

## 值得学习的模式
- 25 种自定义 DrawBlock 的丰富视觉效果
- 炮塔 + 墙体炮塔 + 塔防子系统的分类组织
- 25+ 种子弹类型的实现多样性
- 12 种单位能力的独立封装
- 8 个网络同步包的完整多人支持
- BetterConsumeLiquidsDynamic 动态液体消费者
- BufferItem/DirectionalItemBuffer 高级物品缓冲

## 参考
- [Extra-Utilities GitHub](https://github.com/guiYMOUR/mindustry-Extra-Utilities-mod)
- [README 中文版](https://github.com/guiYMOUR/mindustry-Extra-Utilities-mod/blob/master/README_cn.md)
