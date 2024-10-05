package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eas implements eau {
    final /* synthetic */ Activity a;
    private final /* synthetic */ int b;

    public eas(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    @Override // defpackage.eau
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        int i = this.b;
        if (i == 0) {
            activityLifecycleCallbacks.onActivityResumed(this.a);
            return;
        }
        if (i == 1) {
            activityLifecycleCallbacks.onActivityStarted(this.a);
            return;
        }
        if (i == 2) {
            activityLifecycleCallbacks.onActivityPaused(this.a);
        } else if (i != 3) {
            activityLifecycleCallbacks.onActivityDestroyed(this.a);
        } else {
            activityLifecycleCallbacks.onActivityStopped(this.a);
        }
    }
}
