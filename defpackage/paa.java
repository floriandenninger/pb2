package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class paa extends ozz {
    private final MediaFormat m;
    private volatile int n;
    private volatile boolean o;

    public paa(pfq pfqVar, pfs pfsVar, ozv ozvVar, long j, long j2, int i, MediaFormat mediaFormat, int i2) {
        super(pfqVar, pfsVar, 1, ozvVar, j, j2, i, true, i2);
        this.m = mediaFormat;
    }

    @Override // defpackage.ozk
    public final long a() {
        return this.n;
    }

    @Override // defpackage.ozz
    public final MediaFormat e() {
        return this.m;
    }

    @Override // defpackage.ozz
    public final pbg h() {
        return null;
    }

    @Override // defpackage.pgc
    public final void i() {
        this.o = true;
    }

    @Override // defpackage.pgc
    public final void k() {
        try {
            this.f.b(pgz.j(this.d, this.n));
            int i = 0;
            while (i != -1) {
                this.n += i;
                pbx pbxVar = this.k;
                pfq pfqVar = this.f;
                pck pckVar = pbxVar.a;
                int a = pfqVar.a(pckVar.j.a, pckVar.h, pckVar.a(Integer.MAX_VALUE));
                if (a == -1) {
                    i = -1;
                } else {
                    pckVar.h += a;
                    pckVar.g += a;
                    i = a;
                }
            }
            this.k.g(this.g, 1, this.n, 0, null);
        } finally {
            pgz.n(this.f);
        }
    }

    @Override // defpackage.pgc
    public final boolean l() {
        return this.o;
    }
}
