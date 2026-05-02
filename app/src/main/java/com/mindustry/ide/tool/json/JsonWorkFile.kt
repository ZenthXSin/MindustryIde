package com.mindustry.ide.tool.json

import arc.struct.ObjectMap
import arc.struct.Seq
import com.mindustry.ide.Vars
import com.mindustry.ide.tool.WorkFile
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import mindustry.content.*
import mindustry.entities.Effect
import mindustry.entities.abilities.Ability
import mindustry.entities.abilities.RegenAbility
import mindustry.entities.bullet.BasicBulletType
import mindustry.entities.bullet.BulletType
import mindustry.entities.part.DrawPart
import mindustry.entities.part.FlarePart
import mindustry.entities.part.HaloPart
import mindustry.entities.part.HoverPart
import mindustry.entities.part.RegionPart
import mindustry.entities.part.ShapePart
import arc.util.Nullable
import mindustry.entities.pattern.ShootPattern
import mindustry.game.Team
import mindustry.gen.Unit
import mindustry.type.*
import mindustry.type.ammo.ItemAmmoType
import mindustry.type.weather.ParticleWeather
import mindustry.world.Block
import mindustry.world.consumers.Consume
import mindustry.world.consumers.ConsumeItems
import mindustry.world.draw.DrawBlock
import mindustry.world.draw.DrawDefault
import mindustry.world.draw.DrawMulti
import mindustry.world.draw.DrawTurret
import mindustry.world.meta.Env
import java.lang.reflect.Field
import java.lang.reflect.Modifier
import kotlin.jvm.java


/**
 * 判断字段在 JSON 里是否“大概率必须写”
 *
 * 依据：
 * - 基本类型：有零值，默认不写一般安全 → optional
 * - 引用类型且标注了 @Nullable：null 是允许的 → optional
 * - 引用类型无 @Nullable：null 可能导致 NPE → required
 *
 * 注意：这只是静态推断，不是绝对规则。
 * 实际是否必须取决于下游业务逻辑。
 */
fun Field.isLikelyRequired(): Boolean {
    if (Modifier.isTransient(modifiers)) return false
    if (Modifier.isStatic(modifiers)) return false
    if (isSynthetic) return false
    if (Modifier.isFinal(modifiers)) return false

    // 基本类型有零值，不需要 JSON 显式提供
    if (type.isPrimitive) return false

    // 有 @Nullable 注解，说明 null 是允许的
    if (isAnnotationPresent(Nullable::class.java)) return false

    // 引用类型且无 @Nullable → JSON 不写就是 null → 可能 NPE
    return true
}

class JsonWorkFile(var classBuild: ClassBuild) : WorkFile() {
    override fun import(content: String) {
        TODO("Not yet implemented")
    }

    override fun init() {
        TODO("Not yet implemented")
    }

    override fun getContent(): String {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return Json.encodeToString(classBuild)
    }
}

class ClassBuild(
    var classData: Class<*>,
    var doc: String = Vars.parser.getClassDoc(classData.name),
    var parentType: String = Vars.parser.getParentType(classData.name),
    var fieldBuilds: MutableList<FieldBuild> = mutableListOf()
) {
    init {
        classData.fields.filter { it.isLikelyRequired() }.forEach {
            fieldBuilds.add(FieldBuild(it, classData))
        }
    }
}

class FieldBuild(
    var field: Field,
    var classData: Class<*>,
    var doc: String = Vars.parser.getFieldDoc(classData.name, field.name)
) {
    var index = getValue()

    companion object {
        val defaultValues = mapOf(
            Int::class.java to { 0 },
            Float::class.java to { 0f },
            Double::class.java to { 0.0 },
            Boolean::class.java to { false },
            Long::class.java to { 0L },
            Short::class.java to { 0.toShort() },
            Byte::class.java to { 0.toByte() },
            Char::class.java to { '\u0000' },
            String::class.java to { "" },
            Block::class.java to { Blocks.air },
            Item::class.java to { Items.copper },
            Liquid::class.java to { Liquids.water },
            StatusEffect::class.java to { StatusEffects.none },
            UnitType::class.java to { UnitTypes.alpha },
            Effect::class.java to { Fx.none },
            Team::class.java to { Team.crux },
            Planet::class.java to { Planets.serpulo },
            ShootPattern::class.java to { ShootPattern() },
            Seq::class.java to { Seq<Any>() },
            Category::class.java to { Category.distribution },
            BulletType::class.java to { BasicBulletType() },
            Weapon::class.java to { Weapon() },
            ItemStack::class.java to { ItemStack(Items.copper, 0) },
            LiquidStack::class.java to { LiquidStack(Liquids.water, 0f) },
            PayloadStack::class.java to { PayloadStack(Blocks.air, 0) },
            ItemSeq::class.java to { ItemSeq() },
            AmmoType::class.java to { ItemAmmoType() },
            DrawBlock::class.java to { DrawDefault() },
            DrawMulti::class.java to { DrawMulti() },
            DrawTurret::class.java to { DrawTurret() },
            Weather::class.java to { Weathers.snow },
            DrawPart::class.java to { RegionPart() },
            Ability::class.java to { RegenAbility() },
            Consume::class.java to { ConsumeItems(ItemStack.with(Items.copper, 1)) }
            //TODO 更多待补充
        )

        fun getDefaultForClass(clazz: Class<*>): Any? {
            return defaultValues[clazz]?.invoke()
        }
    }

    fun getValue(): Value {
        defaultValues[field.type]?.let { factory ->
            return Value(factory(), field.type)
        }

        findRegisteredInstance()?.let { instance ->
            return Value(instance, field.type)
        }

        return Value(null, null)
    }

    private fun findRegisteredInstance(): Any? {
        return try {
            val classMap = Vars.parser.classMap
            val className = field.type.simpleName
            classMap?.get(className)
        } catch (e: Exception) {
            null
        }
    }
}

data class Value(var value: Any?, var type: Class<*>?)
