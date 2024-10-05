package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TimestampAligner {
    public volatile long a = nativeCreateTimestampAligner();

    private static native long nativeCreateTimestampAligner();

    public static native void nativeReleaseTimestampAligner(long j);

    private static native long nativeRtcTimeNanos();

    public static native long nativeTranslateTimestamp(long j, long j2);
}
