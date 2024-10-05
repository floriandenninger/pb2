package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eat implements eau {
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;
    private final /* synthetic */ int c;

    public eat(Activity activity, Bundle bundle, int i) {
        this.c = i;
        this.a = activity;
        this.b = bundle;
    }

    @Override // defpackage.eau
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (this.c != 0) {
            activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
        } else {
            activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.b);
        }
    }
}
