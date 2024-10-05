package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anga implements Runnable {
    final /* synthetic */ Closeable a;

    public anga(Closeable closeable) {
        this.a = closeable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.close();
        } catch (IOException | RuntimeException e) {
            angk.a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture$11", "run", "thrown by close()", e);
        }
    }
}
