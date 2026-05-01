package com.mindustry.ide

import android.content.Context
import com.mindustry.ide.tool.json.Parser
import java.io.File

class AndroidParser(
    storageDir: File,
    private val fileName: String = "config.json"
) : Parser() {

    private val configFile: File = File(storageDir, fileName)

    override fun hasConfig(): Boolean {
        return configFile.exists() && configFile.length() > 0L
    }

    /** 读取文件全部内容 */
    override fun read(路径: File): String {
        if (!hasConfig()) return ""
        try {
            return 路径.readText()
        } catch (e: Exception) {
            e.printStackTrace()
            return ""
        }
    }

    /** 写入文件（基类入口） */
    override fun write(路径: File,内容: String): Boolean {
        try {
            路径.writeText(内容)
            return true
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
    }
}

object Vars {
    lateinit var parser: AndroidParser

    fun init(context: Context) {
        parser = AndroidParser(context.applicationContext.filesDir)
        parser.load()
    }
}
