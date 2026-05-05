package com.mindustry.ide.web

import com.mindustry.ide.tool.json.JsonEditorTool
import com.mindustry.ide.tool.json.JsonParser
import java.io.File

object Vars {
    var parser: JsonParser = JsonParser()
    
    // 文档存储路径(用于保存新文档)
    val docsDir: File by lazy {
        File("docs")
    }
    
    fun init() {
        // 确保文档目录存在
        if (!docsDir.exists()) {
            docsDir.mkdirs()
        }
        
        // 加载内置文档(从 resources)
        loadBuiltinDocuments()

        println(parser.fieldDocs.keys)

        // 加载用户文档(从文件系统)
        //loadDocuments()
    }
    
    /**
     * 加载内置文档(从 classpath resources)
     */
    fun loadBuiltinDocuments() {
        try {
            val resourcePath = "/types"
            val resourceStream = this.javaClass.getResourceAsStream(resourcePath)
            
            if (resourceStream == null) {
                println("⚠ 未找到内置文档资源: $resourcePath")
                return
            }
            
            // 获取 types 目录下的所有 JSON 文件
            val uri = this.javaClass.getResource(resourcePath)?.toURI()
            if (uri == null) {
                println("⚠ 无法获取内置文档资源 URI")
                return
            }
            
            val typesDir = File(uri)
            if (!typesDir.exists() || !typesDir.isDirectory) {
                println("⚠ 内置文档目录不存在: ${typesDir.absolutePath}")
                return
            }
            
            val docFiles = typesDir.listFiles { file ->
                file.isFile && file.extension == "json"
            } ?: emptyArray()
            
            println("正在加载 ${docFiles.size} 个内置文档...")
            
            docFiles.forEach { file ->
                try {
                    val content = file.readText(charset("UTF-8"))
                    parser.let {
                        it.parseJsonToMeta(content)?.let { meta -> it.indexClassMeta(meta) }
                    }
                    println("✓ 已加载内置文档: ${file.name}")
                } catch (e: Exception) {
                    println("✗ 加载内置文档失败: ${file.name} - ${e.message}")
                }
            }
            
            println("内置文档加载完成")
        } catch (e: Exception) {
            println("内置文档加载出错: ${e.message}")
            e.printStackTrace()
        }
    }
    
    /**
     * 加载所有文档
     */
    fun loadDocuments() {
        try {
            val docFiles = docsDir.listFiles { file ->
                file.isFile && file.extension == "json"
            } ?: emptyArray()
            
            println("正在加载 ${docFiles.size} 个文档...")
            
            docFiles.forEach { file ->
                try {
                    val content = file.readText()
                    parser.parseJsonToMeta(content)
                    println("✓ 已加载: ${file.name}")
                } catch (e: Exception) {
                    println("✗ 加载失败: ${file.name} - ${e.message}")
                }
            }
            
            println("文档加载完成")
        } catch (e: Exception) {
            println("文档加载出错: ${e.message}")
            e.printStackTrace()
        }
    }
    
    /**
     * 保存文档
     */
    fun saveDocument(name: String, content: String) {
        try {
            val file = File(docsDir, "$name.json")
            file.writeText(content)
            println("文档已保存: $name")
        } catch (e: Exception) {
            println("保存文档失败: ${e.message}")
            throw e
        }
    }
}