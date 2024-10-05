package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdValueParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(4);
    public final int a;
    public final int b;
    public final String c;
    public final long d;

    public AdValueParcel(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.s(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.t(parcel, 4, this.d);
        qip.n(parcel, m);
    }
}
