package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(5);
    public final int a;
    String b;
    CommonWalletObject c;

    OfferWalletObject() {
        this.a = 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 3, this.b);
        qip.E(parcel, 4, this.c, i);
        qip.n(parcel, m);
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i;
        this.b = str2;
        if (i >= 3) {
            this.c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.a = str;
        this.c = commonWalletObject2;
    }
}
