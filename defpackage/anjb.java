package defpackage;

import java.io.InputStream;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anjb {
    static final short[] f;
    static final int[] a = {256, 402, 436, 468, 500, 534, 566, 598, 630, 662, 694, 726, 758, 790, 822, 854, 886, 920, 952, 984, 1016, 1048, 1080};
    private static final int[] g = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] h = {0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3};
    private static final int[] i = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] j = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};
    static final int[] b = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    static final int[] c = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    static final short[] d = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    static final short[] e = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};

    static {
        int i2;
        short[] sArr = new short[2816];
        f = sArr;
        short[] sArr2 = new short[24];
        short[] sArr3 = new short[24];
        sArr3[0] = 2;
        int i3 = 0;
        while (i3 < 23) {
            int i4 = i3 + 1;
            sArr2[i4] = (short) (sArr2[i3] + (1 << d[i3]));
            sArr3[i4] = (short) (sArr3[i3] + (1 << e[i3]));
            i3 = i4;
        }
        for (int i5 = 0; i5 < 704; i5++) {
            int i6 = i5 >>> 6;
            if (i6 >= 2) {
                i6 -= 2;
                i2 = 0;
            } else {
                i2 = -4;
            }
            int i7 = i6 + i6;
            int i8 = (((170064 >>> i7) & 3) << 3) | ((i5 >>> 3) & 7);
            int i9 = (((156228 >>> i7) & 3) << 3) | (i5 & 7);
            short s = sArr3[i9];
            int i10 = s > 4 ? 3 : s - 2;
            int i11 = i5 * 4;
            sArr[i11] = (short) (d[i8] | (e[i9] << 8));
            sArr[i11 + 1] = sArr2[i8];
            sArr[i11 + 2] = sArr3[i9];
            sArr[i11 + 3] = (short) (i2 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(anjd anjdVar) {
        int i2 = anjdVar.q;
        if (i2 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i2 == 11) {
            return;
        }
        anjdVar.q = 11;
        InputStream inputStream = anjdVar.ap;
        if (inputStream != null) {
            inputStream.close();
            anjdVar.ap = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r12 > 30) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x007d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x053f A[LOOP:2: B:124:0x053d->B:125:0x053f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x059c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.anjd r27) {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anjb.b(anjd):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(anjd anjdVar, InputStream inputStream) {
        if (anjdVar.q != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        anjdVar.k = new int[3091];
        anjdVar.k[0] = 7;
        anjdVar.f80J = 3;
        int p = p(3, 120);
        anjdVar.e = new byte[p];
        anjdVar.o = new int[p];
        anjdVar.ap = inputStream;
        anix.j(anjdVar);
        anjdVar.q = 1;
    }

    private static int d(int i2, int i3, int i4) {
        int i5 = i4 << i2;
        return i3 + 16 + i5 + i5;
    }

    private static int e(anjd anjdVar) {
        int i2 = anjdVar.aa;
        int i3 = anjdVar.ah;
        return i2;
    }

    private static int f(anjd anjdVar, int i2, int i3) {
        int[] iArr = anjdVar.j;
        int i4 = i2 + i2;
        int i5 = i4 + 4;
        anix.i(anjdVar);
        int m = m(anjdVar.k, i4, anjdVar);
        int j2 = j(anjdVar.k, i4 + 1, anjdVar);
        int i6 = m == 1 ? iArr[i5 + 1] + 1 : m == 0 ? iArr[i5] : m - 2;
        if (i6 >= i3) {
            i6 -= i3;
        }
        int i7 = i5 + 1;
        iArr[i5] = iArr[i7];
        iArr[i7] = i6;
        return j2;
    }

    private static int g(int i2, byte[] bArr, anjd anjdVar) {
        anix.l(anjdVar);
        int h2 = h(anjdVar) + 1;
        if (h2 == 1) {
            int i3 = 0;
            while (i3 < i2) {
                int min = Math.min(i3 + 1024, i2) - i3;
                System.arraycopy(anjg.a, 0, bArr, i3, min);
                i3 += min;
            }
            return 1;
        }
        anix.i(anjdVar);
        int d2 = anix.d(anjdVar, 1) != 0 ? anix.d(anjdVar, 4) + 1 : 0;
        int i4 = h2 + d2;
        int i5 = a[(i4 + 31) >> 5] + 1;
        int[] iArr = new int[i5];
        int i6 = i5 - 1;
        k(i4, i4, iArr, i6, anjdVar);
        int i7 = 0;
        while (i7 < i2) {
            anix.l(anjdVar);
            anix.i(anjdVar);
            int m = m(iArr, i6, anjdVar);
            if (m == 0) {
                bArr[i7] = 0;
            } else if (m <= d2) {
                anix.i(anjdVar);
                for (int d3 = (1 << m) + anix.d(anjdVar, m); d3 != 0; d3--) {
                    if (i7 < i2) {
                        bArr[i7] = 0;
                        i7++;
                    } else {
                        throw new aniz("Corrupted context map");
                    }
                }
            } else {
                bArr[i7] = (byte) (m - d2);
            }
            i7++;
        }
        anix.i(anjdVar);
        if (anix.d(anjdVar, 1) == 1) {
            int[] iArr2 = new int[256];
            for (int i8 = 0; i8 < 256; i8++) {
                iArr2[i8] = i8;
            }
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = bArr[i9] & 255;
                int i11 = iArr2[i10];
                bArr[i9] = (byte) i11;
                if (i10 != 0) {
                    while (i10 > 0) {
                        int i12 = i10 - 1;
                        iArr2[i10] = iArr2[i12];
                        i10 = i12;
                    }
                    iArr2[0] = i11;
                }
            }
        }
        return h2;
    }

    private static int h(anjd anjdVar) {
        anix.i(anjdVar);
        if (anix.d(anjdVar, 1) == 0) {
            return 0;
        }
        int d2 = anix.d(anjdVar, 3);
        if (d2 == 0) {
            return 1;
        }
        return anix.d(anjdVar, d2) + (1 << d2);
    }

    private static int i(int i2) {
        int i3 = -1;
        for (int i4 = 16; i4 > 0; i4 >>= 1) {
            int i5 = i2 >>> i4;
            if (i5 != 0) {
                i3 += i4;
                i2 = i5;
            }
        }
        return i3 + i2;
    }

    private static int j(int[] iArr, int i2, anjd anjdVar) {
        anix.i(anjdVar);
        int m = m(iArr, i2, anjdVar);
        int i3 = c[m];
        anix.i(anjdVar);
        return b[m] + anix.c(anjdVar, i3);
    }

    private static int k(int i2, int i3, int[] iArr, int i4, anjd anjdVar) {
        anix.l(anjdVar);
        anix.i(anjdVar);
        int d2 = anix.d(anjdVar, 2);
        if (d2 != 1) {
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[18];
            int i5 = 0;
            int i6 = 32;
            for (int i7 = d2; i7 < 18 && i6 > 0; i7++) {
                int i8 = g[i7];
                anix.i(anjdVar);
                int b2 = anix.b(anjdVar) & 15;
                int i9 = anjdVar.t;
                int[] iArr4 = j;
                anjdVar.t = i9 + (iArr4[b2] >> 16);
                char c2 = (char) iArr4[b2];
                iArr3[i8] = c2;
                if (c2 != 0) {
                    i6 -= ' ' >> c2;
                    i5++;
                }
            }
            if (i6 == 0 || i5 == 1) {
                int[] iArr5 = new int[33];
                anaf.z(iArr5, 32, 5, iArr3, 18);
                int i10 = 0;
                char c3 = '\b';
                char c4 = 0;
                int i11 = 0;
                int i12 = 32768;
                while (i10 < i3 && i12 > 0) {
                    anix.l(anjdVar);
                    anix.i(anjdVar);
                    int b3 = anix.b(anjdVar);
                    int i13 = anjdVar.t;
                    int i14 = iArr5[b3 & 31];
                    anjdVar.t = i13 + (i14 >> 16);
                    char c5 = (char) i14;
                    if (c5 < 16) {
                        int i15 = i10 + 1;
                        iArr2[i10] = c5;
                        if (c5 != 0) {
                            i12 -= 32768 >> c5;
                            i10 = i15;
                            c3 = c5;
                        } else {
                            i10 = i15;
                        }
                        i11 = 0;
                    } else {
                        int i16 = c5 - 14;
                        char c6 = c5 == 16 ? c3 : (char) 0;
                        char c7 = c4 != c6 ? c6 : c4;
                        if (c4 != c6) {
                            i11 = 0;
                        }
                        int i17 = i11 > 0 ? (i11 - 2) << i16 : i11;
                        anix.i(anjdVar);
                        int d3 = i17 + anix.d(anjdVar, i16) + 3;
                        int i18 = d3 - i11;
                        if (i10 + i18 > i3) {
                            throw new aniz("symbol + repeatDelta > numSymbols");
                        }
                        int i19 = i10;
                        int i20 = 0;
                        while (i20 < i18) {
                            iArr2[i19] = c7;
                            i20++;
                            i19++;
                        }
                        if (c7 != 0) {
                            i12 -= i18 << (15 - c7);
                        }
                        i11 = d3;
                        i10 = i19;
                        c4 = c7;
                    }
                }
                if (i12 == 0) {
                    while (i10 < i3) {
                        int min = Math.min(i10 + 1024, i3) - i10;
                        System.arraycopy(anjg.b, 0, iArr2, i10, min);
                        i10 += min;
                    }
                    return anaf.z(iArr, i4, 8, iArr2, i3);
                }
                throw new aniz("Unused space");
            }
            throw new aniz("Corrupted Huffman code histogram");
        }
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[4];
        int i21 = i(i2 - 1) + 1;
        int d4 = anix.d(anjdVar, 2) + 1;
        for (int i22 = 0; i22 < d4; i22++) {
            anix.i(anjdVar);
            int d5 = anix.d(anjdVar, i21);
            if (d5 < i3) {
                iArr7[i22] = d5;
            } else {
                throw new aniz("Can't readHuffmanCode");
            }
        }
        int i23 = 0;
        while (i23 < d4 - 1) {
            int i24 = i23 + 1;
            for (int i25 = i24; i25 < d4; i25++) {
                if (iArr7[i23] == iArr7[i25]) {
                    throw new aniz("Duplicate simple Huffman code symbol");
                }
            }
            i23 = i24;
        }
        if (d4 == 4) {
            d4 = anix.d(anjdVar, 1) + 4;
        }
        if (d4 == 1) {
            iArr6[iArr7[0]] = 1;
        } else if (d4 == 2) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 1;
        } else if (d4 == 3) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
        } else if (d4 == 4) {
            iArr6[iArr7[0]] = 2;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
            iArr6[iArr7[3]] = 2;
        } else if (d4 == 5) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 3;
            iArr6[iArr7[3]] = 3;
        }
        return anaf.z(iArr, i4, 8, iArr6, i3);
    }

    private static int l(anjd anjdVar, int i2, int i3) {
        int[] iArr = anjdVar.k;
        int i4 = i2 + i2;
        int i5 = iArr[i4];
        if (i3 <= 1) {
            iArr[i4 + 1] = i5;
            iArr[i4 + 2] = i5;
            return 268435456;
        }
        int i6 = i3 + 2;
        int k = i5 + k(i6, i6, iArr, i4, anjdVar);
        int[] iArr2 = anjdVar.k;
        int i7 = i4 + 1;
        iArr2[i7] = k;
        int k2 = k(26, 26, iArr2, i7, anjdVar);
        int[] iArr3 = anjdVar.k;
        iArr3[i4 + 2] = k + k2;
        return j(iArr3, i7, anjdVar);
    }

    private static int m(int[] iArr, int i2, anjd anjdVar) {
        int i3 = iArr[i2];
        int b2 = anix.b(anjdVar);
        int i4 = i3 + (b2 & PrivateKeyType.INVALID);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        char c2 = (char) i5;
        if (i6 <= 8) {
            anjdVar.t += i6;
            return c2;
        }
        int i7 = anjdVar.t;
        int i8 = iArr[i4 + c2 + ((b2 & ((1 << i6) - 1)) >>> 8)];
        anjdVar.t = i7 + (i8 >> 16) + 8;
        return (char) i8;
    }

    private static void n(anjd anjdVar) {
        anjdVar.B = f(anjdVar, 0, anjdVar.C);
        int i2 = anjdVar.j[5];
        int i3 = i2 << 6;
        anjdVar.P = i3;
        anjdVar.L = anjdVar.c[i3] & 255;
        int i4 = anjdVar.b[i2] << 9;
        anjdVar.R = i4;
        anjdVar.S = i4 + 256;
    }

    private static int[] o(int i2, int i3, int i4, anjd anjdVar) {
        int[] iArr = new int[(a[(i3 + 31) >> 5] * i4) + i4];
        int i5 = i4;
        for (int i6 = 0; i6 < i4; i6++) {
            iArr[i6] = i5;
            i5 += k(i2, i3, iArr, i6, anjdVar);
        }
        return iArr;
    }

    private static int p(int i2, int i3) {
        if ((2 << i2) + i3 > 2147483644) {
            throw new IllegalArgumentException("maxDistance is too small");
        }
        int i4 = (i(((2147483644 - i3) >> i2) + 4) - 1) - 1;
        return (((((r0 >> r1) & 1) | (i4 + i4)) - 1) << i2) + (1 << i2) + i3 + 16;
    }
}
