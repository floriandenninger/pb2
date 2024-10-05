package com.google.android.libraries.youtube.player.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import defpackage.aigo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackServiceState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(5);
    public final PlaybackStartDescriptor a;
    public final PlaybackModalityState b;
    public final DirectorSavedState c;
    public final SequencerState d;
    public final PlaybackAudioManager$RestorableState e;

    public PlaybackServiceState(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = (PlaybackStartDescriptor) parcel.readParcelable(classLoader);
        this.b = (PlaybackModalityState) parcel.readParcelable(classLoader);
        this.c = (DirectorSavedState) parcel.readParcelable(classLoader);
        this.d = (SequencerState) parcel.readParcelable(classLoader);
        this.e = (PlaybackAudioManager$RestorableState) parcel.readParcelable(classLoader);
    }

    public PlaybackServiceState(PlaybackStartDescriptor playbackStartDescriptor, PlaybackModalityState playbackModalityState, SequencerState sequencerState, DirectorSavedState directorSavedState, PlaybackAudioManager$RestorableState playbackAudioManager$RestorableState) {
        this.a = playbackStartDescriptor;
        this.b = playbackModalityState;
        this.c = directorSavedState;
        this.d = sequencerState;
        this.e = playbackAudioManager$RestorableState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }
}
