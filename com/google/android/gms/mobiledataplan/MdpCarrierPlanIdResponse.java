package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import defpackage.qar;
import defpackage.qip;
import defpackage.rbg;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpCarrierPlanIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(19);
    public final String a;
    public final long b;
    public String c;
    public String d;
    public long e;
    public String f;
    public int g;
    public CarrierSupportInfo h;
    public Integer i;
    public Long j;

    public MdpCarrierPlanIdResponse(String str, long j, String str2, String str3, long j2, String str4, int i, CarrierSupportInfo carrierSupportInfo, Integer num, Long l) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Response source must be a value in CpidResponseSource");
        }
        this.g = i;
        this.h = carrierSupportInfo;
        this.i = num;
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdResponse)) {
            return false;
        }
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse) obj;
        return qar.j(this.a, mdpCarrierPlanIdResponse.a) && qar.j(Long.valueOf(this.b), Long.valueOf(mdpCarrierPlanIdResponse.b)) && qar.j(this.c, mdpCarrierPlanIdResponse.c) && qar.j(this.d, mdpCarrierPlanIdResponse.d) && qar.j(Long.valueOf(this.e), Long.valueOf(mdpCarrierPlanIdResponse.e)) && qar.j(this.f, mdpCarrierPlanIdResponse.f) && qar.j(Integer.valueOf(this.g), Integer.valueOf(mdpCarrierPlanIdResponse.g)) && qar.j(this.h, mdpCarrierPlanIdResponse.h) && qar.j(this.i, mdpCarrierPlanIdResponse.i) && qar.j(this.j, mdpCarrierPlanIdResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("CarrierPlanId", this.a, arrayList);
        qar.l("TTL-in-Seconds", Long.valueOf(this.b), arrayList);
        qar.l("CarrierName", this.c, arrayList);
        qar.l("CarrierLogoImageURL", this.d, arrayList);
        qar.l("CarrierId", Long.valueOf(this.e), arrayList);
        qar.l("CarrierCpid", this.f, arrayList);
        qar.l("ResponseSource", Integer.valueOf(this.g), arrayList);
        qar.l("CarrierSupportInfo", this.h, arrayList);
        qar.l("EventFlowId", this.i, arrayList);
        qar.l("UniqueRequestId", this.j, arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.t(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.t(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.s(parcel, 7, this.g);
        qip.E(parcel, 8, this.h, i);
        qip.B(parcel, 9, this.i);
        qip.D(parcel, 10, this.j);
        qip.n(parcel, m);
    }
}
