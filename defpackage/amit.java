package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amit implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Application.ActivityLifecycleCallbacks a;
    final /* synthetic */ amiu b;

    public amit(amiu amiuVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = amiuVar;
        this.a = activityLifecycleCallbacks;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (amjw.o()) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        amir a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"));
        try {
            this.a.onActivityCreated(activity, bundle);
            amjw.i(a);
        } catch (Throwable th) {
            try {
                amjw.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (amjw.o()) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        amir a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"));
        try {
            this.a.onActivityDestroyed(activity);
            amjw.i(a);
        } catch (Throwable th) {
            try {
                amjw.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (amjw.o()) {
            this.a.onActivityPaused(activity);
            return;
        }
        amir a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"));
        try {
            this.a.onActivityPaused(activity);
            amjw.i(a);
        } catch (Throwable th) {
            try {
                amjw.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (amjw.o()) {
            this.a.onActivityResumed(activity);
            return;
        }
        amir a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"));
        try {
            this.a.onActivityResumed(activity);
            amjw.i(a);
        } catch (Throwable th) {
            try {
                amjw.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (amjw.o()) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        amir a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"));
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
            amjw.i(a);
        } catch (Throwable th) {
            try {
                amjw.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (amjw.o()) {
            this.a.onActivityStarted(activity);
            return;
        }
        amir a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"));
        try {
            this.a.onActivityStarted(activity);
            amjw.i(a);
        } catch (Throwable th) {
            try {
                amjw.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (amjw.o()) {
            this.a.onActivityStopped(activity);
            return;
        }
        amir a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"));
        try {
            this.a.onActivityStopped(activity);
            amjw.i(a);
        } catch (Throwable th) {
            try {
                amjw.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
