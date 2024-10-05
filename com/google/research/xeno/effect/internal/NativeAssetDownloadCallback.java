package com.google.research.xeno.effect.internal;

import com.google.research.xeno.effect.AssetDownloader;

/* compiled from: PG */
/* loaded from: classes3.dex */
class NativeAssetDownloadCallback implements AssetDownloader.DownloadCallback {
    private final long a;

    public NativeAssetDownloadCallback(long j) {
        this.a = j;
    }

    private native void nativeFulfillAssetDownload(long j, String str, String str2);

    @Override // com.google.research.xeno.effect.AssetDownloader.DownloadCallback
    public final void onCompletion(String str, String str2) {
        nativeFulfillAssetDownload(this.a, str, str2);
    }
}
