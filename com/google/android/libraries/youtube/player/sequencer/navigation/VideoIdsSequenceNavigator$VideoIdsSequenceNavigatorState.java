package com.google.android.libraries.youtube.player.sequencer.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import defpackage.aigo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState implements SequenceNavigatorState {
    public static final Parcelable.Creator CREATOR = new aigo(3);
    public final PlaybackStartDescriptor a;
    public final int b;

    public VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(Parcel parcel) {
        this.a = (PlaybackStartDescriptor) parcel.readParcelable(getClass().getClassLoader());
        this.b = parcel.readInt();
    }

    public VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(PlaybackStartDescriptor playbackStartDescriptor, int i) {
        this.a = playbackStartDescriptor;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.b);
    }
}
