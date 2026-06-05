# OpenAI image2 生成脚本

> Source: conversation + `skills/openai-image2-generator/SKILL.md`

为 `openai-image2-generator` 技能补全了一个可直接执行的脚本：`skills/openai-image2-generator/generate_image2.py`。

## 脚本作用

该脚本用于调用 OpenAI 图片生成接口，按 `image2` 工作流生成图片并保存到本地目录。

## 输入参数

- `prompt`：必填，图片提示词
- `--size`：可选，默认 `1024x1024`
- `--count`：可选，默认 `1`
- `--style`：可选，追加到 prompt 的风格描述
- `--output-dir`：可选，输出目录
- `--prefix`：可选，输出文件名前缀
- `--api-base`：可选，默认优先取 `OPENAI_API_BASE`，其次取 `OPENAI_BASE_URL`
- `--api-key`：可选，默认取 `OPENAI_API_KEY`
- `--response-format`：`b64_json` 或 `url`
- `--model`：默认 `image2`

## 实现要点

- 使用 Python 标准库实现，不额外依赖第三方包
- 通过 `POST /images/generations` 发起请求
- 支持返回 `b64_json` 时直接解码保存
- 支持返回 `url` 时下载图片保存
- 最终输出 JSON，包含保存后的文件路径列表

## 使用示例

```bash
python3 skills/openai-image2-generator/generate_image2.py \
  "a futuristic cat wearing a helmet" \
  --size 1024x1024 \
  --count 1
```

## 相关

- [HTML Text Image Generator Skill](../skills/html-text-image-generator/SKILL.md) — 回复转图片输出能力
