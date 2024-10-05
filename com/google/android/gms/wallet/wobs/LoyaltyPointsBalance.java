package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rrw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rrw(2);
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;

    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.p(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.t(parcel, 6, this.e);
        qip.s(parcel, 7, this.f);
        qip.n(parcel, m);
    }
}
