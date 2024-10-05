package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aomf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class VideoDetailsExpanded implements Parcelable {
    public static final VideoDetailsExpanded a = d().a();
    public static final Parcelable.Creator CREATOR = new k(3);

    public static m d() {
        m mVar = new m();
        mVar.a = null;
        mVar.b = null;
        mVar.b(aomf.b);
        return mVar;
    }

    public abstract aomf a();

    public abstract CharSequence b();

    public abstract CharSequence c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoDetailsExpanded)) {
            return false;
        }
        VideoDetailsExpanded videoDetailsExpanded = (VideoDetailsExpanded) obj;
        return TextUtils.equals(c(), videoDetailsExpanded.c()) && TextUtils.equals(b(), videoDetailsExpanded.b()) && a().equals(videoDetailsExpanded.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(c(), parcel, i);
        TextUtils.writeToParcel(b(), parcel, i);
        parcel.writeByteArray(a().I());
    }
}
