package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(2);
    String a;
    String b;
    ProxyCard c;
    String d;
    Address e;
    Address f;
    String[] g;
    UserAddress h;
    UserAddress i;
    InstrumentInfo[] j;
    PaymentMethodToken k;

    private FullWallet() {
    }

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.a = str;
        this.b = str2;
        this.c = proxyCard;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = strArr;
        this.h = userAddress;
        this.i = userAddress2;
        this.j = instrumentInfoArr;
        this.k = paymentMethodToken;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.E(parcel, 4, this.c, i);
        qip.F(parcel, 5, this.d);
        qip.E(parcel, 6, this.e, i);
        qip.E(parcel, 7, this.f, i);
        qip.G(parcel, 8, this.g);
        qip.E(parcel, 9, this.h, i);
        qip.E(parcel, 10, this.i, i);
        qip.I(parcel, 11, this.j, i);
        qip.E(parcel, 12, this.k, i);
        qip.n(parcel, m);
    }
}
