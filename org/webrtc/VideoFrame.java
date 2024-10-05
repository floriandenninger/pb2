package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class VideoFrame implements RefCounted {
    private final Buffer a;
    private final int b;
    private final long c;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Buffer extends RefCounted {

        /* compiled from: PG */
        /* renamed from: org.webrtc.VideoFrame$Buffer$-CC, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class CC {
            public static int $default$getBufferType(Buffer buffer) {
                return 0;
            }
        }

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getBufferType();

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        I420Buffer toI420();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i % 90 == 0) {
            this.a = buffer;
            this.b = i;
            this.c = j;
            return;
        }
        throw new IllegalArgumentException("rotation must be a multiple of 90");
    }

    public final int a() {
        return this.b % 180 == 0 ? this.a.getHeight() : this.a.getWidth();
    }

    public final int b() {
        return this.b % 180 == 0 ? this.a.getWidth() : this.a.getHeight();
    }

    public Buffer getBuffer() {
        return this.a;
    }

    public int getRotation() {
        return this.b;
    }

    public long getTimestampNs() {
        return this.c;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.a.release();
    }

    @Override // org.webrtc.RefCounted
    public final void retain() {
        this.a.retain();
    }
}
