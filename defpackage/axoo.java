package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axoo extends aoam {
    public static int aI(aoaj aoajVar, long j, long j2, int i, int i2) {
        aoajVar.p(4);
        aoajVar.u(3, i2);
        aoajVar.u(2, i);
        aoajVar.t(1, (int) j2);
        aoajVar.t(0, (int) j);
        return aoajVar.c();
    }

    public final aoam aJ() {
        aoam aoamVar = new aoam();
        int b = b(10);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam aK() {
        aoam aoamVar = new aoam();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    @Override // defpackage.aoam
    public final long p() {
        if (b(6) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    @Override // defpackage.aoam
    public final long q() {
        if (b(4) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }
}
