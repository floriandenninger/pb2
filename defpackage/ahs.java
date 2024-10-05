package defpackage;

import android.app.Application;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahs implements Runnable {
    final /* synthetic */ Application a;
    final /* synthetic */ ahu b;

    public ahs(Application application, ahu ahuVar) {
        this.a = application;
        this.b = ahuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
