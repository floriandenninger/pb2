package com.google.android.apps.youtube.app.fragments.panels;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gjj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_PanelsBackStack extends C$AutoValue_PanelsBackStack {
    public static final Parcelable.Creator CREATOR = new gjj(16);

    public AutoValue_PanelsBackStack(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
