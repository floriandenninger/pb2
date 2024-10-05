package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fda extends fym {
    final /* synthetic */ azrw a;
    final /* synthetic */ fdc b;

    public fda(fdc fdcVar, azrw azrwVar) {
        this.b = fdcVar;
        this.a = azrwVar;
    }

    @Override // defpackage.fym, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ((acso) this.a.get()).e();
    }

    @Override // defpackage.fym, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.b.a.j(fcs.class)) {
            this.b.b.d(new fct(activity.getIntent()));
        }
    }
}
