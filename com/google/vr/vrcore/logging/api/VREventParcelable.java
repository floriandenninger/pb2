package com.google.vr.vrcore.logging.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ancs;
import defpackage.anct;
import defpackage.andd;
import defpackage.axhq;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VREventParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axhq(7);
    final ancs a;
    private final anct b;

    public VREventParcelable(Parcel parcel) {
        anct a = anct.a(parcel.readInt());
        this.b = a == null ? anct.UNKNOWN_EVENT_TYPE : a;
        ancs ancsVar = null;
        try {
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray != null) {
                ancsVar = (ancs) andd.c(createByteArray).toBuilder();
            }
        } catch (IOException e) {
            String.valueOf(String.valueOf(e)).length();
        }
        this.a = ancsVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b.eD);
        ancs ancsVar = this.a;
        parcel.writeByteArray(ancsVar == null ? null : ((andd) ancsVar.build()).toByteArray());
    }

    public VREventParcelable(anct anctVar, ancs ancsVar) {
        anctVar.getClass();
        this.b = anctVar;
        this.a = ancsVar;
    }
}
