package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class k extends LinkedHashMap {
    private final int a;

    public k() {
        super(30, 0.75f, true);
        this.a = 30;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() >= this.a;
    }
}
