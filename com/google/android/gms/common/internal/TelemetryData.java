package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qmu;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qmu(20);
    public final int a;
    public List b;

    public TelemetryData(int i, List list) {
        this.a = i;
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
