# 下一步操作指南

## ⚠️ 重要：需要执行 Gradle 同步

由于创建了新的模块并修改了依赖关系，你需要执行以下操作：

### 1. 同步 Gradle 项目

在 Android Studio 中：
- 点击 **"Sync Now"** 按钮（通常在顶部通知栏）
- 或者：**File → Sync Project with Gradle Files**

在命令行中：
```bash
./gradlew build
```

### 2. 如果看到编译错误

这是正常的！IDE 可能需要时间来索引新模块。请：

1. **等待 IDE 完成索引**（查看底部状态栏）
2. **清除缓存并重启**：
   - File → Invalidate Caches → Invalidate and Restart
3. **重新同步 Gradle**

### 3. 验证模块是否正确配置

运行以下命令检查 tool 模块：
```bash
./gradlew :tool:build
```

检查 app 模块：
```bash
./gradlew :app:build
```

### 4. 常见问题

#### Q: 看到 "Unresolved reference" 错误
**A**: 这是正常的，等待 Gradle 同步完成后会自动解决

#### Q: 看到 "Module not found: tool"
**A**: 确保 `settings.gradle.kts` 中包含 `include(":tool")`

#### Q: 编译失败
**A**: 尝试以下步骤：
1. 清理项目：`./gradlew clean`
2. 重新构建：`./gradlew build`
3. 清除缓存：File → Invalidate Caches → Restart

### 5. 测试新模块

运行单元测试：
```bash
./gradlew :app:test
```

### 6. 确认迁移成功

检查以下文件是否正确更新：
- ✅ `settings.gradle.kts` - 包含 `include(":tool")`
- ✅ `build.gradle.kts` (根目录) - 包含 Kotlin JVM 插件
- ✅ `tool/build.gradle.kts` - 新建的模块配置
- ✅ `app/build.gradle.kts` - 包含 `implementation(project(":tool"))`
- ✅ 测试文件使用新的 parser 参数

### 7. 清理旧文件（可选）

确认新模块工作正常后，可以删除备份：
```bash
# Windows PowerShell
Remove-Item -Recurse -Force "app\src\main\java\com\mindustry\ide\tool.backup"
```

## 📝 使用新模块的示例

创建 JSON 编辑器时，现在需要传入 parser：

```kotlin
// 之前（错误）
val tool = object : JsonEditorTool() { ... }

// 现在（正确）
val tool = object : JsonEditorTool(Vars.parser) { ... }
```

## 🎯 主要改进

1. ✅ Tool 现在是独立的 JVM 模块
2. ✅ Parser 通过构造函数传入（依赖注入）
3. ✅ 可以在不同环境复用（Android、JVM、测试）
4. ✅ 更容易进行单元测试

## 📚 相关文档

- [tool/README.md](tool/README.md) - 模块使用文档
- [MIGRATION.md](MIGRATION.md) - 详细的迁移说明

## ❓ 需要帮助？

如果遇到问题，请检查：
1. Gradle 版本是否正确（8.13）
2. Kotlin 版本是否一致（2.3.21）
3. 所有依赖是否正确配置
4. IDE 是否完成索引

---

**提示**: 首次同步可能需要几分钟时间，因为需要下载依赖和索引代码。请耐心等待！
