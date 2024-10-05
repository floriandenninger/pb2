package com.google.android.exoplayer.ext.opus;

import defpackage.phc;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpusOutputBuffer extends phc {
    public ByteBuffer data;
    private final OpusDecoder owner;

    public OpusOutputBuffer(OpusDecoder opusDecoder) {
        this.owner = opusDecoder;
    }

    void init(int i) {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i);
        }
    }

    @Override // defpackage.phc
    public void release() {
        this.owner.e(this);
    }

    @Override // defpackage.pha
    public void reset() {
        super.reset();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
        }
    }
}
