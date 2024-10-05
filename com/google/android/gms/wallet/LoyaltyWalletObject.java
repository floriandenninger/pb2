package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import defpackage.oba;
import defpackage.qip;
import defpackage.rqz;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqz();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;

    @Deprecated
    String i;
    String j;
    int k;
    ArrayList l;
    TimeInterval m;
    ArrayList n;

    @Deprecated
    String o;

    @Deprecated
    String p;
    ArrayList q;
    boolean r;
    ArrayList s;
    ArrayList t;
    ArrayList u;
    LoyaltyPoints v;

    LoyaltyWalletObject() {
        this.l = oba.ah();
        this.n = oba.ah();
        this.q = oba.ah();
        this.s = oba.ah();
        this.t = oba.ah();
        this.u = oba.ah();
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
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
        this.k = i;
        this.l = arrayList;
        this.m = timeInterval;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = loyaltyPoints;
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
        qip.s(parcel, 12, this.k);
        qip.J(parcel, 13, this.l);
        qip.E(parcel, 14, this.m, i);
        qip.J(parcel, 15, this.n);
        qip.F(parcel, 16, this.o);
        qip.F(parcel, 17, this.p);
        qip.J(parcel, 18, this.q);
        qip.o(parcel, 19, this.r);
        qip.J(parcel, 20, this.s);
        qip.J(parcel, 21, this.t);
        qip.J(parcel, 22, this.u);
        qip.E(parcel, 23, this.v, i);
        qip.n(parcel, m);
    }
}
