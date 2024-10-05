package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qea extends qsg {
    private final Bundle a;

    public qea(Context context, Looper looper, qrz qrzVar, qdz qdzVar, qpj qpjVar, qqp qqpVar) {
        super(context, looper, 16, qrzVar, qpjVar, qqpVar);
        Bundle bundle;
        if (qdzVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(qdzVar.b);
        }
        this.a = bundle;
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof qec) {
            return (qec) queryLocalInterface;
        }
        return new qec(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.qrx
    protected final Bundle i() {
        return this.a;
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final boolean j() {
        qrz qrzVar = this.H;
        Account account = qrzVar.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((aoae) qrzVar.d.get(qdy.a)) == null) {
            return !qrzVar.b.isEmpty();
        }
        throw null;
    }
}
