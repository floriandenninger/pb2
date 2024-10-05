package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11);

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        throw null;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        throw null;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getHeight() {
        throw null;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getWidth() {
        throw null;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void release() {
        throw null;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void retain() {
        throw null;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        throw null;
    }
}
