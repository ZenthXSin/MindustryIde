# Mindustry JS 在 `updateTile` 中修改 `absorbLasers`

> Source: Conversation with user; based on Mindustry source code (`mindustry.world.Block`, `mindustry.entities.comp.BuildingComp`, `mindustry.content.Blocks`, `mindustry.entities.Damage`).

在 Mindustry 里，`absorbLasers` 是 **`Block` 的字段**，而不是建筑实例独有状态：

- `mindustry.world.Block.absorbLasers`：方块配置字段
- `mindustry.entities.comp.BuildingComp.absorbLasers()`：建筑实例读取 `block.absorbLasers`

因此在 `updateTile` 里“修改 `absorbLasers`”时，本质上是修改当前建筑对应的 **`block` 配置**：

```js
this.block.absorbLasers = true;
```

## 关键点

- `this` 通常指当前 `Building`
- `this.block` 是对应的 `Block`
- 修改后会影响 **同一个 Block 的所有建筑实例**
- 如果只想影响单个建筑，不能直接改 `block.absorbLasers`，因为没有单独的实例字段

## JavaScript 写法示例

```js
updateTile(){
    // 例：满足条件时让该方块吸收激光
    this.block.absorbLasers = this.power.status > 0.5;
}
```

或者更明确一些：

```js
updateTile(){
    if(this.enabled && this.items.total() > 0){
        this.block.absorbLasers = true;
    }else{
        this.block.absorbLasers = false;
    }
}
```

## 注意事项

1. **这是共享状态**
   - 只要你改了 `this.block.absorbLasers`，同类方块都会一起变。

2. **不要频繁抖动修改**
   - 如果每帧在不同建筑间来回改，会导致全局行为混乱。

3. **更适合在 `load()` / `init()` 时设定**
   - 如果只是固定配置，最好在内容初始化阶段设置，而不是 `updateTile()`。

4. **如果你的目标是“局部效果”**
   - 应该改碰撞/判定逻辑，而不是直接改 `absorbLasers` 字段。

## 相关源码

- `core/src/mindustry/world/Block.java`
- `core/src/mindustry/entities/comp/BuildingComp.java`
- `core/src/mindustry/entities/Damage.java`
- `core/src/mindustry/content/Blocks.java`

## Related

- [Mindustry 模组里为什么倾向 public 字段而少用 Getter/Setter](../concepts/mindustry-public-fields-vs-getters-setters.md)
- [Mindustry JSON Mod 反序列化流程](../concepts/mindustry-json-mod-deserialization.md)
- [Mindustry Data Patch vs JSON Mod](../concepts/mindustry-data-patch-vs-json-mod.md)
