package defpackage;

import android.util.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pdi {
    private static final int a = pgz.c("cenc");

    public static pch a(pdb pdbVar, boolean z) {
        pch pchVar;
        if (z) {
            return null;
        }
        pgx pgxVar = pdbVar.a;
        pgxVar.z(8);
        while (pgxVar.a() >= 8) {
            int c = pgxVar.c();
            if (pgxVar.c() != pdc.aC) {
                pgxVar.A(c - 8);
            } else {
                pgxVar.z(pgxVar.b - 8);
                pgxVar.y(pgxVar.b + c);
                pgxVar.A(12);
                pgx pgxVar2 = new pgx();
                while (pgxVar.a() >= 8) {
                    int c2 = pgxVar.c() - 8;
                    if (pgxVar.c() == pdc.aD) {
                        pgxVar2.x(pgxVar.a, pgxVar.b + c2);
                        pgxVar2.z(pgxVar.b);
                        while (true) {
                            if (pgxVar2.a() <= 0) {
                                pchVar = null;
                                break;
                            }
                            int c3 = pgxVar2.b + pgxVar2.c();
                            if (pgxVar2.c() == pdc.aP) {
                                String str = null;
                                String str2 = null;
                                String str3 = null;
                                while (pgxVar2.b < c3) {
                                    int c4 = pgxVar2.c() - 12;
                                    int c5 = pgxVar2.c();
                                    pgxVar2.A(4);
                                    if (c5 == pdc.aE) {
                                        str3 = pgxVar2.r(c4);
                                    } else if (c5 == pdc.aF) {
                                        str = pgxVar2.r(c4);
                                    } else if (c5 == pdc.aG) {
                                        pgxVar2.A(4);
                                        str2 = pgxVar2.r(c4 - 4);
                                    } else {
                                        pgxVar2.A(c4);
                                    }
                                }
                                if (str != null && str2 != null && "com.apple.iTunes".equals(str3)) {
                                    pchVar = pch.a(str, str2);
                                    break;
                                }
                            } else {
                                pgxVar2.z(c3);
                            }
                        }
                        if (pchVar != null) {
                            return pchVar;
                        }
                    }
                    pgxVar.A(c2);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r10 == 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0882 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pdo b(defpackage.pda r45, defpackage.pdb r46, long r47, boolean r49) {
        /*
            Method dump skipped, instructions count: 2221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdi.b(pda, pdb, long, boolean):pdo");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0165 A[ADDED_TO_REGION, LOOP:10: B:138:0x0165->B:139:0x0167, LOOP_START, PHI: r13 r14 r23 r25
  0x0165: PHI (r13v3 int) = (r13v1 int), (r13v10 int) binds: [B:137:0x0163, B:139:0x0167] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r14v3 int) = (r14v1 int), (r14v9 int) binds: [B:137:0x0163, B:139:0x0167] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r23v2 int) = (r23v1 int), (r23v5 int) binds: [B:137:0x0163, B:139:0x0167] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:137:0x0163, B:139:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pdr c(defpackage.pdo r42, defpackage.pda r43) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdi.c(pdo, pda):pdr");
    }

    private static int d(pgx pgxVar) {
        int h = pgxVar.h();
        int i = h & 127;
        while ((h & 128) == 128) {
            h = pgxVar.h();
            i = (i << 7) | (h & 127);
        }
        return i;
    }

    private static int e(pgx pgxVar, int i, int i2, pdf pdfVar, int i3) {
        int i4 = pgxVar.b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            pgxVar.z(i4);
            int c = pgxVar.c();
            opn.j(c > 0, "childAtomSize should be positive");
            if (pgxVar.c() == pdc.Y) {
                int i5 = i4 + 8;
                Pair pair = null;
                Integer num = null;
                pdp pdpVar = null;
                boolean z = false;
                while (i5 - i4 < c) {
                    pgxVar.z(i5);
                    int c2 = pgxVar.c();
                    int c3 = pgxVar.c();
                    if (c3 == pdc.ae) {
                        num = Integer.valueOf(pgxVar.c());
                    } else if (c3 == pdc.Z) {
                        pgxVar.A(4);
                        z = pgxVar.c() == a;
                    } else if (c3 == pdc.aa) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= c2) {
                                pdpVar = null;
                                break;
                            }
                            pgxVar.z(i6);
                            int c4 = pgxVar.c();
                            if (pgxVar.c() == pdc.ab) {
                                pgxVar.A(6);
                                pgxVar.h();
                                int h = pgxVar.h();
                                byte[] bArr = new byte[16];
                                pgxVar.u(bArr, 0, 16);
                                pdpVar = new pdp(h, bArr);
                                break;
                            }
                            i6 += c4;
                        }
                    }
                    i5 += c2;
                }
                if (z) {
                    opn.j(num != null, "frma atom is mandatory");
                    opn.j(pdpVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, pdpVar);
                }
                if (pair != null) {
                    pdfVar.a[i3] = (pdp) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            i4 += c;
        }
    }

    private static Pair f(pgx pgxVar, int i) {
        pgxVar.z(i + 12);
        pgxVar.A(1);
        d(pgxVar);
        pgxVar.A(2);
        int h = pgxVar.h();
        if ((h & 128) != 0) {
            pgxVar.A(2);
        }
        if ((h & 64) != 0) {
            pgxVar.A(pgxVar.k());
        }
        if ((h & 32) != 0) {
            pgxVar.A(2);
        }
        pgxVar.A(1);
        d(pgxVar);
        int h2 = pgxVar.h();
        String str = null;
        if (h2 == 32) {
            str = "video/mp4v-es";
        } else if (h2 == 33) {
            str = "video/avc";
        } else if (h2 != 35) {
            if (h2 != 64) {
                if (h2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (h2 == 165) {
                    str = "audio/ac3";
                } else if (h2 != 166) {
                    switch (h2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (h2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        pgxVar.A(12);
        pgxVar.A(1);
        int d = d(pgxVar);
        byte[] bArr = new byte[d];
        pgxVar.u(bArr, 0, d);
        return Pair.create(str, bArr);
    }
}
