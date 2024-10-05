package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BusSupportedDataWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(9);
    public final BusSupported$Data a;
    private final b b;

    public BusSupportedDataWrapper(BusSupported$Data busSupported$Data) {
        this.b = busSupported$Data.d();
        this.a = busSupported$Data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BusSupportedDataWrapper)) {
            return false;
        }
        BusSupportedDataWrapper busSupportedDataWrapper = (BusSupportedDataWrapper) obj;
        return this.b == busSupportedDataWrapper.b && this.a.equals(busSupportedDataWrapper.a);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.toString());
        this.a.writeToParcel(parcel, i);
    }
}
