plugins {
    kotlin("jvm") version "2.2.21"
    kotlin("plugin.spring") version "2.2.21"
    id("org.springframework.boot") version "4.0.6"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.mindustry.ide"
version = "0.0.1-SNAPSHOT"
description = "web"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webmvc")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("tools.jackson.module:jackson-module-kotlin")
    
    // Kotlin Serialization (tool 模块的传递依赖)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
    
    // 依赖 tool 模块编译后的 JAR
    implementation(files("../../tool/build/libs/tool.jar"))
    
    // Mindustry Core (运行时依赖)
    val mindustryVersion = "v157.4"
    implementation("com.github.Anuken.Mindustry:core:$mindustryVersion")
    implementation("com.github.Anuken.Arc:arc-core:$mindustryVersion")
    
    testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

// 配置运行任务的字符编码
tasks.withType<JavaExec> {
    jvmArgs("-Dfile.encoding=UTF-8", "-Dconsole.encoding=UTF-8")
}

// 确保所有 Java 编译任务使用 UTF-8
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
