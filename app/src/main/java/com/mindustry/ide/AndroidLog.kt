package com.mindustry.ide

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mindustry.ide.ui.component.MdtButton
import com.mindustry.ide.ui.theme.MindustryIdeTheme
import kotlin.system.exitProcess

object AndroidLog {
    /** 全局错误回调，由 MindustryIdeApp 注册 */
    var onError: ((tag: String, msg: String) -> Unit)? = null

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
        // 写入完成后触发错误页
        onError?.invoke(tag, msg)
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
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = colorScheme.background
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text(
                text = "Error: tag: $tag",
                modifier = Modifier.padding(innerPadding)
                    .fillMaxWidth()
                    .padding(8.dp),
            )
            Box(
                modifier = Modifier
                    .background(colorScheme.surface)
                    .fillMaxWidth()
                    // 沉底但是不挤压占位空白喵~
                    //.weight(1f)
                        ,
                contentAlignment = Alignment.TopStart
            ) {
                val textModifier = Modifier.padding(8.dp)
                LazyColumn { item {
                    Text(
                        text = "[$tag]: $msg",
                        modifier = textModifier,
                        fontFamily = FontFamily.SansSerif
                    )
                } }

            }
            MdtButton(onClick = { 
                // 退出程序
                android.os.Process.killProcess(android.os.Process.myPid())
                exitProcess(0)
            }
            , modifier = Modifier.padding(8.dp)
                    .fillMaxWidth()) {
                Text(text = "关闭",fontFamily = FontFamily.SansSerif)
            }
        }

    }
}
@Preview(showBackground = true, backgroundColor = 0xFF000000, name = "1", showSystemUi = true, device = "id:pixel_5")
@Composable
fun ErrorPagePreview() {
    MindustryIdeTheme {
        ErrorPage("tag", "msg")
    }
}