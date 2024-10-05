package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface VideoDecoderFactory {

    /* compiled from: PG */
    /* renamed from: org.webrtc.VideoDecoderFactory$-CC, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static VideoCodecInfo[] $default$getSupportedCodecs(VideoDecoderFactory videoDecoderFactory) {
            return new VideoCodecInfo[0];
        }
    }

    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();
}
