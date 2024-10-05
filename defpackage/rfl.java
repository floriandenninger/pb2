package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfl extends qrx {
    public rfl(Context context, Looper looper, qro qroVar, qrp qrpVar) {
        super(context, looper, 93, qroVar, qrpVar);
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof rfg) {
            return (rfg) queryLocalInterface;
        }
        return new rfe(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.measurement.START";
    }
}
