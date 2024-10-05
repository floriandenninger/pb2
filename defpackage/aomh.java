package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aomh extends aomk {
    private final Iterable f;
    private final Iterator g;
    private ByteBuffer h;
    private int i;
    private int j;
    private int l;
    private long n;
    private long o;
    private long p;
    private int k = Integer.MAX_VALUE;
    private int m = 0;

    public aomh(Iterable iterable, int i) {
        this.i = i;
        this.f = iterable;
        this.g = iterable.iterator();
        if (i == 0) {
            this.h = aonz.c;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            return;
        }
        T();
    }

    private final int D() {
        return (int) (((this.i - this.m) - this.n) + this.o);
    }

    private final long I() {
        return this.p - this.n;
    }

    private final void R() {
        if (!this.g.hasNext()) {
            throw aoob.j();
        }
        T();
    }

    private final void S() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.k;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.i = i - i3;
    }

    private final void T() {
        ByteBuffer byteBuffer = (ByteBuffer) this.g.next();
        this.h = byteBuffer;
        this.m += (int) (this.n - this.o);
        long position = byteBuffer.position();
        this.n = position;
        this.o = position;
        this.p = this.h.limit();
        long e = aoqk.e(this.h);
        this.n += e;
        this.o += e;
        this.p += e;
    }

    private final void U(byte[] bArr, int i) {
        if (i > D()) {
            if (i > 0) {
                throw aoob.j();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (I() == 0) {
                R();
            }
            int min = Math.min(i2, (int) I());
            long j = min;
            aoqk.l(this.n, bArr, i - i2, j);
            i2 -= min;
            this.n += j;
        }
    }

    @Override // defpackage.aomk
    public final String A() {
        int k = k();
        if (k > 0) {
            long j = k;
            long j2 = this.p;
            long j3 = this.n;
            if (j <= j2 - j3) {
                String f = aoqm.f(this.h, (int) (j3 - this.o), k);
                this.n += j;
                return f;
            }
        }
        if (k >= 0 && k <= D()) {
            byte[] bArr = new byte[k];
            U(bArr, k);
            return aoqm.g(bArr, 0, k);
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
        this.k = i;
        S();
    }

    @Override // defpackage.aomk
    public final boolean E() {
        return (((long) this.m) + this.n) - this.o == ((long) this.i);
    }

    @Override // defpackage.aomk
    public final boolean F() {
        return r() != 0;
    }

    @Override // defpackage.aomk
    public final boolean G(int i) {
        int n;
        int b = aoqp.b(i);
        if (b == 0) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (a() >= 0) {
                    return true;
                }
            }
            throw aoob.e();
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

    @Override // defpackage.aomk
    public final byte[] H() {
        int k = k();
        if (k >= 0) {
            long j = k;
            if (j <= I()) {
                byte[] bArr = new byte[k];
                aoqk.l(this.n, bArr, 0L, j);
                this.n += j;
                return bArr;
            }
        }
        if (k >= 0 && k <= D()) {
            byte[] bArr2 = new byte[k];
            U(bArr2, k);
            return bArr2;
        }
        if (k > 0) {
            throw aoob.j();
        }
        if (k == 0) {
            return aonz.b;
        }
        throw aoob.f();
    }

    public final byte a() {
        if (I() == 0) {
            R();
        }
        long j = this.n;
        this.n = 1 + j;
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
        if (I() >= 4) {
            long j = this.n;
            this.n = 4 + j;
            return ((aoqk.a(j + 3) & 255) << 24) | (aoqk.a(j) & 255) | ((aoqk.a(1 + j) & 255) << 8) | ((aoqk.a(2 + j) & 255) << 16);
        }
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    @Override // defpackage.aomk
    public final int e() {
        return (int) ((this.m + this.n) - this.o);
    }

    @Override // defpackage.aomk
    public final int f(int i) {
        if (i >= 0) {
            int e = i + e();
            int i2 = this.k;
            if (e <= i2) {
                this.k = e;
                S();
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
        if (I() >= 8) {
            this.n = 8 + this.n;
            return ((aoqk.a(r0 + 7) & 255) << 56) | ((aoqk.a(6 + r0) & 255) << 48) | ((aoqk.a(4 + r0) & 255) << 32) | ((aoqk.a(2 + r0) & 255) << 16) | (aoqk.a(r0) & 255) | ((aoqk.a(1 + r0) & 255) << 8) | ((aoqk.a(3 + r0) & 255) << 24) | ((aoqk.a(5 + r0) & 255) << 40);
        }
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((a() & 255) << 56);
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
        if (k > 0) {
            long j = k;
            long j2 = this.p;
            long j3 = this.n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[k];
                aoqk.l(j3, bArr, 0L, j);
                this.n += j;
                return aomf.B(bArr);
            }
        }
        if (k > 0 && k <= D()) {
            byte[] bArr2 = new byte[k];
            U(bArr2, k);
            return aomf.B(bArr2);
        }
        if (k == 0) {
            return aomf.b;
        }
        if (k < 0) {
            throw aoob.f();
        }
        throw aoob.j();
    }

    @Override // defpackage.aomk
    public final aooy y(aopf aopfVar, aomw aomwVar) {
        throw null;
    }

    @Override // defpackage.aomk
    public final String z() {
        int k = k();
        if (k > 0) {
            long j = k;
            long j2 = this.p;
            long j3 = this.n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[k];
                aoqk.l(j3, bArr, 0L, j);
                String str = new String(bArr, aonz.a);
                this.n += j;
                return str;
            }
        }
        if (k > 0 && k <= D()) {
            byte[] bArr2 = new byte[k];
            U(bArr2, k);
            return new String(bArr2, aonz.a);
        }
        if (k == 0) {
            return "";
        }
        if (k < 0) {
            throw aoob.f();
        }
        throw aoob.j();
    }

    public final void t(int i) {
        if (i < 0 || i > ((this.i - this.m) - this.n) + this.o) {
            if (i < 0) {
                throw aoob.f();
            }
            throw aoob.j();
        }
        while (i > 0) {
            if (I() == 0) {
                R();
            }
            int min = Math.min(i, (int) I());
            i -= min;
            this.n += min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
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
            long r0 = r10.n
            long r2 = r10.p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.aoqk.a(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.n
            long r4 = r4 + r2
            r10.n = r4
            return r0
        L1a:
            long r6 = r10.p
            long r8 = r10.n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.aoqk.a(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.aoqk.a(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.n = r6
            return r0
        L8c:
            long r0 = r10.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aomh.k():int");
    }

    public final long r() {
        long a;
        long j;
        long j2;
        int i;
        long j3 = this.n;
        if (this.p != j3) {
            long j4 = j3 + 1;
            byte a2 = aoqk.a(j3);
            if (a2 >= 0) {
                this.n++;
                return a2;
            }
            if (this.p - this.n >= 10) {
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
                                                    this.n = j5;
                                                    return a;
                                                }
                                            }
                                        }
                                    }
                                }
                                a = a7 ^ j;
                                j5 = j7;
                                this.n = j5;
                                return a;
                            }
                            j2 = 266354560;
                            a = a6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.n = j5;
                    return a;
                }
                i = a3 ^ (-128);
                a = i;
                this.n = j5;
                return a;
            }
        }
        return s();
    }
}
