#!/usr/bin/env python3
"""
Mindustry JSON Content Validator
基于 ContentParser.java (v8) 的验证逻辑，模拟原版解析器行为。
输出 warn/error 格式与原版一致。

用法:
    python validator.py <file.json> [--type block|unit|item|liquid|status|sector|planet|weather|team]
    python validator.py --check <file.json>
    echo '{"type":"duo"}' | python validator.py - --type block
"""

import json
import sys
import os
import re
import argparse
from dataclasses import dataclass, field
from enum import Enum
from typing import Any, Optional

# ============================================================
# 源码中 ClassMap 的完整映射 (v8)
# ============================================================
CLASS_MAP = {
    # AI
    "AssemblerAI": "mindustry.ai.types",
    "BoostAI": "mindustry.ai.types",
    "BuilderAI": "mindustry.ai.types",
    "CargoAI": "mindustry.ai.types",
    "CommandAI": "mindustry.ai.types",
    "DefenderAI": "mindustry.ai.types",
    "FlyingAI": "mindustry.ai.types",
    "FlyingFollowAI": "mindustry.ai.types",
    "GroundAI": "mindustry.ai.types",
    "HugAI": "mindustry.ai.types",
    "LogicAI": "mindustry.ai.types",
    "MinerAI": "mindustry.ai.types",
    "MissileAI": "mindustry.ai.types",
    "PrebuildAI": "mindustry.ai.types",
    "RepairAI": "mindustry.ai.types",
    "SuicideAI": "mindustry.ai.types",
    # Abilities
    "Ability": "mindustry.entities.abilities",
    "ArmorPlateAbility": "mindustry.entities.abilities",
    "EnergyFieldAbility": "mindustry.entities.abilities",
    "ForceFieldAbility": "mindustry.entities.abilities",
    "LiquidExplodeAbility": "mindustry.entities.abilities",
    "LiquidRegenAbility": "mindustry.entities.abilities",
    "MoveEffectAbility": "mindustry.entities.abilities",
    "MoveLightningAbility": "mindustry.entities.abilities",
    "RegenAbility": "mindustry.entities.abilities",
    "RepairFieldAbility": "mindustry.entities.abilities",
    "ShieldArcAbility": "mindustry.entities.abilities",
    "ShieldRegenFieldAbility": "mindustry.entities.abilities",
    "SpawnDeathAbility": "mindustry.entities.abilities",
    "StatusFieldAbility": "mindustry.entities.abilities",
    "SuppressionFieldAbility": "mindustry.entities.abilities",
    "UnitSpawnAbility": "mindustry.entities.abilities",
    # BulletTypes
    "ArtilleryBulletType": "mindustry.entities.bullet",
    "BasicBulletType": "mindustry.entities.bullet",
    "BombBulletType": "mindustry.entities.bullet",
    "BulletType": "mindustry.entities.bullet",
    "ContinuousBulletType": "mindustry.entities.bullet",
    "ContinuousFlameBulletType": "mindustry.entities.bullet",
    "ContinuousLaserBulletType": "mindustry.entities.bullet",
    "EmpBulletType": "mindustry.entities.bullet",
    "EmptyBulletType": "mindustry.entities.bullet",
    "ExplosionBulletType": "mindustry.entities.bullet",
    "FireBulletType": "mindustry.entities.bullet",
    "FlakBulletType": "mindustry.entities.bullet",
    "InterceptorBulletType": "mindustry.entities.bullet",
    "LaserBoltBulletType": "mindustry.entities.bullet",
    "LaserBulletType": "mindustry.entities.bullet",
    "LightningBulletType": "mindustry.entities.bullet",
    "LiquidBulletType": "mindustry.entities.bullet",
    "MassDriverBolt": "mindustry.entities.bullet",
    "MissileBulletType": "mindustry.entities.bullet",
    "MultiBulletType": "mindustry.entities.bullet",
    "PointBulletType": "mindustry.entities.bullet",
    "PointLaserBulletType": "mindustry.entities.bullet",
    "RailBulletType": "mindustry.entities.bullet",
    "SapBulletType": "mindustry.entities.bullet",
    "ShrapnelBulletType": "mindustry.entities.bullet",
    "SpaceLiquidBulletType": "mindustry.entities.bullet",
    # Effects
    "ExplosionEffect": "mindustry.entities.effect",
    "MultiEffect": "mindustry.entities.effect",
    "ParticleEffect": "mindustry.entities.effect",
    "RadialEffect": "mindustry.entities.effect",
    "SeqEffect": "mindustry.entities.effect",
    "SoundEffect": "mindustry.entities.effect",
    "WaveEffect": "mindustry.entities.effect",
    "WrapEffect": "mindustry.entities.effect",
    # DrawParts
    "DrawPart": "mindustry.entities.part",
    "EffectSpawnerPart": "mindustry.entities.part",
    "FlarePart": "mindustry.entities.part",
    "HaloPart": "mindustry.entities.part",
    "HoverPart": "mindustry.entities.part",
    "RegionPart": "mindustry.entities.part",
    "ShapePart": "mindustry.entities.part",
    # ShootPatterns
    "ShootAlternate": "mindustry.entities.pattern",
    "ShootBarrel": "mindustry.entities.pattern",
    "ShootHelix": "mindustry.entities.pattern",
    "ShootMulti": "mindustry.entities.pattern",
    "ShootPattern": "mindustry.entities.pattern",
    "ShootSine": "mindustry.entities.pattern",
    "ShootSpread": "mindustry.entities.pattern",
    "ShootSummon": "mindustry.entities.pattern",
    # Objectives
    "Objective": "mindustry.game.Objectives",
    "OnPlanet": "mindustry.game.Objectives",
    "OnSector": "mindustry.game.Objectives",
    "Produce": "mindustry.game.Objectives",
    "Research": "mindustry.game.Objectives",
    "SectorComplete": "mindustry.game.Objectives",
    # Types
    "Category": "mindustry.type",
    "CellLiquid": "mindustry.type",
    "ErrorContent": "mindustry.type",
    "Item": "mindustry.type",
    "ItemStack": "mindustry.type",
    "Liquid": "mindustry.type",
    "LiquidStack": "mindustry.type",
    "PayloadStack": "mindustry.type",
    "Planet": "mindustry.type",
    "SectorPreset": "mindustry.type",
    "StatusEffect": "mindustry.type",
    "TeamEntry": "mindustry.type",
    "UnitType": "mindustry.type",
    "UnitEngine": "mindustry.type",
    "Weapon": "mindustry.type",
    "Weather": "mindustry.type",
    "ErekirUnitType": "mindustry.type.unit",
    "MissileUnitType": "mindustry.type.unit",
    "NeoplasmUnitType": "mindustry.type.unit",
    "TankUnitType": "mindustry.type.unit",
    "BuildWeapon": "mindustry.type.weapons",
    "MineWeapon": "mindustry.type.weapons",
    "PointDefenseBulletWeapon": "mindustry.type.weapons",
    "PointDefenseWeapon": "mindustry.type.weapons",
    "RepairBeamWeapon": "mindustry.type.weapons",
    "MagneticStorm": "mindustry.type.weather",
    "ParticleWeather": "mindustry.type.weather",
    "RainWeather": "mindustry.type.weather",
    "SolarFlare": "mindustry.type.weather",
    # World/Blocks
    "Autotiler": "mindustry.world.blocks",
    "Attributes": "mindustry.world.blocks",
    "SliceMode": "mindustry.world.blocks",
    "ExplosionShield": "mindustry.world.blocks",
    "LaunchAnimator": "mindustry.world.blocks",
    "RotBlock": "mindustry.world.blocks",
    "TileBitmask": "mindustry.world.blocks",
    "UnitTetherBlock": "mindustry.world.blocks",
    "Accelerator": "mindustry.world.blocks.campaign",
    "LandingPad": "mindustry.world.blocks.campaign",
    "LaunchPad": "mindustry.world.blocks.campaign",
    "AutoDoor": "mindustry.world.blocks.defense",
    "BaseShield": "mindustry.world.blocks.defense",
    "BuildTurret": "mindustry.world.blocks.defense",
    "DirectionalForceProjector": "mindustry.world.blocks.defense",
    "Door": "mindustry.world.blocks.defense",
    "ForceProjector": "mindustry.world.blocks.defense",
    "MendProjector": "mindustry.world.blocks.defense",
    "OverdriveProjector": "mindustry.world.blocks.defense",
    "Radar": "mindustry.world.blocks.defense",
    "RegenProjector": "mindustry.world.blocks.defense",
    "ShieldWall": "mindustry.world.blocks.defense",
    "ShockMine": "mindustry.world.blocks.defense",
    "ShockwaveTower": "mindustry.world.blocks.defense",
    "Thruster": "mindustry.world.blocks.defense",
    "Wall": "mindustry.world.blocks.defense",
    "BaseTurret": "mindustry.world.blocks.defense.turrets",
    "ContinuousLiquidTurret": "mindustry.world.blocks.defense.turrets",
    "ContinuousTurret": "mindustry.world.blocks.defense.turrets",
    "ItemTurret": "mindustry.world.blocks.defense.turrets",
    "LaserTurret": "mindustry.world.blocks.defense.turrets",
    "LiquidTurret": "mindustry.world.blocks.defense.turrets",
    "PayloadAmmoTurret": "mindustry.world.blocks.defense.turrets",
    "PointDefenseTurret": "mindustry.world.blocks.defense.turrets",
    "PowerTurret": "mindustry.world.blocks.defense.turrets",
    "ReloadTurret": "mindustry.world.blocks.defense.turrets",
    "TractorBeamTurret": "mindustry.world.blocks.defense.turrets",
    "Turret": "mindustry.world.blocks.defense.turrets",
    "ArmoredConveyor": "mindustry.world.blocks.distribution",
    "BufferedItemBridge": "mindustry.world.blocks.distribution",
    "ChainedBuilding": "mindustry.world.blocks.distribution",
    "Conveyor": "mindustry.world.blocks.distribution",
    "DirectionBridge": "mindustry.world.blocks.distribution",
    "Duct": "mindustry.world.blocks.distribution",
    "DuctBridge": "mindustry.world.blocks.distribution",
    "DuctRouter": "mindustry.world.blocks.distribution",
    "ExtendingItemBridge": "mindustry.world.blocks.distribution",
    "ItemBridge": "mindustry.world.blocks.distribution",
    "ItemRouter": "mindustry.world.blocks.distribution",
    "StackConveyor": "mindustry.world.blocks.distribution",
    "StackRouter": "mindustry.world.blocks.distribution",
    "Teleporter": "mindustry.world.blocks.distribution",
    "TransportBridge": "mindustry.world.blocks.distribution",
    "OverflowGate": "mindustry.world.blocks.distribution",
    "UnderflowGate": "mindustry.world.blocks.distribution",
    "Sorter": "mindustry.world.blocks.distribution",
    "Router": "mindustry.world.blocks.distribution",
    "MassDriver": "mindustry.world.blocks.distribution",
    "PayloadMassDriver": "mindustry.world.blocks.distribution",
    "Conflator": "mindustry.world.blocks.distribution",
    "LightBlock": "mindustry.world.blocks",
    "CoreBlock": "mindustry.world.blocks.storage",
    "StorageBlock": "mindustry.world.blocks.storage",
    "Unloader": "mindustry.world.blocks.storage",
    "Vault": "mindustry.world.blocks.storage",
    "Docker": "mindustry.world.blocks.storage",
    "Generator": "mindustry.world.blocks.power",
    "SolarGenerator": "mindustry.world.blocks.power",
    "BurnerGenerator": "mindustry.world.blocks.power",
    "ThermalGenerator": "mindustry.world.blocks.power",
    "ImpactReactor": "mindustry.world.blocks.power",
    "ThoriumReactor": "mindustry.world.blocks.power",
    "FusionReactor": "mindustry.world.blocks.power",
    "DieselGenerator": "mindustry.world.blocks.power",
    "RTGGenerator": "mindustry.world.blocks.power",
    "Battery": "mindustry.world.blocks.power",
    "PowerNode": "mindustry.world.blocks.power",
    "PowerTransmission": "mindustry.world.blocks.power",
    "ConsumeGenerator": "mindustry.world.blocks.power",
    "SolidFuelGenerator": "mindustry.world.blocks.power",
    "HeatGenerator": "mindustry.world.blocks.power",
    "AcidGenerator": "mindustry.world.blocks.power",
    "ItemCrafter": "mindustry.world.blocks.crafting",
    "GenericCrafter": "mindustry.world.blocks.crafting",
    "Separator": "mindustry.world.blocks.crafting",
    "PhaseWeaver": "mindustry.world.blocks.crafting",
    "Centrifuge": "mindustry.world.blocks.crafting",
    "Blender": "mindustry.world.blocks.crafting",
    "ConsumeHeater": "mindustry.world.blocks.crafting",
    "HeatCrafter": "mindustry.world.blocks.crafting",
    "LiquidsJoinder": "mindustry.world.blocks.crafting",
    "SolidFluidCrafter": "mindustry.world.blocks.crafting",
    "Cultivator": "mindustry.world.blocks.crafting",
    "PayloadCrafter": "mindustry.world.blocks.crafting",
    "PayloadLoader": "mindustry.world.blocks.payloads",
    "PayloadUnloader": "mindustry.world.blocks.payloads",
    "LaunchPod": "mindustry.world.blocks.payloads",
    "PayloadConveyor": "mindustry.world.blocks.payloads",
    "PayloadRouter": "mindustry.world.blocks.payloads",
    "PayloadStack": "mindustry.world.blocks.payloads",
    "PayloadBlock": "mindustry.world.blocks.payloads",
    "ConstructBlock": "mindustry.world.blocks",
    "UnitFactory": "mindustry.world.blocks.units",
    "Reconstructor": "mindustry.world.blocks.units",
    "RepairPoint": "mindustry.world.blocks.units",
    "ResupplyPoint": "mindustry.world.blocks.units",
    "UnitAssembler": "mindustry.world.blocks.units",
    "UnitAssemblerModule": "mindustry.world.blocks.units",
    "UnitRefabricator": "mindustry.world.blocks.units",
    "UnitMinDrone": "mindustry.world.blocks.units",
    "UnitCargoLoader": "mindustry.world.blocks.units",
    "UnitCargoUnloadPoint": "mindustry.world.blocks.units",
    "Drill": "mindustry.world.blocks.production",
    "BeamDrill": "mindustry.world.blocks.production",
    "GasExtractor": "mindustry.world.blocks.production",
    "Harvester": "mindustry.world.blocks.production",
    "Fracker": "mindustry.world.blocks.production",
    "SolidPump": "mindustry.world.blocks.production",
    "LiquidPump": "mindustry.world.blocks.production",
    "Pump": "mindustry.world.blocks.production",
    "Conveyor": "mindustry.world.blocks.distribution",
    "StackRouter": "mindustry.world.blocks.distribution",
    "PayloadMassDriver": "mindustry.world.blocks.distribution",
    "ConPower": "mindustry.world.blocks.power",
    "ConsumeLiquids": "mindustry.world.consumers",
    "ConsumeItem": "mindustry.world.consumers",
    "ConsumeItems": "mindustry.world.consumers",
    "ConsumeLiquid": "mindustry.world.consumers",
    "ConsumePower": "mindustry.world.consumers",
    "ConsumeCoolant": "mindustry.world.consumers",
    "DrawDefault": "mindustry.world.draw",
    "DrawMulti": "mindustry.world.draw",
    "DrawRegion": "mindustry.world.draw",
    "DrawGlow": "mindustry.world.draw",
    "DrawPackets": "mindustry.world.draw",
    "DrawHeat": "mindustry.world.draw",
    "DrawBlock": "mindustry.world.draw",
    "DrawFlame": "mindustry.world.draw",
    "DrawCrucibleFlame": "mindustry.world.draw",
    "DrawGlowRegion": "mindustry.world.draw",
    "DrawTeam": "mindustry.world.draw",
    "DrawItems": "mindustry.world.draw",
    "DrawLiquidRegion": "mindustry.world.draw",
    "DrawCustom": "mindustry.world.draw",
    "DrawShape": "mindustry.world.draw",
    "DrawBlur": "mindustry.world.draw",
    "DrawSpikes": "mindustry.world.draw",
    "DrawSoftShadow": "mindustry.world.draw",
    "DrawBubbles": "mindustry.world.draw",
    "DrawIcon": "mindustry.world.draw",
    "DrawRegionReplace": "mindustry.world.draw",
    "DrawRegionLight": "mindustry.world.draw",
    "DrawHover": "mindustry.world.draw",
    "DrawUnder": "mindustry.world.draw",
    "DrawBuildSelect": "mindustry.world.draw",
}

