package com.mindustry.ide.web.ui

import com.mindustry.ide.web.Vars

/**
 * 文档查询器弹窗工厂
 */
object DocQueryDialog {
    
    /**
     * 获取所有已加载的类名列表
     */
    fun getClassNames(): List<String> {
        return Vars.parser.classDocs.keys.sorted()
    }
    
    /**
     * 获取指定类的所有字段
     */
    fun getClassFields(className: String): List<Map<String, String>> {
        val fields = Vars.parser.getAllFields(className)
        return fields.map { field ->
            mapOf(
                "name" to field.name,
                "type" to field.type,
                "defaultValue" to field.defaultValue,
                "notes" to field.notes
            )
        }
    }
    
    /**
     * 获取类的文档信息
     */
    fun getClassInfo(className: String): Map<String, Any?> {
        val classDoc = Vars.parser.getClassDoc(className)
        val parentType = Vars.parser.getParentType(className)
        val fields = getClassFields(className)
        
        return mapOf(
            "className" to className,
            "classDoc" to classDoc,
            "parentType" to parentType,
            "fields" to fields,
            "fieldCount" to fields.size
        )
    }
    
    /**
     * 创建文档查询器弹窗配置
     */
    fun create(): DialogConfig {
        val classNames = getClassNames()
        
        // 构建 HTML 内容
        val message = buildString {
            appendLine("<div style='display: flex; flex-direction: column; gap: 16px;'>")
            
            // 类选择器
            appendLine("""
                <div>
                    <label style='display: block; margin-bottom: 8px; font-weight: 600; color: #a9b7c6;'>选择类:</label>
                    <select id="classSelector" onchange="loadClassInfo(this.value)" 
                        style='width: 100%; padding: 8px; background-color: #2b2d30; border: 1px solid #555555; 
                               border-radius: 4px; color: #a9b7c6; font-family: monospace;'>
                        <option value="">-- 请选择类 --</option>
            """.trimIndent())
            
            classNames.forEach { className ->
                appendLine("<option value='$className'>$className</option>")
            }
            
            appendLine("""
                    </select>
                </div>
            """.trimIndent())
            
            // 信息显示区域
            appendLine("""
                <div id="classInfo" style='
                    background-color: #2b2d30;
                    border: 1px solid #555555;
                    border-radius: 4px;
                    padding: 16px;
                    min-height: 200px;
                    max-height: 400px;
                    overflow-y: auto;
                '>
                    <div style='color: #808080; text-align: center; padding: 40px 0;'>
                        请选择一个类来查看文档
                    </div>
                </div>
            """.trimIndent())
            
            appendLine("</div>")
        }
        
        return DialogConfig(
            title = "文档查询器",
            message = message.toString(),
            type = DialogType.INFO,
            buttons = listOf(DialogButton("关闭", action = "onClose")),
            closable = true,
            position = DialogPosition.CENTER
        )
    }
}
