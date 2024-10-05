package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(10);
    final int a;
    public boolean b;
    public PendingIntent c;
    public boolean d;
    public long e;

    public GmsDeviceComplianceResponse() {
        this(1, true, null, false, 0L);
    }

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent, boolean z2, long j) {
        this.a = i;
        this.b = z;
        this.c = pendingIntent;
        this.d = z2;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.o(parcel, 2, this.b);
        qip.E(parcel, 3, this.c, i);
        qip.o(parcel, 4, this.d);
        qip.t(parcel, 5, this.e);
        qip.n(parcel, m);
    }

    public GmsDeviceComplianceResponse(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        this(gmsDeviceComplianceResponse.a, gmsDeviceComplianceResponse.b, gmsDeviceComplianceResponse.c, gmsDeviceComplianceResponse.d, gmsDeviceComplianceResponse.e);
    }
}
