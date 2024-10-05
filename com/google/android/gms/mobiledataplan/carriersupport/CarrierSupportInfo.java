package com.google.android.gms.mobiledataplan.carriersupport;

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
public final class CarrierSupportInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(6);
    public String a;
    public String b;
    public CarrierSupportChannel[] c;

    private CarrierSupportInfo() {
    }

    public CarrierSupportInfo(String str, String str2, CarrierSupportChannel[] carrierSupportChannelArr) {
        this.a = str;
        this.b = str2;
        this.c = carrierSupportChannelArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportInfo) {
            CarrierSupportInfo carrierSupportInfo = (CarrierSupportInfo) obj;
            if (qar.j(this.a, carrierSupportInfo.a) && qar.j(this.b, carrierSupportInfo.b) && Arrays.equals(this.c, carrierSupportInfo.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("TitleMessage", this.a, arrayList);
        qar.l("LanguageCode", this.b, arrayList);
        qar.l("SupportChannels", Arrays.toString(this.c), arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.I(parcel, 3, this.c, i);
        qip.n(parcel, m);
    }
}
