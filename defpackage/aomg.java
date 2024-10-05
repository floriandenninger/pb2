package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomg extends aomk {
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public aomg(byte[] bArr, int i, int i2) {
        this.f = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
    }

    private final void R() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    @Override // defpackage.aomk
    public final String A() {
        int k = k();
        if (k > 0) {
            int i = this.g;
            int i2 = this.i;
            if (k <= i - i2) {
                String g = aoqm.g(this.f, i2, k);
                this.i += k;
                return g;
            }
        }
        if (k == 0) {
            return "";
        }
        if (k <= 0) {
            throw aoob.f();
        }
        throw aoob.j();
    }

    @Override // defpackage.aomk
    public final void B(int i) {
        if (this.k != i) {
            throw aoob.b();
        }
    }

    @Override // defpackage.aomk
    public final void C(int i) {
        this.l = i;
        R();
    }

    public final void D(int i) {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                this.i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw aoob.f();
        }
        throw aoob.j();
    }

    @Override // defpackage.aomk
    public final boolean E() {
        return this.i == this.g;
    }

    @Override // defpackage.aomk
    public final boolean F() {
        return s() != 0;
    }

    @Override // defpackage.aomk
    public final byte[] H() {
        return I(k());
    }

    public final byte[] I(int i) {
        if (i > 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.i = i4;
                return Arrays.copyOfRange(this.f, i3, i4);
            }
        }
        if (i > 0) {
            throw aoob.j();
        }
        if (i == 0) {
            return aonz.b;
        }
        throw aoob.f();
    }

    public final byte a() {
        int i = this.i;
        if (i == this.g) {
            throw aoob.j();
        }
        byte[] bArr = this.f;
        this.i = i + 1;
        return bArr[i];
    }

    @Override // defpackage.aomk
    public final double b() {
        return Double.longBitsToDouble(r());
    }

    @Override // defpackage.aomk
    public final float c() {
        return Float.intBitsToFloat(j());
    }

    public final int d() {
        int i = this.l;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - e();
    }

    @Override // defpackage.aomk
    public final int e() {
        return this.i - this.j;
    }

    @Override // defpackage.aomk
    public final int f(int i) {
        if (i >= 0) {
            int e = i + e();
            if (e >= 0) {
                int i2 = this.l;
                if (e <= i2) {
                    this.l = e;
                    R();
                    return i2;
                }
                throw aoob.j();
            }
            throw aoob.g();
        }
        throw aoob.f();
    }

    @Override // defpackage.aomk
    public final int g() {
        return k();
    }

    @Override // defpackage.aomk
    public final int h() {
        return j();
    }

    @Override // defpackage.aomk
    public final int i() {
        return k();
    }

    public final int j() {
        int i = this.i;
        if (this.g - i < 4) {
            throw aoob.j();
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.aomk
    public final int l() {
        return j();
    }

    @Override // defpackage.aomk
    public final int m() {
        return J(k());
    }

    @Override // defpackage.aomk
    public final int n() {
        if (E()) {
            this.k = 0;
            return 0;
        }
        int k = k();
        this.k = k;
        if (aoqp.a(k) != 0) {
            return this.k;
        }
        throw aoob.c();
    }

    @Override // defpackage.aomk
    public final int o() {
        return k();
    }

    @Override // defpackage.aomk
    public final long p() {
        return r();
    }

    @Override // defpackage.aomk
    public final long q() {
        return s();
    }

    public final long r() {
        int i = this.i;
        if (this.g - i < 8) {
            throw aoob.j();
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    final long t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw aoob.e();
    }

    @Override // defpackage.aomk
    public final long u() {
        return r();
    }

    @Override // defpackage.aomk
    public final long v() {
        return L(s());
    }

    @Override // defpackage.aomk
    public final long w() {
        return s();
    }

    @Override // defpackage.aomk
    public final aomf x() {
        int k = k();
        if (k > 0) {
            int i = this.g;
            int i2 = this.i;
            if (k <= i - i2) {
                aomf y = aomf.y(this.f, i2, k);
                this.i += k;
                return y;
            }
        }
        if (k == 0) {
            return aomf.b;
        }
        return aomf.B(I(k));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aooy, java.lang.Object] */
    @Override // defpackage.aomk
    public final aooy y(aopf aopfVar, aomw aomwVar) {
        int k = k();
        P();
        int f = f(k);
        this.a++;
        ?? q = aopfVar.q(this, aomwVar);
        B(0);
        this.a--;
        if (d() != 0) {
            throw aoob.j();
        }
        C(f);
        return q;
    }

    @Override // defpackage.aomk
    public final String z() {
        int k = k();
        if (k > 0) {
            int i = this.g;
            int i2 = this.i;
            if (k <= i - i2) {
                String str = new String(this.f, i2, k, aonz.a);
                this.i += k;
                return str;
            }
        }
        if (k == 0) {
            return "";
        }
        if (k < 0) {
            throw aoob.f();
        }
        throw aoob.j();
    }

    @Override // defpackage.aomk
    public final boolean G(int i) {
        int n;
        int b = aoqp.b(i);
        int i2 = 0;
        if (b == 0) {
            if (this.g - this.i < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw aoob.e();
            }
            while (i2 < 10) {
                byte[] bArr = this.f;
                int i3 = this.i;
                this.i = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw aoob.e();
            return true;
        }
        if (b == 1) {
            D(8);
            return true;
        }
        if (b != 2) {
            if (b != 3) {
                if (b == 4) {
                    return false;
                }
                if (b == 5) {
                    D(4);
                    return true;
                }
                throw aoob.a();
            }
            do {
                n = n();
                if (n == 0) {
                    break;
                }
            } while (G(n));
            B(aoqp.c(aoqp.a(i), 4));
            return true;
        }
        D(k());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    @Override // defpackage.aomk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k() {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.i = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.i = r1
            return r0
        L6c:
            long r0 = r5.t()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aomg.k():int");
    }

    public final long s() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.i = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.i = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.i = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.i = i5;
                return j2;
            }
        }
        return t();
    }
}
