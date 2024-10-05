package com.google.android.gms.ads.internal.instream;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InstreamAdConfigurationParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(12);
    public final int a;
    public final int b;
    public final String c;
    public final int d;

    public InstreamAdConfigurationParcel(int i, int i2, String str, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.b);
        qip.F(parcel, 2, this.c);
        qip.s(parcel, 3, this.d);
        qip.s(parcel, 1000, this.a);
        qip.n(parcel, m);
    }
}
