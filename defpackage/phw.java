package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phw extends BufferedOutputStream {
    private boolean a;

    public phw(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(OutputStream outputStream) {
        pse.g(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = pts.a;
        throw th;
    }

    public phw(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
