package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aora;
import defpackage.qar;
import defpackage.qip;
import defpackage.rbg;
import defpackage.rqr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MdpDataPlanStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(20);
    public final String a;
    public final MdpDataPlanStatus[] b;
    public final Bundle c;
    public final String d;
    public final WalletBalanceInfo e;
    public final Integer f;
    public final Long g;
    public final Long h;
    public CellularInfo[] i;

    public MdpDataPlanStatusResponse(String str, MdpDataPlanStatus[] mdpDataPlanStatusArr, Bundle bundle, String str2, WalletBalanceInfo walletBalanceInfo, Integer num, Long l, Long l2, CellularInfo[] cellularInfoArr) {
        this.a = str;
        this.b = mdpDataPlanStatusArr;
        this.c = bundle;
        this.d = str2;
        this.e = walletBalanceInfo;
        this.f = num;
        this.g = l;
        this.h = l2;
        this.i = cellularInfoArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpDataPlanStatusResponse)) {
            return false;
        }
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse) obj;
        return qar.j(this.a, mdpDataPlanStatusResponse.a) && Arrays.equals(this.b, mdpDataPlanStatusResponse.b) && rqr.m(this.c, mdpDataPlanStatusResponse.c) && qar.j(this.d, mdpDataPlanStatusResponse.d) && qar.j(this.e, mdpDataPlanStatusResponse.e) && qar.j(this.f, mdpDataPlanStatusResponse.f) && qar.j(this.g, mdpDataPlanStatusResponse.g) && qar.j(this.h, mdpDataPlanStatusResponse.h) && Arrays.equals(this.i, mdpDataPlanStatusResponse.i);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, Integer.valueOf(rqr.l(this.c)), this.d, this.e, this.f, this.g, this.h}) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.i);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("CarrierPlanId", this.a, arrayList);
        qar.l("DataPlans", Arrays.toString(this.b), arrayList);
        qar.l("ExtraInfo", this.c, arrayList);
        qar.l("Title", this.d, arrayList);
        qar.l("WalletBalanceInfo", this.e, arrayList);
        qar.l("EventFlowId", this.f, arrayList);
        qar.l("UniqueRequestId", this.g, arrayList);
        Long l = this.h;
        qar.l("UpdateTime", l != null ? aora.c(l.longValue()) : null, arrayList);
        qar.l("CellularInfo", Arrays.toString(this.i), arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.I(parcel, 2, this.b, i);
        qip.v(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.E(parcel, 5, this.e, i);
        qip.B(parcel, 6, this.f);
        qip.D(parcel, 7, this.g);
        qip.D(parcel, 8, this.h);
        qip.I(parcel, 9, this.i, i);
        qip.n(parcel, m);
    }
}
