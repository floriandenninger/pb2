package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmo implements bhz {
    private final ptq a;
    private final pth b = new pth();

    public bmo(ptq ptqVar) {
        this.a = ptqVar;
    }

    @Override // defpackage.bhz
    public final bhy a(bii biiVar, long j) {
        int e;
        long j2;
        bid bidVar = (bid) biiVar;
        long j3 = bidVar.c;
        int min = (int) Math.min(20000L, bidVar.b - j3);
        this.b.C(min);
        biiVar.j(this.b.a, 0, min);
        pth pthVar = this.b;
        int i = -1;
        long j4 = -9223372036854775807L;
        int i2 = -1;
        while (pthVar.a() >= 4) {
            if (bia.e(pthVar.a, pthVar.b) != 442) {
                pthVar.H(1);
            } else {
                pthVar.H(4);
                long b = bmv.b(pthVar);
                if (b != -9223372036854775807L) {
                    long b2 = this.a.b(b);
                    if (b2 > j) {
                        if (j4 == -9223372036854775807L) {
                            return bhy.a(b2, j3);
                        }
                        j2 = i2;
                    } else if (100000 + b2 > j) {
                        j2 = pthVar.b;
                    } else {
                        i2 = pthVar.b;
                        j4 = b2;
                    }
                    return bhy.b(j3 + j2);
                }
                int i3 = pthVar.c;
                if (pthVar.a() < 10) {
                    pthVar.G(i3);
                } else {
                    pthVar.H(9);
                    int i4 = pthVar.i() & 7;
                    if (pthVar.a() < i4) {
                        pthVar.G(i3);
                    } else {
                        pthVar.H(i4);
                        if (pthVar.a() >= 4) {
                            if (bia.e(pthVar.a, pthVar.b) == 443) {
                                pthVar.H(4);
                                int m = pthVar.m();
                                if (pthVar.a() < m) {
                                    pthVar.G(i3);
                                } else {
                                    pthVar.H(m);
                                }
                            }
                            while (true) {
                                if (pthVar.a() < 4 || (e = bia.e(pthVar.a, pthVar.b)) == 442 || e == 441 || (e >>> 8) != 1) {
                                    break;
                                }
                                pthVar.H(4);
                                if (pthVar.a() >= 2) {
                                    pthVar.G(Math.min(pthVar.c, pthVar.b + pthVar.m()));
                                } else {
                                    pthVar.G(i3);
                                    break;
                                }
                            }
                        } else {
                            pthVar.G(i3);
                        }
                    }
                }
                i = pthVar.b;
            }
        }
        return j4 != -9223372036854775807L ? bhy.c(j4, j3 + i) : bhy.a;
    }

    @Override // defpackage.bhz
    public final void b() {
        this.b.D(pts.f);
    }
}
