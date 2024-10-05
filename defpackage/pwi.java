package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwi extends ecq implements pwj {
    private final Object a;
    private final pse b;

    public pwi(pse pseVar, Object obj, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.b = pseVar;
        this.a = obj;
    }

    public pwi() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        if (i == 1) {
            pse pseVar = this.b;
            if (pseVar != null && (obj = this.a) != null) {
                dwq dwqVar = (dwq) pseVar;
                dws dwsVar = dwqVar.a;
                dwsVar.mInterstitialAd = (qbl) obj;
                dwsVar.mInterstitialAd.a(new pul(dwqVar.b));
                dwqVar.b.l();
            }
        } else {
            if (i != 2) {
                return false;
            }
            AdErrorParcel adErrorParcel = (AdErrorParcel) ecr.a(parcel, AdErrorParcel.CREATOR);
            pse pseVar2 = this.b;
            if (pseVar2 != null) {
                pseVar2.a(adErrorParcel.b());
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
