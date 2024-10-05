package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;
import defpackage.qko;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(11);
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final VastAdsRequest l;

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j2;
        this.k = str9;
        this.l = vastAdsRequest;
        if (!TextUtils.isEmpty(str6)) {
            try {
                new JSONObject(this.g);
                return;
            } catch (JSONException e) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
                this.g = null;
                new JSONObject();
                return;
            }
        }
        new JSONObject();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return qko.j(this.a, adBreakClipInfo.a) && qko.j(this.b, adBreakClipInfo.b) && this.c == adBreakClipInfo.c && qko.j(this.d, adBreakClipInfo.d) && qko.j(this.e, adBreakClipInfo.e) && qko.j(this.f, adBreakClipInfo.f) && qko.j(this.g, adBreakClipInfo.g) && qko.j(this.h, adBreakClipInfo.h) && qko.j(this.i, adBreakClipInfo.i) && this.j == adBreakClipInfo.j && qko.j(this.k, adBreakClipInfo.k) && qko.j(this.l, adBreakClipInfo.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.t(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.F(parcel, 6, this.e);
        qip.F(parcel, 7, this.f);
        qip.F(parcel, 8, this.g);
        qip.F(parcel, 9, this.h);
        qip.F(parcel, 10, this.i);
        qip.t(parcel, 11, this.j);
        qip.F(parcel, 12, this.k);
        qip.E(parcel, 13, this.l, i);
        qip.n(parcel, m);
    }
}
