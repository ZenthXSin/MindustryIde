# Eve-aic 维护日志

> 由 AIC-EVE-001 维护的 `Eve.aic` 分支工作记录。  
> 每次操作后自动追加，用于跨会话持久化记忆此项目。

---

## 基本信息

- **仓库**: [ZenthXSin/MindustryIde](https://github.com/ZenthXSin/MindustryIde)
- **维护分支**: `Eve.aic`（基于 `master`，由 Eve 持续维护）
- **本地路径**: `/home/zenxsin/cow/MindustryIde`
- **创建日期**: 2026-05-02
- **项目类型**: Android App — Mindustry Mod 编辑器
- **技术栈**: Kotlin / Jetpack Compose / Material 3 / Mindustry v157.4
- **维护者**: zxs（主人）、鱼雷（协作者）

---

## 操作日志

### 2026-05-02

**[初始化] 创建 `Eve.aic` 分支**
- 从 `alpha` 分支创建本地 `Eve.aic` 分支（sha: `d9f7647`）
- 遇到 PAT 403 问题，提示主人调整 fine-grained token 的 Contents: Read and write 权限
- 主人授权后推送成功，远程分支 `origin/Eve.aic` 已创建

**[同步] 拉取 master 最新内容**
- `git fetch origin master && git merge origin/master --no-edit`
- Fast-forward 到 `a4719a2`（+557/-210 行，9 个文件）
- 关键变更：新增 `AndroidLog.kt`、`MainActivity.kt` 重构、`Vars.kt` 扩展、解析器优化、测试扩充

**[审计] 项目概览**
- 14 个 .kt 源文件，共 2145 行
- 核心功能：`DetectingContentParser`（内容类型检测解析）、`JsonParser`
- 大量原版 Mindustry sprite 资源（turrets、units、walls、effects、items、statuses、UI）
- `config/out/types/` 预解析类型 JSON（ExplosionEffect、Ability、Drill 等）

---

## 待办 / 计划

- [ ] 深入阅读核心代码（DetectingContentParser、JsonParser、Vars、MainActivity）理解当前架构
- [ ] 待主人指示下一步开发方向

---

## 备注

- PAT 权限已修复（fine-grained token，Contents: Read and write，覆盖 MindustryIde 仓库）
- 推送命令需在 merge 后手动执行：`cd /home/zenxsin/cow/MindustryIde && git push`
