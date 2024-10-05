package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcn extends InputStream {
    private final ByteBuffer a;
    private int b = 0;

    public vcn(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.remaining();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b = this.a.position();
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
    public final void reset() {
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int min = (int) Math.min(j, this.a.remaining());
        ByteBuffer byteBuffer = this.a;
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(this.a.remaining(), i2);
        this.a.get(bArr, i, min);
        return min;
    }
}
