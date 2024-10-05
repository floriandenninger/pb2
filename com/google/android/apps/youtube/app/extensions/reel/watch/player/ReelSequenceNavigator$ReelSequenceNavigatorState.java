package com.google.android.apps.youtube.app.extensions.reel.watch.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aoob;
import defpackage.arsd;
import defpackage.gjj;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelSequenceNavigator$ReelSequenceNavigatorState implements SequenceNavigatorState {
    public static final Parcelable.Creator CREATOR = new gjj(11);
    private arsd a;

    public ReelSequenceNavigator$ReelSequenceNavigatorState(Parcel parcel) {
        try {
            if (parcel.readInt() != 0) {
                this.a = (arsd) amkq.ch(parcel, arsd.a, aomw.b());
            } else {
                this.a = null;
            }
        } catch (aoob e) {
            zga.d("Invalid ReelItemWatchResponse", e);
        }
    }

    public ReelSequenceNavigator$ReelSequenceNavigatorState(arsd arsdVar) {
        this.a = arsdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a != null ? 1 : 0);
        arsd arsdVar = this.a;
        if (arsdVar != null) {
            amkq.cm(parcel, arsdVar);
        }
    }
}
