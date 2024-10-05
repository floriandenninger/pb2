package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pzt extends ecq implements pzu {
    public pzt() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            pzw a = a(parcel.readString());
            parcel2.writeNoException();
            ecr.i(parcel2, a);
        } else if (i == 2) {
            boolean d = d(parcel.readString());
            parcel2.writeNoException();
            ecr.e(parcel2, d);
        } else if (i == 3) {
            qap b = b(parcel.readString());
            parcel2.writeNoException();
            ecr.i(parcel2, b);
        } else {
            if (i != 4) {
                return false;
            }
            boolean c = c(parcel.readString());
            parcel2.writeNoException();
            ecr.e(parcel2, c);
        }
        return true;
    }
}
