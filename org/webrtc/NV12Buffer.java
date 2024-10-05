package org.webrtc;

import defpackage.bapp;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NV12Buffer implements VideoFrame.Buffer {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final ByteBuffer e;
    private final bapp f;

    public NV12Buffer(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, Runnable runnable) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = byteBuffer;
        this.f = new bapp(runnable);
    }

    private static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13);

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        JavaI420Buffer a = JavaI420Buffer.a(i5, i6);
        nativeCropAndScale(i, i2, i3, i4, i5, i6, this.e, this.a, this.b, this.c, this.d, a.getDataY(), a.a, a.getDataU(), a.b, a.getDataV(), a.c);
        return a;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return 0;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getHeight() {
        return this.b;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getWidth() {
        return this.a;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void release() {
        this.f.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void retain() {
        this.f.retain();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.VideoFrame$I420Buffer, org.webrtc.VideoFrame$Buffer] */
    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        int i = this.a;
        int i2 = this.b;
        return cropAndScale(0, 0, i, i2, i, i2);
    }
}
