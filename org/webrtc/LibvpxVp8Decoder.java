package org.webrtc;

import defpackage.baqw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LibvpxVp8Decoder extends baqw {
    static native long nativeCreateDecoder();

    @Override // org.webrtc.VideoDecoder
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
