package com.mindustry.ide

import com.mindustry.ide.tool.json.Parser
import mindustry.mod.ClassMap
import org.junit.Test
import arc.struct.ObjectMap
import com.mindustry.ide.tool.libs.DocFetch
import kotlinx.coroutines.runBlocking

class ExampleUnitTest {
    @Test
    fun test(): Unit = runBlocking {
        val docFetch = DocFetch()
        println(docFetch.execute())
    }
}
