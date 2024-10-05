package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final long c;
    public final boolean d;
    public final NetworkLocationStatus[] e;

    static {
        new LocationAvailability(true, 1, 1, 0L, null);
        new LocationAvailability(false, 1, 1, 0L, null);
        CREATOR = new qui(19);
    }

    public LocationAvailability(boolean z, int i, int i2, long j, NetworkLocationStatus[] networkLocationStatusArr) {
        this.d = z;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.e = networkLocationStatusArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.d)});
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(27);
        sb.append("LocationAvailability[");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.s(parcel, 2, this.b);
        qip.t(parcel, 3, this.c);
        qip.I(parcel, 5, this.e, i);
        qip.o(parcel, 6, this.d);
        qip.n(parcel, m);
    }
}
