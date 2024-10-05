package defpackage;

import java.io.OutputStream;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomm extends aomp {
    final byte[] a;
    final int b;
    int c;
    public int d;
    private final OutputStream g;

    public aomm(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.a = bArr;
        this.b = bArr.length;
        if (outputStream != null) {
            this.g = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    private final void aF() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void aG(int i) {
        if (this.b - this.c < i) {
            aF();
        }
    }

    @Override // defpackage.aomp
    public final void A(String str) {
        int b;
        try {
            int length = str.length() * 3;
            int ae = ae(length);
            int i = ae + length;
            int i2 = this.b;
            if (i <= i2) {
                if (i > i2 - this.c) {
                    aF();
                }
                int ae2 = ae(str.length());
                int i3 = this.c;
                try {
                    if (ae2 == ae) {
                        int i4 = i3 + ae2;
                        this.c = i4;
                        int a = aoqm.a(str, this.a, i4, this.b - i4);
                        this.c = i3;
                        b = (a - i3) - ae2;
                        g(b);
                        this.c = a;
                    } else {
                        b = aoqm.b(str);
                        g(b);
                        this.c = aoqm.a(str, this.a, this.c, b);
                    }
                    this.d += b;
                    return;
                } catch (aoql e) {
                    this.d -= this.c - i3;
                    this.c = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new aomo(e2);
                }
            }
            byte[] bArr = new byte[length];
            int a2 = aoqm.a(str, bArr, 0, length);
            D(a2);
            k(bArr, 0, a2);
        } catch (aoql e3) {
            ao(str, e3);
        }
    }

    @Override // defpackage.aomp
    public final void B(int i, int i2) {
        D(aoqp.c(i, i2));
    }

    @Override // defpackage.aomp
    public final void C(int i, int i2) {
        aG(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.aomp
    public final void D(int i) {
        aG(5);
        g(i);
    }

    @Override // defpackage.aomp
    public final void E(int i, long j) {
        aG(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.aomp
    public final void F(long j) {
        aG(10);
        h(j);
    }

    @Override // defpackage.aomp
    public final void G(byte[] bArr, int i) {
        D(i);
        k(bArr, 0, i);
    }

    @Override // defpackage.aomp, defpackage.aolx
    public final void a(byte[] bArr, int i, int i2) {
        k(bArr, i, i2);
    }

    @Override // defpackage.aomp
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void c(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
        this.d++;
    }

    final void d(int i) {
        byte[] bArr = this.a;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) (i & PrivateKeyType.INVALID);
        int i4 = i3 + 1;
        this.c = i4;
        bArr[i3] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
        int i5 = i4 + 1;
        this.c = i5;
        bArr[i4] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
        this.c = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
        this.d += 4;
    }

    final void e(long j) {
        byte[] bArr = this.a;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.c = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.c = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.c = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & PrivateKeyType.INVALID);
        int i7 = i6 + 1;
        this.c = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & PrivateKeyType.INVALID);
        int i8 = i7 + 1;
        this.c = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & PrivateKeyType.INVALID);
        this.c = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & PrivateKeyType.INVALID);
        this.d += 8;
    }

    final void f(int i, int i2) {
        g(aoqp.c(i, i2));
    }

    @Override // defpackage.aomp
    public final void i() {
        if (this.c > 0) {
            aF();
        }
    }

    @Override // defpackage.aomp
    public final void j(byte b) {
        if (this.c == this.b) {
            aF();
        }
        c(b);
    }

    public final void k(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        aF();
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.aomp
    public final void l(int i, boolean z) {
        aG(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.aomp
    public final void m(int i, byte[] bArr) {
        int length = bArr.length;
        B(i, 2);
        G(bArr, length);
    }

    @Override // defpackage.aomp
    public final void n(int i, aomf aomfVar) {
        B(i, 2);
        o(aomfVar);
    }

    @Override // defpackage.aomp
    public final void o(aomf aomfVar) {
        D(aomfVar.d());
        aomfVar.p(this);
    }

    @Override // defpackage.aomp
    public final void p(int i, int i2) {
        aG(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.aomp
    public final void q(int i) {
        aG(4);
        d(i);
    }

    @Override // defpackage.aomp
    public final void r(int i, long j) {
        aG(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.aomp
    public final void s(long j) {
        aG(8);
        e(j);
    }

    @Override // defpackage.aomp
    public final void t(int i, int i2) {
        aG(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
    }

    @Override // defpackage.aomp
    public final void u(int i) {
        if (i >= 0) {
            D(i);
        } else {
            F(i);
        }
    }

    @Override // defpackage.aomp
    public final void v(int i, aooy aooyVar, aopq aopqVar) {
        B(i, 2);
        D(((aolo) aooyVar).getSerializedSize(aopqVar));
        aopqVar.l(aooyVar, this.f);
    }

    @Override // defpackage.aomp
    public final void w(aooy aooyVar) {
        D(aooyVar.getSerializedSize());
        aooyVar.writeTo(this);
    }

    @Override // defpackage.aomp
    public final void x(int i, aooy aooyVar) {
        B(1, 3);
        C(2, i);
        B(3, 2);
        w(aooyVar);
        B(1, 4);
    }

    @Override // defpackage.aomp
    public final void y(int i, aomf aomfVar) {
        B(1, 3);
        C(2, i);
        n(3, aomfVar);
        B(1, 4);
    }

    @Override // defpackage.aomp
    public final void z(int i, String str) {
        B(i, 2);
        A(str);
    }

    final void g(int i) {
        if (!aomp.e) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.d++;
                i >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            bArr2[i3] = (byte) i;
            this.d++;
            return;
        }
        long j = this.c;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            aoqk.o(bArr3, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        aoqk.o(bArr4, i5, (byte) i);
        this.d += (int) (this.c - j);
    }

    final void h(long j) {
        if (!aomp.e) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.a;
                int i = this.c;
                this.c = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.d++;
                j >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            bArr2[i2] = (byte) j;
            this.d++;
            return;
        }
        long j2 = this.c;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            aoqk.o(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        aoqk.o(bArr4, i4, (byte) j);
        this.d += (int) (this.c - j2);
    }
}
