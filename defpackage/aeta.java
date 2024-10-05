package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeta extends ozz implements ozl {
    pfs m;
    public long n;
    public volatile int o;
    public volatile long p;
    public volatile long q;
    public final int r;
    private final ozm s;
    private MediaFormat t;
    private pbg u;
    private volatile boolean v;

    public aeta(pfq pfqVar, pfs pfsVar, int i, ozv ozvVar, long j, long j2, int i2, ozm ozmVar, MediaFormat mediaFormat, int i3) {
        super(pfqVar, pfsVar, i, ozvVar, j, j2, i2, false, 0);
        this.s = ozmVar;
        this.t = mediaFormat;
        this.u = null;
        this.r = i3;
        this.p = -1L;
        this.q = -1L;
        this.n = -1L;
    }

    @Override // defpackage.ozk
    public final long a() {
        return this.o;
    }

    @Override // defpackage.ozl
    public final void b(pbg pbgVar) {
        this.u = pbgVar;
    }

    @Override // defpackage.ozl
    public final void c(pcm pcmVar) {
    }

    @Override // defpackage.pcn
    public final void d(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            mediaFormat = null;
        }
        this.t = mediaFormat;
    }

    @Override // defpackage.ozz
    public final MediaFormat e() {
        return this.t;
    }

    @Override // defpackage.pcn
    public final void f(pgx pgxVar, int i) {
        this.k.f(pgxVar, i);
    }

    @Override // defpackage.pcn
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.k.g(j, i, i2, i3, bArr);
    }

    @Override // defpackage.ozz
    public final pbg h() {
        return this.u;
    }

    @Override // defpackage.pgc
    public final void i() {
        this.v = true;
    }

    @Override // defpackage.pcn
    public final int j(pbw pbwVar, int i, boolean z) {
        return this.k.j(pbwVar, i, z);
    }

    @Override // defpackage.pgc
    public final boolean l() {
        return this.v;
    }

    public final long n() {
        return this.q >= 0 ? this.q : this.h;
    }

    public final long o() {
        return this.p >= 0 ? this.p : this.g;
    }

    public final pfs p() {
        pfs pfsVar = this.m;
        return pfsVar != null ? pfsVar : this.d;
    }

    @Override // defpackage.pgc
    public final void k() {
        pfs j;
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 2) {
            pfs p = p();
            if (this.n != -1) {
                zhy b = zhy.b(p.a);
                b.g("min_lmt", String.valueOf(this.n));
                p = new pfs(b.a(), p.c, p.d, p.e, p.f, p.g, null);
            }
            j = pgz.j(p, this.o);
        } else if (i2 != 3) {
            j = pgz.j(p(), this.o);
        } else {
            this.o = 0;
            j = p();
        }
        try {
            pfq pfqVar = this.f;
            pbw pbwVar = new pbw(pfqVar, j.c, pfqVar.b(j));
            if (this.o == 0) {
                this.s.e(this);
            }
            do {
                try {
                    if (this.v) {
                        break;
                    }
                } catch (Throwable th) {
                    this.o = (int) (pbwVar.c - this.d.c);
                    throw th;
                }
            } while (this.s.i(pbwVar) == 0);
            this.o = (int) (pbwVar.c - this.d.c);
            int i3 = this.r;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if ((i4 == 2 || i4 == 3) && this.o <= 0) {
                throw new aesz();
            }
        } finally {
            this.f.c();
        }
    }
}
