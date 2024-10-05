package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rbg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InitializationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(12);
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final String h;

    public InitializationParams(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.t(parcel, 1, this.a);
        qip.t(parcel, 2, this.b);
        qip.o(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.F(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.v(parcel, 7, this.g);
        qip.F(parcel, 8, this.h);
        qip.n(parcel, m);
    }
}
