/*
 * Copyright (C) 2023 The PixelExperience Project
 * SPDX-License-Identifier: Apache-2.0
 */
package com.android.server.mist;

import android.content.Context;
import com.android.server.SystemService;
import com.android.server.SystemServiceManager;
import com.android.internal.util.mist.DeviceConfigUtils;

public class CustomDeviceConfigService extends SystemService {
    private static final String TAG = "CustomDeviceConfigService";
    private final Context mContext;
    private final SystemServiceManager mSystemServiceManager;

    private static final String QUICKSWITCH_SERVICE_CLASS =
             "com.android.server.mist.QuickSwitchService";

    public CustomDeviceConfigService(Context context) {
        super(context);
        mContext = context;
        mSystemServiceManager = SystemServiceManager.getInstance();
    }

    @Override
    public void onStart() {
        startAllServices();
    }

    @Override
    public void onBootPhase(int phase) {
        if (phase == PHASE_BOOT_COMPLETED) {
            DeviceConfigUtils.setDefaultProperties(null, null);
        }
    }

    public void startAllServices() {
        startService(QUICKSWITCH_SERVICE_CLASS);
    }

    private void startService(String serviceClassName) {
        try {
            mSystemServiceManager.startService(serviceClassName);
        } catch (Exception e) {
            // Log error if needed
        }
    }
}
