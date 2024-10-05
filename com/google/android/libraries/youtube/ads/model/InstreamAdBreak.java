package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import defpackage.aaef;
import defpackage.afrd;
import defpackage.afre;
import defpackage.amkq;
import defpackage.amrz;
import defpackage.amvo;
import defpackage.xes;
import defpackage.xet;
import defpackage.xfn;
import defpackage.zhq;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InstreamAdBreak implements Parcelable, afre {
    public final AdBreakRendererModel c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final byte[] i;
    public static final amrz a = amvo.b;
    public static final Parcelable.Creator CREATOR = new xes(0);
    public static final xet b = new xet();

    public InstreamAdBreak(AdBreakRendererModel adBreakRendererModel, int i, boolean z, String str, String str2, String str3, byte[] bArr) {
        adBreakRendererModel.getClass();
        this.c = adBreakRendererModel;
        this.d = i;
        this.e = z;
        zhq.m(str);
        this.f = str;
        zhq.m(str2);
        this.g = str2;
        if (b() != xfn.PRE_ROLL) {
            str3 = null;
        } else if (z) {
            str3 = "";
        }
        this.h = str3;
        this.i = bArr == null ? aaef.b : bArr;
    }

    public final long a() {
        int bY = amkq.bY(this.c.b.d);
        if (bY != 0 && bY == 4) {
            return -1L;
        }
        return Math.max(r0.b.b, 0);
    }

    public final xfn b() {
        int bY = amkq.bY(this.c.b.d);
        if (bY == 0) {
            bY = 1;
        }
        int i = bY - 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return xfn.POST_ROLL;
                }
                if (i != 6) {
                    return null;
                }
            }
            return xfn.MID_ROLL;
        }
        return xfn.PRE_ROLL;
    }

    public final List c() {
        return this.c.b();
    }

    public final List d() {
        return this.c.b.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List e() {
        return this.c.b.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InstreamAdBreak)) {
            return false;
        }
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) obj;
        return amkq.b(this.c, instreamAdBreak.c) && this.d == instreamAdBreak.d && amkq.b(this.f, instreamAdBreak.f) && amkq.b(this.h, instreamAdBreak.h) && Arrays.equals(this.i, instreamAdBreak.i);
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xet(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.d), this.f, Integer.valueOf(Arrays.hashCode(this.i))});
    }

    public final String toString() {
        return String.format("InstreamAdBreak: [breakType:%s, adBreakIndex:%s, offset:%s, originalVideoId:%s]", b(), Integer.valueOf(this.d), Long.valueOf(a()), this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i.length);
        parcel.writeByteArray(this.i);
    }
}
