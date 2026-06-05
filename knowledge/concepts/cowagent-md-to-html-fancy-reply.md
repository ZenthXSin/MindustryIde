# CowAgent Markdown 转 HTML 富文本回复

## 结论

CowAgent 的最终长回复不应只是把纯文本包进 `<pre>`，而应先将 Markdown 渲染为富文本 HTML，再交给截图链路生成图片。这样可以保留：

- 标题层级与字号区别
- 粗体、斜体、行内代码
- 列表、引用、表格
- 代码块高亮
- 长文本的视觉层次

## 当前实现要点

### 1. 最终回复渲染链路

`agent/protocol/agent_stream.py` 中的 `_wrap_response_as_html()` 负责把最终回复转成可截图 HTML：

1. 导入 `tools.web_markdown_renderer.render_markdown`
2. 将 Markdown 转成 HTML
3. 套一层暗色卡片式 UI
4. 添加标题、正文、代码块、表格、引用样式
5. 把 HTML 交给 `skills/html-text-image-generator/render_html_to_image.py` 截图

### 2. Markdown 渲染器

`tools/web_markdown_renderer.py` 负责服务端 Markdown 渲染，核心特征：

- 使用 python-markdown 的 `extra` 扩展
- 支持 fenced code、tables 等常见 Markdown 语法
- 给链接统一加上 `target="_blank"` 和 `rel="noopener noreferrer"`
- 对视频链接做特殊替换
- 渲染失败时回退到换行转 `<br>`

### 3. 代码高亮

HTML 样式中已经补了 `hljs-*` 选择器，适配 highlight.js 风格的代码高亮类名。代码块会以深色背景显示，关键词、字符串、函数、数字、注释等都能有不同颜色。

## 适用场景

- 长篇文字回复自动转图
- 含 Markdown 结构的分析类回答
- 代码说明、配置说明、教程类回答

## 注意事项

- 如果输入本身不是 Markdown，渲染后仍会以普通段落显示
- 最终是否转图片仍由 `final_response` 的自动转图判定逻辑决定
- 若截图脚本失败，仍会保留文本兜底，避免消息丢失

## 相关页面

- [HTML 转图片成功发送流程](html-image-send-success-flow.md)
- [HTML 转图片脚本巡检（2026-04-24）](../analysis/html-to-image-script-inspection-2026-04-24.md)
- [消息输出规则](message-output-rules.md)
- [Mindustry 自定义 Shader 接入](mindustry-custom-shader.md)
