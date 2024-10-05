package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgx {
    public byte[] a;
    public int b;
    public int c;

    public pgx() {
    }

    public pgx(int i) {
        byte[] bArr = new byte[i];
        this.a = bArr;
        this.c = bArr.length;
    }

    public pgx(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final void A(int i) {
        z(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final int b() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int c() {
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
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    public final int e() {
        int d = d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final int g() {
        return (h() << 21) | (h() << 14) | (h() << 7) | h();
    }

    public final int h() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int i() {
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

    public final int j() {
        int c = c();
        if (c >= 0) {
            return c;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(c);
        throw new IllegalStateException(sb.toString());
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final long l() {
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

    public final long m() {
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
        return ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8) | (bArr[i4] & 255);
    }

    public final long o() {
        long m = m();
        if (m >= 0) {
            return m;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(m);
        throw new IllegalStateException(sb.toString());
    }

    public final String p() {
        byte b;
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && (b = this.a[i]) != 10 && b != 13) {
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
        String str = new String(this.a, i2, i - i2);
        this.b = i;
        int i3 = this.c;
        if (i == i3) {
            return str;
        }
        byte[] bArr2 = this.a;
        if (bArr2[i] == 13) {
            i++;
            this.b = i;
            if (i == i3) {
                return str;
            }
        }
        if (bArr2[i] == 10) {
            this.b = i + 1;
        }
        return str;
    }

    public final String q() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        int i2 = this.b;
        String str = new String(this.a, i2, i - i2, Charset.defaultCharset());
        this.b = i;
        if (i == this.c) {
            return str;
        }
        this.b = i + 1;
        return str;
    }

    public final String r(int i) {
        return s(i, Charset.defaultCharset());
    }

    public final String s(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final void t(pgw pgwVar, int i) {
        u(pgwVar.a, 0, i);
        pgwVar.d(0);
    }

    public final void u(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void v() {
        this.b = 0;
        this.c = 0;
    }

    public final void w(int i) {
        x(b() < i ? new byte[i] : this.a, i);
    }

    public final void x(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void y(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        opn.i(z);
        this.c = i;
    }

    public final void z(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        opn.i(z);
        this.b = i;
    }

    public pgx(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
