package com.mindustry.ide.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebApplication

fun main(args: Array<String>) {
    Vars.init()
    runApplication<WebApplication>(*args)
}
