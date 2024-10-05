package com.google.android.libraries.youtube.livecreation.ui.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CameraStreamViewManager$CameraModelData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(6);
    public int a;
    public int b;
    public int c;
    public boolean d;

    public CameraStreamViewManager$CameraModelData() {
    }

    public CameraStreamViewManager$CameraModelData(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }
}
