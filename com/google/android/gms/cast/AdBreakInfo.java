package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;
import defpackage.qko;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(12);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    public AdBreakInfo(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return qko.j(this.b, adBreakInfo.b) && this.a == adBreakInfo.a && this.c == adBreakInfo.c && this.d == adBreakInfo.d && Arrays.equals(this.e, adBreakInfo.e) && this.f == adBreakInfo.f && this.g == adBreakInfo.g;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.t(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.t(parcel, 4, this.c);
        qip.o(parcel, 5, this.d);
        qip.G(parcel, 6, this.e);
        qip.o(parcel, 7, this.f);
        qip.o(parcel, 8, this.g);
        qip.n(parcel, m);
    }
}
