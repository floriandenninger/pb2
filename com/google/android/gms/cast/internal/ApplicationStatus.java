package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qko;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApplicationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(14);
    public String a;

    public ApplicationStatus() {
        this(null);
    }

    public ApplicationStatus(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApplicationStatus) {
            return qko.j(this.a, ((ApplicationStatus) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.n(parcel, m);
    }
}
