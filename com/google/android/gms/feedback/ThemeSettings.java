package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(5);
    public int a;
    int b;

    public ThemeSettings() {
        this(3, 0);
    }

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.n(parcel, m);
    }
}
