package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class riu implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rjj b;
    private final /* synthetic */ int c;

    public riu(rjj rjjVar, AppMetadata appMetadata, int i) {
        this.c = i;
        this.b = rjjVar;
        this.a = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            rjj rjjVar = this.b;
            rfg rfgVar = rjjVar.c;
            if (rfgVar != null) {
                try {
                    rfgVar.j(this.a);
                    this.b.i().s();
                    this.b.v(rfgVar, null, this.a);
                    this.b.t();
                    return;
                } catch (RemoteException e) {
                    this.b.aF().c.b("Failed to send app launch to the service", e);
                    return;
                }
            }
            rjjVar.aF().c.a("Discarding data. Failed to send app launch");
            return;
        }
        if (i == 1) {
            rjj rjjVar2 = this.b;
            rfg rfgVar2 = rjjVar2.c;
            if (rfgVar2 != null) {
                try {
                    rfgVar2.l(this.a);
                } catch (RemoteException e2) {
                    this.b.aF().c.b("Failed to reset data on the service: remote exception", e2);
                }
                this.b.t();
                return;
            }
            rjjVar2.aF().c.a("Failed to reset data on the service: not connected to service");
            return;
        }
        if (i != 2) {
            rjj rjjVar3 = this.b;
            rfg rfgVar3 = rjjVar3.c;
            if (rfgVar3 != null) {
                try {
                    rfgVar3.n(this.a);
                    this.b.t();
                    return;
                } catch (RemoteException e3) {
                    this.b.aF().c.b("Failed to send consent settings to the service", e3);
                    return;
                }
            }
            rjjVar3.aF().c.a("Failed to send consent settings to service");
            return;
        }
        rjj rjjVar4 = this.b;
        rfg rfgVar4 = rjjVar4.c;
        if (rfgVar4 != null) {
            try {
                rfgVar4.q(this.a);
                this.b.t();
                return;
            } catch (RemoteException e4) {
                this.b.aF().c.b("Failed to send measurementEnabled to the service", e4);
                return;
            }
        }
        rjjVar4.aF().c.a("Failed to send measurementEnabled to service");
    }
}
