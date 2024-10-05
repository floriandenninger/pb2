package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgc extends ecp implements qgd {
    public qgc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // defpackage.qgd
    public final qgh a() {
        qgh qggVar;
        Parcel po = po(6, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qggVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            if (queryLocalInterface instanceof qgh) {
                qggVar = (qgh) queryLocalInterface;
            } else {
                qggVar = new qgg(readStrongBinder);
            }
        }
        po.recycle();
        return qggVar;
    }

    @Override // defpackage.qgd
    public final qgn f() {
        qgn qgmVar;
        Parcel po = po(5, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qgmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (queryLocalInterface instanceof qgn) {
                qgmVar = (qgn) queryLocalInterface;
            } else {
                qgmVar = new qgm(readStrongBinder);
            }
        }
        po.recycle();
        return qgmVar;
    }

    @Override // defpackage.qgd
    public final boolean g() {
        Parcel po = po(12, pn());
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }
}
