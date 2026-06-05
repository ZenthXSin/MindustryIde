# HTML 图片渲染失败：Chrome DevTools 未响应

## 结论
在 CowAgent 的最终回复图片链路中，`agent/protocol/agent_stream.py` 已经具备“将最终回复渲染成 HTML 再转 PNG 并发送”的逻辑；当前失败点不在触发条件，而在底层渲染脚本 `skills/html-text-image-generator/render_html_to_image.py` 依赖的 Chromium/Chrome DevTools 通信未成功建立。

## 现象
日志中会出现：

- `[Agent] Failed to render final response image: Chrome DevTools 未响应`

这表示脚本在轮询 `http://127.0.0.1:<port>/json/list` 时超时，未拿到可用的 DevTools 页面列表。

## 代码链路
### 1. 最终回复图片入口
`agent/protocol/agent_stream.py` 中的 `_render_final_response_image(rendered_html)` 会：

1. 写出临时 HTML 文件
2. 调用 `skills/html-text-image-generator/render_html_to_image.py`
3. 生成 PNG
4. 将 PNG 封装为 `file_to_send`

### 2. 渲染实现
`render_html_to_image.py` 的流程是：

- `_pick_browser()` 选择 chromium/chrome 类浏览器
- 通过 `--remote-debugging-port` 启动浏览器
- `_wait_pages()` 轮询 `/json/list`
- 连接 `webSocketDebuggerUrl`
- `Page.captureScreenshot` 输出 PNG

## 主要原因
1. **浏览器未正确启动**
   - 机器上可能没有可用的 chromium/google-chrome/chrome
   - 或启动参数与运行环境不兼容

2. **DevTools 接口启动过慢**
   - 脚本等待时间偏短
   - 浏览器尚未注册 `/json/list`

3. **浏览器进程/端口冲突**
   - 旧进程残留
   - 调试端口占用或异常退出

4. **运行环境缺少依赖**
   - 容器/系统库不足
   - 无法完成 headless 截图

## 建议修复
### 优先级 1：增强等待与重试
把 `_wait_pages()` 的等待时间和重试次数适当加大，避免浏览器启动稍慢就直接失败。

### 优先级 2：增加 fallback
当 Chromium DevTools 方式失败时，尝试其它截图实现，例如：
- Playwright
- 备用浏览器
- 最后降级为纯文本回复

### 优先级 3：确认本机浏览器可用
可检查：

```bash
which chromium-browser || which chromium || which google-chrome || which google-chrome-stable || which firefox
```

若使用 Playwright，则补装浏览器：

```bash
python3 -m playwright install chromium
```

## 相关文件
- `agent/protocol/agent_stream.py`
- `skills/html-text-image-generator/render_html_to_image.py`

## 备注
这不是“没有走图片回复逻辑”，而是“图片回复逻辑执行到截图环节时失败”。
