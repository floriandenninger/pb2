package defpackage;

import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axd {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public short[] f;
    public int g;
    public short[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    private final int r;
    private final int s;
    private final int t;
    private final short[] u;
    private short[] v;

    public axd(int i, int i2, float f, float f2, int i3) {
        this.r = i;
        this.a = i2;
        this.b = f;
        this.c = f2;
        this.d = i / i3;
        this.s = i / 400;
        int i4 = i / 65;
        this.t = i4;
        int i5 = i4 + i4;
        this.e = i5;
        this.u = new short[i5];
        int i6 = i5 * i2;
        this.f = new short[i6];
        this.h = new short[i6];
        this.v = new short[i6];
    }

    private final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.a;
        int i5 = 1;
        int i6 = PrivateKeyType.INVALID;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.p = i5 / i7;
        this.q = i8 / i6;
        return i7;
    }

    private final void e(short[] sArr, int i, int i2) {
        short[] c = c(this.h, this.i, i2);
        this.h = c;
        int i3 = this.a;
        System.arraycopy(sArr, i * i3, c, this.i * i3, i3 * i2);
        this.i += i2;
    }

    private final void f(short[] sArr, int i, int i2) {
        int i3 = this.e / i2;
        int i4 = this.a;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.u[i7] = (short) (i8 / i5);
        }
    }

    private static void g(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final int a() {
        int i = this.i * this.a;
        return i + i;
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.a;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final void b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.i;
        float f = this.b;
        float f2 = this.c;
        float f3 = f / f2;
        float f4 = this.d * f2;
        double d = f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.g;
            if (i11 >= this.e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.m;
                    if (i13 > 0) {
                        int min = Math.min(this.e, i13);
                        e(this.f, i12, min);
                        this.m -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f;
                        int i14 = this.r;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.a == i10 && i15 == i10) {
                            i = d(sArr, i12, this.s, this.t);
                        } else {
                            f(sArr, i12, i15);
                            int d2 = d(this.u, 0, this.s / i15, this.t / i15);
                            if (i15 != i10) {
                                int i16 = d2 * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.s;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.t;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.a == i10) {
                                    i = d(sArr, i12, i18, i19);
                                } else {
                                    f(sArr, i12, i10);
                                    i = d(this.u, 0, i18, i19);
                                }
                            } else {
                                i = d2;
                            }
                        }
                        int i22 = this.p;
                        int i23 = (i22 == 0 || (i4 = this.n) == 0 || this.q > i22 * 3 || i22 + i22 <= this.o * 3) ? i : i4;
                        this.o = i22;
                        this.n = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f;
                            if (f3 >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f3));
                            } else {
                                this.m = (int) ((i23 * (2.0f - f3)) / ((-1.0f) + f3));
                                i3 = i23;
                            }
                            short[] c = c(this.h, this.i, i3);
                            this.h = c;
                            int i24 = i3;
                            g(i3, this.a, c, this.i, sArr2, i12, sArr2, i12 + i23);
                            this.i += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f;
                            if (f3 < 0.5f) {
                                i2 = (int) ((i25 * f3) / (f5 - f3));
                            } else {
                                this.m = (int) ((i25 * ((f3 + f3) - 1.0f)) / (f5 - f3));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] c2 = c(this.h, this.i, i26);
                            this.h = c2;
                            int i27 = this.a;
                            System.arraycopy(sArr3, i12 * i27, c2, this.i * i27, i27 * i25);
                            g(i2, this.a, this.h, this.i + i25, sArr3, i12 + i25, sArr3, i12);
                            this.i += i26;
                            i12 += i2;
                        }
                    }
                    if (this.e + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.g - i12;
                short[] sArr4 = this.f;
                int i29 = this.a;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.g = i28;
                f5 = 1.0f;
            }
        } else {
            e(this.f, 0, this.g);
            this.g = 0;
        }
        if (f4 == f5 || this.i == i9) {
            return;
        }
        int i30 = this.r;
        int i31 = (int) (i30 / f4);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.i - i9;
        short[] c3 = c(this.v, this.j, i32);
        this.v = c3;
        short[] sArr5 = this.h;
        int i33 = this.a;
        System.arraycopy(sArr5, i9 * i33, c3, this.j * i33, i33 * i32);
        this.i = i9;
        this.j += i32;
        int i34 = 0;
        while (true) {
            i5 = this.j;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.k + 1;
                i8 = this.l;
                if (i7 * i31 <= i8 * i30) {
                    break;
                }
                this.h = c(this.h, this.i, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.a;
                    if (i35 < i36) {
                        short[] sArr6 = this.h;
                        int i37 = this.i;
                        short[] sArr7 = this.v;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        int i39 = this.l;
                        int i40 = this.k;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr6[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                }
                this.l++;
                this.i++;
            }
            this.k = i7;
            if (i7 == i30) {
                this.k = 0;
                pse.g(i8 == i31);
                this.l = 0;
            }
            i34++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.v;
            int i44 = this.a;
            System.arraycopy(sArr8, i6 * i44, sArr8, 0, (i5 - i6) * i44);
            this.j -= i6;
        }
    }
}
