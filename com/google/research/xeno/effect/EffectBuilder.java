package com.google.research.xeno.effect;

/* compiled from: PG */
/* loaded from: classes3.dex */
class EffectBuilder {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    interface NativeBuildCallback {
        void onCompletion(long j, String str);
    }

    private native void nativeBuildEffect(long j, byte[] bArr, NativeBuildCallback nativeBuildCallback);

    private native long nativeCreateEffectBuilder(String str, String str2, long j, AssetDownloader assetDownloader);

    private native void nativeRelease(long j);
}
