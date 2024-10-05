package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awzv implements awzu {
    private final RandomAccessFile a;
    private long b = 0;
    private long c = 0;

    public awzv(File file) {
        this.a = new RandomAccessFile(file, "r");
    }

    @Override // defpackage.awzu
    public final synchronized long a() {
        try {
        } catch (IOException unused) {
            return -1L;
        }
        return this.a.length();
    }

    @Override // defpackage.awzu
    public final synchronized int b(byte[] bArr, int i, int i2) {
        amkq.F(bArr.length - i >= i2, "Buffer length must be greater than desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        if (this.c != this.a.getFilePointer()) {
            this.a.seek(this.c);
        }
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            return 0;
        }
        this.c += read;
        return read;
    }

    @Override // defpackage.awzu
    public final synchronized long c() {
        return this.b;
    }

    @Override // defpackage.awzu, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.awzu
    public final synchronized long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awzu
    public final synchronized long e() {
        return this.c;
    }

    @Override // defpackage.awzu
    public final synchronized long f(long j) {
        amkq.F(j >= 0, "Can't skip negative bytes.");
        if (j == 0) {
            return j;
        }
        long min = Math.min(this.c + j, this.a.length());
        this.a.seek(min);
        long j2 = this.c;
        this.c = min;
        return min - j2;
    }

    @Override // defpackage.awzu
    public final synchronized void g() {
        this.b = this.c;
    }

    @Override // defpackage.awzu
    public final synchronized void h() {
        this.c = this.b;
    }

    @Override // defpackage.awzu
    public final synchronized boolean i() {
        return this.c < this.a.length();
    }
}
