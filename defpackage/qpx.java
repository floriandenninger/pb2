package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpx implements qrs {
    public final qnv a;
    public final qox b;
    final /* synthetic */ qpy e;
    public qsp f = null;
    public Set c = null;
    public boolean d = false;

    public qpx(qpy qpyVar, qnv qnvVar, qox qoxVar) {
        this.e = qpyVar;
        this.a = qnvVar;
        this.b = qoxVar;
    }

    @Override // defpackage.qrs
    public final void a(ConnectionResult connectionResult) {
        this.e.o.post(new qpw(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        qpu qpuVar = (qpu) this.e.l.get(this.b);
        if (qpuVar != null) {
            qip.ar(qpuVar.l.o);
            qnv qnvVar = qpuVar.b;
            String name = qnvVar.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            qnvVar.f(sb.toString());
            qpuVar.i(connectionResult);
        }
    }

    public final void c() {
        qsp qspVar;
        if (!this.d || (qspVar = this.f) == null) {
            return;
        }
        this.a.B(qspVar, this.c);
    }
}
