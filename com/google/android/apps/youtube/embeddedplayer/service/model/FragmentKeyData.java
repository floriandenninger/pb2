package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class FragmentKeyData implements BusSupported$Data {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(11);

    public static e b() {
        return new e();
    }

    public abstract String a();

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.FRAGMENT_KEY_DATA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(a());
    }
}
