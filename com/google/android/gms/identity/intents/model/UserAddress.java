package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qui(17);
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    boolean m;
    String n;
    String o;

    UserAddress() {
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = z;
        this.n = str13;
        this.o = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.F(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.F(parcel, 6, this.e);
        qip.F(parcel, 7, this.f);
        qip.F(parcel, 8, this.g);
        qip.F(parcel, 9, this.h);
        qip.F(parcel, 10, this.i);
        qip.F(parcel, 11, this.j);
        qip.F(parcel, 12, this.k);
        qip.F(parcel, 13, this.l);
        qip.o(parcel, 14, this.m);
        qip.F(parcel, 15, this.n);
        qip.F(parcel, 16, this.o);
        qip.n(parcel, m);
    }
}
