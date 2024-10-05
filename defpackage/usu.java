package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usu implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ usw b;

    public usu(usw uswVar, Application application) {
        this.b = uswVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        uso usoVar = this.b.n.b == null ? this.b.n : this.b.o;
        usoVar.a = activity.getClass().getSimpleName();
        usoVar.b = Long.valueOf(elapsedRealtime);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        uso usoVar = this.b.o.b == null ? this.b.n : this.b.o;
        if (usoVar.d == null) {
            usoVar.d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View findViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new uss(this, findViewById, null));
            viewTreeObserver.addOnPreDrawListener(new ust(this, findViewById));
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        uso usoVar = this.b.o.b == null ? this.b.n : this.b.o;
        if (usoVar.c == null) {
            usoVar.c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
