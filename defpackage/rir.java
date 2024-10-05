package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rir implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ UserAttributeParcel c;
    final /* synthetic */ rjj d;

    public rir(rjj rjjVar, AppMetadata appMetadata, boolean z, UserAttributeParcel userAttributeParcel) {
        this.d = rjjVar;
        this.a = appMetadata;
        this.b = z;
        this.c = userAttributeParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar = this.d;
        rfg rfgVar = rjjVar.c;
        if (rfgVar == null) {
            rjjVar.aF().c.a("Discarding data. Failed to set user property");
        } else {
            rjjVar.v(rfgVar, this.b ? null : this.c, this.a);
            this.d.t();
        }
    }
}
