package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qip;
import defpackage.qom;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements qom {
    public static final Parcelable.Creator CREATOR = new pvl(19);
    public Status a;
    public List b;

    @Deprecated
    public String[] c;

    public GetRecentContextCall$Response() {
    }

    public GetRecentContextCall$Response(Status status, List list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.J(parcel, 2, this.b);
        qip.G(parcel, 3, this.c);
        qip.n(parcel, m);
    }
}
