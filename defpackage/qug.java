package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qug extends qsg {
    public qug(Context context, Looper looper, qpj qpjVar, qqp qqpVar) {
        super(context, looper, 25, qrz.a(context), qpjVar, qqpVar);
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        if (queryLocalInterface instanceof qup) {
            return (qup) queryLocalInterface;
        }
        return new qup(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
