package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControllerBatteryEvent extends ControllerEvent {
    public static final Parcelable.Creator CREATOR = new alsz(17);
    public int a;
    public boolean b;

    public ControllerBatteryEvent() {
    }

    public int a() {
        return 20;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public void b(Parcel parcel) {
        super.b(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public ControllerBatteryEvent(Parcel parcel) {
        b(parcel);
    }
}
