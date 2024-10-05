package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrv extends qrn {
    public final IBinder g;
    final /* synthetic */ qrx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrv(qrx qrxVar, int i, IBinder iBinder, Bundle bundle) {
        super(qrxVar, i, bundle);
        this.h = qrxVar;
        this.g = iBinder;
    }

    @Override // defpackage.qrn
    protected final void a(ConnectionResult connectionResult) {
        qrp qrpVar = this.h.z;
        if (qrpVar != null) {
            qrpVar.c(connectionResult);
        }
        this.h.q();
    }

    @Override // defpackage.qrn
    protected final boolean c() {
        try {
            IBinder iBinder = this.g;
            qip.an(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                String c = this.h.c();
                StringBuilder sb = new StringBuilder(c.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(c);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface b = this.h.b(this.g);
            if (b == null || !(this.h.J(2, 4, b) || this.h.J(3, 4, b))) {
                return false;
            }
            qrx qrxVar = this.h;
            qrxVar.C = null;
            qrxVar.r();
            qro qroVar = this.h.y;
            if (qroVar == null) {
                return true;
            }
            qroVar.b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
