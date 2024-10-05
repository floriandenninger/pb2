package com.google.android.apps.youtube.app.extensions.reel.watch.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ammx;
import defpackage.gjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelSequenceController$PendingContinuation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(10);
    public boolean a;
    public String b;

    public ReelSequenceController$PendingContinuation() {
        this.a = false;
        this.b = null;
    }

    public ReelSequenceController$PendingContinuation(Parcel parcel) {
        this.a = parcel.readByte() != 0;
        this.b = parcel.readString();
    }

    public final boolean a() {
        return !ammx.e(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.b);
    }
}
