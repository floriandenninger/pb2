package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywb extends InputStream implements ywa {
    private final ByteBuffer a;

    public ywb(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.ywa
    public final int a(ByteBuffer byteBuffer, int i) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a.hasRemaining()) {
            return this.a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(this.a.remaining(), j);
        ByteBuffer byteBuffer = this.a;
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        try {
        } catch (InvalidMarkException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (!this.a.hasRemaining()) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(i2, this.a.remaining());
        this.a.get(bArr, i, min);
        return min;
    }
}
