package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class badc extends InputStream {
    final /* synthetic */ badd a;

    public badc(badd baddVar) {
        this.a = baddVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        badd baddVar = this.a;
        if (baddVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(baddVar.a.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        badd baddVar = this.a;
        if (baddVar.c) {
            throw new IOException("closed");
        }
        bacu bacuVar = baddVar.a;
        if (bacuVar.b == 0 && baddVar.b.e(bacuVar, 8192L) == -1) {
            return -1;
        }
        return this.a.a.b() & 255;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(".inputStream()");
        return sb.toString();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.c) {
            throw new IOException("closed");
        }
        badi.a(bArr.length, i, i2);
        badd baddVar = this.a;
        bacu bacuVar = baddVar.a;
        if (bacuVar.b == 0 && baddVar.b.e(bacuVar, 8192L) == -1) {
            return -1;
        }
        return this.a.a.c(bArr, i, i2);
    }
}
