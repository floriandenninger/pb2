package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.asg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_ActionBarColor_TransformAlphaActionBarColor extends C$AutoValue_ActionBarColor_TransformAlphaActionBarColor {
    public static final Parcelable.Creator CREATOR = new asg(16);

    public AutoValue_ActionBarColor_TransformAlphaActionBarColor(ActionBarColor actionBarColor, int i) {
        super(actionBarColor, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
    }
}
