package org.webrtc;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RtpSender {
    private long a;
    private MediaStreamTrack b;
    private boolean c = true;
    private final DtmfSender d;

    public RtpSender(long j) {
        this.a = j;
        this.b = MediaStreamTrack.c(nativeGetTrack(j));
        long nativeGetDtmfSender = nativeGetDtmfSender(j);
        this.d = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : null;
    }

    private static native long nativeGetDtmfSender(long j);

    private static native String nativeGetId(long j);

    private static native RtpParameters nativeGetParameters(long j);

    private static native List nativeGetStreams(long j);

    private static native long nativeGetTrack(long j);

    private static native void nativeSetFrameEncryptor(long j, long j2);

    private static native boolean nativeSetParameters(long j, RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j, List list);

    private static native boolean nativeSetTrack(long j, long j2);

    public final void a() {
        if (this.a != 0) {
            DtmfSender dtmfSender = this.d;
            if (dtmfSender != null) {
                long j = dtmfSender.a;
                if (j == 0) {
                    throw new IllegalStateException("DtmfSender has been disposed.");
                }
                JniCommon.nativeReleaseRef(j);
                dtmfSender.a = 0L;
            }
            MediaStreamTrack mediaStreamTrack = this.b;
            if (mediaStreamTrack != null && this.c) {
                mediaStreamTrack.d();
            }
            JniCommon.nativeReleaseRef(this.a);
            this.a = 0L;
            return;
        }
        throw new IllegalStateException("RtpSender has been disposed.");
    }
}
