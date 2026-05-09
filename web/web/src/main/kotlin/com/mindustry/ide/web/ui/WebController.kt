package com.mindustry.ide.web.ui

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * Web 页面控制器
 * 处理页面路由和重定向
 */
@Controller
class WebController {
    
    /**
     * 根路径 - 返回主页
     */
    @GetMapping("/")
    fun index(): String {
        return "forward:/index.html"
    }
}
