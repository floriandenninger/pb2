package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rit implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rci b;
    final /* synthetic */ rjj c;

    public rit(rjj rjjVar, AppMetadata appMetadata, rci rciVar) {
        this.c = rjjVar;
        this.a = appMetadata;
        this.b = rciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj rjjVar;
        String str = null;
        try {
            try {
                if (this.c.M().b().h()) {
                    rjj rjjVar2 = this.c;
                    rfg rfgVar = rjjVar2.c;
                    if (rfgVar == null) {
                        rjjVar2.aF().c.a("Failed to get app instance id");
                        rjjVar = this.c;
                    } else {
                        str = rfgVar.a(this.a);
                        if (str != null) {
                            this.c.j().B(str);
                            this.c.M().f.b(str);
                        }
                        this.c.t();
                        rjjVar = this.c;
                    }
                } else {
                    this.c.aF().h.a("Analytics storage consent denied; will not get app instance id");
                    this.c.j().B(null);
                    this.c.M().f.b(null);
                    rjjVar = this.c;
                }
            } catch (RemoteException e) {
                this.c.aF().c.b("Failed to get app instance id", e);
                rjjVar = this.c;
            }
            rjjVar.N().Y(this.b, str);
        } catch (Throwable th) {
            this.c.N().Y(this.b, null);
            throw th;
        }
    }
}
