package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alsz;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        new CallStatus(1);
        new CallStatus(2);
        new CallStatus(3);
        CREATOR = new alsz(8);
    }

    public CallStatus(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.n(parcel, m);
    }
}
