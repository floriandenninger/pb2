package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahm implements Runnable {
    final /* synthetic */ Activity a;

    public ahm(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isFinishing() || ahv.b(this.a)) {
            return;
        }
        this.a.recreate();
    }
}
