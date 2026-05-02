package com.mindustry.ide

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

object AndroidLog {
    fun log(tag: String, msg: String){
        println("$tag: $msg")
        try {
            val logDir = java.io.File(Vars.ideWorkDirection.path + "/log")
            // 确保目录存在
            if (!logDir.exists()) {
                logDir.mkdirs()
            }
            val file = java.io.File(logDir, "log.txt")
            // 以追加模式写入，并添加换行符
            file.appendText("$tag: $msg\n")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    fun i(tag: String, msg: String) {
        log(tag, msg)
    }
    fun e(tag: String, msg: String) {
        log(tag, msg)
    }
    fun d(tag: String, msg: String) {
        log(tag, msg)
    }
    fun w(tag: String, msg: String) {
        log(tag, msg)
    }

}
@Composable
fun ErrorPage(tag: String, msg: String) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Greeting(
            name = "Android",
            modifier = Modifier.padding(innerPadding)
        )
    }
}