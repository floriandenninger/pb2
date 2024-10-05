package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(0);
    String a;
    String b;
    String c;
    int d;
    UserAddress e;

    private CardInfo() {
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = userAddress;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.s(parcel, 4, this.d);
        qip.E(parcel, 5, this.e, i);
        qip.n(parcel, m);
    }
}
