package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderWrapper;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class VideoDecoderWrapper {
    VideoDecoderWrapper() {
    }

    static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: baqp
            @Override // org.webrtc.VideoDecoder.Callback
            public final void a(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j, videoFrame, num, num2);
            }
        };
    }

    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