# ============================================================
# 原版静态字段白名单 (从源码提取)
# ============================================================

# Block 字段 (从 Block.java 提取)
BLOCK_FIELDS = {
    # 基本属性
    "hasItems": "bool", "hasLiquids": "bool", "hasPower": "bool",
    "outputsLiquid": "bool", "consumesPower": "bool", "outputsPower": "bool",
    "connectedPower": "bool", "conductivePower": "bool", "outputsPayload": "bool",
    "acceptsUnitPayloads": "bool", "acceptsPayload": "bool", "acceptsItems": "bool",
    "alwaysAllowDeposit": "bool", "depositCooldown": "float", "separateItemCapacity": "bool",
    "itemCapacity": "int", "liquidCapacity": "float", "liquidPressure": "float",
    "outputFacing": "bool", "noSideBlend": "bool", "displayFlow": "bool",
    "inEditor": "bool", "editorConfigurable": "bool",
    "saveConfig": "bool", "copyConfig": "bool", "clearOnDoubleTap": "bool",
    "update": "bool", "destructible": "bool", "unloadable": "bool",
    "isDuct": "bool", "allowResupply": "bool", "solid": "bool",
    "solidifes": "bool", "teamPassable": "bool", "underBullets": "bool",
    "rotate": "bool", "rotateDraw": "bool", "rotateDrawEditor": "bool",
    "visualRotationOffset": "float", "lockRotation": "bool",
    "ignoreLineRotation": "bool", "invertFlip": "bool",
    "variants": "int", "drawArrow": "bool", "drawTeamOverlay": "bool",
    "saveData": "bool", "breakable": "bool", "unitMoveBreakable": "bool",
    "rebuildable": "bool", "privileged": "bool", "requiresWater": "bool",
    "placeableLiquid": "bool", "placeablePlayer": "bool", "placeableOn": "bool",
    "insulated": "bool", "squareSprite": "bool", "absorbLasers": "bool",
    "enableDrawStatus": "bool", "drawDisabled": "bool", "autoResetEnabled": "bool",
    "noUpdateDisabled": "bool", "updateInUnits": "bool", "alwaysUpdateInUnits": "bool",
    "canPickup": "bool", "deconstructDropAllLiquid": "bool", "useColor": "bool",
    "playerUnmineable": "bool",
    # 数值属性
    "scaledHealth": "float", "health": "int", "armor": "float",
    "baseExplosiveness": "float", "explosivenessScale": "float", "flammabilityScale": "float",
    "baseShake": "float", "size": "int", "offset": "float", "sizeOffset": "int",
    "clipSize": "float", "lightClipSize": "float", "placeOverlapRange": "float",
    "crushDamageMultiplier": "float", "crushFragile": "bool", "timers": "int",
    "fillsTile": "bool", "forceDark": "bool", "alwaysReplace": "bool",
    "replaceable": "bool", "priority": "float", "unitCapModifier": "int",
    "schematicPriority": "int",
    # 引用属性
    "itemDrop": "Item", "lightLiquid": "Liquid", "cacheLayer": "CacheLayer",
    "group": "BlockGroup", "flags": "EnumSet",
    "destroyBullet": "BulletType",
    # 配置
    "configurable": "bool", "configureSound": "Sound",
    "ignoreResizeConfig": "bool", "commandable": "bool",
    "allowConfigInventory": "bool", "selectionRows": "int", "selectionColumns": "int",
    "logicConfigurable": "bool", "delayLandingConfig": "bool", "consumesTap": "bool",
    "drawLiquidLight": "bool",
    # 环境
    "envRequired": "int", "envEnabled": "int", "envDisabled": "int",
    "sync": "bool", "conveyorPlacement": "bool", "allowDiagonal": "bool",
    "swapDiagonalPlacement": "bool", "allowRectanglePlacement": "bool",
    # 颜色/视觉
    "mapColor": "Color", "hasColor": "bool",
    "targetable": "bool", "attacks": "bool", "suppressable": "bool", "canOverdrive": "bool",
    "outlineColor": "Color", "outlineIcon": "bool", "outlineRadius": "int",
    "outlinedIcon": "int", "hasShadow": "bool", "customShadow": "bool",
    "placePitchChange": "bool", "breakPitchChange": "bool",
    # 音效
    "placeSound": "Sound", "breakSound": "Sound", "destroySound": "Sound",
    "destroySoundVolume": "float", "destroyPitchMin": "float", "destroyPitchMax": "float",
    "ambientSound": "Sound", "ambientSoundVolume": "float",
    "configureSound": "Sound",
    # 光照
    "albedo": "float", "lightColor": "Color", "emitLight": "bool",
    "obstructsLight": "bool", "lightRadius": "float", "fogRadius": "int",
    # 建造
    "requirements": "ItemStack[]", "category": "Category",
    "buildTime": "float", "buildVisibility": "BuildVisibility",
    "buildCostMultiplier": "float", "deconstructThreshold": "float",
    "instantDeconstruct": "bool", "instantBuild": "bool", "ignoreBuildDarkness": "bool",
    "placeEffect": "Effect", "breakEffect": "Effect", "destroyEffect": "Effect",
    "researchCostMultiplier": "float", "researchCostMultipliers": "ObjectFloatMap",
    "researchCost": "ItemStack[]", "forceTeam": "Team",
    "instantTransfer": "bool", "quickRotate": "bool", "allowDerelictRepair": "bool",
    # 绘制
    "drawer": "DrawBlock",
    # 消费
    "consumes": "object",
    # 科技树
    "research": "object|string",
}

