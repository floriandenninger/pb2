package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvz extends FilterInputStream {
    private long a;
    private final long b;
    private final long c;

    public vvz(InputStream inputStream, long j, long j2) {
        super(inputStream);
        this.a = 0L;
        amkq.E(j >= 0);
        amkq.E(true);
        this.b = j;
        this.c = j2;
    }

    private final long a(long j) {
        amkq.E(j > 0);
        long j2 = this.a;
        long j3 = this.b;
        if (j2 == j3) {
            anbt.b(this.in, this.c);
            this.a += this.c;
        } else if (j2 < j3) {
            long j4 = j3 - j2;
            if (j > j4) {
                return j4;
            }
        }
        return j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long max;
        int available = this.in.available();
        long j = this.a;
        long j2 = this.b;
        if (j <= j2) {
            long j3 = available;
            max = Math.min(Math.max(j3 - this.c, Math.min(j3, j2 - j)), 2147483647L);
        } else {
            long j4 = j2 + this.c;
            if (j >= j4) {
                return available;
            }
            max = Math.max(0L, available - (j4 - j));
        }
        return (int) max;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.a == this.b) {
            anbt.b(this.in, this.c);
            this.a += this.c;
        }
        int read = this.in.read();
        if (read != -1) {
            this.a++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new IOException("Mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(a(j));
        this.a += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int read = this.in.read(bArr, i, (int) a(i2));
        this.a += read;
        return read;
    }
}
