package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qti extends qsg {
    public qti(Context context, Looper looper, qrz qrzVar, qpj qpjVar, qqp qqpVar) {
        super(context, looper, 270, qrzVar, qpjVar, qqpVar);
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof qte) {
            return (qte) queryLocalInterface;
        }
        return new qte(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.qrx
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return qlx.b;
    }

    @Override // defpackage.qrx
    protected final Bundle i() {
        return new Bundle();
    }
}
