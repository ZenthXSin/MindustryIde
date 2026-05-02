package com.mindustry.ide

import com.mindustry.ide.tool.json.ClassBuild
import com.mindustry.ide.tool.json.JsonWorkFile
import mindustry.mod.ClassMap
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun test() {
        mindustry.server.ServerLauncher.main(arrayOf())
        ClassBuild(ClassMap.classes["Block"]).fieldBuilds.forEach {
            println(it.field.name)
        }
        println("总：${ClassMap.classes["Block"].fields.size} 必须：${ClassBuild(ClassMap.classes["Block"]).fieldBuilds.size}")
    }
}
