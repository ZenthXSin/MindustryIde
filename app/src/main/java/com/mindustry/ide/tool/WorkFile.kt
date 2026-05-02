package com.mindustry.ide.tool

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

/**
 * 工作文件数据类
 *
 * 用于表示和管理项目中的文件信息，包含文件的元数据和内容。
 *
 * @property fileName 文件名（不含路径）
 * @property creationTime 文件创建时间
 * @property lastModifiedTime 文件最后修改时间
 * @property filePath 文件的完整路径
 * @property description 文件描述信息
 * @property fileSize 文件大小（字节）
 * @property fileExtension 文件扩展名
 * @property content 文件内容
 * @property relativePath 相对于项目根目录的路径
 * @property isHidden 是否为隐藏文件
 */
@Serializable
data class WorkFileData(
    /** 文件名（不含路径） */
    var fileName: String = "",
    /** 文件创建时间 */
    var creationTime: String = "",
    /** 文件最后修改时间 */
    var lastModifiedTime: String = "",
    /** 文件的完整路径 */
    var filePath: String = "",
    /** 文件描述信息 */
    var description: String = "",
    /** 文件大小（字节） */
    var fileSize: Long = 0L,
    /** 文件扩展名 */
    var fileExtension: String = "",
    /** 文件内容 */
    var content: String = "",
    /** 相对于项目根目录的路径 */
    var relativePath: String = "",
    /** 是否为隐藏文件 */
    var isHidden: Boolean = false
) {
    override fun toString(): String {
        return Json.encodeToString(this)//序列化
    }
}

data open class WorkFile(var data: WorkFileData = WorkFileData()) {
    open fun load(json: String) {
        
    }
}
