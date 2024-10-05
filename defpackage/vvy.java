package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvy extends FilterInputStream {
    private long a;
    private final long b;
    private final byte[] c;

    public vvy(InputStream inputStream, long j, byte[] bArr) {
        super(inputStream);
        this.a = 0L;
        amkq.E(j >= 0);
        this.b = j;
        this.c = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long j = this.a;
        long j2 = this.b;
        if (j <= j2) {
            if (j + this.in.available() >= this.b) {
                return this.in.available() + this.c.length;
            }
            return this.in.available();
        }
        if (j > j2) {
            long length = this.c.length;
            if (j < j2 + length) {
                return (int) ((length - (j - j2)) + this.in.available());
            }
        }
        return this.in.available();
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
        long j = this.a;
        long j2 = this.b;
        if (j >= j2) {
            byte[] bArr = this.c;
            if (j < bArr.length + j2) {
                this.a = 1 + j;
                return bArr[(int) (j - j2)];
            }
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
        amkq.E(j >= 0);
        long j2 = this.a;
        long j3 = this.b;
        if (j2 < j3) {
            long j4 = j3 - j2;
            if (j > j4) {
                j = j4;
            }
            j = this.in.skip(j);
        } else {
            long length = j3 + this.c.length;
            if (j2 >= length) {
                j = this.in.skip(j);
            } else {
                long j5 = length - j2;
                if (j > j5) {
                    j = j5;
                }
            }
        }
        this.a += j;
        return j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        bArr.getClass();
        if (i < 0 || i2 < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            long j3 = j2 - j;
            if (i2 > j3) {
                i2 = (int) j3;
            }
            i3 = this.in.read(bArr, i, i2);
        } else {
            byte[] bArr2 = this.c;
            long length = bArr2.length + j2;
            if (j >= length) {
                i3 = this.in.read(bArr, i, i2);
            } else {
                int i4 = (int) (length - j);
                if (i2 > i4) {
                    i2 = i4;
                }
                System.arraycopy(bArr2, (int) (j - j2), bArr, i, i2);
                i3 = i2;
            }
        }
        this.a += i3;
        return i3;
    }
}
