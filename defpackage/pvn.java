package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvn extends qvh {
    private qbb a;

    public pvn() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final pwt a(Context context, AdSizeParcel adSizeParcel, String str, pzu pzuVar, int i) {
        pwt pwrVar;
        pwt pwrVar2;
        pyi.b(context);
        if (((Boolean) pyi.y.e()).booleanValue()) {
            try {
                IBinder a = ((pwu) qar.c(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", pvq.b)).a(qve.a(context), adSizeParcel, str, pzuVar, i);
                if (a == null) {
                    return null;
                }
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof pwt) {
                    pwrVar = (pwt) queryLocalInterface;
                } else {
                    pwrVar = new pwr(a);
                }
                return pwrVar;
            } catch (RemoteException | NullPointerException | qbk e) {
                qbb a2 = qaz.a(context);
                this.a = a2;
                a2.b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                qbi.i("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder a3 = ((pwu) d(context)).a(qve.a(context), adSizeParcel, str, pzuVar, i);
            if (a3 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = a3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof pwt) {
                pwrVar2 = (pwt) queryLocalInterface2;
            } else {
                pwrVar2 = new pwr(a3);
            }
            return pwrVar2;
        } catch (RemoteException | qvg unused) {
            int i2 = qbi.b;
            return null;
        }
    }

    @Override // defpackage.qvh
    protected final /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof pwu) {
            return (pwu) queryLocalInterface;
        }
        return new pwu(iBinder);
    }
}
