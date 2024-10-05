package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qui(20);
    public int a;
    public long b;
    public long c;
    public boolean d;
    long e;
    int f;
    float g;
    long h;
    boolean i;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, false);
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f;
        this.h = j4;
        this.i = z2;
    }

    public final long a() {
        long j = this.h;
        long j2 = this.b;
        return j < j2 ? j2 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && a() == locationRequest.a() && this.i == locationRequest.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.a;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (this.h > this.b) {
            sb.append(" maxWait=");
            sb.append(this.h);
            sb.append("ms");
        }
        if (this.g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.g);
            sb.append("m");
        }
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.t(parcel, 2, this.b);
        qip.t(parcel, 3, this.c);
        qip.o(parcel, 4, this.d);
        qip.t(parcel, 5, this.e);
        qip.s(parcel, 6, this.f);
        qip.q(parcel, 7, this.g);
        qip.t(parcel, 8, this.h);
        qip.o(parcel, 9, this.i);
        qip.n(parcel, m);
    }
}
