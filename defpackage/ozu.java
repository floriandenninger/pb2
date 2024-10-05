package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ozu extends ozz implements ozl {
    private final ozm m;
    private final long n;
    private final int o;
    private final int p;
    private MediaFormat q;
    private pbg r;
    private volatile int s;
    private volatile boolean t;

    public ozu(pfq pfqVar, pfs pfsVar, int i, ozv ozvVar, long j, long j2, int i2, long j3, ozm ozmVar, MediaFormat mediaFormat, int i3, int i4, pbg pbgVar, boolean z, int i5) {
        super(pfqVar, pfsVar, i, ozvVar, j, j2, i2, z, i5);
        this.m = ozmVar;
        this.n = j3;
        this.o = i3;
        this.p = i4;
        this.q = n(mediaFormat, j3, i3, i4);
        this.r = pbgVar;
    }

    private static MediaFormat n(MediaFormat mediaFormat, long j, int i, int i2) {
        int i3;
        MediaFormat mediaFormat2 = mediaFormat;
        if (mediaFormat2 == null) {
            return null;
        }
        if (j != 0) {
            long j2 = mediaFormat2.w;
            if (j2 != Long.MAX_VALUE) {
                mediaFormat2 = new MediaFormat(mediaFormat2.a, mediaFormat2.b, mediaFormat2.c, mediaFormat2.d, mediaFormat2.e, mediaFormat2.h, mediaFormat2.i, mediaFormat2.l, mediaFormat2.m, mediaFormat2.q, mediaFormat2.r, mediaFormat2.v, j2 + j, mediaFormat2.f, mediaFormat2.g, mediaFormat2.j, mediaFormat2.k, mediaFormat2.s, mediaFormat2.t, mediaFormat2.u, mediaFormat2.o, mediaFormat2.n, mediaFormat2.p);
            }
        }
        if (i != -1) {
            i3 = i;
        } else {
            if (i2 == -1) {
                return mediaFormat2;
            }
            i3 = -1;
        }
        return new MediaFormat(mediaFormat2.a, mediaFormat2.b, mediaFormat2.c, mediaFormat2.d, mediaFormat2.e, mediaFormat2.h, mediaFormat2.i, mediaFormat2.l, mediaFormat2.m, mediaFormat2.q, mediaFormat2.r, mediaFormat2.v, mediaFormat2.w, mediaFormat2.f, mediaFormat2.g, i3, i2, mediaFormat2.s, mediaFormat2.t, mediaFormat2.u, mediaFormat2.o, mediaFormat2.n, mediaFormat2.p);
    }

    @Override // defpackage.ozk
    public final long a() {
        return this.s;
    }

    @Override // defpackage.ozl
    public final void b(pbg pbgVar) {
        this.r = pbgVar;
    }

    @Override // defpackage.ozl
    public final void c(pcm pcmVar) {
    }

    @Override // defpackage.pcn
    public final void d(MediaFormat mediaFormat) {
        this.q = n(mediaFormat, this.n, this.o, this.p);
    }

    @Override // defpackage.ozz
    public final MediaFormat e() {
        return this.q;
    }

    @Override // defpackage.pcn
    public final void f(pgx pgxVar, int i) {
        this.k.f(pgxVar, i);
    }

    @Override // defpackage.pcn
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.k.g(this.n + j, i, i2, i3, bArr);
    }

    @Override // defpackage.ozz
    public final pbg h() {
        return this.r;
    }

    @Override // defpackage.pgc
    public final void i() {
        this.t = true;
    }

    @Override // defpackage.pcn
    public final int j(pbw pbwVar, int i, boolean z) {
        return this.k.j(pbwVar, i, z);
    }

    @Override // defpackage.pgc
    public final void k() {
        pfs j = pgz.j(this.d, this.s);
        try {
            pfq pfqVar = this.f;
            pbw pbwVar = new pbw(pfqVar, j.c, pfqVar.b(j));
            if (this.s == 0) {
                this.m.e(this);
            }
            while (!this.t && this.m.i(pbwVar) == 0) {
                try {
                } finally {
                    this.s = (int) (pbwVar.c - this.d.c);
                }
            }
        } finally {
            pgz.n(this.f);
        }
    }

    @Override // defpackage.pgc
    public final boolean l() {
        return this.t;
    }
}
