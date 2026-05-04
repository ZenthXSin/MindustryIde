package com.mindustry.ide.tool.json

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun JsonEditorScreen(
    tool: JsonEditorTool,
    modifier: Modifier = Modifier,
    onExport: (String) -> Unit = {}
) {
    var projectName by remember { mutableStateOf("new_project") }
    var className by remember { mutableStateOf("GenericCrafter") }
    var refreshTick by remember { mutableIntStateOf(0) }
    var fieldNameInput by remember { mutableStateOf("") }
    var selectedFieldName by remember { mutableStateOf<String?>(null) }
    var fieldValue by remember { mutableStateOf("") }

    val workFile = tool.getCurrentWorkFileOrNull()
    val addedFields = remember(refreshTick) { workFile?.classBuild?.fieldBuilds?.toList() ?: emptyList() }

    Column(modifier = modifier.fillMaxSize().padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Json 图形化编辑器", style = MaterialTheme.typography.titleLarge)
        OutlinedTextField(value = projectName, onValueChange = { projectName = it }, label = { Text("项目名") }, modifier = Modifier.fillMaxWidth())
        OutlinedTextField(value = className, onValueChange = { className = it }, label = { Text("根类型(Class)") }, modifier = Modifier.fillMaxWidth())
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = {
                tool.new(projectName) { firstOrNull { it.name == className } ?: first() }
                refreshTick++
            }) { Text("新建项目") }
            Button(onClick = {
                val exported = tool.exportCurrentJson(true)
                if (exported.isNotBlank()) onExport(exported)
            }) { Text("导出 JSON") }
        }

        OutlinedTextField(
            value = fieldNameInput,
            onValueChange = { fieldNameInput = it },
            label = { Text("输入要添加的 field 名") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = {
            if (workFile != null && fieldNameInput.isNotBlank()) {
                tool.addFieldBuild({ first { it.field.name == fieldNameInput } })
                fieldNameInput = ""
                refreshTick++
            }
        }) { Text("添加字段") }

        Text("已添加字段（列表）", style = MaterialTheme.typography.titleMedium)
        LazyColumn(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(addedFields, key = { it.field.name }) { field ->
                Card(modifier = Modifier.fillMaxWidth().clickable {
                    selectedFieldName = field.field.name
                    fieldValue = field.value.value
                }) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Text(field.field.name, style = MaterialTheme.typography.titleSmall)
                        Text("值: ${field.value.value.ifBlank { "<对象/未设置>" }}", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }

    if (selectedFieldName != null) {
        AlertDialog(
            onDismissRequest = { selectedFieldName = null },
            title = { Text("编辑字段: $selectedFieldName") },
            text = {
                OutlinedTextField(
                    value = fieldValue,
                    onValueChange = { fieldValue = it },
                    label = { Text("字段值") },
                    modifier = Modifier.fillMaxWidth()
                )
            },
            confirmButton = {
                TextButton(onClick = {
                    selectedFieldName?.let { name ->
                        tool.setFieldBuild(name) { value.value = fieldValue }
                        refreshTick++
                    }
                    selectedFieldName = null
                }) { Text("保存") }
            },
            dismissButton = { TextButton(onClick = { selectedFieldName = null }) { Text("取消") } }
        )
    }
}
