package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {
    private final int a;
    private final int b;
    private final ByteBuffer c;
    private final int d;
    private final ByteBuffer e;
    private final int f;
    private final ByteBuffer g;
    private final int h;
    private final long i;

    WrappedNativeI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, long j) {
        this.a = i;
        this.b = i2;
        this.c = byteBuffer;
        this.d = i3;
        this.e = byteBuffer2;
        this.f = i4;
        this.g = byteBuffer3;
        this.h = i5;
        this.i = j;
        retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return JavaI420Buffer.c(this, i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return 1;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final ByteBuffer getDataU() {
        return this.e.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final ByteBuffer getDataV() {
        return this.g.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final ByteBuffer getDataY() {
        return this.c.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getHeight() {
        return this.b;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final int getStrideU() {
        return this.f;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final int getStrideV() {
        return this.h;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final int getStrideY() {
        return this.d;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getWidth() {
        return this.a;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void release() {
        JniCommon.nativeReleaseRef(this.i);
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void retain() {
        JniCommon.nativeAddRef(this.i);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
