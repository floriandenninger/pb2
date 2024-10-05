package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxz {
    boolean a;
    qya b;

    public qxz(Context context, String str) {
        qya qyaVar;
        try {
            try {
                try {
                    IBinder d = qvu.e(context, qvu.a, "com.google.android.gms.ads.dynamite").d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        qyaVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof qya) {
                            qyaVar = (qya) queryLocalInterface;
                        } else {
                            qyaVar = new qya(d);
                        }
                    }
                    this.b = qyaVar;
                    qvf a = qve.a(context);
                    qya qyaVar2 = this.b;
                    Parcel pn = qyaVar2.pn();
                    ecr.i(pn, a);
                    pn.writeString(str);
                    pn.writeString(null);
                    qyaVar2.pp(8, pn);
                    this.a = true;
                } catch (Exception e) {
                    throw new qxq(e);
                }
            } catch (RemoteException | NullPointerException | SecurityException | qxq unused) {
            }
        } catch (Exception e2) {
            throw new qxq(e2);
        }
    }

    public final qxy a(byte[] bArr) {
        return new qxy(this, bArr);
    }
}
