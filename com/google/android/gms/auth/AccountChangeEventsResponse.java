package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(4);
    final int a;
    public final List b;

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        qip.an(list);
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.J(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
