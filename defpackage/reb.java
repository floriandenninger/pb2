package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class reb implements Runnable {
    final /* synthetic */ rci a;
    final /* synthetic */ AppMeasurementDynamiteService b;
    private final /* synthetic */ int c;

    public reb(AppMeasurementDynamiteService appMeasurementDynamiteService, rci rciVar, int i) {
        this.c = i;
        this.b = appMeasurementDynamiteService;
        this.a = rciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.b.a.p().S(this.a, this.b.a.u());
            return;
        }
        rjj n = this.b.a.n();
        rci rciVar = this.a;
        n.n();
        n.a();
        n.u(new rit(n, n.e(false), rciVar));
    }
}
