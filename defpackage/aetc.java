package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Process;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetc extends oxt {
    private final aetl i;
    private final axe j;
    private long k;
    private long l;
    private boolean m;
    private long n;
    private boolean o;
    private float p;
    private boolean q;
    private ByteBuffer r;
    private int s;
    private int t;
    private final afbe u;

    public aetc(oyr oyrVar, oxv oxvVar, pbh pbhVar, Handler handler, afbe afbeVar, aetl aetlVar, boolean z) {
        super(oyrVar, oxvVar, pbhVar, handler, afbeVar);
        this.u = afbeVar;
        this.i = aetlVar;
        if (!z) {
            this.j = null;
            return;
        }
        this.j = new axe();
        this.l = -1L;
        this.o = true;
        G(1.0f);
        this.m = false;
        this.q = true;
        this.r = null;
        this.s = -1;
        this.t = -1;
    }

    protected final void G(float f) {
        if (this.j == null) {
            return;
        }
        boolean z = false;
        if (f >= 0.25f && f <= 2.0f) {
            z = true;
        }
        afki.c(z, "Playback rate must be in the interval [0.25, 2.0]");
        if (this.p != f) {
            this.p = f;
            this.j.i(f);
            this.j.c();
        }
    }

    @Override // defpackage.oxt, defpackage.oxp
    public final long a() {
        if (this.j == null) {
            return super.a();
        }
        if (this.m) {
            this.m = false;
            try {
                g(this.k);
            } catch (oxh unused) {
            }
            return a();
        }
        long a = super.a();
        long j = this.l;
        this.l = a;
        if (j != -1) {
            a = (((a - j) * ((int) (this.p * 100.0f))) / 100) + this.k;
        }
        this.k = a;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys, defpackage.oyx
    public final long b() {
        long b = super.b();
        this.i.b(b);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oxt, defpackage.oyb, defpackage.oyx
    public final boolean i() {
        if (!super.i()) {
            return false;
        }
        this.i.e();
        return true;
    }

    @Override // defpackage.oxt, defpackage.oyx, defpackage.oxi
    public final void k(int i, Object obj) {
        if (i == 100) {
            G(((Float) obj).floatValue());
        } else {
            super.k(i, obj);
        }
    }

    @Override // defpackage.oxt
    protected final void o() {
        this.m = true;
    }

    @Override // defpackage.oxt
    protected final void p(int i) {
        afbe afbeVar = this.u;
        afbeVar.d = i;
        afbeVar.a.c(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys, defpackage.oyx
    public final void pG(int i, long j, boolean z) {
        super.pG(i, j, z);
        G(1.0f);
        if (Process.getThreadPriority(Process.myTid()) != -16) {
            Process.setThreadPriority(-16);
        }
    }

    @Override // defpackage.oxt, defpackage.oyb, defpackage.oys, defpackage.oyx
    public final void q() {
        afbe afbeVar = this.u;
        afbeVar.a.b(afbeVar.d);
        super.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oxt, defpackage.oyb, defpackage.oys
    public final void r(long j) {
        super.r(j);
        this.l = -1L;
        this.o = true;
        axe axeVar = this.j;
        if (axeVar != null && this.t != -1) {
            axeVar.c();
        }
        this.q = true;
        this.r = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oxt, defpackage.oyb
    public final void t(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.j != null) {
            this.s = mediaFormat.getInteger("sample-rate");
            int integer = mediaFormat.getInteger("channel-count");
            this.t = integer;
            try {
                this.j.a(new avp(this.s, integer, 2));
                this.j.c();
            } catch (avq e) {
                zga.n("SonicAudioProcessor doesn't support ENCODING_PCM_16BIT!?", e);
            }
        }
        super.t(mediaCodec, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oxt, defpackage.oyb, defpackage.oyx
    public final void v() {
        super.v();
        this.i.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oxt, defpackage.oyb
    public final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        if (j - bufferInfo.presentationTimeUs > 5000000) {
            long j3 = bufferInfo.presentationTimeUs;
            long j4 = bufferInfo.presentationTimeUs;
        }
        axe axeVar = this.j;
        if (axeVar != null) {
            if (z || !this.q) {
                byteBuffer3 = this.r;
            } else {
                if (this.p != 1.0f) {
                    axeVar.e(byteBuffer);
                    byteBuffer3 = this.j.b();
                    bufferInfo.size = byteBuffer3.limit();
                } else {
                    byteBuffer3 = byteBuffer;
                }
                this.r = byteBuffer3;
                if (this.o) {
                    this.o = false;
                    this.n = bufferInfo.presentationTimeUs;
                } else {
                    long j5 = this.n;
                    int i2 = bufferInfo.size;
                    int i3 = this.t;
                    long j6 = j5 + ((i2 * 1000000) / ((i3 + i3) * this.s));
                    this.n = j6;
                    bufferInfo.presentationTimeUs = (j6 / 1000) * 1000;
                }
            }
            byteBuffer2 = byteBuffer3;
        } else {
            byteBuffer2 = byteBuffer;
        }
        boolean y = super.y(j, j2, mediaCodec, byteBuffer2, bufferInfo, i, z);
        this.q = y;
        return y;
    }
}
