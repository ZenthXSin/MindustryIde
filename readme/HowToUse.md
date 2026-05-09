# 📱 Android 使用方法

## 方式一：APK 安装（推荐）

直接下载并安装 `.apk` 文件即可使用。

> ⚠️ **注意**：如果安装时提示签名问题，可能需要手动对 APK 进行签名。

---

## 方式二：Web 版本运行

通过 Termux 在 Android 设备上运行 Web 服务器：

### 步骤

1. **安装 Termux**
   - 从 [F-Droid](https://f-droid.org/) 或 GitHub 下载 Termux

2. **安装 JDK 21**
   ```bash
   pkg install openjdk-21
   ```

3. **下载 Web JAR 包**
   - 从 Release 页面下载 `web-xxx-xxx.jar` 文件

4. **运行服务**
   ```bash
   java -jar web-xxx-xxx.jar
   ```

5. **访问应用**
   - 打开浏览器访问：`http://localhost:8080`

---

# 💻 其他设备使用方法

适用于 Windows、macOS、Linux 等桌面系统。

### 前置要求

- ✅ Java Development Kit (JDK) 21 或更高版本

### 运行步骤

1. **下载 JAR 包**
   - 从 Release 页面下载最新的 `web-xxx-xxx.jar` 文件

2. **运行应用**
   ```bash
   java -jar web-xxx-xxx.jar
   ```

3. **访问应用**
   - 应用会自动在浏览器中打开 `http://localhost:8080`
   - 如果未自动打开，请手动访问上述地址

---

## 📝 常见问题

### Q: 如何检查 Java 版本？
```bash
java -version
```
确保输出显示版本为 21 或更高。

### Q: 端口被占用怎么办？
可以在启动时指定其他端口：
```bash
java -jar web-xxx-xxx.jar --server.port=8081
```

### Q: 如何停止服务？
在终端中按 `Ctrl + C` 即可停止服务。