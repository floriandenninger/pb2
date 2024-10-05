package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomi extends aomk {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public aomi(InputStream inputStream) {
        aonz.i(inputStream, "input");
        this.f = inputStream;
        this.g = new byte[4096];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private static int D(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (aoob e) {
            e.k();
            throw e;
        }
    }

    private final List I(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw aoob.j();
                }
                this.l += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void R() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    private final void S(int i) {
        if (T(i)) {
            return;
        }
        if (i > (this.c - this.l) - this.j) {
            throw aoob.i();
        }
        throw aoob.j();
    }

    private final boolean T(int i) {
        int i2 = this.j;
        int i3 = this.h;
        if (i2 + i <= i3) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i4 = this.c;
        int i5 = this.l;
        if (i > (i4 - i5) - i2 || i5 + i2 + i > this.m) {
            return false;
        }
        if (i2 > 0) {
            if (i3 > i2) {
                byte[] bArr = this.g;
                System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
            }
            i5 = this.l + i2;
            this.l = i5;
            i3 = this.h - i2;
            this.h = i3;
            this.j = 0;
        }
        int D = D(this.f, this.g, i3, Math.min(4096 - i3, (this.c - i5) - i3));
        if (D == 0 || D < -1 || D > 4096) {
            String valueOf = String.valueOf(this.f.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 91);
            sb2.append(valueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(D);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        }
        if (D <= 0) {
            return false;
        }
        this.h += D;
        R();
        if (this.h >= i) {
            return true;
        }
        return T(i);
    }

    private final byte[] U(int i) {
        if (i == 0) {
            return aonz.b;
        }
        if (i >= 0) {
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            if (i4 - this.c <= 0) {
                int i5 = this.m;
                if (i4 > i5) {
                    t((i5 - i2) - i3);
                    throw aoob.j();
                }
                int i6 = this.h - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.f.available()) {
                            return null;
                        }
                    } catch (aoob e) {
                        e.k();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.g, this.j, bArr, 0, i6);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while (i6 < i) {
                    int D = D(this.f, bArr, i6, i - i6);
                    if (D == -1) {
                        throw aoob.j();
                    }
                    this.l += D;
                    i6 += D;
                }
                return bArr;
            }
            throw aoob.i();
        }
        throw aoob.f();
    }

    private final byte[] V(int i) {
        byte[] U = U(i);
        if (U != null) {
            return U;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> I = I(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : I) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.aomk
    public final String A() {
        byte[] V;
        int k = k();
        int i = this.j;
        int i2 = this.h;
        if (k <= i2 - i && k > 0) {
            V = this.g;
            this.j = i + k;
        } else {
            if (k == 0) {
                return "";
            }
            if (k <= i2) {
                S(k);
                V = this.g;
                this.j = k;
            } else {
                V = V(k);
            }
            i = 0;
        }
        return aoqm.g(V, i, k);
    }

    @Override // defpackage.aomk
    public final void B(int i) {
        if (this.k != i) {
            throw aoob.b();
        }
    }

    @Override // defpackage.aomk
    public final void C(int i) {
        this.m = i;
        R();
    }

    @Override // defpackage.aomk
    public final boolean E() {
        return this.j == this.h && !T(1);
    }

    @Override // defpackage.aomk
    public final boolean F() {
        return r() != 0;
    }

    @Override // defpackage.aomk
    public final byte[] H() {
        int k = k();
        int i = this.h;
        int i2 = this.j;
        if (k > i - i2 || k <= 0) {
            return V(k);
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.g, i2, i2 + k);
        this.j += k;
        return copyOfRange;
    }

    public final byte a() {
        if (this.j == this.h) {
            S(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
        return bArr[i];
    }

    @Override // defpackage.aomk
    public final double b() {
        return Double.longBitsToDouble(j());
    }

    @Override // defpackage.aomk
    public final float c() {
        return Float.intBitsToFloat(d());
    }

    public final int d() {
        int i = this.j;
        if (this.h - i < 4) {
            S(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.aomk
    public final int e() {
        return this.l + this.j;
    }

    @Override // defpackage.aomk
    public final int f(int i) {
        if (i >= 0) {
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 <= i3) {
                this.m = i2;
                R();
                return i3;
            }
            throw aoob.j();
        }
        throw aoob.f();
    }

    @Override // defpackage.aomk
    public final int g() {
        return k();
    }

    @Override // defpackage.aomk
    public final int h() {
        return d();
    }

    @Override // defpackage.aomk
    public final int i() {
        return k();
    }

    public final long j() {
        int i = this.j;
        if (this.h - i < 8) {
            S(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.aomk
    public final int l() {
        return d();
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
        return j();
    }

    @Override // defpackage.aomk
    public final long q() {
        return r();
    }

    final long s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw aoob.e();
    }

    public final void t(int i) {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
            return;
        }
        if (i >= 0) {
            int i5 = this.l;
            int i6 = i5 + i3;
            int i7 = this.m;
            if (i6 + i > i7) {
                t((i7 - i5) - i3);
                throw aoob.j();
            }
            this.l = i6;
            this.h = 0;
            this.j = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    try {
                        long skip = this.f.skip(j);
                        if (skip < 0 || skip > j) {
                            String valueOf = String.valueOf(this.f.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (aoob e) {
                        e.k();
                        throw e;
                    }
                } finally {
                    this.l += i4;
                    R();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i8 = this.h;
            int i9 = i8 - this.j;
            this.j = i8;
            S(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.h;
                if (i10 <= i11) {
                    this.j = i10;
                    return;
                } else {
                    i9 += i11;
                    this.j = i11;
                    S(1);
                }
            }
        } else {
            throw aoob.f();
        }
    }

    @Override // defpackage.aomk
    public final long u() {
        return j();
    }

    @Override // defpackage.aomk
    public final long v() {
        return L(r());
    }

    @Override // defpackage.aomk
    public final long w() {
        return r();
    }

    @Override // defpackage.aomk
    public final aomf x() {
        int k = k();
        int i = this.h;
        int i2 = this.j;
        if (k <= i - i2 && k > 0) {
            aomf y = aomf.y(this.g, i2, k);
            this.j += k;
            return y;
        }
        if (k != 0) {
            byte[] U = U(k);
            if (U != null) {
                return aomf.x(U);
            }
            int i3 = this.j;
            int i4 = this.h;
            int i5 = i4 - i3;
            this.l += i4;
            this.j = 0;
            this.h = 0;
            List<byte[]> I = I(k - i5);
            byte[] bArr = new byte[k];
            System.arraycopy(this.g, i3, bArr, 0, i5);
            for (byte[] bArr2 : I) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return aomf.B(bArr);
        }
        return aomf.b;
    }

    @Override // defpackage.aomk
    public final aooy y(aopf aopfVar, aomw aomwVar) {
        throw null;
    }

    @Override // defpackage.aomk
    public final String z() {
        int k = k();
        if (k > 0) {
            int i = this.h;
            int i2 = this.j;
            if (k <= i - i2) {
                String str = new String(this.g, i2, k, aonz.a);
                this.j += k;
                return str;
            }
        }
        if (k == 0) {
            return "";
        }
        if (k <= this.h) {
            S(k);
            String str2 = new String(this.g, this.j, k, aonz.a);
            this.j += k;
            return str2;
        }
        return new String(V(k), aonz.a);
    }

    @Override // defpackage.aomk
    public final boolean G(int i) {
        int n;
        int b = aoqp.b(i);
        int i2 = 0;
        if (b == 0) {
            if (this.h - this.j < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw aoob.e();
            }
            while (i2 < 10) {
                byte[] bArr = this.g;
                int i3 = this.j;
                this.j = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw aoob.e();
            return true;
        }
        if (b == 1) {
            t(8);
            return true;
        }
        if (b != 2) {
            if (b != 3) {
                if (b == 4) {
                    return false;
                }
                if (b == 5) {
                    t(4);
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
        t(k());
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
            int r0 = r5.j
            int r1 = r5.h
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.j = r3
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
            r5.j = r1
            return r0
        L6c:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aomi.k():int");
    }

    public final long r() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
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
                                                    this.j = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.j = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.j = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.j = i5;
                return j2;
            }
        }
        return s();
    }
}
