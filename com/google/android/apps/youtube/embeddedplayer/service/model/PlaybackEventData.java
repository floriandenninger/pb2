package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PlaybackEventData implements BusSupported$Data {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(15);

    public static g g() {
        return new g();
    }

    public abstract float a();

    public abstract int b();

    public abstract long c();

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.PLAYBACK_EVENT_DATA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract long e();

    public abstract String f();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeString(f());
        parcel.writeLong(e());
        parcel.writeLong(c());
        parcel.writeFloat(a());
    }
}
