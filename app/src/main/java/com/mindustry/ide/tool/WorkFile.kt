package com.mindustry.ide.tool

data class WorkFile(
    var fileName: String = "",
    var creationTime: String = "",
    var lastModifiedTime: String = "",
    var filePath: String = "",
    var description: String = "",
    var fileSize: Long = 0L,
    var isDirectory: Boolean = false,
    var fileExtension: String = "",
    var content: String = "",
    var relativePath: String = "",
    var isHidden: Boolean = false
)