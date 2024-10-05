package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pxc extends ecq implements pxd {
    private final pul a;

    public pxc(pul pulVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.a = pulVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AdErrorParcel adErrorParcel = (AdErrorParcel) ecr.a(parcel, AdErrorParcel.CREATOR);
            if (this.a != null) {
                adErrorParcel.a();
            }
        } else if (i == 2) {
            pul pulVar = this.a;
            if (pulVar != null) {
                pulVar.a.o();
            }
        } else if (i == 3) {
            pul pulVar2 = this.a;
            if (pulVar2 != null) {
                pulVar2.a.e();
            }
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public pxc() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }
}
