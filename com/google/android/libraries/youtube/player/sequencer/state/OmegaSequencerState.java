package com.google.android.libraries.youtube.player.sequencer.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import defpackage.aigo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OmegaSequencerState implements SequencerState {
    public static final Parcelable.Creator CREATOR = new aigo(4);
    public final PlayerResponseModel a;
    public final WatchNextResponseModel b;
    public final SequenceNavigatorState c;
    public PlaybackStartDescriptor d;
    public PlaybackStartDescriptor e;
    public final boolean f;

    public OmegaSequencerState(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = (PlayerResponseModel) parcel.readParcelable(classLoader);
        this.b = (WatchNextResponseModel) parcel.readParcelable(classLoader);
        this.d = (PlaybackStartDescriptor) parcel.readParcelable(classLoader);
        this.e = (PlaybackStartDescriptor) parcel.readParcelable(classLoader);
        this.f = parcel.readInt() == 1;
        this.c = (SequenceNavigatorState) parcel.readParcelable(classLoader);
    }

    public OmegaSequencerState(PlayerResponseModel playerResponseModel, WatchNextResponseModel watchNextResponseModel, PlaybackStartDescriptor playbackStartDescriptor, PlaybackStartDescriptor playbackStartDescriptor2, boolean z, SequenceNavigatorState sequenceNavigatorState) {
        this.a = playerResponseModel;
        this.b = watchNextResponseModel;
        this.d = playbackStartDescriptor;
        this.e = playbackStartDescriptor2;
        this.f = z;
        this.c = sequenceNavigatorState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.c, 0);
    }
}
