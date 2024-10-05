package org.webrtc;

import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NativeAndroidVideoTrackSource {
    public final long a;

    public NativeAndroidVideoTrackSource(long j) {
        this.a = j;
    }

    static VideoProcessor$FrameAdaptationParameters createFrameAdaptationParameters(int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        return new VideoProcessor$FrameAdaptationParameters(i, i2, i3, i4, i5, i6, j, z);
    }

    public static native VideoProcessor$FrameAdaptationParameters nativeAdaptFrame(long j, int i, int i2, int i3, long j2);

    private static native void nativeAdaptOutputFormat(long j, int i, int i2, Integer num, int i3, int i4, Integer num2, Integer num3);

    public static native void nativeOnFrameCaptured(long j, int i, long j2, VideoFrame.Buffer buffer);

    private static native void nativeSetIsScreencast(long j, boolean z);

    private static native void nativeSetState(long j, boolean z);

    public final void a(boolean z) {
        nativeSetState(this.a, z);
    }
}
