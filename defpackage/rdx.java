package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdx implements Runnable {
    final /* synthetic */ rci a;
    final /* synthetic */ EventParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    public rdx(AppMeasurementDynamiteService appMeasurementDynamiteService, rci rciVar, EventParcel eventParcel, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = rciVar;
        this.b = eventParcel;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj n = this.d.a.n();
        rci rciVar = this.a;
        EventParcel eventParcel = this.b;
        String str = this.c;
        n.n();
        n.a();
        if (n.N().ax() == 0) {
            n.u(new riy(n, eventParcel, str, rciVar));
        } else {
            n.aF().f.a("Not bundling data. Service unavailable or out of date");
            n.N().V(rciVar, new byte[0]);
        }
    }
}
