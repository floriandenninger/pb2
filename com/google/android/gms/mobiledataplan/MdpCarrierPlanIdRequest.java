package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rbg;
import defpackage.rqr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpCarrierPlanIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(18);
    public String a;
    public Bundle b;
    public Integer c;
    public Long d;

    public MdpCarrierPlanIdRequest() {
    }

    public MdpCarrierPlanIdRequest(String str, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = bundle;
        this.c = num;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdRequest)) {
            return false;
        }
        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = (MdpCarrierPlanIdRequest) obj;
        return qar.j(this.a, mdpCarrierPlanIdRequest.a) && rqr.m(this.b, mdpCarrierPlanIdRequest.b) && qar.j(this.c, mdpCarrierPlanIdRequest.c) && qar.j(this.d, mdpCarrierPlanIdRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(rqr.l(this.b)), this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("apiKey", this.a.substring(Math.max(r1.length() - 5, 0)), arrayList);
        qar.l("ExtraInfo", this.b, arrayList);
        qar.l("EventFlowId", this.c, arrayList);
        qar.l("UniqueRequestId", this.d, arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.v(parcel, 2, this.b);
        qip.B(parcel, 3, this.c);
        qip.D(parcel, 4, this.d);
        qip.n(parcel, m);
    }
}
