package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpd extends aoam {
    public static int aM(aoaj aoajVar, long j, long j2, int i, float f, long j3, int i2, int i3, float f2, long j4, int i4, boolean z, int i5, int i6, int i7, long j5, float f3) {
        aoajVar.p(16);
        aoajVar.s(15, f3);
        aoajVar.t(14, (int) j5);
        aoajVar.u(13, i7);
        aoajVar.t(12, i6);
        aoajVar.t(11, i5);
        aoajVar.t(9, i4);
        aoajVar.t(8, (int) j4);
        aoajVar.s(7, f2);
        aoajVar.u(6, i3);
        aoajVar.t(5, i2);
        aoajVar.t(4, (int) j3);
        aoajVar.s(3, f);
        aoajVar.u(2, i);
        aoajVar.t(1, (int) j2);
        aoajVar.t(0, (int) j);
        aoajVar.g(10, z, false);
        return aoajVar.c();
    }

    public final float aI() {
        int b = b(34);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float aJ() {
        int b = b(10);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float aK() {
        int b = b(18);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final int aL() {
        int b = b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aN() {
        int b = b(26);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aO() {
        int b = b(14);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aP() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final long aQ() {
        if (b(32) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long aR() {
        if (b(12) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long aS() {
        if (b(20) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final String aT() {
        int b = b(30);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final String aU() {
        int b = b(8);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final boolean aV() {
        int b = b(24);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final aoam aW() {
        aoam aoamVar = new aoam();
        int b = b(16);
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
