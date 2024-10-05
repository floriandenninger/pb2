package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.exoplayer.video.DummySurface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pkj implements azy {
    public final Context a;
    public final boolean b;
    public DummySurface c;
    public int d;
    private final MediaCodec e;
    private boolean f = true;
    private boolean g;
    private boolean h;
    private Surface i;

    public pkj(MediaCodec mediaCodec, Surface surface, int i, Context context, boolean z) {
        this.e = mediaCodec;
        this.i = surface;
        this.d = i;
        this.a = context;
        this.b = z;
    }

    @Override // defpackage.azy
    public final int a() {
        return this.e.dequeueInputBuffer(0L);
    }

    @Override // defpackage.azy
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        if (this.g) {
            this.g = false;
            return -2;
        }
        do {
            dequeueOutputBuffer = this.e.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.azy
    public final MediaFormat c() {
        return this.e.getOutputFormat();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f) {
            afic aficVar = afic.ABR;
            this.d = 1;
            return;
        }
        afid.d(afic.CODEC_REUSE, "Codec released.");
        this.e.release();
        DummySurface dummySurface = this.c;
        if (dummySurface != null) {
            dummySurface.release();
        }
    }

    @Override // defpackage.azy
    public final ByteBuffer e(int i) {
        int i2 = pts.a;
        return this.e.getInputBuffer(i);
    }

    @Override // defpackage.azy
    public final ByteBuffer f(int i) {
        int i2 = pts.a;
        return this.e.getOutputBuffer(i);
    }

    @Override // defpackage.azy
    public final synchronized void g() {
        this.e.flush();
    }

    @Override // defpackage.azy
    public final synchronized void h() {
        afic aficVar = afic.ABR;
        int i = this.d;
        if (i == 0) {
            throw null;
        }
        this.f = false;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                this.e.flush();
                this.g = true;
                return;
            } else {
                this.e.stop();
                return;
            }
        }
        this.e.release();
        DummySurface dummySurface = this.c;
        if (dummySurface != null) {
            dummySurface.release();
        }
    }

    @Override // defpackage.azy
    public final void i(int i, long j) {
        this.e.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.azy
    public final void j(Surface surface) {
        if (this.i.equals(surface)) {
            return;
        }
        this.e.setOutputSurface(surface);
        this.i = surface;
        DummySurface dummySurface = this.c;
        if (dummySurface == null || surface.equals(dummySurface)) {
            return;
        }
        afic aficVar = afic.ABR;
        this.c.release();
        this.c = null;
    }

    @Override // defpackage.azy
    public final void k(Bundle bundle) {
        this.e.setParameters(bundle);
    }

    @Override // defpackage.azy
    public final void l(int i) {
        this.e.setVideoScalingMode(i);
    }

    @Override // defpackage.azy
    public final boolean m() {
        return this.h;
    }

    @Override // defpackage.azy
    public final void n(int i, int i2, long j, int i3) {
        this.e.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.azy
    public final void o(int i, ass assVar, long j) {
        this.e.queueSecureInputBuffer(i, 0, assVar.i, j, 0);
    }

    @Override // defpackage.azy
    public final void p(int i) {
        this.e.releaseOutputBuffer(i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q(boolean z) {
        this.h = z;
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void r() {
        this.f = true;
        this.e.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s() {
        this.e.stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f = true;
        this.e.configure(mediaFormat, surface, mediaCrypto, 0);
        this.i = surface;
    }
}
