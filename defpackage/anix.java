package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anix {
    static final int a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;

    static {
        int i2 = true != Boolean.parseBoolean(System.getProperty("BROTLI_32_BIT_CPU")) ? 6 : 5;
        b = i2;
        c = Boolean.parseBoolean(System.getProperty("BROTLI_ENABLE_ASSERTS")) ? 1 : 0;
        int i3 = 1 << i2;
        a = i3;
        int i4 = i3 >> 3;
        d = i4;
        e = i3 >> 1;
        int i5 = i4 >> 1;
        f = i5;
        g = 4096 / i5;
        h = 4160 / i5;
        i = 4060 / i5;
        j = i2 - 4;
    }

    static int a(anjd anjdVar) {
        int i2 = g;
        if (anjdVar.w != 0) {
            i2 = (anjdVar.v + (f - 1)) >> j;
        }
        return i2 - anjdVar.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(anjd anjdVar) {
        return a == 64 ? (int) (anjdVar.p >>> anjdVar.t) : anjdVar.s >>> anjdVar.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(anjd anjdVar, int i2) {
        if (e >= 24) {
            return d(anjdVar, i2);
        }
        if (i2 <= 16) {
            return d(anjdVar, i2);
        }
        int d2 = d(anjdVar, 16);
        h(anjdVar);
        return (d(anjdVar, i2 - 16) << 16) | d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(anjd anjdVar, int i2) {
        int b2 = b(anjdVar);
        anjdVar.t += i2;
        return ((1 << i2) - 1) & b2;
    }

    static void e(anjd anjdVar) {
        if (anjdVar.t <= a) {
            return;
        }
        int i2 = anjdVar.t;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Accumulator underloaded: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(anjd anjdVar, int i2) {
        if (anjdVar.w == 0) {
            return;
        }
        int i3 = ((anjdVar.u << j) + ((anjdVar.t + 7) >> 3)) - d;
        int i4 = anjdVar.v;
        if (i3 > i4) {
            throw new aniz("Read after end");
        }
        if (i2 != 0 && i3 != i4) {
            throw new aniz("Unused bytes after end");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(anjd anjdVar, byte[] bArr, int i2, int i3) {
        if ((anjdVar.t & 7) == 0) {
            while (anjdVar.t != a && i3 != 0) {
                bArr[i2] = (byte) b(anjdVar);
                anjdVar.t += 8;
                i3--;
                i2++;
            }
            if (i3 == 0) {
                return;
            }
            int a2 = a(anjdVar);
            int i4 = j;
            int min = Math.min(a2, i3 >> i4);
            if (min > 0) {
                int i5 = min << i4;
                System.arraycopy(anjdVar.g, anjdVar.u << i4, bArr, i2, i5);
                i2 += i5;
                i3 -= i5;
                anjdVar.u += min;
            }
            if (i3 == 0) {
                return;
            }
            if (a(anjdVar) <= 0) {
                while (i3 > 0) {
                    int a3 = anjg.a(anjdVar.ap, bArr, i2, i3);
                    if (a3 == -1) {
                        throw new aniz("Unexpected end of input");
                    }
                    i2 += a3;
                    i3 -= a3;
                }
                return;
            }
            i(anjdVar);
            while (i3 != 0) {
                bArr[i2] = (byte) b(anjdVar);
                anjdVar.t += 8;
                i3--;
                i2++;
            }
            f(anjdVar, 0);
            return;
        }
        throw new aniz("Unaligned copyBytes");
    }

    static void h(anjd anjdVar) {
        if (c != 0) {
            e(anjdVar);
        }
        if (a == 64) {
            int[] iArr = anjdVar.i;
            int i2 = anjdVar.u;
            anjdVar.u = i2 + 1;
            long j2 = iArr[i2];
            int i3 = e;
            anjdVar.p = (j2 << i3) | (anjdVar.p >>> i3);
        } else {
            short[] sArr = anjdVar.h;
            int i4 = anjdVar.u;
            anjdVar.u = i4 + 1;
            short s = sArr[i4];
            int i5 = e;
            anjdVar.s = (s << i5) | (anjdVar.s >>> i5);
        }
        anjdVar.t -= e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(anjd anjdVar) {
        if (c != 0) {
            e(anjdVar);
        }
        int i2 = anjdVar.t;
        int i3 = e;
        if (i2 >= i3) {
            if (a == 64) {
                int[] iArr = anjdVar.i;
                anjdVar.u = anjdVar.u + 1;
                anjdVar.p = (iArr[r2] << i3) | (anjdVar.p >>> i3);
            } else {
                short[] sArr = anjdVar.h;
                int i4 = anjdVar.u;
                anjdVar.u = i4 + 1;
                anjdVar.s = (sArr[i4] << i3) | (anjdVar.s >>> i3);
            }
            anjdVar.t -= i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(anjd anjdVar) {
        anjdVar.g = new byte[4160];
        int i2 = a;
        if (i2 == 64) {
            anjdVar.p = 0L;
            anjdVar.i = new int[h];
        } else {
            anjdVar.s = 0;
            anjdVar.h = new short[h];
        }
        anjdVar.t = i2;
        anjdVar.u = g;
        anjdVar.w = 0;
        n(anjdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(anjd anjdVar) {
        int i2 = (a - anjdVar.t) & 7;
        if (i2 != 0 && d(anjdVar, i2) != 0) {
            throw new aniz("Corrupted padding bits");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(anjd anjdVar) {
        if (anjdVar.u > i) {
            if (anjdVar.w != 0) {
                if (a(anjdVar) < -2) {
                    throw new aniz("No more input");
                }
                return;
            }
            int i2 = anjdVar.u << j;
            int i3 = 4096 - i2;
            int i4 = 0;
            anjg.b(anjdVar.g, 0, i2, 4096);
            anjdVar.u = 0;
            while (true) {
                if (i3 >= 4096) {
                    break;
                }
                int a2 = anjg.a(anjdVar.ap, anjdVar.g, i3, 4096 - i3);
                if (a2 <= 0) {
                    anjdVar.w = 1;
                    anjdVar.v = i3;
                    i3 += f - 1;
                    break;
                }
                i3 += a2;
            }
            byte[] bArr = anjdVar.g;
            int i5 = i3 >> j;
            if (a == 64) {
                int[] iArr = anjdVar.i;
                while (i4 < i5) {
                    int i6 = i4 * 4;
                    iArr[i4] = ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
                    i4++;
                }
                return;
            }
            short[] sArr = anjdVar.h;
            while (i4 < i5) {
                int i7 = i4 + i4;
                sArr[i4] = (short) (((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255));
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(anjd anjdVar) {
        if (anjdVar.t == a) {
            n(anjdVar);
        }
    }

    private static void n(anjd anjdVar) {
        l(anjdVar);
        f(anjdVar, 0);
        h(anjdVar);
        h(anjdVar);
    }
}
