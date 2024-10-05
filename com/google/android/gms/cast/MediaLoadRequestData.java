package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.prh;
import defpackage.qar;
import defpackage.qfg;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qko;
import defpackage.qkw;
import defpackage.qto;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final MediaInfo a;
    public final MediaQueueData b;
    public final Boolean c;
    public final long d;
    public final double e;
    public final long[] f;
    String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public long l;
    private final JSONObject m;

    static {
        new qkw("MediaLoadRequestData");
        CREATOR = new qfh(1);
    }

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.b = mediaQueueData;
        this.c = bool;
        this.d = j;
        this.e = d;
        this.f = jArr;
        this.m = jSONObject;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = j2;
    }

    public static MediaLoadRequestData a(JSONObject jSONObject) {
        qfg qfgVar = new qfg();
        try {
            if (jSONObject.has("media")) {
                qfgVar.a = new MediaInfo(jSONObject.getJSONObject("media"));
            }
            if (jSONObject.has("queueData")) {
                MediaQueueData mediaQueueData = new MediaQueueData();
                prh.q(jSONObject.getJSONObject("queueData"), mediaQueueData);
                qfgVar.b = prh.p(mediaQueueData);
            }
            if (jSONObject.has("autoplay")) {
                qfgVar.c = Boolean.valueOf(jSONObject.getBoolean("autoplay"));
            } else {
                qfgVar.c = null;
            }
            if (jSONObject.has("currentTime")) {
                qfgVar.d = qko.b(jSONObject.getDouble("currentTime"));
            } else {
                qfgVar.d = -1L;
            }
            qfgVar.b(jSONObject.optDouble("playbackRate", 1.0d));
            qfgVar.g = qko.e(jSONObject, "credentials");
            qfgVar.h = qko.e(jSONObject, "credentialsType");
            qfgVar.i = qko.e(jSONObject, "atvCredentials");
            qfgVar.j = qko.e(jSONObject, "atvCredentialsType");
            qfgVar.k = jSONObject.optLong("requestId");
            JSONArray optJSONArray = jSONObject.optJSONArray("activeTrackIds");
            if (optJSONArray != null) {
                long[] jArr = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jArr[i] = optJSONArray.getLong(i);
                }
                qfgVar.e = jArr;
            }
            qfgVar.f = jSONObject.optJSONObject("customData");
            return qfgVar.a();
        } catch (JSONException unused) {
            return qfgVar.a();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        return qto.a(this.m, mediaLoadRequestData.m) && qar.j(this.a, mediaLoadRequestData.a) && qar.j(this.b, mediaLoadRequestData.b) && qar.j(this.c, mediaLoadRequestData.c) && this.d == mediaLoadRequestData.d && this.e == mediaLoadRequestData.e && Arrays.equals(this.f, mediaLoadRequestData.f) && qar.j(this.h, mediaLoadRequestData.h) && qar.j(this.i, mediaLoadRequestData.i) && qar.j(this.j, mediaLoadRequestData.j) && qar.j(this.k, mediaLoadRequestData.k) && this.l == mediaLoadRequestData.l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.m), this.h, this.i, this.j, this.k, Long.valueOf(this.l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.m;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int m = qip.m(parcel);
        qip.E(parcel, 2, this.a, i);
        qip.E(parcel, 3, this.b, i);
        qip.u(parcel, 4, this.c);
        qip.t(parcel, 5, this.d);
        qip.p(parcel, 6, this.e);
        qip.C(parcel, 7, this.f);
        qip.F(parcel, 8, this.g);
        qip.F(parcel, 9, this.h);
        qip.F(parcel, 10, this.i);
        qip.F(parcel, 11, this.j);
        qip.F(parcel, 12, this.k);
        qip.t(parcel, 13, this.l);
        qip.n(parcel, m);
    }
}
