package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rjh implements Runnable {
    final /* synthetic */ rji a;
    private final /* synthetic */ int b;

    public rjh(rji rjiVar, int i) {
        this.b = i;
        this.a = rjiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            rjj rjjVar = this.a.c;
            rjjVar.c = null;
            rjjVar.q();
        } else {
            rjj rjjVar2 = this.a.c;
            Context I = rjjVar2.I();
            this.a.c.P();
            rjjVar2.s(new ComponentName(I, "com.google.android.gms.measurement.AppMeasurementService"));
        }
    }
}
