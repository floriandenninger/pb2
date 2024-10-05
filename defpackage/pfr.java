package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfr extends InputStream {
    private final pfq a;
    private final pfs b;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public pfr(pfq pfqVar, pfs pfsVar) {
        this.a = pfqVar;
        this.b = pfsVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.b(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.c();
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
    public final long skip(long j) {
        opn.k(!this.e);
        a();
        return super.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        opn.k(!this.e);
        a();
        return this.a.a(bArr, i, i2);
    }
}
