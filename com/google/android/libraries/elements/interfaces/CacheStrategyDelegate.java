package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class CacheStrategyDelegate {
    public abstract void onCacheFull(long j, long j2);

    public abstract void onCacheInvalid(String str);

    public abstract void onCachePurged(CachePurgeReason cachePurgeReason);

    public abstract void onErrorReadingResource(String str);
}
