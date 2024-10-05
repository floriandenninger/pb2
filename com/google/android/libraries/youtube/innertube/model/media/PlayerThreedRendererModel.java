package com.google.android.libraries.youtube.innertube.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayerThreedRendererModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aamk(13);
    public final int a;

    public PlayerThreedRendererModel() {
        this(0);
    }

    public PlayerThreedRendererModel(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayerThreedRendererModel) && this.a == ((PlayerThreedRendererModel) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int i = this.a;
        objArr[0] = i != 0 ? i != 1 ? i != 3 ? "Invalid" : "TOP_BOTTOM" : "SBS_LR" : "MONO";
        return String.format(locale, "PlayerThreedRendererModel{layout=%s}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
