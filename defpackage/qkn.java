package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qkn extends qsg {
    private final CastDevice a;
    private final Bundle b;
    private final String c;

    static {
        new qkw("CastClientImplCxless");
    }

    public qkn(Context context, Looper looper, qrz qrzVar, CastDevice castDevice, Bundle bundle, String str, qod qodVar, qoe qoeVar) {
        super(context, looper, 10, qrzVar, qodVar, qoeVar);
        this.a = castDevice;
        this.b = bundle;
        this.c = str;
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 19390000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof qkr) {
            return (qkr) queryLocalInterface;
        }
        return new qkr(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return qer.m;
    }

    @Override // defpackage.qrx
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        this.a.c(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.c);
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final void l() {
        try {
            ((qkr) D()).a();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.l();
        }
    }
}
