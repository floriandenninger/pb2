package com.google.research.xeno.effect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PreprocessingGraph {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    interface NativeLoadCallback {
        void onCompletion(long j, String str);
    }

    private static native void nativeLoad(byte[] bArr, AssetManager assetManager, NativeLoadCallback nativeLoadCallback);

    private native void nativeRelease(long j);
}
