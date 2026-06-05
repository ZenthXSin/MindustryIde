---
title: HTML 转图片成功发送流程
summary: 记录一次从 HTML 生成长图、渲染截图并通过 send 成功发送的完整流程，包含环境排查、浏览器回退与原文同步。
---

# HTML 转图片成功发送流程

## 适用场景
当用户要求将回复以图片形式发送，并且希望保留排版、代码高亮、长文本结构时，可使用 HTML 渲染为图片的方式完成输出。

## 本次成功流程
1. 先生成 HTML 内容页，使用暗色卡片风格、固定宽度布局、内联 CSS。
2. 尝试使用 Selenium + Chrome driver 渲染，但 driver 自动获取失败。
3. 排查本地可用浏览器，确认存在 `/snap/bin/chromium`。
4. 使用 Chromium headless 直接对本地 HTML 文件截图，成功生成 PNG。
5. 通过 `send` 工具将 PNG 发给用户。
6. 额外生成对应的 `.txt` 原文，满足“图片 + 原文”保留要求。

## 关键实现点
- HTML 需自包含，避免依赖外部资源。
- 渲染前可先检查本地浏览器路径。
- Chromium headless 可作为可靠回退方案。
- 若内容含代码，应在 HTML 中对关键词做高亮处理。
- 图片发送后，最好同步保留文本原稿，便于复用。

## 经验总结
- Selenium 的自动 driver 获取可能受网络影响，不适合作为唯一方案。
- 本地 Chromium headless 在工作区环境中更稳定。
- 长文本输出采用 HTML 长图比纯文本更适合保留排版。

## 相关内容
- [消息输出规则](message-output-rules.md)
- [HTML Text Image Generator Skill](../skills/html-text-image-generator/SKILL.md)
