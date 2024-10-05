package org.webrtc;

import defpackage.baqx;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LibvpxVp8Encoder extends baqx {
    static native long nativeCreateEncoder();

    @Override // org.webrtc.VideoEncoder
    public final long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    @Override // org.webrtc.VideoEncoder
    public final boolean isHardwareEncoder() {
        return false;
    }
}
