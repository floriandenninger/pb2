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
public class MdpUpsellPlan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(3);
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;

    public MdpUpsellPlan(String str, String str2, String str3, long j, String str4, String str5, long j2, long j3, String str6, String str7, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = j2;
        this.h = j3;
        this.i = str6;
        this.j = str7;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellPlan)) {
            return false;
        }
        MdpUpsellPlan mdpUpsellPlan = (MdpUpsellPlan) obj;
        return qar.j(this.a, mdpUpsellPlan.a) && qar.j(this.b, mdpUpsellPlan.b) && qar.j(this.c, mdpUpsellPlan.c) && qar.j(Long.valueOf(this.d), Long.valueOf(mdpUpsellPlan.d)) && qar.j(this.e, mdpUpsellPlan.e) && qar.j(this.f, mdpUpsellPlan.f) && qar.j(Long.valueOf(this.g), Long.valueOf(mdpUpsellPlan.g)) && qar.j(Long.valueOf(this.h), Long.valueOf(mdpUpsellPlan.h)) && qar.j(this.i, mdpUpsellPlan.i) && qar.j(this.j, mdpUpsellPlan.j) && qar.j(Integer.valueOf(this.k), Integer.valueOf(mdpUpsellPlan.k));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("PlanId", this.a, arrayList);
        qar.l("PlanName", this.b, arrayList);
        qar.l("PlanType", this.c, arrayList);
        qar.l("Cost", Long.valueOf(this.d), arrayList);
        qar.l("CostCurrency", this.e, arrayList);
        qar.l("ConnectionType", this.f, arrayList);
        qar.l("DurationInSeconds", Long.valueOf(this.g), arrayList);
        qar.l("mQuotaBytes", Long.valueOf(this.h), arrayList);
        qar.l("mOfferContext", this.i, arrayList);
        qar.l("planDescription", this.j, arrayList);
        qar.l("offerType", Integer.valueOf(this.k), arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.t(parcel, 4, this.d);
        qip.F(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.t(parcel, 7, this.g);
        qip.t(parcel, 8, this.h);
        qip.F(parcel, 9, this.i);
        qip.F(parcel, 10, this.j);
        qip.s(parcel, 11, this.k);
        qip.n(parcel, m);
    }
}