# Block 子类额外字段 (Turret)
TURRET_FIELDS = {
    "range": "float", "reload": "float", "spread": "float",
    "shots": "int", "burstSpacing": "float",
    "xRand": "float", "minRange": "float",
    "recoil": "float", "recoilTime": "float",
    "size": "int",
    "inaccuracy": "float", "velocityInaccuracy": "float",
    "moveWhileCharging": "bool", "controllable": "bool",
    "aiControllable": "bool", "predictTarget": "bool",
    "targetInterval": "float", "targetSwitchInterval": "float",
    "shootSound": "Sound", "quiet": "bool",
    "heatColor": "Color",
    "shootType": "BulletType", "bullets": "object",
    "coolant": "Consume", "consumes": "object",
    "outlineColor": "Color", "outlineRadius": "int",
    "powerUse": "float",
    "chargeSound": "Sound", "chargeTime": "float",
    "smoothReloadSpeed": "float", "minWarmup": "float",
    "shootWarmupSpeed": "float",
    "drawer": "DrawBlock",
    "loopSound": "Sound", "loopSoundVolume": "float",
}

# Drill 额外字段
DRILL_FIELDS = {
    "tier": "int", "drillTime": "int", "size": "int",
    "softShadow": "bool", "mineEffect": "Effect",
    "ominousDrillSound": "bool", "updateEffect": "Effect",
    "updateEffectChance": "float", "drillEffect": "Effect",
    "drillEffectRadius": "float",
    "liquidBoostIntensity": "float",
    "requiredLiquid": "float",
    "warmupSpeed": "float",
}

