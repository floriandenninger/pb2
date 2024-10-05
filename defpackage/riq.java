package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class riq implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AppMetadata c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rci e;
    final /* synthetic */ rjj f;

    public riq(rjj rjjVar, String str, String str2, AppMetadata appMetadata, boolean z, rci rciVar) {
        this.f = rjjVar;
        this.a = str;
        this.b = str2;
        this.c = appMetadata;
        this.d = z;
        this.e = rciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar;
        Bundle bundle = new Bundle();
        try {
            try {
                rjj rjjVar2 = this.f;
                rfg rfgVar = rjjVar2.c;
                if (rfgVar != null) {
                    bundle = rkm.s(rfgVar.h(this.a, this.b, this.d, this.c));
                    this.f.t();
                    rjjVar = this.f;
                } else {
                    rjjVar2.aF().c.c("Failed to get user properties; not connected to service", this.a, this.b);
                    rjjVar = this.f;
                }
            } catch (RemoteException e) {
                this.f.aF().c.c("Failed to get user properties; remote exception", this.a, e);
                rjjVar = this.f;
            }
            rjjVar.N().U(this.e, bundle);
        } catch (Throwable th) {
            this.f.N().U(this.e, bundle);
            throw th;
        }
    }
}
