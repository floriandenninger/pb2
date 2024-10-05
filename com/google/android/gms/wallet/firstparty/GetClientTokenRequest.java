package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(12);
    WalletCustomTheme a;
    boolean b;
    int c;

    GetClientTokenRequest() {
        this.c = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 2, this.a, i);
        qip.o(parcel, 3, this.b);
        qip.s(parcel, 4, this.c);
        qip.n(parcel, m);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z, int i) {
        this.a = walletCustomTheme;
        this.b = z;
        this.c = i;
        if (walletCustomTheme == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }
}
