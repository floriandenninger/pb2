package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rnq;
import defpackage.rqr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rnq(17);
    public final String a;
    public final String b;
    public final Flag c;
    public final boolean d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = flag;
        this.d = z;
    }

    public final String a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverride)) {
            return false;
        }
        FlagOverride flagOverride = (FlagOverride) obj;
        return rqr.i(this.a, flagOverride.a) && rqr.i(this.b, flagOverride.b) && rqr.i(this.c, flagOverride.c) && this.d == flagOverride.d;
    }

    public final String toString() {
        return a(new StringBuilder());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.E(parcel, 4, this.c, i);
        qip.o(parcel, 5, this.d);
        qip.n(parcel, m);
    }
}
