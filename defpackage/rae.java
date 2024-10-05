package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rae extends qsg {
    public rae(Context context, Looper looper, qod qodVar, qoe qoeVar) {
        super(context, looper, 121, qrz.a(context), qodVar, qoeVar);
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12200000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        if (queryLocalInterface instanceof rad) {
            return (rad) queryLocalInterface;
        }
        return new rad(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.instantapps.START";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return new Feature[]{raa.a, raa.b, raa.c, raa.d};
    }
}
