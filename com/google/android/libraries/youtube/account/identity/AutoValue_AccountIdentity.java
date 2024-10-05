package com.google.android.libraries.youtube.account.identity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rrw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_AccountIdentity extends C$AutoValue_AccountIdentity {
    public static final Parcelable.Creator CREATOR = new rrw(18);

    public AutoValue_AccountIdentity(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, int i, String str5) {
        super(str, str2, str3, z, z2, z3, str4, z4, z5, z6, i, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        int i2 = this.l;
        parcel.writeString(i2 != 1 ? i2 != 2 ? i2 != 3 ? "GAIA_DELEGATION_TYPE_LATE" : "GAIA_DELEGATION_TYPE_EARLY" : "GAIA_DELEGATION_TYPE_NONE" : "GAIA_DELEGATION_TYPE_UNKNOWN");
        parcel.writeString(this.k);
    }
}
