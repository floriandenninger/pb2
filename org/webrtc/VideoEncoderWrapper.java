package org.webrtc;

import org.webrtc.EncodedImage;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderWrapper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class VideoEncoderWrapper {
    VideoEncoderWrapper() {
    }

    static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() { // from class: baqq
            @Override // org.webrtc.VideoEncoder.Callback
            public final void a(EncodedImage encodedImage) {
                VideoEncoderWrapper.nativeOnEncodedFrame(j, encodedImage);
            }
        };
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.d;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.c;
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.b;
    }

    public static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);
}
