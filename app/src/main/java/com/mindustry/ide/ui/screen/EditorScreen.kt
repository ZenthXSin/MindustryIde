package com.mindustry.ide.ui.screen

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
import com.mindustry.ide.ui.editor.MindustryEditor
import java.io.File

@Composable
fun EditorScreen(project: ModProject, onBack: () -> Unit) {
    val context = LocalContext.current
    var files by remember(project.id) { mutableStateOf(ProjectStore.files(context, project.id)) }
    var selectedFile by remember(project.id) { mutableStateOf<File?>(files.firstOrNull()) }
    var content by remember(selectedFile?.absolutePath) { mutableStateOf(selectedFile?.let { ProjectStore.readFile(it) } ?: "") }
    var showNewFile by remember { mutableStateOf(false) }
    var showNewFolder by remember { mutableStateOf(false) }

    Scaffold(topBar = { TopAppBar(title = { Text(project.name) }, navigationIcon = { TextButton(onClick = onBack) { Text("返回") } }, actions = {
        TextButton(onClick = { showNewFile = true }) { Text("新建文件") }
        TextButton(onClick = { showNewFolder = true }) { Text("新建文件夹") }
        TextButton(onClick = { selectedFile?.let { ProjectStore.writeFile(it, content) } }) { Text("保存") }
    }) }) { inner ->
        Row(Modifier.padding(inner).fillMaxSize()) {
            LazyColumn(Modifier.width(220.dp).fillMaxHeight().padding(8.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                item { Text("文件(${files.size})") }
                items(files, key = { it.absolutePath }) { file ->
                    Card(Modifier.fillMaxWidth().combinedClickable(onClick = {
                        selectedFile = file
                        content = ProjectStore.readFile(file)
                    }, onLongClick = {
                        ProjectStore.deletePath(file)
                        files = ProjectStore.files(context, project.id)
                        if (selectedFile == file) { selectedFile = null; content = "" }
                    })) {
                        Text(file.relativeTo(ProjectStore.projectRoot(context, project.id)).path, modifier = Modifier.padding(8.dp))
                    }
                }
            }
            VerticalDivider()
            selectedFile?.let {
                MindustryEditor(content = content, modifier = Modifier.weight(1f).fillMaxHeight())
            } ?: Box(Modifier.weight(1f), contentAlignment = androidx.compose.ui.Alignment.Center) { Text("请选择文件") }
        }
    }

    if (showNewFile) PathDialog("新建文件", onDismiss = { showNewFile = false }) { path ->
        ProjectStore.createFile(context, project.id, path)
        files = ProjectStore.files(context, project.id)
        showNewFile = false
    }
    if (showNewFolder) PathDialog("新建文件夹", onDismiss = { showNewFolder = false }) { path ->
        ProjectStore.createFolder(context, project.id, path)
        files = ProjectStore.files(context, project.id)
        showNewFolder = false
    }
}

@Composable
private fun PathDialog(title: String, onDismiss: () -> Unit, onCreate: (String) -> Unit) {
    var path by remember { mutableStateOf("") }
    AlertDialog(onDismissRequest = onDismiss, title = { Text(title) }, text = { OutlinedTextField(path, { path = it }, label = { Text("相对路径") }) }, confirmButton = {
        TextButton(onClick = { if (path.isNotBlank()) onCreate(path.trim()) }, enabled = path.isNotBlank()) { Text("确定") }
    }, dismissButton = { TextButton(onClick = onDismiss) { Text("取消") } })
}
