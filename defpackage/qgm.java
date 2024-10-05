package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgm extends ecp implements qgn {
    public qgm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // defpackage.qgn
    public final qvf a() {
        qvf qvdVar;
        Parcel po = po(1, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qvdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof qvf) {
                qvdVar = (qvf) queryLocalInterface;
            } else {
                qvdVar = new qvd(readStrongBinder);
            }
        }
        po.recycle();
        return qvdVar;
    }

    @Override // defpackage.qgn
    public final qvf f() {
        qvf qvdVar;
        Parcel po = po(7, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qvdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof qvf) {
                qvdVar = (qvf) queryLocalInterface;
            } else {
                qvdVar = new qvd(readStrongBinder);
            }
        }
        po.recycle();
        return qvdVar;
    }

    @Override // defpackage.qgn
    public final void g(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, true);
        ecr.e(pn, z);
        pp(6, pn);
    }

    @Override // defpackage.qgn
    public final void h(qgo qgoVar) {
        Parcel pn = pn();
        ecr.i(pn, qgoVar);
        pp(2, pn);
    }
}
