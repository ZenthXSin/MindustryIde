package com.mindustry.ide.tool

import android.content.Context
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class ModProject(
    val id: String,
    var name: String,
    var description: String = "",
    var author: String = "",
    val createdAt: Long = System.currentTimeMillis(),
)

object ProjectStore {
    private val json = Json { prettyPrint = true; ignoreUnknownKeys = true }

    private fun rootDir(context: Context): File = File(context.filesDir, "projects").apply { mkdirs() }
    private fun projectDir(context: Context, id: String): File = File(rootDir(context), id).apply { mkdirs() }

    fun listProjects(context: Context): List<ModProject> {
        return rootDir(context).listFiles()?.mapNotNull { dir ->
            runCatching {
                json.decodeFromString<ModProject>(File(dir, "project.json").readText())
            }.getOrNull()
        }?.sortedByDescending { it.createdAt } ?: emptyList()
    }

    fun createProject(context: Context, name: String, description: String, author: String): ModProject {
        val id = "p_${System.currentTimeMillis()}"
        val project = ModProject(id = id, name = name, description = description, author = author)
        val dir = projectDir(context, id)
        File(dir, "project.json").writeText(json.encodeToString(project))
        File(dir, "mod.json").writeText("""{\n  \"name\": \"$name\",\n  \"author\": \"$author\",\n  \"description\": \"$description\",\n  \"version\": \"1.0\"\n}""")
        File(dir, "scripts").mkdirs()
        File(dir, "content").mkdirs()
        File(dir, "bundles").mkdirs()
        return project
    }

    fun files(context: Context, projectId: String): List<File> {
        return projectDir(context, projectId).walkTopDown().filter { it.isFile && it.name != "project.json" }.toList()
    }

    fun readFile(file: File): String = file.takeIf { it.exists() }?.readText() ?: ""
    fun writeFile(file: File, content: String) { file.parentFile?.mkdirs(); file.writeText(content) }
    fun createFile(context: Context, projectId: String, relativePath: String) { File(projectDir(context, projectId), relativePath).apply { parentFile?.mkdirs(); if (!exists()) writeText("") } }
    fun createFolder(context: Context, projectId: String, relativePath: String) { File(projectDir(context, projectId), relativePath).mkdirs() }
    fun deletePath(path: File) { if (path.isDirectory) path.deleteRecursively() else path.delete() }
    fun projectRoot(context: Context, id: String): File = projectDir(context, id)
}
