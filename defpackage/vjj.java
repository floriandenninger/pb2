package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vjj implements Application.ActivityLifecycleCallbacks, vjc {
    private static final long i = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public vjf b;
    public ScheduledFuture g;
    private final vje j;
    public final AtomicLong f = new AtomicLong(0);
    public long c = 100;
    public long d = i;
    public boolean e = true;
    protected final Object h = new Object();

    private vjj(vjf vjfVar, ScheduledExecutorService scheduledExecutorService, vje vjeVar) {
        this.b = vjfVar;
        this.a = scheduledExecutorService;
        this.j = vjeVar;
    }

    public static vjj a(vjf vjfVar, ScheduledExecutorService scheduledExecutorService, vje vjeVar, Application application) {
        vjj vjjVar = new vjj(vjfVar, scheduledExecutorService, vjeVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(vjjVar);
        }
        vjeVar.a = vjjVar;
        return vjjVar;
    }

    public final void b() {
        synchronized (this.h) {
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.g = null;
            }
        }
    }

    public final void c() {
        if (this.e) {
            this.f.set(0L);
            this.b.a(this.j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.h) {
            c();
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
