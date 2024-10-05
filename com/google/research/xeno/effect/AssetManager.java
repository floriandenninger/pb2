package com.google.research.xeno.effect;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface AssetManager {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface FetchCallback {
        void onCompletion(Map map, Map map2);
    }

    void fetchRemoteAssets(Set set, boolean z, FetchCallback fetchCallback);
}
