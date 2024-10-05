package com.google.research.xeno.effect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface AssetDownloader {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface DownloadCallback {
        void onCompletion(String str, String str2);
    }

    void downloadAsset(String str, DownloadCallback downloadCallback);
}
