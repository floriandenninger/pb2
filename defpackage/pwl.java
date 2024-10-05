package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwl extends ecq implements pwm {
    final /* synthetic */ pwo a;

    public pwl() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.pwm
    public final void a(AdRequestParcel adRequestParcel) {
        b();
    }

    public final void b() {
        qbi.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        qbg.a.post(new pxv(this));
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            b();
            parcel2.writeNoException();
        } else if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else if (i == 3) {
            parcel2.writeNoException();
            ecr.e(parcel2, false);
        } else if (i == 4) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else {
            if (i != 5) {
                return false;
            }
            parcel.readInt();
            b();
            parcel2.writeNoException();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwl(pwo pwoVar) {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
        this.a = pwoVar;
    }
}
