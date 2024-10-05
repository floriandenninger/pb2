package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anyj implements Application.ActivityLifecycleCallbacks {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent == null || !this.a.add(intent) || (extras = intent.getExtras()) == null) {
            return;
        }
        Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
        if (aocz.aa(bundle2)) {
            if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc"))) {
                anti antiVar = (anti) antc.b().f(anti.class);
                if (antiVar != null) {
                    String string = bundle2.getString("google.c.a.c_id");
                    antiVar.b(string);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("source", "Firebase");
                    bundle3.putString("medium", "notification");
                    bundle3.putString("campaign", string);
                    antiVar.a("_cmp", bundle3);
                } else {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            }
            aocz.X("_no", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
