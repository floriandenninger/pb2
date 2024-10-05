package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnp extends rmz {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnp(qof qofVar, String str, int i) {
        super(qofVar);
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return new rno(status);
    }

    @Override // defpackage.qpb
    protected final /* bridge */ /* synthetic */ void c(qnq qnqVar) {
        qsq qsqVar;
        rnk rnkVar = (rnk) qnqVar;
        String str = this.a;
        int i = this.b;
        rnh rnhVar = new rnh(this);
        qsq qsqVar2 = null;
        try {
            rnd p = rnkVar.p();
            Parcel pn = p.pn();
            ecr.i(pn, rnhVar);
            pn.writeString(str);
            pn.writeString(null);
            pn.writeInt(i);
            pn.writeInt(1);
            Parcel po = p.po(505, pn);
            IBinder readStrongBinder = po.readStrongBinder();
            if (readStrongBinder == null) {
                qsqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                if (queryLocalInterface instanceof qsq) {
                    qsqVar = (qsq) queryLocalInterface;
                } else {
                    qsqVar = new qsq(readStrongBinder);
                }
            }
            po.recycle();
            qsqVar2 = qsqVar;
        } catch (RemoteException unused) {
            rnhVar.b(8, null, null, null);
        }
        synchronized (this.f) {
            this.j = qsqVar2;
        }
    }
}
