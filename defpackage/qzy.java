package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qzy extends qsg {
    public qzy(Context context, Looper looper, qrz qrzVar, qod qodVar, qoe qoeVar) {
        super(context, looper, 50, qrzVar, qodVar, qoeVar);
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        if (queryLocalInterface instanceof qzx) {
            return (qzx) queryLocalInterface;
        }
        return new qzx(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.herrevad.services.LightweightNetworkQualityAndroidService.START";
    }
}
