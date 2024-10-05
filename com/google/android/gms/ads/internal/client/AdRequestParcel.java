package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvo;
import defpackage.qar;
import defpackage.qip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AdRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvo();
    public final int a;

    @Deprecated
    public final long b;
    public final Bundle c;

    @Deprecated
    public final int d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final SearchAdRequestParcel j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List o;
    public final String p;
    public final String q;

    @Deprecated
    public final boolean r;
    public final AdDataParcel s;
    public final int t;
    public final String u;
    public final List v;
    public final int w;
    public final String x;

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, AdDataParcel adDataParcel, int i4, String str5, List list3, int i5, String str6) {
        this.a = i;
        this.b = j;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = searchAdRequestParcel;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
        this.s = adDataParcel;
        this.t = i4;
        this.u = str5;
        this.v = list3 == null ? new ArrayList() : list3;
        this.w = i5;
        this.x = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.a == adRequestParcel.a && this.b == adRequestParcel.b && qar.d(this.c, adRequestParcel.c) && this.d == adRequestParcel.d && qar.j(this.e, adRequestParcel.e) && this.f == adRequestParcel.f && this.g == adRequestParcel.g && this.h == adRequestParcel.h && qar.j(this.i, adRequestParcel.i) && qar.j(this.j, adRequestParcel.j) && qar.j(this.k, adRequestParcel.k) && qar.j(this.l, adRequestParcel.l) && qar.d(this.m, adRequestParcel.m) && qar.d(this.n, adRequestParcel.n) && qar.j(this.o, adRequestParcel.o) && qar.j(this.p, adRequestParcel.p) && qar.j(this.q, adRequestParcel.q) && this.r == adRequestParcel.r && this.t == adRequestParcel.t && qar.j(this.u, adRequestParcel.u) && qar.j(this.v, adRequestParcel.v) && this.w == adRequestParcel.w && qar.j(this.x, adRequestParcel.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u, this.v, Integer.valueOf(this.w), this.x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.t(parcel, 2, this.b);
        qip.v(parcel, 3, this.c);
        qip.s(parcel, 4, this.d);
        qip.H(parcel, 5, this.e);
        qip.o(parcel, 6, this.f);
        qip.s(parcel, 7, this.g);
        qip.o(parcel, 8, this.h);
        qip.F(parcel, 9, this.i);
        qip.E(parcel, 10, this.j, i);
        qip.E(parcel, 11, this.k, i);
        qip.F(parcel, 12, this.l);
        qip.v(parcel, 13, this.m);
        qip.v(parcel, 14, this.n);
        qip.H(parcel, 15, this.o);
        qip.F(parcel, 16, this.p);
        qip.F(parcel, 17, this.q);
        qip.o(parcel, 18, this.r);
        qip.E(parcel, 19, this.s, i);
        qip.s(parcel, 20, this.t);
        qip.F(parcel, 21, this.u);
        qip.H(parcel, 22, this.v);
        qip.s(parcel, 23, this.w);
        qip.F(parcel, 24, this.x);
        qip.n(parcel, m);
    }
}
