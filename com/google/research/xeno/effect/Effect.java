package com.google.research.xeno.effect;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Effect {
    public final long a;
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final Map c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface NativeLoadCallback {
        void onCompletion(long j, String str);
    }

    public Effect(long j) {
        this.a = j;
        this.c = nativeGetControls(j);
    }

    private native Map nativeGetControls(long j);

    private native int nativeGetMaxFramesInFlight(long j);

    public static native void nativeLoad(byte[] bArr, AssetManager assetManager, NativeLoadCallback nativeLoadCallback);

    private native void nativeRelease(long j);

    public final Integer a() {
        int nativeGetMaxFramesInFlight = nativeGetMaxFramesInFlight(this.a);
        if (nativeGetMaxFramesInFlight > 0) {
            return Integer.valueOf(nativeGetMaxFramesInFlight);
        }
        return null;
    }
}
