package com.google.android.libraries.youtube.player.subtitles.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aigo;
import defpackage.aiuh;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class SubtitleTrack implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(12);

    public static aiuh m() {
        aiuh aiuhVar = new aiuh();
        aiuhVar.f("");
        aiuhVar.h("");
        aiuhVar.b(0);
        aiuhVar.g("");
        aiuhVar.d(false);
        aiuhVar.c(false);
        return aiuhVar;
    }

    public static SubtitleTrack n(String str, String str2, String str3) {
        aiuh m = m();
        m.e(str2);
        m.j(str3);
        m.k("-");
        m.i("DASH");
        m.b = str;
        m.d(false);
        return m.a();
    }

    public static SubtitleTrack o(String str) {
        aiuh m = m();
        m.e("DISABLE_CAPTIONS_OPTION");
        m.j("");
        m.k("-");
        m.i("");
        m.b = str;
        m.d(false);
        return m.a();
    }

    @Deprecated
    public abstract int a();

    public abstract CharSequence b();

    public abstract String c();

    @Deprecated
    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof SubtitleTrack)) {
            return false;
        }
        SubtitleTrack subtitleTrack = (SubtitleTrack) obj;
        return TextUtils.equals(j(), subtitleTrack.j()) && TextUtils.equals(i(), subtitleTrack.i());
    }

    public abstract String f();

    @Deprecated
    public abstract String g();

    public abstract String h();

    public final int hashCode() {
        return ((((((c().hashCode() + 527) * 31) + h().hashCode()) * 31) + toString().hashCode()) * 31) + i().hashCode();
    }

    public abstract String i();

    public abstract String j();

    public abstract boolean k();

    public abstract boolean l();

    public final boolean p() {
        return "DISABLE_CAPTIONS_OPTION".equals(c());
    }

    public final String toString() {
        return zhq.d(b()).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeString(d());
        parcel.writeString(g());
        parcel.writeString(i());
        parcel.writeInt(a());
        parcel.writeString(f());
        parcel.writeString(e());
        parcel.writeString(j());
        parcel.writeString(h());
        parcel.writeString(zhq.d(b()).toString());
    }
}
