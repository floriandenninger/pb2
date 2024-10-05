package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bakv extends balq {
    private final bakp a;

    public bakv(bakp bakpVar) {
        super(bajj.l, 31556952000L);
        this.a = bakpVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        return this.a.Y(j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.bajh
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long e(long j, int i) {
        return i == 0 ? j : h(j, a(j) + i);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long g(long j) {
        long g = this.a.k.g(j);
        return this.a.V(g) > 1 ? g - ((r0 - 1) * 604800000) : g;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, Math.abs(i), -292275054, 292278993);
        int a = a(j);
        if (a == i) {
            return j;
        }
        int P = this.a.P(j);
        int X = this.a.X(a);
        int X2 = this.a.X(i);
        if (X2 < X) {
            X = X2;
        }
        int V = this.a.V(j);
        if (V <= X) {
            X = V;
        }
        long ah = this.a.ah(j, i);
        int a2 = a(ah);
        if (a2 < i) {
            ah += 604800000;
        } else if (a2 > i) {
            ah -= 604800000;
        }
        return this.a.i.h(ah + ((X - this.a.V(ah)) * 604800000), P);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp q() {
        return this.a.d;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return null;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final boolean s(long j) {
        bakp bakpVar = this.a;
        return bakpVar.X(bakpVar.Y(j)) > 52;
    }

    @Override // defpackage.balq
    public final long v(long j, long j2) {
        return e(j, aynu.w(j2));
    }

    @Override // defpackage.balq
    public final long w(long j, long j2) {
        if (j < j2) {
            return -x(j2, j);
        }
        int a = a(j);
        int a2 = a(j2);
        long f = f(j);
        long f2 = f(j2);
        if (f2 >= 31449600000L && this.a.X(a) <= 52) {
            f2 -= 604800000;
        }
        int i = a - a2;
        if (f < f2) {
            i--;
        }
        return i;
    }
}
