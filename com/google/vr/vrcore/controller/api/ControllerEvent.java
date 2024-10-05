package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ControllerEvent implements Parcelable {
    public long d;
    public int e = 0;

    public void b(Parcel parcel) {
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }
}
