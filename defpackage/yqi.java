package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yqi {
    public static final amxj a = amxj.l("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker");
    public final yqh b = new yqh();

    public final void a(Application application) {
        application.registerActivityLifecycleCallbacks(this.b);
        application.registerComponentCallbacks(this.b);
    }

    public final void b(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.b);
        application.unregisterComponentCallbacks(this.b);
    }

    public final void c(yqd yqdVar) {
        yqdVar.getClass();
        this.b.a.add(yqdVar);
    }

    public final void d(yqd yqdVar) {
        yqdVar.getClass();
        this.b.a.remove(yqdVar);
    }
}
