package com.mindustry.ide.tool.json

import mindustry.mod.ClassMap
import java.io.File

abstract class Parser {
    abstract fun write(路径: File,内容: String): Boolean
    abstract fun read(路径: File): String
    abstract fun hasConfig(): Boolean

    fun load() {
        if (hasConfig()) {
            //你TODO一下
            read(File(""))
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