# UnitType 字段 (从 UnitType.java 提取)
UNIT_FIELDS = {
    # 基本
    "speed": "float", "hitSize": "float", "hitSizeToOutline": "float",
    "health": "int", "armor": "float",
    "buildSpeed": "float", "buildCooldown": "float",
    "payloadCapacity": "float", "payloadOffset": "float",
    "drawCell": "bool", "drawItems": "bool",
    "flying": "bool", "lowAltitude": "bool",
    "drag": "float", "accel": "float", "turnSpeed": "float",
    "mass": "float", "itemOffsetY": "float",
    "engineOffset": "float", "engineSize": "float",
    "stepShake": "float", "fallShake": "float",
    "crashDamageMultiplier": "float", "crashEffectMultiplier": "float",
    "canDrown": "bool", "drownTimeMultiplier": "float",
    "canBoost": "bool", "boostMultiplier": "float",
    "boostSpeedMultiplier": "float",
    "canFly": "bool",
    # 形态
    "isEnemy": "bool", "playerControllable": "bool",
    "logicControllable": "bool",
    # 能力/武器
    "abilities": "Ability[]", "weapons": "Weapon[]",
    # 颜色
    "healColor": "Color", "lightColor": "Color", "shieldColor": "Color",
    # 音效
    "deathSound": "Sound", "deathSoundVolume": "float",
    "wreckSound": "Sound", "wreckSoundVolume": "float",
    "loopSound": "Sound", "loopSoundVolume": "float",
    "stepSound": "Sound", "stepSoundVolume": "float",
    "stepSoundPitch": "float", "stepSoundPitchRange": "float",
    "tankMoveSound": "Sound", "moveSound": "Sound",
    "moveSoundVolume": "float",
    "moveSoundPitchMin": "float", "moveSoundPitchMax": "float",
    "tankMoveVolume": "float",
    # 特效
    "fallEffect": "Effect", "fallEngineEffect": "Effect",
    "deathExplosionEffect": "Effect", "treadEffect": "Effect",
    # 绘制部件
    "parts": "DrawPart[]", "engines": "UnitEngine[]",
    "useEngineElevation": "bool", "engineColor": "Color",
    "engineColorInner": "Color",
    "trailLength": "int", "trailColor": "Color",
    # 路径
    "flowfieldPathType": "int", "pathCost": "PathCost",
    # 命令
    "targetFlags": "BlockFlag[]",
    "allowChangeCommands": "bool",
    "commands": "UnitCommand[]", "defaultCommand": "UnitCommand",
    "stances": "UnitStance[]",
    # 轮廓
    "outlineColor": "Color", "outlineRadius": "int", "outlines": "bool",
    # 物品
    "itemCapacity": "int", "ammoCapacity": "int",
    "mineTier": "int", "mineSpeed": "float",
    "mineWalls": "bool", "mineFloor": "bool", "mineHardnessScaling": "bool",
    "mineSound": "Sound", "mineSoundVolume": "float",
    "mineItems": "Item[]",
    # 腿部
    "legCount": "int", "legGroupSize": "int",
    "legLength": "float", "legSpeed": "float",
    "legSpeedMultiplier": "float", "legBaseOffset": "float",
    "legMove": "float",
    "legBaseUnder": "bool", "lockLegBase": "bool",
    "legContinuousMove": "bool",
    "flipBackLegs": "bool", "flipLegSide": "bool",
    "emitWalkSound": "bool", "emitWalkEffect": "bool",
    "mechLandShake": "float",
    "mechSideSway": "float", "mechFrontSway": "float", "mechStride": "float",
    "mechStepParticles": "bool", "mechLegColor": "Color",
    # 履带
    "treadRects": "Rect[]", "treadFrames": "int",
    "treadPullOffset": "int",
    "crushFragile": "bool",
    # 分段
    "segments": "int", "segmentUnits": "int",
    "segmentUnit": "UnitType", "segmentEndUnit": "UnitType",
    "segmentLayerOrder": "bool",
    "segmentMag": "float",
    "segmentScl": "float", "segmentSpeedMag": "float",
    "segmentPhase": "float",
    # 导弹
    "lifetime": "float", "homingDelay": "float",
    # 环境
    "envRequired": "int", "envEnabled": "int", "envDisabled": "int",
    # 模板
    "template": "UnitType",
    "type": "string",
    # AI 控制器
    "controller": "string", "aiController": "string",
    "defaultController": "string",
    # 其他
    "hidden": "bool",
}

ITEM_FIELDS = {
    "color": "Color",
    "explosiveness": "float", "flammability": "float",
    "radioactivity": "float", "charge": "float",
    "hardness": "int",
    "cost": "float", "healthScaling": "float",
    "lowPriority": "bool", "frames": "int",
    "transitionFrames": "int", "frameTime": "float",
    "buildable": "bool", "hidden": "bool",
    "name": "string", "description": "string",
    "research": "object|string",
}

LIQUID_FIELDS = {
    "gas": "bool", "color": "Color", "gasColor": "Color",
    "barColor": "Color", "lightColor": "Color",
    "flammability": "float", "temperature": "float",
    "heatCapacity": "float", "viscosity": "float",
    "explosiveness": "float", "blockReactive": "bool",
    "coolant": "bool", "moveThroughBlocks": "bool",
    "incinerable": "bool", "effect": "StatusEffect",
    "particleEffect": "Effect", "particleSpacing": "float",
    "boilPoint": "float", "capPuddles": "bool",
    "vaporEffect": "Effect", "hidden": "bool",
    "canStayOn": "Liquid[]",
    "name": "string", "description": "string",
    "research": "object|string",
}

STATUS_FIELDS = {
    "damageMultiplier": "float", "healthMultiplier": "float",
    "speedMultiplier": "float", "reloadMultiplier": "float",
    "buildSpeedMultiplier": "float", "dragMultiplier": "float",
    "transitionDamage": "float", "disarm": "bool",
    "damage": "float", "intervalDamageTime": "float",
    "intervalDamage": "float", "intervalDamagePierce": "bool",
    "effectChance": "float", "parentizeEffect": "bool",
    "permanent": "bool", "reactive": "bool",
    "dynamic": "bool", "show": "bool",
    "color": "Color", "effect": "Effect",
    "applyEffect": "Effect", "applyExtend": "bool",
    "applyColor": "Color", "parentizeApplyEffect": "bool",
    "affinities": "StatusEffect[]", "opposites": "StatusEffect[]",
    "outline": "bool",
    "name": "string", "description": "string",
    "research": "object|string",
}

PLANET_FIELDS = {
    "parent": "Planet", "radius": "float", "sectorSize": "int",
    "mesh": "object", "cloudMesh": "object",
    "rules": "object",
    "name": "string", "description": "string",
    "research": "object|string",
}

SECTOR_FIELDS = {
    "sector": "int", "planet": "Planet",
    "rules": "object",
    "name": "string", "description": "string",
    "research": "object|string",
}

WEATHER_FIELDS = {
    "type": "string",
    "name": "string", "description": "string",
    "research": "object|string",
}

TEAM_FIELDS = {
    "team": "Team|string|int",
}

# Weapon 字段 (从 Weapon.java 提取)
WEAPON_FIELDS = {
    "name": "string", "bullet": "BulletType",
    "ejectEffect": "Effect", "display": "bool",
    "mirror": "bool", "flipSprite": "bool",
    "alternate": "bool", "rotate": "bool",
    "showStatSprite": "bool", "baseRotation": "float",
    "top": "bool", "continuous": "bool", "alwaysContinuous": "bool",
    "aimChangeSpeed": "float",
    "controllable": "bool", "aiControllable": "bool",
    "alwaysShooting": "bool", "autoTarget": "bool",
    "predictTarget": "bool", "useAttackRange": "bool",
    "targetInterval": "float", "targetSwitchInterval": "float",
    "rotateSpeed": "float", "reload": "float",
    "inaccuracy": "float", "shake": "float",
    "recoil": "float", "recoils": "int",
    "recoilTime": "float", "recoilPow": "float",
    "cooldownTime": "float",
    "shootX": "float", "shootY": "float",
    "x": "float", "y": "float",
    "xRand": "float", "yRand": "float",
    "shoot": "ShootPattern", "shadow": "float",
    "velocityRnd": "float", "extraVelocity": "float",
    "shootCone": "float", "rotationLimit": "float",
    "minWarmup": "float",
    "shootWarmupSpeed": "float", "smoothReloadSpeed": "float",
    "linearWarmup": "bool", "soundPitchMin": "float", "soundPitchMax": "float",
    "ignoreRotation": "bool", "noAttack": "bool",
    "minShootVelocity": "float", "parentizeEffects": "bool",
    "otherSide": "int", "layerOffset": "float",
    "activeSound": "Sound", "activeSoundVolume": "float",
    "shootSound": "Sound", "shootSoundVolume": "float",
    "initialShootSound": "Sound", "chargeSound": "Sound",
}

# BulletType 字段 (常见基类字段)
BULLET_FIELDS = {
    "damage": "float", "speed": "float", "lifetime": "float",
    "width": "float", "height": "float",
    "hitSize": "float", "knockback": "float",
    "homingPower": "float", "homingRange": "float",
    "splashDamage": "float", "splashRadius": "float",
    "scales": "float[]", "status": "StatusEffect",
    "statusDuration": "float", "statusChance": "float",
    "hitEffect": "Effect", "despawnEffect": "Effect",
    "hitSound": "Sound", "despawnSound": "Sound",
    "shootEffect": "Effect", "smokeEffect": "Effect",
    "lightColor": "Color", "trailColor": "Color",
    "trailWidth": "float", "trailLength": "int",
    "pierce": "bool", "pierceCap": "int",
    "collides": "bool", "collidesAir": "bool",
    "collidesGround": "bool",
    "absorbLasers": "bool", "hittable": "bool",
    "alwaysCollidesProjectile": "bool",
    "keepVelocity": "bool",
    "fragBullet": "BulletType", "fragBullets": "int",
    "fragSpread": "float", "fragRandomSpread": "float",
    "intervalBullet": "BulletType", "intervalBullets": "int",
    "intervalSpread": "float",
    "bullet": "BulletType",
    "type": "string",
    "name": "string",
}

