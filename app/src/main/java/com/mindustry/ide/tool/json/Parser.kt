package com.mindustry.ide.tool.json

import kotlinx.serialization.Serializable
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.json.Json
import mindustry.mod.ClassMap

@OptIn(InternalSerializationApi::class)
@Serializable
data class FieldMeta(val name: String, val type: String, val defaultValue: String, val notes: String)

@OptIn(InternalSerializationApi::class)
@Serializable
data class TypeMeta(val type: String, val parentType: String, val fields: List<FieldMeta>)

abstract class Parser {
    protected val classDocs = mutableMapOf<String, TypeMeta>()
    protected val fieldDocs = mutableMapOf<String, MutableMap<String, FieldMeta>>()
    
    companion object {
        private val jsonFormat = Json { ignoreUnknownKeys = true }
    }

    abstract fun write()
    abstract fun read()
    abstract fun hasConfig(): Boolean

    fun load() {
        if (hasConfig()) {
            read()
        } else {
            write()
            read()
        }
    }

    fun getFieldDoc(className: String, fieldName: String): String? {
        return fieldDocs[className]?.get(fieldName)?.notes
    }

    fun getClassDoc(className: String): String? {
        val meta = classDocs[className] ?: return null
        return "Type: ${meta.type}\nParent: ${meta.parentType}\nFields: ${meta.fields.size}"
    }

    fun getAllFields(className: String): List<FieldMeta>? {
        return classDocs[className]?.fields
    }

    fun getParentType(className: String): String? {
        return classDocs[className]?.parentType
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
}
