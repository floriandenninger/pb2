package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class roj extends qsg {
    public roj(Context context, Looper looper, qrz qrzVar, qpj qpjVar, qqp qqpVar) {
        super(context, looper, 285, qrzVar, qpjVar, qqpVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.potokens.internal.IPoTokensService");
        if (queryLocalInterface instanceof rof) {
            return (rof) queryLocalInterface;
        }
        return new rof(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.potokens.internal.IPoTokensService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.potokens.service.START";
    }

    @Override // defpackage.qrx
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return rod.b;
    }
}
