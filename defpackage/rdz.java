package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdz implements Runnable {
    final /* synthetic */ AppMeasurementDynamiteService a;
    final /* synthetic */ rec b;

    public rdz(AppMeasurementDynamiteService appMeasurementDynamiteService, rec recVar, byte[] bArr) {
        this.a = appMeasurementDynamiteService;
        this.b = recVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.k().Z(this.b);
    }
}
