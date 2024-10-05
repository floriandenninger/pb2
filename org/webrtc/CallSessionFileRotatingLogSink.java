package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CallSessionFileRotatingLogSink {
    private static native long nativeAddSink(String str, int i, int i2);

    private static native void nativeDeleteSink(long j);

    private static native byte[] nativeGetLogData(String str);
}
