/*
 * Copyright (C) 2023-2024 The RisingOS Android Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.systemui.theme;

import android.provider.Settings;

public class RisingSettingsConstants {

    public static final String LOCKSCREEN_WIDGETS_ENABLED = "lockscreen_widgets_enabled";
    public static final String LOCKSCREEN_WIDGETS = "lockscreen_widgets";
    public static final String LOCKSCREEN_WIDGETS_EXTRAS = "lockscreen_widgets_extras";

    public static final String[] SYSTEM_SETTINGS_KEYS = {
        "status_bar_logo",
        "status_bar_logo_color",
        "statusbar_colored_icons",
        "statusbar_clock_chip",
        LOCKSCREEN_WIDGETS_ENABLED,
        LOCKSCREEN_WIDGETS,
        LOCKSCREEN_WIDGETS_EXTRAS,
        "lockscreen_widgets_style",
        "qs_widgets_enabled"
    };
    
    public static final String[] SECURE_SETTINGS_KEYS = {
        "volume_show_media_button"
        
    };
    
    public static final String[] SYSTEM_SETTINGS_NOTIFY_ONLY_KEYS = {
    };
    
    public static final String[] SECURE_SETTINGS_NOTIFY_ONLY_KEYS = {
    };
}
