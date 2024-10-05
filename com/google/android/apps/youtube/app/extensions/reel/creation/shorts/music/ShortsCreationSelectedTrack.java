package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.apxf;
import defpackage.autf;
import defpackage.avgg;
import defpackage.gjj;
import defpackage.hmx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ShortsCreationSelectedTrack implements Parcelable {
    private static final byte[] a = new byte[0];
    public static final Parcelable.Creator CREATOR = new gjj(6);

    public static hmx m() {
        hmx hmxVar = new hmx((byte[]) null);
        hmxVar.c(0L);
        hmxVar.g = amlr.a;
        return hmxVar;
    }

    public abstract long a();

    public abstract Uri b();

    public abstract hmx c();

    public abstract ammv d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract ammv e();

    public abstract apxf f();

    public abstract autf g();

    public abstract avgg h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract boolean l();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(k());
        parcel.writeLong(a());
        parcel.writeInt(l() ? 1 : 0);
        parcel.writeString(i());
        parcel.writeByteArray(h() == null ? a : h().toByteArray());
        parcel.writeString(j());
        parcel.writeParcelable(b(), 0);
        parcel.writeLong(d().h() ? ((Long) d().c()).longValue() : -1L);
        parcel.writeInt(e().h() ? ((byte[]) e().c()).length : -1);
        if (e().h()) {
            parcel.writeByteArray((byte[]) e().c());
        }
        parcel.writeInt(f() != null ? 1 : 0);
        if (f() != null) {
            parcel.writeByteArray(f().toByteArray());
        }
    }
}
