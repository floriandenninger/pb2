package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uwr implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ anic b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;

    public uwr(Runnable runnable, anic anicVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = anicVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        ure.h(this.b.schedule(this, this.c, this.d));
    }
}
