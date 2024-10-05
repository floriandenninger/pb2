package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvj extends qrx {
    private final int a;

    public pvj(Context context, Looper looper, qro qroVar, qrp qrpVar, int i) {
        super(context, looper, 116, qroVar, qrpVar);
        this.a = i;
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof qxr) {
            return (qxr) queryLocalInterface;
        }
        return new qxr(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.gass.START";
    }

    public final qxr e() {
        return (qxr) super.D();
    }
}
