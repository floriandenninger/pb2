package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apb extends anz {
    final /* synthetic */ apc a;

    public apb(apc apcVar) {
        this.a = apcVar;
    }

    @Override // defpackage.anz, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = ape.b;
            ((ape) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
        }
    }

    @Override // defpackage.anz, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        apc apcVar = this.a;
        int i = apcVar.c - 1;
        apcVar.c = i;
        if (i == 0) {
            apcVar.e.postDelayed(apcVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new apa(this));
    }

    @Override // defpackage.anz, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        r2.b--;
        this.a.c();
    }
}
