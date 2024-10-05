package com.google.android.libraries.youtube.innertube.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VideoQuality implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new aamk(14);
    public final int a;
    public final String b;
    private final boolean c;

    public VideoQuality(int i, String str, boolean z) {
        this.a = i;
        zhq.m(str);
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        VideoQuality videoQuality = (VideoQuality) obj;
        if (videoQuality == null) {
            return 1;
        }
        return this.a - videoQuality.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoQuality)) {
            return false;
        }
        VideoQuality videoQuality = (VideoQuality) obj;
        return this.a == videoQuality.a && this.b.equals(videoQuality.b) && this.c == videoQuality.c;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
