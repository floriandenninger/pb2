package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yqh implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public Boolean b;
    private volatile String i;
    private volatile Activity j;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();

    private final void a(Activity activity) {
        b(Boolean.valueOf(uon.c(activity.getApplicationContext())));
    }

    private final void b(Boolean bool) {
        if (bool.equals(this.b)) {
            ((amxh) ((amxh) yqi.a.d()).i("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker$Callbacks", "setForegroundState", 246, "ApplicationLifecycleTracker.java")).s("App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.b = bool;
        if (bool.booleanValue()) {
            ((amxh) ((amxh) yqi.a.d()).i("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker$Callbacks", "setForegroundState", 251, "ApplicationLifecycleTracker.java")).q("App transition to foreground");
            for (yqd yqdVar : this.a) {
                if (yqdVar instanceof yqb) {
                    ((yqb) yqdVar).a();
                }
            }
            return;
        }
        ((amxh) ((amxh) yqi.a.d()).i("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker$Callbacks", "setForegroundState", 258, "ApplicationLifecycleTracker.java")).q("App transition to background");
        for (yqd yqdVar2 : this.a) {
            if (yqdVar2 instanceof yqa) {
                ((yqa) yqdVar2).c();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.c.incrementAndGet();
        this.j = null;
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof ypt) {
                ((ypt) yqdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.h.incrementAndGet();
        this.j = null;
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof ypu) {
                ((ypu) yqdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f.incrementAndGet();
        this.i = null;
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof ypv) {
                ((ypv) yqdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.e.incrementAndGet();
        this.j = null;
        this.i = activity.getClass().getSimpleName();
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof ypw) {
                ((ypw) yqdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof ypx) {
                ((ypx) yqdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.d.incrementAndGet();
        this.j = null;
        a(activity);
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof ypy) {
                ((ypy) yqdVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.g.incrementAndGet();
        this.j = activity;
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof ypz) {
                ((ypz) yqdVar).a();
            }
        }
        a(activity);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        for (yqd yqdVar : this.a) {
            if (yqdVar instanceof yqc) {
                ((yqc) yqdVar).a();
            }
        }
        if (i >= 20 && this.j != null) {
            b(false);
        }
        this.j = null;
    }
}
