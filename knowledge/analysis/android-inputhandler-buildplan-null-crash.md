# 安卓端 InputHandler BuildPlan 空值崩溃

## 结论

在 `mindustry.input.InputHandler.update` 中，原版会把 `player.unit().plans` 全量插入 `playerPlanTree`：

```java
player.unit().plans.each(playerPlanTree::insert);
```

源码路径：`源码和示例/Mindustry/core/src/mindustry/input/InputHandler.java`

而 `arc.math.geom.QuadTree.insert` 会立刻调用：

```java
hitbox(obj);
```

若 `obj == null`，则在 `arc.math.geom.QuadTree.hitbox` / `insert` 路径触发空指针。

源码路径：`源码和示例/Arc/arc-core/src/arc/math/geom/QuadTree.java`

本次崩溃栈：
- `mindustry.input.InputHandler.update`
- `mindustry.input.MobileInput.update`
- `arc.math.geom.QuadTree.insert`
- `arc.math.geom.QuadTree.hitbox`

这说明**移动端本地玩家当前控制单位的 `plans` 队列中混入了 `null BuildPlan`**。

## 为什么电脑不炸、手机炸

桌面端走 `mindustry.input.DesktopInput.update`，手机端走 `mindustry.input.MobileInput.update`。两者都继承 `InputHandler.update`，但移动端更容易在触屏建造、切单位、同步恢复建造队列时触发这一段。

所以差异不是 `QuadTree` 本身，而是**安卓端更容易进入这条带有坏数据的输入更新路径**。

## 修复原则

1. 任何 `TypeIO.readRequest(read)` 结果入队前先判空。
2. 任何 `addBuild(BuildPlan place)` / `addBuild(BuildPlan place, boolean tail)` 先判空。
3. 任何遍历 `plans` 的地方在使用 `plan.x` / `plan.block` / `plan.hitbox()` 前先过滤空值。
4. 若有自定义单位/控制器持久化了 `plans`，读档后立即清洗一次队列。

## 最小补丁模板

```java
BuildPlan plan = TypeIO.readRequest(read);
if(plan != null){
    plans.add(plan);
}
```

```java
public void addBuild(BuildPlan place){
    if(place == null) return;
    addBuild(place, false);
}
```

```java
public void addBuild(BuildPlan place, boolean tail){
    if(place == null) return;
    // 原有逻辑
}
```

```java
for(Iterator<BuildPlan> it = plans.iterator(); it.hasNext(); ){
    if(it.next() == null) it.remove();
}
```

## 证据来源

- 崩溃日志：`/home/zenxsin/cow/tmp/qq_ROBOT1.0_wKAl1yczX9TcIhoWVk4CuwsgrTwln-mT1uWKnGioRl4zig5gLqsthGhU-L026Q-5WzJZCRV8Pxkdec5VktuZ6Ajlj6H3wBCAbx3PilKrAso!_crash_1771079544003.txt`
- 原版源码：`源码和示例/Mindustry/core/src/mindustry/input/InputHandler.java`
- Arc 源码：`源码和示例/Arc/arc-core/src/arc/math/geom/QuadTree.java`
