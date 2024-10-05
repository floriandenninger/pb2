package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class riw implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ rjj c;

    public riw(rjj rjjVar, AppMetadata appMetadata, Bundle bundle) {
        this.c = rjjVar;
        this.a = appMetadata;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar = this.c;
        rfg rfgVar = rjjVar.c;
        if (rfgVar != null) {
            try {
                rfgVar.p(this.b, this.a);
                return;
            } catch (RemoteException e) {
                this.c.aF().c.b("Failed to send default event parameters to service", e);
                return;
            }
        }
        rjjVar.aF().c.a("Failed to send default event parameters to service");
    }
}
