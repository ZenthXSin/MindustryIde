# Email Sender Skill

> Source: conversation-created skill in workspace

用于通过 SMTP 发送电子邮件的技能，适合需要让代理发送通知、报告、日志、附件或测试 SMTP 可达性的场景。

## Key Points

- 技能目录：`skills/email-sender/`
- 入口说明：`skills/email-sender/SKILL.md`
- 主发送脚本：`skills/email-sender/scripts/send_email.py`
- 自然语言解析脚本：`skills/email-sender/scripts/nl_email.py`
- 支持纯文本正文与 HTML 正文
- 支持 Markdown 文件转 HTML 邮件
- 支持多个收件人（逗号分隔）
- 支持 `Cc`、`Bcc`、`Reply-To`
- 支持多个附件（逗号分隔本地路径）
- 支持 `--dry-run`，可在不真正发送的情况下校验参数、附件和 SMTP 环境变量
- 内置 QQ 邮箱与 Gmail 的常用 SMTP 配置提示

## Required Environment Variables

- `SMTP_HOST`
- `SMTP_PORT`
- `SMTP_USER`
- `SMTP_PASS`
- `SMTP_FROM`（可选，默认等于 `SMTP_USER`）
- `SMTP_SSL`（可选）
- `SMTP_STARTTLS`（可选）

## Provider Notes

### QQ Mail

- 常用主机：`smtp.qq.com`
- 推荐端口：`465`
- 推荐：`SMTP_SSL=true`
- 密码应使用 QQ 邮箱 SMTP 授权码

### Gmail

- 常用主机：`smtp.gmail.com`
- 推荐端口：`465` + SSL 或 `587` + STARTTLS
- 密码应使用 Google App Password

## Usage Notes

- 465 端口通常走 SSL，587 端口通常走 STARTTLS，脚本会按端口给出默认值，也可用环境变量覆盖。
- 如果同时传入 `--body` 和 `--html`，脚本会发送 multipart alternative 邮件。
- 如果传入 `--markdown-file`，脚本会读取 Markdown 文件，同时生成纯文本与 HTML 内容。
- 附件必须是本地存在的文件，否则会直接报错。
- 建议使用邮箱的应用专用密码，而不是账号登录密码。
- `nl_email.py` 支持把“收件人/主题/正文/附件/抄送/密送”等半结构化文本解析成 JSON，便于后续自动补全发送参数。

## Related

- [Message Output Rules](../concepts/message-output-rules.md) — 与当前工作区的输出/技能组织习惯相关
