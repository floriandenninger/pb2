package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.qar;
import defpackage.qip;
import defpackage.rbg;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    DeviceOrientationRequest c;
    List d;
    String e;
    public static final List a = Collections.emptyList();
    public static final DeviceOrientationRequest b = new DeviceOrientationRequest(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    public static final Parcelable.Creator CREATOR = new rbg(2);

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.c = deviceOrientationRequest;
        this.d = list;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceOrientationRequestInternal)) {
            return false;
        }
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) obj;
        return qar.j(this.c, deviceOrientationRequestInternal.c) && qar.j(this.d, deviceOrientationRequestInternal.d) && qar.j(this.e, deviceOrientationRequestInternal.e);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.c, i);
        qip.J(parcel, 2, this.d);
        qip.F(parcel, 3, this.e);
        qip.n(parcel, m);
    }
}
