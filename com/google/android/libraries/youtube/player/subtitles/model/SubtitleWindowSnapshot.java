package com.google.android.libraries.youtube.player.subtitles.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aigo;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SubtitleWindowSnapshot implements Serializable, Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(14);
    public final int a;
    public final long b;
    public final SubtitleWindowSettings c;
    public final CharSequence d;
    public final CharSequence e;
    public final boolean f = false;

    public SubtitleWindowSnapshot(int i, long j, CharSequence charSequence, CharSequence charSequence2, SubtitleWindowSettings subtitleWindowSettings) {
        this.a = i;
        this.b = j;
        this.d = charSequence;
        this.c = subtitleWindowSettings;
        this.e = charSequence2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d time: %d text: %s fullText: %s settings: %s", Integer.valueOf(this.a), Long.valueOf(this.b), this.d, this.e, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        TextUtils.writeToParcel(this.d, parcel, 0);
        TextUtils.writeToParcel(this.e, parcel, 0);
        parcel.writeParcelable(this.c, 0);
    }
}
