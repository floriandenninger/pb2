package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rja implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ EventParcel c;
    final /* synthetic */ rjj d;

    public rja(rjj rjjVar, AppMetadata appMetadata, boolean z, EventParcel eventParcel) {
        this.d = rjjVar;
        this.a = appMetadata;
        this.b = z;
        this.c = eventParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar = this.d;
        rfg rfgVar = rjjVar.c;
        if (rfgVar == null) {
            rjjVar.aF().c.a("Discarding data. Failed to send event to service");
        } else {
            rjjVar.v(rfgVar, this.b ? null : this.c, this.a);
            this.d.t();
        }
    }
}
