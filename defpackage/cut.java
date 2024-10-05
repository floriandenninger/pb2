package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cut implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cuu b;

    public cut(cuu cuuVar, Runnable runnable) {
        this.b = cuuVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
