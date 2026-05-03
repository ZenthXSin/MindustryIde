package com.mindustry.ide

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import android.graphics.BitmapFactory
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.mindustry.ide.ui.component.MdtButton
import com.mindustry.ide.ui.screen.EditorScreen
import com.mindustry.ide.ui.theme.MindustryIdeTheme
import com.mindustry.ide.AndroidLog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Vars.init(this)

        enableEdgeToEdge()
        setContent {
            MindustryIdeTheme {
                MindustryIdeApp()
            }
        }
    }
}

@Composable
fun 分割线() {
    HorizontalDivider(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .background(colorScheme.surface),
        thickness = 1.dp,       // 线粗细
        color = colorScheme.surface // 颜色
    )
}

//@PreviewScreenSizes
@Composable
fun MindustryIdeApp() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.HOME) }

    // 存储权限请求
    val storagePermissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        // Android 13+ 不再需要 READ/WRITE_EXTERNAL_STORAGE
        arrayOf()
    } else {
        arrayOf(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
    }

    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { results ->
        // 可在此处理用户授权结果
    }

    // 首次进入自动请求权限
    if (storagePermissions.isNotEmpty()) {
        LaunchedEffect(Unit) {
            launcher.launch(storagePermissions)
        }
    }

    // 全局错误状态 — 由 AndroidLog.log() 触发
    var errorTag by remember { mutableStateOf("") }
    var errorMsg by remember { mutableStateOf("") }
    var hasError by remember { mutableStateOf(false) }

    // 注册 AndroidLog 回调
    DisposableEffect(Unit) {
        AndroidLog.onError = { tag, msg ->
            errorTag = tag
            errorMsg = msg
            hasError = true
        }
        onDispose {
            AndroidLog.onError = null
        }
    }

    if (hasError) {
        ErrorPage(tag = errorTag, msg = errorMsg)
    } else {
    // 导航栏框架
    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            it.icon,
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it }
                )
            }
        }
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = colorScheme.surface
        ) { innerPadding ->
            when (currentDestination) {
                AppDestinations.EDITOR -> {
                    EditorScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
                else -> {
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
    } // if-else
}

enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    HOME("Home", Icons.Default.Home),
    EDITOR("Editor", Icons.Default.Create),
    FAVORITES("Favorites", Icons.Default.Favorite),
    PROFILE("Profile", Icons.Default.AccountBox),
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val colorScheme = MaterialTheme.colorScheme
    // 上面已经把innerPadding加上了, 这边直接用modifier就行了
    // 竖列菜单
    Column(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .fillMaxHeight()

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorScheme.surface)
        ) {
            Text(
                text = "Hello $name!",
                modifier = Modifier
            )
        }
        分割线()
        Box(
            modifier = Modifier
                .background(colorScheme.background)
                .fillMaxWidth()
                // 沉底但是不挤压占位空白喵~
                .weight(1f),// 所有子项水平居中

            contentAlignment = Alignment.TopCenter
        ) {
            val buttonsModifier = Modifier
                .fillMaxWidth()
            Column(

            ) {
                Column(
                    modifier = Modifier
                        .padding(8.dp),
                    // 所有子项水平居中
                    horizontalAlignment = Alignment.CenterHorizontally,
                    // 项间距
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    val columnModifier = buttonsModifier.padding(horizontal = 16.dp)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                    ) { Text("怎么办?") }

                    MdtButton(
                        onClick = {},
                        modifier = columnModifier
                    ) {
                        Text("QQ", fontFamily = FontFamily.SansSerif)
                    }
                    MdtButton(
                        onClick = {},
                        modifier = columnModifier
                    ) {
                        Text("BliBli", fontFamily = FontFamily.SansSerif)
                    }

                    // 垂直占位 (高度)
                    Spacer(modifier = Modifier.height(16.dp))

                    Column(
                        modifier = Modifier
                            .padding(4.dp),
                        // 所有子项水平居中
                        horizontalAlignment = Alignment.CenterHorizontally,
                        // 项间距
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        val rowModifier = buttonsModifier
                            .padding(horizontal = 4.dp)
                            .height(128.dp)
                        //Spacer(modifier = Modifier.height(32.dp))
                        分割线()
                        // 垂直占位 (高度)
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                        ) { Text("开始吧.") }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                        ) {
                            val context = LocalContext.current
                            val pixelOptions = android.graphics.BitmapFactory.Options().apply {
                                inScaled = false        // 禁止按密度缩放
                                inDither = false        // 关闭抖动
                            }
                            val addIcon = remember {
                                BitmapFactory.decodeStream(
                                    context.assets.open("mdtRawAssets/icons/add.png"),
                                    null, pixelOptions
                                )?.asImageBitmap()
                            }
                            val folderIcon = remember {
                                BitmapFactory.decodeStream(
                                    context.assets.open("mdtRawAssets/icons/folder.png"),
                                    null, pixelOptions
                                )?.asImageBitmap()
                            }
                            MdtButton(
                                onClick = {
                                    AndroidLog.log("Mdt", "点击了开始")
                                },
                                modifier = rowModifier.weight(1f)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    if (addIcon != null) {
                                        androidx.compose.foundation.Image(
                                            bitmap = addIcon,
                                            contentDescription = null,
                                            modifier = Modifier.size(28.dp),
                                            contentScale = androidx.compose.ui.layout.ContentScale.Fit
                                        )
                                    }
                                    Text("开始")
                                }
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            MdtButton(
                                onClick = {},
                                modifier = rowModifier.weight(1f)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    if (folderIcon != null) {
                                        androidx.compose.foundation.Image(
                                            bitmap = folderIcon,
                                            contentDescription = null,
                                            modifier = Modifier.size(28.dp),
                                            contentScale = androidx.compose.ui.layout.ContentScale.Fit
                                        )
                                    }
                                    Text("打开工程")
                                }
                            }
                        }


                    }

                }
            }
        }


    }

}


@Preview(showBackground = true, backgroundColor = 0xFF000000, name = "1", showSystemUi = true, device = "id:pixel_5")
@Composable
fun GreetingPreview() {
    MindustryIdeTheme(darkTheme = true) {
        MindustryIdeApp()
    }
}