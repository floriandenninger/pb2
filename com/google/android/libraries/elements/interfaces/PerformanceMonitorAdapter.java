package com.google.android.libraries.elements.interfaces;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PerformanceMonitorAdapter {
    public abstract long getCurrentThread();

    public abstract EnumSet getPerformanceSpanBlocklist();

    public abstract boolean isMainThread();

    public abstract boolean shouldRecordLogs();
}
