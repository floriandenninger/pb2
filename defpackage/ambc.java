package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ambc implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ambd a;

    public ambc(ambd ambdVar) {
        this.a = ambdVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ambd ambdVar = this.a;
        int i = ambdVar.b + 1;
        ambdVar.b = i;
        if (i == 1) {
            ambdVar.a(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ambd ambdVar = this.a;
        int i = ambdVar.b - 1;
        ambdVar.b = i;
        if (i == 0) {
            ambdVar.a(false);
        }
    }
}
