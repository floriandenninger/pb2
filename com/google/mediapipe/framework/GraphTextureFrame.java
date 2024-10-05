package com.google.mediapipe.framework;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GraphTextureFrame implements TextureFrame {
    public int a;
    private long b;
    private int c;
    private int d;
    private long e;

    public GraphTextureFrame(long j, long j2) {
        this.e = Long.MIN_VALUE;
        this.b = j;
        this.a = nativeGetTextureName(j);
        this.c = nativeGetWidth(this.b);
        this.d = nativeGetHeight(this.b);
        this.e = j2;
    }

    private native int nativeGetHeight(long j);

    private native int nativeGetTextureName(long j);

    private native int nativeGetWidth(long j);

    private native void nativeReleaseBuffer(long j);

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.d;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.e;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void release() {
        long j = this.b;
        if (j != 0) {
            nativeReleaseBuffer(j);
            this.b = 0L;
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        glSyncToken.release();
        release();
    }
}
