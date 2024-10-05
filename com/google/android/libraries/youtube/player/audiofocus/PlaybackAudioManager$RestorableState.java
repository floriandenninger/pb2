package com.google.android.libraries.youtube.player.audiofocus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackAudioManager$RestorableState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(16);
    public boolean a;

    public PlaybackAudioManager$RestorableState() {
        this.a = true;
    }

    public PlaybackAudioManager$RestorableState(Parcel parcel) {
        this.a = true;
        this.a = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