# Consume 类型
CONSUME_TYPES = {
    "item", "items", "itemsBoost", "liquid", "liquids", "liquidsBoost",
    "power", "powerBuffered", "coolant",
    "itemCharged", "itemFlammable", "itemRadioactive", "itemExplosive",
    "itemList", "itemExplode", "liquidFlammable",
    "remove",
}

# Consume 类型的合法 remove 值
CONSUME_REMOVE_TYPES = {
    "item", "items", "liquid", "liquids", "power", "coolant", "all",
}

# DrawBlock 子类名
DRAW_BLOCK_TYPES = {
    "DrawDefault", "DrawMulti", "DrawRegion", "DrawGlow",
    "DrawPackets", "DrawHeat", "DrawBlock", "DrawFlame",
    "DrawCrucibleFlame", "DrawGlowRegion", "DrawTeam",
    "DrawItems", "DrawLiquidRegion", "DrawCustom",
    "DrawShape", "DrawBlur", "DrawSpikes", "DrawSoftShadow",
    "DrawBubbles", "DrawIcon", "DrawRegionReplace",
    "DrawRegionLight", "DrawHover", "DrawUnder", "DrawBuildSelect",
}

# Effect 引用
FX_NAMES = {
    "none", "place", "placeBlock", "breakBlock", "break",
    "dynamicExplosion", "explosion", "bigExplosion",
    "vapor", "burning", "fire", "fireSmoke",
    "trailSmoke", "fallSmoke", "heal", "healSmall",
    "lightning", "lightningCharge", "lightningChargeBegin",
    "smoke", "smokeCloud", "rocketSmite", "unitDrop",
    "unitSpark", "spark", "hit", "hitSmall", "hitSpark",
    "hitBulletSmall", "hitBulletBig", "hitLiquid", "hitLaser",
    "hitFlame", "hitMeltdown", "lightningCharge",
}

# BuildVisibility 枚举值
BUILD_VISIBILITY_VALUES = {
    "hidden", "shown", "only", "campaignOnly", "editorOnly",
    "configurable", "displayOnly",
}

# Category 枚举值
CATEGORY_VALUES = {
    "distribution", "production", "power", "crafting",
    "defense", "turrets", "units", "effect",
    "campaign", "sandbox", "logic",
}

# Sorts
UNIT_SORTS = {
    "fastest", "slowest", "strongest", "weakest",
    "closest", "farthest", "mostDistant", "strongestFirst",
}

# PartProgress constants
PART_PROGRESS_CONSTANTS = {
    "charge", "warmup", "reload", "smoothReload",
    "heat", "compress", "delay",
}

# PartProgress operations
PART_PROGRESS_OPS = {
    "inv", "slope", "clamp", "delay", "sustain",
    "shorten", "compress", "add", "blend", "mul",
    "min", "sin", "absin", "mod", "loop", "curve",
}

# Unit type strings
UNIT_TYPE_STRINGS = {
    "flying", "mech", "legs", "naval",
    "payload", "missile", "tank", "hover",
    "tether", "crawl",
}

# AI controller strings
AI_CONTROLLER_STRINGS = {
    "flying", "ground", "miner", "builder",
    "defender", "missile", "hug", "suicide",
    "repair", "assembly", "command", "fighter",
    "logic", "boost", "cargo", "prebuild",
}

# ============================================================
# 验证结果
# ============================================================
class Severity(Enum):
    ERROR = "error"
    WARN = "warn"

@dataclass
class Diagnostic:
    severity: Severity
    message: str
    line: Optional[int] = None
    column: Optional[int] = None
    context: Optional[str] = None

    def __str__(self):
        loc = ""
        if self.line is not None:
            loc = f" at line {self.line}"
            if self.column is not None:
                loc += f", column {self.column}"
        prefix = "[ERROR]" if self.severity == Severity.ERROR else "[WARN]"
        ctx = f" [{self.context}]" if self.context else ""
        return f"{prefix}{ctx}{loc}: {self.message}"


