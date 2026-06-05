# Block 科技树的 JSON 定义方式

Mindustry 的 Block 科技树通常**不是写在 Block 自身的 JSON 里**，而是通过**独立的科技树定义**来挂接。核心思路是：

- 先定义 `block` 内容
- 再在科技树文件里创建节点
- 节点上引用该 block，并声明前置需求

## 典型结构

```json
{
  "type": "TechTreeNode",
  "name": "example-node",
  "block": "example-crafter",
  "requirements": [
    "copper/50",
    "lead/30"
  ],
  "children": [
    {
      "type": "TechTreeNode",
      "block": "example-upgrade",
      "requirements": ["graphite/40"]
    }
  ]
}
```

## 常见字段含义

- `block`：当前节点对应的方块内容名
- `requirements`：解锁这个节点所需的资源
- `children`：子节点数组
- `name`：节点名，通常用于调试或标识

## 关键理解

### 1. Block JSON 负责“内容本体”
例如 `GenericCrafter`、`Wall`、`Conveyor` 这类 block 的类型、参数、消耗、属性等。

### 2. 科技树 JSON 负责“解锁关系”
科技树决定：
- 谁解锁谁
- 需要什么资源
- 归属哪个父节点

### 3. 多数情况下，科技树不是 block 自带字段
如果你在 block JSON 里直接写 `techTree`，大概率不会被当成标准字段处理。通常要看你用的是：
- 原版内容加载链中的独立 tech tree 定义
- 还是 mod 里自己写的 Java/Kotlin 注册逻辑

## 节点解锁的实际流程

1. **科技树先被构建出来**
   - 游戏启动或内容加载时，`TechTree` 会把所有节点组织成一棵树。
   - 每个节点保存对应内容、父节点、子节点和需求信息。

2. **节点是否可解锁由条件判断**
   - 典型条件包括：
     - 父节点已解锁
     - 研究点/资源足够
     - 没有被内容条件阻断
   - UI 只是展示结果，真正判定在逻辑层。

3. **玩家点击解锁时执行支付和标记**
   - 游戏检查通过后，扣除需要的资源。
   - 然后把这个节点记为“已研究/已解锁”。

4. **解锁状态写入存档**
   - 这样读档后仍然保持已解锁状态。
   - 战役模式里通常还会和地图进度、核心研究进度关联。

5. **后续内容就变为可用**
   - 该节点对应的 block、单位、科研项等会在建造/生产/菜单中开放。

### 代码理解上的一句话

**科技树节点本身只是“内容 + 依赖 + 费用”的声明，真正的解锁是由研究状态系统在运行时判定并写入存档。**

## 如果你是做 JSON mod

一般做法是：

1. 先定义 block JSON
2. 再在对应的 tech tree JSON/脚本里引用它
3. 用已有的原版节点作为父节点挂上去

例如：

```json
{
  "parent": "production",
  "children": [
    {
      "block": "example-crafter",
      "requirements": ["copper/60"]
    }
  ]
}
```

> 这里 `parent` 是否可用，取决于你采用的具体加载器/数据格式；原版实现里更核心的是“构建节点树”而不是固定某一个单独 JSON 字段。

## 实际建议

如果你想让某个 block 出现在科技树里，最稳妥的路线是：

- **Java/Kotlin mod**：在 `TechTree` 构建阶段把节点挂进去
- **JSON 数据驱动**：确认你的加载器支持 tech tree 的独立 JSON 格式，再按它的 schema 写

## 一句话总结

**Block 的 JSON 管“这个方块是什么”，科技树 JSON 管“这个方块怎么解锁”。**

如果你愿意，我可以继续直接给你：
1. **原版 Java/Kotlin 里科技树注册的写法**
2. **一个可用于 JSON/mod 数据驱动的完整科技树样例**
3. **“某个 block 挂到原版节点下”的具体示例**
