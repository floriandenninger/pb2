package com.google.android.gms.mobiledataplan.consent;

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
public final class GetConsentInformationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(9);
    public ConsentStatus a;
    public ConsentAgreementText b;
    public Long c;
    public Integer d;
    public Long e;
    public Integer f;

    private GetConsentInformationResponse() {
    }

    public GetConsentInformationResponse(ConsentStatus consentStatus, ConsentAgreementText consentAgreementText, Long l, Integer num, Long l2, Integer num2) {
        this.a = consentStatus;
        this.b = consentAgreementText;
        this.c = l;
        this.d = num;
        this.e = l2;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationResponse) {
            GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse) obj;
            if (qar.j(this.a, getConsentInformationResponse.a) && qar.j(this.b, getConsentInformationResponse.b) && qar.j(this.c, getConsentInformationResponse.c) && qar.j(this.d, getConsentInformationResponse.d) && qar.j(this.e, getConsentInformationResponse.e) && qar.j(this.f, getConsentInformationResponse.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("ConsentStatus", this.a, arrayList);
        qar.l("ConsentAgreementText", this.b, arrayList);
        qar.l("ConsentChangeTime", this.c, arrayList);
        qar.l("EventFlowId", this.d, arrayList);
        qar.l("UniqueRequestId", this.e, arrayList);
        qar.l("ConsentResponseSource", this.f, arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.E(parcel, 2, this.b, i);
        qip.D(parcel, 3, this.c);
        qip.B(parcel, 4, this.d);
        qip.D(parcel, 5, this.e);
        qip.B(parcel, 6, this.f);
        qip.n(parcel, m);
    }
}
