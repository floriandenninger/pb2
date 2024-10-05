package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axal implements awzu {
    private final byte[] a;
    private int b;
    private int c;

    @Override // defpackage.awzu
    public final synchronized long a() {
        return this.a.length;
    }

    @Override // defpackage.awzu
    public final synchronized int b(byte[] bArr, int i, int i2) {
        amkq.F(bArr.length - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        int length = this.a.length;
        if (i3 == length) {
            return 0;
        }
        int min = Math.min(i2, length - i3);
        for (int i4 = 0; i4 < min; i4++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            bArr[i + i4] = bArr2[i5];
            this.b = i5 + 1;
        }
        return min;
    }

    @Override // defpackage.awzu
    public final synchronized long c() {
        return this.c;
    }

    @Override // defpackage.awzu, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // defpackage.awzu
    public final synchronized long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awzu
    public final synchronized long e() {
        return this.b;
    }

    @Override // defpackage.awzu
    public final synchronized long f(long j) {
        long min;
        min = Math.min(j, this.a.length - this.b);
        this.b = (int) (this.b + min);
        return min;
    }

    @Override // defpackage.awzu
    public final synchronized void g() {
        this.c = this.b;
    }

    @Override // defpackage.awzu
    public final synchronized void h() {
        this.b = this.c;
    }

    @Override // defpackage.awzu
    public final synchronized boolean i() {
        return this.b < this.a.length;
    }

    public axal(String str) {
        try {
            this.a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
