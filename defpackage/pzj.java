package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzj extends ecq implements pzk {
    private final dwr a;

    public pzj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        pzl pzlVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            pzlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            if (queryLocalInterface instanceof pzl) {
                pzlVar = (pzl) queryLocalInterface;
            } else {
                pzlVar = new pzl(readStrongBinder);
            }
        }
        dwr dwrVar = this.a;
        dwrVar.b.a(dwrVar.a, new qby(new pzm(pzlVar), null));
        parcel2.writeNoException();
        return true;
    }

    public pzj(dwr dwrVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.a = dwrVar;
    }
}
