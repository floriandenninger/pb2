package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axkc {
    public final MediaCodec a;

    public axkc(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    public final int a(long j) {
        return this.a.dequeueInputBuffer(j);
    }

    public final int b(MediaCodec.BufferInfo bufferInfo, long j) {
        return this.a.dequeueOutputBuffer(bufferInfo, j);
    }

    public final void c() {
        this.a.release();
    }

    public final void d(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    public final void e(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    public final void f() {
        this.a.start();
    }

    public final void g() {
        this.a.stop();
    }

    public final ByteBuffer[] h() {
        return this.a.getInputBuffers();
    }

    public final ByteBuffer[] i() {
        return this.a.getOutputBuffers();
    }

    public final void j(MediaFormat mediaFormat, Surface surface, int i) {
        this.a.configure(mediaFormat, surface, (MediaCrypto) null, i);
    }

    public final void k(int i, int i2, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, 0);
    }
}
