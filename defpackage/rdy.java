package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdy implements Runnable {
    final /* synthetic */ rci a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ AppMeasurementDynamiteService e;

    public rdy(AppMeasurementDynamiteService appMeasurementDynamiteService, rci rciVar, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = rciVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj n = this.e.a.n();
        rci rciVar = this.a;
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        n.n();
        n.a();
        n.u(new riq(n, str, str2, n.e(false), z, rciVar));
    }
}
