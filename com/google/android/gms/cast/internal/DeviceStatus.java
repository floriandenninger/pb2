package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qko;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(15);
    public double a;
    public boolean b;
    public int c;
    public ApplicationMetadata d;
    public int e;
    public EqualizerSettings f;
    public double g;

    public DeviceStatus() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public DeviceStatus(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, EqualizerSettings equalizerSettings, double d2) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.d = applicationMetadata;
        this.e = i2;
        this.f = equalizerSettings;
        this.g = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        if (this.a == deviceStatus.a && this.b == deviceStatus.b && this.c == deviceStatus.c && qko.j(this.d, deviceStatus.d) && this.e == deviceStatus.e) {
            EqualizerSettings equalizerSettings = this.f;
            if (qko.j(equalizerSettings, equalizerSettings) && this.g == deviceStatus.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.p(parcel, 2, this.a);
        qip.o(parcel, 3, this.b);
        qip.s(parcel, 4, this.c);
        qip.E(parcel, 5, this.d, i);
        qip.s(parcel, 6, this.e);
        qip.E(parcel, 7, this.f, i);
        qip.p(parcel, 8, this.g);
        qip.n(parcel, m);
    }
}
