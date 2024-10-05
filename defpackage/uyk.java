package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uyk implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ azrw c;
    final /* synthetic */ ammv d;

    public uyk(Application application, azrw azrwVar, ammv ammvVar) {
        this.b = application;
        this.c = azrwVar;
        this.d = ammvVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.b.unregisterActivityLifecycleCallbacks(this);
        if (this.a) {
            return;
        }
        this.a = true;
        Iterator it = ((Set) this.c.get()).iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((amml) ((amna) this.d).a).apply((Application.ActivityLifecycleCallbacks) it.next());
            this.b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        amkq.N(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        amkq.N(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        amkq.N(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        amkq.N(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        amkq.N(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        amkq.N(this.a);
    }
}
