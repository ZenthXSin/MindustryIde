#!/usr/bin/env python3
"""Example entrypoint for the mindustry-api-parser skill.

This file exists as a bundled script example for parsing Mindustry-style API JSON.
Replace or extend it with a real CLI entrypoint as needed.
"""

from pathlib import Path


def main() -> None:
    print("mindustry-api-parser example script")
    print(f"cwd: {Path.cwd()}")


if __name__ == "__main__":
    main()
