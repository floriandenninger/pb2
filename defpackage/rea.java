package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rea implements Runnable {
    final /* synthetic */ rci a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    public rea(AppMeasurementDynamiteService appMeasurementDynamiteService, rci rciVar, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = rciVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj n = this.d.a.n();
        rci rciVar = this.a;
        String str = this.b;
        String str2 = this.c;
        n.n();
        n.a();
        n.u(new rjd(n, str, str2, n.e(false), rciVar));
    }
}
