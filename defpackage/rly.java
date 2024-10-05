package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rly extends qsg {
    public rly(Context context, Looper looper, qrz qrzVar, qod qodVar, qoe qoeVar) {
        super(context, looper, 158, qrzVar, qodVar, qoeVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
        if (queryLocalInterface instanceof rlx) {
            return (rlx) queryLocalInterface;
        }
        return new rlx(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.mobiledataplan.service.START";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return rlm.c;
    }
}
