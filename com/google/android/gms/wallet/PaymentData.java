package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(7);
    String a;
    CardInfo b;
    UserAddress c;
    PaymentMethodToken d;
    String e;
    Bundle f;
    String g;
    Bundle h;

    private PaymentData() {
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = cardInfo;
        this.c = userAddress;
        this.d = paymentMethodToken;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.E(parcel, 2, this.b, i);
        qip.E(parcel, 3, this.c, i);
        qip.E(parcel, 4, this.d, i);
        qip.F(parcel, 5, this.e);
        qip.v(parcel, 6, this.f);
        qip.F(parcel, 7, this.g);
        qip.v(parcel, 8, this.h);
        qip.n(parcel, m);
    }
}
