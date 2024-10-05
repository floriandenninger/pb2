package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SelectableItemKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(20);
    public final int a;
    public final int b;

    public SelectableItemKey(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SelectableItemKey)) {
            return false;
        }
        SelectableItemKey selectableItemKey = (SelectableItemKey) obj;
        return this.a == selectableItemKey.a && this.b == selectableItemKey.b;
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
