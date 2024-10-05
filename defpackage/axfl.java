package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfl implements ozb {
    public boolean b;
    public final afbe c;
    private final Handler d;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private axfa l;
    private boolean m;
    private ByteBuffer n;
    private ByteBuffer o;
    private boolean q;
    private boolean r;
    private long s;
    private boolean t;
    private boolean u;
    private final axez v;
    private int e = 0;
    public final ozi a = new ozi(null);
    private boolean p = false;

    public axfl(Handler handler, afbe afbeVar, axez axezVar) {
        this.c = afbeVar;
        this.d = handler;
        this.v = axezVar;
    }

    private final boolean m() {
        return this.u && !h();
    }

    @Override // defpackage.ozb
    public final long a() {
        long d = this.a.d(m());
        if (d != Long.MIN_VALUE) {
            if (!this.h) {
                d = Math.max(this.f, d);
            }
            this.f = d;
            this.h = false;
        }
        return this.f;
    }

    @Override // defpackage.ozb
    public final void b(long j) {
        axfa axfaVar = this.l;
        if (axfaVar != null) {
            this.n = null;
            axfaVar.a();
            this.p = false;
        }
        this.a.j();
        this.h = true;
        this.g = j;
        this.f = j;
        this.i = 0L;
        this.q = false;
        this.u = false;
    }

    @Override // defpackage.ozb
    public final void c() {
        this.u = true;
    }

    @Override // defpackage.ozb
    public final void d() {
        this.t = false;
        this.a.h();
    }

    @Override // defpackage.ozb
    public final void e() {
        this.t = true;
        this.a.i();
    }

    @Override // defpackage.ozb
    public final void f() {
        axfa axfaVar = this.l;
        if (axfaVar != null) {
            axfaVar.a();
            this.n = null;
            this.p = false;
        }
        this.e = 0;
        this.a.j();
    }

    @Override // defpackage.ozb
    public final void g(float f) {
        this.a.l(f);
    }

    @Override // defpackage.ozb
    public final boolean h() {
        return this.a.m();
    }

    public final void i(MediaFormat mediaFormat) {
        this.j = mediaFormat.q;
        this.m = "audio/raw".equals(mediaFormat.b);
        this.k = mediaFormat.r;
        this.b = true;
    }

    public final void j(int i, int i2) {
        int i3;
        axfa axfdVar;
        this.b = false;
        opn.i(this.j > 0);
        opn.i(i2 > 0);
        if (!this.m) {
            this.k = i;
        }
        try {
            axez axezVar = this.v;
            int i4 = this.k;
            int i5 = this.j;
            if (i5 == 4) {
                i3 = 4;
            } else if (i5 != 6) {
                Log.e("AmbisonicAudioRendererFactory", "Unsupported number of input channels");
                i3 = 0;
            } else {
                i3 = 7;
            }
            if (i3 != 0) {
                try {
                    axfdVar = new axfd(i4, i5, axezVar.a, i3);
                } catch (Exception e) {
                    Log.e("AmbisonicAudioRendererFactory", "Error creating native spatializing audio processor; creating no-op processor instead", e);
                }
                this.l = axfdVar;
                axfdVar.d();
                axfq.d();
                AudioTrack.getMinBufferSize(this.k, 4, 2);
                this.l.d();
                axfq.d();
                this.o = ByteBuffer.allocateDirect(4096).order(ByteOrder.LITTLE_ENDIAN);
                this.p = false;
                ozi oziVar = this.a;
                this.l.d();
                oziVar.e("audio/raw", 2, this.k, 2, 4096);
            }
            axfdVar = new axff();
            this.l = axfdVar;
            axfdVar.d();
            axfq.d();
            AudioTrack.getMinBufferSize(this.k, 4, 2);
            this.l.d();
            axfq.d();
            this.o = ByteBuffer.allocateDirect(4096).order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            ozi oziVar2 = this.a;
            this.l.d();
            oziVar2.e("audio/raw", 2, this.k, 2, 4096);
        } catch (Exception e2) {
            axfb axfbVar = new axfb(e2);
            if (this.c != null) {
                this.d.post(new axfh(this, axfbVar));
            }
            throw new oxh(axfbVar);
        }
    }

    public final void k() {
        if (this.l == null || this.q) {
            return;
        }
        boolean z = false;
        do {
            if (!this.p || z) {
                boolean c = this.l.c(this.o);
                this.p = c;
                if (!c) {
                    if (!m() || this.q) {
                        return;
                    }
                    this.a.g();
                    this.q = true;
                    return;
                }
            }
            int limit = this.o.limit();
            this.l.d();
            axfq.c(limit >= 0);
            axfq.c(true);
            axfq.c(limit % 4 == 0);
            long j = this.g;
            long j2 = (limit / 2) / 2;
            long j3 = this.i + j2;
            int i = this.k;
            axfq.c(i > 0);
            long j4 = j + ((j3 * 1000000) / i);
            try {
                ozi oziVar = this.a;
                ByteBuffer byteBuffer = this.o;
                int a = oziVar.a(byteBuffer, byteBuffer.position(), this.o.limit(), j4);
                this.s = SystemClock.elapsedRealtime();
                if ((a & 1) != 0) {
                    this.h = true;
                }
                if ((a & 2) != 0) {
                    this.i += j2;
                    z = true;
                } else {
                    z = false;
                }
            } catch (ozh e) {
                if (this.c != null) {
                    this.d.post(new axfj(this, e));
                }
                throw new oxh(e);
            }
        } while (z);
    }

    public final boolean l(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (z) {
            this.a.f();
            return true;
        }
        if (this.a.n()) {
            boolean z2 = this.r;
            boolean m = this.a.m();
            this.r = m;
            if (z2 && !m && this.t) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.s;
                long j = this.a.d;
                long j2 = j == -1 ? -1L : j / 1000;
                if (this.c != null) {
                    this.d.post(new axfk(this, j2, elapsedRealtime));
                }
            }
        } else {
            try {
                int i3 = this.e;
                if (i3 != 0) {
                    this.a.c(i3);
                } else {
                    this.e = this.a.b();
                }
                this.r = false;
                if (this.t) {
                    this.a.i();
                }
            } catch (ozg e) {
                if (this.c != null) {
                    this.d.post(new axfi(this, e));
                }
                throw new oxh(e);
            }
        }
        ByteBuffer byteBuffer2 = this.n;
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            this.n = duplicate;
        }
        boolean b = this.l.b(this.n);
        k();
        return b;
    }
}
