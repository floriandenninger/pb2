package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qmu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qmu(13);
    public Bundle a;
    public Feature[] b;
    int c;
    public ConnectionTelemetryConfiguration d;

    public ConnectionInfo() {
    }

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.v(parcel, 1, this.a);
        qip.I(parcel, 2, this.b, i);
        qip.s(parcel, 3, this.c);
        qip.E(parcel, 4, this.d, i);
        qip.n(parcel, m);
    }
}
