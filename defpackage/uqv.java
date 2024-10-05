package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqv implements uoc, uob {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor");
    private final axpg b;
    private boolean c = false;
    private Activity d;

    public uqv(axpg axpgVar, final azrw azrwVar, final ammv ammvVar, Executor executor) {
        this.b = axpgVar;
        executor.execute(new Runnable() { // from class: uqu
            @Override // java.lang.Runnable
            public final void run() {
                uqv.this.c(azrwVar, ammvVar);
            }
        });
    }

    @Override // defpackage.uoc
    public synchronized void a(Activity activity) {
        this.d = activity;
        if (this.c) {
            ((urb) this.b.get()).f(activity);
        }
    }

    @Override // defpackage.uob
    public synchronized void b(Activity activity) {
        if (!activity.equals(this.d)) {
            ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 90, "ActivityLevelJankMonitor.java")).u("Activity mismatch (currentActivity=%s, activity=%s)", this.d, activity);
        }
        if (this.c) {
            ((urb) this.b.get()).c(activity);
        }
        this.d = null;
    }

    public /* synthetic */ void c(azrw azrwVar, ammv ammvVar) {
        if (((Boolean) azrwVar.get()).booleanValue()) {
            synchronized (this) {
                this.c = true;
                Activity activity = this.d;
                if (activity != null) {
                    a(activity);
                }
            }
        }
    }
}
