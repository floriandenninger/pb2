package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alsz(1);

    public static ReviewInfo c(PendingIntent pendingIntent, boolean z) {
        return new AutoValue_ReviewInfo(pendingIntent, z);
    }

    public abstract PendingIntent a();

    public abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}
