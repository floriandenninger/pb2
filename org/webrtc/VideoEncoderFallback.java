package org.webrtc;

import defpackage.baqx;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class VideoEncoderFallback extends baqx {
    private static native long nativeCreateEncoder(VideoEncoder videoEncoder, VideoEncoder videoEncoder2);

    @Override // org.webrtc.VideoEncoder
    public final long createNativeVideoEncoder() {
        throw null;
    }

    @Override // org.webrtc.VideoEncoder
    public final boolean isHardwareEncoder() {
        throw null;
    }
}
