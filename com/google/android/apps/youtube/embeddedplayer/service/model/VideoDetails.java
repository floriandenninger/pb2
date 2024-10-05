package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class VideoDetails implements Parcelable {
    public static final VideoDetails a = c().a();
    public static final Parcelable.Creator CREATOR = new k(0);

    public static l c() {
        l lVar = new l();
        lVar.b(VideoDetailsCollapsed.a);
        lVar.c(VideoDetailsExpanded.a);
        return lVar;
    }

    public abstract VideoDetailsCollapsed a();

    public abstract VideoDetailsExpanded b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a().writeToParcel(parcel, i);
        b().writeToParcel(parcel, i);
    }
}
