package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rjf implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ rji b;

    public rjf(rji rjiVar, ComponentName componentName) {
        this.b = rjiVar;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.s(this.a);
    }
}
