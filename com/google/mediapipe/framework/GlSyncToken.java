package com.google.mediapipe.framework;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface GlSyncToken {
    void release();

    void waitOnCpu();

    void waitOnGpu();
}
