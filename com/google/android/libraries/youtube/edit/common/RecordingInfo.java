package com.google.android.libraries.youtube.edit.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.avwx;
import defpackage.xes;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RecordingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xes(16);
    public final int a;
    public final int b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final avwx i;
    public final boolean j;

    public RecordingInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt() != 0;
        this.g = parcel.readInt() != 0;
        this.h = parcel.readString();
        this.i = avwx.b(parcel.readInt());
        this.j = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeInt(this.i.d);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public RecordingInfo(String str, boolean z, int i, int i2, long j, boolean z2, boolean z3, String str2, avwx avwxVar, boolean z4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = avwxVar == null ? avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED : avwxVar;
        this.j = z4;
    }
}
