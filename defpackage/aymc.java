package defpackage;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aymc extends InputStream implements aybh {
    private final aymb a;

    public aymc(aymb aymbVar) {
        aymbVar.getClass();
        this.a = aymbVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((aygn) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        aymb aymbVar = this.a;
        if (((aygn) aymbVar).a == 0) {
            return -1;
        }
        return aymbVar.e();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int min = (int) Math.min(((aygn) this.a).a, j);
        this.a.l(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = ((aygn) this.a).a;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        this.a.k(bArr, i, min);
        return min;
    }
}
