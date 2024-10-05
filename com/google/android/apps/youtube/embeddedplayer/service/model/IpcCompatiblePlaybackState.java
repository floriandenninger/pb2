package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IpcCompatiblePlaybackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(13);
    public final boolean a;
    public final int b;
    public final PlaybackStartDescriptor c;

    public IpcCompatiblePlaybackState(int i, PlaybackStartDescriptor playbackStartDescriptor, boolean z) {
        this.b = i;
        this.c = playbackStartDescriptor;
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c != null ? 1 : 0);
        PlaybackStartDescriptor playbackStartDescriptor = this.c;
        if (playbackStartDescriptor != null) {
            parcel.writeParcelable(playbackStartDescriptor, i);
        }
        parcel.writeInt(this.a ? 1 : 0);
    }
}
