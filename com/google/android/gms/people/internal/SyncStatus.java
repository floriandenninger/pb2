package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rnq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rnq(1);
    public final int a;
    public final String b;
    public final long c;

    public SyncStatus(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.t(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
