package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GassRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(6);
    public final int a;
    public final String b;
    public final String c;

    public GassRequestParcel(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.n(parcel, m);
    }
}
