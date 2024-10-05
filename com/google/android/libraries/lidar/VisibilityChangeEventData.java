package com.google.android.libraries.lidar;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rrw;
import defpackage.tdy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VisibilityChangeEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rrw(12);
    public final tdy a;
    public final double b;
    public final boolean c;

    public VisibilityChangeEventData(double d, double d2, double d3, boolean z, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this(new tdy(d, d2, rect, rect2, rect3, rect4), d3, z);
    }

    public VisibilityChangeEventData(tdy tdyVar, double d, boolean z) {
        this.a = tdyVar;
        this.b = d;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VisibilityChangeEventData)) {
            return false;
        }
        VisibilityChangeEventData visibilityChangeEventData = (VisibilityChangeEventData) obj;
        return this.b == visibilityChangeEventData.b && this.c == visibilityChangeEventData.c && this.a.equals(visibilityChangeEventData.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Double.valueOf(this.b), Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a.a);
        parcel.writeDouble(this.a.b);
        parcel.writeDouble(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.a.c.left);
        parcel.writeInt(this.a.c.top);
        parcel.writeInt(this.a.c.right);
        parcel.writeInt(this.a.c.bottom);
        parcel.writeInt(this.a.d.left);
        parcel.writeInt(this.a.d.top);
        parcel.writeInt(this.a.d.right);
        parcel.writeInt(this.a.d.bottom);
        parcel.writeInt(this.a.e.left);
        parcel.writeInt(this.a.e.top);
        parcel.writeInt(this.a.e.right);
        parcel.writeInt(this.a.e.bottom);
        parcel.writeInt(this.a.f.left);
        parcel.writeInt(this.a.f.top);
        parcel.writeInt(this.a.f.right);
        parcel.writeInt(this.a.f.bottom);
    }

    public VisibilityChangeEventData(Parcel parcel) {
        double readDouble = parcel.readDouble();
        double readDouble2 = parcel.readDouble();
        this.b = parcel.readDouble();
        this.c = parcel.readByte() != 0;
        this.a = new tdy(readDouble, readDouble2, new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()), new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()), new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()), new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()));
    }
}
