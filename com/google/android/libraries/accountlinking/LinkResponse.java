package com.google.android.libraries.accountlinking;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.qip;
import defpackage.rrw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LinkResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new rrw(8);
    public final boolean a;
    public final String b;

    public LinkResponse(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