# ============================================================
# ContentParser 验证逻辑
# ============================================================
class ContentValidator:
    """模拟 ContentParser.java 的验证行为"""

    def __init__(self, mod_name: str = "test-mod", debug: bool = False):
        self.mod_name = mod_name
        self.debug = debug
        self.diagnostics: list[Diagnostic] = []
        self.source_file: str = "content.json"

    def error(self, msg: str, context: str = "", line: int = None, col: int = None):
        self.diagnostics.append(Diagnostic(Severity.ERROR, msg, line, col, context))

    def warn(self, msg: str, context: str = "", line: int = None, col: int = None):
        self.diagnostics.append(Diagnostic(Severity.WARN, msg, line, col, context))

    def resolve(self, base: str, default: str = None, warn_on_missing: bool = True) -> Optional[str]:
        """模拟 ContentParser.resolve() - 类名解析"""
        if not base:
            return default if default else None

        # 首字母小写 → capitalize
        if base and base[0].islower():
            capitalized = base[0].upper() + base[1:]
            if capitalized in CLASS_MAP:
                return capitalized
        elif base in CLASS_MAP:
            return base

        # 尝试全限定名 (包含点号)
        if "." in base:
            return base  # 同意解析，但这里只验证

        # 有默认值则回退
        if default:
            self.warn(
                f"No type '{base}' found, defaulting to type '{default}'",
                context=f"resolve"
            )
            return default

        return None

    def validate_json_syntax(self, text: str) -> Optional[dict]:
        """JSON 语法检查（模拟原版解析）"""
        # 去掉 # 字符（原版会 replace("#", "\\#")）
        cleaned = text.replace("#", "\\#")

        try:
            # 尝试用宽松模式
            data = json.loads(cleaned)
            return data
        except json.JSONDecodeError as e:
            self.error(
                f"JsonParse: {e.msg}",
                context=f"JsonParse",
                line=e.lineno,
                col=e.colno
            )
            return None

    def validate_color(self, value: Any, field_name: str):
        """Color 字段验证"""
        if isinstance(value, str):
            # 允许 #RRGGBB 或 RRGGBB 格式
            hex_pattern = r'^#?[0-9A-Fa-f]{6}$|^[0-9A-Fa-f]{8}$|^[0-9A-Fa-f]{6}$'
            if not re.match(hex_pattern, value):
                self.error(
                    f"Invalid color value: '{value}'. Colors must be hex strings like 'FF0000' or '#FF0000'",
                    context=field_name
                )
        elif isinstance(value, (int, float)):
            self.warn(
                f"Colors should be strings, not numbers. Make sure you have quotes around the value, "
                f"or they will not be parsed correctly: '@{value}'",
                context=field_name
            )
        else:
            self.error(
                f"Invalid color type: expected string, got {type(value).__name__}",
                context=field_name
            )

    def validate_effect(self, value: Any, field_name: str = "effect"):
        """Effect 字段验证"""
        if isinstance(value, str):
            # 可能是 Fx 引用
            if not value.startswith("new"):
                return  # Fx.xxx 引用
        elif isinstance(value, dict):
            # 对象形式，检查 type
            t = value.get("type", "")
            if t:
                resolved = self.resolve(t, "ParticleEffect", warn_on_missing=True)
                if not resolved:
                    self.warn(f"Unknown effect type '{t}', defaulting to ParticleEffect", context=field_name)
        elif isinstance(value, list):
            return  # MultiEffect 数组
        else:
            self.error(
                f"Invalid effect value: expected string or object, got {type(value).__name__}",
                context=field_name
            )

    def _validate_bullets(self, bullets: Any, context: str):
        """Turret bullets 定义验证（支持 {type: "...", amounts: {...}} 和数组格式）"""
        if isinstance(bullets, dict):
            self.validate_bullet_type(bullets, context)
        elif isinstance(bullets, list):
            for i, b in enumerate(bullets):
                self.validate_bullet_type(b, f"{context}[{i}]")
        else:
            self.error(
                f"Invalid bullets value: expected object or array, got {type(bullets).__name__}",
                context=context
            )

    def validate_bullet_type(self, value: Any, field_name: str = "bullet"):
        """BulletType 字段验证"""
        if isinstance(value, str):
            return  # Bullets.xxx 引用
        elif isinstance(value, list):
            # MultiBulletType 数组
            for i, item in enumerate(value):
                if isinstance(item, dict):
                    self.validate_bullet_type(item, f"{field_name}[{i}]")
            return
        elif isinstance(value, dict):
            t = value.get("type", "basic")
            # 尝试解析 XxBulletType
            alternate = t[0].upper() + t[1:] + "BulletType" if t else "BasicBulletType"
            alternate_lower = t + "BulletType" if t else "BasicBulletType"
            resolved = None
            for candidate in [t, alternate, alternate_lower]:
                resolved = self.resolve(candidate, default=None, warn_on_missing=False)
                if resolved:
                    break
            if not resolved:
                resolved = self.resolve(t, "BasicBulletType")
            # 递归验证子弹字段
            for k, v in value.items():
                if k == "type":
                    continue
                if k in BULLET_FIELDS:
                    expected = BULLET_FIELDS[k]
                    if expected == "Effect":
                        self.validate_effect(v, f"bullet.{k}")
                    elif expected == "StatusEffect":
                        pass  # 简单引用
                    elif expected == "BulletType":
                        self.validate_bullet_type(v, f"bullet.{k}")
                else:
                    self.warn(f"Unknown field '{k}' for class '{resolved or 'BasicBulletType'}'", context=field_name)
        elif isinstance(value, str):
            return  # 引用
        else:
            self.error(
                f"Invalid bullet type: expected string, object or array, got {type(value).__name__}",
                context=field_name
            )

    def validate_weapon(self, value: dict, field_name: str = "weapon"):
        """Weapon 字段验证"""
        for k, v in value.items():
            if k == "type":
                resolved = self.resolve(v, "Weapon")
                if not resolved:
                    self.warn(f"Defaulting weapon type to Weapon", context=field_name)
                continue
            if k in WEAPON_FIELDS:
                expected = WEAPON_FIELDS[k]
                if expected == "BulletType":
                    self.validate_bullet_type(v, f"weapon.{k}")
                elif expected == "Effect":
                    self.validate_effect(v, f"weapon.{k}")
                elif expected == "Sound":
                    if isinstance(v, str):
                        pass  # Sounds.xxx 引用
                    else:
                        self.error(
                            f"Invalid sound type: expected string, got {type(v).__name__}",
                            context=f"weapon.{k}"
                        )
                elif expected == "ShootPattern":
                    if isinstance(v, dict):
                        self.validate_shoot_pattern(v, f"weapon.{k}")
            else:
                self.warn(
                    f"Unknown field '{k}' for class 'Weapon'",
                    context=f"weapon"
                )

    def validate_shoot_pattern(self, value: dict, field_name: str):
        """ShootPattern 字段验证"""
        t = value.get("type", "")
        if t:
            resolved = self.resolve(t, "ShootPattern")
        for k, v in value.items():
            if k == "type":
                continue
            # ShootPattern 的常见字段
            known = {"shots", "spacing", "spread", "velocityInaccuracy", "firstShotDelay", "reloadTime"}
            if k not in known:
                self.warn(f"Unknown field '{k}' for class 'ShootPattern'", context=field_name)

    def validate_consume(self, name: str, value: Any, block_name: str):
        """consumes 字段验证"""
        if name == "remove":
            if isinstance(value, str):
                values = [value]
            elif isinstance(value, list):
                values = value
            else:
                self.error(f"'remove' must be a string or array", context=f"consumes.remove")
                return
            for v in values:
                if v not in CONSUME_REMOVE_TYPES:
                    self.warn(
                        f"Unknown consumer type '{v}' (Class: Consume{v.capitalize()}) in consume: remove.",
                        context=f"consumes.remove"
                    )
            return

        if name in CONSUME_TYPES:
            # 合法的 consume 类型
            if name == "power" and isinstance(value, (int, float)):
                return  # power 简写
            if isinstance(value, dict):
                self.validate_consume_fields(name, value, block_name)
            elif name in {"items", "itemsBoost", "liquids", "liquidsBoost"}:
                if isinstance(value, list) or isinstance(value, str):
                    return  # 数组或简写
            return

        self.error(
            f"Unknown consumption type: '{name}' for block '{block_name}'.",
            context=f"consumes"
        )

    def validate_consume_fields(self, consume_type: str, value: dict, block_name: str):
        """Consume 子类字段验证"""
        # 基本字段检查
        known_fields = {
            "amount", "update", "optional", "boost",
            "liquid", "liquids", "items", "item",
        }
        for k in value:
            if k not in known_fields:
                self.warn(
                    f"Unknown field '{k}' for consume type '{consume_type}'",
                    context=f"consumes.{consume_type}"
                )

    def validate_research(self, value: Any, content_name: str):
        """research 字段验证"""
        if isinstance(value, str):
            return  # 简单父节点引用
        if isinstance(value, dict):
            parent = value.get("parent", None)
            if parent is None and not value.get("root", False):
                self.warn(
                    f"{content_name} is not a root node, and does not have a `parent` property. Ignoring.",
                    context="research"
                )
            return
        self.error(
            f"Invalid 'research' value: expected string or object, got {type(value).__name__}",
            context="research"
        )

    def validate_block(self, name: str, data: dict):
        """Block 内容验证"""
        bname = f"{self.mod_name}-{name}"
        block_type = data.get("type", "Block")

        # 检查 type 解析
        resolved = self.resolve(block_type, "Block")
        if not resolved:
            self.warn(f"No type '{block_type}' found, defaulting to type 'Block'", context=bname)
            resolved = "Block"

        # 注意：原版 "re-declares a type" 警告只在 locate(type, name) != null 时触发
        # 验证器没有完整的内容数据库，因此不输出此警告

        # 字段校验: effective_fields 是 dict[field_name -> expected_type]
        effective_fields = dict(BLOCK_FIELDS)

        # 根据 type 扩展字段
        if resolved in ("Turret", "ItemTurret", "LiquidTurret", "PowerTurret",
                        "ContinuousTurret", "ContinuousLiquidTurret", "LaserTurret",
                        "PointDefenseTurret", "ReloadTurret", "TractorBeamTurret",
                        "BaseTurret", "BuildTurret", "PayloadAmmoTurret"):
            effective_fields.update(TURRET_FIELDS)
        if resolved in ("Drill", "BeamDrill", "GasExtractor"):
            effective_fields.update(DRILL_FIELDS)

        for field_name, field_value in data.items():
            if field_name == "type":
                continue

            if field_name == "consumes":
                if isinstance(field_value, dict):
                    for cname, cvalue in field_value.items():
                        self.validate_consume(cname, cvalue, bname)
                continue

            if field_name == "research":
                self.validate_research(field_value, bname)
                continue

            if field_name == "name" or field_name == "description":
                if not isinstance(field_value, str):
                    self.warn(
                        f"'{field_name}' should be a string, got {type(field_value).__name__}",
                        context=bname
                    )
                continue

            # 检查字段是否在白名单中
            if field_name not in effective_fields:
                self.warn(f"Unknown field '{field_name}' for class '{resolved}'", context=bname)
                continue

            # 类型校验
            expected = effective_fields[field_name]
            self._validate_field_type(field_name, field_value, expected, bname)

        # 检查 size 限制
        if "size" in data:
            size = data["size"]
            if isinstance(size, int) and size > 16:
                self.error(f"Blocks cannot be larger than 16", context=bname)

        # requirements → buildVisibility 自动转换
        if "requirements" in data and "buildVisibility" not in data:
            if data.get("buildVisibility") == "hidden":
                pass  # 原版会自动设为 shown

        # 验证嵌套对象
        for key in ("drawer",):
            if key in data:
                self.validate_draw_block(data[key], f"{bname}.drawer")

        # 验证 weapons (嵌套在某些子类中)
        # 注意：unit 的 weapons 在 validate_unit 中处理

        # 验证 bullets (Turret 的弹药定义)
        if "bullets" in data:
            self._validate_bullets(data["bullets"], f"{bname}.bullets")

        # shootType (炮台子弹)
        if "shootType" in data:
            self.validate_bullet_type(data["shootType"], f"{bname}.shootType")

    def validate_unit(self, name: str, data: dict):
        """Unit 内容验证"""
        uname = f"{self.mod_name}-{name}"
        unit_type_str = data.get("type", "flying")

        # 检查 type 字段
        if "type" in data:
            if not isinstance(data["type"], str):
                self.error(
                    f"Unit '{name}' has an incorrect type. Types must be strings.",
                    context=uname
                )
            elif data["type"] not in UNIT_TYPE_STRINGS:
                self.error(
                    f"Invalid unit type: '{data['type']}'. Must be one of: {', '.join(sorted(UNIT_TYPE_STRINGS))}",
                    context=uname
                )

        # 检查 template
        if "template" in data:
            if not isinstance(data["template"], str):
                self.warn(
                    f"'template' should be a string, got {type(data['template']).__name__}",
                    context=uname
                )

        # 检查 controller/aiController
        for ctrl_field in ("controller", "aiController", "defaultController"):
            if ctrl_field in data:
                val = data[ctrl_field]
                if isinstance(val, str):
                    if val not in AI_CONTROLLER_STRINGS:
                        self.warn(
                            f"Unknown AI controller '{val}'",
                            context=f"{uname}.{ctrl_field}"
                        )
                else:
                    # 可能是数组
                    if isinstance(val, list):
                        for item in val:
                            if isinstance(item, str) and item not in AI_CONTROLLER_STRINGS:
                                self.warn(
                                    f"Unknown AI controller '{item}'",
                                    context=f"{uname}.{ctrl_field}"
                                )

        # requirements (UnitFactory/Reconstructor)
        if "requirements" in data:
            req = data["requirements"]
            if isinstance(req, dict):
                if "block" not in req:
                    self.error(f"Missing a valid 'block' in 'requirements'", context=uname)

        # 字段校验
        for field_name, field_value in data.items():
            if field_name in ("type", "template", "controller", "aiController",
                              "defaultController", "requirements", "waves", "name", "description",
                              "research"):
                if field_name == "research":
                    self.validate_research(field_value, uname)
                continue

            if field_name not in UNIT_FIELDS:
                self.warn(f"Unknown field '{field_name}' for class 'UnitType'", context=uname)
                continue

            expected = UNIT_FIELDS[field_name]
            self._validate_field_type(field_name, field_value, expected, uname)

        # 验证 abilities
        if "abilities" in data and isinstance(data["abilities"], list):
            for i, ab in enumerate(data["abilities"]):
                if isinstance(ab, dict):
                    self.validate_ability(ab, f"{uname}.abilities[{i}]")

        # 验证 weapons
        if "weapons" in data and isinstance(data["weapons"], list):
            for i, w in enumerate(data["weapons"]):
                if isinstance(w, dict):
                    self.validate_weapon(w, f"{uname}.weapons[{i}]")

        # 验证 parts (DrawParts)
        if "parts" in data and isinstance(data["parts"], list):
            for i, p in enumerate(data["parts"]):
                if isinstance(p, dict):
                    self.validate_draw_part(p, f"{uname}.parts[{i}]")

        # 验证 engines
        if "engines" in data and isinstance(data["engines"], list):
            for i, e in enumerate(data["engines"]):
                if isinstance(e, dict):
                    self.validate_unit_engine(e, f"{uname}.engines[{i}]")

    def validate_ability(self, value: dict, field_name: str):
        """Ability 字段验证"""
        t = value.get("type", "")
        if t:
            resolved = self.resolve(t, default=None, warn_on_missing=False)
            if not resolved:
                self.warn(f"No type '{t}' found, defaulting to type 'Ability'", context=field_name)
        for k, v in value.items():
            if k == "type":
                continue
            if k == "effect":
                self.validate_effect(v, f"{field_name}.{k}")

    def validate_draw_block(self, value: Any, field_name: str):
        """DrawBlock 字段验证"""
        if isinstance(value, str):
            resolved = self.resolve(value, default=None, warn_on_missing=False)
            if not resolved and value not in DRAW_BLOCK_TYPES:
                self.warn(f"Unknown DrawBlock type '{value}'", context=field_name)
        elif isinstance(value, list):
            # DrawMulti 数组
            for i, item in enumerate(value):
                if isinstance(item, dict):
                    self.validate_draw_block(item, f"{field_name}[{i}]")
        elif isinstance(value, dict):
            t = value.get("type", "")
            if t:
                resolved = self.resolve(t, default=None, warn_on_missing=False)
                if not resolved:
                    self.warn(f"No type '{t}' found, defaulting to DrawDefault", context=field_name)
            # 递归检查子字段
            for k, v in value.items():
                if k == "type":
                    continue
                # DrawBlock 的子字段不验证（太深了）

    def validate_draw_part(self, value: dict, field_name: str):
        """DrawPart 字段验证"""
        t = value.get("type", "RegionPart")
        resolved = self.resolve(t, default=None, warn_on_missing=False)
        if not resolved:
            self.warn(f"No type '{t}' found, defaulting to RegionPart", context=field_name)

    def validate_unit_engine(self, value: dict, field_name: str):
        """UnitEngine 字段验证"""
        # UnitEngine 没有 type
        for k in value:
            known = {"x", "y", "radius", "radiusInner", "length", "angle", "rotMove"}
            if k not in known:
                self.warn(f"Unknown field '{k}' for class 'UnitEngine'", context=field_name)

    def validate_item(self, name: str, data: dict):
        """Item 内容验证"""
        iname = f"{self.mod_name}-{name}"
        for field_name, field_value in data.items():
            if field_name in ("name", "description", "research"):
                if field_name == "research":
                    self.validate_research(field_value, iname)
                continue
            if field_name not in ITEM_FIELDS:
                self.warn(f"Unknown field '{field_name}' for class 'Item'", context=iname)
                continue
            expected = ITEM_FIELDS[field_name]
            self._validate_field_type(field_name, field_value, expected, iname)

    def validate_liquid(self, name: str, data: dict):
        """Liquid 内容验证"""
        lname = f"{self.mod_name}-{name}"
        for field_name, field_value in data.items():
            if field_name in ("name", "description", "research"):
                if field_name == "research":
                    self.validate_research(field_value, lname)
                continue
            if field_name not in LIQUID_FIELDS:
                self.warn(f"Unknown field '{field_name}' for class 'Liquid'", context=lname)
                continue
            expected = LIQUID_FIELDS[field_name]
            self._validate_field_type(field_name, field_value, expected, lname)

    def validate_status(self, name: str, data: dict):
        """StatusEffect 内容验证"""
        sname = f"{self.mod_name}-{name}"
        for field_name, field_value in data.items():
            if field_name in ("name", "description", "research"):
                if field_name == "research":
                    self.validate_research(field_value, sname)
                continue
            if field_name not in STATUS_FIELDS:
                self.warn(f"Unknown field '{field_name}' for class 'StatusEffect'", context=sname)
                continue
            expected = STATUS_FIELDS[field_name]
            self._validate_field_type(field_name, field_value, expected, sname)

    def validate_weather(self, name: str, data: dict):
        """Weather 内容验证"""
        wname = f"{self.mod_name}-{name}"
        weather_type = data.get("type", "ParticleWeather")
        if "type" in data:
            resolved = self.resolve(data["type"], default=None, warn_on_missing=False)
            if not resolved:
                self.warn(
                    f"No type '{data['type']}' found, defaulting to type 'ParticleWeather'",
                    context=wname
                )
        for field_name, field_value in data.items():
            if field_name in ("name", "description", "research", "type"):
                if field_name == "research":
                    self.validate_research(field_value, wname)
                continue
            if field_name not in WEATHER_FIELDS:
                self.warn(f"Unknown field '{field_name}' for class 'Weather'", context=wname)
                continue

    def validate_planet(self, name: str, data: dict):
        """Planet 内容验证"""
        pname = f"{self.mod_name}-{name}"
        if "sectorSize" in data and not isinstance(data["sectorSize"], int):
            self.warn(f"'sectorSize' should be an integer", context=pname)
        if "radius" in data and not isinstance(data["radius"], (int, float)):
            self.warn(f"'radius' should be a number", context=pname)
        if "mesh" in data:
            mesh = data["mesh"]
            if not isinstance(mesh, (dict, list)):
                self.error(f"Meshes must be objects.", context=pname)
        if "cloudMesh" in data:
            mesh = data["cloudMesh"]
            if not isinstance(mesh, (dict, list)):
                self.error(f"Meshes must be objects.", context=pname)
        for field_name, field_value in data.items():
            if field_name in ("name", "description", "research", "mesh", "cloudMesh", "sectorSize"):
                if field_name == "research":
                    self.validate_research(field_value, pname)
                continue
            if field_name not in PLANET_FIELDS:
                self.warn(f"Unknown field '{field_name}' for class 'Planet'", context=pname)

    def validate_sector(self, name: str, data: dict):
        """SectorPreset 内容验证"""
        sname = f"{self.mod_name}-{name}"
        if isinstance(data, str):
            return  # 简写引用
        if "sector" not in data:
            self.error(f"SectorPresets must have a sector number.", context=sname)
        if "rules" in data:
            if not isinstance(data["rules"], dict):
                self.error(f"Rules must be an object!", context=sname)
        for field_name, field_value in data.items():
            if field_name in ("name", "description", "research"):
                if field_name == "research":
                    self.validate_research(field_value, sname)
                continue
            if field_name not in SECTOR_FIELDS:
                self.warn(f"Unknown field '{field_name}' for class 'SectorPreset'", context=sname)

    def validate_team(self, name: str, data: dict):
        """Team 内容验证"""
        tname = f"{self.mod_name}-{name}"
        if "team" not in data:
            self.error(f"Team field missing.", context=tname)

    def _validate_field_type(self, field_name: str, value: Any, expected: str, context: str):
        """通用类型校验"""
        if expected in ("string",):
            if not isinstance(value, str):
                self.warn(
                    f"'{field_name}' should be a string, got {type(value).__name__}",
                    context=context
                )
        elif expected in ("int",):
            if not isinstance(value, int) or isinstance(value, bool):
                self.warn(
                    f"'{field_name}' should be an integer, got {type(value).__name__}",
                    context=context
                )
        elif expected in ("float",):
            if not isinstance(value, (int, float)) or isinstance(value, bool):
                self.warn(
                    f"'{field_name}' should be a number, got {type(value).__name__}",
                    context=context
                )
            elif isinstance(value, str):
                # 检查是否数字被写成字符串
                try:
                    float(value)
                    self.warn(
                        f"'{field_name}' should be a number, but got a string '{value}'. "
                        f"Make sure the value is not quoted.",
                        context=context
                    )
                except ValueError:
                    pass
        elif expected in ("bool",):
            if not isinstance(value, bool):
                if isinstance(value, str):
                    if value.lower() not in ("true", "false"):
                        self.warn(
                            f"'{field_name}' should be a boolean, got string '{value}'",
                            context=context
                        )
                elif isinstance(value, (int, float)):
                    self.warn(
                        f"'{field_name}' should be a boolean, got {type(value).__name__}",
                        context=context
                    )
        elif expected == "Color":
            self.validate_color(value, f"{context}.{field_name}")
        elif expected == "Effect":
            self.validate_effect(value, f"{context}.{field_name}")
        elif expected == "Sound":
            if isinstance(value, str):
                pass  # Sounds.xxx 引用
            else:
                self.warn(
                    f"'{field_name}' should be a string (Sound reference), got {type(value).__name__}",
                    context=context
                )
        elif expected == "ItemStack[]":
            if isinstance(value, list):
                for i, item in enumerate(value):
                    if isinstance(item, dict):
                        if "item" not in item and "name" not in item:
                            self.warn(
                                f"ItemStack should have 'item' field",
                                context=f"{context}.{field_name}[{i}]"
                            )
                    elif isinstance(item, str):
                        if "/" in item:
                            parts = item.split("/")
                            if len(parts) != 2:
                                self.warn(
                                    f"Invalid ItemStack format '{item}'. Use 'item/amount' format.",
                                    context=f"{context}.{field_name}[{i}]"
                                )
            elif isinstance(value, str):
                if "/" not in value:
                    self.warn(
                        f"'{field_name}' should be an array of ItemStacks or 'item/amount' string",
                        context=context
                    )
        elif expected in ("int[]", "float[]"):
            if isinstance(value, list):
                pass
            elif not isinstance(value, (int, float)):
                self.warn(
                    f"'{field_name}' should be an array, got {type(value).__name__}",
                    context=context
                )
        elif expected == "Enums":
            pass  # 需要特定枚举值

    def validate_content(self, content_type: str, name: str, data: dict):
        """根据内容类型分发验证"""
        validators = {
            "block": self.validate_block,
            "unit": self.validate_unit,
            "item": self.validate_item,
            "liquid": self.validate_liquid,
            "status": self.validate_status,
            "weather": self.validate_weather,
            "planet": self.validate_planet,
            "sector": self.validate_sector,
            "team": self.validate_team,
        }
        validator = validators.get(content_type)
        if validator:
            validator(name, data)
        else:
            self.warn(f"Unsupported content type: '{content_type}'")

    def validate_file(self, filepath: str, content_type: str = None) -> list[Diagnostic]:
        """验证单个 JSON 文件"""
        self.diagnostics.clear()
        self.source_file = os.path.basename(filepath)

        try:
            with open(filepath, 'r', encoding='utf-8') as f:
                text = f.read()
        except FileNotFoundError:
            self.error(f"File not found: {filepath}")
            return self.diagnostics
        except Exception as e:
            self.error(f"Cannot read file: {e}")
            return self.diagnostics

        data = self.validate_json_syntax(text)
        if data is None:
            return self.diagnostics

        # 从文件名推断类型
        if content_type is None:
            content_type = self._infer_type(filepath)

        # 从文件名提取内容名（去掉扩展名）
        name = os.path.splitext(os.path.basename(filepath))[0]

        if isinstance(data, dict):
            # 确定内容类型
            if content_type:
                self.validate_content(content_type, name, data)
            else:
                self.warn("Content type not specified, performing basic JSON validation only")

        return self.diagnostics

    def validate_string(self, text: str, content_type: str, name: str = "test") -> list[Diagnostic]:
        """验证 JSON 字符串"""
        self.diagnostics.clear()
        self.source_file = f"{name}.json"

        data = self.validate_json_syntax(text)
        if data is None:
            return self.diagnostics

        if isinstance(data, dict):
            self.validate_content(content_type, name, data)
        elif isinstance(data, list):
            # 可能是数组形式的内容
            for i, item in enumerate(data):
                if isinstance(item, dict):
                    self.validate_content(content_type, f"{name}[{i}]", item)

        return self.diagnostics

    def _infer_type(self, filepath: str) -> Optional[str]:
        """从文件名/路径推断内容类型"""
        basename = os.path.basename(filepath).lower()
        directory = os.path.dirname(filepath).lower()

        type_hints = {
            "blocks": "block",
            "block": "block",
            "units": "unit",
            "unit": "unit",
            "items": "item",
            "item": "item",
            "liquids": "liquid",
            "liquid": "liquid",
            "status": "status",
            "statuses": "status",
            "weather": "weather",
            "planets": "planet",
            "planet": "planet",
            "sectors": "sector",
            "sector": "sector",
            "teams": "team",
        }

        # 先检查目录名
        for hint, t in type_hints.items():
            if hint in directory:
                return t

        # 再检查文件名
        for hint, t in type_hints.items():
            if hint in basename:
                return t

        return None

    def print_diagnostics(self):
        """打印所有诊断信息"""
        errors = [d for d in self.diagnostics if d.severity == Severity.ERROR]
        warns = [d for d in self.diagnostics if d.severity == Severity.WARN]

        print(f"\n--- Validation: {self.source_file} ---")
        for d in self.diagnostics:
            print(f"  {d}")

        print(f"\nSummary: {len(errors)} error(s), {len(warns)} warning(s)")
        if not errors and not warns:
            print("  All checks passed.")


