package com.google.android.apps.youtube.app.fragments.panels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import defpackage.gjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_PanePanelsController_PanePanelsState extends C$AutoValue_PanePanelsController_PanePanelsState {
    public static final Parcelable.Creator CREATOR = new gjj(14);

    public AutoValue_PanePanelsController_PanePanelsState(PaneFragmentPanelDescriptor paneFragmentPanelDescriptor, PaneFragmentPanelDescriptor paneFragmentPanelDescriptor2) {
        super(paneFragmentPanelDescriptor, paneFragmentPanelDescriptor2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
