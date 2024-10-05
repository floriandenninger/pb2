package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface VideoDecoder {

    /* compiled from: PG */
    /* renamed from: org.webrtc.VideoDecoder$-CC, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static long $default$createNativeVideoDecoder(VideoDecoder videoDecoder) {
            return 0L;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Callback {
        void a(VideoFrame videoFrame, Integer num, Integer num2);
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class DecodeInfo {
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Settings {
        public final int a;
        public final int b;

        public Settings(int i, int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    long createNativeVideoDecoder();

    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    String getImplementationName();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();
}
