package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvr extends pvx {
    final /* synthetic */ Context a;
    final /* synthetic */ pzu b;

    public pvr(Context context, pzu pzuVar) {
        this.a = context;
        this.b = pzuVar;
    }

    @Override // defpackage.pvx
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object b() {
        qas qasVar;
        qvf a = qve.a(this.a);
        try {
            qat qatVar = (qat) qar.c(this.a, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", pvq.a);
            pzu pzuVar = this.b;
            Parcel pn = qatVar.pn();
            ecr.i(pn, a);
            ecr.i(pn, pzuVar);
            pn.writeInt(213880000);
            Parcel po = qatVar.po(1, pn);
            IBinder readStrongBinder = po.readStrongBinder();
            if (readStrongBinder == null) {
                qasVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
                if (queryLocalInterface instanceof qas) {
                    qasVar = (qas) queryLocalInterface;
                } else {
                    qasVar = new qas(readStrongBinder);
                }
            }
            po.recycle();
            return qasVar;
        } catch (RemoteException | NullPointerException | qbk unused) {
            return null;
        }
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object c(pwz pwzVar) {
        qas qasVar;
        qvf a = qve.a(this.a);
        pzu pzuVar = this.b;
        Parcel pn = pwzVar.pn();
        ecr.i(pn, a);
        ecr.i(pn, pzuVar);
        pn.writeInt(213880000);
        Parcel po = pwzVar.po(15, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qasVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof qas) {
                qasVar = (qas) queryLocalInterface;
            } else {
                qasVar = new qas(readStrongBinder);
            }
        }
        po.recycle();
        return qasVar;
    }
}
