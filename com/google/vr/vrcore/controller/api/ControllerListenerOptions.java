package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.axhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ControllerListenerOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axhq(0);
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public ControllerListenerOptions() {
        this.a = true;
        this.d = true;
    }

    public ControllerListenerOptions(int i) {
        if ((i & 1) != 0) {
            this.a = true;
        }
        if ((i & 2) != 0) {
            this.d = true;
        }
        if ((i & 4) != 0) {
            this.b = true;
        }
        if ((i & 8) != 0) {
            this.c = true;
        }
        if ((i & 16) != 0) {
            this.e = true;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "ori=%b, gyro=%b, accel=%b, touch=%b, gestures=%b", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public ControllerListenerOptions(Parcel parcel) {
        this.a = parcel.readInt() != 0;
        this.b = parcel.readInt() != 0;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt() != 0;
    }
}
