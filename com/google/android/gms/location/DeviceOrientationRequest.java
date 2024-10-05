package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(18);
    boolean a;
    long b;
    float c;
    long d;
    int e;

    public DeviceOrientationRequest() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public DeviceOrientationRequest(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.a == deviceOrientationRequest.a && this.b == deviceOrientationRequest.b && Float.compare(this.c, deviceOrientationRequest.c) == 0 && this.d == deviceOrientationRequest.d && this.e == deviceOrientationRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.c);
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        qip.t(parcel, 2, this.b);
        qip.q(parcel, 3, this.c);
        qip.t(parcel, 4, this.d);
        qip.s(parcel, 5, this.e);
        qip.n(parcel, m);
    }
}
