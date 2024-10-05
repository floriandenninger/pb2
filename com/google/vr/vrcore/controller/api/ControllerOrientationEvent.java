package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.axhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControllerOrientationEvent extends ControllerEvent {
    public static final Parcelable.Creator CREATOR = new axhq(2);
    public float a;
    public float b;
    public float c;
    public float f;

    public ControllerOrientationEvent() {
    }

    public int a() {
        return 28;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public void b(Parcel parcel) {
        super.b(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.f = parcel.readFloat();
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
        parcel.writeFloat(this.f);
    }

    public ControllerOrientationEvent(Parcel parcel) {
        b(parcel);
    }
}
