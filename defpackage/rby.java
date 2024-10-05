package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rby extends qsg {
    public rby(Context context, Looper looper, qrz qrzVar, qpj qpjVar, qqp qqpVar) {
        super(context, looper, 215, qrzVar, qpjVar, qqpVar);
    }

    @Override // defpackage.qrx
    public final boolean L() {
        return true;
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 19621000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        if (queryLocalInterface instanceof rbu) {
            return (rbu) queryLocalInterface;
        }
        return new rbu(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.mdisync.service.START";
    }

    @Override // defpackage.qrx
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return rbr.c;
    }
}
