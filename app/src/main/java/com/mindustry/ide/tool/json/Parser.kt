package com.mindustry.ide.tool.json

import mindustry.mod.ClassMap

abstract class Parser {
    abstract fun write()
    abstract fun read()
    abstract fun hasConfig(): Boolean

    fun load() {
        if (hasConfig()) {
            read()
        } else {

        }
    }
}

data class ClassData(
    val name: String,
    val fields: List<FieldData>
)

data class FieldData(
    val name: String,
    val type: String,
    val default: Any?
)

