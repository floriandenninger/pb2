package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import defpackage.qar;
import defpackage.qip;
import defpackage.rlt;
import defpackage.rqr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpUpsellOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MdpUpsellPlan[] e;
    public final Bundle f;
    public final Integer g;
    public final Long h;
    public final PaymentForm[] i;

    public MdpUpsellOfferResponse(String str, String str2, String str3, String str4, MdpUpsellPlan[] mdpUpsellPlanArr, Bundle bundle, Integer num, Long l, PaymentForm[] paymentFormArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = mdpUpsellPlanArr;
        this.f = bundle;
        this.g = num;
        this.h = l;
        this.i = paymentFormArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellOfferResponse)) {
            return false;
        }
        MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) obj;
        return qar.j(this.a, mdpUpsellOfferResponse.a) && qar.j(this.b, mdpUpsellOfferResponse.b) && qar.j(this.c, mdpUpsellOfferResponse.c) && qar.j(this.d, mdpUpsellOfferResponse.d) && Arrays.equals(this.e, mdpUpsellOfferResponse.e) && rqr.m(this.f, mdpUpsellOfferResponse.f) && qar.j(this.g, mdpUpsellOfferResponse.g) && qar.j(this.h, mdpUpsellOfferResponse.h) && Arrays.equals(this.i, mdpUpsellOfferResponse.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(rqr.l(this.f)), this.g, this.h, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.i))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("CarrierName", this.a, arrayList);
        qar.l("CarrierLogoUrl", this.b, arrayList);
        qar.l("PromoMessage", this.c, arrayList);
        qar.l("Info", this.d, arrayList);
        qar.l("UpsellPlans", Arrays.toString(this.e), arrayList);
        qar.l("ExtraInfo", this.f, arrayList);
        qar.l("EventFlowId", this.g, arrayList);
        qar.l("UniqueRequestId", this.h, arrayList);
        qar.l("PaymentForms", Arrays.toString(this.i), arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.I(parcel, 5, this.e, i);
        qip.v(parcel, 6, this.f);
        qip.B(parcel, 7, this.g);
        qip.D(parcel, 8, this.h);
        qip.I(parcel, 9, this.i, i);
        qip.n(parcel, m);
    }
}
