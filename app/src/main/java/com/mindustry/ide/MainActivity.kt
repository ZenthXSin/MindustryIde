package com.mindustry.ide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.mindustry.ide.ui.theme.MindustryIdeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MindustryIdeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MindustryIdeApp()
                }
            }
        }
    }
}

//@PreviewScreenSizes
@Composable
fun MindustryIdeApp() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.HOME) }
    // 导航栏框架
    NavigationSuiteScaffold(
        containerColor = colorScheme.surface,
        contentColor = colorScheme.onSurface,
        //modifier = Modifier.background(MaterialTheme.colorScheme.surface),
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
        首页内容(
            name = "Android"
        )

    }
}

enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    HOME("Home", Icons.Default.Home),
    FAVORITES("Favorites", Icons.Default.Favorite),
    PROFILE("Profile", Icons.Default.AccountBox),
}

@Composable
fun 首页内容(name: String) {
    Scaffold(
        containerColor = colorScheme.surface,
        contentColor = colorScheme.onSurface,
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
    ) { innerPadding ->
        // 竖列菜单
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(8.dp)
                .fillMaxWidth()
                .fillMaxHeight()

        ) {
            Text(
                text = "Hello $name!",
                modifier = Modifier

            )
            分割线()
            Box(
                modifier = Modifier
                    .background(colorScheme.surface)
                    .fillMaxWidth()
                    // 沉底但是不挤压占位空白喵~
                    .weight(1f)
                ,// 所有子项水平居中
                contentAlignment = Alignment.Center
            ){
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .padding(8.dp),
                    // 所有子项水平居中
                    horizontalAlignment = Alignment.CenterHorizontally,
                    // 项间距
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Spacer(modifier = Modifier.height(32.dp))
                    Button({}) {
                        Text("开始")
                    }
                    Button({}) {
                        Text("工具")
                    }
                    Text("↓怎么办?↓")
                    Button({}) {
                        Text("QQ")
                    }
                    Button({}) {
                        Text("BliBli")
                    }

                }
            }
            // 垂直占位 (高度)
            //Spacer(modifier = Modifier.height(32.dp))
        }
    }

}
@Composable
fun 分割线(){
    HorizontalDivider(
        modifier = Modifier.padding(vertical = 8.dp),
        thickness = 1.dp,       // 线粗细
        color = MaterialTheme.colorScheme.outlineVariant // 颜色
    )
}

@Preview(showBackground = true, name = "1", showSystemUi = false, device = "id:pixel_5")
@Composable
fun GreetingPreview() {
    MindustryIdeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            MindustryIdeApp()
        }
    }
}