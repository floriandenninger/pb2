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
public final class CarrierSupportChannel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(5);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    private CarrierSupportChannel() {
    }

    public CarrierSupportChannel(String str, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportChannel) {
            CarrierSupportChannel carrierSupportChannel = (CarrierSupportChannel) obj;
            if (qar.j(this.a, carrierSupportChannel.a) && qar.j(this.b, carrierSupportChannel.b) && qar.j(this.c, carrierSupportChannel.c) && qar.j(this.d, carrierSupportChannel.d) && qar.j(this.e, carrierSupportChannel.e) && qar.j(Integer.valueOf(this.f), Integer.valueOf(carrierSupportChannel.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("Title", this.a, arrayList);
        qar.l("SubTitle", this.b, arrayList);
        qar.l("Target", this.c, arrayList);
        qar.l("DefaultMessageSubject", this.d, arrayList);
        qar.l("DefaultMessageBody", this.e, arrayList);
        qar.l("Type", Integer.valueOf(this.f), arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.F(parcel, 5, this.e);
        qip.s(parcel, 6, this.f);
        qip.n(parcel, m);
    }
}
