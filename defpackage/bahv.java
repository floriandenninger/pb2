package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahv implements Runnable {
    final /* synthetic */ bahw a;

    public bahv(bahw bahwVar) {
        this.a = bahwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.c) {
            bahw bahwVar = this.a;
            if (bahwVar.d) {
                return;
            }
            Runnable runnable = (Runnable) bahwVar.c.pollFirst();
            this.a.d = runnable != null;
            while (runnable != null) {
                try {
                    runnable.run();
                    synchronized (this.a.c) {
                        runnable = (Runnable) this.a.c.pollFirst();
                        this.a.d = runnable != null;
                    }
                } catch (Throwable th) {
                    synchronized (this.a.c) {
                        bahw bahwVar2 = this.a;
                        bahwVar2.d = false;
                        try {
                            bahwVar2.a.execute(bahwVar2.b);
                        } catch (RejectedExecutionException unused) {
                        }
                        throw th;
                    }
                }
            }
        }
    }
}
