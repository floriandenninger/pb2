package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdn {
    private static final int[] a = {pgz.c("isom"), pgz.c("iso2"), pgz.c("iso3"), pgz.c("iso4"), pgz.c("iso5"), pgz.c("iso6"), pgz.c("avc1"), pgz.c("hvc1"), pgz.c("hev1"), pgz.c("mp41"), pgz.c("mp42"), pgz.c("3g2a"), pgz.c("3g2b"), pgz.c("3gr6"), pgz.c("3gs6"), pgz.c("3ge6"), pgz.c("3gg6"), pgz.c("M4V "), pgz.c("M4A "), pgz.c("f4v "), pgz.c("kddi"), pgz.c("M4VP"), pgz.c("qt  "), pgz.c("MSNV")};

    public static boolean a(pbw pbwVar, boolean z) {
        boolean z2;
        int i;
        long j = pbwVar.b;
        if (j == -1 || j > 4096) {
            j = 4096;
        }
        int i2 = (int) j;
        pgx pgxVar = new pgx(64);
        int i3 = 0;
        boolean z3 = false;
        while (i3 < i2) {
            pbwVar.g(pgxVar.a, 0, 8);
            pgxVar.z(0);
            long n = pgxVar.n();
            int c = pgxVar.c();
            if (n == 1) {
                pbwVar.g(pgxVar.a, 8, 8);
                n = pgxVar.o();
                i = 16;
            } else {
                i = 8;
            }
            long j2 = i;
            if (n < j2) {
                return false;
            }
            i3 += i;
            if (c != pdc.E) {
                if (c == pdc.N || c == pdc.P) {
                    z2 = true;
                    break;
                }
                if ((i3 + n) - j2 >= i2) {
                    break;
                }
                int i4 = (int) (n - j2);
                i3 += i4;
                if (c == pdc.d) {
                    if (i4 < 8) {
                        return false;
                    }
                    if (pgxVar.b() < i4) {
                        pgxVar.x(new byte[i4], i4);
                    }
                    pbwVar.g(pgxVar.a, 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 == 1) {
                            pgxVar.A(4);
                        } else {
                            int c2 = pgxVar.c();
                            if ((c2 >>> 8) != pgz.c("3gp")) {
                                int[] iArr = a;
                                int length = iArr.length;
                                for (int i7 = 0; i7 < 24; i7++) {
                                    if (iArr[i7] != c2) {
                                    }
                                }
                            }
                            z3 = true;
                            break;
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i4 != 0) {
                    pbwVar.e(i4);
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
