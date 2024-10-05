package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rbg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CallerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(8);
    public final String a;
    public final long b;

    public CallerInfo(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.t(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
