package org.chromium.net;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.ajfg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AndroidCellularSignalStrength {
    private static final AndroidCellularSignalStrength sInstance = new AndroidCellularSignalStrength();
    private volatile int mSignalLevel = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    private AndroidCellularSignalStrength() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new ajfg(20));
    }

    private static int getSignalStrengthLevel() {
        return sInstance.mSignalLevel;
    }
}
