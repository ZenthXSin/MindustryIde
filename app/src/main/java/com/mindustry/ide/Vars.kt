package com.mindustry.ide

import android.content.Context
import com.mindustry.ide.tool.json.Parser
import java.io.File

class AndroidParser(
    storageDir: File, private val fileName: String = "config.json"
) : Parser() {
    private val configFile: File = File(storageDir, fileName)

    override fun load() {
        super.load()
        //在此使用getClassDoc和getFieldDoc进行初始化
    }
}

object Vars {
    lateinit var parser: AndroidParser

    fun init(context: Context) {
        parser = AndroidParser(context.applicationContext.filesDir)
    }
}
