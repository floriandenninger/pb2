package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControllerAccelEvent extends ControllerEvent {
    public static final Parcelable.Creator CREATOR = new alsz(16);
    public float a;
    public float b;
    public float c;

    public ControllerAccelEvent() {
    }

    public int a() {
        return 24;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public void b(Parcel parcel) {
        super.b(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public ControllerAccelEvent(Parcel parcel) {
        b(parcel);
    }
}
