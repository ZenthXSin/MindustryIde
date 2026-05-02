package com.mindustry.ide

import android.content.Context
import com.mindustry.ide.tool.json.JsonParser
import java.io.File

class AndroidJsonParser(
    storageDir: File, private val fileName: String = "config.json"
) : JsonParser() {
    private val configFile: File = File(storageDir, fileName)

    override fun load() {
        super.load()
        //在此使用getClassDoc和getFieldDoc进行初始化
        
    }
}

object Vars {
    var parser: JsonParser = JsonParser()

    fun init(context: Context) {
        parser = AndroidJsonParser(context.applicationContext.filesDir)
    }
}
