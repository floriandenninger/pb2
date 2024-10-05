package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bid implements bii {
    public final long b;
    public long c;
    public int e;
    public int f;
    private final atc g;
    public byte[] d = new byte[65536];
    public final byte[] a = new byte[4096];

    public bid(atc atcVar, long j, long j2) {
        this.g = atcVar;
        this.c = j;
        this.b = j2;
    }

    private final int q(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.d, 0, bArr, i, min);
        r(min);
        return min;
    }

    private final void r(int i) {
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr = this.d;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.d = bArr2;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int g = this.g.g(bArr, i + i3, i2 - i3);
        if (g != -1) {
            return i3 + g;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int b(int i) {
        int min = Math.min(this.f, i);
        r(min);
        return min;
    }

    @Override // defpackage.bii
    public final long c() {
        return this.b;
    }

    @Override // defpackage.bii
    public final long d() {
        return this.c + this.e;
    }

    @Override // defpackage.bii
    public final long e() {
        return this.c;
    }

    @Override // defpackage.bii
    public final void f(int i) {
        n(i, false);
    }

    @Override // defpackage.bii, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        int q = q(bArr, i, i2);
        if (q == 0) {
            q = a(bArr, i, i2, 0, true);
        }
        h(q);
        return q;
    }

    public final void h(int i) {
        if (i != -1) {
            this.c += i;
        }
    }

    public final void i(int i) {
        int i2 = this.e + i;
        int length = this.d.length;
        if (i2 > length) {
            this.d = Arrays.copyOf(this.d, pts.c(length + length, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.bii
    public final void j(byte[] bArr, int i, int i2) {
        o(bArr, i, i2, false);
    }

    @Override // defpackage.bii
    public final void k(byte[] bArr, int i, int i2) {
        p(bArr, i, i2, false);
    }

    @Override // defpackage.bii
    public final void l() {
        this.e = 0;
    }

    @Override // defpackage.bii
    public final void m(int i) {
        int b = b(i);
        while (b < i && b != -1) {
            b = a(this.a, -b, Math.min(i, b + 4096), b, false);
        }
        h(b);
    }

    public final boolean n(int i, boolean z) {
        i(i);
        int i2 = this.f - this.e;
        while (i2 < i) {
            i2 = a(this.d, this.e, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f = this.e + i2;
        }
        this.e += i;
        return true;
    }

    @Override // defpackage.bii
    public final boolean o(byte[] bArr, int i, int i2, boolean z) {
        if (!n(i2, z)) {
            return false;
        }
        System.arraycopy(this.d, this.e - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.bii
    public final boolean p(byte[] bArr, int i, int i2, boolean z) {
        int q = q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = a(bArr, i, i2, q, z);
        }
        h(q);
        return q != -1;
    }
}
