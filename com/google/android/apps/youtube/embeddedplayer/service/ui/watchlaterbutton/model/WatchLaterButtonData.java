package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.k;
import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class WatchLaterButtonData implements Parcelable {
    public static final WatchLaterButtonData a = e().a();
    public static final Parcelable.Creator CREATOR = new k(9);

    public static a e() {
        a aVar = new a();
        aVar.b(0);
        aVar.a = null;
        aVar.b = null;
        aVar.c(aomf.b);
        return aVar;
    }

    public abstract int a();

    public abstract aomf b();

    public abstract String c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeString(d());
        parcel.writeString(c());
        parcel.writeByteArray(b().I());
    }
}
