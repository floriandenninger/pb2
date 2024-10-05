package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rbk extends ecq implements rbl {
    public rbk() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((FusedLocationProviderResult) ecr.a(parcel, FusedLocationProviderResult.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            b();
        }
        return true;
    }
}
