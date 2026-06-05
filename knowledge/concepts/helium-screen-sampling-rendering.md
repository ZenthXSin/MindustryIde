# Helium 屏幕采样与着色器渲染

## 概要

Helium（`he`）的屏幕采样和着色器输出主要由 `ScreenSamplerJ`、`HeShaders` 和 `Blur` 这几块源码配合完成。它的核心思路不是直接“改屏幕像素”，而是先把世界/UI 绘制结果捕获到 `FrameBuffer`，再用 `Shader` 和 `Draw.blit()` 把处理后的纹理渲染回目标缓冲区或屏幕。

## 关键源码

- `src/main/kotlin/helium/graphics/ScreenSamplerJ.java`
- `src/main/kotlin/helium/graphics/HeShaders.kt`
- `src/main/kotlin/helium/graphics/Blur.kt`

## 核心流程

### 1. 采样阶段切分

`ScreenSamplerJ` 通过事件挂钩区分不同绘制阶段：

- `Trigger.draw`
- `Trigger.preDraw`
- `Trigger.postDraw`
- `Trigger.uiDrawBegin`
- `Trigger.uiDrawEnd`

它维护了多个缓冲区：

- `worldBuffer`
- `uiBuffer`
- `pixelatorBuffer`
- `currBuffer`

### 2. 把当前阶段画进 FrameBuffer

在世界阶段和 UI 阶段分别调用 `begin()` / `end()`：

- `beginWorld()`：开始记录世界层到 `worldBuffer`
- `endWorld()`：结束后把世界层回贴到屏幕
- `beginUI()`：开始记录 UI 层到 `uiBuffer`
- `endUI()`：结束后把 UI 层回贴到屏幕

### 3. 用 shader 绘制回屏幕

`ScreenSamplerJ.blit(Shader shader, int unit)` 会把当前采样 buffer 的纹理绑定到指定纹理单元，然后调用 `Draw.blit(shader)` 输出。

### 4. buffer 之间的拷贝

Helium 还会使用 `glBlitFramebuffer` 在缓冲区之间快速搬运画面，用于：

- 世界到 UI 的内容叠加
- 屏幕快照
- 中间态缓存

## 着色器加载方式

`HeShaders.load()` 里加载了一个典型屏幕空间 shader：

```kotlin
baseScreen = Shader(
  Core.files.internal("shaders/screenspace.vert"),
  internalShaderDir.child("dist_base.frag")
)
```

这说明 Helium 常见做法是：

- 复用 `screenspace.vert`
- 由 mod 自己提供 fragment shader

## 模糊渲染示例

`Blur.kt` 展示了一个典型多 pass 后处理流程：

1. 用 `FrameBuffer` 捕获内容到 `stencil`
2. 用 `pingpong1` / `pingpong2` 做往返模糊计算
3. 最后通过 `pingpong1.blit(baseShader)` 输出结果

这是一种标准的屏幕后处理 / ping-pong framebuffer 模式。

## 设计特点

- **分阶段采样**：世界和 UI 分开处理
- **GPU 级拷贝**：大量使用 `glBlitFramebuffer`
- **适合后处理**：如模糊、扭曲、distortion、叠层效果
- **依赖原版渲染流程**：对 trigger 顺序和 pixelate 逻辑比较敏感

## 相关概念

- [Mindustry 自定义 Shader 接入](mindustry-custom-shader.md)
- [Mindustry Rendering System](../mindustry/rendering-system.md)
- [Mindustry Java Mod Structure](../mindustry/java-mod-structure.md)

## 备注

Helium 这类问题的优先检索顺序应为：

1. 先看源码和示例
2. 没有对应再看 mods

这条规则适用于屏幕采样、shader 渲染和相关 UI/后处理问题。
