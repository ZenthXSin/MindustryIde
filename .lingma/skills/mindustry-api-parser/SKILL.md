---
name: mindustry-api-parser
description: Mindustry API JSON parsing and query skill. Use when the user asks to parse, inspect, search, summarize, or index Mindustry API/module JSON data, especially when the workflow depends on the bundled api_parser.py script. Also use when the user asks about Mindustry JSON mod data, JSON-defined blocks, content JSON structure, block consumes in JSON, or how to inspect and understand Mindustry mod JSON files. Also use when the user asks about any JSON-related question in this workspace, because the presence of "json" is enough to trigger this skill.
---

# Mindustry Api Parser

## Overview

Use this skill to analyze Mindustry API JSON data with the bundled parser script. It supports module lookup, API lookup, fuzzy search, relationship inspection, and template generation.

## Workflow

1. Locate the JSON data file to inspect.
2. Run the bundled parser script or import its `ApiParser` class.
3. Query by module name, API key, keyword, or fuzzy match.
4. When needed, generate a JSON template for a module via `module_eg`.
5. Summarize results in a mod-friendly way: focus on compile-safe, game-usable implementation impact.

## Core Usage

### Script location
- `scripts/api_parser.py` — the canonical parser implementation for this skill.
- Keep the script deterministic and console-friendly.

### Data model
The parser expects JSON with:
- top-level `apis` array
- each module containing:
  - `name`
  - optional `chineseName`
  - optional `type`
  - optional `description`
  - optional `detail`
  - optional `add` — string or list of related module names (used to build relationships)
  - nested `apis` array
- each API containing:
  - `name`
  - optional `addName` — the actual key used for API index (falls back to `name`)
  - optional `chineseName`
  - optional `type` — value type, can reference a module name to create cross-links
  - optional `description`
  - optional `detail`
  - optional `eg` — example values (list of strings)

### Index & relationship building
The parser builds two indexes on init:
- **module_index**: keyed by `module.name`
- **api_index**: keyed by `api.addName` (or `api.name` if addName absent)

Relationships (`about` field) are resolved in two ways:
- Module `add` field: string substring match or list exact match against other module names
- API `type` field: if the type value matches a module name, cross-links are created between the API's parent module and the referenced module

### Parser methods
- `find(key)` — unified entry: tries module_index → api_index → fuzzy_search
- `find_module(module_name)` — exact module lookup, prints APIs and related modules
- `find_api(api_key)` — exact API lookup by addName, prints type/description/example/related modules
- `fuzzy_search(keyword)` — regex search across name/chineseName/description/detail for both modules and APIs
- `get_module_list()` — returns list of `{name, chineseName, description}` dicts
- `get_module_eg(module_key)` — generates a JSON template for the full module (all APIs with example values and type annotations)
- `to_json(json_str)` — pretty-print a JSON string

## CLI usage

```bash
python api_parser.py query <key>        # find(key): module → api → fuzzy
python api_parser.py list_modules       # get_module_list() as JSON
python api_parser.py module_eg <name>   # generate JSON template for a module
```

If no JSON path is given, the script looks for `t.json` beside itself, then in the parent directory.

## Query interpretation

When a user asks about a JSON **类 / 模块 / 接口 / type**:
- treat these words as the same kind of target when they refer to a JSON definition container
- prefer the parser's module lookup first
- if exact lookup fails, use fuzzy search
- if the request asks for "有什么接口" or "对应接口", return the nested APIs and their meanings
- if the request asks for "生成模板", use `module_eg` to synthesize a JSON template

## Block 的工作消耗（JSON）

Mindustry 的 JSON 解析不是用单一字段 `workingConsumption`，而是通过 `consumes` 对象定义方块的工作消耗。解析入口在 `ContentParser.readBlockConsumers(Block block, JsonValue value)`，然后在 block JSON 里读取 `consumes`。

### 常见写法
```json
{
  "type": "GenericCrafter",
  "name": "example-crafter",
  "consumes": {
    "item": {
      "items": ["copper/1"]
    },
    "power": 1.5
  }
}
```

### 说明
- `consumes.item`：消耗物品
- `consumes.liquid`：消耗液体
- `consumes.power`：消耗电力
- `consumes.coolant`：冷却剂/特定液体类消耗
- 具体支持项取决于 block 类型和解析器实现

### 工作消耗的判断
如果你说的"工作消耗"是指**方块在运作时要消耗什么**，应该写在 `consumes` 下，而不是独立定义一个字段。

### 可编译方向建议
- 优先复用已有 block 类型支持的 consume 结构
- 不要自己造未知字段，JSON 解析会丢弃或忽略
- 如果你要做自定义工作逻辑，通常要在 Java/Kotlin 的 block class 里配合 `consume(...)` / `consumePower(...)` / `consumeItem(...)` 之类的 API 实现

## Retrieval Priority

When a user asks a JSON-related question:
1. Check the JSON knowledge pages first.
2. If the knowledge base has no matching content, inspect the 饱和火力 mod JSON files.
3. If the mod JSON files still don't cover it, inspect the source code.
4. Write the newly learned interface, type, or template back into the knowledge base.
5. Update persistent memory with the useful rule or decision.

## Resources

- `scripts/api_parser.py` — the actual parser implementation (294 lines)
- `t.json` — bundled sample JSON data used by the CLI fallback
