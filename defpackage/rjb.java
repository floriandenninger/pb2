package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjb implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ConditionalUserPropertyParcel c;
    final /* synthetic */ rjj d;

    public rjb(rjj rjjVar, AppMetadata appMetadata, boolean z, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.d = rjjVar;
        this.a = appMetadata;
        this.b = z;
        this.c = conditionalUserPropertyParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar = this.d;
        rfg rfgVar = rjjVar.c;
        if (rfgVar == null) {
            rjjVar.aF().c.a("Discarding data. Failed to send conditional user property to service");
        } else {
            rjjVar.v(rfgVar, this.b ? null : this.c, this.a);
            this.d.t();
        }
    }
}
