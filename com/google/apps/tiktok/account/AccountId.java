package com.google.apps.tiktok.account;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;
import defpackage.amkq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class AccountId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alsz(3);

    public static AccountId b(int i) {
        amkq.O(i >= -1, "Invalid AccountId");
        return new AutoValue_AccountId(i);
    }

    @Deprecated
    public abstract int a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
    }
}
