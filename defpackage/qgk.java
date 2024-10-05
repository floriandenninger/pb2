package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgk extends ecp implements qgl {
    public qgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // defpackage.qgl
    public final int a() {
        Parcel po = po(17, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // defpackage.qgl
    public final int f() {
        Parcel po = po(18, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // defpackage.qgl
    public final qvf g() {
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

    @Override // defpackage.qgl
    public final void h(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(13, pn);
    }

    @Override // defpackage.qgl
    public final boolean i() {
        Parcel po = po(5, pn());
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.qgl
    public final boolean j() {
        Parcel po = po(9, pn());
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.qgl
    public final void k() {
        Parcel pn = pn();
        pn.writeInt(2153);
        pp(15, pn);
    }

    @Override // defpackage.qgl
    public final void l() {
        Parcel pn = pn();
        pn.writeInt(2151);
        pp(12, pn);
    }
}
