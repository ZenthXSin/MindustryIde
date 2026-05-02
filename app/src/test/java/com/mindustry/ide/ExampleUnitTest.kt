package com.mindustry.ide

import arc.files.Fi
import mindustry.Vars
import mindustry.core.ContentLoader
import mindustry.mod.DetectingContentParser
import org.junit.BeforeClass
import org.junit.Test
import java.io.File

class ExampleUnitTest {

    companion object {
        @JvmStatic
        @BeforeClass
        fun setupTestEnvironment() {
            if (initialized) return

            // 测试目录路径
            val testDirPath = "app/src/main/assets/config/server"
            val testDir = File(testDirPath)

            println("=== 设置测试环境 ===")
            println("测试目录: ${testDir.absolutePath}")

            // 创建主目录
            if (!testDir.exists()) {
                testDir.mkdirs()
                println("✓ 创建主目录")
            }

            // 创建 Mindustry 标准子目录结构
            val subDirs = listOf(
                "mods",
                "saves",
                "maps",
                "screenshots",
                "tmp",
                "schematics",
                "previews",
                "be_builds",
                "config"
            )

            subDirs.forEach { dirName ->
                val subDir = File(testDir, dirName)
                if (!subDir.exists()) {
                    subDir.mkdirs()
                    println("✓ 创建子目录: $dirName")
                }
            }

            // 创建 version.properties
            val versionFile = File(testDir, "version.properties")
            if (!versionFile.exists()) {
                versionFile.writeText(
                    """
                        number=157
                        modifier=release
                        revision=0
                    """.trimIndent()
                )
                println("✓ 创建 version.properties")
            }

            // 创建 settings.bin（空文件）
            val settingsFile = File(testDir, "settings.bin")
            if (!settingsFile.exists()) {
                settingsFile.createNewFile()
                println("✓ 创建 settings.bin")
            }

            // 创建 server_list.json（空的服务器列表缓存）
            val serverCacheFile = File(testDir, "server_list.json")
            if (!serverCacheFile.exists()) {
                serverCacheFile.writeText("[]")
                println("✓ 创建 server_list.json")
            }

            // 设置工作目录
            System.setProperty("user.dir", testDir.absolutePath)

            try {
                // 初始化 Vars.tree（FileTree 类型）
                if (Vars.tree == null) {
                    Vars.tree = mindustry.core.FileTree()
                }

                // 添加测试目录到文件树
                Vars.tree.addFile(testDirPath,Fi(testDir))

                // 更新 Vars.dataDirectory
                Vars.dataDirectory = Fi(testDir)

                // 更新所有子目录引用
                Vars.screenshotDirectory = Vars.dataDirectory.child("screenshots/")
                Vars.customMapDirectory = Vars.dataDirectory.child("maps/")
                Vars.mapPreviewDirectory = Vars.dataDirectory.child("previews/")
                Vars.saveDirectory = Vars.dataDirectory.child("saves/")
                Vars.tmpDirectory = Vars.dataDirectory.child("tmp/")
                Vars.modDirectory = Vars.dataDirectory.child("mods/")
                Vars.schematicDirectory = Vars.dataDirectory.child("schematics/")
                Vars.bebuildDirectory = Vars.dataDirectory.child("be_builds/")
                Vars.serverCacheFile = Vars.dataDirectory.child("server_list.json")

                println("✓ Vars 目录配置完成")

                // 初始化 ContentLoader
                if (Vars.content == null) {
                    Vars.content = ContentLoader()
                    Vars.content.createBaseContent()

                    println("✓ Mindustry 内容系统初始化成功")
                    println("  Blocks: ${Vars.content.blocks().size}")
                    println("  Items: ${Vars.content.items().size}")
                    println("  Liquids: ${Vars.content.liquids().size}")
                    println("  Units: ${Vars.content.units().size}")
                    println("  StatusEffects: ${Vars.content.statusEffects().size}")
                    println("  Planets: ${Vars.content.planets().size}")
                }

                println("\n✓ 测试环境初始化完成！")

            } catch (e: Exception) {
                println("✗ 初始化失败: ${e.message}")
                e.printStackTrace()
            }

            initialized = true
        }

        private var initialized = false
    }

    @Test
    fun testEnvironmentSetup() {
        println("\n=== 验证测试环境 ===")

        // 验证 Vars.dataDirectory 已设置
        assert(Vars.dataDirectory != null) { "Vars.dataDirectory 应该已设置" }
        println("✓ Vars.dataDirectory: ${Vars.dataDirectory.path()}")

        // 验证子目录
        val requiredDirs = listOf(
            Vars.modDirectory to "mods",
            Vars.saveDirectory to "saves",
            Vars.schematicDirectory to "schematics",
            Vars.tmpDirectory to "tmp"
        )

        requiredDirs.forEach { (dir, name) ->
            assert(dir != null) { "目录应该已设置: $name" }
            println("✓ $name: ${dir.path()}")
        }

        // 验证 ContentLoader
        assert(Vars.content != null) { "Vars.content 应该已初始化" }
        println("✓ ContentLoader 已初始化")
        println("  总内容数: ${Vars.content.getContentMap().sumOf { it.size }}")

        println("\n✓ 环境验证通过")
    }

    @Test
    fun testContentAvailability() {
        val ret = DetectingContentParser().analyzeJsonAndReport(
            """{
  "type": "Wall",
  "size": 2,
  "health": 500,
  "requirements": [
    {"item": "copper", "amount": 10}
  ]
}

            """.trimIndent()
        )
        println(ret)
    }
}
