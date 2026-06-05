# Mindustry & Arc 源码位置

> Source: 本地仓库整理；更新于 2026-05-01

本地保存的 Mindustry 游戏源码与 Arc 框架源码的路径、版本与用途说明。

## 位置总览

| 仓库 | 路径 | 类型 | 说明 |
|------|------|------|------|
| **Mindustry** | `源码和示例/Mindustry/` | Git 仓库（浅克隆） | 主游戏源码，与 GitHub 同步 |
| **Arc** | `源码和示例/Arc/` | Git 仓库（浅克隆） | Mindustry 底层游戏框架 |
| Mindustry（旧副本） | `github_sources/mindustry-v8/` | Git 仓库 | 另一份 Mindustry 源码副本 |

## 版本对照

| 仓库 | 最新提交 | 关键标识 |
|------|----------|----------|
| Mindustry | `d9cf2cf` | Fixed liquid floors under walls counting towards resource list |
| Arc | `0e5679d` | 与 Mindustry `gradle.properties` 中 `archash=0e5679dc9c` 匹配 |

## 目录结构

### `源码和示例/Mindustry/`

```
Mindustry/
├── core/src/mindustry/         # 核心游戏逻辑
│   ├── type/                   # 内容类型定义（Planet, UnitType, Block 等）
│   ├── world/                  # 世界系统
│   ├── entities/               # 实体组件系统
│   ├── mod/                    # Mod 加载与内容解析器
│   ├── content/                # 原版内容定义
│   ├── game/                   # 游戏规则、模式
│   ├── ui/                     # 界面系统
│   └── ...
├── annotations/src/            # 注解处理器（EntityIO 等）
├── server/                     # 服务端入口
├── desktop/                    # 桌面端入口
├── android/                    # Android 入口
├── ios/                        # iOS 入口
├── build.gradle
├── gradle.properties           # archash 指向 Arc 版本
└── settings.gradle
```

### `源码和示例/Arc/`

```
Arc/
├── arc-core/src/arc/           # 核心框架
│   ├── struct/                 # 数据结构（Seq, ObjectMap 等）
│   ├── util/                   # 工具类（Time, Timer, Log 等）
│   ├── graphics/               # 渲染/着色器/贴图
│   ├── audio/                  # 音频系统
│   ├── input/                  # 输入系统
│   ├── math/                   # 数学工具
│   └── util/serialization/     # JSON 序列化（Json.java）
├── backends/                   # 平台后端（SDL, GLFW 等）
├── extensions/                 # 扩展模块（packer, profiling 等）
└── natives/                    # 平台原生库
```

## 更新方式

```bash
# 更新 Mindustry
cd 源码和示例/Mindustry && git pull

# 更新 Arc
cd 源码和示例/Arc && git pull

# 若使用代理（推荐 SOCKS5）
git -c http.proxy=socks5://127.0.0.1:7897 -c https.proxy=socks5://127.0.0.1:7897 pull
```

⚠️ 更新 Mindustry 后，检查 `gradle.properties` 中的 `archash` 是否变化，如有变化需同步更新 Arc。

## 相关

- [Mindustry Project Structure](project-structure.md) — Mindustry 项目结构总览
- [MDT / Mindustry 源码优先规则](../concepts/mdt-mindustry-source-first-rule.md) — 源码查找优先级规则
