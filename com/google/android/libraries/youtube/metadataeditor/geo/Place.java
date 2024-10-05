package com.google.android.libraries.youtube.metadataeditor.geo;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.amkq;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Place implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new aapi(14);
    public final String a;
    public final String b;

    Place() {
        this.a = null;
        this.b = null;
    }

    public Place(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return amkq.b(this.a, place.a) && amkq.b(this.b, place.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31 + String.valueOf(str2).length());
        sb.append("Place{placeId='");
        sb.append(str);
        sb.append("', placeName='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public Place(String str, String str2) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
    }
}
