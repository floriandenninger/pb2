package com.google.android.libraries.youtube.livecreation.innertube;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import defpackage.aapi;
import defpackage.adyu;
import defpackage.amkq;
import defpackage.anaf;
import defpackage.aqzu;
import defpackage.arnn;
import defpackage.arno;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StreamMetadata implements Serializable, Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(5);
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public transient arnn g;
    public transient arno h;
    public Place i;
    public Date j;
    public transient aqzu k;
    public int l;
    public int m;

    public StreamMetadata() {
        this.m = 1;
    }

    public StreamMetadata(Parcel parcel) {
        this.m = 1;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.d = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.e = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.l = amkq.dm(parcel.readInt());
        this.f = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite != null) {
            this.g = (arnn) parcelableMessageLite.a(arnn.a);
        }
        ParcelableMessageLite parcelableMessageLite2 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite2 != null) {
            this.h = (arno) parcelableMessageLite2.a(arno.a);
        }
        int bu = anaf.bu(parcel.readInt());
        this.m = bu;
        if (bu == 0) {
            this.m = 1;
        }
        this.i = (Place) parcel.readParcelable(Place.class.getClassLoader());
        this.j = (Date) parcel.readSerializable();
        ParcelableMessageLite parcelableMessageLite3 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite3 != null) {
            this.k = (aqzu) parcelableMessageLite3.a(aqzu.a);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.g = (arnn) adyu.cL(objectInputStream, arnn.a, arnn.class);
        this.h = (arno) adyu.cL(objectInputStream, arno.a, arno.class);
        this.k = (aqzu) adyu.cL(objectInputStream, aqzu.a, aqzu.class);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        adyu.cM(objectOutputStream, this.g);
        adyu.cM(objectOutputStream, this.h);
        adyu.cM(objectOutputStream, this.k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException("Equals is not implemented for and should not be implemented for StreamMetadata!");
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("hashCode is not implemented for and should not be implemented for StreamMetadata");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
        parcel.writeValue(this.e);
        int i2 = this.l;
        parcel.writeInt(i2 != 0 ? (-1) + i2 : -1);
        parcel.writeValue(this.f);
        parcel.writeParcelable(new ParcelableMessageLite(this.g), 0);
        parcel.writeParcelable(new ParcelableMessageLite(this.h), 0);
        int i3 = this.m;
        int i4 = i3 - 1;
        if (i3 != 0) {
            parcel.writeInt(i4);
            parcel.writeParcelable(this.i, 0);
            parcel.writeSerializable(this.j);
            parcel.writeParcelable(new ParcelableMessageLite(this.k), 0);
            return;
        }
        throw null;
    }
}
