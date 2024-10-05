package com.google.android.libraries.parenttools.youtube;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rrw;
import defpackage.umx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ParentToolsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rrw(13);

    public static umx c() {
        umx umxVar = new umx();
        umxVar.b(1);
        return umxVar;
    }

    public abstract byte[] a();

    public abstract int b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(a());
        parcel.writeInt(b() - 1);
    }
}
