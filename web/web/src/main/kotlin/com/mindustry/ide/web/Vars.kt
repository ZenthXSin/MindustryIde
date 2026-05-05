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
            val classLoader = this.javaClass.classLoader
            val resourcePath = "types/"
            
            println("正在加载内置文档...")
            
            // 使用 ClassLoader 获取资源 URL，然后列出所有文件
            val resourceUrl = classLoader.getResource(resourcePath)
            if (resourceUrl == null) {
                println("⚠ 未找到内置文档资源: $resourcePath")
                return
            }
            
            var loadedCount = 0
            var errorCount = 0
            
            // 尝试从 URL 中读取文件列表（适用于开发环境和某些 JAR 打包方式）
            try {
                val uri = resourceUrl.toURI()
                val typesDir = java.io.File(uri)
                
                if (typesDir.exists() && typesDir.isDirectory) {
                    val jsonFiles = typesDir.listFiles { file ->
                        file.isFile && file.extension == "json"
                    } ?: emptyArray()
                    
                    jsonFiles.forEach { file ->
                        try {
                            val content = file.readText(charset("UTF-8"))
                            parser.let {
                                it.parseJsonToMeta(content)?.let { meta -> it.indexClassMeta(meta) }
                            }
                            loadedCount++
                        } catch (e: Exception) {
                            errorCount++
                            println("✗ 加载失败: ${file.name} - ${e.message}")
                        }
                    }
                }
            } catch (e: Exception) {
                // JAR 包中无法直接列出文件，使用备用方案
                println("使用备用加载方案...")
            }
            
            // 如果上面的方法失败（JAR 包中），使用配置文件中的类名列表
            if (loadedCount == 0) {
                println("使用备用加载方案...")
                
                // 从配置文件读取类名列表
                val classListStream = classLoader.getResourceAsStream("builtin-classes.txt")
                if (classListStream == null) {
                    println("⚠ 未找到 builtin-classes.txt 配置文件")
                    return
                }
                
                val classNames = classListStream.bufferedReader().useLines { lines ->
                    lines.map { it.trim() }
                        .filter { it.isNotEmpty() && !it.startsWith("#") }
                        .toList()
                }
                
                println("从配置文件读取到 ${classNames.size} 个类名")
                
                classNames.forEach { className ->
                    try {
                        val fileName = "$className.json"
                        val resourceStream = classLoader.getResourceAsStream("$resourcePath$fileName")
                        if (resourceStream != null) {
                            val content = resourceStream.bufferedReader(charset("UTF-8")).use { it.readText() }
                            parser.let {
                                it.parseJsonToMeta(content)?.let { meta -> it.indexClassMeta(meta) }
                            }
                            loadedCount++
                        }
                    } catch (e: Exception) {
                        errorCount++
                    }
                }
            }
            
            println("内置文档加载完成，共加载 $loadedCount 个文件${if (errorCount > 0) "，$errorCount 个失败" else ""}")
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