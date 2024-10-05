package org.webrtc;

import defpackage.baqw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class VideoDecoderFallback extends baqw {
    private final VideoDecoder a;
    private final VideoDecoder b;

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.a = videoDecoder;
        this.b = videoDecoder2;
    }

    private static native long nativeCreateDecoder(VideoDecoder videoDecoder, VideoDecoder videoDecoder2);

    @Override // org.webrtc.VideoDecoder
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder(this.a, this.b);
    }
}
