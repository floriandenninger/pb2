package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsr extends ecp implements qst {
    public qsr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.qst
    public final qvf f() {
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

    @Override // defpackage.qst
    public final int pV() {
        Parcel po = po(2, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }
}
