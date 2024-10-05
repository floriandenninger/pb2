package com.google.android.libraries.youtube.offline.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aapi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OfflinePlaybackTrackingPlaybackListener$State implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(15);
    public final String a;

    public OfflinePlaybackTrackingPlaybackListener$State(Parcel parcel) {
        this.a = parcel.readString();
    }

    public OfflinePlaybackTrackingPlaybackListener$State(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OfflinePlaybackTrackingPlaybackListener$State) {
            return TextUtils.equals(this.a, ((OfflinePlaybackTrackingPlaybackListener$State) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 527;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46);
        sb.append("OfflinePlaybackTrackingReporterState{videoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
