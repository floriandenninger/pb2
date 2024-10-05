package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class AdEventData implements BusSupported$Data {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(7);

    public static a c() {
        return new a();
    }

    public abstract int a();

    public abstract int b();

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.AD_EVENT_DATA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeInt(a());
        parcel.writeString(e());
    }
}
