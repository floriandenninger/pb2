package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbw {
    public final long b;
    public long c;
    private final pfq d;
    private int f;
    private int g;
    private byte[] e = new byte[8192];
    public final byte[] a = new byte[4096];

    public pbw(pfq pfqVar, long j, long j2) {
        this.d = pfqVar;
        this.c = j;
        this.b = j2;
    }

    private final int n(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        o(min);
        return min;
    }

    private final void o(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        System.arraycopy(bArr, i, bArr, 0, i2);
    }

    public final int a(byte[] bArr, int i, int i2) {
        int n = n(bArr, i, i2);
        if (n == 0) {
            n = b(bArr, i, i2, 0, true);
        }
        f(n);
        return n;
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int a = this.d.a(bArr, i + i3, i2 - i3);
        if (a != -1) {
            return i3 + a;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int c(int i) {
        int min = Math.min(this.g, i);
        o(min);
        return min;
    }

    public final long d() {
        return this.c + this.f;
    }

    public final void e(int i) {
        k(i, false);
    }

    public final void f(int i) {
        if (i != -1) {
            this.c += i;
        }
    }

    public final void g(byte[] bArr, int i, int i2) {
        l(bArr, i, i2, false);
    }

    public final void h(byte[] bArr, int i, int i2) {
        m(bArr, i, i2, false);
    }

    public final void i() {
        this.f = 0;
    }

    public final void j(int i) {
        int c = c(i);
        while (c < i && c != -1) {
            c = b(this.a, -c, Math.min(i, c + 4096), c, false);
        }
        f(c);
    }

    public final boolean k(int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        int length = bArr.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(bArr, Math.max(length + length, i2));
        }
        int min = Math.min(this.g - this.f, i);
        while (min < i) {
            min = b(this.e, this.f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f + i;
        this.f = i3;
        this.g = Math.max(this.g, i3);
        return true;
    }

    public final boolean l(byte[] bArr, int i, int i2, boolean z) {
        if (!k(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final boolean m(byte[] bArr, int i, int i2, boolean z) {
        int n = n(bArr, i, i2);
        while (n < i2 && n != -1) {
            n = b(bArr, i, i2, n, z);
        }
        f(n);
        return n != -1;
    }
}
