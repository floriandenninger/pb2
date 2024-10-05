package defpackage;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class riv implements Runnable {
    final /* synthetic */ rij a;
    final /* synthetic */ rjj b;

    public riv(rjj rjjVar, rij rijVar) {
        this.b = rjjVar;
        this.a = rijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar = this.b;
        rfg rfgVar = rjjVar.c;
        if (rfgVar == null) {
            rjjVar.aF().c.a("Failed to send current screen to service");
            return;
        }
        try {
            rij rijVar = this.a;
            if (rijVar != null) {
                rfgVar.o(rijVar.c, rijVar.a, rijVar.b, rjjVar.I().getPackageName());
            } else {
                rfgVar.o(0L, null, null, rjjVar.I().getPackageName());
            }
            this.b.t();
        } catch (RemoteException e) {
            this.b.aF().c.b("Failed to send current screen to the service", e);
        }
    }
}
