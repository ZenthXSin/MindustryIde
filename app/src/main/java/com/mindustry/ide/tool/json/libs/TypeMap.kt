package com.mindustry.ide.tool.json.libs

import com.mindustry.ide.Vars

class TypeMap {
    val types: MutableMap<String, Class<*>> = mutableMapOf()

    init {
        types.apply {
            put("String", String::class.java)
            put("Boolean", Boolean::class.java)
            put("Number", Int::class.java)
            put("Number", Float::class.java)
            put("Number", Double::class.java)
            put("Number", Long::class.java)
            put("Number", Short::class.java)
            Vars.parser.classMap?.forEach { entry ->
                put(entry.key ?: "", entry.value ?: Class.forName("java.lang.Object"))
            }
        }
    }
}