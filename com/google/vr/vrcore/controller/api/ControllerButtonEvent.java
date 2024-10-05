package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControllerButtonEvent extends ControllerEvent {
    public int b;
    public boolean c;
    public static final int[] a = {0, 1, 2, 3, 5, 6};
    public static final Parcelable.Creator CREATOR = new alsz(18);

    public ControllerButtonEvent() {
    }

    public int a() {
        return 20;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public void b(Parcel parcel) {
        super.b(parcel);
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public ControllerButtonEvent(Parcel parcel) {
        b(parcel);
    }
}
