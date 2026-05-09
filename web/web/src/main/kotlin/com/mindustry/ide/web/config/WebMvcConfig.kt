package com.mindustry.ide.web.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.io.Resource
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.resource.PathResourceResolver

/**
 * Web MVC 配置
 * 处理 SPA 路由，确保所有非 API、非静态资源的路径都返回 index.html
 */
@Configuration
class WebMvcConfig : WebMvcConfigurer {
    
    override fun addViewControllers(registry: ViewControllerRegistry) {
        // 根路径映射到 index.html
        registry.addViewController("/").setViewName("forward:/index.html")
    }
    
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        // 配置静态资源处理
        registry.addResourceHandler("/**")
            .addResourceLocations("classpath:/static/")
            .resourceChain(true)
            .addResolver(object : PathResourceResolver() {
                override fun getResource(resourcePath: String, location: Resource): Resource? {
                    val requestedResource = location.createRelative(resourcePath)
                    
                    // 如果资源存在且可读，返回该资源
                    if (requestedResource.exists() && requestedResource.isReadable) {
                        return requestedResource
                    }
                    
                    // 否则返回 index.html（用于 SPA 路由）
                    // 排除 API 路径
                    if (!resourcePath.startsWith("api/")) {
                        return location.createRelative("index.html")
                    }
                    
                    return null
                }
            })
    }
}
