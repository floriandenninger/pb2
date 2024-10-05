package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class riy implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ rci c;
    final /* synthetic */ rjj d;

    public riy(rjj rjjVar, EventParcel eventParcel, String str, rci rciVar) {
        this.d = rjjVar;
        this.a = eventParcel;
        this.b = str;
        this.c = rciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar;
        byte[] bArr = null;
        try {
            try {
                rjj rjjVar2 = this.d;
                rfg rfgVar = rjjVar2.c;
                if (rfgVar == null) {
                    rjjVar2.aF().c.a("Discarding data. Failed to send event to service to bundle");
                    rjjVar = this.d;
                } else {
                    bArr = rfgVar.s(this.a, this.b);
                    this.d.t();
                    rjjVar = this.d;
                }
            } catch (RemoteException e) {
                this.d.aF().c.b("Failed to send event to the service to bundle", e);
                rjjVar = this.d;
            }
            rjjVar.N().V(this.c, bArr);
        } catch (Throwable th) {
            this.d.N().V(this.c, bArr);
            throw th;
        }
    }
}
