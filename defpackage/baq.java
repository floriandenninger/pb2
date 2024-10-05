package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baq implements azy {
    private final MediaCodec a;

    public baq(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        int i = pts.a;
    }

    @Override // defpackage.azy
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.azy
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                int i = pts.a;
                dequeueOutputBuffer = -3;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.azy
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.azy
    public final ByteBuffer e(int i) {
        int i2 = pts.a;
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.azy
    public final ByteBuffer f(int i) {
        int i2 = pts.a;
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.azy
    public final void g() {
        this.a.flush();
    }

    @Override // defpackage.azy
    public final void h() {
        this.a.release();
    }

    @Override // defpackage.azy
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.azy
    public final void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.azy
    public final void k(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.azy
    public final void l(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.azy
    public final boolean m() {
        return false;
    }

    @Override // defpackage.azy
    public final void n(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.azy
    public final void o(int i, ass assVar, long j) {
        this.a.queueSecureInputBuffer(i, 0, assVar.i, j, 0);
    }

    @Override // defpackage.azy
    public final void p(int i) {
        this.a.releaseOutputBuffer(i, false);
    }
}
