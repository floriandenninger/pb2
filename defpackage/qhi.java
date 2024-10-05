package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhi extends ecp implements qhj {
    public qhi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // defpackage.qhj
    public final qgd a(qvf qvfVar, CastOptions castOptions, qhl qhlVar, Map map) {
        qgd qgcVar;
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        ecr.g(pn, castOptions);
        ecr.i(pn, qhlVar);
        pn.writeMap(map);
        Parcel po = po(1, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qgcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof qgd) {
                qgcVar = (qgd) queryLocalInterface;
            } else {
                qgcVar = new qgc(readStrongBinder);
            }
        }
        po.recycle();
        return qgcVar;
    }

    @Override // defpackage.qhj
    public final qgf f(CastOptions castOptions, qvf qvfVar, qgb qgbVar) {
        qgf qgeVar;
        Parcel pn = pn();
        ecr.g(pn, castOptions);
        ecr.i(pn, qvfVar);
        ecr.i(pn, qgbVar);
        Parcel po = po(3, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qgeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof qgf) {
                qgeVar = (qgf) queryLocalInterface;
            } else {
                qgeVar = new qge(readStrongBinder);
            }
        }
        po.recycle();
        return qgeVar;
    }

    @Override // defpackage.qhj
    public final qgj g(qvf qvfVar, qvf qvfVar2, qvf qvfVar3) {
        qgj qgiVar;
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        ecr.i(pn, qvfVar2);
        ecr.i(pn, qvfVar3);
        Parcel po = po(5, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qgiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof qgj) {
                qgiVar = (qgj) queryLocalInterface;
            } else {
                qgiVar = new qgi(readStrongBinder);
            }
        }
        po.recycle();
        return qgiVar;
    }

    @Override // defpackage.qhj
    public final qgl h(String str, String str2, qgq qgqVar) {
        qgl qgkVar;
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.i(pn, qgqVar);
        Parcel po = po(2, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qgkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof qgl) {
                qgkVar = (qgl) queryLocalInterface;
            } else {
                qgkVar = new qgk(readStrongBinder);
            }
        }
        po.recycle();
        return qgkVar;
    }

    @Override // defpackage.qhj
    public final qjp i(qvf qvfVar, qjq qjqVar, int i, int i2) {
        qjp qjoVar;
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        ecr.i(pn, qjqVar);
        pn.writeInt(i);
        pn.writeInt(i2);
        ecr.e(pn, false);
        pn.writeLong(2097152L);
        pn.writeInt(5);
        pn.writeInt(333);
        pn.writeInt(10000);
        Parcel po = po(6, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qjoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof qjp) {
                qjoVar = (qjp) queryLocalInterface;
            } else {
                qjoVar = new qjo(readStrongBinder);
            }
        }
        po.recycle();
        return qjoVar;
    }
}
