package com.mindustry.ide

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.mindustry.ide.tool.ModProject
import com.mindustry.ide.tool.ProjectStore
import com.mindustry.ide.ui.screen.EditorScreen
import com.mindustry.ide.ui.theme.MindustryIdeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Vars.init(this)
        enableEdgeToEdge()
        setContent { MindustryIdeTheme { MindustryIdeApp() } }
    }
}

@Composable
fun MindustryIdeApp() {
    var currentProject by remember { mutableStateOf<ModProject?>(null) }
    if (currentProject == null) HomeScreen(onOpenProject = { currentProject = it })
    else EditorScreen(project = currentProject!!, onBack = { currentProject = null })
}

@Composable
private fun HomeScreen(onOpenProject: (ModProject) -> Unit) {
    val context = LocalContext.current
    var projects by remember { mutableStateOf(ProjectStore.listProjects(context)) }
    var showCreateDialog by remember { mutableStateOf(false) }
    var manageProject by remember { mutableStateOf<ModProject?>(null) }

    val storagePermissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) arrayOf() else arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {}
    LaunchedEffect(Unit) { if (storagePermissions.isNotEmpty()) launcher.launch(storagePermissions) }

    Scaffold { inner ->
        Column(Modifier.padding(inner).padding(16.dp).fillMaxSize(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Mindustry Mod IDE", style = MaterialTheme.typography.headlineSmall)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = { showCreateDialog = true }, modifier = Modifier.weight(1f)) { Text("开始（新建项目）") }
                OutlinedButton(onClick = { projects = ProjectStore.listProjects(context) }, modifier = Modifier.weight(1f)) { Text("刷新项目") }
            }
            Text("项目列表（点击继续编辑，长按管理）")
            LazyColumn(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                items(projects, key = { it.id }) { p ->
                    Card(Modifier.fillMaxWidth().combinedClickable(onClick = { onOpenProject(p) }, onLongClick = { manageProject = p })) {
                        Column(Modifier.padding(12.dp)) {
                            Text(p.name, style = MaterialTheme.typography.titleMedium)
                            if (p.description.isNotBlank()) Text(p.description)
                            if (p.author.isNotBlank()) Text("作者: ${p.author}")
                        }
                    }
                }
            }
        }
    }

    if (showCreateDialog) CreateProjectDialog(onDismiss = { showCreateDialog = false }, onCreate = { n, d, a ->
        ProjectStore.createProject(context, n, d, a)
        projects = ProjectStore.listProjects(context)
        showCreateDialog = false
    })

    manageProject?.let { p ->
        AlertDialog(onDismissRequest = { manageProject = null }, title = { Text("管理项目") }, text = { Text(p.name) },
            confirmButton = { TextButton(onClick = { ProjectStore.deletePath(ProjectStore.projectRoot(context, p.id)); projects = ProjectStore.listProjects(context); manageProject = null }) { Text("删除") } },
            dismissButton = { TextButton(onClick = { manageProject = null }) { Text("取消") } })
    }
}

@Composable
private fun CreateProjectDialog(onDismiss: () -> Unit, onCreate: (String, String, String) -> Unit) {
    var name by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var author by remember { mutableStateOf("") }
    AlertDialog(onDismissRequest = onDismiss, title = { Text("新建项目") }, text = {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(name, { name = it }, label = { Text("项目名称*") })
            OutlinedTextField(description, { description = it }, label = { Text("介绍") })
            OutlinedTextField(author, { author = it }, label = { Text("作者") })
        }
    }, confirmButton = {
        TextButton(onClick = { if (name.isNotBlank()) onCreate(name.trim(), description.trim(), author.trim()) }, enabled = name.isNotBlank()) { Text("创建") }
    }, dismissButton = { TextButton(onClick = onDismiss) { Text("取消") } })
}
