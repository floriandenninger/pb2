package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pyy {
    public final pyx a;

    public pyy(pyx pyxVar) {
        qvf qvdVar;
        new pup();
        this.a = pyxVar;
        Context context = null;
        try {
            Parcel po = pyxVar.po(9, pyxVar.pn());
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
            context = (Context) qve.b(qvdVar);
        } catch (RemoteException | NullPointerException e) {
            qbi.d(e);
        }
        if (context != null) {
            puy puyVar = new puy(context);
            try {
                pyx pyxVar2 = this.a;
                qvf a = qve.a(puyVar);
                Parcel pn = pyxVar2.pn();
                ecr.i(pn, a);
                Parcel po2 = pyxVar2.po(10, pn);
                ecr.j(po2);
                po2.recycle();
            } catch (RemoteException e2) {
                qbi.d(e2);
            }
        }
    }
}
