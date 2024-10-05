package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekb extends ByteArrayOutputStream {
    public aekb(byte[] bArr, byte[] bArr2) {
    }

    public final void a(int i, int i2, byte[] bArr, int i3) {
        System.arraycopy(this.buf, i, bArr, i3, i2);
    }

    public final int b() {
        return this.count;
    }

    public final byte[] c() {
        return this.buf;
    }

    public final ByteBuffer d() {
        return ByteBuffer.wrap(this.buf, 0, this.count);
    }

    public aekb(int i) {
        super(i);
    }

    public aekb(byte[] bArr) {
    }

    public aekb() {
        super(102400);
    }
}
