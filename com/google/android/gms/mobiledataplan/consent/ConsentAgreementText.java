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
public final class ConsentAgreementText extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(7);
    public SafeHtml a;
    public SafeHtml[] b;
    public SafeHtml[] c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;

    private ConsentAgreementText() {
    }

    public ConsentAgreementText(SafeHtml safeHtml, SafeHtml[] safeHtmlArr, SafeHtml[] safeHtmlArr2, String str, String str2, String str3, int i, String str4) {
        this.a = safeHtml;
        this.b = safeHtmlArr;
        this.c = safeHtmlArr2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentAgreementText) {
            ConsentAgreementText consentAgreementText = (ConsentAgreementText) obj;
            if (qar.j(this.a, consentAgreementText.a) && Arrays.equals(this.b, consentAgreementText.b) && Arrays.equals(this.c, consentAgreementText.c) && qar.j(this.d, consentAgreementText.d) && qar.j(this.e, consentAgreementText.e) && qar.j(this.f, consentAgreementText.f) && qar.j(Integer.valueOf(this.g), Integer.valueOf(consentAgreementText.g)) && qar.j(this.h, consentAgreementText.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, Integer.valueOf(this.g)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("Title", this.a, arrayList);
        qar.l("DescriptionParagraphs", Arrays.toString(this.b), arrayList);
        qar.l("AdditionalInfoParagraphs", Arrays.toString(this.c), arrayList);
        qar.l("PositiveButtonCaption", this.d, arrayList);
        qar.l("NegativeButtonCaption", this.e, arrayList);
        qar.l("ContinueButtonCaption", this.f, arrayList);
        qar.l("Version", Integer.valueOf(this.g), arrayList);
        qar.l("TextId", this.h, arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.I(parcel, 2, this.b, i);
        qip.I(parcel, 3, this.c, i);
        qip.F(parcel, 4, this.d);
        qip.F(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.s(parcel, 7, this.g);
        qip.F(parcel, 8, this.h);
        qip.n(parcel, m);
    }
}
