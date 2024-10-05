package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pxi extends ecq implements pxj {
    public pxi() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
