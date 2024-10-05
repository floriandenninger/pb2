package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import defpackage.gjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_PaneFragmentPanelDescriptor extends C$AutoValue_PaneFragmentPanelDescriptor {
    public static final Parcelable.Creator CREATOR = new gjj(1);

    public AutoValue_PaneFragmentPanelDescriptor(PaneDescriptor paneDescriptor) {
        super(paneDescriptor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