# ============================================================
# 命令行入口
# ============================================================
def main():
    parser = argparse.ArgumentParser(
        description="Mindustry JSON Content Validator (based on ContentParser.java v8)"
    )
    parser.add_argument("file", nargs="?", help="JSON file to validate")
    parser.add_argument("--type", "-t",
                        choices=["block", "unit", "item", "liquid", "status",
                                 "weather", "planet", "sector", "team"],
                        help="Content type (auto-detected from filename if omitted)")
    parser.add_argument("--mod", "-m", default="test-mod",
                        help="Mod name prefix (default: test-mod)")
    parser.add_argument("--check", "-c", action="store_true",
                        help="Check file (alias for validate)")
    parser.add_argument("--verbose", "-v", action="store_true",
                        help="Verbose output")
    args = parser.parse_args()

    if not args.file:
        parser.print_help()
        sys.exit(1)

    validator = ContentValidator(mod_name=args.mod, debug=args.verbose)

    if args.file == "-":
        text = sys.stdin.read()
        diagnostics = validator.validate_string(text, args.type or "block")
    else:
        if not os.path.exists(args.file):
            print(f"Error: File not found: {args.file}")
            sys.exit(1)
        diagnostics = validator.validate_file(args.file, args.type)

    validator.print_diagnostics()

    # Exit code: 1 for errors
    errors = [d for d in validator.diagnostics if d.severity == Severity.ERROR]
    sys.exit(1 if errors else 0)


if __name__ == "__main__":
    main()
