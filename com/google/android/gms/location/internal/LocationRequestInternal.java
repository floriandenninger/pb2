package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.qar;
import defpackage.qip;
import defpackage.rbg;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    LocationRequest b;
    List c;
    String d;
    boolean e;
    boolean f;
    boolean g;
    String h;
    boolean i;
    boolean j;
    public String k;
    long l;
    public static final List a = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new rbg(5);

    public LocationRequestInternal(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.b = locationRequest;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = z4;
        this.j = z5;
        this.k = str3;
        this.l = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
            if (qar.j(this.b, locationRequestInternal.b) && qar.j(this.c, locationRequestInternal.c) && qar.j(this.d, locationRequestInternal.d) && this.e == locationRequestInternal.e && this.f == locationRequestInternal.f && this.g == locationRequestInternal.g && qar.j(this.h, locationRequestInternal.h) && this.i == locationRequestInternal.i && this.j == locationRequestInternal.j && qar.j(this.k, locationRequestInternal.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (this.d != null) {
            sb.append(" tag=");
            sb.append(this.d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.e);
        sb.append(" clients=");
        sb.append(this.c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.b, i);
        qip.J(parcel, 5, this.c);
        qip.F(parcel, 6, this.d);
        qip.o(parcel, 7, this.e);
        qip.o(parcel, 8, this.f);
        qip.o(parcel, 9, this.g);
        qip.F(parcel, 10, this.h);
        qip.o(parcel, 11, this.i);
        qip.o(parcel, 12, this.j);
        qip.F(parcel, 13, this.k);
        qip.t(parcel, 14, this.l);
        qip.n(parcel, m);
    }
}
