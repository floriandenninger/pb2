package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qkp extends ecq implements qkq {
    public qkp() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((Bundle) ecr.a(parcel, Bundle.CREATOR));
        return true;
    }
}
