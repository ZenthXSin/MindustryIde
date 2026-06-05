# HTML 转图片回复与持久化记忆更新流程

> Source: conversation about using HTML-to-image replies and updating persistent memory / knowledge base

当用户要求“使用 html 转图片回复”且同时涉及持久化记忆与知识库更新时，可以按以下流程执行：

## Key Points

- 先读取并遵循 `html-text-image-generator` 技能，把回答整理为自包含 HTML，再渲染成长图发送。
- 若对话中形成了可复用的方法、偏好或约定，需要同步更新长期记忆（`MEMORY.md`）与当天记忆（`memory/YYYY-MM-DD.md`，如果适用）。
- 若形成的是结构化方法论或操作流程，应写入知识库，例如 `knowledge/concepts/` 下的新页面。
- 更新知识库后，必须同步维护 `knowledge/index.md`，并建议追加 `knowledge/log.md` 记录一次变更。
- 知识页应使用“主题 + 要点 + 相关链接”的结构，且只链接已存在页面。
- 该工作流适合沉淀“如何回复、如何渲染、如何持久化”的操作规范。

## Related

- [HTML Text Image Generator Skill](../skills/html-text-image-generator/SKILL.md) — 负责将文本渲染为图片的技能说明。
- [消息输出规则](../concepts/message-output-rules.md) — 输出偏好中关于 HTML、暗色风格与图片发送的规则。
- [Mindustry JSON 技能约定](../concepts/mindustry-json-skill-rules.md) — 示例性的技能优先级与查询约定。
- [Greeting Preference](../memory/greeting-preference.md) — 用户偏好与交互规则的记忆样例。
