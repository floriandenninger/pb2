package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtq implements adtm, ypd {
    public final ypa a;
    private final afsy b;
    private final aftj c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final shf g;
    private long h;
    private boolean i;

    static {
        zga.a("MDX.user");
    }

    public adtq(afsy afsyVar, aftj aftjVar, ypa ypaVar, shf shfVar, acun acunVar) {
        afsyVar.getClass();
        this.b = afsyVar;
        aftjVar.getClass();
        this.c = aftjVar;
        ypaVar.getClass();
        this.a = ypaVar;
        this.g = shfVar;
        long j = acunVar.B;
        this.f = j;
        this.d = j != 0;
        this.h = 0L;
        this.i = false;
        this.e = acunVar.C;
    }

    @Override // defpackage.adtm
    public final String a() {
        if (d()) {
            return this.b.c().e();
        }
        return null;
    }

    @Override // defpackage.adtm
    public final String b() {
        if (d()) {
            afsx c = this.b.c();
            afti a = this.c.a(c);
            long d = this.g.d();
            if ((this.e && this.i) || (this.d && d > this.h + this.f)) {
                a.b(c);
                this.h = d;
                this.i = false;
            } else if (this.h == 0) {
                this.h = d;
            }
            aftg a2 = a.a(c);
            if (a2.g()) {
                return a2.e();
            }
        }
        return null;
    }

    @Override // defpackage.adtm
    public final void c() {
        this.i = true;
    }

    public final boolean d() {
        return this.b.t();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            this.a.d(adtl.a);
            return null;
        }
        if (i == 1) {
            this.a.d(adtl.a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
