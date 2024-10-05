package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdl extends qsg {
    public qdl(Context context, Looper looper, qrz qrzVar, qpj qpjVar, qqp qqpVar) {
        super(context, looper, 224, qrzVar, qpjVar, qqpVar);
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        if (queryLocalInterface instanceof qdo) {
            return (qdo) queryLocalInterface;
        }
        return new qdn(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final void f(String str) {
        String valueOf = String.valueOf(str);
        Log.w("GoogleAuthSvcClientImpl", valueOf.length() != 0 ? "GoogleAuthServiceClientImpl disconnected with reason: ".concat(valueOf) : new String("GoogleAuthServiceClientImpl disconnected with reason: "));
        super.f(str);
    }

    @Override // defpackage.qrx
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return new Feature[]{qcv.b, qcv.c, qcv.a};
    }
}
