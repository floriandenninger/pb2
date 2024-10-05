package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rlt;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpFlexTimeWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(1);
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public MdpFlexTimeWindow(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpFlexTimeWindow mdpFlexTimeWindow = (MdpFlexTimeWindow) obj;
            if (qar.j(this.a, mdpFlexTimeWindow.a) && qar.j(this.b, mdpFlexTimeWindow.b) && qar.j(this.c, mdpFlexTimeWindow.c) && qar.j(Integer.valueOf(this.d), Integer.valueOf(mdpFlexTimeWindow.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("RecurrenceType", this.a, arrayList);
        qar.l("StartTime", this.b, arrayList);
        qar.l("EndTime", this.c, arrayList);
        qar.l("DiscountPercentage", Integer.valueOf(this.d), arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.s(parcel, 4, this.d);
        qip.n(parcel, m);
    }
}
