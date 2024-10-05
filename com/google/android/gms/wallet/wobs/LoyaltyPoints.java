package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rrw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rrw(3);
    String a;
    LoyaltyPointsBalance b;

    @Deprecated
    TimeInterval c;

    LoyaltyPoints() {
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.a = str;
        this.b = loyaltyPointsBalance;
        this.c = timeInterval;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.E(parcel, 3, this.b, i);
        qip.E(parcel, 5, this.c, i);
        qip.n(parcel, m);
    }
}
