package com.google.android.libraries.youtube.player.sequencer.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import defpackage.aigo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState implements SequenceNavigatorState {
    public static final Parcelable.Creator CREATOR = new aigo(2);
    public final String a;
    public final WatchNextResponseModel b;
    public final boolean c;
    public final int d;

    public AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        String readString = parcel.readString();
        this.a = readString == null ? "" : readString;
        this.b = (WatchNextResponseModel) parcel.readParcelable(classLoader);
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt();
    }

    public AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(String str, WatchNextResponseModel watchNextResponseModel, boolean z, int i) {
        this.a = str;
        this.b = watchNextResponseModel;
        this.c = z;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }
}
