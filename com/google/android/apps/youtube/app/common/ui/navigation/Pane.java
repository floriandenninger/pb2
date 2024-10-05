package com.google.android.apps.youtube.app.common.ui.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.asg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Pane implements Parcelable {
    public static final Parcelable.Creator CREATOR = new asg(17);
    public final int a;
    public final PaneBackStack b;
    public PaneDescriptor c;
    public PaneDescriptor d;

    public Pane(int i) {
        this.a = i;
        this.b = new PaneBackStack();
        this.c = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public Pane(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (PaneBackStack) parcel.readParcelable(PaneBackStack.class.getClassLoader());
        this.c = (PaneDescriptor) parcel.readParcelable(PaneDescriptor.class.getClassLoader());
        this.d = (PaneDescriptor) parcel.readParcelable(PaneDescriptor.class.getClassLoader());
    }
}
