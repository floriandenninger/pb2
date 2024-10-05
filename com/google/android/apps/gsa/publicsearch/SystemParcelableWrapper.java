package com.google.android.apps.gsa.publicsearch;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.asg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SystemParcelableWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new asg(12);
    public final Parcelable a;

    public SystemParcelableWrapper(Parcelable parcelable) {
        String name = parcelable.getClass().getName();
        if (!name.startsWith("android.os.") && !name.equals("android.content.Intent") && !name.equals("android.app.PendingIntent")) {
            throw new IllegalArgumentException("Only Android system classes can be passed in SystemParcelableWrapper.");
        }
        this.a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
