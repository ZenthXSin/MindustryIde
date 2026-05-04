package com.mindustry.ide.tool.json

import arc.struct.ObjectMap
import kotlinx.serialization.Serializable
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.json.Json
import mindustry.mod.ClassMap
import java.io.File

@OptIn(InternalSerializationApi::class)
@Serializable
data class FieldMeta(val name: String, val type: String, val defaultValue: String, val notes: String)

@OptIn(InternalSerializationApi::class)
@Serializable
data class TypeMeta(val type: String, val parentType: String, val fields: List<FieldMeta>)

open class JsonParser {
    // 类&字段 文档
    val classDocs = mutableMapOf<String, TypeMeta>()
    val fieldDocs = mutableMapOf<String, MutableMap<String, FieldMeta>>()
    // 类映射
    val classMap: ObjectMap<String?, Class<*>?>? = ClassMap.classes

    companion object {
        // JSON 格式
        private val jsonFormat = Json { ignoreUnknownKeys = true }
    }

    // 字段默认值
    fun getFieldDefaultValue(className: String, fieldName: String): String {
        return fieldDocs[className]?.get(fieldName)?.defaultValue ?: "null"
    }

    fun getFieldDefaultValue(fieldName: String): List<String> {
        val ret = mutableListOf<String>()
        fieldDocs.forEach { (className, fieldMap) ->
            fieldMap.filter {
                it.value.name == fieldName
            }.forEach { ret += getFieldDefaultValue(className, it.key) }
        }
        if (ret.isEmpty()) ret += "null"
        return ret
    }

    fun getFieldDoc(className: String, fieldName: String): String {
        return fieldDocs[className]?.get(fieldName)?.notes ?: ""
    }

    // 类文档
    fun getClassDoc(className: String): String {
        val meta = classDocs[className] ?: return ""
        return "Type: ${meta.type}\nParent: ${meta.parentType}\nFields: ${meta.fields.size}"
    }

    // 所有字段
    fun getAllFields(className: String): List<FieldMeta> {
        return classDocs[className]?.fields ?: emptyList()
    }
    // 父类
    fun getParentType(className: String): String {
        return classDocs[className]?.parentType ?: ""
    }
    
    protected fun parseJsonToMeta(json: String): TypeMeta? {
        return try {
            jsonFormat.decodeFromString(TypeMeta.serializer(), json)
        } catch (e: Exception) {
            null
        }
    }
    
    protected fun indexClassMeta(meta: TypeMeta) {
        classDocs[meta.type] = meta
        val fieldMap = fieldDocs.getOrPut(meta.type) { mutableMapOf() }
        meta.fields.forEach { field ->
            fieldMap[field.name] = field
        }
    }

    open fun load(路径: File): kotlinx.serialization.json.JsonElement? {
        return TODO("提供返回值")
    }
}
