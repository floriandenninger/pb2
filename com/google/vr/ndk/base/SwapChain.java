package com.google.vr.ndk.base;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SwapChain {
    private static final String TAG = "SwapChain";
    private long nativeSwapChain;

    protected void finalize() {
        try {
            if (this.nativeSwapChain != 0) {
                Log.w(TAG, "SwapChain.shutdown() should be called to ensure resource cleanup");
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
