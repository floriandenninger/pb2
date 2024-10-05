package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bakw extends balq {
    protected final bakp a;

    public bakw(bakp bakpVar) {
        super(bajj.g, 31556952000L);
        this.a = bakpVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        return this.a.Z(j);
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
        if (i == 0) {
            return j;
        }
        int a = a(j);
        int i2 = a + i;
        if ((a ^ i2) >= 0 || (a ^ i) < 0) {
            return h(j, i2);
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("The calculation caused an overflow: ");
        sb.append(a);
        sb.append(" + ");
        sb.append(i);
        throw new ArithmeticException(sb.toString());
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long g(long j) {
        return this.a.ae(a(j));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, -292275054, 292278993);
        return this.a.ah(j, i);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp q() {
        return this.a.c;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return null;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final boolean s(long j) {
        return this.a.ai(a(j));
    }

    @Override // defpackage.balq
    public final long v(long j, long j2) {
        return e(j, aynu.w(j2));
    }

    @Override // defpackage.balq
    public final long w(long j, long j2) {
        if (j < j2) {
            return -this.a.ad(j2, j);
        }
        return this.a.ad(j, j2);
    }
}
