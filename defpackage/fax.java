package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fax extends fym {
    final /* synthetic */ fay a;

    public fax(fay fayVar) {
        this.a = fayVar;
    }

    @Override // defpackage.fym, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        fay fayVar = this.a;
        if (fayVar.b == -1) {
            fayVar.a();
        }
    }
}
