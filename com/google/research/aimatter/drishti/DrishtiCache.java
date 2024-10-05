package com.google.research.aimatter.drishti;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DrishtiCache {
    public final long a = nativeCreateCache();
    public final AtomicBoolean b = new AtomicBoolean(true);

    private native void nativeClearCache(long j);

    private native long nativeCreateCache();

    public native void nativeReleaseCache(long j);
}
