package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjj {
    private static final byte[] a = pts.Z("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r24 == 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x087e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pjq a(defpackage.pjf r42, defpackage.pjg r43, long r44, androidx.media3.common.DrmInitData r46) {
        /*
            Method dump skipped, instructions count: 2219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjj.a(pjf, pjg, long, androidx.media3.common.DrmInitData):pjq");
    }

    private static int b(pth pthVar) {
        int i = pthVar.i();
        int i2 = i & 127;
        while ((i & 128) == 128) {
            i = pthVar.i();
            i2 = (i2 << 7) | (i & 127);
        }
        return i2;
    }

    private static Pair c(pth pthVar, int i) {
        pthVar.G(i + 12);
        pthVar.H(1);
        b(pthVar);
        pthVar.H(2);
        int i2 = pthVar.i();
        if ((i2 & 128) != 0) {
            pthVar.H(2);
        }
        if ((i2 & 64) != 0) {
            pthVar.H(pthVar.m());
        }
        if ((i2 & 32) != 0) {
            pthVar.H(2);
        }
        pthVar.H(1);
        b(pthVar);
        String f = psz.f(pthVar.i());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return Pair.create(f, null);
        }
        pthVar.H(12);
        pthVar.H(1);
        int b = b(pthVar);
        byte[] bArr = new byte[b];
        pthVar.B(bArr, 0, b);
        return Pair.create(f, bArr);
    }

    private static Pair d(pth pthVar, int i, int i2) {
        Integer num;
        pjr pjrVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = pthVar.b;
        while (i5 - i < i2) {
            pthVar.G(i5);
            int d = pthVar.d();
            pse.h(d > 0, "childAtomSize should be positive");
            if (pthVar.d() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < d) {
                    pthVar.G(i6);
                    int d2 = pthVar.d();
                    int d3 = pthVar.d();
                    if (d3 == 1718775137) {
                        num2 = Integer.valueOf(pthVar.d());
                    } else if (d3 == 1935894637) {
                        pthVar.H(4);
                        str = pthVar.v(4);
                    } else if (d3 == 1935894633) {
                        i7 = i6;
                        i8 = d2;
                    }
                    i6 += d2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    pse.j(num2, "frma atom is mandatory");
                    pse.h(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            pjrVar = null;
                            break;
                        }
                        pthVar.G(i9);
                        int d4 = pthVar.d();
                        if (pthVar.d() == 1952804451) {
                            int d5 = pthVar.d();
                            pthVar.H(1);
                            if (pjh.d(d5) == 0) {
                                pthVar.H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int i10 = pthVar.i();
                                int i11 = (i10 & 240) >> 4;
                                i3 = i10 & 15;
                                i4 = i11;
                            }
                            boolean z = pthVar.i() == 1;
                            int i12 = pthVar.i();
                            byte[] bArr2 = new byte[16];
                            pthVar.B(bArr2, 0, 16);
                            if (z && i12 == 0) {
                                int i13 = pthVar.i();
                                byte[] bArr3 = new byte[i13];
                                pthVar.B(bArr3, 0, i13);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            pjrVar = new pjr(z, str, i12, bArr2, i4, i3, bArr);
                        } else {
                            i9 += d4;
                        }
                    }
                    pse.j(pjrVar, "tenc atom is mandatory");
                    create = Pair.create(num, pjrVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += d;
        }
        return null;
    }
}
