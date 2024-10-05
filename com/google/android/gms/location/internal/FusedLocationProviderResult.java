package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qom;
import defpackage.rbg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements qom {
    public static final Parcelable.Creator CREATOR;
    public final Status a;

    static {
        new FusedLocationProviderResult(Status.a);
        CREATOR = new rbg(4);
    }

    public FusedLocationProviderResult(Status status) {
        this.a = status;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.n(parcel, m);
    }
}
