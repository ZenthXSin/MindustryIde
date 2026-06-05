# JS 基础语法

> Source: conversation

## Key Points

- JavaScript 用 `var`、`let`、`const` 声明变量。
- `let` 适合会变化的变量，`const` 适合不会重新赋值的变量。
- 常见数据类型：`number`、`string`、`boolean`、`null`、`undefined`、`object`、`symbol`、`bigint`。
- 常见控制结构：`if`、`switch`、`for`、`while`、`do...while`。
- 函数可以用函数声明、函数表达式、箭头函数三种常见方式写。
- 数组和对象是 JS 中最常用的复合数据结构。
- 模板字符串用反引号 `` ` ``，适合拼接文本。
- `===` 比较更推荐，避免类型自动转换带来的坑。
- 异步编程常见形式有 `Promise` 和 `async/await`。

## Basic Syntax

### 1. 变量

```js
let a = 1;
const b = 2;
var c = 3;
```

### 2. 类型

```js
let n = 10;
let s = "hello";
let ok = true;
let arr = [1, 2, 3];
let obj = { name: "cow" };
```

### 3. 条件判断

```js
if (n > 5) {
  console.log("big");
} else {
  console.log("small");
}
```

### 4. 循环

```js
for (let i = 0; i < 3; i++) {
  console.log(i);
}
```

### 5. 函数

```js
function add(a, b) {
  return a + b;
}

const mul = (a, b) => a * b;
```

## Mindustry JS Mod 注意事项

Mindustry 的 JS 引擎是 **Rhino**（非 V8），语法兼容到 **ES5**，部分 ES6+ 特性不可用：
- 可用：`let`、`const`、箭头函数、模板字符串、解构、`for...of`、`class`
- 不可用：`import`/`export`、`Map`/`Set`（用 `Object` 代替）、`async`/`await`、`Array.from()`、展 开运算符 `...`
- `this` 在 `extend` 回调中指向对应对象（如 `Blocks`、`Items`），写法要特别注意

## Related

- [Mindustry Java/Kotlin Loading](../mindustry/mod-java-kotlin-loading.md) — 若在 Mindustry JS 模组中使用 JS 语法，这里常会涉及 Rhino 兼容问题。
- [Mindustry JSON Mod 反序列化流程](../concepts/mindustry-json-mod-deserialization.md) — JS/JSON 与内容加载链路相关的背景知识。
- [Mindustry JS 常见问题](../concepts/mindustry-js-json-type-conflict.md) — JS 扩展 JSON 内容时 `type` 冲突等实际坑。
