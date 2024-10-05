package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sih implements Runnable {
    private final Runnable a;
    private final /* synthetic */ int b;

    public sih(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public final String toString() {
        return this.b != 0 ? this.a.toString() : this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            try {
                this.a.run();
                return;
            } catch (Throwable th) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                return;
            }
        }
        try {
            this.a.run();
        } catch (Throwable th2) {
            sif.a.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ErrorLoggingExecutorService$LoggingRunnable", "run", "Uncaught exception from runnable", th2);
            Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th2);
        }
    }
}
