package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rou extends qsg implements rop {
    public final qrz a;
    public final Integer b;
    private final boolean c;
    private final Bundle d;

    public rou(Context context, Looper looper, qrz qrzVar, Bundle bundle, qod qodVar, qoe qoeVar) {
        super(context, looper, 44, qrzVar, qodVar, qoeVar);
        this.c = true;
        this.a = qrzVar;
        this.d = bundle;
        this.b = qrzVar.h;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof ros) {
            return (ros) queryLocalInterface;
        }
        return new ros(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.qrx
    protected final Bundle i() {
        if (!this.q.getPackageName().equals(this.a.e)) {
            this.d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.a.e);
        }
        return this.d;
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final boolean j() {
        return this.c;
    }
}
