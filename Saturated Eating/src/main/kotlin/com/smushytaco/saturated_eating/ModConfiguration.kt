package com.smushytaco.saturated_eating
import io.wispforest.owo.config.annotation.*
@Modmenu(modId = SaturatedEating.MOD_ID)
@Config(name = SaturatedEating.MOD_ID, wrapperName = "ModConfig")
@Suppress("UNUSED")
class ModConfiguration {
    @JvmField
    var enableSaturatedEating = true
}