package com.google.android.libraries.youtube.edit.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.xes;
import defpackage.zoi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class DeviceLocalFile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xes(15);

    public static zoi i() {
        zoi zoiVar = new zoi();
        zoiVar.e(Long.MIN_VALUE);
        return zoiVar;
    }

    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract long e();

    public abstract Uri f();

    public abstract String g();

    public abstract String h();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(c());
        parcel.writeParcelable(f(), 0);
        parcel.writeString(h());
        parcel.writeString(g());
        parcel.writeLong(e());
        parcel.writeLong(b());
        parcel.writeLong(d());
        parcel.writeInt(a());
    }
}
