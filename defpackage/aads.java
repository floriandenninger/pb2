package defpackage;

import java.lang.Thread;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aads implements Thread.UncaughtExceptionHandler {
    public final azrw a;
    volatile Thread.UncaughtExceptionHandler b;
    public volatile boolean c;

    public aads(azrw azrwVar) {
        this.a = azrwVar;
    }

    private final void b(amml ammlVar) {
        try {
            ((ywr) this.a.get()).b(ammlVar).get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            afsi.c(2, 5, "Failed to store uncaught exception crash counter.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        b(yml.n);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.c) {
            b(yml.m);
        }
        if (this.b != null) {
            this.b.uncaughtException(thread, th);
        }
    }
}
