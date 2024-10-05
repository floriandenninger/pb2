package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktc implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public Boolean a;
    private volatile Activity b;

    private final void a(Activity activity) {
        b(Boolean.valueOf(uon.c(activity.getApplicationContext())));
    }

    private final void b(Boolean bool) {
        if (bool.equals(this.a)) {
            String.valueOf(String.valueOf(bool)).length();
            int i = akso.a;
        } else {
            this.a = bool;
            String.valueOf(String.valueOf(bool)).length();
            int i2 = akso.a;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.b = null;
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.b = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.b = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.b = null;
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.b = activity;
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
        if (i >= 20 && this.b != null) {
            b(false);
        }
        this.b = null;
    }
}
