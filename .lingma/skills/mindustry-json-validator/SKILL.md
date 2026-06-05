---
name: mindustry-json-validator
description: Validate Mindustry JSON content definitions (blocks, units, items, liquids, status effects, weather, planets, sectors) against ContentParser.java v8 rules. Use when the user has a JSON file for a Mindustry mod and wants to check for errors, warnings, type mismatches, unknown fields, invalid consume types, or syntax issues before loading in-game.
---

# Mindustry JSON Validator

Validate mod JSON content files against ContentParser.java v8 logic. Outputs `[ERROR]` and `[WARN]` messages matching the original game parser format.

## Usage

```bash
python3 scripts/validator.py <file.json> [options]
```

### Options

| Flag | Description |
|------|-------------|
| `--type TYPE` | Force content type: `block`, `unit`, `item`, `liquid`, `status`, `weather`, `planet`, `sector`, `team` |
| `-m NAME` | Mod name prefix (default: auto-detect from path) |
| `--check` | Validate only, exit code 0/1 |

### Auto-detection

Content type is inferred from file path:
- `blocks/*.json` → block
- `units/*.json` → unit
- `items/*.json` → item
- `liquids/*.json` → liquid
- `statuseffects/*.json` → status
- `weather/*.json` → weather
- `planets/*.json` → planet
- `sectors/*.json` → sector
- `teams/*.json` → team

### Stdin

```bash
echo '{"type":"duo"}' | python3 scripts/validator.py - --type unit
```

## What it checks

- JSON syntax (with `#` char cleanup matching ContentParser)
- `type` resolution via ClassMap (267 entries matching ContentParser.java v8)
- Unknown field warnings per resolved class
- Field type validation (int, float, string, bool, Color, Sound, Effect, ItemStack[])
- Color format (hex string, not number)
- `consumes` block: invalid consumer types, sub-field validation
- Unit `type` enum (flying/mech/legs/naval/payload/missile/tank/hover/tether/crawl)
- AI controller string validation
- SectorPreset `sector` required, `rules` must be object
- Planet/CloudMesh must be object or array
- Research tree structure
- BulletType, Weapon, Ability, DrawPart sub-object recursion

## Limitations

- No runtime content database — cannot check re-declaration against existing content
- `@Nullable` field null checks require object instances (not possible statically)
- `readFields` reflection-based field discovery is replaced with static dictionaries
- `research` full TechTree resolution not simulated
- `consumes` sub-field deep validation is shallow (no full ConsumeXxx deserialization)

## Exit codes

- 0: no errors (warnings are OK)
- 1: one or more errors found
