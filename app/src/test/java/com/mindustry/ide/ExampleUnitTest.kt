package com.mindustry.ide

import com.mindustry.ide.tool.json.JsonEditorTool
import mindustry.Vars
import mindustry.core.ContentLoader
import org.junit.BeforeClass
import org.junit.Test
import kotlin.test.assertTrue

class ExampleUnitTest {
    @Test
    fun test() {
        println(com.mindustry.ide.Vars.parser.classMap?.get("ItemStack")?.fields?.size)
    }

    @Test
    fun 完整流程测试() {
        val tool = object : JsonEditorTool() {
            override fun error(message: String) {
                println("\u001B[31m [E] $message\u001B[0m")
            }

            override fun info(message: String) {
                println("\u001B[32m [I] $message\u001B[0m")
            }

            override fun warning(message: String) {
                println("\u001B[33m [W] $message\u001B[0m")
            }

        }
        val jsonWorkFile = tool.new("test") {
            first { it.name == "GenericCrafter" }
        }
        println("为JsonWorkFile添加接口")
        tool.addFieldBuild({
            first { it.field.name == "outputItem" }
        }) { apply {
            value.typeValue.addFieldBuild({
                first { it.field.name == "item" }
            }) { apply { value.value = "copper" } }

            value.typeValue.addFieldBuild({
                first { it.field.name == "amount" }
            }) { apply { value.value = "5" } }
        } }
        println("为JsonWorkFile添加接口")
        tool.addFieldBuild({
            first { it.field.name == "drawer" }
        })
        println("修改接口")
        tool.setFieldBuild("drawer") { apply {
            value.typeValue = tool.getClassBuildByName("DrawRegion")
            value.typeValue.addFieldBuild({
                first { it.field.name == "suffix" }
            }) { apply { value.value = "-rotate" } }
        } }
        println("导出")
        val exported = jsonWorkFile.export()
        println(exported)
        assertTrue(exported.contains("\"type\": \"GenericCrafter\""))
        assertTrue(exported.contains("\"outputItem\""))
    }

    companion object {
        @JvmStatic
        @BeforeClass
        fun setupMindustry() {
            Vars.content = ContentLoader()
            com.mindustry.ide.Vars.initTest()
        }
    }
}
