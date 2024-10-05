package com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum SetOperationType implements Parcelable {
    AUTOPLAY(0, 3),
    MUTED_AUTOPLAY(1, 12),
    START(2, 2);

    public static final Parcelable.Creator CREATOR = new a(1);
    public final int d;
    private final int f;

    SetOperationType(int i, int i2) {
        this.f = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
    }
}
