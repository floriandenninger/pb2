package com.google.android.apps.youtube.app.fragments.panels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.AccountId;
import defpackage.gjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_PanelFragmentDescriptor extends C$AutoValue_PanelFragmentDescriptor {
    public static final Parcelable.Creator CREATOR = new gjj(15);

    public AutoValue_PanelFragmentDescriptor(Class cls, AccountId accountId) {
        super(cls, accountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
