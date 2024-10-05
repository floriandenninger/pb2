package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.amkq;
import defpackage.amru;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RelatedVideosScreen implements BusSupported$Data {
    public final CharSequence b;
    public final amru c;
    public static final RelatedVideosScreen a = new RelatedVideosScreen("", new ArrayList());
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(18);

    public RelatedVideosScreen(CharSequence charSequence, List list) {
        this.b = charSequence;
        this.c = amru.o(list);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.RELATED_VIDEOS_SCREEN;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RelatedVideosScreen)) {
            return false;
        }
        RelatedVideosScreen relatedVideosScreen = (RelatedVideosScreen) obj;
        return relatedVideosScreen.b.toString().contentEquals(this.b) && amkq.aV(this.c, relatedVideosScreen.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeTypedArray((RelatedVideoItem[]) this.c.toArray(new RelatedVideoItem[0]), i);
    }
}
