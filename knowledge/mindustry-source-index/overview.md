# Mindustry / Arc Full Source Knowledge Index Plan

> Source: 本地源码仓库 `源码和示例/Mindustry` 与 `源码和示例/Arc`，自动索引生成于 2026-05-10

## 结论

用户要求“以源码每个文件为一个知识点完整理解并写入知识库，知识库内容带完整源代码，索引完整”。实际扫描结果显示：

- `mindustry`: 1130 indexed files, 13289964 bytes source text.
- `arc`: 638 indexed files, 4288935 bytes source text.

这可以做“完整文件级索引”，但不应把每个文件的完整源代码复制进 Markdown 知识库：

- 会把知识库变成源码镜像，重复占用空间。
- Markdown 页面会过大，检索质量下降。
- 源码已在本地仓库中，知识页应引用本地路径并记录 hash，保证可追溯。
- 真正需要的是“文件级知识点 + 摘要 + 源码路径 + hash + 反向索引”。

## 已生成索引

- [Mindustry Source File Index](mindustry-file-index.md) — Mindustry 文件级索引。
- [Arc Source File Index](arc-file-index.md) — Arc 文件级索引。
- `manifest.json` — 机器可读索引，包含 repo、file、size、hash、摘要。

## 推荐后续落库策略

1. 保留文件级索引页，做到每个文件可定位。
2. 按包/模块生成理解页，例如 `mindustry.world.blocks.*`、`mindustry.mod.*`、`arc.graphics.*`。
3. 对关键文件单独建页，记录职责、主要字段、方法入口和 Mod 开发相关点。
4. 需要完整源码时读取本地仓库原文件，不在知识库复制全文。

## Related

- [Mindustry & Arc 源码位置](../mindustry/source-code-locations.md)
- [Mindustry Project Structure](../mindustry/project-structure.md)
