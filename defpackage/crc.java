package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crc extends FilterInputStream {
    private static final byte[] a = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private final byte b;
    private int c;

    public crc(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Cannot add invalid orientation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.b = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i = this.c;
        if (i < 2 || i > 31) {
            read = super.read();
        } else {
            read = i == 31 ? this.b : a[i - 2] & 255;
        }
        if (read != -1) {
            this.c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.c = (int) (this.c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.c;
        if (i4 > 31) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == 31) {
            bArr[i] = this.b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(31 - i4, i2);
            System.arraycopy(a, this.c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.c += i3;
        }
        return i3;
    }
}
