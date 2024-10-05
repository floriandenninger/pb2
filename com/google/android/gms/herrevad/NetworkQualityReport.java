package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NetworkQualityReport extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(16);
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public Bundle f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;

    public NetworkQualityReport() {
        this.a = -1;
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = -1;
        this.f = new Bundle();
        this.g = false;
        this.h = -1;
        this.i = false;
        this.j = false;
    }

    public final void a(String str, String str2) {
        this.f.putString(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[\nmLatencyMicros: ");
        sb.append(this.a);
        sb.append("\nmDurationMicros: ");
        sb.append(this.b);
        sb.append("\nmBytesDownloaded: ");
        sb.append(this.c);
        sb.append("\nmBytesUploaded: ");
        sb.append(this.d);
        sb.append("\nmMeasurementType: ");
        sb.append(this.e);
        sb.append("\nmIsNoConnectivity: ");
        sb.append(this.g);
        sb.append("\nmConnectivityType: ");
        sb.append(this.h);
        sb.append("\nmIsCaptivePortal: ");
        sb.append(this.i);
        sb.append("\nmHighPriority: ");
        sb.append(this.j);
        sb.append("\n");
        for (String str : this.f.keySet()) {
            sb.append("custom param: ");
            sb.append(str);
            sb.append("=");
            sb.append(this.f.get(str));
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.t(parcel, 3, this.b);
        qip.t(parcel, 4, this.c);
        qip.t(parcel, 5, this.d);
        qip.s(parcel, 6, this.e);
        qip.v(parcel, 7, this.f);
        qip.o(parcel, 8, this.g);
        qip.s(parcel, 9, this.h);
        qip.o(parcel, 10, this.i);
        qip.o(parcel, 11, this.j);
        qip.n(parcel, m);
    }

    public NetworkQualityReport(int i, long j, long j2, long j3, int i2, Bundle bundle, boolean z, int i3, boolean z2, boolean z3) {
        this.a = -1;
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = -1;
        new Bundle();
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = bundle;
        this.g = z;
        this.h = i3;
        this.i = z2;
        this.j = z3;
    }
}
