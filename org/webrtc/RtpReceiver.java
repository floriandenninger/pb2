package org.webrtc;

import org.webrtc.MediaStreamTrack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RtpReceiver {
    private long a;
    private MediaStreamTrack b;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Observer {
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    public RtpReceiver(long j) {
        this.a = j;
        this.b = MediaStreamTrack.c(nativeGetTrack(j));
    }

    private static native String nativeGetId(long j);

    private static native RtpParameters nativeGetParameters(long j);

    private static native long nativeGetTrack(long j);

    private static native void nativeSetFrameDecryptor(long j, long j2);

    private static native long nativeSetObserver(long j, Observer observer);

    private static native void nativeUnsetObserver(long j, long j2);

    public void dispose() {
        if (this.a != 0) {
            this.b.d();
            JniCommon.nativeReleaseRef(this.a);
            this.a = 0L;
            return;
        }
        throw new IllegalStateException("RtpReceiver has been disposed.");
    }
}
