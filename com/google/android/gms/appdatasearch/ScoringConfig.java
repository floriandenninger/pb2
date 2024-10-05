package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(1);
    public final boolean a;

    public ScoringConfig(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScoringConfig) && this.a == ((ScoringConfig) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        qip.n(parcel, m);
    }
}
