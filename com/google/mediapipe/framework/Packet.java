package com.google.mediapipe.framework;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Packet {
    public long a;

    private Packet(long j) {
        this.a = j;
    }

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native long nativeCopyPacket(long j);

    private native boolean nativeIsEmpty(long j);

    private native void nativeReleasePacket(long j);

    public final Packet a() {
        return new Packet(nativeCopyPacket(this.a));
    }

    public long getNativeHandle() {
        return this.a;
    }

    public native long nativeGetTimestamp(long j);

    public void release() {
        long j = this.a;
        if (j != 0) {
            nativeReleasePacket(j);
            this.a = 0L;
        }
    }
}
