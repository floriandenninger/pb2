package org.webrtc;

import defpackage.bapp;
import defpackage.baqy;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    public final int a;
    public final int b;
    public final int c;
    private final int d;
    private final int e;
    private final ByteBuffer f;
    private final ByteBuffer g;
    private final ByteBuffer h;
    private final bapp i;

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.d = i;
        this.e = i2;
        this.f = byteBuffer;
        this.g = byteBuffer2;
        this.h = byteBuffer3;
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.i = new bapp(runnable);
    }

    public static JavaI420Buffer a(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i4 * i3;
        int i7 = i5 + i6;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(((i4 + i4) * i3) + i5);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        return new JavaI420Buffer(i, i2, slice, i, slice2, i4, nativeAllocateByteBuffer.slice(), i4, new baqy(nativeAllocateByteBuffer, 1));
    }

    private static void d(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = (i3 * (i2 - 1)) + i;
        if (byteBuffer.capacity() >= i4) {
            return;
        }
        int capacity = byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(62);
        sb.append("Buffer must be at least ");
        sb.append(i4);
        sb.append(" bytes, but was ");
        sb.append(capacity);
        throw new IllegalArgumentException(sb.toString());
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return c(this, i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return 1;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final ByteBuffer getDataU() {
        return this.g.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final ByteBuffer getDataV() {
        return this.h.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final ByteBuffer getDataY() {
        return this.f.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getHeight() {
        return this.e;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final int getStrideU() {
        return this.b;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final int getStrideV() {
        return this.c;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public final int getStrideY() {
        return this.a;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getWidth() {
        return this.d;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void release() {
        this.i.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void retain() {
        this.i.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    public static JavaI420Buffer b(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = byteBuffer2.slice();
        ByteBuffer slice3 = byteBuffer3.slice();
        int i6 = (i + 1) / 2;
        int i7 = (i2 + 1) / 2;
        d(slice, i, i2, i3);
        d(slice2, i6, i7, i4);
        d(slice3, i6, i7, i5);
        return new JavaI420Buffer(i, i2, slice, i3, slice2, i4, slice3, i5, runnable);
    }

    public static VideoFrame.Buffer c(final VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == i5 && i4 == i6) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            int i7 = i / 2;
            int i8 = i2 / 2;
            i420Buffer.retain();
            ByteBuffer slice = dataY.slice();
            int strideY = i420Buffer.getStrideY();
            ByteBuffer slice2 = dataU.slice();
            int strideU = i420Buffer.getStrideU();
            ByteBuffer slice3 = dataV.slice();
            int strideV = i420Buffer.getStrideV();
            i420Buffer.getClass();
            return b(i5, i6, slice, strideY, slice2, strideU, slice3, strideV, new Runnable() { // from class: bapc
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrame.I420Buffer.this.release();
                }
            });
        }
        JavaI420Buffer a = a(i5, i6);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, a.getDataY(), a.a, a.getDataU(), a.b, a.getDataV(), a.c, i5, i6);
        return a;
    }
}
