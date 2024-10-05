package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dde extends FilterInputStream {
    private final long a;
    private int b;

    public dde(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    private final void a(int i) {
        if (i >= 0) {
            this.b += i;
            return;
        }
        long j = this.a;
        int i2 = this.b;
        if (j - i2 <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(87);
        sb.append("Failed to read all expected data, expected: ");
        sb.append(j);
        sb.append(", but read: ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.a - this.b, this.in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        a(read);
        return read;
    }
}
