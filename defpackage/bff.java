package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bff extends InputStream {
    private final ate a;
    private final ath b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public bff(ate ateVar, ath athVar) {
        this.a = ateVar;
        this.b = athVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.j();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        pse.g(!this.e);
        if (!this.d) {
            this.a.h(this.b);
            this.d = true;
        }
        int g = this.a.g(bArr, i, i2);
        if (g == -1) {
            return -1;
        }
        this.f += g;
        return g;
    }
}
