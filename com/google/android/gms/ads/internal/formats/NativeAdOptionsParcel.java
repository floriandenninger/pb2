package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NativeAdOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(10);
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final VideoOptionsParcel f;
    public final boolean g;
    public final int h;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2, int i3, VideoOptionsParcel videoOptionsParcel, boolean z3, int i4) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = videoOptionsParcel;
        this.g = z3;
        this.h = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.o(parcel, 2, this.b);
        qip.s(parcel, 3, this.c);
        qip.o(parcel, 4, this.d);
        qip.s(parcel, 5, this.e);
        qip.E(parcel, 6, this.f, i);
        qip.o(parcel, 7, this.g);
        qip.s(parcel, 8, this.h);
        qip.n(parcel, m);
    }
}
