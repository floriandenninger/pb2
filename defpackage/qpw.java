package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qpw implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ qpx b;

    public qpw(qpx qpxVar, ConnectionResult connectionResult) {
        this.b = qpxVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qpx qpxVar = this.b;
        qpu qpuVar = (qpu) qpxVar.e.l.get(qpxVar.b);
        if (qpuVar == null) {
            return;
        }
        if (this.a.c()) {
            qpx qpxVar2 = this.b;
            qpxVar2.d = true;
            if (qpxVar2.a.j()) {
                this.b.c();
                return;
            }
            try {
                qnv qnvVar = this.b.a;
                qnvVar.B(null, qnvVar.u());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                this.b.a.f("Failed to get service from broker.");
                qpuVar.i(new ConnectionResult(10));
                return;
            }
        }
        qpuVar.i(this.a);
    }
}
