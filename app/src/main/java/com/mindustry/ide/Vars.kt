package com.mindustry.ide

import android.content.Context
import android.os.Environment
import com.mindustry.ide.tool.json.JsonParser
import java.io.File


object Vars {
    // ide工作目录
    val ideWorkDirection = File(Environment.getExternalStorageDirectory(), "MindustryIDE")
    lateinit var parser: AndroidJsonParser


    fun init(context: Context) {
        //确保ide工作目录存在
        if (!ideWorkDirection.exists()) {
            ideWorkDirection.mkdirs()
        }
        parser = AndroidJsonParser()
    }
}
class AndroidJsonParser(private val fileName: String = "config.json"
) : JsonParser() {


    private val configFile: File = File(Vars.ideWorkDirection, fileName)

    override fun load(路径: File): kotlinx.serialization.json.JsonElement {
        return try {
            val jsonContent = readFile(路径)
            kotlinx.serialization.json.Json.parseToJsonElement(jsonContent)
        } catch (e: Exception) {
            android.util.Log.e("AndroidJsonParser", "解析JSON失败: ${路径.absolutePath}", e)
            // 返回一个空的JsonObject作为容错处理，避免崩溃
            kotlinx.serialization.json.JsonObject(emptyMap())
        }
    }
    fun readFile(路径: File): String {
        return try {
            val json = 路径.readText()
            val meta = parseJsonToMeta(json)
            if (meta != null) {
                indexClassMeta(meta)
            }
            json
        } catch (e: Exception) {
            android.util.Log.e("AndroidJsonParser", "读取或解析文件失败: ${路径.absolutePath}", e)
            throw RuntimeException("读取或解析文件失败: ${路径.absolutePath}", e)
        }
    }
}


