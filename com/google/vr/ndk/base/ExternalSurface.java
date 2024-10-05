package com.google.vr.ndk.base;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExternalSurface {
    private static final String TAG = "ExternalSurface";
    private long nativeExternalSurface;

    protected void finalize() {
        try {
            if (this.nativeExternalSurface != 0) {
                Log.w(TAG, "ExternalSurface.shutdown() should be called to ensure resource cleanup");
                shutdown();
            }
        } finally {
            super.finalize();
        }
    }

    public void shutdown() {
        throw null;
    }
}
