package com.google.android.libraries.youtube.livecreation.controller;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import defpackage.aapi;
import defpackage.adyu;
import defpackage.apxf;
import defpackage.atey;
import defpackage.atgf;
import defpackage.avxs;
import defpackage.zga;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StreamConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new aapi(4);
    public transient boolean a;
    public String b;
    public String c;
    public StreamMetadata d;
    public boolean e;
    public String f;
    public int g;
    public transient apxf h;
    public transient atey i;
    public transient atgf j;
    public transient apxf k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public String u;
    public String v;
    public String w;
    public int x;
    public transient avxs y;

    public StreamConfig() {
        this.o = true;
        this.r = -1;
        this.x = -1;
    }

    public StreamConfig(Parcel parcel) {
        this.o = true;
        this.r = -1;
        this.x = -1;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (StreamMetadata) parcel.readParcelable(StreamMetadata.class.getClassLoader());
        this.e = parcel.readByte() != 0;
        this.f = parcel.readString();
        this.g = parcel.readInt();
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite != null) {
            this.h = (apxf) parcelableMessageLite.a(apxf.a);
        }
        ParcelableMessageLite parcelableMessageLite2 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite2 != null) {
            this.i = (atey) parcelableMessageLite2.a(atey.a);
        }
        ParcelableMessageLite parcelableMessageLite3 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite3 != null) {
            this.j = (atgf) parcelableMessageLite3.a(atgf.a);
        }
        ParcelableMessageLite parcelableMessageLite4 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite4 != null) {
            this.k = (apxf) parcelableMessageLite4.a(apxf.a);
        }
        this.l = parcel.readLong();
        this.m = parcel.readLong();
        this.o = parcel.readByte() != 0;
        this.n = parcel.readByte() != 0;
        this.p = parcel.readByte() != 0;
        this.q = parcel.readByte() != 0;
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        ParcelableMessageLite parcelableMessageLite5 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite5 != null) {
            this.y = (avxs) parcelableMessageLite5.a(avxs.a);
        }
    }

    public static StreamConfig a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            return (StreamConfig) readObject;
        } catch (Exception e) {
            zga.n("Deserialization of live stream config data from Shared Preferences failed.", e);
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.h = (apxf) adyu.cL(objectInputStream, apxf.a, apxf.class);
        this.i = (atey) adyu.cL(objectInputStream, atey.a, atey.class);
        this.j = (atgf) adyu.cL(objectInputStream, atgf.a, atgf.class);
        this.k = (apxf) adyu.cL(objectInputStream, apxf.a, apxf.class);
        this.y = (avxs) adyu.cL(objectInputStream, avxs.a, avxs.class);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        adyu.cM(objectOutputStream, this.h);
        adyu.cM(objectOutputStream, this.i);
        adyu.cM(objectOutputStream, this.j);
        adyu.cM(objectOutputStream, this.k);
        adyu.cM(objectOutputStream, this.y);
    }

    public final String b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e) {
            zga.n("Serialization of live stream config data to Shared Preferences failed.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeParcelable(new ParcelableMessageLite(this.h), 0);
        parcel.writeParcelable(new ParcelableMessageLite(this.i), 0);
        parcel.writeParcelable(new ParcelableMessageLite(this.j), 0);
        parcel.writeParcelable(new ParcelableMessageLite(this.k), 0);
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeParcelable(new ParcelableMessageLite(this.y), 0);
    }
}
