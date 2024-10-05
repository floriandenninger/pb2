package org.webrtc;

import defpackage.bapp;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EncodedImage implements RefCounted {
    public final bapp a;
    public final ByteBuffer b;
    public final int c;
    public final int d;
    public final long e;
    public final FrameType f;
    public final int g;
    public final Integer h;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        public final int d;

        FrameType(int i) {
            this.d = i;
        }

        static FrameType fromNativeIndex(int i) {
            for (FrameType frameType : values()) {
                if (frameType.d == i) {
                    return frameType;
                }
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown native frame type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i, int i2, long j, FrameType frameType, int i3, Integer num) {
        this.b = byteBuffer;
        this.c = i;
        this.d = i2;
        TimeUnit.NANOSECONDS.toMillis(j);
        this.e = j;
        this.f = frameType;
        this.g = i3;
        this.h = num;
        this.a = new bapp(runnable);
    }

    private ByteBuffer getBuffer() {
        return this.b;
    }

    private long getCaptureTimeNs() {
        return this.e;
    }

    private int getEncodedHeight() {
        return this.d;
    }

    private int getEncodedWidth() {
        return this.c;
    }

    private int getFrameType() {
        return this.f.d;
    }

    private Integer getQp() {
        return this.h;
    }

    private int getRotation() {
        return this.g;
    }

    @Override // org.webrtc.RefCounted
    public final void release() {
        this.a.release();
    }

    @Override // org.webrtc.RefCounted
    public final void retain() {
        this.a.retain();
    }
}
