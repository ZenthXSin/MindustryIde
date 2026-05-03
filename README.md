一个Midnustry mod 编辑器

待办：
框架规划

提交流程：

更新到主分支：
分支 -> pr -> 合并

同步主分支到分支(必须先更新到主分支)：
拉取到分支 —> choose a branch to merge xxx → 选择master

## 安装报错：`packageinfo is null` 处理办法

如果你在安装 APK 时看到类似报错（例如 `INSTALL_FAILED_INVALID_APK: packageinfo is null`），通常是 APK 包本身不完整或安装方式不匹配，按下面顺序排查：

1. **先卸载旧版本再安装**
   - 设备上如果有同包名但签名不同的旧版本，可能导致安装异常。

2. **确认安装的是完整 APK（不是损坏文件）**
   - 不要使用传输过程中被改名/截断的文件。
   - 建议重新构建并重新导出一次 APK 后再安装。

3. **Debug 包请直接用 ADB 安装**
   - 命令：`adb install -r app/build/outputs/apk/debug/app-debug.apk`
   - 如果失败，先执行：`adb uninstall com.mindustry.ide`，再重装。

4. **检查 Android 版本与 ABI**
   - 如果你导出的是拆分包（split APK），不能只装其中一个分包。
   - 需要安装完整 universal APK，或使用 `bundletool` 按设备生成并安装。

5. **清理构建缓存后重打包**
   - 执行：`./gradlew clean assembleDebug`

如果你愿意，我可以根据你当前的完整报错日志（从 `adb logcat` 或 Android Studio 的 Run/Install 输出）帮你精确定位是哪一步出的问题。

如果你是Eve.aic，那请您去看Eve-aic.md

author:zxs, 鱼雷，Eve.aic
