package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qru implements qrs {
    final /* synthetic */ qrx a;

    public qru(qrx qrxVar) {
        this.a = qrxVar;
    }

    @Override // defpackage.qrs
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.c()) {
            qrx qrxVar = this.a;
            qrxVar.B(null, qrxVar.F());
        } else {
            qrp qrpVar = this.a.z;
            if (qrpVar != null) {
                qrpVar.c(connectionResult);
            }
        }
    }
}
