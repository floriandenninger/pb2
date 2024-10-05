package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qmu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qmu(16);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.s(parcel, 2, this.b);
        qip.s(parcel, 3, this.c);
        qip.t(parcel, 4, this.d);
        qip.t(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.F(parcel, 7, this.g);
        qip.s(parcel, 8, this.h);
        qip.s(parcel, 9, this.i);
        qip.n(parcel, m);
    }
}
