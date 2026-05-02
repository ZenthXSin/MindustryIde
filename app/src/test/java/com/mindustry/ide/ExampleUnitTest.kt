package com.mindustry.ide

import arc.Core
import arc.util.Log
import mindustry.Vars
import mindustry.game.Gamemode
import mindustry.maps.MapException
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun test() {
        mindustry.server.ServerLauncher.main(arrayOf())
        mindustry.server.ServerControl.instance.handler.commandList.find { it.text == "host" }
//        val json = """
//{
//  "type": "Wall",
//  "size": 0,
//  "health": 0,
//  "requirements": [
//    { "amount": 10 }
//  ]
//}
//"""
//        println(DetectingContentParser().analyzeJsonAndReport(json, "test-wall"))
    }
}

fun host() {
    if (Vars.state.isGame) {
        Log.err("Already hosting. Type 'stop' to stop hosting first.", *arrayOfNulls<Any>(0))
    } else {
        val preset = Gamemode.survival
        val result = Vars.maps.shuffleMode.next(preset, Vars.state.map)
        if (result != null) {
            Log.info("Randomized next map to be @.", *arrayOf<Any?>(result.plainName()))
        }

        Log.info("Loading map...")
        Vars.logic.reset()
        if (result != null) {
            Core.settings.put("lastServerMode", preset.name)

            try {
                Vars.world.loadMap(result, result.applyRules(preset))
                Vars.state.rules = result.applyRules(preset)
                Vars.logic.play()
                Log.info("Map loaded.")
                Vars.netServer.openServer()
            } catch (e: MapException) {
                Log.err("@: @", *arrayOf<Any?>(e.map.plainName(), e.message))
            }
        }
    }
}