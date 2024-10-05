package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rrw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rrw(5);
    long a;
    long b;

    TimeInterval() {
    }

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.t(parcel, 2, this.a);
        qip.t(parcel, 3, this.b);
        qip.n(parcel, m);
    }
}
