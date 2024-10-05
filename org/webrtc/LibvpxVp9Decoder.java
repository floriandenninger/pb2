package org.webrtc;

import defpackage.baqw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LibvpxVp9Decoder extends baqw {
    static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    @Override // org.webrtc.VideoDecoder
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
