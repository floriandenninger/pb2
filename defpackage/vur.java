package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vur {
    public final MediaCodec a;

    public vur(MediaCodec mediaCodec) {
        vcp.d(true);
        mediaCodec.getClass();
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

    public final void e() {
        this.a.start();
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final void f() {
        this.a.stop();
    }

    public final ByteBuffer[] g() {
        return this.a.getInputBuffers();
    }

    public final ByteBuffer[] h() {
        return this.a.getOutputBuffers();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(MediaFormat mediaFormat, Surface surface, int i) {
        this.a.configure(mediaFormat, surface, (MediaCrypto) null, i);
    }

    public final void j(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    public final String toString() {
        return this.a.toString();
    }
}
