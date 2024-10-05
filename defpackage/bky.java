package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bky {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(bii biiVar, boolean z) {
        boolean z2;
        long c = biiVar.c();
        long j = 4096;
        long j2 = -1;
        if (c != -1 && c <= 4096) {
            j = c;
        }
        int i = (int) j;
        pth pthVar = new pth(64);
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        while (i2 < i) {
            pthVar.C(8);
            if (!biiVar.o(pthVar.a, z3 ? 1 : 0, 8, true)) {
                break;
            }
            long p = pthVar.p();
            int d = pthVar.d();
            int i3 = 16;
            if (p == 1) {
                biiVar.j(pthVar.a, 8, 8);
                pthVar.F(16);
                p = pthVar.o();
            } else {
                if (p == 0) {
                    long c2 = biiVar.c();
                    if (c2 != j2) {
                        p = 8 + (c2 - biiVar.d());
                    }
                }
                i3 = 8;
            }
            long j3 = i3;
            if (p < j3) {
                return z3;
            }
            i2 += i3;
            if (d == 1836019574) {
                i += (int) p;
                if (c != -1 && i > c) {
                    i = (int) c;
                }
                j2 = -1;
            } else {
                if (d == 1836019558 || d == 1836475768) {
                    z2 = true;
                    break;
                }
                long j4 = c;
                if ((i2 + p) - j3 >= i) {
                    break;
                }
                int i4 = (int) (p - j3);
                i2 += i4;
                if (d == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    pthVar.C(i4);
                    biiVar.j(pthVar.a, 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 == 1) {
                            pthVar.H(4);
                        } else {
                            int d2 = pthVar.d();
                            if ((d2 >>> 8) != 3368816) {
                                if (d2 == 1751476579) {
                                    d2 = 1751476579;
                                }
                                int[] iArr = a;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != d2) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i4 != 0) {
                    biiVar.f(i4);
                }
                j2 = -1;
                c = j4;
                z3 = false;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }
}
