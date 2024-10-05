package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class bajc extends OutputStream {
    private boolean a;
    public IOException d;
    public boolean e;

    public abstract UploadDataProvider a();

    public abstract void b();

    public abstract void c();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        IOException iOException = this.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        if (this.e) {
            d();
            throw new IOException("Writing after request completed.");
        }
        if (this.a) {
            throw new IOException("Stream has been closed.");
        }
    }
}
