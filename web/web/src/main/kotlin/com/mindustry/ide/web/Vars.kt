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
            
            // 使用 ClassLoader 获取资源 URL，然后列出所有文件
            val resourceUrl = classLoader.getResource(resourcePath)
            if (resourceUrl == null) {
                return
            }
            
            var loadedCount = 0
            
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
                                it.parseJsonToMeta(content)?.let { meta ->
                                    it.indexClassMeta(meta)
                                }
                            }
                            loadedCount++
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            } catch (e: Exception) {
                // JAR 包中无法直接列出文件，使用备用方案
            }
            
            // 如果上面的方法失败（JAR 包中），使用配置文件中的类名列表
            if (loadedCount == 0) {
                // 从配置文件读取类名列表
                val classListStream = classLoader.getResourceAsStream("builtin-classes.txt")
                if (classListStream == null) {
                    return
                }
                
                val classNames = classListStream.bufferedReader().useLines { lines ->
                    lines.map { it.trim() }
                        .filter { it.isNotEmpty() && !it.startsWith("#") }
                        .toList()
                }
                
                classNames.forEach { className ->
                    try {
                        val fileName = "$className.json"
                        val resourceStream = classLoader.getResourceAsStream("$resourcePath$fileName")
                        if (resourceStream != null) {
                            val content = resourceStream.bufferedReader(charset("UTF-8")).use { it.readText() }
                            parser.let {
                                it.parseJsonToMeta(content)?.let { meta ->
                                    it.indexClassMeta(meta)
                                }
                            }
                            loadedCount++
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        } catch (e: Exception) {
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
            
            docFiles.forEach { file ->
                try {
                    val content = file.readText()
                    parser.parseJsonToMeta(content)?.let { meta ->
                        parser.indexClassMeta(meta)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } catch (e: Exception) {
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
        } catch (e: Exception) {
            throw e
        }
    }
}