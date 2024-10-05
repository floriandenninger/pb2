package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rmp extends qsg {
    public rmp(Context context, Looper looper, qrz qrzVar, qod qodVar, qoe qoeVar) {
        super(context, looper, 160, qrzVar, qodVar, qoeVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
        if (queryLocalInterface instanceof rmg) {
            return (rmg) queryLocalInterface;
        }
        return new rmg(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.mobstore.IMobStoreFileService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.mobstore.service.START";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return qzz.i;
    }
}
