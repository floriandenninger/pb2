package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rjd implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AppMetadata c;
    final /* synthetic */ rci d;
    final /* synthetic */ rjj e;

    public rjd(rjj rjjVar, String str, String str2, AppMetadata appMetadata, rci rciVar) {
        this.e = rjjVar;
        this.a = str;
        this.b = str2;
        this.c = appMetadata;
        this.d = rciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                rjj rjjVar2 = this.e;
                rfg rfgVar = rjjVar2.c;
                if (rfgVar != null) {
                    arrayList = rkm.B(rfgVar.f(this.a, this.b, this.c));
                    this.e.t();
                    rjjVar = this.e;
                } else {
                    rjjVar2.aF().c.c("Failed to get conditional properties; not connected to service", this.a, this.b);
                    rjjVar = this.e;
                }
            } catch (RemoteException e) {
                this.e.aF().c.d("Failed to get conditional properties; remote exception", this.a, this.b, e);
                rjjVar = this.e;
            }
            rjjVar.N().T(this.d, arrayList);
        } catch (Throwable th) {
            this.e.N().T(this.d, arrayList);
            throw th;
        }
    }
}
