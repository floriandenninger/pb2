package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qko;
import defpackage.qto;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(5);
    public long a;
    public int b;
    public String c;
    public String d;
    public String e;
    public final String f;
    public int g;
    public final List h;
    String i;
    private final JSONObject j;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = list;
        this.j = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.j;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.j;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || qto.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && qko.j(this.c, mediaTrack.c) && qko.j(this.d, mediaTrack.d) && qko.j(this.e, mediaTrack.e) && qko.j(this.f, mediaTrack.f) && this.g == mediaTrack.g && qko.j(this.h, mediaTrack.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h, String.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.j;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int m = qip.m(parcel);
        qip.t(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.F(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.F(parcel, 6, this.e);
        qip.F(parcel, 7, this.f);
        qip.s(parcel, 8, this.g);
        qip.H(parcel, 9, this.h);
        qip.F(parcel, 10, this.i);
        qip.n(parcel, m);
    }
}
