# Memory Cleanup Policy

> Source: conversation with the user on 2026-04-26

## Goal

Keep `MEMORY.md` focused on **big-picture directions** and **normalized rules** only. Move detailed notes, examples, and topic-specific facts into the knowledge base.

## What stays in MEMORY.md

- Stable user preferences that affect how responses should be delivered
- High-level working principles
- Normalized execution rules
- Durable defaults that should apply across many tasks

## What should move to knowledge

- Topic-specific implementation details
- Repeated factual notes that belong to a subject page
- Workarounds, examples, and case studies
- Conversation outcomes with reusable structure
- Any content better organized by topic or entity

## Transfer rule

If a memory entry can be written as a reusable note, concept, analysis, or entity page, move it to `knowledge/` and keep only the general rule in `MEMORY.md`.

## Related

- [Persistent Memory Policy](persistent-memory-policy.md) — broader rule for long-term memory content
- [Mindustry JSON 技能约定](mindustry-json-skill-rules.md) — example of a normalized domain rule that belongs in memory
