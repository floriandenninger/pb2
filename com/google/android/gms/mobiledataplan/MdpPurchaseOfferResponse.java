package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rlt;
import defpackage.rqr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpPurchaseOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public Bundle h;
    public final Integer i;
    public final Long j;

    public MdpPurchaseOfferResponse(String str, String str2, String str3, String str4, long j, String str5, String str6, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
        this.g = str6;
        this.h = bundle;
        this.i = num;
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpPurchaseOfferResponse)) {
            return false;
        }
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) obj;
        return qar.j(this.a, mdpPurchaseOfferResponse.a) && qar.j(this.b, mdpPurchaseOfferResponse.b) && qar.j(this.c, mdpPurchaseOfferResponse.c) && qar.j(this.d, mdpPurchaseOfferResponse.d) && qar.j(Long.valueOf(this.e), Long.valueOf(mdpPurchaseOfferResponse.e)) && qar.j(this.f, mdpPurchaseOfferResponse.f) && qar.j(this.g, mdpPurchaseOfferResponse.g) && rqr.m(this.h, mdpPurchaseOfferResponse.h) && qar.j(this.i, mdpPurchaseOfferResponse.i) && qar.j(this.j, mdpPurchaseOfferResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("CarrierName", this.a, arrayList);
        qar.l("TransactionId", this.b, arrayList);
        qar.l("ConfirmationCode", this.c, arrayList);
        qar.l("TransactionMsg", this.d, arrayList);
        qar.l("RemainingBalance", Long.valueOf(this.e), arrayList);
        qar.l("CostCurrency", this.f, arrayList);
        qar.l("PlanActivationTime", this.g, arrayList);
        qar.l("ExtraInfo", this.h, arrayList);
        qar.l("EventFlowId", this.i, arrayList);
        qar.l("UniqueRequestId", this.j, arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.t(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.F(parcel, 7, this.g);
        qip.v(parcel, 8, this.h);
        qip.B(parcel, 9, this.i);
        qip.D(parcel, 10, this.j);
        qip.n(parcel, m);
    }
}
