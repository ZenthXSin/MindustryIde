# VoidShield

## 项目路径

- **本地路径**: `/home/zenxsin/文档/Mindustry/VoidShield/`
- **备份路径**: `/home/zenxsin/下载/VoidShield/`（仅 assets+src，无 build 配置）
- **GitHub**: https://github.com/ZenthXSin/VoidShield (private)

## 概要

VoidShield 是用户本地 `mods/voidshield` 下的 Mindustry 模组项目，包含方块、能力、shader、渲染采样和科技树等内容。

## 关键入口

- `VoidShieldMod.kt`：模组主入口
- `content/VSBlocks.kt`：方块内容加载
- `world/shaders/TestShader.kt`：测试用屏幕采样与 shader 逻辑
- `shader/ScreenSampler.kt`：屏幕采样封装
- `shader/ShaderManage.kt`：shader 管理
- `shader/VSShaderLoader.kt`：shader 载入接口

## 结构特征

- 采用 Kotlin 编写
- 包含自定义 shader 文件：`assets/shaders/test.vert`、`assets/shaders/test.frag`
- 包含屏幕采样与 framebuffer 捕获逻辑
- 含有 `HeatBlock`、`TeleportAbility`、`DrawHeat` 等自定义实现

## 备注

后续回答 VoidShield 相关问题时，应优先从本地源码和示例中查找，再视需要参考 `mods` 中的实现细节。
