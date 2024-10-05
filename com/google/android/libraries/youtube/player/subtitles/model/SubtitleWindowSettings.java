package com.google.android.libraries.youtube.player.subtitles.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aigo;
import defpackage.amkq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SubtitleWindowSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(13);
    public static final SubtitleWindowSettings a = new SubtitleWindowSettings(34, 50, 95, true, false);
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public SubtitleWindowSettings(int i, int i2, int i3, boolean z, boolean z2) {
        amkq.H(i2 >= 0 && i2 <= 100, "invalid anchorHorizontalPos: %s", i2);
        amkq.H(i3 >= 0 && i3 <= 100, "invalid anchorVerticalPos: %s", i3);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "ap=%d, ah=%d, av=%d, vs=%b, sd=%b", Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
