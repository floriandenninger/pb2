package com.google.android.libraries.youtube.rendering.ui.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.acrb;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.aigo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PermissionDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(19);
    public int a;
    public acsc b;
    public acsc c;

    public PermissionDescriptor(int i, acrb acrbVar, acrb acrbVar2) {
        this.a = i;
        this.b = acsb.c(acrbVar.Jk);
        this.c = acsb.c(acrbVar2.Jk);
    }

    public PermissionDescriptor(int i, acsc acscVar, acsc acscVar2) {
        this.a = i;
        this.b = acscVar;
        this.c = acscVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b.a);
        parcel.writeInt(this.c.a);
    }

    public PermissionDescriptor(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = acsb.c(parcel.readInt());
        this.c = acsb.c(parcel.readInt());
    }
}
