package com.google.vr.ndk.base;

import android.app.Activity;
import android.os.PowerManager;
import android.util.Log;
import android.view.Window;
import defpackage.axfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidCompat {
    private AndroidCompat() {
    }

    public static void setSustainedPerformanceMode(Activity activity, boolean z) {
        if (axfo.a() && ((PowerManager) activity.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            Window window = activity.getWindow();
            if (window == null) {
                Log.e(axfo.a, "Activity does not have a window");
            } else {
                window.setSustainedPerformanceMode(z);
            }
        }
    }

    public static boolean setVrModeEnabled(Activity activity, boolean z) {
        return axfo.b(activity, z);
    }
}
