package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rbg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(13);
    public String a;
    public String b;
    public UserAttributeParcel c;
    public long d;
    public boolean e;
    public String f;
    public EventParcel g;
    public long h;
    public EventParcel i;
    public long j;
    public EventParcel k;

    public ConditionalUserPropertyParcel(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        qip.an(conditionalUserPropertyParcel);
        this.a = conditionalUserPropertyParcel.a;
        this.b = conditionalUserPropertyParcel.b;
        this.c = conditionalUserPropertyParcel.c;
        this.d = conditionalUserPropertyParcel.d;
        this.e = conditionalUserPropertyParcel.e;
        this.f = conditionalUserPropertyParcel.f;
        this.g = conditionalUserPropertyParcel.g;
        this.h = conditionalUserPropertyParcel.h;
        this.i = conditionalUserPropertyParcel.i;
        this.j = conditionalUserPropertyParcel.j;
        this.k = conditionalUserPropertyParcel.k;
    }

    public ConditionalUserPropertyParcel(String str, String str2, UserAttributeParcel userAttributeParcel, long j, boolean z, String str3, EventParcel eventParcel, long j2, EventParcel eventParcel2, long j3, EventParcel eventParcel3) {
        this.a = str;
        this.b = str2;
        this.c = userAttributeParcel;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = eventParcel;
        this.h = j2;
        this.i = eventParcel2;
        this.j = j3;
        this.k = eventParcel3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.E(parcel, 4, this.c, i);
        qip.t(parcel, 5, this.d);
        qip.o(parcel, 6, this.e);
        qip.F(parcel, 7, this.f);
        qip.E(parcel, 8, this.g, i);
        qip.t(parcel, 9, this.h);
        qip.E(parcel, 10, this.i, i);
        qip.t(parcel, 11, this.j);
        qip.E(parcel, 12, this.k, i);
        qip.n(parcel, m);
    }
}
