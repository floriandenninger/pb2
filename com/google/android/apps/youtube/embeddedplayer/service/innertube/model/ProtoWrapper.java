package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aonm;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ProtoWrapper implements Parcelable {
    public final aonm a;

    public ProtoWrapper(aonm aonmVar) {
        this.a = aonmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
    }
}
