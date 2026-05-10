package com.mindustry.ide.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebApplication

fun main(args: Array<String>) {
    Vars.init()
    runApplication<WebApplication>(*args)
    Runtime.getRuntime().exec("cmd /c start http://localhost:8080/")
    Thread.sleep(1000)
    println("服务器已在8080端口启动")
}
