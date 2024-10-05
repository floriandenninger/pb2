package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.oba;
import defpackage.qip;
import defpackage.rrv;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rrv();
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    @Deprecated
    String h;
    int i;
    ArrayList j;
    TimeInterval k;
    ArrayList l;

    @Deprecated
    String m;

    @Deprecated
    String n;
    ArrayList o;
    boolean p;
    ArrayList q;
    ArrayList r;
    ArrayList s;

    public CommonWalletObject() {
        this.j = oba.ah();
        this.l = oba.ah();
        this.o = oba.ah();
        this.q = oba.ah();
        this.r = oba.ah();
        this.s = oba.ah();
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
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
        qip.s(parcel, 10, this.i);
        qip.J(parcel, 11, this.j);
        qip.E(parcel, 12, this.k, i);
        qip.J(parcel, 13, this.l);
        qip.F(parcel, 14, this.m);
        qip.F(parcel, 15, this.n);
        qip.J(parcel, 16, this.o);
        qip.o(parcel, 17, this.p);
        qip.J(parcel, 18, this.q);
        qip.J(parcel, 19, this.r);
        qip.J(parcel, 20, this.s);
        qip.n(parcel, m);
    }
}
