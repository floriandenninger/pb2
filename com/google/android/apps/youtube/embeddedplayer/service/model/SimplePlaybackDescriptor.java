package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SimplePlaybackDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new k(1);
    public final int a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final int g;

    public SimplePlaybackDescriptor(int i, String str, String str2, ArrayList arrayList, int i2, int i3, int i4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public SimplePlaybackDescriptor(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        parcel.readStringList(arrayList);
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    public static SimplePlaybackDescriptor b(String str, int i, int i2, int i3) {
        j jVar = new j();
        jVar.a = 2;
        jVar.c = str;
        jVar.e = i;
        jVar.f = i2;
        jVar.g = i3;
        return jVar.a();
    }

    public static SimplePlaybackDescriptor c(String str, int i) {
        j jVar = new j();
        jVar.a = 1;
        jVar.b = str;
        jVar.e = i;
        return jVar.a();
    }

    public static SimplePlaybackDescriptor d(String str, int i, int i2) {
        j jVar = new j();
        jVar.a = 1;
        jVar.b = str;
        jVar.e = i;
        jVar.g = i2;
        return jVar.a();
    }

    public static SimplePlaybackDescriptor e(List list, int i, int i2, int i3) {
        j jVar = new j();
        jVar.a = 3;
        jVar.d = new ArrayList(list);
        jVar.e = i;
        jVar.f = i2;
        jVar.g = i3;
        return jVar.a();
    }

    public static Optional f(String str, List list, String str2, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            j jVar = new j();
            if (!TextUtils.isEmpty(str2)) {
                jVar.a = 2;
                jVar.c = str2;
                jVar.b = str;
            } else if (list == null || list.size() <= 0) {
                jVar.a = 1;
                jVar.b = str;
            } else {
                jVar.a = 3;
                jVar.d = new ArrayList();
                if (str != null) {
                    jVar.d.add(str);
                }
                jVar.d.addAll(list);
            }
            if (jVar.a != 1) {
                jVar.f = i2;
            }
            jVar.g = i3;
            jVar.e = i;
            return Optional.of(jVar.a());
        }
        return Optional.empty();
    }

    public final SimplePlaybackDescriptor a(int i) {
        j jVar = new j();
        jVar.a = this.a;
        jVar.b = this.b;
        jVar.c = this.c;
        jVar.d = new ArrayList();
        jVar.d.addAll(this.d);
        jVar.f = this.f;
        jVar.g = this.g;
        jVar.e = i;
        if (i == 2) {
            jVar.g = 0;
        }
        return jVar.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
