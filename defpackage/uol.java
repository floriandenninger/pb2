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
public final class uol implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    private Boolean i;
    private volatile String j;
    private volatile Activity k;
    private final ammr m;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private boolean l = false;

    public uol(ammr ammrVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.m = ammrVar;
    }

    private final void a(Activity activity) {
        c(Boolean.valueOf(uon.c(activity.getApplicationContext())), activity);
    }

    private final void b() {
        if (!this.l && this.d.get() == 0) {
            ammr ammrVar = this.m;
            if (ammrVar.p()) {
                this.l = true;
            } else {
                String valueOf = String.valueOf(ammrVar.b);
                throw new IllegalStateException(valueOf.length() != 0 ? "Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: ".concat(valueOf) : new String("Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: "));
            }
        }
    }

    private final void c(Boolean bool, Activity activity) {
        if (bool.equals(this.i)) {
            ((amxh) ((amxh) uom.a.d()).i("com/google/android/libraries/performance/primes/lifecycle/AppLifecycleTracker$Callbacks", "setForegroundState", 286, "AppLifecycleTracker.java")).s("App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.i = bool;
        if (bool.booleanValue()) {
            ((amxh) ((amxh) uom.a.d()).i("com/google/android/libraries/performance/primes/lifecycle/AppLifecycleTracker$Callbacks", "setForegroundState", 291, "AppLifecycleTracker.java")).q("App transition to foreground");
            for (uoj uojVar : this.a) {
                if (uojVar instanceof uoh) {
                    ((uoh) uojVar).c(activity);
                }
            }
            return;
        }
        ((amxh) ((amxh) uom.a.d()).i("com/google/android/libraries/performance/primes/lifecycle/AppLifecycleTracker$Callbacks", "setForegroundState", 298, "AppLifecycleTracker.java")).q("App transition to background");
        for (uoj uojVar2 : this.a) {
            if (uojVar2 instanceof uog) {
                ((uog) uojVar2).d(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.d.incrementAndGet();
        this.k = null;
        for (uoj uojVar : this.a) {
            if (uojVar instanceof unz) {
                ((unz) uojVar).b(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        for (uoj uojVar : this.a) {
            if (uojVar instanceof uoa) {
                ((uoa) uojVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            b();
        }
        this.j = null;
        for (uoj uojVar : this.a) {
            if (uojVar instanceof uob) {
                ((uob) uojVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        this.j = activity.getClass().getSimpleName();
        for (uoj uojVar : this.a) {
            if (uojVar instanceof uoc) {
                ((uoc) uojVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (uoj uojVar : this.a) {
            if (uojVar instanceof uod) {
                ((uod) uojVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.e.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        a(activity);
        for (uoj uojVar : this.a) {
            if (uojVar instanceof uoe) {
                ((uoe) uojVar).c(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            b();
        }
        this.k = activity;
        for (uoj uojVar : this.a) {
            if (uojVar instanceof uof) {
                ((uof) uojVar).a();
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
        for (uoj uojVar : this.a) {
            if (uojVar instanceof uoi) {
                ((uoi) uojVar).a();
            }
        }
        if (i >= 20 && this.k != null) {
            c(false, this.k);
        }
        this.k = null;
    }
}
