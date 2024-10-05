package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bakt extends balq {
    private final bakp a;
    private final int c;
    private final int d;

    public bakt(bakp bakpVar) {
        super(bajj.i, 2629746000L);
        this.a = bakpVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        bakp bakpVar = this.a;
        return bakpVar.U(j, bakpVar.Z(j));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return this.c;
    }

    @Override // defpackage.bajh
    public final int d() {
        return 1;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long e(long j, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return j;
        }
        long T = this.a.T(j);
        int Z = this.a.Z(j);
        int U = this.a.U(j, Z);
        int i4 = (U - 1) + i;
        if (i4 >= 0) {
            int i5 = this.c;
            i2 = (i4 / i5) + Z;
            i3 = (i4 % i5) + 1;
        } else {
            i2 = ((i4 / this.c) + Z) - 1;
            int abs = Math.abs(i4);
            int i6 = this.c;
            int i7 = abs % i6;
            if (i7 == 0) {
                i7 = i6;
            }
            i3 = (i6 - i7) + 1;
            if (i3 == 1) {
                i2++;
            }
        }
        int O = this.a.O(j, Z, U);
        int S = this.a.S(i2, i3);
        if (O > S) {
            O = S;
        }
        return this.a.af(i2, i3, O) + T;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long g(long j) {
        int Z = this.a.Z(j);
        return this.a.ag(Z, this.a.U(j, Z));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, 1, this.c);
        int Z = this.a.Z(j);
        bakp bakpVar = this.a;
        int O = bakpVar.O(j, Z, bakpVar.U(j, Z));
        int S = this.a.S(Z, i);
        if (O > S) {
            O = S;
        }
        return this.a.af(Z, i, O) + this.a.T(j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp q() {
        return this.a.c;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return this.a.g;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final boolean s(long j) {
        int Z = this.a.Z(j);
        return this.a.ai(Z) && this.a.U(j, Z) == this.d;
    }

    @Override // defpackage.balq
    public final long v(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        long T = this.a.T(j);
        int Z = this.a.Z(j);
        int U = this.a.U(j, Z);
        long j5 = (U - 1) + j2;
        if (j5 >= 0) {
            long j6 = this.c;
            j3 = Z + (j5 / j6);
            j4 = (j5 % j6) + 1;
        } else {
            j3 = (-1) + Z + (j5 / this.c);
            long abs = Math.abs(j5);
            int i2 = this.c;
            int i3 = (int) (abs % i2);
            if (i3 == 0) {
                i3 = i2;
            }
            j4 = (i2 - i3) + 1;
            if (j4 == 1) {
                j3++;
            }
        }
        if (j3 < -292275054 || j3 > 292278993) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Magnitude of add amount is too large: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = (int) j3;
        int i5 = (int) j4;
        int O = this.a.O(j, Z, U);
        int S = this.a.S(i4, i5);
        if (O > S) {
            O = S;
        }
        return this.a.af(i4, i5, O) + T;
    }

    @Override // defpackage.balq
    public final long w(long j, long j2) {
        if (j < j2) {
            return -x(j2, j);
        }
        int Z = this.a.Z(j);
        int U = this.a.U(j, Z);
        int Z2 = this.a.Z(j2);
        int U2 = this.a.U(j2, Z2);
        long j3 = (((Z - Z2) * this.c) + U) - U2;
        int O = this.a.O(j, Z, U);
        if (O == this.a.S(Z, U) && this.a.O(j2, Z2, U2) > O) {
            j2 = this.a.j.h(j2, O);
        }
        return j - this.a.ag(Z, U) < j2 - this.a.ag(Z2, U2) ? j3 - 1 : j3;
    }
}
