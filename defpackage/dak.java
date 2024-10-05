package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dak implements ComponentCallbacks2, dao {
    public boolean a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());
    private boolean c;

    @Override // defpackage.dao
    public final void a(Activity activity) {
        if (this.b.add(activity)) {
            ddn.j();
            if (!this.c) {
                activity.getApplication().registerComponentCallbacks(this);
                this.c = true;
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(new daj(this, cyd.a()));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 20) {
            this.a = false;
            cyd a = cyd.a();
            ddn.j();
            a.d.set(false);
        }
    }
}
