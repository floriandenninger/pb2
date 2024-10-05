package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rbi extends qsg {
    protected final rbh a;
    private final String b;

    public rbi(Context context, Looper looper, qod qodVar, qoe qoeVar, qrz qrzVar) {
        super(context, looper, 23, qrzVar, qodVar, qoeVar);
        this.a = new rbh(this);
        this.b = "locationServices";
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 11717000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof rbm) {
            return (rbm) queryLocalInterface;
        }
        return new rbm(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return ram.f;
    }

    @Override // defpackage.qrx
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.b);
        return bundle;
    }
}
