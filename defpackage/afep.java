package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afep {
    private static final int a = pgz.c("ytmp");
    private static final int b = pgz.c("mshp");
    private static final int c = pgz.c("raw ");
    private static final int d = pgz.c("dfl8");
    private static final int e = pgz.c("mesh");
    private static final int f = pgz.c("proj");
    private final List g = new ArrayList();

    static byte[] b(byte[] bArr, int i, int i2, int[] iArr) {
        boolean z;
        Inflater inflater = new Inflater(true);
        inflater.setInput(bArr, i, i2);
        int i3 = 102400;
        byte[] bArr2 = new byte[102400];
        int i4 = 0;
        do {
            try {
                i4 += inflater.inflate(bArr2, i4, i3 - i4);
                z = !inflater.needsInput();
                if (z) {
                    int length = bArr2.length;
                    int i5 = length + length;
                    byte[] bArr3 = new byte[i5];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    i3 = i5;
                    bArr2 = bArr3;
                }
            } catch (DataFormatException unused) {
                return null;
            }
        } while (z);
        iArr[0] = i4;
        return bArr2;
    }

    private static int c(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static afld d(pgx pgxVar, int i, int i2) {
        int i3;
        afld afldVar;
        int i4;
        pgx pgxVar2 = pgxVar;
        int i5 = pgxVar2.b;
        afld afldVar2 = new afld(i2);
        int i6 = i;
        int i7 = 0;
        loop0: while (i5 < i6) {
            pgxVar2.z(i5);
            int c2 = pgxVar.c();
            if (c2 != 0) {
                if (pgxVar.c() == e) {
                    if (i7 < 2) {
                        int c3 = pgxVar.c();
                        if (c3 <= 10000) {
                            float[] fArr = new float[c3];
                            for (int i8 = 0; i8 < c3; i8++) {
                                fArr[i8] = Float.intBitsToFloat(pgxVar.c());
                            }
                            int c4 = pgxVar.c();
                            if (c4 <= 32000) {
                                double log = Math.log(2.0d);
                                double d2 = c3;
                                Double.isNaN(d2);
                                Double.isNaN(d2);
                                int ceil = (int) Math.ceil(Math.log(d2 + d2) / log);
                                pgw pgwVar = new pgw(pgxVar2.a);
                                pgwVar.d(pgxVar2.b * 8);
                                float[] fArr2 = new float[c4 * 5];
                                int i9 = 0;
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                int i13 = 0;
                                int i14 = 0;
                                int i15 = 0;
                                while (true) {
                                    int i16 = i9 + 1;
                                    if (i9 < c4) {
                                        int c5 = i10 + c(pgwVar.a(ceil));
                                        int c6 = i11 + c(pgwVar.a(ceil));
                                        int c7 = i12 + c(pgwVar.a(ceil));
                                        int i17 = i5;
                                        int c8 = i13 + c(pgwVar.a(ceil));
                                        int i18 = ceil;
                                        int c9 = i14 + c(pgwVar.a(ceil));
                                        int i19 = c2;
                                        afld afldVar3 = afldVar2;
                                        if (Math.max(Math.max(c5, c6), Math.max(c7, c8)) >= c3 || c9 >= c3) {
                                            break loop0;
                                        }
                                        int i20 = i15 + 1;
                                        fArr2[i15] = fArr[c5];
                                        int i21 = i20 + 1;
                                        fArr2[i20] = fArr[c6];
                                        int i22 = i21 + 1;
                                        fArr2[i21] = fArr[c7];
                                        int i23 = i22 + 1;
                                        fArr2[i22] = fArr[c8];
                                        i15 = i23 + 1;
                                        fArr2[i23] = fArr[c9];
                                        i14 = c9;
                                        c2 = i19;
                                        ceil = i18;
                                        afldVar2 = afldVar3;
                                        i13 = c8;
                                        i12 = c7;
                                        i10 = c5;
                                        i5 = i17;
                                        i9 = i16;
                                        i11 = c6;
                                    } else {
                                        i3 = i5;
                                        afld afldVar4 = afldVar2;
                                        i4 = c2;
                                        pgwVar.d(((pgwVar.b * 8) + pgwVar.c + 7) & (-8));
                                        pgwVar.a(32);
                                        pgwVar.a(8);
                                        int a2 = pgwVar.a(8);
                                        int a3 = pgwVar.a(32);
                                        if (a3 <= 128000) {
                                            double d3 = c4;
                                            Double.isNaN(d3);
                                            Double.isNaN(d3);
                                            int ceil2 = (int) Math.ceil(Math.log(d3 + d3) / log);
                                            float[] fArr3 = new float[a3 * 3];
                                            float[] fArr4 = new float[a3 + a3];
                                            int i24 = 0;
                                            int i25 = 0;
                                            while (true) {
                                                int i26 = 4;
                                                if (i24 < a3) {
                                                    i25 += c(pgwVar.a(ceil2));
                                                    if (i25 < c4) {
                                                        int i27 = i24 * 3;
                                                        int i28 = i25 * 5;
                                                        fArr3[i27] = fArr2[i28];
                                                        fArr3[i27 + 1] = fArr2[i28 + 1];
                                                        fArr3[i27 + 2] = fArr2[i28 + 2];
                                                        int i29 = i24 + i24;
                                                        fArr4[i29] = fArr2[i28 + 3];
                                                        fArr4[i29 + 1] = fArr2[i28 + 4];
                                                        i24++;
                                                    } else {
                                                        throw new RuntimeException("Projection mesh decoder error.");
                                                    }
                                                } else {
                                                    if (a2 == 1) {
                                                        i26 = 5;
                                                    } else if (a2 == 2) {
                                                        i26 = 6;
                                                    }
                                                    vak vakVar = new vak((byte[]) null, (byte[]) null);
                                                    vakVar.a.add(new aflc(fArr3, fArr4, i26));
                                                    afldVar = afldVar4;
                                                    if (i7 == 0) {
                                                        afldVar.c = vakVar;
                                                    } else {
                                                        afldVar.d = vakVar;
                                                    }
                                                    i7++;
                                                }
                                            }
                                        } else {
                                            throw new RuntimeException("Projection mesh decoder error.");
                                        }
                                    }
                                }
                                throw new RuntimeException("Projection mesh decoder error.");
                            }
                            throw new RuntimeException("Projection mesh decoder error.");
                        }
                        throw new RuntimeException("Projection mesh decoder error.");
                    }
                    throw new RuntimeException("Projection mesh decoder error.");
                }
                i3 = i5;
                afldVar = afldVar2;
                i4 = c2;
                i6 = i;
                afldVar2 = afldVar;
                i5 = i3 + i4;
                pgxVar2 = pgxVar;
            } else {
                throw new RuntimeException("Projection mesh decoder error.");
            }
        }
        return afldVar2;
    }

    private final afld e(pgx pgxVar, int i) {
        afld afldVar;
        int h = pgxVar.h();
        pgxVar.A(3);
        if (h != 0) {
            return null;
        }
        int c2 = pgxVar.c();
        int i2 = 0;
        while (true) {
            if (i2 >= this.g.size()) {
                afldVar = null;
                break;
            }
            if (((afld) this.g.get(i2)).a == c2) {
                afldVar = (afld) this.g.get(i2);
                break;
            }
            i2++;
        }
        if (afldVar != null) {
            return afldVar;
        }
        int c3 = pgxVar.c();
        if (c3 == c) {
            afldVar = d(pgxVar, i, c2);
        } else if (c3 == d) {
            int[] iArr = new int[1];
            byte[] bArr = pgxVar.a;
            int i3 = pgxVar.b;
            byte[] b2 = b(bArr, i3, i - i3, iArr);
            if (b2 == null) {
                return null;
            }
            afldVar = d(new pgx(b2, iArr[0]), iArr[0], c2);
        }
        if (afldVar == null || afldVar.c == null) {
            return null;
        }
        this.g.add(afldVar);
        return afldVar;
    }

    public final afld a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        pgx pgxVar = new pgx(bArr);
        try {
            int i = pgxVar.b;
            pgxVar.z(0);
            pgxVar.A(4);
            int c2 = pgxVar.c();
            pgxVar.z(i);
            if (c2 == f) {
                pgxVar.A(8);
                int i2 = pgxVar.b;
                while (i2 < pgxVar.b()) {
                    pgxVar.z(i2);
                    int c3 = pgxVar.c();
                    if (c3 == 0) {
                        return null;
                    }
                    int c4 = pgxVar.c();
                    if (c4 != a && c4 != b) {
                        i2 += c3;
                    }
                    return e(pgxVar, c3 + i2);
                }
                return null;
            }
            return e(pgxVar, pgxVar.b());
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
