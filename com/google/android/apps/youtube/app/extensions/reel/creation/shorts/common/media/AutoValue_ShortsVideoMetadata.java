package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_ShortsVideoMetadata extends C$AutoValue_ShortsVideoMetadata {
    public static final Parcelable.Creator CREATOR = new gjj(5);

    public AutoValue_ShortsVideoMetadata(Uri uri, int i, int i2, long j) {
        super(uri, i, i2, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
    }
}
