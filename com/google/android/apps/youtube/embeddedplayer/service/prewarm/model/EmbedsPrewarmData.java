package com.google.android.apps.youtube.embeddedplayer.service.prewarm.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.k;
import defpackage.agaj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class EmbedsPrewarmData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new k(4);

    public static agaj c() {
        return new agaj();
    }

    public abstract int a();

    public abstract String b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeString(b());
    }
}
