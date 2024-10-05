package org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RtpTransceiver {
    private long a;
    private RtpSender b;
    private RtpReceiver c;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);

        private final int f;

        RtpTransceiverDirection(int i) {
            this.f = i;
        }

        static RtpTransceiverDirection fromNativeIndex(int i) {
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Uknown native RtpTransceiverDirection type");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getNativeIndex() {
            return this.f;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class RtpTransceiverInit {
        private final RtpTransceiverDirection a;
        private final List b;
        private final List c;

        public RtpTransceiverInit() {
            RtpTransceiverDirection rtpTransceiverDirection = RtpTransceiverDirection.SEND_RECV;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            this.a = rtpTransceiverDirection;
            this.b = new ArrayList(emptyList);
            this.c = new ArrayList(emptyList2);
        }

        int getDirectionNativeIndex() {
            return this.a.getNativeIndex();
        }

        List getSendEncodings() {
            return new ArrayList(this.c);
        }

        List getStreamIds() {
            return new ArrayList(this.b);
        }
    }

    protected RtpTransceiver(long j) {
        this.a = j;
        this.b = nativeGetSender(j);
        this.c = nativeGetReceiver(j);
    }

    private static native RtpTransceiverDirection nativeCurrentDirection(long j);

    private static native RtpTransceiverDirection nativeDirection(long j);

    private static native MediaStreamTrack.MediaType nativeGetMediaType(long j);

    private static native String nativeGetMid(long j);

    private static native RtpReceiver nativeGetReceiver(long j);

    private static native RtpSender nativeGetSender(long j);

    private static native boolean nativeSetDirection(long j, RtpTransceiverDirection rtpTransceiverDirection);

    private static native void nativeStopInternal(long j);

    private static native void nativeStopStandard(long j);

    private static native boolean nativeStopped(long j);

    public void dispose() {
        if (this.a != 0) {
            this.b.a();
            this.c.dispose();
            JniCommon.nativeReleaseRef(this.a);
            this.a = 0L;
            return;
        }
        throw new IllegalStateException("RtpTransceiver has been disposed.");
    }
}
