package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apa extends anz {
    final /* synthetic */ apb a;

    public apa(apb apbVar) {
        this.a = apbVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.a.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.a.a.b();
    }
}
