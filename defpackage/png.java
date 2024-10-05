package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class png {
    public final bbp a;
    public final Object b;
    public final bcy[] c;
    public boolean d;
    public boolean e;
    public pnh f;
    public boolean g;
    public png h;
    public asj i = asj.a;
    public ber j;
    public long k;
    private final boolean[] l;
    private final pof[] m;
    private final beq n;
    private final pnq o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [bav] */
    public png(pof[] pofVarArr, long j, beq beqVar, bfg bfgVar, pnq pnqVar, pnh pnhVar, ber berVar) {
        this.m = pofVarArr;
        this.k = j;
        this.n = beqVar;
        this.o = pnqVar;
        this.b = pnhVar.i.a;
        this.f = pnhVar;
        this.j = berVar;
        int length = pofVarArr.length;
        this.c = new bcy[length];
        this.l = new boolean[length];
        ash ashVar = pnhVar.i;
        long j2 = pnhVar.a;
        long j3 = pnhVar.c;
        Object m = pkx.m(ashVar.a);
        ash b = ashVar.b(pkx.l(ashVar.a));
        pno pnoVar = (pno) pnqVar.c.get(m);
        pse.c(pnoVar);
        pnqVar.g.add(pnoVar);
        pnn pnnVar = (pnn) pnqVar.f.get(pnoVar);
        if (pnnVar != null) {
            pnnVar.a.rt(pnnVar.b);
        }
        pnoVar.c.add(b);
        bbj v = pnoVar.a.v(b, bfgVar, j2);
        pnqVar.b.put(v, pnoVar);
        pnqVar.c();
        this.a = j3 != -9223372036854775807L ? new bav(v, true, 0L, j3) : v;
    }

    private final void n() {
        if (!l()) {
            return;
        }
        int i = 0;
        while (true) {
            ber berVar = this.j;
            if (i >= berVar.a) {
                return;
            }
            boolean b = berVar.b(i);
            bel belVar = this.j.c[i];
            if (b && belVar != null) {
                belVar.l();
            }
            i++;
        }
    }

    private final void o() {
        if (!l()) {
            return;
        }
        int i = 0;
        while (true) {
            ber berVar = this.j;
            if (i >= berVar.a) {
                return;
            }
            boolean b = berVar.b(i);
            bel belVar = this.j.c[i];
            if (b && belVar != null) {
                belVar.m();
            }
            i++;
        }
    }

    public final long a(ber berVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= berVar.a) {
                break;
            }
            boolean[] zArr2 = this.l;
            if (z || !berVar.a(this.j, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            pof[] pofVarArr = this.m;
            if (i2 >= pofVarArr.length) {
                break;
            }
            pofVarArr[i2].ae();
            i2++;
        }
        n();
        this.j = berVar;
        o();
        long f = this.a.f(berVar.c, this.l, this.c, zArr, j);
        int i3 = 0;
        while (true) {
            pof[] pofVarArr2 = this.m;
            if (i3 >= pofVarArr2.length) {
                break;
            }
            pofVarArr2[i3].ae();
            i3++;
        }
        this.e = false;
        int i4 = 0;
        while (true) {
            bcy[] bcyVarArr = this.c;
            if (i4 >= bcyVarArr.length) {
                return f;
            }
            if (bcyVarArr[i4] != null) {
                pse.g(berVar.b(i4));
                this.m[i4].ae();
                this.e = true;
            } else {
                pse.g(berVar.c[i4] == null);
            }
            i4++;
        }
    }

    public final long b() {
        if (!this.d) {
            return this.f.a;
        }
        long jJ = this.e ? this.a.jJ() : Long.MIN_VALUE;
        return jJ == Long.MIN_VALUE ? this.f.d : jJ;
    }

    public final long c() {
        if (this.d) {
            return this.a.c();
        }
        return 0L;
    }

    public final long d() {
        return this.f.a + this.k;
    }

    public final long e(long j) {
        return j - this.k;
    }

    public final long f(long j) {
        return j + this.k;
    }

    public final ber g(float f, pou pouVar) {
        ber h = this.n.h(this.m, this.i, this.f.i, pouVar);
        for (bel belVar : h.c) {
            if (belVar != null) {
                belVar.n(f);
            }
        }
        return h;
    }

    public final void h() {
        n();
        pnq pnqVar = this.o;
        bbp bbpVar = this.a;
        try {
            if (bbpVar instanceof bav) {
                pnqVar.e(((bav) bbpVar).a);
            } else {
                pnqVar.e(bbpVar);
            }
        } catch (RuntimeException e) {
            prh.j("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void i(png pngVar) {
        if (pngVar == this.h) {
            return;
        }
        n();
        this.h = pngVar;
        o();
    }

    public final void j() {
        bbp bbpVar = this.a;
        if (bbpVar instanceof bav) {
            long j = this.f.c;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((bav) bbpVar).n(0L, j);
        }
    }

    public final boolean k() {
        return this.d && (!this.e || this.a.jJ() == Long.MIN_VALUE);
    }

    public final boolean l() {
        return this.h == null;
    }

    public final long m(ber berVar, long j) {
        return a(berVar, j, false, new boolean[this.m.length]);
    }
}
