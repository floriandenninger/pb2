package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qko;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(8);
    public final String a;
    public final String b;

    public VastAdsRequest(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static VastAdsRequest a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new VastAdsRequest(qko.e(jSONObject, "adTagUrl"), qko.e(jSONObject, "adsResponse"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        return qko.j(this.a, vastAdsRequest.a) && qko.j(this.b, vastAdsRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.n(parcel, m);
    }
}
