// 全局仓库管理
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "web"

// 包含 tool 模块
include(":tool")
project(":tool").projectDir = file("../../tool")
