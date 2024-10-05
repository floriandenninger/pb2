package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomj extends aomk {
    private final ByteBuffer f;
    private final long g;
    private long h;
    private long i;
    private final long j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public aomj(ByteBuffer byteBuffer) {
        this.f = byteBuffer;
        long e = aoqk.e(byteBuffer);
        this.g = e;
        this.h = byteBuffer.limit() + e;
        long position = e + byteBuffer.position();
        this.i = position;
        this.j = position;
    }

    private final int D(long j) {
        return (int) (j - this.g);
    }

    private final int I() {
        return (int) (this.h - this.i);
    }

    private final void R() {
        long j = this.h + this.k;
        this.h = j;
        int i = (int) (j - this.j);
        int i2 = this.m;
        if (i <= i2) {
            this.k = 0;
            return;
        }
        int i3 = i - i2;
        this.k = i3;
        this.h = j - i3;
    }

    @Override // defpackage.aomk
    public final String A() {
        int k = k();
        if (k > 0 && k <= I()) {
            String f = aoqm.f(this.f, D(this.i), k);
            this.i += k;
            return f;
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
        if (this.l != i) {
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
        return this.i == this.h;
    }

    @Override // defpackage.aomk
    public final boolean F() {
        return r() != 0;
    }

    @Override // defpackage.aomk
    public final byte[] H() {
        int k = k();
        if (k < 0 || k > I()) {
            if (k > 0) {
                throw aoob.j();
            }
            if (k == 0) {
                return aonz.b;
            }
            throw aoob.f();
        }
        byte[] bArr = new byte[k];
        long j = this.i;
        long j2 = k;
        long j3 = j + j2;
        int position = this.f.position();
        int limit = this.f.limit();
        ByteBuffer byteBuffer = this.f;
        try {
            try {
                byteBuffer.position(D(j));
                byteBuffer.limit(D(j3));
                ByteBuffer slice = this.f.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                slice.get(bArr);
                this.i += j2;
                return bArr;
            } catch (IllegalArgumentException e) {
                aoob j4 = aoob.j();
                j4.initCause(e);
                throw j4;
            }
        } catch (Throwable th) {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            throw th;
        }
    }

    public final byte a() {
        long j = this.i;
        if (j == this.h) {
            throw aoob.j();
        }
        this.i = 1 + j;
        return aoqk.a(j);
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
        long j = this.i;
        if (this.h - j < 4) {
            throw aoob.j();
        }
        this.i = 4 + j;
        return ((aoqk.a(j + 3) & 255) << 24) | (aoqk.a(j) & 255) | ((aoqk.a(1 + j) & 255) << 8) | ((aoqk.a(2 + j) & 255) << 16);
    }

    @Override // defpackage.aomk
    public final int e() {
        return (int) (this.i - this.j);
    }

    @Override // defpackage.aomk
    public final int f(int i) {
        if (i >= 0) {
            int e = i + e();
            int i2 = this.m;
            if (e <= i2) {
                this.m = e;
                R();
                return i2;
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
        long j = this.i;
        if (this.h - j < 8) {
            throw aoob.j();
        }
        this.i = 8 + j;
        return ((aoqk.a(j + 7) & 255) << 56) | (aoqk.a(j) & 255) | ((aoqk.a(1 + j) & 255) << 8) | ((aoqk.a(2 + j) & 255) << 16) | ((aoqk.a(3 + j) & 255) << 24) | ((aoqk.a(4 + j) & 255) << 32) | ((aoqk.a(5 + j) & 255) << 40) | ((aoqk.a(6 + j) & 255) << 48);
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
            this.l = 0;
            return 0;
        }
        int k = k();
        this.l = k;
        if (aoqp.a(k) != 0) {
            return this.l;
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
        if (i >= 0 && i <= I()) {
            this.i += i;
        } else {
            if (i < 0) {
                throw aoob.f();
            }
            throw aoob.j();
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
        if (k <= 0 || k > I()) {
            if (k == 0) {
                return aomf.b;
            }
            if (k < 0) {
                throw aoob.f();
            }
            throw aoob.j();
        }
        byte[] bArr = new byte[k];
        long j = k;
        aoqk.l(this.i, bArr, 0L, j);
        this.i += j;
        return aomf.B(bArr);
    }

    @Override // defpackage.aomk
    public final aooy y(aopf aopfVar, aomw aomwVar) {
        throw null;
    }

    @Override // defpackage.aomk
    public final String z() {
        int k = k();
        if (k <= 0 || k > I()) {
            if (k == 0) {
                return "";
            }
            if (k < 0) {
                throw aoob.f();
            }
            throw aoob.j();
        }
        byte[] bArr = new byte[k];
        long j = k;
        aoqk.l(this.i, bArr, 0L, j);
        String str = new String(bArr, aonz.a);
        this.i += j;
        return str;
    }

    @Override // defpackage.aomk
    public final boolean G(int i) {
        int n;
        int b = aoqp.b(i);
        int i2 = 0;
        if (b == 0) {
            if (I() < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw aoob.e();
            }
            while (i2 < 10) {
                long j = this.i;
                this.i = 1 + j;
                if (aoqk.a(j) < 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (defpackage.aoqk.a(r4) >= 0) goto L33;
     */
    @Override // defpackage.aomk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k() {
        /*
            r10 = this;
            long r0 = r10.i
            long r2 = r10.h
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.aoqk.a(r0)
            if (r0 < 0) goto L17
            r10.i = r4
            return r0
        L17:
            long r6 = r10.h
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            if (r1 < 0) goto L87
        L84:
            r10.i = r6
            return r0
        L87:
            long r0 = r10.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aomj.k():int");
    }

    public final long r() {
        long a;
        long j;
        long j2;
        int i;
        long j3 = this.i;
        if (this.h != j3) {
            long j4 = j3 + 1;
            byte a2 = aoqk.a(j3);
            if (a2 >= 0) {
                this.i = j4;
                return a2;
            }
            if (this.h - j4 >= 9) {
                long j5 = j4 + 1;
                int a3 = a2 ^ (aoqk.a(j4) << 7);
                if (a3 >= 0) {
                    long j6 = j5 + 1;
                    int a4 = a3 ^ (aoqk.a(j5) << 14);
                    if (a4 >= 0) {
                        a = a4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int a5 = a4 ^ (aoqk.a(j6) << 21);
                        if (a5 < 0) {
                            i = a5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long a6 = a5 ^ (aoqk.a(j5) << 28);
                            if (a6 < 0) {
                                long j7 = j6 + 1;
                                long a7 = a6 ^ (aoqk.a(j6) << 35);
                                if (a7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    a6 = a7 ^ (aoqk.a(j7) << 42);
                                    if (a6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        a7 = a6 ^ (aoqk.a(j6) << 49);
                                        if (a7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            a = (a7 ^ (aoqk.a(j7) << 56)) ^ 71499008037633920L;
                                            if (a < 0) {
                                                long j8 = 1 + j6;
                                                if (aoqk.a(j6) >= 0) {
                                                    j5 = j8;
                                                    this.i = j5;
                                                    return a;
                                                }
                                            }
                                        }
                                    }
                                }
                                a = a7 ^ j;
                                j5 = j7;
                                this.i = j5;
                                return a;
                            }
                            j2 = 266354560;
                            a = a6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.i = j5;
                    return a;
                }
                i = a3 ^ (-128);
                a = i;
                this.i = j5;
                return a;
            }
        }
        return s();
    }
}
