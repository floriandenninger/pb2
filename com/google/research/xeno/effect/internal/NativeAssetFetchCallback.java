package com.google.research.xeno.effect.internal;

import com.google.research.xeno.effect.AssetManager;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
class NativeAssetFetchCallback implements AssetManager.FetchCallback {
    private final long a;

    public NativeAssetFetchCallback(long j) {
        this.a = j;
    }

    private native void nativeFulfillFetchRequest(long j, Map map, Map map2);

    @Override // com.google.research.xeno.effect.AssetManager.FetchCallback
    public final void onCompletion(Map map, Map map2) {
        nativeFulfillFetchRequest(this.a, map, map2);
    }
}
