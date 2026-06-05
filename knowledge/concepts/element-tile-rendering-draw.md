# Element tile rendering draw pattern

> Source: Conversation — user request about overriding `arc.scene.Element.draw()` to render a custom `tiles` collection with Mindustry-style world visuals

## Key Points

- `arc.scene.Element.draw()` in `arc-core/src/arc/scene/Element.java` is UI-layer drawing; it does not imply world rendering by itself.
- `mindustry.world.Tiles` is an iterable tile container; it can be traversed independently of the live world map.
- `mindustry.graphics.BlockRenderer` shows the actual world rendering split into shadow, darkness, and block/light passes.
- `mindustry.ctype.UnlockableContent.loadIcon()` proves `fullIcon`/`uiIcon` are icon resources, not world-rendered visuals.
- If the goal is a non-conflicting preview, a UI-side tile pass is safer than trying to mirror the full world renderer inside `Element.draw()`.

## Recommended Pattern

1. Use `tiles` as the data source.
2. Convert each tile to element-local coordinates using `tileElementWidth` and `tileElementHeight`.
3. Render a simplified tile preview first.
4. Only attempt a world-faithful pass if you can fully control render order, fog, and framebuffer isolation.

## Related

- [Arc Draw 如何在屏幕上画东西](arc-draw-screen-rendering.md) — batch / shader / framebuffer basics behind drawing
- [Rendering System](../mindustry/rendering-system.md) — Mindustry world rendering overview
- [Block and Building System](../mindustry/block-building-system.md) — block/building draw behavior context
- [Mindustry World System](../mindustry/world-system.md) — tile/world data model context
