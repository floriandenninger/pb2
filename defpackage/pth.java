package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pth {
    public byte[] a;
    public int b;
    public int c;

    public pth() {
        this.a = pts.f;
    }

    public pth(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final void A(ptg ptgVar, int i) {
        B(ptgVar.a, 0, i);
        ptgVar.j(0);
    }

    public final void B(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void C(int i) {
        E(b() < i ? new byte[i] : this.a, i);
    }

    public final void D(byte[] bArr) {
        E(bArr, bArr.length);
    }

    public final void E(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void F(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        pse.e(z);
        this.c = i;
    }

    public final void G(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        pse.e(z);
        this.b = i;
    }

    public final void H(int i) {
        G(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final int b() {
        return this.a.length;
    }

    public final int c() {
        return this.a[this.b] & 255;
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    public final int f() {
        int e = e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final int h() {
        return (i() << 21) | (i() << 14) | (i() << 7) | i();
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        this.b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    public final int l() {
        int d = d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final long n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.b = i8;
        byte b7 = bArr[i7];
        this.b = i8 + 1;
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (bArr[i8] & 255);
    }

    public final long p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8) | (bArr[i4] & 255);
    }

    public final long q() {
        long o = o();
        if (o >= 0) {
            return o;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString());
    }

    public final long r() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.a[this.b + i2] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | (r2 & 63);
        }
        this.b += i;
        return j;
    }

    public final String s() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !pts.V(this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.b = i2;
            }
        }
        String F = pts.F(this.a, i2, i - i2);
        this.b = i;
        int i3 = this.c;
        if (i == i3) {
            return F;
        }
        byte[] bArr2 = this.a;
        if (bArr2[i] == 13) {
            i++;
            this.b = i;
            if (i == i3) {
                return F;
            }
        }
        if (bArr2[i] == 10) {
            this.b = i + 1;
        }
        return F;
    }

    public final String t() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String F = pts.F(bArr, i2, i - i2);
        this.b = i;
        if (i >= this.c) {
            return F;
        }
        this.b = i + 1;
        return F;
    }

    public final String u(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String F = pts.F(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return F;
    }

    public final String v(int i) {
        return w(i, amme.c);
    }

    public final String w(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final short x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (b & 255));
    }

    public final short y() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    public final void z(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public pth(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public pth(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
