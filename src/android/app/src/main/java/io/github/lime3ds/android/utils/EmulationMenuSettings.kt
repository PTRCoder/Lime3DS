// Copyright 2023 Citra Emulator Project
// Licensed under GPLv2 or any later version
// Refer to the license.txt file included.

package io.github.lime3ds.android.utils

import androidx.drawerlayout.widget.DrawerLayout
import androidx.preference.PreferenceManager
import io.github.lime3ds.android.LimeApplication
import io.github.lime3ds.android.display.ScreenLayout

object EmulationMenuSettings {
    private val preferences =
        PreferenceManager.getDefaultSharedPreferences(LimeApplication.appContext)

    var joystickRelCenter: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_JoystickRelCenter", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_JoystickRelCenter", value)
                .apply()
        }
    var dpadSlide: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_DpadSlideEnable", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_DpadSlideEnable", value)
                .apply()
        }
    var landscapeScreenLayout: Int
        get() = preferences.getInt(
            "EmulationMenuSettings_LandscapeScreenLayout",
            ScreenLayout.MOBILE_LANDSCAPE.int
        )
        set(value) {
            preferences.edit()
                .putInt("EmulationMenuSettings_LandscapeScreenLayout", value)
                .apply()
        }
    var showFps: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_ShowFps", false)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_ShowFps", value)
                .apply()
        }
    var swapScreens: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_SwapScreens", false)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_SwapScreens", value)
                .apply()
        }
    var showOverlay: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_ShowOverlay", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_ShowOverlay", value)
                .apply()
        }
    var drawerLockMode: Int
        get() = preferences.getInt(
            "EmulationMenuSettings_DrawerLockMode",
            DrawerLayout.LOCK_MODE_LOCKED_CLOSED
        )
        set(value) {
            preferences.edit()
                .putInt("EmulationMenuSettings_DrawerLockMode", value)
                .apply()
        }
}
