package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bacy implements badh {
    final /* synthetic */ InputStream a;

    public bacy(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.badh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.badh
    public final long e(bacu bacuVar, long j) {
        try {
            if (!Thread.interrupted()) {
                bade j2 = bacuVar.j(1);
                int read = this.a.read(j2.a, j2.c, (int) Math.min(8192L, 8192 - j2.c));
                if (read == -1) {
                    return -1L;
                }
                j2.c += read;
                long j3 = read;
                bacuVar.b += j3;
                return j3;
            }
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } catch (AssertionError e) {
            if (bacz.c(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("source(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
