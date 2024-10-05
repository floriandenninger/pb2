package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqk extends qsg {
    private final AtomicReference a;

    public rqk(Context context, Looper looper, qrz qrzVar, qod qodVar, qoe qoeVar) {
        super(context, looper, 41, qrzVar, qodVar, qoeVar);
        this.a = new AtomicReference();
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (queryLocalInterface instanceof rqh) {
            return (rqh) queryLocalInterface;
        }
        return new rqh(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return rqa.c;
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final void l() {
        try {
            rqg rqgVar = (rqg) this.a.getAndSet(null);
            if (rqgVar != null) {
                rqj rqjVar = new rqj();
                rqh rqhVar = (rqh) D();
                Parcel pn = rqhVar.pn();
                ecr.i(pn, rqgVar);
                ecr.i(pn, rqjVar);
                rqhVar.pp(5, pn);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.l();
    }
}
