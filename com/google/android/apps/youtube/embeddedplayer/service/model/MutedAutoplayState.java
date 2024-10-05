package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.amkq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MutedAutoplayState implements BusSupported$Data {
    public final long b;
    public final CharSequence c;
    public final SelectableItemKey d;
    public final SelectableItemKey e;
    public final SelectableItemKey f;
    public final int g;
    public static final MutedAutoplayState a = new MutedAutoplayState(null, null, null, null, 0, 4);
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(14);

    public MutedAutoplayState(SelectableItemKey selectableItemKey, SelectableItemKey selectableItemKey2, SelectableItemKey selectableItemKey3, CharSequence charSequence, long j, int i) {
        this.e = selectableItemKey;
        this.f = selectableItemKey2;
        this.d = selectableItemKey3;
        this.c = charSequence;
        this.b = j;
        this.g = i;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.MUTED_AUTOPLAY_STATE;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutedAutoplayState)) {
            return false;
        }
        MutedAutoplayState mutedAutoplayState = (MutedAutoplayState) obj;
        return amkq.b(this.e, mutedAutoplayState.e) && amkq.b(this.f, mutedAutoplayState.f) && amkq.b(this.d, mutedAutoplayState.d) && TextUtils.equals(this.c, mutedAutoplayState.c) && mutedAutoplayState.b == this.b && mutedAutoplayState.g == this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.d, this.c, Long.valueOf(this.b), Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.d, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeLong(this.b);
        parcel.writeInt(this.g);
    }
}
