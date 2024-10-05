package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rbg;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CellularInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(17);
    public final Integer a;
    public final Integer b;

    public CellularInfo(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellularInfo)) {
            return false;
        }
        CellularInfo cellularInfo = (CellularInfo) obj;
        return qar.j(this.a, cellularInfo.a) && qar.j(this.b, cellularInfo.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("connectionType", this.a, arrayList);
        qar.l("meteredness", this.b, arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.B(parcel, 1, this.a);
        qip.B(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
