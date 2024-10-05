package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ozy extends ozk implements ozl {
    public MediaFormat g;
    public pbg h;
    public pcm i;
    private final ozm j;
    private volatile int k;
    private volatile boolean l;

    public ozy(pfq pfqVar, pfs pfsVar, int i, ozv ozvVar, ozm ozmVar, int i2) {
        super(pfqVar, pfsVar, 2, i, ozvVar, i2);
        this.j = ozmVar;
    }

    @Override // defpackage.ozk
    public final long a() {
        return this.k;
    }

    @Override // defpackage.ozl
    public final void b(pbg pbgVar) {
        this.h = pbgVar;
    }

    @Override // defpackage.ozl
    public final void c(pcm pcmVar) {
        this.i = pcmVar;
    }

    @Override // defpackage.pcn
    public final void d(MediaFormat mediaFormat) {
        this.g = mediaFormat;
    }

    @Override // defpackage.pcn
    public final void f(pgx pgxVar, int i) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    @Override // defpackage.pcn
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    @Override // defpackage.pgc
    public final void i() {
        this.l = true;
    }

    @Override // defpackage.pcn
    public final int j(pbw pbwVar, int i, boolean z) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    @Override // defpackage.pgc
    public final void k() {
        pfs j = pgz.j(this.d, this.k);
        try {
            pfq pfqVar = this.f;
            pbw pbwVar = new pbw(pfqVar, j.c, pfqVar.b(j));
            if (this.k == 0) {
                this.j.e(this);
            }
            while (!this.l && this.j.i(pbwVar) == 0) {
                try {
                } finally {
                    this.k = (int) (pbwVar.c - this.d.c);
                }
            }
        } finally {
            pgz.n(this.f);
        }
    }

    @Override // defpackage.pgc
    public final boolean l() {
        return this.l;
    }
}
